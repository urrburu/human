package com.resource.controller

import com.resource.service.AttendanceService
import com.resource.service.AttendanceServiceImpl
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/attendance")
@RequiredArgsConstructor
class AttendanceApiController {

    private val attendanceService: AttendanceService


    @RequestMapping(value ="/list/", method = arrayOf(RequestMethod.GET))
    fun list(@RequestParam(required = false, defaultValue = "1") page: Int,
             @RequestParam(required = false, defaultValue = "10") pageSize: Int) = attendanceService.list(page, pageSize)
    @RequestMapping("/add")
    fun add(): String {
        return "attendance/add"
    }

    @RequestMapping("/edit")
    fun edit(): String {
        return "attendance/edit"
    }

    @RequestMapping("/delete")
    fun delete(): String {
        return "attendance/delete"
    }

}