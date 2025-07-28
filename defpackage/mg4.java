package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mg4  reason: default package */
public final class mg4 extends l5e implements i26 {
    public final /* synthetic */ ng4 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mg4(ng4 ng4, Continuation continuation) {
        super(2, continuation);
        this.X = ng4;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mg4(this.X, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [eze, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = ng4.w0;
        ng4 ng4 = this.X;
        int i = ((qpc) ((ip) ng4.c.getValue())).o() == 1 ? 0 : 1;
        String str = i != 1 ? i != 2 ? "ON" : "REPLY" : "OFF";
        qpc qpc = (qpc) ((ip) ng4.c.getValue());
        qpc.j(i, "app.notification.dialogs.show");
        qpc.j.c(Integer.valueOf(i));
        ? obj2 = new Object();
        obj2.c = str;
        ((pk) ng4.b.getValue()).a(new gze(obj2));
        ng4.X.setValue(ng4.q());
        return jue.a;
    }
}
