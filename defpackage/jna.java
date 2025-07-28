package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jna  reason: default package */
public final class jna extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mna Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jna(mna mna, Continuation continuation) {
        super(2, continuation);
        this.Y = mna;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((nna) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jna jna = new jna(this.Y, continuation);
        jna.X = obj;
        return jna;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        mna mna = this.Y;
        mna.a(mna, "camera", mna.b(mna, (nna) this.X));
        return jue.a;
    }
}
