package defpackage;

import android.util.SparseIntArray;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: f0b  reason: default package */
public final class f0b {
    public final h0b a = l54.a();
    public final mk9 b = mk9.j();
    public final h0b c;
    public final lk9 d;
    public final h0b e;
    public final mk9 f;
    public final h0b g;
    public final mk9 h;
    public final String i;
    public final int j;

    public f0b(otf otf) {
        n06.s();
        otf.getClass();
        int i2 = v74.a;
        int i3 = i2 * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i4 = 131072; i4 <= 4194304; i4 *= 2) {
            sparseIntArray.put(i4, i2);
        }
        this.c = new h0b(4194304, i3, sparseIntArray, v74.a);
        this.d = lk9.g();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i5 = min < 16777216 ? 3145728 : min < 33554432 ? 6291456 : 12582912;
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.e = new h0b(i5, min2 < 16777216 ? min2 / 2 : (min2 / 4) * 3, sparseIntArray2, -1);
        this.f = mk9.j();
        h0b h0b = (h0b) otf.a;
        if (h0b == null) {
            SparseIntArray sparseIntArray3 = new SparseIntArray();
            sparseIntArray3.put(16384, 5);
            h0b = new h0b(81920, 1048576, sparseIntArray3, -1);
        }
        this.g = h0b;
        this.h = mk9.j();
        String str = (String) otf.b;
        this.i = str == null ? "legacy" : str;
        this.j = 4194304;
        n06.s();
    }
}
