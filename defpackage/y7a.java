package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: y7a  reason: default package */
public final class y7a extends LinearLayout implements mhe {
    public final EditText A0;
    public z2 B0;
    public x7a a;
    public u16 b;
    public v3a c;
    public final p7c o = new p7c("^[+\\d][\\d\\s\\u00A0-]*$");
    public boolean w0;
    public final AppCompatImageView x0;
    public final AppCompatTextView y0;
    public final AppCompatImageView z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y7a(android.content.Context r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            r3 = 1
            r4 = 0
            r0.<init>(r1, r4)
            p7c r5 = new p7c
            java.lang.String r6 = "^[+\\d][\\d\\s\\u00A0-]*$"
            r5.<init>(r6)
            r0.o = r5
            w7a r5 = new w7a
            r5.<init>(r0)
            android.text.InputFilter[] r6 = new android.text.InputFilter[r3]
            r6[r2] = r5
            androidx.appcompat.widget.AppCompatImageView r5 = new androidx.appcompat.widget.AppCompatImageView
            r5.<init>(r1, r4)
            int r7 = android.view.View.generateViewId()
            r5.setId(r7)
            r0.x0 = r5
            androidx.appcompat.widget.AppCompatTextView r7 = new androidx.appcompat.widget.AppCompatTextView
            r7.<init>(r1, r4)
            int r8 = defpackage.qhc.O
            r7.setId(r8)
            nge r8 = defpackage.nte.k
            r8.b(r7, defpackage.yq4.b)
            r9 = 4
            float r9 = (float) r9
            android.content.res.Resources r10 = defpackage.dh4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r9
            int r10 = a24.X(r10)
            float r11 = (float) r2
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r12 = r12 * r11
            int r12 = a24.X(r12)
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r9 = r9 * r13
            int r9 = a24.X(r9)
            android.content.res.Resources r13 = defpackage.dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r11 = r11 * r13
            int r11 = a24.X(r11)
            r7.setPadding(r10, r12, r9, r11)
            r0.y0 = r7
            androidx.appcompat.widget.AppCompatImageView r9 = new androidx.appcompat.widget.AppCompatImageView
            r9.<init>(r1, r4)
            int r10 = android.view.View.generateViewId()
            r9.setId(r10)
            int r10 = defpackage.phc.Y
            r9.setImageResource(r10)
            r0.z0 = r9
            tka r10 = new tka
            e98 r11 = new e98
            r12 = 10
            r11.<init>(r12, r0)
            r10.<init>(r1, r11)
            android.widget.EditText r11 = new android.widget.EditText
            r11.<init>(r1)
            int r1 = defpackage.qhc.P
            r11.setId(r1)
            r11.setPadding(r2, r2, r2, r2)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r12 = -1
            r13 = -2
            r1.<init>(r12, r13)
            r14 = 8
            float r14 = (float) r14
            android.content.res.Resources r15 = defpackage.dh4.c()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r15.density
            float r14 = r14 * r15
            int r14 = a24.X(r14)
            r1.setMargins(r14, r2, r2, r2)
            r11.setLayoutParams(r1)
            r8.b(r11, defpackage.yq4.b)
            java.lang.String r1 = "phone"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r11.setAutofillHints(r1)
            r11.setBackground(r4)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r2)
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            double r14 = (double) r4
            r16 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r14 = r14 * r16
            int r4 = a24.W(r14)
            int r8 = r11.getLineHeight()
            r1.setSize(r4, r8)
            r11.setTextCursorDrawable(r1)
            r11.setFilters(r6)
            java.lang.String r1 = "0123456789 -()"
            android.text.method.DigitsKeyListener r1 = android.text.method.DigitsKeyListener.getInstance(r1)
            r11.setKeyListener(r1)
            r11.setImportantForAutofill(r3)
            r1 = 3
            r11.setInputType(r1)
            r11.setSingleLine(r3)
            r11.setSaveEnabled(r2)
            r11.setFocusable(r3)
            r11.setFocusableInTouchMode(r3)
            r11.setCustomSelectionActionModeCallback(r10)
            r11.setCustomInsertionActionModeCallback(r10)
            tz2 r1 = new tz2
            r4 = 2
            r1.<init>(r4, r0)
            r11.setOnFocusChangeListener(r1)
            ru8 r1 = new ru8
            r1.<init>(r3, r0)
            r11.setOnKeyListener(r1)
            r0.A0 = r11
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r12, r13)
            r0.setLayoutParams(r1)
            r1 = 16
            r0.setGravity(r1)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r1
            int r4 = a24.X(r4)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r1 = r1 * r6
            int r1 = a24.X(r1)
            int r6 = r18.getPaddingTop()
            int r8 = r18.getPaddingBottom()
            r0.setPadding(r4, r6, r1, r8)
            r0.setOrientation(r2)
            r1 = 52
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = a24.X(r1)
            r0.setMinimumHeight(r1)
            r0.setClipToOutline(r3)
            eu3 r1 = new eu3
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r3
            r1.<init>(r2)
            r0.setOutlineProvider(r1)
            r0.addView(r5)
            r0.addView(r7)
            r0.addView(r9)
            r0.addView(r11)
            s59 r1 = km4.y0
            pda r1 = r1.r(r0)
            r0.onThemeChanged(r1)
            z2 r1 = new z2
            r2 = 5
            r1.<init>(r2, r0)
            r11.addTextChangedListener(r1)
            r0.B0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7a.<init>(android.content.Context):void");
    }

    public final String getCode() {
        return String.valueOf(this.y0.getText());
    }

    public final u16 getOnWindowFocusChanged() {
        return this.b;
    }

    public final String getPhone() {
        CharSequence text = this.y0.getText();
        Editable text2 = this.A0.getText();
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(text2);
        return sb.toString();
    }

    public final x7a getPhoneFormatterProvider() {
        return this.a;
    }

    public final String getPhoneWithoutCode() {
        return String.valueOf(this.A0.getText());
    }

    public final void onDetachedFromWindow() {
        this.A0.removeTextChangedListener(this.B0);
        this.B0 = null;
        this.a = null;
        super.onDetachedFromWindow();
    }

    public final void onThemeChanged(pda pda) {
        setBackgroundColor(pda.b().a.g);
        EditText editText = this.A0;
        Drawable textCursorDrawable = editText.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(-16745729));
        }
        editText.setTextColor(pda.getText().e);
        editText.setHintTextColor(pda.getText().f);
        this.z0.setImageTintList(ColorStateList.valueOf(pda.getIcon().i));
        this.y0.setTextColor(pda.getText().e);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        u16 u16 = this.b;
        if (u16 != null) {
            u16.invoke(Boolean.valueOf(z));
        }
    }

    public final void setCountry(v3a v3a) {
        Drawable drawable;
        this.c = v3a;
        AppCompatImageView appCompatImageView = this.x0;
        Integer num = v3a.o;
        if (num != null) {
            drawable = gq3.b(getContext(), num.intValue());
        } else {
            drawable = null;
        }
        appCompatImageView.setImageDrawable(drawable);
        AppCompatTextView appCompatTextView = this.y0;
        appCompatTextView.setText("+" + v3a.b);
    }

    public final void setHint(CharSequence charSequence) {
        this.A0.setHint(charSequence);
    }

    public final void setOnCountryViewClickListener(s16 s16) {
        q6 q6Var = new q6(16, s16);
        this.x0.setOnClickListener(q6Var);
        this.y0.setOnClickListener(q6Var);
        this.z0.setOnClickListener(q6Var);
    }

    public final void setOnWindowFocusChanged(u16 u16) {
        this.b = u16;
    }

    public final void setPhoneFormatterProvider(x7a x7a) {
        this.a = x7a;
    }

    public final void setText(CharSequence charSequence) {
        EditText editText = this.A0;
        editText.setText(charSequence, TextView.BufferType.NORMAL);
        try {
            editText.setSelection(charSequence.length());
        } catch (IndexOutOfBoundsException e) {
            udd.s(y7a.class.getName(), e.toString(), e);
        }
    }
}
