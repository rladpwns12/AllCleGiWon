
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import StudentManager from "./components/listers/StudentCards"
import StudentDetail from "./components/listers/StudentDetail"

import CourseManager from "./components/listers/CourseCards"
import CourseDetail from "./components/listers/CourseDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/students',
                name: 'StudentManager',
                component: StudentManager
            },
            {
                path: '/students/:id',
                name: 'StudentDetail',
                component: StudentDetail
            },

            {
                path: '/courses',
                name: 'CourseManager',
                component: CourseManager
            },
            {
                path: '/courses/:id',
                name: 'CourseDetail',
                component: CourseDetail
            },




    ]
})
