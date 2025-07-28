package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vt2  reason: default package */
public final class vt2 extends l5e implements i26 {
    public final /* synthetic */ fu2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vt2(fu2 fu2, Continuation continuation) {
        super(2, continuation);
        this.X = fu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((vt2) n((rj5) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vt2(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.X.b.b();
        return jue.a;
    }
}
