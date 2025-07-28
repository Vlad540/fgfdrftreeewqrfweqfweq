package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: ng  reason: default package */
public final class ng implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ng(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                ((View) this.b).setAnimation((Animation) null);
                return;
            case 1:
                View view = (View) this.b;
                view.setAnimation((Animation) null);
                view.setVisibility(8);
                return;
            case 2:
                ((View) this.b).setAnimation((Animation) null);
                return;
            case 3:
                View view2 = (View) this.b;
                view2.setAnimation((Animation) null);
                view2.setVisibility(8);
                return;
            default:
                ((gt0) this.b).D();
                return;
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                ((View) this.b).setVisibility(0);
                return;
            case 2:
                ((View) this.b).setVisibility(0);
                return;
            case 4:
                ((gt0) this.b).E();
                return;
            default:
                return;
        }
    }
}
