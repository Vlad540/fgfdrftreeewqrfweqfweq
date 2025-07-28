package defpackage;

import one.me.sdk.bottomsheet.BottomSheetWidget;

/* renamed from: hq0  reason: default package */
public final class hq0 implements vr3 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public hq0(rr3 rr3, s16 s16) {
        this.b = rr3.getInstanceId();
        this.c = s16;
    }

    private final void c(rr3 rr3, rr3 rr32, boolean z) {
    }

    public final void a(rr3 rr3, rr3 rr32, boolean z) {
        switch (this.a) {
            case 0:
                if (rr32 != null) {
                    ((sgc) this.b).K(this);
                    ((BottomSheetWidget) this.c).r0(true);
                    return;
                }
                return;
            default:
                if (hhd.f(rr32 != null ? rr32.getInstanceId() : null, (String) this.b) && !z) {
                    ((s16) this.c).invoke();
                    return;
                }
                return;
        }
    }

    public final void b(rr3 rr3, rr3 rr32, boolean z) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (hhd.f(rr32 != null ? rr32.getInstanceId() : null, (String) this.b) && !z) {
                    rr32.getRouter().K(this);
                    return;
                }
                return;
        }
    }

    public hq0(sgc sgc, BottomSheetWidget bottomSheetWidget) {
        this.b = sgc;
        this.c = bottomSheetWidget;
    }
}
