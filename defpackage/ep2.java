package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: ep2  reason: default package */
public final class ep2 extends l5e implements i26 {
    public final /* synthetic */ gp2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ep2(gp2 gp2, Continuation continuation) {
        super(2, continuation);
        this.X = gp2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ep2(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        gp2 gp2 = this.X;
        AtomicLong atomicLong = gp2.G0;
        String str = gp2.K0;
        String str2 = gp2.L0;
        gy9 gy9 = (gy9) ((pk) gp2.X.getValue());
        atomicLong.set(gy9.v(gy9, new k02(((j2b) gy9.z()).a.n(), str, str2)));
        return jue.a;
    }
}
