<template>
    <div id="main"> 
        <div class="container">
           <div class="content">
               <!-- Left content -->
               <div class="left">
                    <el-steps direction="vertical" :active="steper.activenum" finish-status="success" v-show="steper.stepshow" class="steper">
                        <el-step>
                            <template v-slot:title>
                            <h3>Purpose</h3>
                          </template>
                        </el-step>
                        <el-step >
                            <template v-slot:title>
                            <h3>Detail</h3>
                          </template>
                        </el-step>
                        <el-step >
                            <template v-slot:title>
                            <h3>Budget</h3>
                          </template>
                        </el-step>
                       
                    </el-steps>
               </div>

               <!-- Middle Content -->
                <div class="glassContainer">
                    <!-- Initial windows -->
                    <div class="initial" v-show="initial.show">
                        <div style="margin-bottom: 50px;">
                            <h1>Ready ?</h1>
                        </div>
                        <div style="width: 10rem;height: 10rem;">
                            <el-button style="font-size: 25px;width: 100%;height: 100%;" size="large" @click="isReady" circle >
                                <h3>Yes!</h3>
                            </el-button>
                        </div>
                    </div>
                   
                    <!-- Select purpose -->
                    <div class="purpose" v-show="purpose.show" >
                        <div class="title purpose" style="margin-bottom: 50px;">
                            <h1>What is your purpose</h1>
                        </div>
                        <div>
                            <el-select v-model="purpose.value" class="m-2" placeholder="Select" size="large" style="opacity: 60%; outline: none;" @blur="tobudget">
                                <el-option
                                  v-for="item in purpose.options"
                                  :key="item.value"
                                  :label="item.label"
                                  :value="item.value"
                                  style="opacity: 60%;"
                                ></el-option>
                              </el-select>
                        </div>
                    </div>
                    
                    <!-- Select Language -->
                    <!-- Select Frame Work -->
                    <!-- Select Budget -->
                    <div class="budget" v-show="budget.show" >
                        <div class="title budget" style="margin-bottom: 50px;">
                            <h1>What is your budget</h1>
                        </div>
                        <div>
                            <el-select v-model="budget.value" class="m-2" placeholder="Select" size="large" style="opacity: 60%;" >
                                <el-option
                                  v-for="item in budget.options"
                                  :key="item.value"
                                  :label="item.label"
                                  :value="item.value"
                                  style="opacity: 60%;"
                                ></el-option>
                              </el-select>
                        </div>
                    </div>
                </div>
                <!-- Right content -->
                <div style="flex:1"></div>
           </div>
            
           <el-icon><arrow-right-bold /></el-icon>
        </div>
    </div>
</template>

<script>
// import { Edit, Upload, Picture } from '@element-plus/icons-vue';
export default {
    
    data() {
        return {
            steper:{
                activenum:0,
                stepshow:false,
            },
            initial:{
                show:true
            },
            purpose: {
                show: false,
                value:'',
                options:[
                    {key:0, label:"ウェブシステム開発",value:'ウェブシステム開発'},
                    {key:1, label:"アプリ開発",value:'アプリ開発'},
                ]
            },
            language:{},
            framework:{},
            function:{},
            budget: {
                show: false,
                value:'',
                options:[
                    {key:0, label:"100,000~1,000,000",value:'100,000~1,000,000'},
                    {key:1, label:"1,000,000~5,000,000",value:'1,000,000~5,000,000'},
                ]
            },
        }
    },

    methods: {
        isReady(){
            let initial = document.getElementsByClassName('initial')[0]
            initial.classList.add("animate__animated","animate__fadeOutUp")
            initial.addEventListener("animationend", function(){
                this.initial.show = false
                let purpose = document.getElementsByClassName("purpose")[0]
                this.purpose.show = true
                purpose.classList.add("animate__animated","animate__fadeInUp")
            }.bind(this))
            setTimeout(function(){
                this.steper.stepshow = true
                var steper = document.getElementsByClassName('steper')[0]
                steper.classList.add("animation-roundrunner")
            }.bind(this),500)
            
           
        },
        next(){
            this.steper.activenum+=1;
        },
        tobudget(){
            this.next()
            let purpose = document.getElementsByClassName("purpose")[0]
            purpose.classList.add("animate__animated","animate__fadeOutUp")
            purpose.addEventListener("animationend", function(){
                this.purpose.show = false
                let budget = document.getElementsByClassName("budget")[0]
                this.budget.show = true
                budget.classList.add("animate__animated","animate__fadeInUp")
            }.bind(this))
        }
    }
}
</script>

<style>
@import url("animation.css");
    *{
        margin: 0;
        padding: 0;
    }

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

    .left{
        flex: 1;
        width: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .content{
        display: flex;
        width: 100%;
    }

    .container{
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

    .glassContainer{
        /* From https://css.glass */
        background: rgba(255, 255, 255, 0.19);
        border-radius: 16px;
        box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
        backdrop-filter: blur(6.5px);
        -webkit-backdrop-filter: blur(6.5px);
        width: 50%;
        height: 50vh;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
    }

</style>
