package com.app.Server;

import com.app.mapper.DailyReportsMapper;
import com.app.myobjects.DailyReports;
import com.app.myobjects.Reports;
import com.google.gson.Gson;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
@WebServlet(urlPatterns = "/dailyreports")
public class DailyReportServer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get params
        String month = req.getParameter("month");
        String day = req.getParameter("day");
        int query_month = Integer.parseInt(month);
        int query_day = Integer.parseInt(day);

        //        Build sql session
        String resource = "mybaits-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        //        query reports
        DailyReportsMapper dailyreportsmapper = session.getMapper(DailyReportsMapper.class);
        List<DailyReports> reports = dailyreportsmapper.selectReportByMonthAndDay(query_month,query_day);
        System.out.println(reports.toString());

        // return response
        resp.addHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Headers", "*");
        resp.addHeader("Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST");

        resp.setContentType("application/json");

        resp.setCharacterEncoding("UTF-8");

        PrintWriter pw = resp.getWriter();
        Gson gson = new Gson();

        pw.write(gson.toJson(reports));

        session.close();

    }
}
