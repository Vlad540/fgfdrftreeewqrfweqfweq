package androidx.preference;

import android.content.res.TypedArray;

public class EditTextPreference extends DialogPreference {
    /* JADX WARNING: type inference failed for: r5v5, types: [om3, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = defpackage.ulb.editTextPreferenceStyle
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.hwf.e(r0, r1, r4)
            r3.<init>(r4, r5, r0)
            int[] r1 = defpackage.rvb.EditTextPreference
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r5 = defpackage.rvb.EditTextPreference_useSimpleSummaryProvider
            boolean r0 = r4.getBoolean(r5, r2)
            boolean r5 = r4.getBoolean(r5, r0)
            if (r5 == 0) goto L_0x002e
            om3 r5 = om3.Y
            if (r5 != 0) goto L_0x002a
            om3 r5 = new om3
            r5.<init>()
            om3.Y = r5
        L_0x002a:
            om3 r5 = om3.Y
            r3.Z = r5
        L_0x002e:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
