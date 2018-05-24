package io.gsy.koter

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
class HiController {

    @Autowired
    val service: HiService? = null

    @GetMapping("/")
    fun hi():String{
        return "Hi kotlin"
    }

    @GetMapping("/{name}")
    fun getUser(@PathVariable name:String):User?{
        return service?.getUser(name)
    }

    @GetMapping("/user")
    fun getUserName(@RequestParam(value = "name", defaultValue = "hmm") name: String):User?{
        return service?.getUser(name)
    }

    @PostMapping("/user")
    fun addUser(@RequestBody user: User): User? {
        return service?.addUser(user)
    }



}