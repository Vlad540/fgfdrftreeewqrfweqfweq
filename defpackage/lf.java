package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: lf  reason: default package */
public final class lf implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lf(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
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

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                nf nfVar = (nf) this.b;
                nfVar.o = null;
                nf.a(nfVar, (OneMeButton) this.c);
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                nf nfVar = (nf) obj2;
                nfVar.o = null;
                nf.a(nfVar, (OneMeButton) obj);
                return;
            case 1:
                return;
            case 2:
                k77[] k77Arr = FakeInAppReviewBottomSheet.L0;
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                fakeInAppReviewBottomSheet.getClass();
                ((ConstraintLayout) fakeInAppReviewBottomSheet.C0.T0(fakeInAppReviewBottomSheet, FakeInAppReviewBottomSheet.L0[0])).setVisibility(8);
                ((FrameLayout) obj).postDelayed(fakeInAppReviewBottomSheet.J0, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                return;
            case 3:
                ((qu7) obj2).setAlpha(((of) obj).b.floatValue());
                return;
            default:
                raa raa = (raa) obj2;
                ViewGroup.LayoutParams layoutParams = raa.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -2;
                    layoutParams.height = -2;
                    raa.setMinimumHeight(0);
                    raa.setLayoutParams(layoutParams);
                    int ordinal = raa.x0.ordinal();
                    if (ordinal == 0) {
                        View view = (View) raa.I0.getValue();
                        if (!raa.getShouldShowSearchIcon()) {
                            i = 8;
                        }
                        view.setVisibility(i);
                    } else if (ordinal == 1) {
                        View view2 = (View) raa.H0.getValue();
                        if (!raa.getShouldShowSearchIcon()) {
                            i = 8;
                        }
                        view2.setVisibility(i);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((View) raa.F0.getValue()).setVisibility(8);
                    ((View) raa.J0.getValue()).setVisibility(8);
                    ((View) raa.G0.getValue()).setVisibility(8);
                    ((AppCompatEditText) raa.G0.getValue()).setText((CharSequence) null);
                    raa.E0 = paa.a;
                    oaa oaa = raa.y0;
                    if (oaa != null) {
                        oaa.T();
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((i55) this.b).y0 = (Layout) this.c;
                return;
            case 2:
            case 3:
                return;
            default:
                raa raa = (raa) this.b;
                ((AppCompatEditText) raa.G0.getValue()).setHint((CharSequence) null);
                InputMethodManager inputMethodManager = (InputMethodManager) hq3.b((Context) this.c, InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(((AppCompatEditText) raa.G0.getValue()).getWindowToken(), 0);
                }
                raa.E0 = paa.b;
                return;
        }
    }
}
