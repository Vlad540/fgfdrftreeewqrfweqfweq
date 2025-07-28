package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: ha7  reason: default package */
public final class ha7 extends a24 {
    public final /* synthetic */ int i;
    public final SideSheetBehavior j;

    public /* synthetic */ ha7(SideSheetBehavior sideSheetBehavior, int i2) {
        this.i = i2;
        this.j = sideSheetBehavior;
    }

    public final int C(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.i) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final int E() {
        switch (this.i) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.j;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.j;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    public final int G() {
        switch (this.i) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.j;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.j.m;
        }
    }

    public final int H() {
        switch (this.i) {
            case 0:
                return this.j.o;
            default:
                return this.j.m;
        }
    }

    public final int I() {
        switch (this.i) {
            case 0:
                return -this.j.l;
            default:
                return E();
        }
    }

    public final int J(View view) {
        switch (this.i) {
            case 0:
                return view.getRight() + this.j.o;
            default:
                return view.getLeft() - this.j.o;
        }
    }

    public final int N(CoordinatorLayout coordinatorLayout) {
        switch (this.i) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int O() {
        switch (this.i) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean S(float f) {
        switch (this.i) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    public final boolean T(View view) {
        switch (this.i) {
            case 0:
                return view.getRight() < (E() - G()) / 2;
            default:
                return view.getLeft() > (E() + this.j.m) / 2;
        }
    }

    public final boolean U(float f, float f2) {
        switch (this.i) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs = Math.abs(f);
                    this.j.getClass();
                    if (abs > ((float) 500)) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs2 = Math.abs(f);
                    this.j.getClass();
                    if (abs2 > ((float) 500)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final boolean b0(View view, float f) {
        switch (this.i) {
            case 0:
                return Math.abs((f * this.j.k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f * this.j.k) + ((float) view.getRight())) > 0.5f;
        }
    }

    public final int f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.i) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float g(int i2) {
        switch (this.i) {
            case 0:
                float G = (float) G();
                return (((float) i2) - G) / (((float) E()) - G);
            default:
                float f = (float) this.j.m;
                return (f - ((float) i2)) / (f - ((float) E()));
        }
    }

    public final void g0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        switch (this.i) {
            case 0:
                marginLayoutParams.leftMargin = i2;
                return;
            default:
                marginLayoutParams.rightMargin = i2;
                return;
        }
    }

    public final void h0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        switch (this.i) {
            case 0:
                if (i2 <= this.j.m) {
                    marginLayoutParams.leftMargin = i3;
                    return;
                }
                return;
            default:
                int i4 = this.j.m;
                if (i2 <= i4) {
                    marginLayoutParams.rightMargin = i4 - i2;
                    return;
                }
                return;
        }
    }
}
