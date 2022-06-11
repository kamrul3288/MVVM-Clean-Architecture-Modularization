package com.iamkamrul.repolist

import com.iamkamrul.common.base.BaseViewModel
import com.iamkamrul.domain.base.Result
import com.iamkamrul.domain.usecase.RepositoryListUseCase
import com.iamkamrul.entity.RepositoryListItemEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class RepoListViewModel  @Inject constructor(
    private val repoListUseCase: RepositoryListUseCase
): BaseViewModel() {
    val action: (RepoListUiAction) -> Unit

    private val _uiState = MutableStateFlow<RepoListUiState<Any>>(RepoListUiState.Loading(isLoading = true))
    val uiState: StateFlow<RepoListUiState<Any>> get() = _uiState


    init {
        action = {
            when(it){
                is RepoListUiAction.FetchRepoList -> fetchRepoList(it)
            }
        }
        action(RepoListUiAction.FetchRepoList())
    }

    private fun fetchRepoList(data:RepoListUiAction.FetchRepoList){
        execute {
            _uiState.value = RepoListUiState.Loading(true)
            val result = repoListUseCase.execute(RepositoryListUseCase.Params(userName = data.userName))
            _uiState.value = RepoListUiState.Loading(false)
            when(result){
                is Result.Success-> _uiState.value = RepoListUiState.Success(result.data)
                is Result.Error-> _uiState.value = RepoListUiState.Error(result.message)
            }
        }
    }
}

sealed class RepoListUiState<out R>{
    data class Loading(val isLoading:Boolean):RepoListUiState<Boolean>()
    data class Error(val message:String):RepoListUiState<String>()
    data class Success(val data:List<RepositoryListItemEntity>):RepoListUiState<List<RepositoryListItemEntity>>()
}

sealed class RepoListUiAction{
    data class FetchRepoList(val userName:String = "kamrul3288"):RepoListUiAction()
}