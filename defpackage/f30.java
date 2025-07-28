package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: f30  reason: default package */
public final class f30 extends l5e implements i26 {
    public final /* synthetic */ h30 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f30(h30 h30, long j, Continuation continuation) {
        super(2, continuation);
        this.X = h30;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new f30(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return ((to8) this.X.Y.getValue()).q(this.Y);
    }
}
