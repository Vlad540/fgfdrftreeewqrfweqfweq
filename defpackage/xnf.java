package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: xnf  reason: default package */
public final /* synthetic */ class xnf implements t66 {
    public static final xnf a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [xnf, t66, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageGetKeyResponse", obj, 3);
        wza.k("requestId", false);
        wza.k("key", false);
        wza.k("value", false);
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
                str = j.w(syc, 0);
                i |= 1;
            } else if (p == 1) {
                str2 = j.w(syc, 1);
                i |= 2;
            } else if (p == 2) {
                str3 = j.w(syc, 2);
                i |= 4;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new znf(str, i, str2, str3);
    }

    public final void b(ur3 ur3, Object obj) {
        znf znf = (znf) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        b.n(syc, 0, znf.a);
        b.n(syc, 1, znf.b);
        b.n(syc, 2, znf.c);
        b.o();
    }

    public final l77[] c() {
        d0e d0e = d0e.a;
        return new l77[]{d0e, d0e, d0e};
    }

    public final syc d() {
        return descriptor;
    }
}
