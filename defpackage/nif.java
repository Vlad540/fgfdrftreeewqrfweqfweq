package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: nif  reason: default package */
public final /* synthetic */ class nif implements t66 {
    public static final nif a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [t66, java.lang.Object, nif] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryUnavailableResponse", obj, 2);
        wza.k("requestId", false);
        wza.k("available", false);
        descriptor = wza;
    }

    public final Object a(b9 b9Var) {
        syc syc = descriptor;
        b9 j = b9Var.j(syc);
        String str = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int p = j.p(syc);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                str = j.w(syc, 0);
                i |= 1;
            } else if (p == 1) {
                z2 = j.o(syc, 1);
                i |= 2;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new pif(str, i, z2);
    }

    public final void b(ur3 ur3, Object obj) {
        pif pif = (pif) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        b.n(syc, 0, pif.a);
        b.e(syc, 1, pif.b);
        b.o();
    }

    public final l77[] c() {
        return new l77[]{d0e.a, vo0.a};
    }

    public final syc d() {
        return descriptor;
    }
}
