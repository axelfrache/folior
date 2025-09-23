package me.axelfrache.folior

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FoliorApplication

fun main(args: Array<String>) {
    runApplication<FoliorApplication>(*args)
}
