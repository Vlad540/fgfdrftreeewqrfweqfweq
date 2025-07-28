package defpackage;

import android.animation.AnimatorSet;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import java.util.Objects;

/* renamed from: ta4  reason: default package */
public final class ta4 extends imd {
    public final ra4 c;
    public AnimatorSet d;

    public ta4(ra4 ra4) {
        this.c = ra4;
    }

    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.d;
        ra4 ra4 = this.c;
        if (animatorSet == null) {
            ((jmd) ra4.b).c(this);
            return;
        }
        jmd jmd = (jmd) ra4.b;
        if (jmd.g) {
            va4.a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            jmd.toString();
        }
    }

    public final void b(ViewGroup viewGroup) {
        jmd jmd = (jmd) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            jmd.c(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(jmd);
        }
    }

    public final void c(gd0 gd0) {
        jmd jmd = (jmd) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            jmd.c(this);
        } else if (Build.VERSION.SDK_INT >= 34 && jmd.c.C0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                jmd.toString();
            }
            long a = ua4.a.a(animatorSet);
            long j = (long) (gd0.c * ((float) a));
            if (j == 0) {
                j = 1;
            }
            if (j == a) {
                j = a - 1;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                animatorSet.toString();
                jmd.toString();
            }
            va4.a.b(animatorSet, j);
        }
    }

    public final void d(ViewGroup viewGroup) {
        ra4 ra4 = this.c;
        if (!ra4.U1()) {
            nu7 Z1 = ra4.Z1(viewGroup.getContext());
            this.d = Z1 != null ? (AnimatorSet) Z1.b : null;
            jmd jmd = (jmd) ra4.b;
            a aVar = jmd.c;
            boolean z = jmd.a == 3;
            View view = aVar.Y0;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.addListener(new sa4(viewGroup, view, z, jmd, this));
            }
            AnimatorSet animatorSet2 = this.d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }
}
