package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;

public abstract class PreferenceGroup extends Preference {
    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Handler(Looper.getMainLooper());
        new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rvb.PreferenceGroup, i, 0);
        int i2 = rvb.PreferenceGroup_orderingFromXml;
        obtainStyledAttributes.getBoolean(i2, obtainStyledAttributes.getBoolean(i2, true));
        if (obtainStyledAttributes.hasValue(rvb.PreferenceGroup_initialExpandedChildrenCount)) {
            int i3 = rvb.PreferenceGroup_initialExpandedChildrenCount;
            if (obtainStyledAttributes.getInt(i3, obtainStyledAttributes.getInt(i3, Integer.MAX_VALUE)) != Integer.MAX_VALUE) {
                TextUtils.isEmpty(this.X);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
