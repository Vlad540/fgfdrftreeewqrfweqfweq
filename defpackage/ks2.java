package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: ks2  reason: default package */
public final class ks2 extends l5e implements i26 {
    public final /* synthetic */ bt2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ks2(bt2 bt2, Continuation continuation) {
        super(2, continuation);
        this.X = bt2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ks2) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ks2(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        bt2 bt2 = this.X;
        i2c i2c = bt2.b;
        i2c.getClass();
        new w63(new yt9(new ps9(ms9.j(i2c.a.D(t52.I)), new h2c(i2c, 2), 1), new h2c(i2c, 5)), 0, new yt9(new ps9(new ps9(ms9.j(i2c.b.j(di3.r, di3.t)), new h2c(i2c, 6), 1), new h2c(i2c, 0), 1), new h2c(i2c, 4))).k(i2c.c).i(new pn1(new lpa(11), 0, new d74(4)));
        grd grd = bt2.I0;
        js2 js2 = (js2) grd.getValue();
        dp6 dp6 = js2.c;
        grd.m((Object) null, js2.a(js2, (is2) null, new dp6(dp6.a, hw4.a, dp6.c), (ArrayList) null, false, 27));
        return jue.a;
    }
}
