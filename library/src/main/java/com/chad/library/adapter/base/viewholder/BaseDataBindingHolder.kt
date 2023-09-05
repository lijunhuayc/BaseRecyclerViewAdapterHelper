package com.chad.library.adapter.base.viewholder

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * 方便 DataBinding 的使用
 *
 * @param BD : ViewDataBinding
 * @property dataBinding BD?
 * @constructor
 */
open class BaseDataBindingHolder(view: View) : BaseViewHolder(view) {

    private val mDataBinding: ViewDataBinding? by lazy {
        try {
            DataBindingUtil.bind<ViewDataBinding>(this.itemView)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    /**
     * 获取dataBinding
     */
    fun <T : ViewDataBinding> getDataBinding(): T? {
        return mDataBinding as T?
    }
}