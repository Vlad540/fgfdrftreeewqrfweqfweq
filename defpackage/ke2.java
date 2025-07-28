package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ke2  reason: default package */
public final class ke2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gf2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ke2(gf2 gf2, Continuation continuation) {
        super(2, continuation);
        this.Y = gf2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((s78) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ke2 ke2 = new ke2(this.Y, continuation);
        ke2.X = obj;
        return ke2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.F0.updateAndGet(new zx0(6, (s78) this.X));
        return jue.a;
    }
}
