package com.example.blog

import com.example.blog.core.BaseResource
import org.springframework.web.bind.annotation.*

@RestController
class MessageResource(private val messageService: MessageService) : BaseResource() {

    @GetMapping
    fun getAll() = call { messageService.findMessages() }

    @GetMapping("/{id}")
    fun get(@PathVariable id: String) =
        call { messageService.findMessageById(id) }

    @PostMapping
    fun update(@RequestBody message: Message) =
        call { messageService.save(message) }
}