package ru.yandex.practicum.contacts.data

import ru.yandex.practicum.contacts.data.dto.BaseResponse

interface NetworkClient {
    fun doRequest(dto: Any) : BaseResponse
}