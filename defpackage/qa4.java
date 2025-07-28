package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: qa4  reason: default package */
public final class qa4 extends imd {
    public final ra4 c;

    public qa4(ra4 ra4) {
        this.c = ra4;
    }

    public final void a(ViewGroup viewGroup) {
        ra4 ra4 = this.c;
        jmd jmd = (jmd) ra4.b;
        View view = jmd.c.Y0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((jmd) ra4.b).c(this);
        if (Log.isLoggable("FragmentManager", 2)) {
            jmd.toString();
        }
    }

    public final void b(ViewGroup viewGroup) {
        ra4 ra4 = this.c;
        boolean U1 = ra4.U1();
        jmd jmd = (jmd) ra4.b;
        if (U1) {
            jmd.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = jmd.c.Y0;
        nu7 Z1 = ra4.Z1(context);
        if (Z1 != null) {
            Animation animation = (Animation) Z1.a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (jmd.a != 1) {
                view.startAnimation(animation);
                jmd.c(this);
            } else {
                viewGroup.startViewTransition(view);
                ix5 ix5 = new ix5(animation, viewGroup, view);
                ix5.setAnimationListener(new pa4(jmd, viewGroup, view, this));
                view.startAnimation(ix5);
                if (Log.isLoggable("FragmentManager", 2)) {
                    jmd.toString();
                }
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }
}
