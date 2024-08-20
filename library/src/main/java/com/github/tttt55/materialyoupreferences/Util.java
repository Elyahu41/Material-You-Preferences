package com.github.tttt55.materialyoupreferences;

import android.content.Context;
import android.content.res.TypedArray;

public class Util {

    private Util(){}

    public static int resolveColorAttr(Context context, int attr) {
        int color = 0;
        TypedArray attrArr = context.obtainStyledAttributes(new int[]{attr});
        color = attrArr.getColor(0, 0);
        attrArr.recycle();
        return color;
    }
}
