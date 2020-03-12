package com.anbetter.glide.helper;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.anbetter.glide.helper.databinding.ActivityGlideUseDatabindingBinding;


/**
 * Created by android_ls on 16/11/11.
 */

public class UseDataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityGlideUseDatabindingBinding binding = ActivityGlideUseDatabindingBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        String url = "https://ww1.sinaimg.cn/large/0065oQSqly1ftzsj15hgvj30sg15hkbw.jpg";
        binding.setUrl(url);

    }

}
