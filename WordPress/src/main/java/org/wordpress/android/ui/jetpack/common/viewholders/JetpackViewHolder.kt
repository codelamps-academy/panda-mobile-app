package org.wordpress.android.ui.jetpack.common.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import org.wordpress.android.ui.jetpack.common.JetpackListItemState

abstract class JetpackViewHolder<T : ViewBinding>(
    val parent: ViewGroup,
    val inflateBinding: (LayoutInflater, ViewGroup, Boolean) -> T,
    val binding: T = inflateBinding(LayoutInflater.from(parent.context), parent, false)
) : RecyclerView.ViewHolder(binding.root) {
    abstract fun onBind(itemUiState: JetpackListItemState)
}
