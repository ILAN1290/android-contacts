package ru.yandex.practicum.contacts.domain.impl

import kotlinx.coroutines.flow.Flow
import ru.yandex.practicum.contacts.domain.models.Contact
import ru.yandex.practicum.contacts.domain.api.ContactsRepository

class GetContactsUseCase(private val repository: ContactsRepository) {
    operator fun invoke(): Flow<List<Contact>> = repository.getContacts()
} 