package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sq  reason: default package */
public final class sq extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ c32 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sq(c32 c32, Continuation continuation) {
        super(2, continuation);
        this.Y = c32;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((sq) n((sj2) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sq sqVar = new sq(this.Y, continuation);
        sqVar.X = obj;
        return sqVar;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.a((sj2) this.X);
        return jue.a;
    }
}
