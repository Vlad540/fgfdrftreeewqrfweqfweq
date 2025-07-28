package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dg0  reason: default package */
public final class dg0 extends l5e implements i26 {
    public final /* synthetic */ sf0 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dg0(sf0 sf0, Continuation continuation) {
        super(2, continuation);
        this.X = sf0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dg0) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dg0(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return Boolean.valueOf(!((Boolean) this.X.c().invoke()).booleanValue());
    }
}
