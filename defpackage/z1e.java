package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: z1e  reason: default package */
public final /* synthetic */ class z1e implements t66 {
    public static final z1e a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [t66, java.lang.Object, z1e] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.SuccessResponse", obj, 2);
        wza.k("status", false);
        wza.k("requestId", true);
        descriptor = wza;
    }

    public final Object a(b9 b9Var) {
        syc syc = descriptor;
        b9 j = b9Var.j(syc);
        l77[] l77Arr = d2e.c;
        c2e c2e = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int p = j.p(syc);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                c2e = (c2e) j.t(syc, 0, l77Arr[0], c2e);
                i |= 1;
            } else if (p == 1) {
                d0e d0e = d0e.a;
                str = (String) j.s(syc, 1, str);
                i |= 2;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new d2e(i, c2e, str);
    }

    public final void b(ur3 ur3, Object obj) {
        d2e d2e = (d2e) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        b.k(syc, 0, d2e.c[0], d2e.a);
        boolean w = b.w();
        String str = d2e.b;
        if (w || str != null) {
            d0e d0e = d0e.a;
            b.i(syc, 1, str);
        }
        b.o();
    }

    public final l77[] c() {
        l77 l77 = d2e.c[0];
        d0e d0e = d0e.a;
        return new l77[]{l77, iu7.x()};
    }

    public final syc d() {
        return descriptor;
    }
}
