package defpackage;

import android.util.SparseIntArray;

/* renamed from: l54  reason: default package */
public abstract class l54 {
    public static final SparseIntArray a = new SparseIntArray(0);

    public static final h0b a() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new h0b(0, min > 16777216 ? (min / 4) * 3 : min / 2, a, -1);
    }
}
