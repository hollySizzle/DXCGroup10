import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'Group10',
    component: ()=> import('../views/present/')
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/main',
    name: 'main',
    component:() => import('../views/main/main.vue')
  },
  {
    path: '/login',
    name: 'login',
    component:() => import('../views/present/login.vue')
  },
  
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})
// 挂在路由导航守卫
router.beforeEach((to,from,next)=>{
	// to代表将要访问的路径
	// from代表从哪个路径跳转而来
	// next是一个函数，代表放行,next() , next('/login')-> 指定强制跳转路径
	if(to.path==='/login'){
		return next();
	}else if(to.path==='/register'){
		return next();
	}else{
		const tokenStr = window.sessionStorage.getItem('token');
		
		if(!tokenStr){
			return next('/login');
		}else{
			return next();
		}
	}
})
export default router
