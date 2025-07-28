package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dj3  reason: default package */
public final class dj3 extends l5e implements i26 {
    public final /* synthetic */ hj3 X;
    public final /* synthetic */ fze Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dj3(hj3 hj3, fze fze, Continuation continuation) {
        super(2, continuation);
        this.X = hj3;
        this.Y = fze;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dj3(this.X, this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [eze, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        ? obj2 = new Object();
        obj2.q = this.Y;
        return new Long(((pk) this.X.z.getValue()).a(new gze(obj2)));
    }
}
