package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: l9f  reason: default package */
public final class l9f implements View.OnAttachStateChangeListener {
    public lv1 X;
    public no0 Y;
    public boolean a;
    public boolean b;
    public boolean c;
    public int o;

    public static View a(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() == 0) {
            return viewGroup;
        }
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        return childAt instanceof ViewGroup ? a((ViewGroup) childAt) : childAt;
    }

    public final void b() {
        if (this.a && this.b && !this.c && this.o != 3) {
            this.o = 3;
            this.X.s();
        }
    }

    public final void c(boolean z) {
        boolean z2 = this.o == 2;
        if (z) {
            this.o = 2;
        } else {
            this.o = 1;
        }
        lv1 lv1 = this.X;
        if (!z2 || z) {
            lv1.v(z);
        } else {
            lv1.B();
        }
    }

    public final void onViewAttachedToWindow(View view) {
        if (!this.a) {
            this.a = true;
            bae bae = new bae(3, this);
            if (!(view instanceof ViewGroup)) {
                this.b = true;
                b();
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                this.b = true;
                b();
                return;
            }
            this.Y = new no0(this, bae);
            a(viewGroup).addOnAttachStateChangeListener(this.Y);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        this.a = false;
        if (this.b) {
            this.b = false;
            c(false);
        }
    }
}
