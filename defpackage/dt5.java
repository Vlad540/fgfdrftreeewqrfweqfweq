package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dt5  reason: default package */
public final class dt5 extends l5e implements i26 {
    public final /* synthetic */ ft5 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt5(ft5 ft5, String str, Continuation continuation) {
        super(2, continuation);
        this.X = ft5;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((dt5) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dt5(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        hba hba = (hba) this.X.Y.getValue();
        hba.i(this.Y);
        hba.f(new vba(phc.j));
        hba.j();
        return jue.a;
    }
}
