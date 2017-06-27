package com.kk.md;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.common.SignInButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by hayim_000 on 2017-06-27.
 */

public class FragmentLogin extends Fragment implements FirebaseAuth.AuthStateListener, OnCompleteListener<AuthResult>, View.OnClickListener {

    private FirebaseAuth mAuth;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.fragment_login, container, false );

        mAuth = FirebaseAuth.getInstance();
        SignInButton gSignBtn = (SignInButton) rootView.findViewById( R.id.btn_google_sign_in );
        gSignBtn.setSize( SignInButton.SIZE_STANDARD );

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();

        mAuth.addAuthStateListener( this );
    }

    @Override
    public void onStop() {
        super.onStop();

        mAuth.removeAuthStateListener( this );
    }

    /*
    * 로그인 성공시 호출
    * */
    @Override
    public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
        FirebaseUser user = firebaseAuth.getCurrentUser();
    }

    @Override
    public void onComplete(@NonNull Task<AuthResult> task) {

    }

    @Override
    public void onClick(View view) {
        switch ( view.getId() ) {
            case R.id.btn_google_sign_in:

        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
