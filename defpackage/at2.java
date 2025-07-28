package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: at2  reason: default package */
public final class at2 extends l5e implements i26 {
    public final /* synthetic */ bt2 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public at2(bt2 bt2, long j, Continuation continuation) {
        super(2, continuation);
        this.X = bt2;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((at2) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new at2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = bt2.U0;
        t52 l = this.X.s().l();
        t52 t52 = l;
        tic.a(new c52(t52, this.Y, l.n.a.m(), 0), l.z, (j6) null, new ak0(19), (qmc) null);
        return jue.a;
    }
}
