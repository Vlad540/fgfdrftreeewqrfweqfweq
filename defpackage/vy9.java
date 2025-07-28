package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* renamed from: vy9  reason: default package */
public final class vy9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AtomicBoolean Y;
    public final /* synthetic */ Handler Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vy9(AtomicBoolean atomicBoolean, Handler handler, Continuation continuation) {
        super(2, continuation);
        this.Y = atomicBoolean;
        this.Z = handler;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vy9) n((gk) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vy9 vy9 = new vy9(this.Y, this.Z, continuation);
        vy9.X = obj;
        return vy9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        gk gkVar = (gk) this.X;
        boolean z = this.Y.get();
        jue jue = jue.a;
        if (!z) {
            return jue;
        }
        d4b A = gp0.A();
        gkVar.initCause((Throwable) A.c);
        udd.S("ANR", "detect " + gkVar, gkVar);
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.Y, "ANR-ThreadDump", A.toString(), (Throwable) null);
        }
        y0f.a.c().a((String) null, gkVar);
        if (this.Y.compareAndSet(true, false)) {
            this.Z.postAtFrontOfQueue(new eq6(20, this.Y));
        }
        return jue;
    }
}
