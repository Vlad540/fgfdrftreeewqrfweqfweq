package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uta  reason: default package */
public final class uta extends l5e implements i26 {
    public final /* synthetic */ wta X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uta(wta wta, String str, Continuation continuation) {
        super(2, continuation);
        this.X = wta;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((uta) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uta(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ((mc9) this.X.c.g.getValue()).setValue(this.Y);
        return jue.a;
    }
}
