<template>
  <div class="present">
    <div id="introduce1" class="animate__animated animate__fadeInDownBig">
      <div>
        <h1 id="introduce1-title">
          This is Group 10 project for final presentation of DXC trainning
        </h1>
      </div>

      <div class="animate__animated animate__fadeIn animate__delay-1s">
        <div
          id="next_button"
          class="animate__animated animate__shakeX animate__delay-2s"
          style="height: 150px; width: 150px; margin-top: 100px; display: flex"
        >
          <el-button
            style="
              align-items: center;
              justify-content: center;
              font-size: 25px;
              width: 100%;
              height: 100%;
            "
            size="large"
            @click="isReady"
            circle
          >
            <h3>Next!</h3>
          </el-button>
        </div>
      </div>
    </div>

    <div
      class="calendar_components"
      style="width: 60%; margin-bottom: 20px"
      id="month_title"
    >
      <h1>{{ currentMonth }}</h1>
    </div>
    <div
      class="calendar_components"
      id="calendar"
      style="width: 60%; height: 60%"
      @click="showReport($event)"
      @mouseover="dateshake($event)"
    >
      <div class="date_th"></div>
      <div class="date_th"></div>
      <div class="date_th"></div>
      <div class="date_th"></div>
      <div class="date_th"></div>
      <div class="date_th"></div>
      <div class="date_th"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
      <div class="date"></div>
    </div>
    <div class="month_controller calendar_components" style="width: 60%">
      <div><button @click="changeMonth(aprial)">Aprial</button></div>
      <div><button @click="changeMonth(may)">May</button></div>
      <div><button @click="changeMonth(june)">June</button></div>
    </div>

    <div class="reportDialog" id="reportDialog">
      <div style="margin: 1rem 5rem; display: flex">
        <div style="display: flex; justify-content: end; width: 100%">
          <el-avatar
            @click="closeReport"
            style="background-color: #ffffff00"
            :size="20"
            :src="require('../../assets/close.png')"
          ></el-avatar>
        </div>
      </div>
      <div class="report_flex_box-wrap" id="report_flex_box-1">
        <div class="block" style="flex: 1">
          <el-avatar
            shape="square"
            :size="50"
            :src="require('../../assets/member1.jpg')"
          ></el-avatar>
        </div>
        <div style="flex: 6" class="report_content_box">
          <span style="font-weight: border" class="report_name"></span>
          <br />
          <div class="report_content"></div>
        </div>
        <div style="flex: 1" class="action-btn">
          <button @click="showDetail($event)" data-box_id="6">action</button>
        </div>
      </div>
      <div class="report_flex_box-wrap" id="report_flex_box-2">
        <div class="block" style="flex: 1">
          <el-avatar
            shape="square"
            :size="50"
            :src="require('../../assets/member2.jpg')"
          ></el-avatar>
        </div>
        <div style="flex: 6" class="report_content_box">
          <span style="font-weight: border" class="report_name"></span>
          <br />
          <div class="report_content"></div>
        </div>
        <div style="flex: 1" class="action-btn">
          <button @click="showDetail($event)" data-box_id="6">action</button>
        </div>
      </div>
      <div class="report_flex_box-wrap" id="report_flex_box-3">
        <div class="block" style="flex: 1">
          <el-avatar
            shape="square"
            :size="50"
            :src="require('../../assets/member3.jpg')"
          ></el-avatar>
        </div>
        <div style="flex: 6" class="report_content_box">
          <span style="font-weight: border" class="report_name"></span>
          <br />
          <div class="report_content"></div>
        </div>
        <div style="flex: 1" class="action-btn">
          <button @click="showDetail($event)" data-box_id="6">action</button>
        </div>
      </div>
      <div class="report_flex_box-wrap" id="report_flex_box-4">
        <div class="block" style="flex: 1">
          <el-avatar
            shape="square"
            :size="50"
            :src="require('../../assets/member4.jpg')"
          ></el-avatar>
        </div>
        <div style="flex: 6" class="report_content_box">
          <span style="font-weight: border" class="report_name"></span>
          <br />
          <div class="report_content"></div>
        </div>
        <div style="flex: 1" class="action-btn">
          <button @click="showDetail($event)" data-box_id="6">action</button>
        </div>
      </div>
      <div class="report_flex_box-wrap" id="report_flex_box-5">
        <div class="block" style="flex: 1">
          <el-avatar
            shape="square"
            :size="50"
            :src="require('../../assets/member5.jpg')"
          ></el-avatar>
        </div>
        <div style="flex: 6" class="report_content_box">
          <span style="font-weight: border" class="report_name"></span>
          <br />
          <div class="report_content"></div>
        </div>
        <div style="flex: 1" class="action-btn">
          <button @click="showDetail($event)" data-box_id="6">action</button>
        </div>
      </div>
      <div class="report_flex_box-wrap" id="report_flex_box-6">
        <div class="block" style="flex: 1">
          <el-avatar
            shape="square"
            :size="50"
            :src="require('../../assets/member6.jpg')"
          ></el-avatar>
        </div>
        <div style="flex: 6" class="report_content_box">
          <span style="font-weight: border" class="report_name"></span>
          <br />
          <div class="report_content"></div>
        </div>
        <div style="flex: 1" class="action-btn">
          <button @click="showDetail($event)" data-box_id="6">action</button>
        </div>
      </div>
      <div style="margin: 1rem 5rem; display: flex"></div>
    </div>
    <!-- dailog end    -->

    <div class="reportDetail" id="reportDetail">
      <div style="margin: 1rem 5rem; display: flex">
        <div style="display: flex; justify-content: end; width: 100%">
          <el-avatar
            @click="closeDetail"
            style="background-color: #ffffff00"
            :size="20"
            :src="require('../../assets/close.png')"
          ></el-avatar>
        </div>
      </div>

      <div class="user_name"></div>
      <div class="report_content"></div>

      <form action="post" class="form_comment">
        <label>UserName</label>
        <input type="text" name="commented_user_name" class="input-user_name" />

        <label>Comment</label>
        <textarea name="report_comment" class="input-comment">

        </textarea>

        <button @click="submitComment()">submitComment</button>
      </form>
    </div>
    <!-- showDetail end    -->
  </div>
