package com.example.myapplication.ui.gallerytext_gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Lista de Contatos"
    }
    val text: LiveData<String> = _text
}