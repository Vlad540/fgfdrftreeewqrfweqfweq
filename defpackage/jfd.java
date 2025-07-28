package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.math.BigDecimal;
import java.text.NumberFormat;

/* renamed from: jfd  reason: default package */
public final class jfd extends View {
    public int A0;
    public boolean A1;
    public int B0;
    public boolean B1;
    public int C0;
    public boolean C1;
    public int D0;
    public final Rect D1;
    public int E0;
    public final RectF E1;
    public boolean F0;
    public int F1;
    public boolean G0;
    public int G1;
    public boolean H0;
    public int H1;
    public int I0;
    public final Point I1;
    public int J0;
    public final Point J1;
    public int K0 = -1;
    public final Point K1;
    public int L0;
    public Paint L1;
    public boolean M0;
    public Paint M1;
    public int N0;
    public StaticLayout N1;
    public int O0;
    public final Path O1;
    public boolean P0;
    public final Path P1;
    public boolean Q0;
    public String Q1;
    public boolean R0;
    public boolean R1;
    public long S0;
    public TextPaint S1;
    public boolean T0;
    public NumberFormat T1;
    public boolean U0;
    public ifd U1;
    public float V0;
    public final zg4 V1;
    public int W0;
    public float W1;
    public boolean X0;
    public int Y0;
    public final int Z0;
    public ValueAnimator a;
    public int a1;
    public float b;
    public int b1;
    public float c;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public float h1;
    public float i1;
    public float j1;
    public float k1;
    public float l1;
    public boolean m1;
    public final int n1;
    public float o;
    public boolean o1;
    public float p1;
    public float q1;
    public final Paint r1;
    public final Rect s1;
    public boolean t1 = true;
    public float u1;
    public cfd v1;
    public boolean w0;
    public String[] w1;
    public int x0;
    public boolean x1;
    public int y0;
    public float y1;
    public int z0;
    public float z1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jfd(Context context) {
        super(context, (AttributeSet) null, 0);
        boolean z = false;
        getContext();
        this.V1 = zg4.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, zvb.SignSeekBar, 0, 0);
        this.b = obtainStyledAttributes.getFloat(zvb.SignSeekBar_ssb_min, 0.0f);
        this.c = obtainStyledAttributes.getFloat(zvb.SignSeekBar_ssb_max, 100.0f);
        this.o = obtainStyledAttributes.getFloat(zvb.SignSeekBar_ssb_progress, this.b);
        this.w0 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_is_float_type, false);
        int i = (int) 2.0f;
        this.x0 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_track_size, dh4.b(i));
        this.n1 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_text_space, dh4.b(i));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_second_track_size, dh4.b(i) + this.x0);
        this.y0 = dimensionPixelSize;
        this.z0 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_thumb_radius, dh4.b(i) + dimensionPixelSize);
        this.A0 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_thumb_radius, this.y0 * 2);
        this.W0 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_sign_border_size, dh4.b((int) 1.0f));
        this.E0 = obtainStyledAttributes.getInteger(zvb.SignSeekBar_ssb_section_count, 10);
        int i2 = zvb.SignSeekBar_ssb_track_color;
        int i3 = xhc.a;
        this.B0 = obtainStyledAttributes.getColor(i2, hq3.a(context, i3));
        int color = obtainStyledAttributes.getColor(zvb.SignSeekBar_ssb_second_track_color, hq3.a(context, i3));
        this.C0 = color;
        this.D0 = obtainStyledAttributes.getColor(zvb.SignSeekBar_ssb_thumb_color, color);
        this.H0 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_show_section_text, false);
        this.I0 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_section_text_size, (int) dh4.d(14.0f));
        this.J0 = obtainStyledAttributes.getColor(zvb.SignSeekBar_ssb_section_text_color, this.B0);
        this.R0 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_seek_by_section, false);
        int integer = obtainStyledAttributes.getInteger(zvb.SignSeekBar_ssb_section_text_position, -1);
        if (integer == 0) {
            this.K0 = 0;
        } else if (integer == 1) {
            this.K0 = 1;
        } else if (integer == 2) {
            this.K0 = 2;
        } else {
            this.K0 = -1;
        }
        this.L0 = obtainStyledAttributes.getInteger(zvb.SignSeekBar_ssb_section_text_interval, 1);
        this.M0 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_show_thumb_text, false);
        this.N0 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_thumb_text_size, (int) dh4.d(14.0f));
        this.O0 = obtainStyledAttributes.getColor(zvb.SignSeekBar_ssb_thumb_text_color, this.C0);
        this.a1 = obtainStyledAttributes.getColor(zvb.SignSeekBar_ssb_sign_color, this.C0);
        this.Y0 = obtainStyledAttributes.getColor(zvb.SignSeekBar_ssb_sign_border_color, this.C0);
        this.Z0 = obtainStyledAttributes.getColor(zvb.SignSeekBar_ssb_unusable_color, -7829368);
        this.b1 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_sign_text_size, (int) dh4.d(14.0f));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_sign_height, dh4.b((int) 32.0f));
        this.e1 = dimensionPixelSize2;
        this.d1 = dimensionPixelSize2;
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_sign_width, dh4.b((int) 40.0f));
        this.g1 = dimensionPixelSize3;
        this.f1 = dimensionPixelSize3;
        int i4 = (int) 3.0f;
        this.F1 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_sign_arrow_height, dh4.b(i4));
        this.G1 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_sign_arrow_width, dh4.b((int) 5.0f));
        this.H1 = obtainStyledAttributes.getDimensionPixelSize(zvb.SignSeekBar_ssb_sign_round, dh4.b(i4));
        this.c1 = obtainStyledAttributes.getColor(zvb.SignSeekBar_ssb_sign_text_color, -1);
        this.F0 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_show_section_mark, false);
        this.G0 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_auto_adjust_section_mark, false);
        this.P0 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_show_progress_in_float, false);
        int integer2 = obtainStyledAttributes.getInteger(zvb.SignSeekBar_ssb_anim_duration, -1);
        this.S0 = integer2 < 0 ? 200 : (long) integer2;
        this.Q0 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_touch_to_seek, false);
        this.X0 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_sign_show_border, false);
        int resourceId = obtainStyledAttributes.getResourceId(zvb.SignSeekBar_ssb_sides_labels, 0);
        this.y1 = obtainStyledAttributes.getFloat(zvb.SignSeekBar_ssb_thumb_bg_alpha, 0.2f);
        this.z1 = obtainStyledAttributes.getFloat(zvb.SignSeekBar_ssb_thumb_ratio, 0.7f);
        this.A1 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_show_thumb_shadow, false);
        this.B1 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_show_sign, false);
        this.C1 = obtainStyledAttributes.getBoolean(zvb.SignSeekBar_ssb_sign_arrow_autofloat, true);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.r1 = paint;
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setTextAlign(Paint.Align.CENTER);
        this.s1 = new Rect();
        if (resourceId > 0) {
            this.w1 = getResources().getStringArray(resourceId);
        }
        String[] strArr = this.w1;
        if (strArr != null && strArr.length > 0) {
            z = true;
        }
        this.x1 = z;
        this.E1 = new RectF();
        this.D1 = new Rect();
        this.I1 = new Point();
        this.J1 = new Point();
        this.K1 = new Point();
        Path path = new Path();
        this.O1 = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.P1 = new Path();
        d();
        e();
    }

    private String getMaxText() {
        boolean z = this.w0;
        float f = this.c;
        return z ? String.valueOf(BigDecimal.valueOf((double) f).setScale(1, 4).floatValue()) : String.valueOf((int) f);
    }

    private String getMinText() {
        boolean z = this.w0;
        float f = this.b;
        return z ? String.valueOf(BigDecimal.valueOf((double) f).setScale(1, 4).floatValue()) : String.valueOf((int) f);
    }

    private int getSignAndThumbSpace() {
        this.V1.getClass();
        return dh4.b((int) 1.0f);
    }

    private int getSignOnTouchJumpHeight() {
        this.V1.getClass();
        return dh4.b((int) 10.0f) + this.A0;
    }

    public final void a(boolean z) {
        if (this.B1) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.V0, z ? 1.0f : 0.0f});
            this.a = ofFloat;
            ofFloat.setDuration(100);
            this.a.addUpdateListener(new c00(17, this));
            this.a.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator;
        float f = 0.0f;
        int i = 0;
        while (i <= this.E0) {
            float f2 = this.l1;
            f = (((float) i) * f2) + this.p1;
            float f3 = this.j1;
            if (f <= f3 && f3 - f <= f2) {
                break;
            }
            i++;
        }
        boolean z = BigDecimal.valueOf((double) this.j1).setScale(1, 4).floatValue() == f;
        AnimatorSet animatorSet = new AnimatorSet();
        if (!z) {
            float f4 = this.j1;
            float f5 = this.l1;
            valueAnimator = f4 - f <= f5 / 2.0f ? ValueAnimator.ofFloat(new float[]{f4, f}) : ValueAnimator.ofFloat(new float[]{f4, (((float) (i + 1)) * f5) + this.p1});
            valueAnimator.setInterpolator(new LinearInterpolator());
            valueAnimator.addUpdateListener(new ti0(6, this));
        } else {
            valueAnimator = null;
        }
        if (!z) {
            animatorSet.setDuration(this.S0).playTogether(new Animator[]{valueAnimator});
        }
        animatorSet.addListener(new gfd(this, 1));
        animatorSet.start();
    }

    public final void c() {
        String str;
        String str2;
        if (this.P0) {
            float progressFloat = getProgressFloat();
            str = String.valueOf(progressFloat);
            NumberFormat numberFormat = this.T1;
            if (numberFormat != null) {
                str = numberFormat.format((double) progressFloat);
            }
        } else {
            int progress = getProgress();
            str = String.valueOf(progress);
            NumberFormat numberFormat2 = this.T1;
            if (numberFormat2 != null) {
                str = numberFormat2.format((long) progress);
            }
        }
        ifd ifd = this.U1;
        if (ifd != null) {
            str = ((w06) ifd).a(Float.parseFloat(str));
        } else if (!(str == null || (str2 = this.Q1) == null || str2.isEmpty())) {
            if (!this.R1) {
                String str3 = this.Q1;
                str = str.concat(" <small>" + str3 + "</small> ");
            } else {
                String str4 = this.Q1;
                str = (" " + str4 + " ").concat(str);
            }
        }
        this.N1 = new StaticLayout(Html.fromHtml(str), this.S1, this.f1, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    public final void d() {
        Paint paint = new Paint(1);
        this.L1 = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.L1.setAntiAlias(true);
        this.L1.setColor(this.a1);
        Paint paint2 = new Paint(1);
        this.M1 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.M1.setStrokeWidth((float) this.W0);
        this.M1.setColor(this.Y0);
        this.M1.setAntiAlias(true);
        TextPaint textPaint = new TextPaint(1);
        this.S1 = textPaint;
        textPaint.setStyle(style);
        this.S1.setTextSize((float) this.b1);
        this.S1.setColor(this.c1);
    }

    public final void e() {
        if (this.b == this.c) {
            this.b = 0.0f;
            this.c = 100.0f;
        }
        float f = this.b;
        float f2 = this.c;
        if (f > f2) {
            this.c = f;
            this.b = f2;
        }
        float f3 = this.o;
        float f4 = this.b;
        if (f3 < f4) {
            this.o = f4;
        }
        float f5 = this.o;
        float f6 = this.c;
        if (f5 > f6) {
            this.o = f6;
        }
        int i = this.y0;
        int i2 = this.x0;
        zg4 zg4 = this.V1;
        if (i < i2) {
            zg4.getClass();
            this.y0 = dh4.b((int) 2.0f) + i2;
        }
        int i3 = this.z0;
        int i4 = this.y0;
        if (i3 <= i4) {
            zg4.getClass();
            this.z0 = dh4.b((int) 2.0f) + i4;
        }
        int i5 = this.A0;
        int i6 = this.y0;
        if (i5 <= i6) {
            this.A0 = i6 * 2;
        }
        if (this.E0 <= 0) {
            this.E0 = 10;
        }
        float f7 = this.c - this.b;
        this.h1 = f7;
        float f8 = f7 / ((float) this.E0);
        this.i1 = f8;
        if (f8 < 1.0f) {
            this.w0 = true;
        }
        if (this.w0) {
            this.P0 = true;
        }
        int i7 = this.K0;
        if (i7 != -1) {
            this.H0 = true;
        }
        if (this.H0) {
            if (i7 == -1) {
                this.K0 = 0;
            }
            if (this.K0 == 2) {
                this.F0 = true;
            }
        }
        if (this.L0 < 1) {
            this.L0 = 1;
        }
        if (this.G0 && !this.F0) {
            this.G0 = false;
        }
        if (this.R0) {
            this.u1 = this.o;
            this.F0 = true;
            this.G0 = true;
            this.Q0 = false;
        }
        setProgress(this.o);
        this.N0 = (this.w0 || this.R0 || (this.H0 && this.K0 == 2)) ? this.I0 : this.N0;
    }

    public final void f() {
        String str = null;
        if (this.P0) {
            float progressFloat = getProgressFloat();
            ifd ifd = this.U1;
            if (ifd != null) {
                str = ((w06) ifd).a(progressFloat);
            }
        } else {
            int progress = getProgress();
            ifd ifd2 = this.U1;
            if (ifd2 != null) {
                str = ((w06) ifd2).a((float) progress);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = this.S1;
            int length = str.length();
            Rect rect = this.s1;
            textPaint.getTextBounds(str, 0, length, rect);
            zg4 zg4 = this.V1;
            zg4.getClass();
            int b2 = dh4.b((int) 14.0f);
            zg4.getClass();
            int b3 = dh4.b((int) 7.0f);
            int width = rect.width() + b2 + b2;
            int i = this.g1;
            if (width > i) {
                this.f1 = width;
            } else {
                this.f1 = i;
            }
            int height = rect.height() + b3 + this.F1 + b3;
            int i2 = this.e1;
            if (height > i2) {
                this.d1 = height;
            } else {
                this.d1 = i2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [cfd, java.lang.Object] */
    public cfd getConfigBuilder() {
        if (this.v1 == null) {
            ? obj = new Object();
            obj.a = this;
            this.v1 = obj;
        }
        cfd cfd = this.v1;
        cfd.b = this.b;
        cfd.c = this.c;
        cfd.d = this.o;
        cfd.e = this.w0;
        cfd.f = this.x0;
        cfd.g = this.y0;
        cfd.h = this.z0;
        cfd.i = this.A0;
        cfd.j = this.B0;
        cfd.k = this.C0;
        cfd.l = this.D0;
        cfd.m = this.E0;
        cfd.n = this.F0;
        cfd.o = this.G0;
        cfd.p = this.H0;
        cfd.q = this.I0;
        cfd.r = this.J0;
        cfd.s = this.K0;
        cfd.t = this.L0;
        cfd.u = this.M0;
        cfd.v = this.N0;
        cfd.w = this.O0;
        cfd.x = this.P0;
        cfd.y = this.S0;
        cfd.z = this.Q0;
        cfd.A = this.R0;
        cfd.F = this.w1;
        cfd.G = this.y1;
        cfd.H = this.z1;
        cfd.I = this.A1;
        cfd.J = this.Q1;
        cfd.U = this.R1;
        cfd.T = this.T1;
        cfd.B = this.a1;
        cfd.C = this.b1;
        cfd.D = this.c1;
        cfd.E = this.B1;
        cfd.K = this.F1;
        cfd.L = this.G1;
        cfd.M = this.H1;
        cfd.N = this.d1;
        cfd.O = this.f1;
        cfd.Q = this.X0;
        cfd.P = this.W0;
        cfd.S = this.Y0;
        cfd.R = this.C1;
        cfd.V = this.T0;
        cfd.W = this.U0;
        return cfd;
    }

    public float getMax() {
        return this.c;
    }

    public float getMin() {
        return this.b;
    }

    public int getProgress() {
        if (!this.R0 || !this.o1) {
            return Math.round(this.o);
        }
        float f = this.i1;
        float f2 = f / 2.0f;
        float f3 = this.o;
        float f4 = this.u1;
        if (f3 >= f4) {
            if (f3 < f2 + f4) {
                return Math.round(f4);
            }
            float f5 = f4 + f;
            this.u1 = f5;
            return Math.round(f5);
        } else if (f3 >= f4 - f2) {
            return Math.round(f4);
        } else {
            float f6 = f4 - f;
            this.u1 = f6;
            return Math.round(f6);
        }
    }

    public float getProgressFloat() {
        return BigDecimal.valueOf((double) this.o).setScale(1, 4).floatValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02bb, code lost:
        if (r1 != r0.c) goto L_0x0338;
     */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x041f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r22) {
        /*
            r21 = this;
            r0 = r21
            r7 = r22
            super.onDraw(r22)
            int r1 = r21.getPaddingLeft()
            float r1 = (float) r1
            int r2 = r21.getMeasuredWidth()
            int r3 = r21.getPaddingRight()
            int r2 = r2 - r3
            float r2 = (float) r2
            int r3 = r21.getPaddingTop()
            int r4 = r0.A0
            int r3 = r3 + r4
            float r3 = (float) r3
            boolean r4 = r0.B1
            if (r4 == 0) goto L_0x002e
            r21.f()
            int r4 = r0.d1
            int r5 = r21.getSignOnTouchJumpHeight()
            int r4 = r4 + r5
            float r4 = (float) r4
            float r3 = r3 + r4
        L_0x002e:
            boolean r4 = r0.X0
            if (r4 == 0) goto L_0x0036
            int r4 = r0.W0
            float r4 = (float) r4
            float r3 = r3 + r4
        L_0x0036:
            r8 = r3
            boolean r3 = r0.B1
            zg4 r4 = r0.V1
            r9 = 2
            if (r3 == 0) goto L_0x0062
            boolean r3 = r0.C1
            if (r3 != 0) goto L_0x0062
            int r3 = r0.f1
            int r3 = r3 / r9
            int r5 = r0.W0
            int r3 = r3 + r5
            r4.getClass()
            r5 = 1077936128(0x40400000, float:3.0)
            int r5 = (int) r5
            int r6 = defpackage.dh4.b(r5)
            int r6 = r6 + r3
            float r3 = (float) r6
            float r1 = r1 + r3
            int r3 = r0.f1
            int r3 = r3 / r9
            int r6 = r0.W0
            int r3 = r3 + r6
            int r5 = defpackage.dh4.b(r5)
            int r5 = r5 + r3
            float r3 = (float) r5
            float r2 = r2 - r3
        L_0x0062:
            boolean r3 = r0.H0
            int r5 = r0.Z0
            int r6 = r0.n1
            android.graphics.Rect r10 = r0.s1
            android.graphics.Paint r11 = r0.r1
            r12 = 1
            r13 = 1073741824(0x40000000, float:2.0)
            r14 = 0
            if (r3 == 0) goto L_0x0131
            int r3 = r0.I0
            float r3 = (float) r3
            r11.setTextSize(r3)
            boolean r3 = r21.isEnabled()
            if (r3 == 0) goto L_0x0081
            int r3 = r0.J0
            goto L_0x0082
        L_0x0081:
            r3 = r5
        L_0x0082:
            r11.setColor(r3)
            int r3 = r0.K0
            if (r3 != 0) goto L_0x00e1
            int r3 = r10.height()
            float r3 = (float) r3
            float r3 = r3 / r13
            float r3 = r3 + r8
            boolean r15 = r0.x1
            if (r15 == 0) goto L_0x0099
            java.lang.String[] r15 = r0.w1
            r15 = r15[r14]
            goto L_0x009d
        L_0x0099:
            java.lang.String r15 = r21.getMinText()
        L_0x009d:
            int r9 = r15.length()
            r11.getTextBounds(r15, r14, r9, r10)
            int r9 = r10.width()
            float r9 = (float) r9
            float r9 = r9 / r13
            float r9 = r9 + r1
            r7.drawText(r15, r9, r3, r11)
            int r9 = r10.width()
            int r9 = r9 + r6
            float r9 = (float) r9
            float r1 = r1 + r9
            boolean r9 = r0.x1
            if (r9 == 0) goto L_0x00c3
            java.lang.String[] r9 = r0.w1
            int r15 = r9.length
            if (r15 <= r12) goto L_0x00c3
            int r15 = r9.length
            int r15 = r15 - r12
            r9 = r9[r15]
            goto L_0x00c7
        L_0x00c3:
            java.lang.String r9 = r21.getMaxText()
        L_0x00c7:
            int r15 = r9.length()
            r11.getTextBounds(r9, r14, r15, r10)
            int r15 = r10.width()
            float r15 = (float) r15
            float r15 = r15 / r13
            float r15 = r2 - r15
            r7.drawText(r9, r15, r3, r11)
            int r3 = r10.width()
            int r3 = r3 + r6
            float r3 = (float) r3
            float r2 = r2 - r3
            goto L_0x013e
        L_0x00e1:
            if (r3 < r12) goto L_0x013e
            int r1 = r0.A0
            float r1 = (float) r1
            float r1 = r1 + r8
            float r2 = (float) r6
            float r1 = r1 + r2
            boolean r2 = r0.x1
            if (r2 == 0) goto L_0x00f2
            java.lang.String[] r2 = r0.w1
            r2 = r2[r14]
            goto L_0x00f6
        L_0x00f2:
            java.lang.String r2 = r21.getMinText()
        L_0x00f6:
            int r3 = r2.length()
            r11.getTextBounds(r2, r14, r3, r10)
            int r3 = r10.height()
            float r3 = (float) r3
            float r1 = r1 + r3
            float r3 = r0.p1
            int r9 = r0.K0
            if (r9 != r12) goto L_0x010c
            r7.drawText(r2, r3, r1, r11)
        L_0x010c:
            boolean r2 = r0.x1
            if (r2 == 0) goto L_0x011a
            java.lang.String[] r2 = r0.w1
            int r9 = r2.length
            if (r9 <= r12) goto L_0x011a
            int r9 = r2.length
            int r9 = r9 - r12
            r2 = r2[r9]
            goto L_0x011e
        L_0x011a:
            java.lang.String r2 = r21.getMaxText()
        L_0x011e:
            int r9 = r2.length()
            r11.getTextBounds(r2, r14, r9, r10)
            float r9 = r0.q1
            int r15 = r0.K0
            if (r15 != r12) goto L_0x012e
            r7.drawText(r2, r9, r1, r11)
        L_0x012e:
            r1 = r3
            r2 = r9
            goto L_0x013e
        L_0x0131:
            boolean r3 = r0.M0
            if (r3 == 0) goto L_0x013e
            int r3 = r0.K0
            r9 = -1
            if (r3 != r9) goto L_0x013e
            float r1 = r0.p1
            float r2 = r0.q1
        L_0x013e:
            boolean r3 = r0.H0
            if (r3 != 0) goto L_0x0146
            boolean r9 = r0.M0
            if (r9 == 0) goto L_0x014a
        L_0x0146:
            int r9 = r0.K0
            if (r9 != 0) goto L_0x014f
        L_0x014a:
            int r9 = r0.A0
            float r9 = (float) r9
            float r1 = r1 + r9
            float r2 = r2 - r9
        L_0x014f:
            r9 = r2
            r2 = r1
            if (r3 == 0) goto L_0x015a
            int r1 = r0.K0
            r3 = 2
            if (r1 != r3) goto L_0x015a
            r1 = r12
            goto L_0x015b
        L_0x015a:
            r1 = r14
        L_0x015b:
            java.lang.String r3 = "0123456789"
            if (r1 != 0) goto L_0x0168
            boolean r12 = r0.F0
            if (r12 == 0) goto L_0x0164
            goto L_0x0168
        L_0x0164:
            r16 = r3
            goto L_0x027a
        L_0x0168:
            boolean r12 = r0.T0
            if (r12 != 0) goto L_0x0164
            int r12 = r0.A0
            r4.getClass()
            int r4 = (int) r13
            int r4 = defpackage.dh4.b(r4)
            int r12 = r12 - r4
            float r4 = (float) r12
            float r4 = r4 / r13
            float r12 = r0.k1
            float r13 = r0.h1
            float r12 = r12 / r13
            float r13 = r0.o
            float r15 = r0.b
            float r13 = r13 - r15
            float r13 = java.lang.Math.abs(r13)
            float r13 = r13 * r12
            float r12 = r0.p1
            float r13 = r13 + r12
            int r12 = r0.I0
            float r12 = (float) r12
            r11.setTextSize(r12)
            r12 = 10
            r11.getTextBounds(r3, r14, r12, r10)
            int r12 = r10.height()
            float r12 = (float) r12
            float r12 = r12 + r8
            int r15 = r0.A0
            float r15 = (float) r15
            float r12 = r12 + r15
            float r15 = (float) r6
            float r12 = r12 + r15
            r15 = r14
        L_0x01a3:
            int r14 = r0.E0
            if (r15 > r14) goto L_0x0164
            float r14 = (float) r15
            r16 = r3
            float r3 = r0.l1
            float r3 = r3 * r14
            float r3 = r3 + r2
            int r17 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r17 > 0) goto L_0x01b7
            r17 = r5
            int r5 = r0.C0
            goto L_0x01bb
        L_0x01b7:
            r17 = r5
            int r5 = r0.B0
        L_0x01bb:
            r11.setColor(r5)
            r7.drawCircle(r3, r8, r4, r11)
            if (r1 == 0) goto L_0x0267
            float r5 = r0.b
            r18 = r1
            float r1 = r0.i1
            float r1 = r1 * r14
            float r1 = r1 + r5
            boolean r5 = r21.isEnabled()
            if (r5 == 0) goto L_0x01d4
        L_0x01d1:
            int r5 = r0.J0
            goto L_0x01e3
        L_0x01d4:
            float r5 = r0.o
            float r5 = r5 - r1
            float r5 = java.lang.Math.abs(r5)
            r14 = 0
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x01e1
            goto L_0x01d1
        L_0x01e1:
            r5 = r17
        L_0x01e3:
            r11.setColor(r5)
            int r5 = r0.L0
            java.lang.String r14 = ""
            r19 = r4
            r4 = 1
            if (r5 <= r4) goto L_0x0228
            int r4 = r15 % r5
            if (r4 != 0) goto L_0x01fe
            boolean r4 = r0.x1
            if (r4 == 0) goto L_0x0202
            java.lang.String[] r1 = r0.w1
            r1 = r1[r15]
            r7.drawText(r1, r3, r12, r11)
        L_0x01fe:
            r20 = r13
            goto L_0x026c
        L_0x0202:
            boolean r4 = r0.w0
            if (r4 == 0) goto L_0x021a
            double r4 = (double) r1
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r4)
            r4 = 1
            r5 = 4
            java.math.BigDecimal r1 = r1.setScale(r4, r5)
            float r1 = r1.floatValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0224
        L_0x021a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r1 = (int) r1
            java.lang.String r1 = defpackage.wn6.j(r4, r1, r14)
        L_0x0224:
            r7.drawText(r1, r3, r12, r11)
            goto L_0x01fe
        L_0x0228:
            int r4 = r15 % r5
            if (r4 != 0) goto L_0x01fe
            boolean r4 = r0.x1
            if (r4 == 0) goto L_0x023f
            int r4 = r15 / r5
            java.lang.String[] r5 = r0.w1
            r20 = r13
            int r13 = r5.length
            if (r4 > r13) goto L_0x0241
            r1 = r5[r4]
            r7.drawText(r1, r3, r12, r11)
            goto L_0x026c
        L_0x023f:
            r20 = r13
        L_0x0241:
            boolean r4 = r0.w0
            if (r4 == 0) goto L_0x0259
            double r4 = (double) r1
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r4)
            r4 = 1
            r5 = 4
            java.math.BigDecimal r1 = r1.setScale(r4, r5)
            float r1 = r1.floatValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0263
        L_0x0259:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r1 = (int) r1
            java.lang.String r1 = defpackage.wn6.j(r4, r1, r14)
        L_0x0263:
            r7.drawText(r1, r3, r12, r11)
            goto L_0x026c
        L_0x0267:
            r18 = r1
            r19 = r4
            goto L_0x01fe
        L_0x026c:
            int r15 = r15 + 1
            r3 = r16
            r5 = r17
            r1 = r18
            r4 = r19
            r13 = r20
            goto L_0x01a3
        L_0x027a:
            boolean r1 = r0.m1
            if (r1 != 0) goto L_0x028d
            float r3 = r0.k1
            float r4 = r0.h1
            float r3 = r3 / r4
            float r4 = r0.o
            float r5 = r0.b
            float r3 = defpackage.us8.g(r4, r5, r3, r2)
            r0.j1 = r3
        L_0x028d:
            boolean r3 = r0.M0
            if (r3 == 0) goto L_0x03a5
            if (r1 != 0) goto L_0x03a5
            boolean r1 = r0.t1
            if (r1 == 0) goto L_0x03a5
            int r1 = r0.O0
            r11.setColor(r1)
            int r1 = r0.N0
            float r1 = (float) r1
            r11.setTextSize(r1)
            boolean r1 = r0.w0
            if (r1 != 0) goto L_0x0338
            boolean r1 = r0.P0
            if (r1 == 0) goto L_0x02bf
            int r1 = r0.K0
            r3 = 1
            if (r1 != r3) goto L_0x02bf
            float r1 = r0.o
            float r3 = r0.b
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02bf
            float r3 = r0.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x02bf
            goto L_0x0338
        L_0x02bf:
            int r1 = r21.getProgress()
            ifd r3 = r0.U1
            if (r3 == 0) goto L_0x02cf
            float r4 = (float) r1
            w06 r3 = (defpackage.w06) r3
            java.lang.String r3 = r3.a(r4)
            goto L_0x02d1
        L_0x02cf:
            r3 = r16
        L_0x02d1:
            int r4 = r3.length()
            r5 = 0
            r11.getTextBounds(r3, r5, r4, r10)
            int r3 = r10.height()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r0.A0
            float r4 = (float) r4
            float r3 = r3 + r4
            float r4 = (float) r6
            float r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.text.NumberFormat r5 = r0.T1
            if (r5 == 0) goto L_0x02f2
            long r12 = (long) r1
            java.lang.String r4 = r5.format(r12)
        L_0x02f2:
            if (r4 == 0) goto L_0x0327
            java.lang.String r5 = r0.Q1
            if (r5 == 0) goto L_0x0327
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0327
            boolean r5 = r0.R1
            if (r5 != 0) goto L_0x0315
            java.lang.String r5 = r0.Q1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0327
        L_0x0315:
            java.lang.String r5 = r0.Q1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r4 = r5.concat(r4)
        L_0x0327:
            ifd r5 = r0.U1
            if (r5 == 0) goto L_0x0332
            float r1 = (float) r1
            w06 r5 = (defpackage.w06) r5
            java.lang.String r4 = r5.a(r1)
        L_0x0332:
            float r1 = r0.j1
            r7.drawText(r4, r1, r3, r11)
            goto L_0x03a5
        L_0x0338:
            float r1 = r21.getProgressFloat()
            ifd r3 = r0.U1
            if (r3 == 0) goto L_0x0347
            w06 r3 = (defpackage.w06) r3
            java.lang.String r3 = r3.a(r1)
            goto L_0x0349
        L_0x0347:
            r3 = r16
        L_0x0349:
            int r4 = r3.length()
            r12 = 0
            r11.getTextBounds(r3, r12, r4, r10)
            int r3 = r10.height()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r0.A0
            float r4 = (float) r4
            float r3 = r3 + r4
            float r4 = (float) r6
            float r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.text.NumberFormat r5 = r0.T1
            if (r5 == 0) goto L_0x036a
            double r13 = (double) r1
            java.lang.String r4 = r5.format(r13)
        L_0x036a:
            if (r4 == 0) goto L_0x039f
            java.lang.String r1 = r0.Q1
            if (r1 == 0) goto L_0x039f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x039f
            boolean r1 = r0.R1
            if (r1 != 0) goto L_0x038d
            java.lang.String r1 = r0.Q1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r4 = r4.concat(r1)
            goto L_0x039f
        L_0x038d:
            java.lang.String r1 = r0.Q1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r4 = r1.concat(r4)
        L_0x039f:
            float r1 = r0.j1
            r7.drawText(r4, r1, r3, r11)
            goto L_0x03a6
        L_0x03a5:
            r12 = 0
        L_0x03a6:
            int r1 = r0.C0
            r11.setColor(r1)
            int r1 = r0.y0
            float r1 = (float) r1
            r11.setStrokeWidth(r1)
            float r4 = r0.j1
            r1 = r22
            r3 = r8
            r5 = r8
            r6 = r11
            r1.drawLine(r2, r3, r4, r5, r6)
            int r1 = r0.B0
            r11.setColor(r1)
            int r1 = r0.x0
            float r1 = (float) r1
            r11.setStrokeWidth(r1)
            float r2 = r0.j1
            r1 = r22
            r4 = r9
            r1.drawLine(r2, r3, r4, r5, r6)
            int r1 = r0.D0
            r11.setColor(r1)
            boolean r1 = r0.A1
            if (r1 == 0) goto L_0x040b
            float r1 = r0.j1
            boolean r2 = r0.m1
            if (r2 == 0) goto L_0x03e4
            int r2 = r0.A0
        L_0x03df:
            float r2 = (float) r2
            float r3 = r0.z1
            float r2 = r2 * r3
            goto L_0x03e7
        L_0x03e4:
            int r2 = r0.z0
            goto L_0x03df
        L_0x03e7:
            r7.drawCircle(r1, r8, r2, r11)
            int r1 = r0.D0
            float r2 = r0.y1
            int r3 = android.graphics.Color.alpha(r1)
            float r3 = (float) r3
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            int r3 = android.graphics.Color.red(r1)
            int r4 = android.graphics.Color.green(r1)
            int r1 = android.graphics.Color.blue(r1)
            int r1 = android.graphics.Color.argb(r2, r3, r4, r1)
            r11.setColor(r1)
        L_0x040b:
            float r1 = r0.j1
            boolean r2 = r0.m1
            if (r2 == 0) goto L_0x0415
            int r2 = r0.A0
        L_0x0413:
            float r2 = (float) r2
            goto L_0x0418
        L_0x0415:
            int r2 = r0.z0
            goto L_0x0413
        L_0x0418:
            r7.drawCircle(r1, r8, r2, r11)
            boolean r1 = r0.B1
            if (r1 != 0) goto L_0x0420
            return
        L_0x0420:
            float r1 = r0.j1
            int r1 = (int) r1
            boolean r2 = r0.m1
            if (r2 != 0) goto L_0x0431
            float r2 = r0.V0
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042f
            goto L_0x0432
        L_0x042f:
            r5 = r12
            goto L_0x043b
        L_0x0431:
            r3 = 0
        L_0x0432:
            int r2 = r21.getSignOnTouchJumpHeight()
            float r2 = (float) r2
            float r4 = r0.V0
            float r2 = r2 * r4
            int r5 = (int) r2
        L_0x043b:
            int r2 = r21.getSignAndThumbSpace()
            int r4 = (int) r8
            int r6 = r0.d1
            int r4 = r4 - r6
            int r4 = r4 - r5
            int r5 = r0.z0
            int r4 = r4 - r5
            boolean r5 = r0.X0
            if (r5 == 0) goto L_0x044e
            int r5 = r0.W0
            int r4 = r4 - r5
        L_0x044e:
            int r6 = r6 + r4
            int r5 = r0.F1
            int r6 = r6 - r5
            int r6 = r6 - r2
            int r2 = r0.f1
            r5 = 2
            int r2 = r2 / r5
            int r5 = r1 - r2
            int r2 = r2 + r1
            android.graphics.Rect r8 = r0.D1
            r8.set(r5, r4, r2, r6)
            boolean r2 = r0.X0
            if (r2 == 0) goto L_0x0466
            int r5 = r0.W0
            goto L_0x0467
        L_0x0466:
            r5 = r12
        L_0x0467:
            boolean r2 = r0.U0
            if (r2 == 0) goto L_0x0470
            int r2 = r0.d1
            r4 = 2
            int r2 = r2 / r4
            goto L_0x0472
        L_0x0470:
            int r2 = r0.H1
        L_0x0472:
            float r2 = (float) r2
            int r4 = r0.d1
            float r4 = (float) r4
            r9 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r9
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x047f
            r15 = r2
            goto L_0x0480
        L_0x047f:
            r15 = r3
        L_0x0480:
            int r3 = r21.getPaddingLeft()
            float r3 = (float) r3
            float r3 = r3 - r15
            int r3 = (int) r3
            int r4 = r21.getPaddingRight()
            float r4 = (float) r4
            float r4 = r4 - r15
            int r4 = (int) r4
            int r9 = r8.left
            android.graphics.RectF r10 = r0.E1
            if (r9 >= r3) goto L_0x04a7
            int r4 = -r9
            int r4 = r4 + r3
            int r4 = r4 + r5
            int r9 = r9 + r4
            float r3 = (float) r9
            int r5 = r8.top
            float r5 = (float) r5
            int r9 = r8.right
            int r9 = r9 + r4
            float r4 = (float) r9
            int r8 = r8.bottom
            float r8 = (float) r8
            r10.set(r3, r5, r4, r8)
            goto L_0x04da
        L_0x04a7:
            int r3 = r8.right
            int r9 = r21.getMeasuredWidth()
            int r9 = r9 - r4
            if (r3 <= r9) goto L_0x04cb
            int r3 = r8.right
            int r9 = r21.getMeasuredWidth()
            int r3 = r3 - r9
            int r3 = r3 + r4
            int r3 = r3 + r5
            int r4 = r8.left
            int r4 = r4 - r3
            float r4 = (float) r4
            int r5 = r8.top
            float r5 = (float) r5
            int r9 = r8.right
            int r9 = r9 - r3
            float r3 = (float) r9
            int r8 = r8.bottom
            float r8 = (float) r8
            r10.set(r4, r5, r3, r8)
            goto L_0x04da
        L_0x04cb:
            int r3 = r8.left
            float r3 = (float) r3
            int r4 = r8.top
            float r4 = (float) r4
            int r5 = r8.right
            float r5 = (float) r5
            int r8 = r8.bottom
            float r8 = (float) r8
            r10.set(r3, r4, r5, r8)
        L_0x04da:
            android.graphics.Paint r3 = r0.L1
            r7.drawRoundRect(r10, r2, r2, r3)
            boolean r3 = r0.X0
            if (r3 == 0) goto L_0x04f3
            float r3 = r10.top
            int r4 = r0.W0
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r4 = r4 + r3
            r10.top = r4
            android.graphics.Paint r3 = r0.M1
            r7.drawRoundRect(r10, r2, r2, r3)
        L_0x04f3:
            boolean r2 = r0.X0
            if (r2 == 0) goto L_0x04fa
            int r14 = r0.W0
            goto L_0x04fb
        L_0x04fa:
            r14 = r12
        L_0x04fb:
            int r6 = r6 + r14
            android.graphics.Point r2 = r0.I1
            int r3 = r0.G1
            r4 = 2
            int r3 = r3 / r4
            int r3 = r1 - r3
            r2.set(r3, r6)
            android.graphics.Point r3 = r0.J1
            int r5 = r0.G1
            int r5 = r5 / r4
            int r5 = r5 + r1
            r3.set(r5, r6)
            android.graphics.Point r4 = r0.K1
            int r5 = r0.F1
            int r6 = r6 + r5
            r4.set(r1, r6)
            android.graphics.Paint r1 = r0.L1
            android.graphics.Path r5 = r0.O1
            r5.reset()
            int r6 = r2.x
            float r6 = (float) r6
            int r8 = r2.y
            float r8 = (float) r8
            r5.moveTo(r6, r8)
            int r6 = r3.x
            float r6 = (float) r6
            int r8 = r3.y
            float r8 = (float) r8
            r5.lineTo(r6, r8)
            int r6 = r4.x
            float r6 = (float) r6
            int r8 = r4.y
            float r8 = (float) r8
            r5.lineTo(r6, r8)
            int r6 = r2.x
            float r6 = (float) r6
            int r8 = r2.y
            float r8 = (float) r8
            r5.lineTo(r6, r8)
            r5.close()
            r7.drawPath(r5, r1)
            boolean r1 = r0.X0
            if (r1 == 0) goto L_0x05ae
            android.graphics.Paint r1 = r0.M1
            android.graphics.Path r5 = r0.P1
            r5.reset()
            int r6 = r2.x
            float r6 = (float) r6
            int r8 = r2.y
            float r8 = (float) r8
            r5.moveTo(r6, r8)
            int r6 = r3.x
            float r6 = (float) r6
            int r8 = r3.y
            float r8 = (float) r8
            r5.lineTo(r6, r8)
            android.graphics.Paint r6 = r0.L1
            int r6 = r6.getColor()
            r1.setColor(r6)
            int r6 = r0.W0
            int r8 = r6 / 6
            float r8 = (float) r8
            float r6 = (float) r6
            r9 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r9
            r1.setStrokeWidth(r6)
            r7.drawPath(r5, r1)
            r5.reset()
            int r6 = r0.W0
            float r6 = (float) r6
            r1.setStrokeWidth(r6)
            int r6 = r2.x
            float r6 = (float) r6
            float r6 = r6 - r8
            int r2 = r2.y
            float r2 = (float) r2
            float r2 = r2 - r8
            r5.moveTo(r6, r2)
            int r2 = r4.x
            float r2 = (float) r2
            int r4 = r4.y
            float r4 = (float) r4
            r5.lineTo(r2, r4)
            int r2 = r3.x
            float r2 = (float) r2
            float r2 = r2 + r8
            int r3 = r3.y
            float r3 = (float) r3
            float r3 = r3 - r8
            r5.lineTo(r2, r3)
            int r2 = r0.Y0
            r1.setColor(r2)
            r7.drawPath(r5, r1)
        L_0x05ae:
            r21.c()
            android.text.StaticLayout r1 = r0.N1
            if (r1 == 0) goto L_0x05d3
            float r1 = r10.left
            float r2 = r10.top
            float r3 = r10.height()
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r3 = r3 + r2
            android.text.StaticLayout r2 = r0.N1
            int r2 = r2.getHeight()
            r4 = 2
            int r2 = r2 / r4
            float r2 = (float) r2
            float r3 = r3 - r2
            r7.translate(r1, r3)
            android.text.StaticLayout r0 = r0.N1
            r0.draw(r7)
        L_0x05d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfd.onDraw(android.graphics.Canvas):void");
    }

    public final void onMeasure(int i, int i2) {
        String str;
        super.onMeasure(i, i2);
        int i3 = this.A0 * 2;
        boolean z = this.M0;
        String str2 = "j";
        int i4 = this.n1;
        Paint paint = this.r1;
        Rect rect = this.s1;
        if (z) {
            paint.setTextSize((float) this.N0);
            paint.getTextBounds(str2, 0, 1, rect);
            i3 += rect.height() + i4;
        }
        if (this.H0 && this.K0 >= 1) {
            if (this.x1) {
                str2 = this.w1[0];
            }
            paint.setTextSize((float) this.I0);
            paint.getTextBounds(str2, 0, str2.length(), rect);
            i3 = Math.max(i3, rect.height() + (this.A0 * 2) + i4);
        }
        if (this.B1) {
            f();
            i3 = i3 + this.d1 + getSignOnTouchJumpHeight();
            if (this.X0) {
                i3 += this.W0;
            }
        }
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i), i3);
        this.p1 = (float) (getPaddingLeft() + this.A0);
        this.q1 = (float) ((getMeasuredWidth() - getPaddingRight()) - this.A0);
        if (this.H0) {
            paint.setTextSize((float) this.I0);
            int i5 = this.K0;
            if (i5 == 0) {
                String minText = getMinText();
                paint.getTextBounds(minText, 0, minText.length(), rect);
                this.p1 += (float) (rect.width() + i4);
                String maxText = getMaxText();
                paint.getTextBounds(maxText, 0, maxText.length(), rect);
                this.q1 -= (float) (rect.width() + i4);
            } else if (i5 >= 1) {
                String minText2 = this.x1 ? this.w1[0] : getMinText();
                paint.getTextBounds(minText2, 0, minText2.length(), rect);
                this.p1 = ((float) getPaddingLeft()) + Math.max((float) this.A0, ((float) rect.width()) / 2.0f) + ((float) i4);
                if (this.x1) {
                    String[] strArr = this.w1;
                    str = strArr[strArr.length - 1];
                } else {
                    str = getMaxText();
                }
                paint.getTextBounds(str, 0, str.length(), rect);
                this.q1 = (((float) (getMeasuredWidth() - getPaddingRight())) - Math.max((float) this.A0, ((float) rect.width()) / 2.0f)) - ((float) i4);
            }
        } else if (this.M0 && this.K0 == -1) {
            paint.setTextSize((float) this.N0);
            String minText3 = getMinText();
            paint.getTextBounds(minText3, 0, minText3.length(), rect);
            this.p1 = ((float) getPaddingLeft()) + Math.max((float) this.A0, ((float) rect.width()) / 2.0f) + ((float) i4);
            String maxText2 = getMaxText();
            paint.getTextBounds(maxText2, 0, maxText2.length(), rect);
            this.q1 = (((float) (getMeasuredWidth() - getPaddingRight())) - Math.max((float) this.A0, ((float) rect.width()) / 2.0f)) - ((float) i4);
        }
        if (this.B1 && !this.C1) {
            this.p1 = Math.max(this.p1, (float) ((this.f1 / 2) + getPaddingLeft() + this.W0));
            this.q1 = Math.min(this.q1, (float) (((getMeasuredWidth() - getPaddingRight()) - (this.f1 / 2)) - this.W0));
        }
        float f = this.q1 - this.p1;
        this.k1 = f;
        this.l1 = (f * 1.0f) / ((float) this.E0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.o = bundle.getFloat("progress");
            super.onRestoreInstanceState(bundle.getParcelable("save_instance"));
            setProgress(this.o);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("save_instance", super.onSaveInstanceState());
        bundle.putFloat("progress", this.o);
        return bundle;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new ffd(this, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r0 != 3) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r10.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x00a9
            if (r0 == r2) goto L_0x004b
            r3 = 2
            if (r0 == r3) goto L_0x0019
            r3 = 3
            if (r0 == r3) goto L_0x004b
            goto L_0x018e
        L_0x0019:
            boolean r0 = r9.m1
            if (r0 == 0) goto L_0x018e
            float r0 = r10.getX()
            float r3 = r9.W1
            float r0 = r0 + r3
            r9.j1 = r0
            float r3 = r9.p1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            r9.j1 = r3
        L_0x002e:
            float r0 = r9.j1
            float r4 = r9.q1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            r9.j1 = r4
        L_0x0038:
            float r0 = r9.j1
            float r0 = r0 - r3
            float r3 = r9.h1
            float r0 = r0 * r3
            float r3 = r9.k1
            float r0 = r0 / r3
            float r3 = r9.b
            float r0 = r0 + r3
            r9.o = r0
            r9.invalidate()
            goto L_0x018e
        L_0x004b:
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            boolean r0 = r9.m1
            if (r0 == 0) goto L_0x0059
            r9.a(r1)
        L_0x0059:
            boolean r0 = r9.G0
            r3 = 300(0x12c, double:1.48E-321)
            r5 = 0
            if (r0 == 0) goto L_0x007a
            boolean r0 = r9.Q0
            if (r0 == 0) goto L_0x0075
            ffd r0 = new ffd
            r7 = 1
            r0.<init>(r9, r7)
            boolean r7 = r9.m1
            if (r7 == 0) goto L_0x0070
            r3 = r5
        L_0x0070:
            r9.postDelayed(r0, r3)
            goto L_0x018e
        L_0x0075:
            r9.b()
            goto L_0x018e
        L_0x007a:
            boolean r0 = r9.m1
            if (r0 != 0) goto L_0x0082
            boolean r0 = r9.Q0
            if (r0 == 0) goto L_0x018e
        L_0x0082:
            android.view.ViewPropertyAnimator r0 = r9.animate()
            long r7 = r9.S0
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r7)
            boolean r7 = r9.m1
            if (r7 != 0) goto L_0x0095
            boolean r7 = r9.Q0
            if (r7 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r3 = r5
        L_0x0096:
            android.view.ViewPropertyAnimator r0 = r0.setStartDelay(r3)
            gfd r3 = new gfd
            r4 = 0
            r3.<init>(r9, r4)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r3)
            r0.start()
            goto L_0x018e
        L_0x00a9:
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto L_0x00b8
        L_0x00b6:
            r0 = r1
            goto L_0x00f9
        L_0x00b8:
            boolean r0 = r9.m1
            if (r0 == 0) goto L_0x00c0
            int r0 = r9.A0
        L_0x00be:
            float r0 = (float) r0
            goto L_0x00c3
        L_0x00c0:
            int r0 = r9.z0
            goto L_0x00be
        L_0x00c3:
            float r3 = r9.k1
            float r4 = r9.h1
            float r3 = r3 / r4
            float r4 = r9.o
            float r5 = r9.b
            float r4 = r4 - r5
            float r4 = r4 * r3
            float r3 = r9.p1
            float r4 = r4 + r3
            int r3 = r9.getMeasuredHeight()
            float r3 = (float) r3
            r5 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r5
            float r5 = r10.getX()
            float r5 = r5 - r4
            float r6 = r10.getX()
            float r6 = r6 - r4
            float r6 = r6 * r5
            float r4 = r10.getY()
            float r4 = r4 - r3
            float r5 = r10.getY()
            float r5 = r5 - r3
            float r5 = r5 * r4
            float r5 = r5 + r6
            float r3 = r9.p1
            float r3 = r3 + r0
            float r3 = r3 * r3
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00b6
            r0 = r2
        L_0x00f9:
            r9.m1 = r0
            if (r0 == 0) goto L_0x0100
            r9.a(r2)
        L_0x0100:
            boolean r0 = r9.m1
            if (r0 == 0) goto L_0x0112
            boolean r0 = r9.R0
            if (r0 == 0) goto L_0x010e
            boolean r0 = r9.o1
            if (r0 != 0) goto L_0x010e
            r9.o1 = r2
        L_0x010e:
            r9.invalidate()
            goto L_0x0185
        L_0x0112:
            boolean r0 = r9.Q0
            if (r0 == 0) goto L_0x0185
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0185
            float r0 = r10.getX()
            int r3 = r9.getPaddingLeft()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0185
            float r0 = r10.getX()
            int r3 = r9.getMeasuredWidth()
            int r4 = r9.getPaddingRight()
            int r3 = r3 - r4
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0185
            float r0 = r10.getY()
            int r3 = r9.getPaddingTop()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0185
            float r0 = r10.getY()
            int r3 = r9.getMeasuredHeight()
            int r4 = r9.getPaddingBottom()
            int r3 = r3 - r4
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0185
            r9.m1 = r2
            float r0 = r10.getX()
            r9.j1 = r0
            float r3 = r9.p1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x016a
            r9.j1 = r3
        L_0x016a:
            float r0 = r9.j1
            float r4 = r9.q1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0174
            r9.j1 = r4
        L_0x0174:
            float r0 = r9.j1
            float r0 = r0 - r3
            float r3 = r9.h1
            float r0 = r0 * r3
            float r3 = r9.k1
            float r0 = r0 / r3
            float r3 = r9.b
            float r0 = r0 + r3
            r9.o = r0
            r9.invalidate()
        L_0x0185:
            float r0 = r9.j1
            float r3 = r10.getX()
            float r0 = r0 - r3
            r9.W1 = r0
        L_0x018e:
            boolean r0 = r9.m1
            if (r0 != 0) goto L_0x019c
            boolean r0 = r9.Q0
            if (r0 != 0) goto L_0x019c
            boolean r9 = super.onTouchEvent(r10)
            if (r9 == 0) goto L_0x019d
        L_0x019c:
            r1 = r2
        L_0x019d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfd.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnProgressChangedListener(hfd hfd) {
    }

    public void setProgress(float f) {
        this.o = f;
        postInvalidate();
    }

    public void setUnit(String str) {
        this.Q1 = str;
        c();
        invalidate();
        requestLayout();
    }

    public void setValueFormatListener(ifd ifd) {
        this.U1 = ifd;
    }
}
