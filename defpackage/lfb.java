package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lfb  reason: default package */
public final class lfb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lfb(fgb fgb, Continuation continuation) {
        super(2, continuation);
        this.Y = fgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((g5b) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lfb lfb = new lfb(this.Y, continuation);
        lfb.X = obj;
        return lfb;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        g5b g5b = (g5b) this.X;
        fgb fgb = this.Y;
        fgb.R0.setValue(g5b.a);
        fgb.N0.setValue(g5b.b);
        fgb.P0.setValue(g5b.c);
        return jue.a;
    }
}
