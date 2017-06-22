package com.kk.md;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by hayim_000 on 2017-06-22.
 */

public class WriteFragment extends Fragment {

    private static int id = -1;
    private TextView mTV;
    private EditText mET;
    private Button mSaveBtn;


    public WriteFragment( int id ) {
        this.id = id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.fragment_write, container, false );
        mTV = (TextView) rootView.findViewById( R.id.day );
        mTV.setText( " TEST " + id );
        return rootView;
    }
}
