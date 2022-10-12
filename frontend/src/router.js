
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import StudentManager from "./components/listers/StudentCards"
import StudentDetail from "./components/listers/StudentDetail"

import CourseManager from "./components/listers/CourseCards"
import CourseDetail from "./components/listers/CourseDetail"

import EnrollmentManager from "./components/listers/EnrollmentCards"
import EnrollmentDetail from "./components/listers/EnrollmentDetail"


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

            {
                path: '/enrollments',
                name: 'EnrollmentManager',
                component: EnrollmentManager
            },
            {
                path: '/enrollments/:id',
                name: 'EnrollmentDetail',
                component: EnrollmentDetail
            },



    ]
})
