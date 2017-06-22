package com.kk.md;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by hayim_000 on 2017-06-22.
 */

public class FragmentSetting extends Fragment {
    private static final String TAG = "FragmentSetting";
    private static final boolean VERBOSE = V3HV.DEBUG;

    private ListView mListView;

    public FragmentSetting() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate( R.layout.fragment_setting, container, false );
    }
}
