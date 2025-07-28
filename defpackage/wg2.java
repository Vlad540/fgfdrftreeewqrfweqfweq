package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wg2  reason: default package */
public final class wg2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ah2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wg2(ah2 ah2, Continuation continuation) {
        super(2, continuation);
        this.Y = ah2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((wg2) n((s78) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wg2 wg2 = new wg2(this.Y, continuation);
        wg2.X = obj;
        return wg2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.M0.updateAndGet(new zx0(6, (s78) this.X));
        return jue.a;
    }
}
