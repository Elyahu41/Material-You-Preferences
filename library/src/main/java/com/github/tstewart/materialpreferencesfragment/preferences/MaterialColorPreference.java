package com.github.tstewart.materialpreferencesfragment.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

import com.github.tstewart.materialpreferencesfragment.R;

public class MaterialColorPreference extends Preference {

    private static final int DEFAULT_COLOR = 0xFF000000; // Default color (black)

    public MaterialColorPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutResource(R.layout.material_color_preference);
    }

    public MaterialColorPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public void setColor(int color) {
        // Save the color in shared preferences
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(getKey(), color);
        editor.apply();

        // Update the view immediately if it's already bound
        notifyChanged();
    }

    public int getColor() {
        // Retrieve the color from shared preferences
        return getSharedPreferences().getInt(getKey(), DEFAULT_COLOR);
    }

    @Override
    public void onBindViewHolder(@NonNull PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);

        View colorIndicator = holder.findViewById(R.id.color_indicator);
        if (colorIndicator != null) {
            colorIndicator.setBackgroundColor(getColor());
        }
    }

    @Override
    protected void onSetInitialValue(@Nullable Object defaultValue) {
        defaultValue = getPersistedInt(getColor());
    }
}


