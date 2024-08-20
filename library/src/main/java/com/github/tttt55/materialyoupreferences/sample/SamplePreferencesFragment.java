package com.github.tttt55.materialyoupreferences.sample;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.github.tttt55.materialyoupreferences.MaterialPreferencesFragment;

import com.github.tttt55.materialyoupreferences.R;

public class SamplePreferencesFragment extends MaterialPreferencesFragment {
    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        setPreferencesFromResource(R.xml.sample_preferences, rootKey);
    }
}
