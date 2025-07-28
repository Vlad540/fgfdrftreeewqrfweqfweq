package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: iga  reason: default package */
public final class iga extends lzd {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean g(yze yze, byte[] bArr) {
        if (yze.c() < bArr.length) {
            return false;
        }
        int i = yze.b;
        byte[] bArr2 = new byte[bArr.length];
        yze.g(0, bArr2, bArr.length);
        yze.H(i);
        return Arrays.equals(bArr2, bArr);
    }

    public final long c(yze yze) {
        byte b;
        byte[] bArr = yze.a;
        byte b2 = bArr[0];
        byte b3 = b2 & 255;
        byte b4 = b2 & 3;
        if (b4 != 0) {
            b = 2;
            if (!(b4 == 1 || b4 == 2)) {
                b = bArr[1] & 63;
            }
        } else {
            b = 1;
        }
        int i = b3 >> 3;
        int i2 = i & 3;
        return (((long) this.f) * (((long) b) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i & 1) : i2 == 3 ? 60000 : 10000 << i2)))) / 1000000;
    }

    public final boolean e(yze yze, long j, v2b v2b) {
        boolean z = false;
        if (g(yze, o)) {
            byte[] copyOf = Arrays.copyOf(yze.a, yze.c);
            byte b = copyOf[9] & 255;
            ArrayList g = xie.g(copyOf);
            if (((vu5) v2b.b) == null) {
                z = true;
            }
            swb.h(z);
            tu5 tu5 = new tu5();
            tu5.k = "audio/opus";
            tu5.x = b;
            tu5.y = 48000;
            tu5.m = g;
            v2b.b = new vu5(tu5);
            return true;
        } else if (g(yze, p)) {
            swb.i((vu5) v2b.b);
            yze.I(8);
            y29 z2 = r1g.z(ws6.k((String[]) r1g.C(yze, false, false).a));
            if (z2 == null) {
                return true;
            }
            tu5 a = ((vu5) v2b.b).a();
            y29 y29 = ((vu5) v2b.b).y0;
            if (y29 != null) {
                w29[] w29Arr = y29.a;
                if (w29Arr.length != 0) {
                    int i = mze.a;
                    w29[] w29Arr2 = z2.a;
                    Object[] copyOf2 = Arrays.copyOf(w29Arr2, w29Arr2.length + w29Arr.length);
                    System.arraycopy(w29Arr, 0, copyOf2, w29Arr2.length, w29Arr.length);
                    z2 = new y29((w29[]) copyOf2);
                }
            }
            a.i = z2;
            v2b.b = new vu5(a);
            return true;
        } else {
            swb.i((vu5) v2b.b);
            return false;
        }
    }
}
