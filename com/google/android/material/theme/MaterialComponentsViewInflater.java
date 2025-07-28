package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;

public class MaterialComponentsViewInflater extends to {
    public final jm a(Context context, AttributeSet attributeSet) {
        return new qv7(context, attributeSet);
    }

    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new gw7(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [nn, android.widget.CompoundButton, android.view.View, jw7] */
    public final nn d(Context context, AttributeSet attributeSet) {
        int i = wlb.radioButtonStyle;
        int i2 = jw7.y0;
        ? nnVar = new nn(tw7.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = nnVar.getContext();
        TypedArray d = she.d(context2, attributeSet, xvb.MaterialRadioButton, i, i2, new int[0]);
        if (d.hasValue(xvb.MaterialRadioButton_buttonTint)) {
            l93.c(nnVar, wx3.i(context2, d, xvb.MaterialRadioButton_buttonTint));
        }
        nnVar.x0 = d.getBoolean(xvb.MaterialRadioButton_useMaterialThemeColors, false);
        d.recycle();
        return nnVar;
    }

    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(tw7.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = appCompatTextView.getContext();
        if (bm3.E(wlb.textAppearanceLineHeightEnabled, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, xvb.MaterialTextView, 16842884, 0);
            int[] iArr = {xvb.MaterialTextView_android_lineHeight, xvb.MaterialTextView_lineHeight};
            int i = -1;
            for (int i2 = 0; i2 < 2 && i < 0; i2++) {
                i = wx3.j(context2, obtainStyledAttributes, iArr[i2], -1);
            }
            obtainStyledAttributes.recycle();
            if (i == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, xvb.MaterialTextView, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(xvb.MaterialTextView_android_textAppearance, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, xvb.MaterialTextAppearance);
                    Context context3 = appCompatTextView.getContext();
                    int[] iArr2 = {xvb.MaterialTextAppearance_android_lineHeight, xvb.MaterialTextAppearance_lineHeight};
                    int i3 = -1;
                    for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {
                        i3 = wx3.j(context3, obtainStyledAttributes3, iArr2[i4], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i3 >= 0) {
                        appCompatTextView.setLineHeight(i3);
                    }
                }
            }
        }
        return appCompatTextView;
    }
}