</template>

<style scoped>
@keyframes gradient {
  0% {
    background-position: 0% 50%;
  }

  50% {
    background-position: 100% 50%;
  }

  100% {
    background-position: 0% 50%;
  }
}

.present {
  flex: 3;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  height: 100vh;
  background: linear-gradient(-45deg, #ee7752, #e73c7e, #23a6d5, #23d5ab);
  background-size: 400% 400%;
  animation: gradient 15s ease infinite;
  width: 100vw;
}

#introduce1 {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}

#calendar {
  display: grid;
  grid-template-columns: repeat(7, 1fr);
  grid-template-rows: repeat(7, 1fr);
}

.date_th {
  font-weight: bolder;
}

.date {
  font-weight: bolder;
}

.month_controller {
  display: flex;
  margin-top: 20px;
}

.month_controller > div > button,
div.action-btn > button{
  display: inline-block;
  outline: 0;
  border: 0;
  font-size: 1.3rem;
  font-weight: 500;
  color: #fff;
  cursor: pointer;
  background-image: linear-gradient(to right, #e052a0, #f15c41) !important;
  border-radius: 3px;
  white-space: nowrap;
  letter-spacing: 3px;
  margin-right: 1rem;
  width: 7rem;
  height: 3rem;
}

div.report_content_box > div.action-btn > button {
  width: 5rem;
  height: 1.5rem;
  font-size: 1rem;
}

div.report_flex_box-wrap > div.action-btn {
  margin: auto;
  margin-left: 2rem;
}

.month_controller > div > button:hover {
  background-color: #e6375a;
  background-image: none !important;
}

.reportDialog,
.reportDetail {
  width: 800px;
  height: auto;
  position: absolute;
  left: 0%;
  top: 0%;
  /* margin-top: -300px; */
  /* margin-left: -400px; */
  background: rgba(255, 255, 255, 0.19);
  border-radius: 16px;
  box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
  backdrop-filter: blur(6.5px);
  -webkit-backdrop-filter: blur(6.5px);
  display: flex;
  flex-direction: column;
  justify-content: space-around;
  overflow: scroll;
  /* overflow: hidden; */
  /* margin: 3% 18%; */
  inset: auto;
}

.report_flex_box-wrap {
  margin: 0 3rem;
  display: flex;
}

.report_content_box {
  height: auto;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  /* overflow: scroll; */
  overflow: hidden;
  text-overflow: ellipsis;
  -webkit-line-clamp: 3;
  /* 显示的最大行数 */
}

#reportDetail > div.report_content{
    height: 10rem;
    overflow: scroll;
    padding-bottom: 4rem;
    padding:2rem;
  }
