package defpackage;

import android.animation.Animator;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: qaa  reason: default package */
public final class qaa implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ raa b;

    public /* synthetic */ qaa(raa raa, int i) {
        this.a = i;
        this.b = raa;
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

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bm3.H((View) this.b.G0.getValue());
                return;
            default:
                raa raa = this.b;
                ((AppCompatEditText) raa.G0.getValue()).setHint(raa.w0);
                raa.E0 = paa.c;
                oaa oaa = raa.y0;
                if (oaa != null) {
                    oaa.n();
                    return;
                }
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            default:
                raa raa = this.b;
                t97 t97 = raa.I0;
                int i = 8;
                if (t97.a()) {
                    ((ImageView) t97.getValue()).setVisibility(8);
                }
                t97 t972 = raa.H0;
                if (t972.a()) {
                    ((AppCompatImageView) t972.getValue()).setVisibility(8);
                }
                ((View) raa.F0.getValue()).setVisibility(0);
                View view = (View) raa.J0.getValue();
                t97 t973 = raa.G0;
                Editable text = ((AppCompatEditText) t973.getValue()).getText();
                if (!(text == null || text.length() == 0)) {
                    i = 0;
                }
                view.setVisibility(i);
                ((View) t973.getValue()).setVisibility(0);
                raa.E0 = paa.o;
                return;
        }
    }
}
