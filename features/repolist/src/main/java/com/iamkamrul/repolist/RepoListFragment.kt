package com.iamkamrul.repolist

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.iamkamrul.common.base.BaseFragment
import com.iamkamrul.common.extension.setUpVerticalRecyclerView
import com.iamkamrul.repolist.databinding.FragmentRepoListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepoListFragment : BaseFragment<FragmentRepoListBinding>() {
    override fun viewBindingLayout(): FragmentRepoListBinding =
        FragmentRepoListBinding.inflate(layoutInflater)

    private val viewModel: RepoListViewModel by viewModels()
    private val adapter = RepoListAdapter()


    override fun initializeView(savedInstanceState: Bundle?) {
        requireActivity().setUpVerticalRecyclerView(binding.repoListRv,adapter)
        observeViewState()
    }

    private fun observeViewState(){
        viewModel.uiState.execute { state ->
            when(state){
                is RepoListUiState.Loading->binding.root.setSimpleProgressBarStatusLayout(state.isLoading)
                is RepoListUiState.Success-> adapter.submitList(state.data)
                is RepoListUiState.Error->binding.root.showSimpleNetworkErrorLayout(message = state.message){
                    viewModel.action(RepoListUiAction.FetchRepoList())
                }
            }
        }
    }


}