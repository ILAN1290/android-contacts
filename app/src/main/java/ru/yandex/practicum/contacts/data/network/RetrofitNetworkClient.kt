package ru.yandex.practicum.contacts.data.network

import ru.yandex.practicum.contacts.data.NetworkClient
import ru.yandex.practicum.contacts.data.dto.BaseResponse
import ru.yandex.practicum.contacts.data.dto.TrackSearchResponse

class RetrofitNetworkClient : NetworkClient {
    override fun doRequest(dto: Any): BaseResponse {
        return TrackSearchResponse(listOf())
    }
}