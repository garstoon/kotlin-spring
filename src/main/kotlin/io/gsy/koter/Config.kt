package io.gsy.koter

import org.springframework.context.annotation.Bean

class Config {

    @Bean(name = arrayOf("service"))
    fun srv():HiService{
        return HiService()
    }

}