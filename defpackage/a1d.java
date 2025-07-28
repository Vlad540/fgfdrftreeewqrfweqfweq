package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: a1d  reason: default package */
public final class a1d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ b1d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a1d(b1d b1d, Continuation continuation) {
        super(2, continuation);
        this.Y = b1d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a1d(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            d0d d0d = this.Y.a;
            if (d0d == null) {
                d0d = null;
            }
            this.X = 1;
            dsd a = ((in7) d0d.w.getValue()).b().a();
            a.getClass();
            pec a2 = pec.a(0, "\n            SELECT id FROM events\n            WHERE status = 0 AND isCritical = 1\n        ");
            obj = r1g.g(a.a, new CancellationSignal(), new csd(a, a2, 3), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
