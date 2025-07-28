package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* renamed from: kp2  reason: default package */
public final class kp2 {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public kp2(t97 t97, t97 t972, t97 t973) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
    }

    public final void a(long j, long j2, Continuation continuation) {
        ((bd) this.a.getValue()).f("ACTION_MSG_UNPIN");
        gy9 gy9 = (gy9) ((pk) this.b.getValue());
        if (gy9.o(j)) {
            mp2 mp2 = r1;
            mp2 mp22 = new mp2(((j2b) gy9.z()).a.n(), j, j2, 0, (String) null, false, (String) null, (HashMap) null, (String) null, (String) null, (d10) null, -1L, false, 0);
            gy9.w(gy9, mp2);
        }
        t52 l = ((aw2) ((bv2) this.c.getValue())).l();
        Long l2 = new Long(j);
        l.getClass();
        l.c(l2.longValue(), z52.o);
        l.h(l2.longValue(), false, new ak0(18));
    }
}
