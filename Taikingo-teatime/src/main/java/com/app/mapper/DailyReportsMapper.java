package com.app.mapper;
import com.app.myobjects.DailyReports;
import com.app.myobjects.Reports;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DailyReportsMapper {
//    interface name should keep be same with the sql id
    List<DailyReports> selectReportByMonthAndDay(@Param("month") int month, @Param("day") int day);
}
