package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import ru.ok.tamtam.nano.Protos;

/* renamed from: f4c  reason: default package */
public final class f4c implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ f4c(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    private final void A(Animator animator) {
    }

    private final void B(Animator animator) {
    }

    private final void C(Animator animator) {
    }

    private final void D(Animator animator) {
    }

    private final void E(Animator animator) {
    }

    private final void F(Animator animator) {
    }

    private final void G(Animator animator) {
    }

    private final void H(Animator animator) {
    }

    private final void I(Animator animator) {
    }

    private final void J(Animator animator) {
    }

    private final void K(Animator animator) {
    }

    private final void L(Animator animator) {
    }

    private final void M(Animator animator) {
    }

    private final void N(Animator animator) {
    }

    private final void O(Animator animator) {
    }

    private final void P(Animator animator) {
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

    private final void x(Animator animator) {
    }

    private final void y(Animator animator) {
    }

    private final void z(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = RecordControlsWidget.m1;
                recordControlsWidget.I0().setVisibility(8);
                RecordControlsWidget.m0(recordControlsWidget).setVisibility(8);
                recordControlsWidget.A0().setText((CharSequence) null);
                recordControlsWidget.B0().setAlpha(1.0f);
                recordControlsWidget.s0().setScaleX(1.0f);
                recordControlsWidget.t0().setAlpha(1.0f);
                j03 l0 = RecordControlsWidget.l0(recordControlsWidget);
                if (l0 != null) {
                    ((MessageWriteWidget) l0).o0(true);
                }
                RecordControlsWidget.n0(recordControlsWidget);
                recordControlsWidget.p0();
                recordControlsWidget.L0().A0.setValue((Object) null);
                return;
            case 1:
                k77[] k77Arr2 = RecordControlsWidget.m1;
                recordControlsWidget.I0().setVisibility(8);
                RecordControlsWidget.m0(recordControlsWidget).setVisibility(8);
                recordControlsWidget.t0().setVisibility(8);
                recordControlsWidget.w0().setScaleX(1.0f);
                recordControlsWidget.w0().setScaleY(1.0f);
                recordControlsWidget.w0().setAlpha(1.0f);
                recordControlsWidget.w0().setVisibility(0);
                recordControlsWidget.J0().setVisibility(8);
                recordControlsWidget.J0().setScaleX(0.0f);
                recordControlsWidget.J0().setScaleY(0.0f);
                recordControlsWidget.x0().setAlpha(1.0f);
                recordControlsWidget.t0().setScaleX(1.0f);
                recordControlsWidget.t0().setScaleY(1.0f);
                recordControlsWidget.t0().setAlpha(1.0f);
                recordControlsWidget.B0().setScaleX(1.0f);
                recordControlsWidget.B0().setScaleY(1.0f);
                recordControlsWidget.B0().setAlpha(1.0f);
                j03 l02 = RecordControlsWidget.l0(recordControlsWidget);
                if (l02 != null) {
                    ((MessageWriteWidget) l02).o0(true);
                }
                RecordControlsWidget.n0(recordControlsWidget);
                recordControlsWidget.p0();
                recordControlsWidget.L0().A0.setValue((Object) null);
                return;
            case 2:
                return;
            case 3:
                k77[] k77Arr3 = RecordControlsWidget.m1;
                recordControlsWidget.w0().setVisibility(8);
                recordControlsWidget.J0().setVisibility(0);
                recordControlsWidget.J0().setAlpha(1.0f);
                return;
            case 4:
                k77[] k77Arr4 = RecordControlsWidget.m1;
                recordControlsWidget.I0().setVisibility(8);
                recordControlsWidget.u0().setAlpha(1.0f);
                ((View) recordControlsWidget.B0.T0(recordControlsWidget, RecordControlsWidget.m1[9])).setAlpha(1.0f);
                recordControlsWidget.H0().setScaleX(1.0f);
                recordControlsWidget.H0().setScaleY(1.0f);
                recordControlsWidget.G0().setScaleX(1.0f);
                recordControlsWidget.G0().setScaleY(1.0f);
                recordControlsWidget.E0().setScaleX(1.0f);
                recordControlsWidget.E0().setScaleY(1.0f);
                GradientDrawable M0 = recordControlsWidget.M0();
                s59 s59 = km4.y0;
                s59.r(recordControlsWidget.x0()).b().a.getClass();
                M0.setColor(r1g.G(-16745729, 0.08f));
                recordControlsWidget.A0().setTextColor(s59.r(recordControlsWidget.q0()).getText().e);
                recordControlsWidget.t0().setScaleX(1.0f);
                recordControlsWidget.t0().setScaleY(1.0f);
                recordControlsWidget.t0().setAlpha(1.0f);
                recordControlsWidget.F0().setVisibility(8);
                recordControlsWidget.u0().setVisibility(8);
                j03 l03 = RecordControlsWidget.l0(recordControlsWidget);
                if (l03 != null) {
                    ((MessageWriteWidget) l03).o0(true);
                }
                RecordControlsWidget.n0(recordControlsWidget);
                recordControlsWidget.p0();
                recordControlsWidget.L0().A0.setValue((Object) null);
                return;
            case 5:
                RecordControlsWidget.m0(recordControlsWidget).setVisibility(8);
                recordControlsWidget.w0().setTranslationY(0.0f);
                recordControlsWidget.w0().setAlpha(1.0f);
                recordControlsWidget.x0().setTranslationY(0.0f);
                recordControlsWidget.x0().setAlpha(1.0f);
                recordControlsWidget.v0().setTranslationY(0.0f);
                recordControlsWidget.v0().setAlpha(1.0f);
                recordControlsWidget.u0().setAlpha(1.0f);
                recordControlsWidget.H0().setTranslationY(0.0f);
                recordControlsWidget.H0().setAlpha(1.0f);
                recordControlsWidget.E0().setTranslationY(0.0f);
                recordControlsWidget.E0().setAlpha(1.0f);
                RecordControlsWidget.o0(recordControlsWidget);
                return;
            case 6:
                return;
            case 7:
                k77[] k77Arr5 = RecordControlsWidget.m1;
                recordControlsWidget.E0().setVisibility(8);
                return;
            case 8:
                return;
            case 9:
                k77[] k77Arr6 = RecordControlsWidget.m1;
                recordControlsWidget.G0().setVisibility(8);
                RecordControlsWidget.o0(recordControlsWidget);
                return;
            case 10:
            case 11:
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                k77[] k77Arr7 = RecordControlsWidget.m1;
                recordControlsWidget.w0().setAlpha(1.0f);
                return;
            default:
                k77[] k77Arr8 = RecordControlsWidget.m1;
                recordControlsWidget.z0().setAlpha(1.0f);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                fnd fnd = recordControlsWidget.d1;
                if (fnd != null) {
                    fnd.b();
                    return;
                }
                return;
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                k77[] k77Arr = RecordControlsWidget.m1;
                recordControlsWidget.H0().setTranslationY(dh4.c().getDisplayMetrics().density * 48.0f);
                recordControlsWidget.H0().setAlpha(0.0f);
                recordControlsWidget.E0().setTranslationY(dh4.c().getDisplayMetrics().density * 48.0f);
                recordControlsWidget.E0().setAlpha(0.0f);
                recordControlsWidget.E0().setVisibility(0);
                recordControlsWidget.G0().setVisibility(8);
                recordControlsWidget.t0().setScaleX(1.0f);
                recordControlsWidget.t0().setScaleY(1.0f);
                wia wia = recordControlsWidget.Z0;
                if (wia != null) {
                    recordControlsWidget.t0().setX(((Number) wia.a).floatValue());
                }
                recordControlsWidget.q0().setImageDrawable((Drawable) recordControlsWidget.R0.getValue());
                recordControlsWidget.z0().setVisibility(0);
                recordControlsWidget.z0().setAlpha(1.0f);
                recordControlsWidget.z0().setScaleX(1.0f);
                recordControlsWidget.z0().setScaleY(1.0f);
                recordControlsWidget.u0().setAlpha(0.0f);
                recordControlsWidget.u0().setVisibility(0);
                return;
            case 7:
                return;
            case 8:
                k77[] k77Arr2 = RecordControlsWidget.m1;
                recordControlsWidget.G0().setVisibility(0);
                recordControlsWidget.E0().setVisibility(0);
                recordControlsWidget.F0().setVisibility(0);
                recordControlsWidget.z0().setVisibility(8);
                AnimatorSet animatorSet = recordControlsWidget.l1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                k77[] k77Arr3 = RecordControlsWidget.m1;
                recordControlsWidget.q0().setImageDrawable((Drawable) recordControlsWidget.R0.getValue());
                recordControlsWidget.z0().setVisibility(0);
                recordControlsWidget.G0().setVisibility(0);
                recordControlsWidget.E0().setVisibility(0);
                return;
            case 11:
                k77[] k77Arr4 = RecordControlsWidget.m1;
                recordControlsWidget.w0().setTranslationX(dh4.c().getDisplayMetrics().density * 72.0f);
                recordControlsWidget.w0().setAlpha(0.0f);
                recordControlsWidget.x0().setTranslationX(dh4.c().getDisplayMetrics().density * 72.0f);
                recordControlsWidget.x0().setAlpha(0.0f);
                recordControlsWidget.v0().setTranslationX(dh4.c().getDisplayMetrics().density * 70.0f);
                recordControlsWidget.v0().setAlpha(0.0f);
                recordControlsWidget.s0().setAlpha(0.0f);
                recordControlsWidget.t0().setScaleX(1.0f);
                recordControlsWidget.t0().setScaleY(1.0f);
                recordControlsWidget.q0().setImageDrawable(recordControlsWidget.D0());
                recordControlsWidget.B0().setAlpha(0.0f);
                recordControlsWidget.B0().setVisibility(0);
                RecordControlsWidget.m0(recordControlsWidget).setVisibility(0);
                recordControlsWidget.t0().setVisibility(0);
                recordControlsWidget.I0().setVisibility(0);
                j03 l0 = RecordControlsWidget.l0(recordControlsWidget);
                if (l0 != null) {
                    ((MessageWriteWidget) l0).o0(false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
