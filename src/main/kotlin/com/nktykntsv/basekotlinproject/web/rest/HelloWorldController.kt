package com.nktykntsv.basekotlinproject.web.rest

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/hello-world")
class HelloWorldController(
    @Value("\${spring.profiles.active}")
    val mode: String,
    @Value("\${server.port}")
    val port: String,
) {

    @GetMapping("/")
    fun getCurrentMode(): ResponseEntity<String> {
        return ResponseEntity.ok("Server is running in $mode mode on port $port")
    }
}