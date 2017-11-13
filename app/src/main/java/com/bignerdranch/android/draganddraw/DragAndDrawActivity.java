package com.bignerdranch.android.draganddraw;

import android.support.v4.app.Fragment;

/**
 * Created by John on 10/4/2017.
 */

public class DragAndDrawActivity extends
        SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
