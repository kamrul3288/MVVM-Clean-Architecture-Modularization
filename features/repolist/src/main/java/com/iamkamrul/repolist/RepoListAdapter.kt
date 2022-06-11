package com.iamkamrul.repolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.iamkamrul.common.adapter.DataBoundListAdapter
import com.iamkamrul.entity.RepositoryListItemEntity
import com.iamkamrul.repolist.databinding.ItemRepoListBinding
import com.squareup.picasso.Picasso

class RepoListAdapter(
    private val onClick:(View.OnClickListener)
) : DataBoundListAdapter<RepositoryListItemEntity,ItemRepoListBinding>(
    diffCallback = object : DiffUtil.ItemCallback<RepositoryListItemEntity>(){
        override fun areItemsTheSame(oldItem: RepositoryListItemEntity, newItem: RepositoryListItemEntity): Boolean {
            return oldItem.repoFullName == newItem.repoFullName
        }

        override fun areContentsTheSame(oldItem: RepositoryListItemEntity, newItem: RepositoryListItemEntity): Boolean {
            return oldItem.repoFullName == newItem.repoFullName
        }
    }
){
    override fun createBinding(parent: ViewGroup): ItemRepoListBinding  =
        ItemRepoListBinding.inflate(LayoutInflater.from(parent.context),parent,false)

    override fun bind(binding: ItemRepoListBinding, item: RepositoryListItemEntity, position: Int) {
        binding.root.setOnClickListener(onClick)
        Picasso.get().load(item.userAvatarUrl).into(binding.avatarIv)
        binding.nameTv.text = item.userName
        binding.repoShortNameTv.text = item.repoName
        binding.repoFullNameTv.text = item.repoFullName
        binding.descriptionTv.text = item.repoDescription
        binding.languageTv.text = item.language
        binding.staredTv.text = "${item.stargazers_count} Stars"
        binding.forkedTv.text = "${item.stargazers_count} Forked"
    }
}