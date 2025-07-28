package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lz1  reason: default package */
public final class lz1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pz1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lz1(pz1 pz1, Continuation continuation) {
        super(2, continuation);
        this.Y = pz1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((sg9) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lz1 lz1 = new lz1(this.Y, continuation);
        lz1.X = obj;
        return lz1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        taf.o(this.Y.Z, (sg9) this.X);
        return jue.a;
    }
}
