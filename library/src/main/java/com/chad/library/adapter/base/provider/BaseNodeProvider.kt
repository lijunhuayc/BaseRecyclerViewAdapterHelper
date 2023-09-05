package com.chad.library.adapter.base.provider

import com.chad.library.adapter.base.BaseNodeAdapter
import com.chad.library.adapter.base.entity.node.BaseNode
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder

abstract class BaseNodeProvider : BaseItemProvider<BaseNode, BaseDataBindingHolder>() {

    override fun getAdapter(): BaseNodeAdapter {
        return super.getAdapter() as BaseNodeAdapter
    }

}