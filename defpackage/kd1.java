package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kd1  reason: default package */
public final class kd1 extends l5e implements i26 {
    public final /* synthetic */ td1 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kd1(td1 td1, Continuation continuation) {
        super(2, continuation);
        this.X = td1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((kd1) n((bka) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kd1(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        td1 td1 = this.X;
        String str = td1.A0;
        xs7.E(td1.a, td1.o.e(), (ru3) null, new rd1(td1, str, (Continuation) null), 2);
        return jue.a;
    }
}
