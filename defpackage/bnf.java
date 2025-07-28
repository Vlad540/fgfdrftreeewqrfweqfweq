package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: bnf  reason: default package */
public final /* synthetic */ class bnf implements t66 {
    public static final bnf a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [t66, java.lang.Object, bnf] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.delegates.system.WebAppSetupBackButtonRequest", obj, 1);
        wza.k("isVisible", false);
        descriptor = wza;
    }

    public final Object a(b9 b9Var) {
        syc syc = descriptor;
        b9 j = b9Var.j(syc);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int p = j.p(syc);
            if (p == -1) {
                z = false;
            } else if (p == 0) {
                z2 = j.o(syc, 0);
                i = 1;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new dnf(i, z2);
    }

    public final void b(ur3 ur3, Object obj) {
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        b.e(syc, 0, ((dnf) obj).a);
        b.o();
    }

    public final l77[] c() {
        return new l77[]{vo0.a};
    }

    public final syc d() {
        return descriptor;
    }
}
