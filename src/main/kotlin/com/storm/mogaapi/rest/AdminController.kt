package com.storm.mogaapi.rest

import com.storm.mogaapi.service.admin.AdminService
import com.storm.mogaapi.service.admin.entity.Admin
import jakarta.servlet.http.HttpServletRequest
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.lang.RuntimeException

@Controller
class AdminController(
    private val adminService: AdminService
) {

    @GetMapping("/")
    @ResponseBody
    fun main(model: Model, request: HttpServletRequest): Admin? {
        val admin: Admin? = adminService.findById(23L)
        return admin
    }

    @GetMapping("/test1")
    @ResponseBody
    fun test1(model: Model, request: HttpServletRequest): String? {

        var test: String?
        test = null

        val test2: String
        test2 = "tset"

        println(test2)

        return test
    }

    @GetMapping("/test2")
    @ResponseBody
    fun test2(model: Model, request: HttpServletRequest): String {
        return "SDf"
    }

}