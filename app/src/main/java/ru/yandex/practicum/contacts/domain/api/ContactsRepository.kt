package ru.yandex.practicum.contacts.domain.api

import kotlinx.coroutines.flow.Flow
import ru.yandex.practicum.contacts.domain.models.Contact

interface ContactsRepository {
    fun getContacts(): Flow<List<Contact>>
}