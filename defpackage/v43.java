package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v43  reason: default package */
public final class v43 extends l5e implements i26 {
    public final /* synthetic */ a53 X;
    public final /* synthetic */ m43 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v43(a53 a53, m43 m43, Continuation continuation) {
        super(2, continuation);
        this.X = a53;
        this.Y = m43;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new v43(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = a53.m;
        return ((aw2) ((bv2) this.X.f.getValue())).m(((k43) this.Y).a).a.getValue();
    }
}
