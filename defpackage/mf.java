package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.video.widgets.FloatingVideoView;

/* renamed from: mf  reason: default package */
public final class mf implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((e50) this.b).D0 = false;
                return;
            case 2:
                i55 i55 = (i55) this.b;
                i55.E0 = null;
                i55.requestLayout();
                return;
            case 3:
                return;
            case 4:
                ao8 ao8 = (ao8) this.b;
                ao8.U0 = null;
                ao8.M0.setForeground((Drawable) null);
                ao8.K().setAlpha(150);
                return;
            case 5:
                owa owa = (owa) this.b;
                owa.b.x(owa.a.getX(), owa.a.getY());
                owa.c();
                return;
            case 6:
                vyb vyb = (vyb) this.b;
                vyb.a = false;
                vyb.b = null;
                return;
            case 7:
            case 8:
                return;
            default:
                ((r6f) this.b).I0 = null;
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return;
            case 1:
                e50 e50 = (e50) obj;
                e50.D0 = false;
                e50.C0 = null;
                return;
            case 2:
                i55 i55 = (i55) obj;
                i55.E0 = null;
                i55.requestLayout();
                return;
            case 3:
                int i = FloatingVideoView.I0;
                FloatingVideoView floatingVideoView = (FloatingVideoView) obj;
                floatingVideoView.getClass();
                i03 i03 = vl.o.a().a;
                WindowManager.LayoutParams layoutParams = floatingVideoView.F0;
                int i2 = layoutParams.x;
                int i3 = layoutParams.y;
                i03.j(i2, "app.video.pip.pos.x");
                i03.j(i3, "app.video.pip.pos.y");
                return;
            case 4:
                ao8 ao8 = (ao8) obj;
                ao8.U0 = null;
                ao8.M0.setForeground((Drawable) null);
                ao8.K().setAlpha(150);
                return;
            case 5:
                owa owa = (owa) obj;
                owa.b.x(owa.a.getX(), owa.a.getY());
                owa.c();
                return;
            case 6:
                vyb vyb = (vyb) obj;
                vyb.a = false;
                vyb.b = null;
                return;
            case 7:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 8:
                ((s16) obj).invoke();
                return;
            default:
                ((r6f) obj).I0 = null;
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [e50, android.view.View] */
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((OneMeButton) this.b).setClickable(false);
                return;
            case 1:
                ((e50) this.b).setVisibility(0);
                return;
            default:
                return;
        }
    }
}
