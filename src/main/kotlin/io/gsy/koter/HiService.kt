package io.gsy.koter

import org.springframework.stereotype.Service

@Service
class HiService {
    var users = mapOf("hmm" to User("hanmeimei","hmm@fuck.com", sex.FEMALE, 12),
            "ll" to User("lilei","ll@fuck.com", sex.MALE, 13)).toMutableMap()

    fun getUser(name:String): User?{
        return users.get(name)
    }

    fun addUser(user:User):User{
        users.put(user.name, user)
        return user
    }
}