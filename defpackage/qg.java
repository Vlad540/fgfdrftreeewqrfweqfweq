package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import me.leolin.shortcutbadger.BuildConfig;
import ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView;

/* renamed from: qg  reason: default package */
public final class qg implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qg(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
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

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                Drawable background = ((View) this.c).getBackground();
                if (background != null) {
                    background.setAlpha(this.b);
                    return;
                }
                return;
            case 1:
                return;
            default:
                jkd jkd = (hx6) this.c;
                jkd.B(BuildConfig.FLAVOR);
                jkd.L0.setTextColor(r1g.G(this.b, 1.0f));
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                Drawable background = ((View) obj).getBackground();
                if (background != null) {
                    background.setAlpha(i);
                    return;
                }
                return;
            case 1:
                int i2 = MarkdownMenuView.y0;
                ((MarkdownMenuView) obj).a(i, false);
                return;
            default:
                jkd jkd = (hx6) obj;
                jkd.B(BuildConfig.FLAVOR);
                jkd.L0.setTextColor(r1g.G(i, 1.0f));
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}
