package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: tod  reason: default package */
public final class tod extends zl8 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int K0 = asb.abc_popup_menu_item_layout;
    public PopupWindow.OnDismissListener A0;
    public View B0;
    public View C0;
    public gm8 D0;
    public ViewTreeObserver E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public int I0 = 0;
    public boolean J0;
    public final boolean X;
    public final int Y;
    public final int Z;
    public final Context b;
    public final pl8 c;
    public final ml8 o;
    public final int w0;
    public final fm8 x0;
    public final tn y0 = new tn(4, this);
    public final ck z0 = new ck(8, this);

    /* JADX WARNING: type inference failed for: r8v1, types: [fm8, xg7] */
    public tod(int i, int i2, pl8 pl8, Context context, View view, boolean z) {
        this.b = context;
        this.c = pl8;
        this.X = z;
        this.o = new ml8(pl8, LayoutInflater.from(context), z, K0);
        this.Z = i;
        this.w0 = i2;
        Resources resources = context.getResources();
        this.Y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(anb.abc_config_prefDialogWidth));
        this.B0 = view;
        this.x0 = new xg7(context, (AttributeSet) null, i, i2);
        pl8.b(this, context);
    }

    public final boolean a() {
        return !this.F0 && this.x0.O0.isShowing();
    }

    public final boolean b(w0e w0e) {
        if (w0e.hasVisibleItems()) {
            View view = this.C0;
            bm8 bm8 = new bm8(this.Z, this.w0, w0e, this.b, view, this.X);
            gm8 gm8 = this.D0;
            bm8.i = gm8;
            zl8 zl8 = bm8.j;
            if (zl8 != null) {
                zl8.e(gm8);
            }
            boolean u = zl8.u(w0e);
            bm8.h = u;
            zl8 zl82 = bm8.j;
            if (zl82 != null) {
                zl82.o(u);
            }
            bm8.k = this.A0;
            this.A0 = null;
            this.c.c(false);
            fm8 fm8 = this.x0;
            int i = fm8.Y;
            int n = fm8.n();
            if ((Gravity.getAbsoluteGravity(this.I0, this.B0.getLayoutDirection()) & 7) == 5) {
                i += this.B0.getWidth();
            }
            if (!bm8.b()) {
                if (bm8.f != null) {
                    bm8.d(i, n, true, true);
                }
            }
            gm8 gm82 = this.D0;
            if (gm82 != null) {
                gm82.x(w0e);
            }
            return true;
        }
        return false;
    }

    public final boolean c() {
        return false;
    }

    public final void dismiss() {
        if (a()) {
            this.x0.dismiss();
        }
    }

    public final void e(gm8 gm8) {
        this.D0 = gm8;
    }

    public final void f(pl8 pl8, boolean z) {
        if (pl8 == this.c) {
            dismiss();
            gm8 gm8 = this.D0;
            if (gm8 != null) {
                gm8.f(pl8, z);
            }
        }
    }

    public final void g() {
        View view;
        if (!a()) {
            if (this.F0 || (view = this.B0) == null) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            this.C0 = view;
            fm8 fm8 = this.x0;
            fm8.O0.setOnDismissListener(this);
            fm8.E0 = this;
            fm8.N0 = true;
            fm8.O0.setFocusable(true);
            View view2 = this.C0;
            boolean z = this.E0 == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.E0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.y0);
            }
            view2.addOnAttachStateChangeListener(this.z0);
            fm8.D0 = view2;
            fm8.A0 = this.I0;
            boolean z2 = this.G0;
            Context context = this.b;
            ml8 ml8 = this.o;
            if (!z2) {
                this.H0 = zl8.m(ml8, context, this.Y);
                this.G0 = true;
            }
            fm8.q(this.H0);
            fm8.O0.setInputMethodMode(2);
            Rect rect = this.a;
            fm8.M0 = rect != null ? new Rect(rect) : null;
            fm8.g();
            yo4 yo4 = fm8.c;
            yo4.setOnKeyListener(this);
            if (this.J0) {
                pl8 pl8 = this.c;
                if (pl8.B0 != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(asb.abc_popup_menu_header_item_layout, yo4, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(pl8.B0);
                    }
                    frameLayout.setEnabled(false);
                    yo4.addHeaderView(frameLayout, (Object) null, false);
                }
            }
            fm8.o(ml8);
            fm8.g();
        }
    }

    public final void i() {
        this.G0 = false;
        ml8 ml8 = this.o;
        if (ml8 != null) {
            ml8.notifyDataSetChanged();
        }
    }

    public final yo4 j() {
        return this.x0.c;
    }

    public final void l(pl8 pl8) {
    }

    public final void n(View view) {
        this.B0 = view;
    }

    public final void o(boolean z) {
        this.o.c = z;
    }

    public final void onDismiss() {
        this.F0 = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.E0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E0 = this.C0.getViewTreeObserver();
            }
            this.E0.removeGlobalOnLayoutListener(this.y0);
            this.E0 = null;
        }
        this.C0.removeOnAttachStateChangeListener(this.z0);
        PopupWindow.OnDismissListener onDismissListener = this.A0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i) {
        this.I0 = i;
    }

    public final void q(int i) {
        this.x0.Y = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.A0 = onDismissListener;
    }

    public final void s(boolean z) {
        this.J0 = z;
    }

    public final void t(int i) {
        this.x0.k(i);
    }
}
