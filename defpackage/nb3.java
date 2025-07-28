package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: nb3  reason: default package */
public final class nb3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ rb3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nb3(rb3 rb3, Continuation continuation) {
        super(2, continuation);
        this.Y = rb3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nb3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        rb3 rb3 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((h70) rb3.w0.getValue()).a(rb3.X, 2, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g70 g70 = (g70) obj;
        rb3.o = g70.c;
        long Q = mt0.Q(g70.X, eq4.c);
        int i2 = zp4.o;
        rb3.C0.m((Object) null, new Long(zp4.i(Q, eq4.o)));
        qod qod = rb3.H0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        rb3.H0 = taf.n(rb3, (hu3) null, (ru3) null, new qb3(rb3, (Continuation) null), 3);
        eb6 eb6 = (eb6) ((wkd) rb3.y0.getValue());
        eb6.g = rb3.c;
        eb6.b();
        return jue.a;
    }
}
