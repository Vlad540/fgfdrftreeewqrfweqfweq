package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n08  reason: default package */
public final class n08 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lt1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n08(Continuation continuation, lt1 lt1) {
        super(2, continuation);
        this.Y = lt1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((n08) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n08 n08 = new n08(continuation, this.Y);
        n08.X = obj;
        return n08;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.setVisibility(((Boolean) this.X).booleanValue() ? 0 : 8);
        return jue.a;
    }
}
