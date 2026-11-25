package ru.yandex.practicum.contacts.domain.api

interface TrackSearchInteractor {
    fun searchTracks(expression: String): List<Track>
}