package com.github.tttt55.materialyoupreferences.preferences;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.ListPreference;

import com.github.tttt55.materialyoupreferences.R;

public class MaterialListPreference extends ListPreference {
    public MaterialListPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutResource(R.layout.material_preference_list);
    }

    public MaterialListPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }
}
