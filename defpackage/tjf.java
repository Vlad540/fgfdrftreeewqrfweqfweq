package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: tjf  reason: default package */
public final /* synthetic */ class tjf implements t66 {
    public static final tjf a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [tjf, t66, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.delegates.download.WebAppDownloadFileResponse", obj, 2);
        wza.k("requestId", false);
        wza.k("status", false);
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
                str = j.w(syc, 0);
                i |= 1;
            } else if (p == 1) {
                str2 = j.w(syc, 1);
                i |= 2;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new vjf(i, str, str2);
    }

    public final void b(ur3 ur3, Object obj) {
        vjf vjf = (vjf) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        b.n(syc, 0, vjf.a);
        b.n(syc, 1, vjf.b);
        b.o();
    }

    public final l77[] c() {
        d0e d0e = d0e.a;
        return new l77[]{d0e, d0e};
    }

    public final syc d() {
        return descriptor;
    }
}
