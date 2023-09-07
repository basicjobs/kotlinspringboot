package com.storm.mogaapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MogaApiApplication

fun main(args: Array<String>) {
    runApplication<MogaApiApplication>(*args)
}
