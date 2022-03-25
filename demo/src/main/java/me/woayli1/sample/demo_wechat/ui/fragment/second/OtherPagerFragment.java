package me.woayli1.sample.demo_wechat.ui.fragment.second;

import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.woayli1.fragmentation.SupportFragment;
import me.woayli1.sample.R;

/**
 * Created by YoKeyword on 16/6/30.
 */
public class OtherPagerFragment extends SupportFragment {

    public static OtherPagerFragment newInstance() {

        Bundle args = new Bundle();
        OtherPagerFragment fragment = new OtherPagerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.wechat_fragment_tab_second_pager_other, container, false);
        return view;
    }
}
