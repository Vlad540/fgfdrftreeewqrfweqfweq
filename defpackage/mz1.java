package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mz1  reason: default package */
public final class mz1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pz1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mz1(pz1 pz1, Continuation continuation) {
        super(2, continuation);
        this.Y = pz1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((g6b) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mz1 mz1 = new mz1(this.Y, continuation);
        mz1.X = obj;
        return mz1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        taf.o(this.Y.w0, (g6b) this.X);
        return jue.a;
    }
}
