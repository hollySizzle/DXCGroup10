<template>
    <div class="present">
        <div id="introduce1" class="animate__animated animate__fadeInDownBig">
            <div>
                <h1 id="introduce1-title">This is Group 10 project for final presentation of DXC trainning</h1>
            </div>
            
            <div class="animate__animated animate__fadeIn animate__delay-1s">
                <div id="next_button" class="animate__animated animate__shakeX animate__delay-2s"
                style="height: 150px;width: 150px; margin-top:100px; display: flex;">
                   <el-button style=" align-items: center; justify-content: center;font-size: 25px;width: 100%;height: 100%;" size="large" @click="isReady" circle>
                       <h3 >Next!</h3>
                   </el-button>
               </div>
   
            </div>
        </div>
        
<!-- calendar compnents -->
            <div class="calendar_components" style="width:60%; margin-bottom: 20px;" id="month_title"><h1>{{currentMonth}}</h1></div>
            <div class="calendar_components" id="calendar" style="width:60%;height: 60%;" @click="showReport($event)" @mouseover="dateshake($event)">
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
            <div class="month_controller calendar_components" style="width: 60%;">
                <div><button @click="changeMonth(aprial)">Aprial</button></div>
                <div><button @click="changeMonth(may)">May</button></div>
                <div><button @click="changeMonth(june)">June</button></div>
            </div>
        <div class="report_comments_container">
            <div class="reportDialog" id="reportDialog" style="flex:3">
                <div style="margin:0 100px; display: flex;">
                    <div style="display:flex; justify-content: end; width: 100%;">
                        <el-avatar @click="closeReport" style="background-color: #ffffff00;" :size="20" :src="require('../../assets/close.png')"></el-avatar>
                    </div>
                    
                </div>
                <div style="margin:0 100px; display: flex;">
                    <div class="block" style="flex:1">
                        <el-avatar shape="square" :size="50" :src="require('../../assets/member1.jpg')"></el-avatar>
                    </div>
                    <div style="flex:6" class="report_content_box">
                       <span style="font-weight: border;" class="report_name"></span>
                       <br>
                       <div class="report_content"></div>
                    </div>
                    <div style="flex:1" >
                        <div><button class="comment_btn" @click="open_comment_dialog(1)">COMMENTS</button></div>
                    </div>
                </div>
                <div style="margin:0 100px; display: flex;">
                    <div class="block" style="flex:1">
                        <el-avatar shape="square" :size="50" :src="require('../../assets/member2.jpg')"></el-avatar>
                    </div>
                    <div style="flex:6" class="report_content_box">
                        <span style="font-weight: border;" class="report_name"></span>
                        <br>
                        <div class="report_content"></div>
                    </div>
                    <div style="flex:1" >
                        <div><button class="comment_btn" @click="open_comment_dialog(2)">COMMENTS</button></div>
                    </div>
                </div>
                <div style="margin:0 100px; display: flex;">
                    <div class="block" style="flex:1">
                        <el-avatar shape="square" :size="50" :src="require('../../assets/member3.jpg')"></el-avatar>
                    </div>
                    <div style="flex:6" class="report_content_box">
                        <span style="font-weight: border;" class="report_name"></span>
                        <br>
                        <div class="report_content"></div>
                    </div>
                    <div style="flex:1" >
                        <div><button class="comment_btn" @click="open_comment_dialog(3)">COMMENTS</button></div>
                    </div>
                </div>
                <div style="margin:0 100px; display: flex;">
                    <div class="block" style="flex:1">
                        <el-avatar shape="square" :size="50" :src="require('../../assets/member4.jpg')"></el-avatar>
                    </div>
                    <div style="flex:6" class="report_content_box">
                        <span style="font-weight: border;" class="report_name"></span>
                        <br>
                        <div class="report_content"></div>
                    </div>
                    <div style="flex:1" >
                        <div><button class="comment_btn" @click="open_comment_dialog(4)">COMMENTS</button></div>
                    </div>
                </div>
                <!-- <div style="margin:0 100px; display: flex;">
                    <div class="block" style="flex:1">
                        <el-avatar shape="square" :size="50" :src="require('../../assets/member5.jpg')"></el-avatar>
                    </div>
                    <div style="flex:6" class="report_content_box">
                        <span style="font-weight: border;" class="report_name"></span>
                        <br>
                        <div class="report_content"></div>
                    </div>
                    <div style="flex:1" >
                        <div><button class="comment_btn" @click="open_comment_dialog()">COMMENTS</button></div>
                    </div>
                </div> -->
                <div style="margin:0 100px; display: flex;">
                    <div class="block" style="flex:1">
                        <el-avatar shape="square" :size="50" :src="require('../../assets/member6.jpg')"></el-avatar>
                    </div>
                    <div style="flex:6" class="report_content_box">
                        <span style="font-weight: border;" class="report_name"></span>
                        <br>
                        <div class="report_content"></div>
                    </div>
                    <div style="flex:1" >
                        <div><button class="comment_btn" @click="open_comment_dialog()">COMMENTS</button></div>
                    </div>
                </div>
            </div><!-- dailog end    -->
            <!-- comments dialog start -->
            <div class="commentDialog" id="commentDialog" style="display:flex; flex-direction: column; justify-content: flex-start; align-items: center;">
                <div style="flex:1; display: flex; justify-content: flex-start; flex-direction: row; width: 80%; margin-top: 10px;" >
                    <h3>COMMENTS</h3>
                </div>
                <div class="comment_content" id="comment_content" style="flex:5; width: 80%;"></div>
                <div style="flex:1; display: flex; justify-content: flex-start; flex-direction: row; width: 80%; margin: 10px 0; align-items: center;" >
                    <el-avatar shape="square" :size="50" :src="require('../../assets/member5.jpg')"></el-avatar>
                    <span style="margin-left: 10px; font-weight: bolder;">Manager Sekikuti</span>
                </div>
                <div style="flex:4; width: 80%;">
                    <el-input
                    type="textarea"
                    :rows="8"
                    placeholder="コメントを入力してください"
                    v-model="comment_content" >
                  </el-input>
                </div>
                <div style="flex:1; display: flex; justify-content: flex-end; flex-direction: row; width: 80%; margin: 10px 0;" >
                    <button class="comment_btn" @click="submit_comment()">SUBMIT</button>
                </div>
            </div>
        </div>
            
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
.present{
    flex:3;
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

#introduce1{
    display: flex;
    align-items: center; 
    justify-content: center;
    flex-direction: column;
}

