package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: az0  reason: default package */
public final class az0 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bz0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public az0(bz0 bz0, Continuation continuation) {
        super(2, continuation);
        this.Y = bz0;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((az0) n((ea) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        az0 az0 = new az0(this.Y, continuation);
        az0.X = obj;
        return az0;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.r((ea) this.X);
        return jue.a;
    }
}
