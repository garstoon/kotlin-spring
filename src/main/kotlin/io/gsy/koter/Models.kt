package io.gsy.koter

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

@NoArgsConstructor
@AllArgsConstructor
data class User(@JsonProperty("name") val name:String,@JsonProperty("email") val email:String, @JsonProperty("sex")val sex:sex, val age:Int)

enum class sex(val sin:Boolean){FEMALE(false), MALE(true)}