package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ntd  reason: default package */
public final class ntd extends l5e implements i26 {
    public final /* synthetic */ ttd X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ntd(ttd ttd, Continuation continuation) {
        super(2, continuation);
        this.X = ttd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ntd(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        i22 i22 = (i22) ((aw2) ((bv2) this.X.w0.getValue())).m(this.X.b).a.getValue();
        jue jue = jue.a;
        if (i22 == null) {
            return jue;
        }
        grd grd = this.X.D0;
        i22.h0();
        grd.setValue(i22.y0);
        return jue;
    }
}
