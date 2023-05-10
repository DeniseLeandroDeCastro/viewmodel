package br.com.alura.technews.ui.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.alura.technews.repository.NoticiaRepository
import br.com.alura.technews.ui.viewmodel.ListaNoticiasViewModel

class FormularioNoticiaViewModelFactory (
    private val repository: NoticiaRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(p0: Class<T>): T {
        return FormularioNoticiaViewModelFactory(repository) as T
    }
}