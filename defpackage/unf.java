package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: unf  reason: default package */
public final /* synthetic */ class unf implements t66 {
    public static final unf a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [t66, java.lang.Object, unf] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageGetKeyRequest", obj, 3);
        wza.k("queryId", false);
        wza.k("requestId", false);
        wza.k("key", false);
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
                str3 = j.w(syc, 2);
                i |= 4;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new wnf(str, i, str2, str3);
    }

    public final void b(ur3 ur3, Object obj) {
        wnf wnf = (wnf) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        d0e d0e = d0e.a;
        b.i(syc, 0, wnf.a);
        b.n(syc, 1, wnf.b);
        b.n(syc, 2, wnf.c);
        b.o();
    }

    public final l77[] c() {
        d0e d0e = d0e.a;
        return new l77[]{iu7.x(), d0e, d0e};
    }

    public final syc d() {
        return descriptor;
    }
}
