package ru.yandex.practicum.contacts.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.yandex.practicum.contacts.data.network.ContactsRepositoryImpl
import ru.yandex.practicum.contacts.domain.impl.GetContactsUseCase

class ContactsViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactsViewModel::class.java)) {
            val repository = ContactsRepositoryImpl(context)
            val getContactsUseCase = GetContactsUseCase(repository)
            return ContactsViewModel(getContactsUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
} 