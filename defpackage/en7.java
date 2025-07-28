package defpackage;

import android.os.SystemClock;
import kotlin.coroutines.Continuation;

/* renamed from: en7  reason: default package */
public final class en7 implements zp {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ en7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b() {
    }

    public final void a() {
        switch (this.a) {
            case 0:
                in7.g((in7) this.b, false, 3);
                return;
            default:
                ((xg9) this.b).i = SystemClock.elapsedRealtime();
                xg9.g((xg9) this.b, mnc.APPLICATION_BACKGROUND);
                return;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                return;
            default:
                xg9 xg9 = (xg9) this.b;
                if (xg9.i != 0) {
                    gsd gsd = (gsd) xg9.l.get();
                    String str = xg9.f;
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        tn7 tn7 = tn7.X;
                        long j = xg9.i;
                        fn6.d(tn7, str, "Navigation stats. Try update session id on warmStart, lastTime:" + j + "|lastCondition:" + gsd, (Throwable) null);
                    }
                    if (!xg9.e()) {
                        gsd.getClass();
                        if (gsd != gsd.b && gsd != gsd.c) {
                            xs7.E(xg9.e, (hu3) null, (ru3) null, new ug9(xg9, (Continuation) null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
