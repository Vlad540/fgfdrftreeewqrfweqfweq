package defpackage;

import android.os.CancellationSignal;
import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: o9d  reason: default package */
public final class o9d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ t9d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o9d(t9d t9d, Continuation continuation) {
        super(2, continuation);
        this.Y = t9d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o9d(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            t9d t9d = this.Y;
            xff xff = (xff) t9d.B0.getValue();
            long s = ((lqc) t9d.t()).s();
            this.X = 1;
            xff.getClass();
            pec a = pec.a(1, "SELECT * FROM webapp_biometry WHERE user_id = ?");
            a.j(1, s);
            obj = r1g.g(xff.a, new CancellationSignal(), new vff(xff, a, 0), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Boolean.valueOf(!((Collection) obj).isEmpty());
    }
}
