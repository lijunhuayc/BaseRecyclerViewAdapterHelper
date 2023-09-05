package com.chad.baserecyclerviewadapterhelper.adapter.multi

import com.chad.baserecyclerviewadapterhelper.adapter.multi.provider.Test111ItemProvider
import com.chad.baserecyclerviewadapterhelper.adapter.multi.provider.Test222ItemProvider
import com.chad.library.adapter.base.BaseProviderMultiAdapter
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder

/**
 * @Desc: 说明
 * @Author: Junhua.Li
 * @CreateDate: 2023/3/10 17:57
 */
class TestProviderAdapter : BaseProviderMultiAdapter<Pair<Int, Any>, BaseDataBindingHolder>() {

    init {
        addItemProvider(Test111ItemProvider())
        addItemProvider(Test222ItemProvider())
    }

    override fun getItemType(data: List<Pair<Int, Any>>, position: Int): Int {
        return data[position].first
    }
}