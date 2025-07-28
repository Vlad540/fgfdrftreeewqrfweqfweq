package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: ag  reason: default package */
public final class ag implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public ag(View view, boolean z) {
        this.b = z;
        this.c = view;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setVisibility(this.b ? 0 : 8);
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i = 8;
        boolean z = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                view.setAlpha(1.0f);
                if (z) {
                    i = 0;
                }
                view.setVisibility(i);
                return;
            default:
                k77[] k77Arr = RecordControlsWidget.m1;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) obj;
                recordControlsWidget.w0().setAlpha(1.0f);
                float f = 0.0f;
                recordControlsWidget.w0().setTranslationX(0.0f);
                recordControlsWidget.x0().setAlpha(1.0f);
                recordControlsWidget.x0().setTranslationX(0.0f);
                recordControlsWidget.v0().setAlpha(1.0f);
                recordControlsWidget.v0().setTranslationX(0.0f);
                recordControlsWidget.B0().setAlpha(1.0f);
                Drawable D0 = recordControlsWidget.D0();
                km4.y0.r(recordControlsWidget.q0()).a().o().e.getClass();
                js.D(D0, -1);
                recordControlsWidget.s0().setScaleX(1.0f);
                recordControlsWidget.s0().setScaleY(1.0f);
                recordControlsWidget.s0().setAlpha(1.0f);
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    recordControlsWidget.k1 = animatorSet;
                    animatorSet.playTogether(new Animator[]{z3d.e(recordControlsWidget.w0(), View.ALPHA, 1.0f, 0.0f, 1000, 1000, 2, -1)});
                    AnimatorSet animatorSet2 = recordControlsWidget.k1;
                    if (animatorSet2 != null) {
                        animatorSet2.addListener(new f4c(recordControlsWidget, 12));
                    }
                    AnimatorSet animatorSet3 = recordControlsWidget.k1;
                    if (animatorSet3 != null) {
                        animatorSet3.start();
                    }
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    recordControlsWidget.i1 = animatorSet4;
                    animatorSet4.play(z3d.e(recordControlsWidget.v0(), View.TRANSLATION_X, 0.0f, dh4.c().getDisplayMetrics().density * -4.0f, 1000, 1000, 2, -1));
                    AnimatorSet animatorSet5 = recordControlsWidget.i1;
                    if (animatorSet5 != null) {
                        animatorSet5.start();
                    }
                    recordControlsWidget.j1 = new AnimatorSet();
                    wia wia = recordControlsWidget.a1;
                    if (wia != null) {
                        f = ((Number) wia.b).floatValue();
                    }
                    AnimatorSet animatorSet6 = recordControlsWidget.j1;
                    if (animatorSet6 != null) {
                        animatorSet6.play(z3d.e(recordControlsWidget.B0(), View.TRANSLATION_Y, f, f + ((float) a24.X(((float) 8) * dh4.c().getDisplayMetrics().density)), 1000, 1000, 2, -1));
                    }
                    AnimatorSet animatorSet7 = recordControlsWidget.j1;
                    if (animatorSet7 != null) {
                        animatorSet7.addListener(new tyb(recordControlsWidget, f, 1));
                    }
                    AnimatorSet animatorSet8 = recordControlsWidget.j1;
                    if (animatorSet8 != null) {
                        animatorSet8.start();
                        return;
                    }
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
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ag(RecordControlsWidget recordControlsWidget, boolean z) {
        this.c = recordControlsWidget;
        this.b = z;
    }
}
