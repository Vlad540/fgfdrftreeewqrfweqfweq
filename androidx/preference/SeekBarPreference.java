package androidx.preference;

import android.content.res.TypedArray;

public class SeekBarPreference extends Preference {
    public final int w0;
    public final int x0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SeekBarPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = defpackage.ulb.seekBarPreferenceStyle
            r3.<init>(r4, r5, r0)
            int[] r1 = defpackage.rvb.SeekBarPreference
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r5 = defpackage.rvb.SeekBarPreference_min
            int r5 = r4.getInt(r5, r2)
            int r0 = defpackage.rvb.SeekBarPreference_android_max
            r1 = 100
            int r0 = r4.getInt(r0, r1)
            if (r0 >= r5) goto L_0x001d
            r0 = r5
        L_0x001d:
            int r1 = r3.w0
            if (r0 == r1) goto L_0x0023
            r3.w0 = r0
        L_0x0023:
            int r0 = defpackage.rvb.SeekBarPreference_seekBarIncrement
            int r0 = r4.getInt(r0, r2)
            int r1 = r3.x0
            if (r0 == r1) goto L_0x003a
            int r1 = r3.w0
            int r1 = r1 - r5
            int r5 = java.lang.Math.abs(r0)
            int r5 = java.lang.Math.min(r1, r5)
            r3.x0 = r5
        L_0x003a:
            int r3 = defpackage.rvb.SeekBarPreference_adjustable
            r5 = 1
            r4.getBoolean(r3, r5)
            int r3 = defpackage.rvb.SeekBarPreference_showSeekBarValue
            r4.getBoolean(r3, r2)
            int r3 = defpackage.rvb.SeekBarPreference_updatesContinuously
            r4.getBoolean(r3, r2)
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SeekBarPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final Object c(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }
}
