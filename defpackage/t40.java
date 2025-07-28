package defpackage;

import android.os.PowerManager;
import kotlin.coroutines.Continuation;

/* renamed from: t40  reason: default package */
public final class t40 implements lib {
    public final /* synthetic */ v40 a;

    public t40(v40 v40) {
        this.a = v40;
    }

    public final void a() {
        v40 v40 = this.a;
        if (!v40.b(v40)) {
            nb9 nb9 = v40.a;
            nb9 nb92 = nb9;
            nb92.getClass();
            k20 k20 = new k20(1, 0, 2, 1, 0);
            r38 r38 = nb92.m;
            if (r38 != null) {
                r38.m0(k20, false);
            }
            mib mib = v40.b;
            mib.getClass();
            try {
                PowerManager.WakeLock wakeLock = mib.f;
                if (wakeLock != null) {
                    wakeLock.acquire();
                }
            } catch (Exception e) {
                udd.u("ProximityHelperTag", e, e.getMessage(), new Object[0]);
            }
            nb9 nb93 = nb9;
            nb93.getClass();
            xs7.E(nb93.h, (hu3) null, (ru3) null, new jb9(((Number) nb9.t.a.getValue()).longValue() - 1000, nb93, (Continuation) null), 3);
        }
    }

    public final void b() {
        v40 v40 = this.a;
        if (!v40.b(v40)) {
            nb9 nb9 = v40.a;
            nb9 nb92 = nb9;
            nb92.getClass();
            k20 k20 = new k20(1, 0, 1, 1, 0);
            r38 r38 = nb92.m;
            if (r38 != null) {
                r38.m0(k20, false);
            }
            v40.b.c();
            nb9.q();
        }
    }
}
