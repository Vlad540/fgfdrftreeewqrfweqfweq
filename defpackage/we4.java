package defpackage;

import android.text.InputFilter;

/* renamed from: we4  reason: default package */
public final class we4 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xe4 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we4(Integer num, xe4 xe4, int i) {
        super(9, (Object) num);
        this.c = i;
        this.o = xe4;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    xe4 xe4 = this.o;
                    xe4.x0.setFilters(xe4.getMaxCount() != Integer.MAX_VALUE ? (InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(xe4.getMaxCount())} : new InputFilter[0]);
                    return;
                }
                return;
            case 1:
                if (!hhd.f(obj, obj2)) {
                    s59 s59 = km4.y0;
                    xe4 xe42 = this.o;
                    xe42.onThemeChanged(s59.r(xe42));
                    return;
                }
                return;
            case 2:
                if (!hhd.f(obj, obj2)) {
                    s59 s592 = km4.y0;
                    xe4 xe43 = this.o;
                    xe43.onThemeChanged(s592.r(xe43));
                    return;
                }
                return;
            case 3:
                if (!hhd.f(obj, obj2)) {
                    s59 s593 = km4.y0;
                    xe4 xe44 = this.o;
                    xe44.onThemeChanged(s593.r(xe44));
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    s59 s594 = km4.y0;
                    xe4 xe45 = this.o;
                    xe45.onThemeChanged(s594.r(xe45));
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public we4(xe4 xe4, int i) {
        super(9, (Object) Integer.MAX_VALUE);
        this.c = i;
        switch (i) {
            case 1:
                this.o = xe4;
                super(9, (Object) null);
                return;
            default:
                this.o = xe4;
                return;
        }
    }
}
