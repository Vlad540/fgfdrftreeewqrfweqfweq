package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: bhd  reason: default package */
public final class bhd extends wr3 implements View.OnAttachStateChangeListener {
    public final boolean X;
    public boolean Y;
    public ViewGroup Z;
    public boolean o;
    public ur3 w0;

    public bhd() {
        this(true);
    }

    public final void a() {
        ur3 ur3 = this.w0;
        if (ur3 != null) {
            ur3.q();
        }
        this.w0 = null;
        ViewGroup viewGroup = this.Z;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.Z = null;
    }

    public final wr3 b() {
        return new bhd(this.o);
    }

    public final boolean d() {
        return this.o;
    }

    public final boolean e() {
        return this.X;
    }

    public final void f(wr3 wr3, rr3 rr3) {
        this.Y = true;
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, ur3 ur3) {
        if (!this.Y) {
            if (view != null && (!z || this.o)) {
                viewGroup.removeView(view);
            }
            if (view2 != null && view2.getParent() == null) {
                viewGroup.addView(view2);
            }
            if (viewGroup.getWindowToken() != null) {
                ur3.q();
                return;
            }
            this.w0 = ur3;
            this.Z = viewGroup;
            viewGroup.addOnAttachStateChangeListener(this);
        }
    }

    public final void h(Bundle bundle) {
        this.o = bundle.getBoolean("SimpleSwapChangeHandler.removesFromViewOnPush");
    }

    public final void i(Bundle bundle) {
        bundle.putBoolean("SimpleSwapChangeHandler.removesFromViewOnPush", this.o);
    }

    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        ur3 ur3 = this.w0;
        if (ur3 != null) {
            ur3.q();
        }
        this.w0 = null;
        ViewGroup viewGroup = this.Z;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.Z = null;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public bhd(boolean z) {
        this.o = z;
        this.X = true;
    }
}
