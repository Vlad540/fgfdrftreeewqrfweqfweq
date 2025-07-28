package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: xi3  reason: default package */
public final class xi3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hj3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xi3(hj3 hj3, Continuation continuation) {
        super(2, continuation);
        this.Y = hj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xi3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        hj3 hj3 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((ap3) hj3.o.getValue()).b(hj3.n, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tf3 tf3 = (tf3) obj;
        if (tf3 == null) {
            return jue;
        }
        AtomicLong atomicLong = hj3.l;
        long j = tf3.a.c.e;
        gy9 gy9 = (gy9) ((pk) hj3.z.getValue());
        atomicLong.set(sce.d(gy9.A(), new a9c(((j2b) gy9.z()).a.n(), j), false, 0, 12));
        hcd hcd = hj3.d;
        e9b e9b = new e9b(new hge(i8a.W), new Integer(phc.m));
        this.X = 2;
        return hcd.a(e9b, this) == pu3 ? pu3 : jue;
    }
}
