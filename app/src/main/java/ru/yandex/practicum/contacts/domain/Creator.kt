package ru.yandex.practicum.contacts.domain

import ru.yandex.practicum.contacts.domain.impl.TrackSearchInteractorImpl
import ru.yandex.practicum.contacts.data.TracksRepositoryImpl
import ru.yandex.practicum.contacts.data.network.RetrofitNetworkClient
import ru.yandex.practicum.contacts.domain.api.TracksRepository
import ru.yandex.practicum.contacts.domain.api.TrackSearchInteractor

object Creator {
    private fun getTracksRepository(): TracksRepository {
        return TracksRepositoryImpl(RetrofitNetworkClient())
    }

    fun provideTrackSearchInteractor(): TrackSearchInteractor {
        return TrackSearchInteractorImpl(getTracksRepository())
    }
}