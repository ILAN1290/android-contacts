package ru.yandex.practicum.contacts.domain.impl

import ru.yandex.practicum.contacts.domain.api.TrackSearchInteractor
import ru.yandex.practicum.contacts.domain.api.TracksRepository

class TrackSearchInteractorImpl(private val repository: TracksRepository) : TrackSearchInteractor {
    override fun searchTracks(expression: String): List<Track> {
        return repository.searchTracks(expression)
    }
}