package com.example.blog

import org.springframework.stereotype.Service
import java.util.*

@Service
class MessageService(private val messageRepository: MessageRepository) {

    fun findMessages(): List<Message> =
        messageRepository.findAll().toList()

    fun save(message: Message) {
        messageRepository.save(message)
    }

    fun findMessageById(id: String): List<Message> =
        messageRepository.findById(id).toList()
}

fun <T : Any> Optional<out T>.toList(): List<T> =
    if (isPresent) listOf(get()) else emptyList()