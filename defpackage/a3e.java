package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: a3e  reason: default package */
public final class a3e extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ e3e Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a3e(e3e e3e, Continuation continuation) {
        super(2, continuation);
        this.Y = e3e;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((String) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a3e a3e = new a3e(this.Y, continuation);
        a3e.X = obj;
        return a3e;
    }

    public final Object o(Object obj) {
        grd grd;
        Object value;
        Object value2;
        Object value3;
        wx3.H(obj);
        String str = (String) this.X;
        e3e e3e = this.Y;
        int intValue = ((Number) e3e.L0.getValue()).intValue();
        grd grd2 = e3e.M0;
        if (str == null || h0e.c0(str)) {
            g37 g37 = (g37) e3e.Q0.T0(e3e, e3e.W0[0]);
            if (g37 != null) {
                g37.cancel((CancellationException) null);
            }
            do {
                grd = e3e.G0;
                value = grd.getValue();
                q2e q2e = (q2e) value;
            } while (!grd.b(value, (Object) null));
            do {
                value2 = grd2.getValue();
                x2e x2e = (x2e) value2;
            } while (!grd2.b(value2, (Object) null));
        } else {
            x2e x2e2 = (x2e) grd2.getValue();
            if (x2e2 != null && !h0e.R(str, x2e2.k(), false)) {
                do {
                    value3 = grd2.getValue();
                    x2e x2e3 = (x2e) value3;
                } while (!grd2.b(value3, (Object) null));
                e3e.q(intValue, str.toString());
            } else {
                e3e.q(intValue, str.toString());
            }
        }
        return jue.a;
    }
}
