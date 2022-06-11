package com.iamkamrul.profile

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.iamkamrul.common.base.BaseFragment
import com.iamkamrul.profile.databinding.FragmentProfileBinding
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : BaseFragment<FragmentProfileBinding>(){
    override fun viewBindingLayout(): FragmentProfileBinding  =
        FragmentProfileBinding.inflate(layoutInflater)

    private val viewModel:ProfileViewModel by viewModels()

    override fun initializeView(savedInstanceState: Bundle?) {
        observeViewState()
    }

    private fun observeViewState(){
        viewModel.uiState.execute { state ->
            when(state){
                is UserProfileUiState.Loading->binding.root.setSimpleProgressBarStatusLayout(state.isLoading)
                is UserProfileUiState.Success->{
                    Picasso.get().load(state.data.userAvatar).into(binding.profileIv)
                    binding.fullNameTv.text = state.data.userFullName
                    binding.userName.text = state.data.userName
                    binding.aboutTv.text = state.data.about
                    binding.repositoryCountTv.text = "${state.data.repoCount}"
                    binding.followingCountTv.text = "${state.data.followingCount}"
                    binding.followerCountTv.text = "${state.data.followerCount}"
                }
                is UserProfileUiState.Error->binding.root.showSimpleNetworkErrorLayout(message = state.message){
                    viewModel.action(UserProfileUiAction.FetchUserProfile())
                }
            }
        }
    }
}