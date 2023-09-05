package com.chad.baserecyclerviewadapterhelper.adapter.multi.provider;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.baserecyclerviewadapterhelper.R;
import com.chad.baserecyclerviewadapterhelper.databinding.ItemImageViewBinding;
import com.chad.baserecyclerviewadapterhelper.entity.ProviderMultiEntity;
import com.chad.baserecyclerviewadapterhelper.utils.Tips;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder;

import org.jetbrains.annotations.NotNull;


/**
 * https://github.com/chaychan
 *
 * @author ChayChan
 * @description: Img ItemProvider
 * @date 2018/3/30  11:39
 */

public class ImgItemProvider extends BaseItemProvider<ProviderMultiEntity, BaseDataBindingHolder> {

    @Override
    public int getItemViewType() {
        return ProviderMultiEntity.IMG;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_image_view;
    }

    @Override
    public void convert(@NonNull BaseDataBindingHolder helper, @Nullable ProviderMultiEntity data) {
        if (helper.getAdapterPosition() % 3 == 0) {
            helper.setImageResource(R.id.iv, R.mipmap.animation_img1);
        } else if (helper.getBindingAdapterPosition() % 3 == 1) {
            ItemImageViewBinding binding = helper.getDataBinding();
            if (binding != null) {
                ImageView imageView = binding.iv;
                imageView.setImageResource(R.mipmap.animation_img3);
            }
        } else {
            helper.setImageResource(R.id.iv, R.mipmap.animation_img2);
        }
    }

    @Override
    public void onClick(@NonNull BaseDataBindingHolder helper, @NotNull View view, ProviderMultiEntity data, int position) {
        Tips.show("Click: " + position);
    }

    @Override
    public boolean onLongClick(@NotNull BaseDataBindingHolder helper, @NotNull View view, ProviderMultiEntity data, int position) {
        Tips.show("Long Click: " + position);
        return true;
    }
}
