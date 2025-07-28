package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.d;

/* renamed from: la8  reason: default package */
public final class la8 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ la8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                ((d) this.b).k(true);
                return;
            default:
                jb8 jb8 = ((hb8) this.b).B0;
                jb8.N0 = false;
                jb8.o();
                return;
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                return;
            default:
                ((hb8) this.b).B0.N0 = true;
                return;
        }
    }
}
