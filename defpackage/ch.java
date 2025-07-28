package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ch  reason: default package */
public abstract class ch extends wr3 {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public long o;
    public Animator w0;
    public ah x0;
    public boolean y0;

    public ch() {
        this(0, 3);
    }

    public final void a() {
        this.Y = true;
        Animator animator = this.w0;
        if (animator != null) {
            animator.end();
            return;
        }
        ah ahVar = this.x0;
        if (ahVar != null) {
            ahVar.a();
        }
    }

    public final boolean d() {
        return this.y0;
    }

    public final void f(wr3 wr3, rr3 rr3) {
        this.X = true;
        Animator animator = this.w0;
        if (animator != null) {
            animator.cancel();
            return;
        }
        ah ahVar = this.x0;
        if (ahVar != null) {
            ahVar.a();
        }
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, ur3 ur3) {
        boolean z2 = view2 != null && view2.getParent() == null;
        if (z2) {
            if (z || view == null) {
                viewGroup.addView(view2);
            } else if (view2.getParent() == null) {
                viewGroup.addView(view2, viewGroup.indexOfChild(view));
            }
            if (view2.getWidth() <= 0 && view2.getHeight() <= 0) {
                this.x0 = new ah(this, ur3, view, view2, viewGroup, z);
                view2.getViewTreeObserver().addOnPreDrawListener(this.x0);
                return;
            }
        }
        m(viewGroup, view, view2, z, z2, ur3);
    }

    public final void h(Bundle bundle) {
        this.o = bundle.getLong("AnimatorChangeHandler.duration");
        this.y0 = bundle.getBoolean("AnimatorChangeHandler.removesFromViewOnPush");
    }

    public final void i(Bundle bundle) {
        bundle.putLong("AnimatorChangeHandler.duration", this.o);
        bundle.putBoolean("AnimatorChangeHandler.removesFromViewOnPush", this.y0);
    }

    public final void k(ur3 ur3, Animator.AnimatorListener animatorListener) {
        if (!this.Z) {
            this.Z = true;
            ur3.q();
        }
        Animator animator = this.w0;
        if (animator != null) {
            if (animatorListener != null) {
                animator.removeListener(animatorListener);
            }
            this.w0.cancel();
            this.w0 = null;
        }
        this.x0 = null;
    }

    public abstract AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2);

    public final void m(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2, ur3 ur3) {
        if (this.X) {
            k(ur3, (Animator.AnimatorListener) null);
        } else if (this.Y) {
            if (view != null && (!z || this.y0)) {
                viewGroup.removeView(view);
            }
            k(ur3, (Animator.AnimatorListener) null);
            if (z && view != null) {
                n(view);
            }
        } else {
            AnimatorSet l = l(viewGroup, view, view2, z, z2);
            this.w0 = l;
            long j = this.o;
            if (j > 0) {
                l.setDuration(j);
            }
            this.w0.addListener(new bh(this, ur3, view, view2, viewGroup, z));
            this.w0.start();
        }
    }

    public abstract void n(View view);

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch(long j, int i) {
        this((i & 1) != 0 ? -1 : j, true);
    }

    public ch(long j, boolean z) {
        this.o = j;
        this.y0 = z;
    }

    public ch(int i) {
        this(-1, true);
    }
}
