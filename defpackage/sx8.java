package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sx8  reason: default package */
public final class sx8 extends l5e implements i26 {
    public final /* synthetic */ zz8 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sx8(zz8 zz8, Continuation continuation) {
        super(2, continuation);
        this.X = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sx8(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        lz lzVar = this.X.E0;
        qod N = ez3.N(new ck5(new ik5(lzVar.a.c, 2), new kz(lzVar, (Continuation) null), 5), lzVar.c);
        lzVar.d.o1(lzVar, lz.f[0], N);
        return jue.a;
    }
}
