package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: hca  reason: default package */
public final class hca extends ConstraintLayout implements mhe {
    public static final /* synthetic */ k77[] R0;
    public final gca K0 = new gca(this, 0);
    public final gca L0 = new gca(this, 1);
    public final t97 M0;
    public final t97 N0;
    public final t97 O0;
    public final AppCompatTextView P0;
    public final t97 Q0;

    static {
        Class<hca> cls = hca.class;
        R0 = new k77[]{new hc9(cls, "leftElement", "getLeftElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Left;"), c3d.g(m7c.a, cls, "rightElement", "getRightElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Right;")};
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.constraintlayout.widget.ConstraintLayout, hca, android.view.View] */
    public hca(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M0 = ez3.O(3, new t2a(context, 3));
        this.N0 = ez3.O(3, new t2a(context, 4));
        this.O0 = ez3.O(3, new t2a(context, 5));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(daa.e);
        appCompatTextView.setLayoutParams(new re3(a24.X(((float) 0) * dh4.c().getDisplayMetrics().density), -2));
        nte.k.b(appCompatTextView, yq4.b);
        s59 s59 = km4.y0;
        s59.r(appCompatTextView);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setMaxLines(2);
        this.P0 = appCompatTextView;
        this.Q0 = ez3.O(3, new t2a(context, 6));
        setId(daa.b);
        setLayoutParams(new re3(-1, -2));
        setMinimumHeight(a24.X(((float) 56) * dh4.c().getDisplayMetrics().density));
        int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        setPadding(X, X, X, X);
        setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 16.0f));
        setBackgroundColor(s59.r(this).b().c);
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [cv3, android.view.View] */
    /* access modifiers changed from: private */
    public final void setLeft(zba zba) {
        if (zba instanceof vba) {
            setupLeftContrastIcon(((vba) zba).a);
        } else if (zba instanceof xba) {
            setupLeftNegativeIcon(((xba) zba).a);
        } else {
            boolean z = zba instanceof uba;
            t97 t97 = this.M0;
            if (z) {
                uba uba = (uba) zba;
                int i = uba.a;
                AppCompatImageView appCompatImageView = (AppCompatImageView) t97.getValue();
                appCompatImageView.setId(daa.c);
                appCompatImageView.setImageDrawable(gq3.b(appCompatImageView.getContext(), i));
                appCompatImageView.setImageTintList(ColorStateList.valueOf(uba.b));
                jjd.f(this, appCompatImageView, (Integer) null);
            } else if (zba instanceof yba) {
                ? r6 = (cv3) this.N0.getValue();
                r6.setId(daa.c);
                float f = (float) 28;
                r6.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
                r6.setMaxValue(MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                jjd.f(this, r6, (Integer) null);
            } else if (!(zba instanceof wba)) {
                throw new NoWhenBranchMatchedException();
            } else if (t97.a()) {
                ((AppCompatImageView) t97.getValue()).setVisibility(8);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [hca, android.view.ViewGroup] */
    /* access modifiers changed from: private */
    public final void setRight(eca eca) {
        boolean f = hhd.f(eca, aca.a);
        t97 t97 = this.O0;
        if (f) {
            OneMeButton oneMeButton = (OneMeButton) t97.getValue();
            oneMeButton.setId(daa.d);
            oneMeButton.setText(eaa.a);
            oneMeButton.setMode(u0a.o);
            jjd.f(this, oneMeButton, (Integer) null);
        } else if (hhd.f(eca, bca.a)) {
            OneMeButton oneMeButton2 = (OneMeButton) t97.getValue();
            oneMeButton2.setId(daa.d);
            oneMeButton2.d(Integer.valueOf(phc.G0), true);
            oneMeButton2.setMode(u0a.c);
            jjd.f(this, oneMeButton2, (Integer) null);
        } else if (hhd.f(eca, cca.a)) {
            if (t97.a()) {
                ((OneMeButton) t97.getValue()).setVisibility(8);
            }
        } else if (eca instanceof dca) {
            setupRightTextButton(((dca) eca).a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [hca, android.view.ViewGroup] */
    private final void setupLeftContrastIcon(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.M0.getValue();
        appCompatImageView.setId(daa.c);
        appCompatImageView.setImageDrawable(gq3.b(appCompatImageView.getContext(), i));
        km4.y0.r(appCompatImageView);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        jjd.f(this, appCompatImageView, (Integer) null);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [hca, android.view.ViewGroup] */
    private final void setupLeftNegativeIcon(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.M0.getValue();
        appCompatImageView.setId(daa.c);
        appCompatImageView.setImageDrawable(gq3.b(appCompatImageView.getContext(), i));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(km4.y0.r(appCompatImageView).getIcon().c));
        jjd.f(this, appCompatImageView, (Integer) null);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [hca, android.view.ViewGroup] */
    private final void setupRightTextButton(mge mge) {
        OneMeButton oneMeButton = (OneMeButton) this.O0.getValue();
        oneMeButton.setId(daa.d);
        oneMeButton.setText(mge.a(oneMeButton.getContext()));
        oneMeButton.setMode(u0a.o);
        jjd.f(this, oneMeButton, (Integer) null);
    }

    public final zba getLeftElement() {
        k77 k77 = R0[0];
        return (zba) this.K0.b;
    }

    public final eca getRightElement() {
        k77 k77 = R0[1];
        return (eca) this.L0.b;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [hca, android.view.View] */
    public final void onThemeChanged(pda pda) {
        setBackgroundColor(pda.b().c);
        Integer num = -1;
        this.P0.setTextColor(-1);
        t97 t97 = this.M0;
        if (t97.a()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) t97.getValue();
            zba leftElement = getLeftElement();
            if (!(leftElement instanceof vba)) {
                if (leftElement instanceof xba) {
                    num = Integer.valueOf(pda.getIcon().c);
                } else if (!(leftElement instanceof yba)) {
                    if (leftElement instanceof uba) {
                        num = Integer.valueOf(((uba) leftElement).b);
                    } else if (hhd.f(leftElement, wba.a)) {
                        num = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if (num != null) {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(num.intValue()));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [hca, android.view.ViewGroup] */
    public final void setCaption(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.Q0.getValue();
        appCompatTextView.setId(daa.a);
        appCompatTextView.setText(charSequence);
        int i = 0;
        if (charSequence == null) {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        jjd.f(this, appCompatTextView, (Integer) null);
        y();
    }

    public final void setLeftElement(zba zba) {
        this.K0.o1(this, R0[0], zba);
    }

    public final void setRightBtnAction$snackbar_release(View.OnClickListener onClickListener) {
        t97 t97 = this.O0;
        if (t97.a()) {
            OneMeButton oneMeButton = (OneMeButton) t97.getValue();
            if (onClickListener == null) {
                oneMeButton.setOnClickListener((View.OnClickListener) null);
            } else {
                a24.a0(oneMeButton, onClickListener);
            }
        }
    }

    public final void setRightElement(eca eca) {
        this.L0.o1(this, R0[1], eca);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [hca, android.view.ViewGroup] */
    public final void setTitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.P0;
        appCompatTextView.setText(charSequence);
        jjd.f(this, appCompatTextView, (Integer) null);
        y();
    }

    public final void y() {
        boolean z = ek8.L(this.M0) || ek8.L(this.N0);
        t97 t97 = this.O0;
        boolean L = ek8.L(t97);
        t97 t972 = this.Q0;
        boolean L2 = ek8.L(t972);
        bf3 p = a06.p(this);
        AppCompatTextView appCompatTextView = this.P0;
        og0 og0 = new og0(appCompatTextView.getId(), 4, p);
        if (z) {
            hr1.q((float) 12, dh4.c().getDisplayMetrics().density, og0.C(daa.c));
        } else {
            og0.D(0);
        }
        og0.G(0);
        if (L) {
            hr1.q((float) 12, dh4.c().getDisplayMetrics().density, og0.q(((OneMeButton) t97.getValue()).getId()));
        } else {
            og0.p(0);
        }
        if (L2) {
            og0.f(((AppCompatTextView) t972.getValue()).getId());
        } else {
            og0.e(0);
        }
        if (z) {
            og0 og02 = new og0(daa.c, 4, p);
            og02.D(0);
            og02.G(0);
            og02.e(0);
        }
        if (L2) {
            og0 og03 = new og0(((AppCompatTextView) t972.getValue()).getId(), 4, p);
            if (z) {
                hr1.q((float) 12, dh4.c().getDisplayMetrics().density, og03.C(daa.c));
            } else {
                og03.D(0);
            }
            if (L) {
                hr1.q((float) 12, dh4.c().getDisplayMetrics().density, og03.q(((OneMeButton) t97.getValue()).getId()));
            } else {
                og03.p(0);
            }
            hr1.q((float) 2, dh4.c().getDisplayMetrics().density, og03.E(appCompatTextView.getId()));
        }
        if (L) {
            og0 og04 = new og0(((OneMeButton) t97.getValue()).getId(), 4, p);
            og04.G(0);
            og04.p(0);
            og04.e(0);
        }
        p.a(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [hca, android.view.View] */
    public final void setTitle(int i) {
        setTitle((CharSequence) d8.u(getContext(), i));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [hca, android.view.View] */
    public final void setCaption(int i) {
        setCaption((CharSequence) d8.u(getContext(), i));
    }
}
