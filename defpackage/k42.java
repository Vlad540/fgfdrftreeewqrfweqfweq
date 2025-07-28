package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: k42  reason: default package */
public final class k42 extends l5e implements i26 {
    public final /* synthetic */ o42 X;
    public final /* synthetic */ sz1 Y;
    public final /* synthetic */ i22 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k42(o42 o42, sz1 sz1, i22 i22, Continuation continuation) {
        super(2, continuation);
        this.X = o42;
        this.Y = sz1;
        this.Z = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k42(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        long j;
        wx3.H(obj);
        o42 o42 = this.X;
        AtomicLong atomicLong = o42.t;
        sz1 sz1 = this.Y;
        int ordinal = sz1.b.ordinal();
        t97 t97 = o42.o;
        i22 i22 = this.Z;
        if (ordinal == 0) {
            j = ((gy9) ((pk) t97.getValue())).l(i22.a, i22.b.a, 1, sz1.c, false, (HashMap) null);
        } else if (ordinal == 1) {
            j = ((gy9) ((pk) t97.getValue())).l(i22.a, i22.b.a, 2, (String) null, false, (HashMap) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        atomicLong.set(j);
        o42.w.set(true);
        return jue.a;
    }
}
