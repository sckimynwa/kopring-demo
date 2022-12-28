package com.example.kopringdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class KopringDemoApplication

fun main(args: Array<String>) {
    runApplication<KopringDemoApplication>(*args)
}

@RestController
class MessageController() {
    @GetMapping("/")
    fun index(@RequestParam("name") name: String) = "Hello, $name!"
}

//    @PostMapping("/")
//    fun post(@RequestBody message: Message) {
//        service.save(message)
//    }


//@RestController
//class MessageController(val service: MessageService) {
//    @GetMapping("/")
//    fun index(): List<Message> = service.findMessages()
//
//    @PostMapping("/")
//    fun post(@RequestBody message: Message) {
//        service.save(message)
//    }
//}

//@Table("MESSAGES")
//data class Message(@Id val id: String?, val text: String)
//
//interface MessageRepository: CrudRepository<Message, String>
//
//@Service
//class MessageService(val db: MessageRepository) {
//    fun findMessages(): List<Message> = db.findAll().toList()
//
//    fun save(message: Message) {
//        db.save(message)
//    }
//}
