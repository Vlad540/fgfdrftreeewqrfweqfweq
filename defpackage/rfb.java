package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rfb  reason: default package */
public final class rfb extends l5e implements i26 {
    public final /* synthetic */ fgb X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfb(fgb fgb, long j, Continuation continuation) {
        super(2, continuation);
        this.X = fgb;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rfb(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        fgb fgb = this.X;
        y8c.a((y8c) fgb.o.getValue(), this.Y);
        taf.o(fgb.F0, xdb.b);
        return jue.a;
    }
}
