package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: vz4  reason: default package */
public final /* synthetic */ class vz4 implements t66 {
    public static final vz4 a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [vz4, t66, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.ErrorResponse.Error", obj, 1);
        wza.k("code", false);
        descriptor = wza;
    }

    public final Object a(b9 b9Var) {
        syc syc = descriptor;
        b9 j = b9Var.j(syc);
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int p = j.p(syc);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                str = j.w(syc, 0);
                i = 1;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new xz4(i, str);
    }

    public final void b(ur3 ur3, Object obj) {
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        b.n(syc, 0, ((xz4) obj).a);
        b.o();
    }

    public final l77[] c() {
        return new l77[]{d0e.a};
    }

    public final syc d() {
        return descriptor;
    }
}
