package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kz1  reason: default package */
public final class kz1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pz1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kz1(pz1 pz1, Continuation continuation) {
        super(2, continuation);
        this.Y = pz1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((cz1) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kz1 kz1 = new kz1(this.Y, continuation);
        kz1.X = obj;
        return kz1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        cz1 cz1 = (cz1) this.X;
        pz1 pz1 = this.Y;
        pz1.X.setValue(cz1.a);
        pz1.c.setValue(cz1.b);
        return jue.a;
    }
}
