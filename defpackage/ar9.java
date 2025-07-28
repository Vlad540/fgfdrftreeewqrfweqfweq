package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ar9  reason: default package */
public final class ar9 extends l5e implements i26 {
    public final /* synthetic */ cr9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar9(cr9 cr9, Continuation continuation) {
        super(2, continuation);
        this.X = cr9;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ar9(this.X, continuation);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [eze, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = cr9.G0;
        cr9 cr9 = this.X;
        long j = 0;
        if (((kp) cr9.q()).g.getLong("app.notification.dontDisturbUntil", 0) == 0) {
            j = -1;
        }
        ((kp) cr9.q()).k("app.notification.dontDisturbUntil", Long.valueOf(j));
        ? obj2 = new Object();
        obj2.b = new Long(j);
        ((pk) cr9.o.getValue()).a(new gze(obj2));
        grd grd = cr9.B0;
        grd.m((Object) null, new Integer(((Number) grd.getValue()).intValue() + 1));
        return jue.a;
    }
}
