package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tga  reason: default package */
public final class tga extends l5e implements i26 {
    public final /* synthetic */ uga X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tga(uga uga, Continuation continuation) {
        super(2, continuation);
        this.X = uga;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tga(this.X, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [eze, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = uga.w0;
        uga uga = this.X;
        boolean z = !((kp) ((ip) uga.c.getValue())).g.getBoolean("app.notification.show.new.users", true);
        ((kp) ((ip) uga.c.getValue())).i("app.notification.show.new.users", z);
        ? obj2 = new Object();
        obj2.a = Boolean.valueOf(z);
        ((pk) uga.b.getValue()).a(new gze(obj2));
        uga.X.setValue(uga.q());
        return jue.a;
    }
}
