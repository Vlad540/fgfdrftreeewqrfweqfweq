package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yr0  reason: default package */
public final /* synthetic */ class yr0 implements tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ yr0(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    public final String z(sn1 sn1) {
        switch (this.a) {
            case 0:
                this.b.set(sn1);
                return "Data closed";
            case 1:
                this.b.set(new cs1(0, sn1));
                return "OnScreenFlashUiApplied";
            case 2:
                this.b.set(sn1);
                return "Data closed";
            case 3:
                this.b.set(sn1);
                return "acquireInputBuffer";
            case 4:
                this.b.set(sn1);
                return "mReleasedFuture";
            default:
                this.b.set(sn1);
                return "Terminate InputBuffer";
        }
    }
}
