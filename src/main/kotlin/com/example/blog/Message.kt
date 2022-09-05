package com.example.blog

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository

@Table(name = "MESSAGES")
data class Message(@Id var id: String?, val text: String)

interface MessageRepository : CrudRepository<Message, String>