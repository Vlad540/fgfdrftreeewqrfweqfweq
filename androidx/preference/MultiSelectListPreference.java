package androidx.preference;

import android.content.res.TypedArray;
import java.util.HashSet;

public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r3, android.util.AttributeSet r4) {
        /*
            r2 = this;
            int r0 = defpackage.ulb.dialogPreferenceStyle
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.hwf.e(r0, r1, r3)
            r2.<init>(r3, r4, r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            int[] r2 = defpackage.rvb.MultiSelectListPreference
            r1 = 0
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r4, r2, r0, r1)
            int r3 = defpackage.rvb.MultiSelectListPreference_entries
            int r4 = defpackage.rvb.MultiSelectListPreference_android_entries
            java.lang.CharSequence[] r3 = r2.getTextArray(r3)
            if (r3 != 0) goto L_0x0025
            r2.getTextArray(r4)
        L_0x0025:
            int r3 = defpackage.rvb.MultiSelectListPreference_entryValues
            int r4 = defpackage.rvb.MultiSelectListPreference_android_entryValues
            java.lang.CharSequence[] r3 = r2.getTextArray(r3)
            if (r3 != 0) goto L_0x0032
            r2.getTextArray(r4)
        L_0x0032:
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final Object c(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
