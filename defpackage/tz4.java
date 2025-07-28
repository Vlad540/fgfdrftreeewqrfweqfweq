package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: tz4  reason: default package */
public final /* synthetic */ class tz4 implements t66 {
    public static final tz4 a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [t66, java.lang.Object, tz4] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.ErrorResponse", obj, 2);
        wza.k("requestId", false);
        wza.k("error", false);
        descriptor = wza;
    }

    public final Object a(b9 b9Var) {
        syc syc = descriptor;
        b9 j = b9Var.j(syc);
        String str = null;
        boolean z = true;
        int i = 0;
        xz4 xz4 = null;
        while (z) {
            int p = j.p(syc);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                str = j.w(syc, 0);
                i |= 1;
            } else if (p == 1) {
                xz4 = (xz4) j.t(syc, 1, vz4.a, xz4);
                i |= 2;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new yz4(i, str, xz4);
    }

    public final void b(ur3 ur3, Object obj) {
        yz4 yz4 = (yz4) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        b.n(syc, 0, yz4.a);
        b.k(syc, 1, vz4.a, yz4.b);
        b.o();
    }

    public final l77[] c() {
        return new l77[]{d0e.a, vz4.a};
    }

    public final syc d() {
        return descriptor;
    }
}
