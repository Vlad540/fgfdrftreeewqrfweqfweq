package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hi1  reason: default package */
public final class hi1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ aj1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hi1(aj1 aj1, Continuation continuation) {
        super(2, continuation);
        this.Y = aj1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((hi1) n((sg9) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hi1 hi1 = new hi1(this.Y, continuation);
        hi1.X = obj;
        return hi1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        taf.o(this.Y.Q0, (sg9) this.X);
        return jue.a;
    }
}
