package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: y8c  reason: default package */
public final class y8c {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public y8c(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
    }

    public static void a(y8c y8c, long j) {
        i22 i22;
        t52 t52 = (t52) y8c.a.getValue();
        t52.getClass();
        udd.q("t52", "removeChatInternal, chatId = " + j);
        i22 B = t52.B(j);
        i22 i222 = null;
        if (B == null) {
            i22 = null;
        } else {
            o62 o62 = B.b;
            long j2 = o62.a;
            ((eha) t52.v.get()).getClass();
            eha.a(j2);
            m62 m62 = (B.G() || !B.Q()) ? m62.X : m62.c;
            ((luf) t52.w.get()).a(new i0d(j, o62.k, true));
            i22 = t52.h(j, false, new j9(t52, 16, m62));
        }
        if (i22 != null) {
            t52.m.c(new mw2(Collections.singletonList(Long.valueOf(j)), true));
            List singletonList = Collections.singletonList(Long.valueOf(j));
            s52 s52 = t52.G;
            if (s52 != null) {
                s52.b(singletonList);
            }
            t97 t97 = t52.C;
            if (t97.getValue() != null) {
                long j3 = i22.b.a;
                b92 b92 = (b92) ((v72) t97.getValue());
                b92.getClass();
                xs7.E(b92.Z, (hu3) null, (ru3) null, new o82(b92, j3, (Continuation) null), 3);
            }
            i222 = i22;
        }
        if (i222 != null) {
            ((mm9) y8c.d.getValue()).getClass();
            mm9.a(i222, (p7a) y8c.c.getValue());
        }
    }
}
