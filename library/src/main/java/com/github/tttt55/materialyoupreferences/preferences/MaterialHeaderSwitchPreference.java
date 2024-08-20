package com.github.tttt55.materialyoupreferences.preferences;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.SwitchPreference;

import com.github.tttt55.materialyoupreferences.R;

public class MaterialHeaderSwitchPreference extends SwitchPreference {

    public MaterialHeaderSwitchPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutResource(R.layout.material_preference_header_switch);
    }

    public MaterialHeaderSwitchPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }
}