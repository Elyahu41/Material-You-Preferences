package com.github.tttt55.materialyoupreferences.preferences;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.EditTextPreference;

import com.github.tttt55.materialyoupreferences.R;

public class MaterialEditTextPreference extends EditTextPreference {

    public MaterialEditTextPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutResource(R.layout.material_preference_edittext);
        setPositiveButtonText(android.R.string.yes);
        setNegativeButtonText(android.R.string.cancel);
    }

    public MaterialEditTextPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @Override
    public int getDialogLayoutResource() {
        return R.layout.material_preference_edittext_dialog;
    }
}
