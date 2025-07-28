package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: off  reason: default package */
public final /* synthetic */ class off implements t66 {
    public static final off a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [t66, java.lang.Object, off] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryAuthRequest", obj, 3);
        wza.k("queryId", false);
        wza.k("requestId", false);
        wza.k("reason", false);
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
                str2 = j.w(syc, 1);
                i |= 2;
            } else if (p == 2) {
                d0e d0e2 = d0e.a;
                str3 = (String) j.s(syc, 2, str3);
                i |= 4;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new qff(str, i, str2, str3);
    }

    public final void b(ur3 ur3, Object obj) {
        qff qff = (qff) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        d0e d0e = d0e.a;
        b.i(syc, 0, qff.a);
        b.n(syc, 1, qff.b);
        b.i(syc, 2, qff.c);
        b.o();
    }

    public final l77[] c() {
        return new l77[]{iu7.x(), d0e.a, iu7.x()};
    }

    public final syc d() {
        return descriptor;
    }
}
