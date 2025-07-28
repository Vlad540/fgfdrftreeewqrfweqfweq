package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o78  reason: default package */
public final class o78 extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ xm8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o78(Object obj, Continuation continuation, xm8 xm8) {
        super(2, continuation);
        this.X = obj;
        this.Y = xm8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o78(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        o10 o10 = (o10) this.X;
        if ((o10 != null ? o10.g : null) == null) {
            return null;
        }
        long j = this.Y.a.b;
        f10 f10 = o10.g;
        return new ph8((long) o10.q.hashCode(), j, f10.a, ez3.b0(o10), f10.c, f10.d, f10.b);
    }
}
