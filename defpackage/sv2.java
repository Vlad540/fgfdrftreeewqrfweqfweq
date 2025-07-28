package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sv2  reason: default package */
public final class sv2 extends l5e implements i26 {
    public final /* synthetic */ aw2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sv2(aw2 aw2, Continuation continuation) {
        super(2, continuation);
        this.X = aw2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sv2(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int i = aw2.Y;
        t52 l = this.X.l();
        l.getClass();
        return (i22) l.e0("create-saved-messages", new e52(l, 0));
    }
}
