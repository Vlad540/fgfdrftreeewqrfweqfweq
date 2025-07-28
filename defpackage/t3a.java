package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: t3a  reason: default package */
public final class t3a extends View implements mhe, rt5 {
    public static final /* synthetic */ k77[] S0;
    public int A0;
    public int B0;
    public final int C0;
    public final int D0;
    public final int E0;
    public final GradientDrawable F0;
    public boolean G0;
    public final s3a H0;
    public final s3a I0;
    public final TextPaint J0;
    public final s3a K0;
    public final s3a L0;
    public final s3a M0;
    public long N0;
    public Interpolator O0;
    public int P0;
    public int Q0 = 4;
    public int R0;
    public boolean a;
    public int b = -1;
    public ValueAnimator c;
    public float o = 1.0f;
    public StaticLayout w0;
    public StaticLayout x0;
    public StaticLayout y0;
    public StaticLayout z0;

    static {
        Class<t3a> cls = t3a.class;
        S0 = new k77[]{new hc9(cls, "textFont", "getTextFont()Lone/me/sdk/design/dynamicfont/DynamicFont;"), c3d.g(m7c.a, cls, "typography", "getTypography()Lone/me/sdk/design/TextStyle;"), new hc9(cls, "appearance", "getAppearance()Lone/me/common/counter/OneMeCounter$Appearance;"), new hc9(cls, "hasBackgroundStroke", "getHasBackgroundStroke()Z"), new hc9(cls, "hasBackground", "getHasBackground()Z")};
    }

    public t3a(Context context) {
        super(context, (AttributeSet) null);
        float f = (float) 20;
        this.C0 = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.D0 = a24.X(f * dh4.c().getDisplayMetrics().density);
        this.E0 = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
        float f2 = dh4.c().getDisplayMetrics().density * 20.0f;
        GradientDrawable M = swb.M((Integer) null, (Integer) null, (Integer) null, new float[]{f2, f2, f2, f2, f2, f2, f2, f2});
        this.F0 = M;
        this.H0 = new s3a(this, 0);
        this.I0 = new s3a((Object) nte.n, this);
        TextPaint textPaint = new TextPaint(1);
        nge.c(getTypography(), textPaint, getResources().getDisplayMetrics());
        this.J0 = textPaint;
        this.K0 = new s3a(this, 2);
        this.L0 = new s3a(this, 3);
        this.M0 = new s3a(this, 4);
        this.N0 = 400;
        this.P0 = 255;
        this.R0 = 2;
        setBackground(M);
        f(km4.y0.r(this));
    }

    public static String e(int i) {
        String format;
        String str;
        long j = (long) i;
        int i2 = (j > 1000000000 ? 1 : (j == 1000000000 ? 0 : -1));
        DecimalFormat decimalFormat = a0e.a;
        if (i2 >= 0) {
            format = decimalFormat.format(((double) j) / 1.0E9d);
            str = "B";
        } else if (j >= 1000000) {
            format = decimalFormat.format(((double) j) / 1000000.0d);
            str = "M";
        } else if (j >= 1000) {
            format = decimalFormat.format(((double) j) / 1000.0d);
            str = "K";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            return sb.toString();
        }
        return hr1.g(format, str);
    }

    /* access modifiers changed from: private */
    public final yq4 getTextFont() {
        k77 k77 = S0[0];
        return (yq4) this.H0.b;
    }

    private final nge getTypography() {
        k77 k77 = S0[1];
        return (nge) this.I0.b;
    }

