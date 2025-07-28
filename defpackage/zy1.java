package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zy1  reason: default package */
public final class zy1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ u16 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zy1(Continuation continuation, u16 u16) {
        super(2, continuation);
        this.Y = u16;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zy1 zy1 = new zy1(continuation, this.Y);
        zy1.X = obj;
        return zy1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.invoke((sg9) this.X);
        return jue.a;
    }
}
