package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h70  reason: default package */
public final class h70 {
    public final t97 a;
    public final t97 b;

    public h70(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    public final Object a(String str, int i, Continuation continuation) {
        String str2;
        ((bd) this.a.getValue()).f("ACTION_AUTH_GET_CODE");
        sce sce = (sce) ((yy9) this.b.getValue()).a.getValue();
        dt dtVar = new dt(dfa.AUTH_REQUEST, 8);
        dtVar.s("phone", str);
        if (i == 1) {
            str2 = "START_AUTH";
        } else if (i == 2) {
            str2 = "RESEND";
        } else {
            throw null;
        }
        dtVar.s("type", str2);
        return sce.e(dtVar, continuation);
    }
}
