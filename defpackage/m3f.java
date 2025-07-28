package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Arrays;

/* renamed from: m3f  reason: default package */
public final class m3f extends ibe implements h9f, g9f {
    public i26 X;
    public rz Y;
    public Long Z;
    public i26 o;
    public ObjectAnimator w0;
    public final AccelerateDecelerateInterpolator x0 = new AccelerateDecelerateInterpolator();

    public m3f() {
        super((u16) new u1c(27));
    }

    public final float[] e(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        float[] fArr = ((on8) viewGroup.getBackground()).p;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        if (z) {
            copyOf[0] = 0.0f;
            copyOf[1] = 0.0f;
            copyOf[2] = 0.0f;
            copyOf[3] = 0.0f;
        }
        return copyOf;
    }

    public final boolean m() {
        return ek8.L((t97) this.c);
    }

    public final void o(b9f b9f, rz rzVar, long j, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        this.Z = Long.valueOf(j);
        this.Y = rzVar;
        ((f9f) Q()).a(b9f);
        f9f f9f = (f9f) Q();
        ViewGroup viewGroup = (ViewGroup) this.b;
        g9f g9f = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        if (viewGroup instanceof g9f) {
            g9f = (g9f) viewGroup;
        }
        f9f.setCorners(g9f != null ? g9f.e(z) : e(z));
        ((f9f) Q()).setVideoContentMode(rzVar instanceof h5f ? c9f.b : c9f.a);
        a24.a0(Q(), new wfc(12, this));
        ((f9f) Q()).setOnLongClickListener(new wk0(10, this));
        u();
        if (z2 && ((f9f) Q()).getAlpha() < 1.0f && ((objectAnimator = this.w0) == null || !objectAnimator.isRunning())) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(Q(), View.ALPHA, new float[]{((f9f) Q()).getAlpha(), 1.0f});
            ofFloat.setDuration(500);
            ofFloat.setInterpolator(this.x0);
            ofFloat.start();
            this.w0 = ofFloat;
        }
        View Q = Q();
        if (!Q.isAttachedToWindow()) {
            f9f f9f2 = (f9f) Q();
            if (f9f2.b != null && f9f2.getChildCount() > 0) {
                t();
                return;
            }
            return;
        }
        Q.addOnAttachStateChangeListener(new q40(Q, 12, this));
    }

    public final boolean r() {
        t97 t97 = (t97) this.c;
        if (t97.a()) {
            f9f f9f = (f9f) t97.getValue();
            return f9f.b != null && f9f.getChildCount() > 0;
        }
    }

    public final void setVideoClickListener(i26 i26) {
        this.o = i26;
    }

    public final void setVideoLongClickListener(i26 i26) {
        this.X = i26;
    }

    public final void t() {
        t97 t97 = (t97) this.c;
        if (t97.a()) {
            f9f f9f = (f9f) t97.getValue();
            ObjectAnimator objectAnimator = this.w0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            f9f.setAlpha(0.0f);
            f9f.setVisibility(8);
            f9f.b();
        }
    }
}
