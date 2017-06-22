package com.kk.md;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by hayim_000 on 2017-06-22.
 */

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "SectionsPagerAdapter";
    private static final boolean VERBOSE = V3HV.DEBUG;

    private static final int PAGE_WRITE = 0;
    private static final int PAGE_LIST = 1;
    private static final int PAGE_SETTING = 2;

    private static FragmentWrite mWriteFragment;
    private static FragmentList mListFragment;
    private static FragmentSetting mSettingFragment;

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);

        mWriteFragment = new FragmentWrite(1);
        mListFragment = new FragmentList();
        mSettingFragment = new FragmentSetting();
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        if( VERBOSE ) Log.i( TAG,"getItem : " + position );

        switch ( position ) {
            case PAGE_WRITE:
                return mWriteFragment;
            case PAGE_LIST:
                return mListFragment;
            case PAGE_SETTING:
                return mSettingFragment;
            default:
                Log.i( TAG, "unknown fragment : " + position );
        }
            return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "SECTION 1";
            case 1:
                return "SECTION 2";
//            case 2:
//                return "SECTION 3";
        }
        return null;
    }
}