#reportDetail > div.user_name {
    font-weight: 500;
    margin: auto;
    padding-bottom: 1rem;
}

#reportDetail > form.form_comment{
    height: 10rem;
    overflow: hidden;
    padding: 1rem 2rem 5rem;
}
form.form_comment > input,
form.form_comment > textarea,
form.form_comment > button {
  display: block;
  width: 90%;
  padding: auto;
  margin: auto;
  margin-bottom: 1rem;
  background:rgba(255, 255, 255, 0.19);
  border: solid 1px #ccc;
}

form.form_comment > input.input-user_name {
    width: 30%;
}

textarea.input-comment {
  height: calc( 1.3em * 5 );
  line-height: 1.3;
}

form.form_comment > button {
    display: block;
    width: 15rem;
    padding: auto;
    margin: auto;
    margin-bottom: 1rem;
    font-size: 1rem;
    font-weight: 500;
    color: #fff;
    cursor: pointer;
    background-image: linear-gradient(to right, #e052a0, #f15c41) !important;
    border-radius: 3px;
    white-space: nowrap;
    letter-spacing: 3px;
    height: 2rem;
    border: none;
}

</style>

<script>
const axios = require("axios").default;
axios.defaults.baseURL = "http://api.taikingo-tea-time.app/Taikingo-teatime/";
export default {
  data() {
    return {
      currentMonth: "Aprial",
      date_table: [
        "Sunday",
        "Monday",
        "Tuseday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
      ],
      aprial: {
        start: 6,
        end: 30,
        month: 4,
        name: "Aprial",
      },
      may: {
        start: 1,
        end: 31,
        month: 5,
        name: "May",
      },
      june: {
        start: 4,
        end: 30,
        month: 6,
        name: "June",
      },
      user1: {
        first_name: "user_name",
        last_name: "yongjin",
        id: 1,
        daily_report:
          "吾輩わがはいは猫である。名前はまだ無い。どこで生れたかとんと見当けんとうがつかぬ。何でも薄暗いじめじめした所でニャーニャー泣いていた事だけは記憶している。吾輩はここで始めて人間というものを見た。しかもあとで聞くとそれは書生という人間中で一番獰悪どうあくな種族であったそうだ。この書生というのは時々我々を捕つかまえて煮にて食うという話である。しかしその当時は何という考もなかったから別段恐しいとも思わなかった。ただ彼の掌てのひらに載せられてスーと持ち上げられた時何だかフワフワした感じがあったばかりである。掌の上で少し落ちついて書生の顔を見たのがいわゆる人間というものの見始みはじめであろう。この時妙なものだと思った感じが今でも残っている。第一毛をもって装飾されべきはずの顔がつるつるしてまるで薬缶やかんだ。その後ご猫にもだいぶ逢あったがこんな片輪かたわには一度も出会でくわした事がない。のみならず顔の真中があまりに突起している。そうしてその穴の中から時々ぷうぷうと煙けむりを吹く。どうも咽むせぽくて実に弱った。これが人間の飲む煙草たばこというものである事はようやくこの頃知った。この書生の掌の裏うちでしばらくはよい心持に坐っておったが、しばらくすると非常な速力で運転し始めた。書生が動くのか自分だけが動くのか分らないが無暗むやみに眼が廻る。胸が悪くなる。到底とうてい助からないと思っていると、どさりと音がして眼から火が出た。それまでは記憶しているがあとは何の事やらいくら考え出そうとしても分らない。",
        commented_user_name: "ハートマン軍曹",
        report_comment:
          "つれづれなるままに、日暮らし、硯（すずり）に向かひて、心にうつりゆくよしなしごとを、そこはかとなく書きつくれば、あやしうこそものぐるほしけれ。よろづにいみじくとも、色好まざらん男は、いとさうざうしく、玉の巵（さかづき）の底なき心地ぞすべき。露霜にしほたれて、所さだめずまどひ歩（あり）き、親のいさめ、世のそしりをつつむに心のいとまなく、あふさきるさに思ひ乱れ、さるはひとり寢がちに、まどろむ夜なきこそをかしけれ。さりとて、ひたすらたはれたる方にはあらで、女にたやすからず思はれんこそ、あらまほしかるべき業（わざ）なれ。",
      },
      data: [],
    };
  },
  mounted() {
    // set all calendar components display=none
    let calendar_components = document.getElementsByClassName(
      "calendar_components"
    );
    for (let i = 0; i < calendar_components.length; i++) {
      calendar_components[i].style.setProperty("display", "none");
    }
    // set dialog init dispare
    let dialog = document.getElementById("reportDialog");
    dialog.style.setProperty("display", "none");
    let date_th = document.getElementsByClassName("date_th");
    for (let i = 0; i < 7; i++) {
      date_th[i].innerHTML = this.date_table[i];
    }

    // set reportDetail init
    let reportDetail = document.getElementById("reportDetail");
    reportDetail.style.setProperty("display", "none");

    // render calendar
    let date_elements = document.getElementsByClassName("date");
    let aprial_iter = 1;
    for (
      let i = this.aprial.start;
      i < this.aprial.end + this.aprial.start;
      i++
    ) {
      date_elements[i].innerHTML = aprial_iter;
      date_elements[i].setAttribute("date", aprial_iter);
      date_elements[i].setAttribute("month", this.aprial.month);
      aprial_iter++;
    }
  },

  methods: {
    isReady() {
      let introduce1 = document.getElementById("introduce1");
      introduce1.classList.add("animate__rotateOutUpLeft");
      setTimeout(() => {
        introduce1.style.setProperty("display", "none");
      }, 1000);

      setTimeout(() => {
        let calendar_components = document.getElementsByClassName(
          "calendar_components"
        );
        for (let i = 0; i < calendar_components.length; i++) {
          calendar_components[i].style.setProperty("display", "");
          calendar_components[i].classList.add(
            "animate__animated",
            "animate__bounceInRight"
          );
        }
      }, 900);

      //             let calendar_components = document.getElementsByClassName("calendar_components");
      // for(let i=0;i<calendar_components.length;i++){
      //     calendar_components[i].style.setProperty("display","")
      //     calendar_components[i].classList.add("animate__animated","animate__bounceInRight")}
    },

    changeMonth(month) {
      let month_title = document.getElementById("month_title");

      month_title.classList.add("animate__animated", "animate__flipOutX");
      setTimeout(() => {
        month_title.classList.remove("animate__animated", "animate__flipOutX");
        this.currentMonth = month.name;
        month_title.classList.add("animate__animated", "animate__flipInX");
      }, 500);

      let date_elements = document.getElementsByClassName("date");

      for (let j = 0; j < date_elements.length; j++) {
        date_elements[j].innerHTML = "";
      }

      let month_iter = 1;
      for (let i = month.start; i < month.end + month.start; i++) {
        date_elements[i].innerHTML = month_iter;
        date_elements[i].setAttribute("date", month_iter);
        date_elements[i].setAttribute("month", month.month);
        month_iter++;
      }
      console.log(month.start);
    },

    showReport(event) {
      let month = event.target.getAttribute("month");
      let date = event.target.getAttribute("date");
      if (month == null || date == null) {
        return;
      }
      console.log("获取" + month + "月" + date + "日日报");
      for (let i = 0; i < 6; i++) {
        document.getElementsByClassName("report_name")[i].innerHTML =
          this.user1.first_name;
        // this.data[i].first_name + " " + this.data[i].last_name;

        document.getElementsByClassName("report_content")[i].innerHTML =
          this.user1.daily_report;
        // this.data[i].daily_report;

        document
          .getElementsByClassName("action-btn")
          [i].setAttribute("report_id", this.user1.id);
      }
      axios
        .get("/dailyreports", {
          params: {
            month: month,
            day: date,
          },
        })
        .then((rsp) => {
          console.log("-----");
          // console.log(rsp.data)
          this.data = rsp.data;
          console.log(this.data[0].daily_report);
          for (let i = 0; i < 6; i++) {
            document.getElementsByClassName("report_name")[i].innerHTML =
              this.user1.first_name;
            // this.data[i].first_name + " " + this.data[i].last_name;

            document.getElementsByClassName("report_content")[i].innerHTML =
              this.user1.daily_report;
            // this.data[i].daily_report;

            //toDo
            document
              .getElementsByClassName("action-btn")
              [i].setAttribute("report_id", this.user1.id);
          }
        });

      let dialog = document.getElementById("reportDialog");
      dialog.style.setProperty("display", "");
      dialog.classList.add("animate__animated", "animate__bounceIn");
    },

    closeReport() {
      console.log("on blure close");
      let dialog = document.getElementById("reportDialog");
      dialog.style.setProperty("display", "none");
      for (let i = 0; i < 6; i++) {
        document.getElementsByClassName("report_name")[i].innerHTML = "";
        document.getElementsByClassName("report_content")[i].innerHTML = "";
      }
    },

    showDetail(event) {
      let box_id = event.target.dataset.box_id;
      for (let i = 1; i < 7; i++) {
        let report_flex_box = document.getElementById("report_flex_box-" + i);

        if (i !== Number(box_id)) {
          continue;
        }

        let report_detail = document.getElementById("reportDetail");
        report_detail.style.setProperty("display", "");

        let report_id = report_flex_box
          .querySelector("div.action-btn")
          .getAttribute("report_id");
        report_detail.setAttribute("report_id", report_id);

        //toDo tmp
        let reportDetail = document.getElementById("reportDetail");
        reportDetail.querySelector("div.report_content").innerHTML =
          this.user1.daily_report;
        reportDetail.querySelector("div.user_name").innerHTML =
          this.user1.first_name;
        reportDetail.querySelector("form.form_comment > textarea.input-comment").innerHTML =
          this.user1.report_comment;

        axios
          .get("/dailyreports", {
            params: {
              id: report_id,
            },
          })
          .then((rsp) => {
            console.log("-----");
            // console.log(rsp.data)
            this.report_data = rsp.data;
            let reportDetail = document.getElementById("reportDetail");

            reportDetail.getElementsByClassName("report_content").innerHTML =
              this.report_data.report_content;
            reportDetail.getElementsByClassName("report_comment").innerHTML =
              this.report_data.report_comment;
          });
      }
    },

    submitComment() {
      //toDo
    },

    closeDetail() {
      let reportDetail = document.getElementById("reportDetail");
      reportDetail.style.setProperty("display", "none");
      // this.showAllReportFlexBox();
    },

    dateshake(event) {
      event.target.classList.add("animate__animated", "animate__swing");
      setTimeout(() => {
        event.target.classList.remove("animate__animated", "animate__swing");
      }, 1000);
    },
  },
};
</script>
