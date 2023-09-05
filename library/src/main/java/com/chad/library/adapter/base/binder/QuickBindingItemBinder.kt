package com.chad.library.adapter.base.binder

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import com.chad.library.adapter.base.util.getDataViewBinding
import com.chad.library.adapter.base.viewholder.BaseViewHolder

/**
 * 使用 DataBinding 快速构建 Binder
 * @param T item数据类型
 * @param DB : ViewDataBinding
 */
abstract class QuickBindingItemBinder<T, DB : ViewDataBinding> : BaseItemBinder<T, QuickBindingItemBinder.BinderDataBindingHolder2<DB>>() {
    @LayoutRes
    abstract fun getLayoutId(): Int

    /**
     * 此 Holder 不适用于其他 BaseAdapter，仅针对[BaseBinderAdapter]
     */
    class BinderDataBindingHolder2<DB : ViewDataBinding>(val dataBinding: DB) : BaseViewHolder(dataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BinderDataBindingHolder2<DB> {
        return BinderDataBindingHolder2(parent.getDataViewBinding<DB>(getLayoutId()).value)
    }
}