package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;

/* renamed from: n33  reason: default package */
public final class n33 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ pj5[] Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ AtomicInteger w0;
    public final /* synthetic */ i02 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n33(pj5[] pj5Arr, int i, AtomicInteger atomicInteger, us0 us0, Continuation continuation) {
        super(2, continuation);
        this.Y = pj5Arr;
        this.Z = i;
        this.w0 = atomicInteger;
        this.x0 = us0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n33) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new n33(this.Y, this.Z, this.w0, (us0) this.x0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        AtomicInteger atomicInteger = this.w0;
        i02 i02 = this.x0;
        if (i == 0) {
            wx3.H(obj);
            pj5[] pj5Arr = this.Y;
            int i2 = this.Z;
            pj5 pj5 = pj5Arr[i2];
            m33 m33 = new m33(i2, 0, i02);
            this.X = 1;
            if (pj5.c(m33, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                if (atomicInteger.decrementAndGet() == 0) {
                    i02.i((Throwable) null);
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (atomicInteger.decrementAndGet() == 0) {
            i02.i((Throwable) null);
        }
        return jue.a;
    }
}
