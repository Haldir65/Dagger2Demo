package com.me.harris.dagger2demo.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Fermi on 2016/9/25.
 */

public class SomeFragment extends Fragment{

    public static SomeFragment newInstance() {
        Bundle args = new Bundle();
        SomeFragment fragment = new SomeFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
