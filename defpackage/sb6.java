package defpackage;

import android.view.View;

/* renamed from: sb6  reason: default package */
public final class sb6 extends n1g {
    public final /* synthetic */ int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb6(int i) {
        super(10);
        this.f = i;
    }

    public final int m(View view, int i, int i2) {
        switch (this.f) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i;
            case 3:
                return i >> 1;
            case 4:
                if (view.getVisibility() == 8) {
                    return 0;
                }
                int baseline = view.getBaseline();
                if (baseline == -1) {
                    return Integer.MIN_VALUE;
                }
                return baseline;
            default:
                return Integer.MIN_VALUE;
        }
    }

    public yb6 o() {
        switch (this.f) {
            case 4:
                return new yb6();
            default:
                return super.o();
        }
    }

    public final String p() {
        switch (this.f) {
            case 0:
                return "UNDEFINED";
            case 1:
                return "LEADING";
            case 2:
                return "TRAILING";
            case 3:
                return "CENTER";
            case 4:
                return "BASELINE";
            default:
                return "FILL";
        }
    }

    public final int r(View view, int i) {
        switch (this.f) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i;
            case 3:
                return i >> 1;
            case 4:
                return 0;
            default:
                return 0;
        }
    }

    public int u(int i, int i2) {
        switch (this.f) {
            case 5:
                return i2;
            default:
                return i;
        }
    }
}
