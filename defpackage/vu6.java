package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vu6  reason: default package */
public final class vu6 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bv6 Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vu6(bv6 bv6, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = bv6;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vu6 vu6 = new vu6(this.Y, this.Z, continuation);
        vu6.X = obj;
        return vu6;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        bv6 bv6 = this.Y;
        qod E = xs7.E(ou3, (hu3) null, (ru3) null, new tu6(bv6, (Continuation) null), 3);
        int i = this.Z;
        E.invokeOnCompletion(new su6(i, 0));
        xs7.E(ou3, (hu3) null, (ru3) null, new uu6(bv6, (Continuation) null), 3).invokeOnCompletion(new su6(i, 1));
        return jue.a;
    }
}
