package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mv5  reason: default package */
public final class mv5 extends l5e implements i26 {
    public final /* synthetic */ pv5 X;
    public final /* synthetic */ StringBuilder Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mv5(pv5 pv5, StringBuilder sb, Continuation continuation) {
        super(2, continuation);
        this.X = pv5;
        this.Y = sb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mv5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mv5(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        hba hba = (hba) this.X.k.getValue();
        hba.i(this.Y);
        return hba.j();
    }
}
