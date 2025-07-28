package defpackage;

import kotlinx.serialization.UnknownFieldException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: rff  reason: default package */
public final /* synthetic */ class rff implements t66 {
    public static final rff a;
    private static final syc descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [rff, t66, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        wza wza = new wza("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryAuthResponse", obj, 3);
        wza.k("requestId", false);
        wza.k(ApiProtocol.KEY_TOKEN, false);
        wza.k("status", false);
        descriptor = wza;
    }

    public final Object a(b9 b9Var) {
        syc syc = descriptor;
        b9 j = b9Var.j(syc);
        l77[] l77Arr = tff.d;
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        c2e c2e = null;
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
                c2e = (c2e) j.t(syc, 2, l77Arr[2], c2e);
                i |= 4;
            } else {
                throw new UnknownFieldException(p);
            }
        }
        j.z(syc);
        return new tff(i, str, str2, c2e);
    }

    public final void b(ur3 ur3, Object obj) {
        tff tff = (tff) obj;
        syc syc = descriptor;
        ur3 b = ur3.b(syc);
        b.n(syc, 0, tff.a);
        b.n(syc, 1, tff.b);
        b.k(syc, 2, tff.d[2], tff.c);
        b.o();
    }

    public final l77[] c() {
        l77 l77 = tff.d[2];
        d0e d0e = d0e.a;
        return new l77[]{d0e, d0e, l77};
    }

    public final syc d() {
        return descriptor;
    }
}
