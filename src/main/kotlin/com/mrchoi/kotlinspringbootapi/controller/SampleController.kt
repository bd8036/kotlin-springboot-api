package com.mrchoi.kotlinspringbootapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @GetMapping("/")
    fun index(@RequestParam("name") name: String) = "Hello, $name!"
}