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

    static WriteFragment mWriteFragment1;
    static ListFragment mListFragment;

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
        mWriteFragment1 = new WriteFragment(1);
        mListFragment = new ListFragment();
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Log.i( TAG,"getItem : " + position );

        switch ( position ) {
            case 0:
                return mWriteFragment1;
            case 1:
                return mListFragment;
//            case 2:
//                return mWriteFragment1;
            default:
                Log.i( TAG, "unknown fragment : " + position );
        }
            return null;
//        return PlaceholderFragment.newInstance(position + 1);
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