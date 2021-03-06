package com.lsxiao.apllo.processor

object Util {
    fun split(list: List<String>, separator: String): String {
        return list.mapTo(ArrayList<String>()) { "\"$it\"" }.joinToString(separator)
    }
}