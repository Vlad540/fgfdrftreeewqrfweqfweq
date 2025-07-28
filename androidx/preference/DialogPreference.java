package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public abstract class DialogPreference extends Preference {
    public final Drawable w0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rvb.DialogPreference, i, 0);
        hwf.h(obtainStyledAttributes, rvb.DialogPreference_dialogTitle, rvb.DialogPreference_android_dialogTitle);
        hwf.h(obtainStyledAttributes, rvb.DialogPreference_dialogMessage, rvb.DialogPreference_android_dialogMessage);
        int i2 = rvb.DialogPreference_dialogIcon;
        int i3 = rvb.DialogPreference_android_dialogIcon;
        Drawable drawable = obtainStyledAttributes.getDrawable(i2);
        this.w0 = drawable == null ? obtainStyledAttributes.getDrawable(i3) : drawable;
        hwf.h(obtainStyledAttributes, rvb.DialogPreference_positiveButtonText, rvb.DialogPreference_android_positiveButtonText);
        hwf.h(obtainStyledAttributes, rvb.DialogPreference_negativeButtonText, rvb.DialogPreference_android_negativeButtonText);
        obtainStyledAttributes.getResourceId(rvb.DialogPreference_dialogLayout, obtainStyledAttributes.getResourceId(rvb.DialogPreference_android_dialogLayout, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hwf.e(ulb.dialogPreferenceStyle, 16842897, context));
    }
}
