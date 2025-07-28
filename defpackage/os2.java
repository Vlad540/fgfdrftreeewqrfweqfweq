package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: os2  reason: default package */
public final class os2 extends l5e implements i26 {
    public final /* synthetic */ bt2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public os2(bt2 bt2, Continuation continuation) {
        super(2, continuation);
        this.X = bt2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((os2) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new os2(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        bt2 bt2 = this.X;
        vs7 vs7 = bt2.o;
        String str = ((js2) bt2.I0.getValue()).b;
        vs7.getClass();
        udd.p("vs7", "loadNextMessages", new Object[0]);
        if (!tic.c(vs7.k)) {
            udd.p("vs7", "searchMessagesInternal: is loading, return", new Object[0]);
        } else {
            dt dtVar = new dt(str, !r1g.p(vs7.r) ? vs7.r : null);
            ybe ybe = vs7.d;
            ybe.getClass();
            mv9 mv9 = new mv9(1, new joc(ybe, 6, dtVar));
            qmc qmc = vs7.c;
            yhd i = mv9.i(qmc);
            lce lce = vs7.f;
            lce.getClass();
            yhd i2 = i.j(new ice(lce, 1, 0)).m(qmc).i(vs7.b);
            pn1 pn1 = new pn1(new ps7(vs7, str, 0), 2, new os7(vs7, 1));
            i2.k(pn1);
            vs7.k = pn1;
        }
        return jue.a;
    }
}
