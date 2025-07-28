package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: cl3  reason: default package */
public final class cl3 extends l5e implements i26 {
    public final /* synthetic */ kl3 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cl3(kl3 kl3, Continuation continuation) {
        super(2, continuation);
        this.X = kl3;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((cl3) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cl3(this.X, continuation);
    }

    public final Object o(Object obj) {
        grd grd;
        Object value;
        wx3.H(obj);
        kl3 kl3 = this.X;
        vqc vqc = (xzc) kl3.A0.getValue();
        vqc.getClass();
        int i = vqc.m(PmsKey.account-nickname-enabled, false) ? q2a.k : q2a.j;
        do {
            grd = kl3.F0;
            value = grd.getValue();
            mge mge = (mge) value;
        } while (!grd.b(value, new hge(i)));
        return jue.a;
    }
}
