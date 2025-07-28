package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: rec  reason: default package */
public final class rec extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zec Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rec(zec zec, Continuation continuation) {
        super(2, continuation);
        this.Y = zec;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rec(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            dsd a = this.Y.a();
            this.X = 1;
            a.getClass();
            pec a2 = pec.a(0, "SELECT COUNT(*) FROM events");
            obj = r1g.g(a.a, new CancellationSignal(), new csd(a, a2, 0), this);
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
