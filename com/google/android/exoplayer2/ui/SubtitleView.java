package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout implements gya {
    public x1e A0;
    public View B0;
    public List a = Collections.emptyList();
    public mw1 b = mw1.g;
    public int c = 0;
    public float o = 0.0533f;
    public float w0 = 0.08f;
    public boolean x0 = true;
    public boolean y0 = true;
    public int z0;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        jw1 jw1 = new jw1(context);
        this.A0 = jw1;
        this.B0 = jw1;
        addView(jw1);
        this.z0 = 1;
    }

    private List<tw3> getCuesWithStylingPreferencesApplied() {
        if (this.x0 && this.y0) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            rw3 a2 = ((tw3) this.a.get(i)).a();
            if (!this.x0) {
                a2.n = false;
                CharSequence charSequence = a2.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a2.a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = a2.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof e97)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                e07.J(a2);
            } else if (!this.y0) {
                e07.J(a2);
            }
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (mze.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private mw1 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        mw1 mw1;
        int i = mze.a;
        mw1 mw12 = mw1.g;
        if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return mw12;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i >= 21) {
            int i2 = -1;
            int i3 = userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1;
            int i4 = userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216;
            int i5 = 0;
            int i6 = userStyle.hasWindowColor() ? userStyle.windowColor : 0;
            if (userStyle.hasEdgeType()) {
                i5 = userStyle.edgeType;
            }
            int i7 = i5;
            if (userStyle.hasEdgeColor()) {
                i2 = userStyle.edgeColor;
            }
            mw1 = new mw1(i3, i4, i6, i7, i2, userStyle.getTypeface());
        } else {
            mw1 = new mw1(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return mw1;
    }

    private <T extends View & x1e> void setView(T t) {
        removeView(this.B0);
        View view = this.B0;
        if (view instanceof zpf) {
            ((zpf) view).b.destroy();
        }
        this.B0 = t;
        this.A0 = (x1e) t;
        addView(t);
    }

    public final void a() {
        this.A0.a(getCuesWithStylingPreferencesApplied(), this.b, this.o, this.c, this.w0);
    }

    public final void k(List list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.y0 = z;
        a();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.x0 = z;
        a();
    }

    public void setBottomPaddingFraction(float f) {
        this.w0 = f;
        a();
    }

    public void setCues(List<tw3> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        a();
    }

    public void setFractionalTextSize(float f) {
        this.c = 0;
        this.o = f;
        a();
    }

    public void setStyle(mw1 mw1) {
        this.b = mw1;
        a();
    }

    public void setViewType(int i) {
        if (this.z0 != i) {
            if (i == 1) {
                setView(new jw1(getContext()));
            } else if (i == 2) {
                setView(new zpf(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.z0 = i;
        }
    }
}
