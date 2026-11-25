package ru.yandex.practicum.contacts.data.dto

data class TrackDto(
    val id: Long,
    val trackName: String,
    val artistName: String,
    val trackTimeMillis: Long
)