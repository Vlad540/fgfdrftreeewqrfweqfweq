package defpackage;

import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e64  reason: default package */
public final class e64 {
    public final lj7 a;
    public final j8e b;
    public final int[] c;
    public final int d;
    public final qz3 e;
    public final long f;
    public final int g;
    public final wya h;
    public final a64[] i;
    public g55 j;
    public ey3 k;
    public int l;
    public BehindLiveWindowException m;
    public boolean n;

    public e64(a84 a84, lj7 lj7, ey3 ey3, j8e j8e, int i2, int[] iArr, g55 g55, int i3, qz3 qz3, long j2, int i4, boolean z, ArrayList arrayList, wya wya) {
        ey3 ey32 = ey3;
        j8e j8e2 = j8e;
        int i5 = i2;
        g55 g552 = g55;
        this.a = lj7;
        this.k = ey32;
        this.b = j8e2;
        this.c = iArr;
        this.j = g552;
        this.d = i3;
        this.e = qz3;
        this.l = i5;
        this.f = j2;
        this.g = i4;
        this.h = wya;
        long d2 = ey32.d(i5);
        ArrayList a2 = a();
        this.i = new a64[g55.length()];
        int i6 = 0;
        while (i6 < this.i.length) {
            kac kac = (kac) a2.get(g552.f(i6));
            hj0 C = j8e2.C(kac.b);
            int i7 = i6;
            this.i[i7] = new a64(d2, kac, C == null ? (hj0) kac.b.get(0) : C, a84.b(i3, kac.a, z, arrayList, wya), 0, kac.c(), 1);
            i6 = i7 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i2 : this.c) {
            arrayList.addAll(((y8) list.get(i2)).c);
        }
        return arrayList;
    }

    public final a64 b(int i2) {
        a64[] a64Arr = this.i;
        a64 a64 = a64Arr[i2];
        hj0 C = this.b.C(((kac) a64.e).b);
        if (C == null || C.equals((hj0) a64.f)) {
            return a64;
        }
        a64 a642 = new a64(a64.b, (kac) a64.e, C, (ay2) a64.d, a64.c, (wy3) a64.g, 1);
        a64Arr[i2] = a642;
        return a642;
    }

    public final void c(g55 g55) {
        this.j = g55;
    }
}
