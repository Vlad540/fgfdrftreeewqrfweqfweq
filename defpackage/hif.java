package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: hif  reason: default package */
public final /* synthetic */ class hif implements t66 {
    public static final hif a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [hif, t66, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryOpenSettingsRequest", obj, 2);
        wza.k("queryId", false);
        wza.k("requestId", false);
        descriptor = wza;
    }

    public final Object a(b9 b9Var) {
        syc syc = descriptor;
        b9 j = b9Var.j(syc);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
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
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new jif(i, str, str2);
    }

    public final void b(ur3 ur3, Object obj) {
        jif jif = (jif) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        d0e d0e = d0e.a;
        b.i(syc, 0, jif.a);
        b.n(syc, 1, jif.b);
        b.o();
    }

    public final l77[] c() {
        return new l77[]{iu7.x(), d0e.a};
    }

    public final syc d() {
        return descriptor;
    }
}
