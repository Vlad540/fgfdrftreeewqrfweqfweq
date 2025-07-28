package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;

/* renamed from: dj5  reason: default package */
public final class dj5 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public dj5(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public static void a(dj5 dj5) {
        FlexboxLayoutManager flexboxLayoutManager = dj5.h;
        if (flexboxLayoutManager.d1() || !flexboxLayoutManager.t) {
            dj5.c = dj5.e ? flexboxLayoutManager.B.h() : flexboxLayoutManager.B.m();
        } else {
            dj5.c = dj5.e ? flexboxLayoutManager.B.h() : flexboxLayoutManager.n - flexboxLayoutManager.B.m();
        }
    }

    public static void b(dj5 dj5) {
        dj5.a = -1;
        dj5.b = -1;
        dj5.c = Integer.MIN_VALUE;
        boolean z = false;
        dj5.f = false;
        dj5.g = false;
        FlexboxLayoutManager flexboxLayoutManager = dj5.h;
        if (flexboxLayoutManager.d1()) {
            int i = flexboxLayoutManager.q;
            if (i == 0) {
                if (flexboxLayoutManager.p == 1) {
                    z = true;
                }
                dj5.e = z;
                return;
            }
            if (i == 2) {
                z = true;
            }
            dj5.e = z;
            return;
        }
        int i2 = flexboxLayoutManager.q;
        if (i2 == 0) {
            if (flexboxLayoutManager.p == 3) {
                z = true;
            }
            dj5.e = z;
            return;
        }
        if (i2 == 2) {
            z = true;
        }
        dj5.e = z;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}
