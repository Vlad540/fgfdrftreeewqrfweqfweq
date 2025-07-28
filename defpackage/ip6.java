package defpackage;

import android.util.Size;

/* renamed from: ip6  reason: default package */
public final class ip6 {
    public static final np6 a;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, jbc] */
    static {
        Size size = new Size(640, 480);
        zq4 zq4 = zq4.d;
        ii5 ii5 = ii5.c;
        Size size2 = hjd.c;
        ? obj = new Object();
        obj.a = size2;
        obj.b = 1;
        ibc ibc = new ibc(ii5, obj, 0);
        hp6 hp6 = new hp6(0);
        z80 z80 = br6.G;
        fc9 fc9 = hp6.b;
        fc9.j(z80, size);
        fc9.j(pye.o0, 1);
        fc9.j(br6.B, 0);
        fc9.j(br6.J, ibc);
        if (zq4.equals(zq4)) {
            fc9.j(qq6.A, zq4);
            a = new np6(hga.a(fc9));
            return;
        }
        throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
    }
}
