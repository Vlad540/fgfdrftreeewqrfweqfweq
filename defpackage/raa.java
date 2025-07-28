package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: raa  reason: default package */
public final class raa extends FrameLayout implements mhe {
    public static final /* synthetic */ int M0 = 0;
    public boolean A0 = true;
    public boolean B0 = true;
    public boolean C0 = true;
    public boolean D0 = true;
    public paa E0 = paa.a;
    public final t97 F0;
    public final t97 G0;
    public final t97 H0;
    public final t97 I0;
    public final t97 J0;
    public final ValueAnimator K0;
    public final ValueAnimator L0;
    public final int a = getResources().getDimensionPixelSize(xmb.spacing_size_s);
    public final int b = getResources().getDimensionPixelSize(xmb.spacing_size_l);
    public final int c = getResources().getDimensionPixelSize(xmb.spacing_size_xl);
    public CharSequence o;
    public String w0 = getResources().getString(xub.oneme_search_view_default_hint);
    public naa x0 = naa.a;
    public oaa y0;
    public boolean z0 = true;

    public raa(Context context) {
        super(context, (AttributeSet) null);
        this.F0 = ez3.O(3, new jaa(context, (AttributeSet) null, this, 0));
        this.G0 = ez3.O(3, new jaa(context, (AttributeSet) null, this, 1));
        this.H0 = ez3.O(3, new jaa(context, (AttributeSet) null, this, 2));
        this.I0 = ez3.O(3, new jaa(context, (AttributeSet) null, this, 3));
        this.J0 = ez3.O(3, new jaa(context, (AttributeSet) null, this, 4));
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{120}).setDuration(120);
        duration.addListener(new qaa(this, 1));
        duration.addUpdateListener(new laa(this, 0));
        this.K0 = duration;
        ValueAnimator duration2 = ValueAnimator.ofInt(new int[]{120}).setDuration(120);
        duration2.addListener(new lf(this, 4, context));
        duration2.addUpdateListener(new laa(this, 1));
        this.L0 = duration2;
    }

    public static void a(Animator animator) {
        ArrayList arrayList = new ArrayList(animator.getListeners());
        animator.removeAllListeners();
        animator.cancel();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            animator.addListener((Animator.AnimatorListener) it.next());
        }
    }

    public final void b() {
        if (this.B0) {
            a(this.K0);
            float f = this.D0 ? 0.0f : 1.0f;
            ValueAnimator valueAnimator = this.L0;
            valueAnimator.setCurrentFraction(f);
            valueAnimator.start();
        }
    }

    public final void c(boolean z) {
        if (this.A0) {
            a(this.L0);
            float f = this.C0 ? 0.0f : 1.0f;
            ValueAnimator valueAnimator = this.K0;
            valueAnimator.setCurrentFraction(f);
            if (z) {
                valueAnimator.addListener(new qaa(this, 0));
            }
            addOnLayoutChangeListener(new mp0(8, this));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
                setMinimumHeight(a24.X(((float) 52) * dh4.c().getDisplayMetrics().density));
                setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void d() {
        c(true);
        oaa oaa = this.y0;
        if (oaa != null) {
            oaa.f();
        }
    }

    public final boolean getCollapseWithAnimation() {
        return this.D0;
    }

    public final boolean getExpandWithAnimation() {
        return this.C0;
    }

    public final boolean getShouldShowSearchIcon() {
        return this.z0;
    }

    public final paa getState() {
        return this.E0;
    }

    public final void onThemeChanged(pda pda) {
        t97 t97 = this.H0;
        if (t97.a()) {
            ((AppCompatImageView) t97.getValue()).setImageTintList(ColorStateList.valueOf(pda.getIcon().f));
        }
        t97 t972 = this.F0;
        if (t972.a()) {
            ((AppCompatImageView) t972.getValue()).setImageTintList(ColorStateList.valueOf(pda.getIcon().f));
        }
        t97 t973 = this.J0;
        if (t973.a()) {
            ((AppCompatImageView) t973.getValue()).setImageTintList(ColorStateList.valueOf(pda.getIcon().i));
        }
        t97 t974 = this.G0;
        if (t974.a()) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) t974.getValue();
            Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                pda.getText();
                js.D(textCursorDrawable, -16745729);
            }
            appCompatEditText.setBackgroundColor(pda.b().a.g);
            appCompatEditText.setHintTextColor(pda.getText().f);
            appCompatEditText.setTextColor(pda.getText().e);
        }
    }

    public final void setCollapseWithAnimation(boolean z) {
        this.D0 = z;
    }

    public final void setCollapsedStyle(naa naa) {
        this.x0 = naa;
        int ordinal = naa.ordinal();
        t97 t97 = this.H0;
        paa paa = paa.a;
        t97 t972 = this.I0;
        int i = 0;
        if (ordinal == 0) {
            if (t97.a()) {
                ((AppCompatImageView) t97.getValue()).setVisibility(8);
            }
            if (this.E0 == paa) {
                View view = (View) t972.getValue();
                if (!this.z0) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        } else if (ordinal == 1) {
            if (t972.a()) {
                ((ImageView) t972.getValue()).setVisibility(8);
            }
            if (this.E0 == paa) {
                View view2 = (View) t97.getValue();
                if (!this.z0) {
                    i = 8;
                }
                view2.setVisibility(i);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setCollapsible(boolean z) {
        this.B0 = z;
    }

    public final void setExpandWithAnimation(boolean z) {
        this.C0 = z;
    }

    public final void setExpandable(boolean z) {
        this.A0 = z;
    }

    public final void setListener(oaa oaa) {
        this.y0 = oaa;
    }

    public final void setSearchHint(String str) {
        this.w0 = str;
        t97 t97 = this.G0;
        if (t97.a()) {
            ((AppCompatEditText) t97.getValue()).setHint(str);
        }
    }

    public final void setSearchText(CharSequence charSequence) {
        this.o = charSequence;
        t97 t97 = this.G0;
        if (t97.a()) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) t97.getValue();
            appCompatEditText.setText(charSequence);
            appCompatEditText.setSelection(appCompatEditText.length());
        }
    }

    public final void setShouldShowSearchIcon(boolean z) {
        this.z0 = z;
    }
}
