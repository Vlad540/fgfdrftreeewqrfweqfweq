package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

public class Preference implements Comparable<Preference> {
    public final String X;
    public final Object Y;
    public z1b Z;
    public final Context a;
    public final int b;
    public final CharSequence c;
    public final CharSequence o;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.b = Integer.MAX_VALUE;
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rvb.Preference, i, 0);
        obtainStyledAttributes.getResourceId(rvb.Preference_icon, obtainStyledAttributes.getResourceId(rvb.Preference_android_icon, 0));
        int i2 = rvb.Preference_key;
        int i3 = rvb.Preference_android_key;
        String string = obtainStyledAttributes.getString(i2);
        this.X = string == null ? obtainStyledAttributes.getString(i3) : string;
        int i4 = rvb.Preference_title;
        int i5 = rvb.Preference_android_title;
        CharSequence text = obtainStyledAttributes.getText(i4);
        this.c = text == null ? obtainStyledAttributes.getText(i5) : text;
        int i6 = rvb.Preference_summary;
        int i7 = rvb.Preference_android_summary;
        CharSequence text2 = obtainStyledAttributes.getText(i6);
        this.o = text2 == null ? obtainStyledAttributes.getText(i7) : text2;
        this.b = obtainStyledAttributes.getInt(rvb.Preference_order, obtainStyledAttributes.getInt(rvb.Preference_android_order, Integer.MAX_VALUE));
        int i8 = rvb.Preference_fragment;
        int i9 = rvb.Preference_android_fragment;
        if (obtainStyledAttributes.getString(i8) == null) {
            obtainStyledAttributes.getString(i9);
        }
        obtainStyledAttributes.getResourceId(rvb.Preference_layout, obtainStyledAttributes.getResourceId(rvb.Preference_android_layout, urb.preference));
        obtainStyledAttributes.getResourceId(rvb.Preference_widgetLayout, obtainStyledAttributes.getResourceId(rvb.Preference_android_widgetLayout, 0));
        obtainStyledAttributes.getBoolean(rvb.Preference_enabled, obtainStyledAttributes.getBoolean(rvb.Preference_android_enabled, true));
        boolean z = obtainStyledAttributes.getBoolean(rvb.Preference_selectable, obtainStyledAttributes.getBoolean(rvb.Preference_android_selectable, true));
        obtainStyledAttributes.getBoolean(rvb.Preference_persistent, obtainStyledAttributes.getBoolean(rvb.Preference_android_persistent, true));
        hwf.h(obtainStyledAttributes, rvb.Preference_dependency, rvb.Preference_android_dependency);
        int i10 = rvb.Preference_allowDividerAbove;
        obtainStyledAttributes.getBoolean(i10, obtainStyledAttributes.getBoolean(i10, z));
        int i11 = rvb.Preference_allowDividerBelow;
        obtainStyledAttributes.getBoolean(i11, obtainStyledAttributes.getBoolean(i11, z));
        if (obtainStyledAttributes.hasValue(rvb.Preference_defaultValue)) {
            this.Y = c(obtainStyledAttributes, rvb.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(rvb.Preference_android_defaultValue)) {
            this.Y = c(obtainStyledAttributes, rvb.Preference_android_defaultValue);
        }
        obtainStyledAttributes.getBoolean(rvb.Preference_shouldDisableView, obtainStyledAttributes.getBoolean(rvb.Preference_android_shouldDisableView, true));
        if (obtainStyledAttributes.hasValue(rvb.Preference_singleLineTitle)) {
            obtainStyledAttributes.getBoolean(rvb.Preference_singleLineTitle, obtainStyledAttributes.getBoolean(rvb.Preference_android_singleLineTitle, true));
        }
        obtainStyledAttributes.getBoolean(rvb.Preference_iconSpaceReserved, obtainStyledAttributes.getBoolean(rvb.Preference_android_iconSpaceReserved, false));
        int i12 = rvb.Preference_isPreferenceVisible;
        obtainStyledAttributes.getBoolean(i12, obtainStyledAttributes.getBoolean(i12, true));
        int i13 = rvb.Preference_enableCopying;
        obtainStyledAttributes.getBoolean(i13, obtainStyledAttributes.getBoolean(i13, false));
        obtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        z1b z1b = this.Z;
        return z1b != null ? z1b.k(this) : this.o;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i) {
        return null;
    }

    public final int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = preference.b;
        int i2 = this.b;
        if (i2 != i) {
            return i2 - i;
        }
        CharSequence charSequence = preference.c;
        CharSequence charSequence2 = this.c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            sb.append(a2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hwf.e(ulb.preferenceStyle, 16842894, context));
    }
}
