package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: fq0  reason: default package */
public class fq0 extends fn {
    public boolean A0;
    public boolean B0;
    public eq0 C0;
    public final boolean D0;
    public w4g E0;
    public final dq0 F0;
    public BottomSheetBehavior Y;
    public FrameLayout Z;
    public CoordinatorLayout w0;
    public FrameLayout x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fq0(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x0019
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = defpackage.wlb.bottomSheetDialogTheme
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0017
            int r5 = r5.resourceId
            goto L_0x0019
        L_0x0017:
            int r5 = defpackage.kvb.Theme_Design_Light_BottomSheetDialog
        L_0x0019:
            r3.<init>(r4, r5)
            r3.z0 = r0
            r3.A0 = r0
            dq0 r4 = new dq0
            r5 = 0
            r4.<init>(r5, r3)
            r3.F0 = r4
            rm r4 = r3.d()
            r4.g(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = defpackage.wlb.enableEdgeToEdge
            int[] r5 = new int[]{r5}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            r5 = 0
            boolean r4 = r4.getBoolean(r5, r5)
            r3.D0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fq0.<init>(android.content.Context, int):void");
    }

    public final void cancel() {
        BottomSheetBehavior h = h();
        if (!this.y0 || h.L == 5) {
            super.cancel();
        } else {
            h.K(5);
        }
    }

    public final void g() {
        if (this.Z == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), wrb.design_bottom_sheet_dialog, (ViewGroup) null);
            this.Z = frameLayout;
            this.w0 = (CoordinatorLayout) frameLayout.findViewById(lob.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.Z.findViewById(lob.design_bottom_sheet);
            this.x0 = frameLayout2;
            BottomSheetBehavior C = BottomSheetBehavior.C(frameLayout2);
            this.Y = C;
            dq0 dq0 = this.F0;
            ArrayList arrayList = C.W;
            if (!arrayList.contains(dq0)) {
                arrayList.add(dq0);
            }
            this.Y.I(this.z0);
            this.E0 = new w4g((sv7) this.Y, (View) this.x0);
        }
    }

    public final BottomSheetBehavior h() {
        if (this.Y == null) {
            g();
        }
        return this.Y;
    }

    public final FrameLayout i(View view, int i, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.Z.findViewById(lob.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.D0) {
            FrameLayout frameLayout = this.x0;
            c9 c9Var = new c9(2, this);
            WeakHashMap weakHashMap = eaf.a;
            t9f.u(frameLayout, c9Var);
        }
        this.x0.removeAllViews();
        if (layoutParams == null) {
            this.x0.addView(view);
        } else {
            this.x0.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(lob.touch_outside).setOnClickListener(new jsc(3, this));
        eaf.j(this.x0, new cq0(0, this));
        this.x0.setOnTouchListener(new w6f(2));
        return this.Z;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.D0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.Z;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.w0;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            gt0.J(window, !z);
            eq0 eq0 = this.C0;
            if (eq0 != null) {
                eq0.e(window);
            }
        }
        w4g w4g = this.E0;
        if (w4g != null) {
            boolean z2 = this.z0;
            View view = (View) w4g.o;
            tv7 tv7 = (tv7) w4g.b;
            if (z2) {
                if (tv7 != null) {
                    tv7.b((sv7) w4g.c, view, false);
                }
            } else if (tv7 != null) {
                tv7.c(view);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public final void onDetachedFromWindow() {
        tv7 tv7;
        eq0 eq0 = this.C0;
        if (eq0 != null) {
            eq0.e((Window) null);
        }
        w4g w4g = this.E0;
        if (w4g != null && (tv7 = (tv7) w4g.b) != null) {
            tv7.c((View) w4g.o);
        }
    }

    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.Y;
        if (bottomSheetBehavior != null && bottomSheetBehavior.L == 5) {
            bottomSheetBehavior.K(4);
        }
    }

    public final void setCancelable(boolean z) {
        w4g w4g;
        super.setCancelable(z);
        if (this.z0 != z) {
            this.z0 = z;
            BottomSheetBehavior bottomSheetBehavior = this.Y;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.I(z);
            }
            if (getWindow() != null && (w4g = this.E0) != null) {
                boolean z2 = this.z0;
                View view = (View) w4g.o;
                tv7 tv7 = (tv7) w4g.b;
                if (z2) {
                    if (tv7 != null) {
                        tv7.b((sv7) w4g.c, view, false);
                    }
                } else if (tv7 != null) {
                    tv7.c(view);
                }
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.z0) {
            this.z0 = true;
        }
        this.A0 = z;
        this.B0 = true;
    }

    public final void setContentView(int i) {
        super.setContentView((View) i((View) null, i, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view) {
        super.setContentView((View) i(view, 0, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView((View) i(view, 0, layoutParams));
    }
}
