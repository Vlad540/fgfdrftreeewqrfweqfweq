package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: sg  reason: default package */
public final class sg extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s16 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sg(s16 s16, FrameLayout frameLayout, s16 s162, int i) {
        this.a = i;
        this.b = s16;
        this.c = frameLayout;
        this.d = s162;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setTag(o1a.m, (Object) null);
                this.b.invoke();
                return;
            case 1:
                this.c.requestLayout();
                ((s16) this.d).invoke();
                return;
            default:
                this.c.requestLayout();
                ((s16) this.d).invoke();
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setTag(o1a.m, (Object) null);
                this.b.invoke();
                return;
            case 1:
                z0b z0b = this.c;
                z0b.requestLayout();
                ((s16) this.d).invoke();
                z0b.w0 = null;
                return;
            default:
                b7e b7e = this.c;
                b7e.requestLayout();
                ((s16) this.d).invoke();
                b7e.c = null;
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                this.c.setTag(o1a.m, (String) this.d);
                return;
            case 1:
                this.b.invoke();
                return;
            default:
                this.b.invoke();
                return;
        }
    }

    public sg(View view, int i, String str, u61 u61) {
        this.a = 0;
        this.c = view;
        this.d = str;
        this.b = u61;
    }
}
