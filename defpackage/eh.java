package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.TransitionValues;
import android.view.View;

/* renamed from: eh  reason: default package */
public final class eh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eh(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationCancel(animator);
                ((TransitionValues) this.b).view.setClipBounds((Rect) null);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ValueAnimator) this.b).removeListener(this);
                ((s16) this.c).invoke();
                return;
            case 1:
                super.onAnimationEnd(animator);
                if (((l03) this.c).b) {
                    ((TransitionValues) this.b).view.setClipBounds((Rect) null);
                    return;
                }
                return;
            case 2:
                ((a76) this.b).getHierarchy().n(pgc.b(((in4) this.c).b));
                return;
            case 3:
                a76 a76 = (a76) this.b;
                nn4 nn4 = (nn4) this.c;
                a76.getHierarchy().h(nn4.b);
                if (nn4.o != null) {
                    y66 hierarchy = a76.getHierarchy();
                    PointF pointF = nn4.o;
                    hierarchy.getClass();
                    pointF.getClass();
                    hierarchy.f(2).r(pointF);
                    return;
                }
                return;
            case 4:
                ps4 ps4 = (ps4) this.c;
                ps4.o.setValues((float[]) this.b);
                ps4.o.invert(ps4.w0);
                ps4.invalidate();
                return;
            case 5:
                ((yr) this.b).remove(animator);
                ((cre) this.c).E0.remove(animator);
                return;
            default:
                asf asf = (asf) this.b;
                asf.a.d(1.0f);
                wrf.e((View) this.c, asf);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ((cre) this.c).E0.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ eh(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
