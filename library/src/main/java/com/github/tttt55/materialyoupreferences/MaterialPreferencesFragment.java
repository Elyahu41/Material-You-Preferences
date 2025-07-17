package com.github.tttt55.materialyoupreferences;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.preference.PreferenceFragmentCompat;

//import com.google.android.material.appbar.MaterialToolbar;

import com.github.tttt55.materialyoupreferences.R;

public abstract class MaterialPreferencesFragment extends PreferenceFragmentCompat
        implements View.OnScrollChangeListener {

    int COLOR_TRANSPARENT;
    int COLOR_ON_SURFACE_INVERSE;

    NestedScrollView mSettingsScrollView;
    //MaterialToolbar mToolbar;

    //TextView mToolbarTitle;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mSettingsScrollView = view.findViewById(R.id.settingsScrollView);
        //mToolbar = view.findViewById(R.id.toolbar);
        //mToolbarTitle = view.findViewById(R.id.toolbarTitle);

        // Set title from args
        Bundle args = getArguments();

        // Resolve colors for status bar
        COLOR_TRANSPARENT = ContextCompat.getColor(getContext(), android.R.color.transparent);
        COLOR_ON_SURFACE_INVERSE = Util.resolveColorAttr(getContext(), com.google.android.material.R.attr.colorOnSurfaceInverse);

        // Set back button
        //((AppCompatActivity) getActivity()).setSupportActionBar(mToolbar);
        //ActionBar ab = ((AppCompatActivity) getActivity()).getSupportActionBar();
        //if(ab != null){
        //    ab.setDisplayHomeAsUpEnabled(true);
        //    mToolbar.setNavigationOnClickListener(this::onNavigationClicked);
        //}

        if(mSettingsScrollView != null
                //&& mToolbar != null
                //&& mToolbarTitle != null
        ) {
            //mToolbar.setBackgroundColor(COLOR_TRANSPARENT);
            //mToolbarTitle.setAlpha(0);
            mSettingsScrollView.setOnScrollChangeListener(this);
        }
    }

    //private void onNavigationClicked(View view) {
    //    FragmentManager fm = getActivity().getSupportFragmentManager();

    //    if(fm.getBackStackEntryCount() > 1) {
    //        fm.popBackStack();
    //    } else {
    //        getActivity().onBackPressed();
    //    }
    //}

    //TODO avoid setting color every time this is called
    @Override
    public void onScrollChange(View view, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
        int[] titleLocation = new int[2];

        float titleAlpha = Float.max(0, (float)(titleLocation[1] - 100) / 100);
        //float toolbarAlpha = (float) -titleLocation[1] / 100;
        //mToolbarTitle.setAlpha(toolbarAlpha);

        if(titleLocation[1]<=100) {
            //mToolbar.setBackgroundColor(COLOR_ON_SURFACE_INVERSE);
            getActivity().getWindow().setStatusBarColor(COLOR_ON_SURFACE_INVERSE);
        } else {
            //mToolbar.setBackgroundColor(COLOR_TRANSPARENT);
            getActivity().getWindow().setStatusBarColor(COLOR_TRANSPARENT);
        }
    }
}
