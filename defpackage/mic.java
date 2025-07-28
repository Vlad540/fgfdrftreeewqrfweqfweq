package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mic  reason: default package */
public final class mic extends d0 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mic(hu3 hu3, AtomicReference atomicReference, int i) {
        super(hu3, false, true);
        this.a = i;
        this.b = atomicReference;
    }

    public final void onCancelled(Throwable th, boolean z) {
        switch (this.a) {
            case 0:
                try {
                    if (((x63) ((b73) this.b)).a(th)) {
                        return;
                    }
                } catch (Throwable th2) {
                    jjd.d(th, th2);
                }
                x87.g0(getContext(), th);
                return;
            default:
                try {
                    if (((ihd) ((nhd) this.b)).c(th)) {
                        return;
                    }
                } catch (Throwable th3) {
                    jjd.d(th, th3);
                }
                x87.g0(getContext(), th);
                return;
        }
    }

    public final void onCompleted(Object obj) {
        switch (this.a) {
            case 0:
                jue jue = (jue) obj;
                try {
                    ((x63) ((b73) this.b)).b();
                    return;
                } catch (Throwable th) {
                    x87.g0(getContext(), th);
                    return;
                }
            default:
                try {
                    ((ihd) ((nhd) this.b)).a(obj);
                    return;
                } catch (Throwable th2) {
                    x87.g0(getContext(), th2);
                    return;
                }
        }
    }
}