#calendar{
    display: grid;
    grid-template-columns: repeat(7,1fr);
    grid-template-rows: repeat(7,1fr);
}


.date_th{
    font-weight: bolder;
}
.date{
    font-weight: bolder;
}

.month_controller{
    display: flex;
    margin-top: 20px;
}

.month_controller>div>button{
    display: inline-block;
    outline: 0;
    border: 0;
    font-size: 20px;
    font-weight: 500;
    color: #fff;
    cursor: pointer;
    background-image: linear-gradient(to right,#e052a0,#f15c41)!important;
    border-radius: 3px;
    padding: 16px 18px 15px;
    white-space: nowrap;
    letter-spacing: 3px;
    margin-right:20px;
}

.month_controller>div>button:hover {
        background-color: #e6375a;
        background-image: none!important;
}

.reportDialog{
 width: 800px; 
 height: 600px;
 
 position: absolute; 
 left: 50%; 
 top: 50%;
 margin-top: -300px;    /* 高度的一半 */
 margin-left: -400px;    /* 宽度的一半 */
 background: rgba(255, 255, 255, 0.19);
 border-radius: 16px;
 box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
 backdrop-filter: blur(6.5px);
 -webkit-backdrop-filter: blur(6.5px);
 display: flex;
 flex-direction: column;
 justify-content: space-around;
 transition: left 1s;
}

.commentDialog{
 width: 400px; 
 height: 600px;
 
 position: absolute; left: 65%; top: 50%;
 /* 高度的一半 */
 margin-top: -300px;    
 /* 宽度的一半 */
 margin-left: -200px;    
 background: rgba(255, 255, 255, 0.19);
 border-radius: 16px;
 box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
 backdrop-filter: blur(6.5px);
 -webkit-backdrop-filter: blur(6.5px);
 display: flex;
 flex-direction: column;
 justify-content: space-around;
}

.report_content_box{
    display: -webkit-box;
    -webkit-box-orient: vertical;
    overflow: hidden;
    text-overflow: ellipsis;
    -webkit-line-clamp: 3; /* 显示的最大行数 */
}

.comment_content{
    overflow: scroll;
    text-overflow: scroll;
}

.comment_btn{
    display: inline-block;
    outline: 0;
    border: 0;
    font-size: 12px;
    font-weight: bolder;
    color: #000;
    cursor: pointer;
    background-image: linear-gradient(to right,#60e95d,#07b9f4)!important;
    border-radius: 3px;
    padding: 16px 18px 15px;
    white-space: nowrap;
    letter-spacing: 1.5px;
    margin-right: 0;
    width: 100%;
}


</style>

<script>
    const axios = require('axios').default;
    axios.defaults.baseURL = 'http://group10.lawrencelee.cool';
export default{
    data(){
        return{
            currentMonth: "Aprial",
            date_table:["Sunday","Monday","Tuseday","Wednesday","Thursday","Friday","Saturday"],
            aprial:{
                start:6,
                end:30,
                month:4,
                name:"Aprial"
            },
            may:{
                start:1,
                end:31,
                month:5,
                name:"May"
            },
            june:{
                start:4,
                end:30,
                month:6,
                name:"June"
            },
            user1:{
                first_name:"li",
                last_name:"yongjin",
                id:1,
                daily_report:"daily report"
            },
            current_date:{
                month:0,
                day:0
            },
            current_comment_member:"",
            data:[],
            comment_content:"",
        }
    },
    mounted() {
        // set all calendar components display=none
        let calendar_components = document.getElementsByClassName("calendar_components");
        for(let i=0;i<calendar_components.length;i++){
            calendar_components[i].style.setProperty("display","none")
        }
        // set report dialog init disappear
        let dialog = document.getElementById("reportDialog");
        dialog.style.setProperty("display","none");
        let date_th = document.getElementsByClassName("date_th");

        // set comment dialog init disappear
        let comment_dialog = document.getElementById("commentDialog");
        comment_dialog.style.setProperty("display","none");

        for(let i=0; i<7;i++){
            date_th[i].innerHTML = this.date_table[i]
        }
        // render calendar
        let date_elements = document.getElementsByClassName("date");
        let aprial_iter = 1;
        for(let i=this.aprial.start;i<this.aprial.end+this.aprial.start;i++){
            date_elements[i].innerHTML = aprial_iter;
            date_elements[i].setAttribute("date",aprial_iter);
            date_elements[i].setAttribute("month",this.aprial.month);
            aprial_iter++;
        }
    },

    methods:{
        isReady(){
            let introduce1 = document.getElementById("introduce1");
            introduce1.classList.add("animate__rotateOutUpLeft");
            setTimeout(()=>{
                introduce1.style.setProperty("display","none");
            },1000);
            
            setTimeout(()=>{
                let calendar_components = document.getElementsByClassName("calendar_components");
                for(let i=0;i<calendar_components.length;i++){
                    calendar_components[i].style.setProperty("display","")
                    calendar_components[i].classList.add("animate__animated","animate__bounceInRight")
                }
            },900);



                //             let calendar_components = document.getElementsByClassName("calendar_components");
                // for(let i=0;i<calendar_components.length;i++){
                //     calendar_components[i].style.setProperty("display","")
                //     calendar_components[i].classList.add("animate__animated","animate__bounceInRight")}

        },

        changeMonth(month){
            let month_title = document.getElementById("month_title");
            
            month_title.classList.add("animate__animated","animate__flipOutX");
            setTimeout(()=>{
                month_title.classList.remove("animate__animated","animate__flipOutX");
                this.currentMonth = month.name;
                month_title.classList.add("animate__animated","animate__flipInX");
            },500);
            
            
            
            let date_elements = document.getElementsByClassName("date");
            
            for(let j=0; j<date_elements.length;j++){
                date_elements[j].innerHTML = ""
            }

            let month_iter = 1;
            for(let i=month.start;i<month.end+month.start;i++){
                date_elements[i].innerHTML = month_iter;
                date_elements[i].setAttribute("date",month_iter);
                date_elements[i].setAttribute("month",month.month);
                month_iter++;
            }
            console.log(month.start)
        },

        showReport(event){
            let month = event.target.getAttribute("month");
            let date = event.target.getAttribute("date");
            this.current_date.month = month;
            this.current_date.day = date;
            if(month==null||date==null){ return; }
            console.log("获取"+month+"月"+date+"日日报");

            axios.get('/dailyreports',{
                params:{
                    month:month,
                    day:date
                }
            }).then((rsp)=>{
                console.log("-----")
                // console.log(rsp.data)
                this.data = rsp.data
                console.log(this.data[0].daily_report)
                for(let i=0;i<6;i++){
                    document.getElementsByClassName("report_name")[i].innerHTML = this.data[i].first_name+" "+this.data[i].last_name
                    document.getElementsByClassName("report_content")[i].innerHTML = this.data[i].daily_report
                }
                

            });

            let dialog = document.getElementById("reportDialog");
            dialog.style.setProperty("display","");
            dialog.classList.add("animate__animated","animate__bounceIn")
        

        },

        closeReport(){
            console.log("on blure close")
            let dialog = document.getElementById("reportDialog");
            let comment_dialog = document.getElementById("commentDialog");
            dialog.style.setProperty("display","none");
            comment_dialog.style.setProperty("display","none");
            dialog.style.left = "50%";
            for(let i=0;i<6;i++){
                    document.getElementsByClassName("report_name")[i].innerHTML = ""
                    document.getElementsByClassName("report_content")[i].innerHTML = ""
                }
        },

        dateshake(event){
            event.target.classList.add("animate__animated","animate__swing")
            setTimeout(()=>{
                event.target.classList.remove("animate__animated","animate__swing")
            },1000)
        },

        open_comment_dialog(member_id){
            
            this.current_comment_member = member_id;
            let report_dialog = document.getElementById("reportDialog");
            let comment_dialog = document.getElementById("commentDialog");
            let comment_content = document.getElementById("comment_content");
            //axios 请求comment content
            if(comment_dialog.style.display==""){
                comment_dialog.classList.add("animate__animated","animate__fadeOutDown");
                setTimeout(()=>{
                    comment_dialog.classList.remove("animate__animated","animate__fadeOutDown");
                    comment_dialog.classList.add("animate__animated","animate__fadeInUp");
                },500)
            }

            if(comment_content.innerHTML==""){
                comment_content.innerHTML = "There is not any comment right here"
            }
            
            report_dialog.style.left = "30%";
            // console.log("left 20%");
            comment_dialog.style.display="";
            comment_dialog.classList.add("animate__animated","animate__fadeInUp");

        },

        close_comment_dialog(){
            let comment_dialog = document.getElementById("commentDialog");
            comment_dialog.style.display = "none";
        },

        submit_comment(){
            // submit current_date.month, current_date.day, current_comment_member
            this.$message.success("success");
            this.comment_content = "コメントを入力してください";
            // this.closeReport()
            
        }

    }
}
</script>