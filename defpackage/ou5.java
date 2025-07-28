package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ou5  reason: default package */
public final class ou5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ u16 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ou5(Continuation continuation, u16 u16) {
        super(2, continuation);
        this.Y = u16;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ou5 ou5 = new ou5(continuation, this.Y);
        ou5.X = obj;
        return ou5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.invoke((sg9) this.X);
        return jue.a;
    }
}
