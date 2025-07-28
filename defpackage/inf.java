package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: inf  reason: default package */
public final /* synthetic */ class inf implements t66 {
    public static final inf a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [inf, t66, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.WebAppShareRequest", obj, 3);
        wza.k("url", true);
        wza.k("title", true);
        wza.k("text", true);
        descriptor = wza;
    }

    public final Object a(b9 b9Var) {
        syc syc = descriptor;
        b9 j = b9Var.j(syc);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int p = j.p(syc);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                d0e d0e = d0e.a;
                str = (String) j.s(syc, 0, str);
                i |= 1;
            } else if (p == 1) {
                d0e d0e2 = d0e.a;
                str2 = (String) j.s(syc, 1, str2);
                i |= 2;
            } else if (p == 2) {
                d0e d0e3 = d0e.a;
                str3 = (String) j.s(syc, 2, str3);
                i |= 4;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new knf(str, i, str2, str3);
    }

    public final void b(ur3 ur3, Object obj) {
        knf knf = (knf) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        boolean w = b.w();
        String str = knf.a;
        if (w || str != null) {
            d0e d0e = d0e.a;
            b.i(syc, 0, str);
        }
        boolean w2 = b.w();
        String str2 = knf.b;
        if (w2 || str2 != null) {
            d0e d0e2 = d0e.a;
            b.i(syc, 1, str2);
        }
        boolean w3 = b.w();
        String str3 = knf.c;
        if (w3 || str3 != null) {
            d0e d0e3 = d0e.a;
            b.i(syc, 2, str3);
        }
        b.o();
    }

    public final l77[] c() {
        d0e d0e = d0e.a;
        return new l77[]{iu7.x(), iu7.x(), iu7.x()};
    }

    public final syc d() {
        return descriptor;
    }
}
