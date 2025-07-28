package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d64  reason: default package */
public final class d64 {
    public final kj7 a;
    public final b0d b;
    public final int[] c;
    public final int d;
    public final oz3 e;
    public final long f;
    public final vya g;
    public final a64[] h;
    public f55 i;
    public dy3 j;
    public int k;
    public BehindLiveWindowException l;
    public boolean m;

    public d64(kj7 kj7, dy3 dy3, b0d b0d, int i2, int[] iArr, f55 f55, int i3, oz3 oz3, long j2, boolean z, ArrayList arrayList, vya vya) {
        d75 d75;
        dy3 dy32 = dy3;
        b0d b0d2 = b0d;
        int i4 = i2;
        f55 f552 = f55;
        int i5 = i3;
        vya vya2 = vya;
        this.a = kj7;
        this.j = dy32;
        this.b = b0d2;
        this.c = iArr;
        this.i = f552;
        this.d = i5;
        this.e = oz3;
        this.k = i4;
        this.f = j2;
        this.g = vya2;
        long d2 = dy32.d(i4);
        ArrayList a2 = a();
        this.h = new a64[f55.length()];
        int i6 = 0;
        while (i6 < this.h.length) {
            jac jac = (jac) a2.get(f552.f(i6));
            gj0 A = b0d2.A(jac.b);
            a64[] a64Arr = this.h;
            gj0 gj0 = A == null ? (gj0) jac.b.get(0) : A;
            vu5 vu5 = jac.a;
            String str = vu5.z0;
            pt0 pt0 = null;
            if (b49.i(str)) {
                if ("application/x-rawcc".equals(str)) {
                    d75 = new eyb(vu5);
                    ArrayList arrayList2 = arrayList;
                } else {
                    ArrayList arrayList3 = arrayList;
                    int i7 = i6;
                    a64Arr[i7] = new a64(d2, jac, gj0, pt0, 0, jac.c(), 0);
                    i6 = i7 + 1;
                }
            } else if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                ArrayList arrayList4 = arrayList;
                d75 = new xw7(1);
            } else {
                d75 = new my5(z ? 4 : 0, (bke) null, arrayList, vya2);
            }
            pt0 = new pt0(d75, i5, vu5);
            int i72 = i6;
            a64Arr[i72] = new a64(d2, jac, gj0, pt0, 0, jac.c(), 0);
            i6 = i72 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i2 : this.c) {
            arrayList.addAll(((x8) list.get(i2)).c);
        }
        return arrayList;
    }

    public final a64 b(int i2) {
        a64[] a64Arr = this.h;
        a64 a64 = a64Arr[i2];
        gj0 A = this.b.A(((jac) a64.e).b);
        if (A == null || A.equals((gj0) a64.f)) {
            return a64;
        }
        a64 a642 = new a64(a64.b, (jac) a64.e, A, (pt0) a64.d, a64.c, (vy3) a64.g, 0);
        a64Arr[i2] = a642;
        return a642;
    }
}
