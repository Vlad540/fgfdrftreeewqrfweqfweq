package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import me.leolin.shortcutbadger.BuildConfig;

public class ListPreference extends DialogPreference {
    public final CharSequence[] x0;
    public final String y0;

    /* JADX WARNING: type inference failed for: r2v9, types: [s59, java.lang.Object] */
    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rvb.ListPreference, i, 0);
        int i2 = rvb.ListPreference_entries;
        int i3 = rvb.ListPreference_android_entries;
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(i2);
        this.x0 = textArray == null ? obtainStyledAttributes.getTextArray(i3) : textArray;
        int i4 = rvb.ListPreference_entryValues;
        int i5 = rvb.ListPreference_android_entryValues;
        if (obtainStyledAttributes.getTextArray(i4) == null) {
            obtainStyledAttributes.getTextArray(i5);
        }
        int i6 = rvb.ListPreference_useSimpleSummaryProvider;
        if (obtainStyledAttributes.getBoolean(i6, obtainStyledAttributes.getBoolean(i6, false))) {
            if (s59.Y == null) {
                s59.Y = new Object();
            }
            this.Z = s59.Y;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, rvb.Preference, i, 0);
        this.y0 = hwf.h(obtainStyledAttributes2, rvb.Preference_summary, rvb.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    public final CharSequence a() {
        z1b z1b = this.Z;
        if (z1b != null) {
            return z1b.k(this);
        }
        Object d = d();
        CharSequence a = super.a();
        String str = this.y0;
        if (str == null) {
            return a;
        }
        if (d == null) {
            d = BuildConfig.FLAVOR;
        }
        String format = String.format(str, new Object[]{d});
        return TextUtils.equals(format, a) ? a : format;
    }

    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final CharSequence d() {
        return null;
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hwf.e(ulb.dialogPreferenceStyle, 16842897, context));
    }
}
