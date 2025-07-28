package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l6e  reason: default package */
public final class l6e extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n6e Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l6e(n6e n6e, Continuation continuation) {
        super(2, continuation);
        this.Y = n6e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ys8) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l6e l6e = new l6e(this.Y, continuation);
        l6e.X = obj;
        return l6e;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ys8 ys8 = (ys8) this.X;
        return ys8.d == 2 ? am7.c(((gt3) this.Y.d.getValue()).a(ys8)) : new tj5(3, ys8);
    }
}
