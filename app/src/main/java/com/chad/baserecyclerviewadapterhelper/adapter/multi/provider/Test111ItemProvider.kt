package com.chad.baserecyclerviewadapterhelper.adapter.multi.provider

import com.chad.baserecyclerviewadapterhelper.R
import com.chad.baserecyclerviewadapterhelper.databinding.ItemTextViewBinding
import com.chad.library.adapter.base.provider.BaseItemProvider
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder

/**
 * @Desc: 说明
 * @Author: Junhua.Li
 * @CreateDate: 2023/3/10 18:02
 */
class Test111ItemProvider : BaseItemProvider<Pair<Int, String>, BaseDataBindingHolder>() {
    override val itemViewType: Int
        get() = 1
    override val layoutId: Int
        get() = R.layout.item_text_view

    override fun convert(helper: BaseDataBindingHolder, item: Pair<Int, String>) {
        helper.getDataBinding<ItemTextViewBinding>()?.apply {
            tv.text = "测试ItemProvider11111:${item.second.toString()}"
        }
    }
}