    private final void setCounterWithoutAnimation(int i) {
        this.b = i;
        this.B0 = this.A0;
        String e = e(i);
        int measureText = (int) this.J0.measureText(e);
        this.A0 = measureText;
        this.w0 = i(measureText, e);
        if (this.A0 != this.B0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final void setTextFont(yq4 yq4) {
        this.H0.o1(this, S0[0], yq4);
    }

    private final void setTypographyInternal(nge nge) {
        this.I0.o1(this, S0[1], nge);
    }

    public final void a(yq4 yq4) {
        boolean z = true;
        this.G0 = true;
        setTextFont(yq4);
        getTypography().a(this.J0, getResources().getDisplayMetrics(), yq4);
        int t = hr1.t(this.R0);
        if (t == 0) {
            int i = this.b;
            this.b = -1;
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator == null || !valueAnimator.isStarted()) {
                z = false;
            }
            g(i, z);
        } else if (t == 1) {
            this.R0 = 2;
            ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 != null) {
                valueAnimator2.end();
            }
            this.b = 0;
            this.w0 = null;
            requestLayout();
        } else if (t == 2) {
            h();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.G0 = false;
        requestLayout();
        invalidate();
    }

    public final int c(String str) {
        if (str.length() != 0) {
            String valueOf = String.valueOf(str.charAt(0));
            TextPaint textPaint = this.J0;
            float measureText = textPaint.measureText(valueOf);
            int V = h0e.V(str);
            int i = 1;
            if (1 <= V) {
                while (true) {
                    measureText = Math.max(measureText, textPaint.measureText(String.valueOf(str.charAt(i))));
                    if (i == V) {
                        break;
                    }
                    i++;
                }
            }
            return (int) measureText;
        }
        throw new NoSuchElementException();
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.w0;
        if (staticLayout != null) {
            int save = canvas.save();
            canvas.translate(((float) (canvas.getWidth() - this.A0)) / 2.0f, ((float) (getHeight() - staticLayout.getHeight())) / 2.0f);
            try {
                staticLayout.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(pda r11) {
        /*
            r10 = this;
            boolean r0 = r10.isEnabled()
            android.text.TextPaint r1 = r10.J0
            android.graphics.drawable.GradientDrawable r2 = r10.F0
            r3 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x00bf
            o3a r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            r9 = -1
            if (r0 == 0) goto L_0x0043
            if (r0 == r8) goto L_0x003c
            if (r0 == r7) goto L_0x0035
            if (r0 == r6) goto L_0x0030
            if (r0 != r5) goto L_0x002a
            cfe r0 = r11.getText()
            int r0 = r0.e
            goto L_0x0047
        L_0x002a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x0030:
            r11.getText()
        L_0x0033:
            r0 = r9
            goto L_0x0047
        L_0x0035:
            cfe r0 = r11.getText()
            int r0 = r0.f
            goto L_0x0047
        L_0x003c:
            r11.getText()
            r0 = -15987442(0xffffffffff0c0d0e, float:-1.861597E38)
            goto L_0x0047
        L_0x0043:
            r11.getText()
            goto L_0x0033
        L_0x0047:
            r1.setColor(r0)
            o3a r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0087
            if (r0 == r8) goto L_0x007d
            if (r0 == r7) goto L_0x0074
            if (r0 == r6) goto L_0x006b
            if (r0 != r5) goto L_0x0065
            nd0 r0 = r11.b()
            md0 r0 = r0.a
            int r9 = r0.c
            goto L_0x0093
        L_0x0065:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x006b:
            nd0 r0 = r11.b()
            md0 r0 = r0.a
            int r9 = r0.e
            goto L_0x0093
        L_0x0074:
            nd0 r0 = r11.b()
            md0 r0 = r0.a
            int r9 = r0.g
            goto L_0x0093
        L_0x007d:
            nd0 r0 = r11.b()
            md0 r0 = r0.a
            r0.getClass()
            goto L_0x0093
        L_0x0087:
            nd0 r0 = r11.b()
            md0 r0 = r0.a
            r0.getClass()
            r9 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
        L_0x0093:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r9)
            r2.setColor(r0)
            boolean r0 = r10.getHasBackgroundStroke()
            if (r0 == 0) goto L_0x0172
            android.content.res.Resources r0 = dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            double r5 = (double) r0
            double r5 = r5 * r3
            int r0 = defpackage.a24.W(r5)
            r0e r11 = r11.h()
            int r11 = r11.f
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
            r2.setStroke(r0, r11)
            goto L_0x0172
        L_0x00bf:
            o3a r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00fb
            if (r0 == r8) goto L_0x00f2
            if (r0 == r7) goto L_0x00e9
            if (r0 == r6) goto L_0x00e0
            if (r0 != r5) goto L_0x00da
            ord r0 = r11.c()
            qrd r0 = r0.c
            int r0 = r0.h
            goto L_0x0103
        L_0x00da:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x00e0:
            ord r0 = r11.c()
            qrd r0 = r0.c
            int r0 = r0.e
            goto L_0x0103
        L_0x00e9:
            ord r0 = r11.c()
            qrd r0 = r0.c
            int r0 = r0.h
            goto L_0x0103
        L_0x00f2:
            ord r0 = r11.c()
            qrd r0 = r0.c
            int r0 = r0.h
            goto L_0x0103
        L_0x00fb:
            ord r0 = r11.c()
            qrd r0 = r0.c
            int r0 = r0.e
        L_0x0103:
            r1.setColor(r0)
            o3a r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0140
            if (r0 == r8) goto L_0x0137
            if (r0 == r7) goto L_0x0130
            if (r0 == r6) goto L_0x0127
            if (r0 != r5) goto L_0x0121
            ord r0 = r11.c()
            nrd r0 = r0.a
            int r0 = r0.h
            goto L_0x0148
        L_0x0121:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x0127:
            ord r0 = r11.c()
            nrd r0 = r0.a
            int r0 = r0.j
            goto L_0x0148
        L_0x0130:
            nd0 r0 = r11.b()
            int r0 = r0.j
            goto L_0x0148
        L_0x0137:
            ord r0 = r11.c()
            nrd r0 = r0.a
            int r0 = r0.i
            goto L_0x0148
        L_0x0140:
            ord r0 = r11.c()
            nrd r0 = r0.a
            int r0 = r0.r
        L_0x0148:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.setColor(r0)
            boolean r0 = r10.getHasBackgroundStroke()
            if (r0 == 0) goto L_0x0172
            android.content.res.Resources r0 = dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            double r5 = (double) r0
            double r5 = r5 * r3
            int r0 = defpackage.a24.W(r5)
            r0e r11 = r11.h()
            int r11 = r11.f
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
            r2.setStroke(r0, r11)
        L_0x0172:
            int r11 = r1.getColor()
            int r11 = r11 >> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10.P0 = r11
            r10.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3a.f(pda):void");
    }

    public final void g(int i, boolean z) {
        int i2;
        int i3;
        if (i != this.b && !hhd.f(e(i), e(this.b))) {
            this.R0 = 1;
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z || this.R0 == 2 || ((i2 = this.b) == 0 && i > 0)) {
                setCounterWithoutAnimation(i);
                return;
            }
            if (i2 < 0) {
                this.J0.setAlpha(0);
                this.F0.setAlpha(0);
                i3 = 1;
            } else {
                i3 = 3;
            }
            this.Q0 = i3;
            this.o = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            int i4 = this.Q0;
            int[] iArr = r3a.$EnumSwitchMapping$0;
            ofFloat.setInterpolator(iArr[hr1.t(i4)] == 1 ? this.O0 : null);
            ofFloat.setDuration(iArr[hr1.t(this.Q0)] == 1 ? this.N0 : 150);
            ofFloat.addUpdateListener(new c00(13, (Object) this));
            ofFloat.addListener(new eh(ofFloat, 0, new qk8(12, this)));
            this.c = ofFloat;
            String e = e(i);
            String e2 = e(this.b);
            if (this.w0 != null) {
                if (e2.length() == e.length()) {
                    int c2 = c(e2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(e2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(e);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(e);
                    int length = e2.length();
                    for (int i5 = 0; i5 < length; i5++) {
                        if (e2.charAt(i5) == e.charAt(i5)) {
                            int i6 = i5 + 1;
                            spannableStringBuilder.setSpan(new ReplacementSpan(), i5, i6, 0);
                            spannableStringBuilder2.setSpan(new ReplacementSpan(), i5, i6, 0);
                            spannableStringBuilder3.setSpan(new q3a(c2), i5, i6, 0);
                        } else {
                            int i7 = i5 + 1;
                            spannableStringBuilder.setSpan(new q3a(c2), i5, i7, 0);
                            spannableStringBuilder2.setSpan(new q3a(c2), i5, i7, 0);
                            spannableStringBuilder3.setSpan(new ReplacementSpan(), i5, i7, 0);
                        }
                    }
                    int length2 = e2.length() * c2;
                    this.x0 = i(length2, spannableStringBuilder);
                    this.z0 = i(length2, spannableStringBuilder3);
                    this.y0 = i(length2, spannableStringBuilder2);
                } else {
                    this.x0 = this.w0;
                }
            }
            this.B0 = this.A0;
            this.a = i > this.b;
            ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            if (i >= 0) {
                int c3 = c(e);
                this.A0 = e.length() * c3;
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(e);
                int length3 = e.length();
                int i8 = 0;
                while (i8 < length3) {
                    int i9 = i8 + 1;
                    spannableStringBuilder4.setSpan(new q3a(c3), i8, i9, 0);
                    i8 = i9;
                }
                this.w0 = i(this.A0, spannableStringBuilder4);
            }
            this.b = i;
            if (this.A0 != this.B0) {
                requestLayout();
            }
        }
    }

    public final o3a getAppearance() {
        k77 k77 = S0[2];
        return (o3a) this.K0.b;
    }

    public final boolean getHasBackground() {
        k77 k77 = S0[4];
        return ((Boolean) this.M0.b).booleanValue();
    }

    public final boolean getHasBackgroundStroke() {
        k77 k77 = S0[3];
        return ((Boolean) this.L0.b).booleanValue();
    }

    public final long getReplaceDuration() {
        return this.N0;
    }

    public final Interpolator getReplaceInterpolator() {
        return this.O0;
    }

    public final void h() {
        this.R0 = 3;
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.b = 0;
        int measureText = (int) this.J0.measureText("!");
        this.A0 = measureText;
        this.w0 = i(measureText, "!");
        if (this.A0 != this.B0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final StaticLayout i(int i, CharSequence charSequence) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.J0, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setMaxLines(1).build();
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        float f = this.o;
        boolean z = false;
        boolean z2 = !(f == 1.0f);
        TextPaint textPaint = this.J0;
        if (!z2 || !((i = this.Q0) == 1 || i == 2)) {
            if (!(!(f == 1.0f)) || this.Q0 != 3) {
                if (f == 1.0f) {
                    z = true;
                }
                if (!(!z)) {
                    d(canvas);
                    return;
                }
                return;
            }
            float f2 = f * ((float) 2);
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            canvas.save();
            StaticLayout staticLayout = this.y0;
            if (staticLayout != null) {
                float height = (((float) (getHeight() - staticLayout.getHeight())) / 2.0f) + ((1.0f - f2) * ((float) a24.X((this.a ? (float) 13 : (float) -13) * dh4.c().getDisplayMetrics().density)));
                int save = canvas.save();
                canvas.translate(((float) (canvas.getWidth() - this.A0)) / 2.0f, height);
                try {
                    textPaint.setAlpha((int) (((float) this.P0) * f2));
                    staticLayout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            } else {
                StaticLayout staticLayout2 = this.w0;
                if (staticLayout2 != null) {
                    float height2 = (((float) (getHeight() - staticLayout2.getHeight())) / 2.0f) + ((1.0f - f2) * ((float) a24.X((this.a ? (float) 13 : (float) -13) * dh4.c().getDisplayMetrics().density)));
                    int save2 = canvas.save();
                    canvas.translate(((float) (canvas.getWidth() - this.A0)) / 2.0f, height2);
                    try {
                        textPaint.setAlpha((int) (((float) this.P0) * f2));
                        staticLayout2.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save2);
                    }
                }
            }
            StaticLayout staticLayout3 = this.x0;
            if (staticLayout3 != null) {
                float height3 = (((float) (getHeight() - staticLayout3.getHeight())) / 2.0f) + (((float) a24.X((this.a ? (float) -13 : (float) 13) * dh4.c().getDisplayMetrics().density)) * f2);
                int save3 = canvas.save();
                canvas.translate(((float) (canvas.getWidth() - this.A0)) / 2.0f, height3);
                try {
                    textPaint.setAlpha((int) ((1.0f - f2) * ((float) this.P0)));
                    staticLayout3.draw(canvas);
                } finally {
                    canvas.restoreToCount(save3);
                }
            }
            StaticLayout staticLayout4 = this.z0;
            if (staticLayout4 != null) {
                int save4 = canvas.save();
                canvas.translate(((float) (canvas.getWidth() - this.A0)) / 2.0f, ((float) (getHeight() - this.z0.getHeight())) / 2.0f);
                try {
                    textPaint.setAlpha(this.P0);
                    staticLayout4.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
            textPaint.setAlpha(this.P0);
            canvas.restore();
            return;
        }
        d(canvas);
        this.F0.setAlpha((int) (this.o * ((float) 255)));
        textPaint.setAlpha((int) (this.o * ((float) this.P0)));
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        String e = e(this.b);
        int c2 = c(e) * e.length();
        if (getHasBackground()) {
            int i3 = this.C0;
            c2 = c2 > i3 / 2 ? c2 + (this.E0 * 2) : i3;
        }
        Paint.FontMetrics fontMetrics = this.J0.getFontMetrics();
        setMeasuredDimension(c2, Math.max((int) ((float) Math.ceil((double) (fontMetrics.descent - fontMetrics.ascent))), this.D0));
    }

    public final void onThemeChanged(pda pda) {
        f(pda);
    }

    public final void setAppearance(o3a o3a) {
        this.K0.o1(this, S0[2], o3a);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        f(km4.y0.r(this));
    }

    public final void setHasBackground(boolean z) {
        this.M0.o1(this, S0[4], Boolean.valueOf(z));
    }

    public final void setHasBackgroundStroke(boolean z) {
        this.L0.o1(this, S0[3], Boolean.valueOf(z));
    }

    public final void setReplaceDuration(long j) {
        this.N0 = j;
    }

    public final void setReplaceInterpolator(Interpolator interpolator) {
        this.O0 = interpolator;
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.J0;
        textPaint.setColor(n1g.c0(i, 1.0f));
        this.P0 = textPaint.getAlpha();
        invalidate();
    }

    public final void setTypography(nge nge) {
        setTypographyInternal(nge);
    }
}
