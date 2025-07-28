package defpackage;

import kotlinx.coroutines.internal.DispatchedContinuation;

/* renamed from: uw2  reason: default package */
public final class uw2 extends t37 {
    public final /* synthetic */ int b;
    public final zv1 c;

    public /* synthetic */ uw2(zv1 zv1, int i) {
        this.b = i;
        this.c = zv1;
    }

    public final boolean c() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void d(Throwable th) {
        switch (this.b) {
            case 0:
                i47 i47 = this.a;
                if (i47 == null) {
                    i47 = null;
                }
                zv1 zv1 = this.c;
                Throwable k = zv1.k(i47);
                if (!(!zv1.r() ? false : ((DispatchedContinuation) zv1.a).postponeCancellation$kotlinx_coroutines_core(k))) {
                    zv1.cancel(k);
                    if (!zv1.r()) {
                        zv1.h();
                        return;
                    }
                    return;
                }
                return;
            default:
                i47 i472 = this.a;
                if (i472 == null) {
                    i472 = null;
                }
                Object state$kotlinx_coroutines_core = i472.getState$kotlinx_coroutines_core();
                boolean z = state$kotlinx_coroutines_core instanceof r73;
                zv1 zv12 = this.c;
                if (z) {
                    zv12.resumeWith(new kcc(((r73) state$kotlinx_coroutines_core).a));
                    return;
                } else {
                    zv12.resumeWith(j47.a(state$kotlinx_coroutines_core));
                    return;
                }
        }
    }
}
