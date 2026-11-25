package ru.yandex.practicum.contacts.domain.api

interface TracksRepository {
    fun searchTracks(expression: String): List<Track>
}