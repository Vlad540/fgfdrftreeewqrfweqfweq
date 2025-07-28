package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: j23  reason: default package */
public final class j23 {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public wv1 D;
    public wv1 E;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public boolean J = true;
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;
    public final View a;
    public ColorStateList a0;
    public float b;
    public float b0;
    public boolean c;
    public float c0;
    public float d;
    public float d0;
    public float e;
    public ColorStateList e0;
    public int f;
    public float f0;
    public final Rect g;
    public float g0;
    public final Rect h;
    public float h0;
    public final RectF i;
    public StaticLayout i0;
    public int j = 16;
    public float j0;
    public int k = 16;
    public float k0;
    public float l = 15.0f;
    public float l0;
    public float m = 15.0f;
    public CharSequence m0;
    public ColorStateList n;
    public int n0 = 1;
    public ColorStateList o;
    public float o0 = 0.0f;
    public int p;
    public float p0 = 1.0f;
    public float q;
    public int q0 = 1;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public Typeface z;

    public j23(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.h = new Rect();
        this.g = new Rect();
        this.i = new RectF();
        float f2 = this.d;
        this.e = us8.g(1.0f, f2, 0.5f, f2);
        h(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i2, float f2, int i3) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((((float) Color.alpha(i3)) * f2) + (((float) Color.alpha(i2)) * f3)), Math.round((((float) Color.red(i3)) * f2) + (((float) Color.red(i2)) * f3)), Math.round((((float) Color.green(i3)) * f2) + (((float) Color.green(i2)) * f3)), Math.round((((float) Color.blue(i3)) * f2) + (((float) Color.blue(i2)) * f3)));
    }

    public static float g(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return og.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = eaf.a;
        boolean z2 = true;
        if (this.a.getLayoutDirection() != 1) {
            z2 = false;
        }
        if (!this.J) {
            return z2;
        }
        return (z2 ? gfe.d : gfe.c).T1(charSequence.length(), charSequence);
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.G != null) {
            float width = (float) this.h.width();
            float width2 = (float) this.g.width();
            if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
                f4 = this.m;
                f3 = this.f0;
                this.L = 1.0f;
                typeface = this.w;
            } else {
                float f5 = this.l;
                float f6 = this.g0;
                Typeface typeface2 = this.z;
                if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                    this.L = 1.0f;
                } else {
                    this.L = g(this.l, this.m, f2, this.W) / this.l;
                }
                float f7 = this.m / this.l;
                width = (z2 || this.c || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
                f4 = f5;
                f3 = f6;
                typeface = typeface2;
            }
            int i2 = (width > 0.0f ? 1 : (width == 0.0f ? 0 : -1));
            TextPaint textPaint = this.T;
            if (i2 > 0) {
                boolean z4 = this.M != f4;
                boolean z5 = this.h0 != f3;
                boolean z6 = this.C != typeface;
                StaticLayout staticLayout = this.i0;
                z3 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.S;
                this.M = f4;
                this.h0 = f3;
                this.C = typeface;
                this.S = false;
                textPaint.setLinearText(this.L != 1.0f);
            } else {
                z3 = false;
            }
            if (this.H == null || z3) {
                textPaint.setTextSize(this.M);
                textPaint.setTypeface(this.C);
                textPaint.setLetterSpacing(this.h0);
                boolean b2 = b(this.G);
                this.I = b2;
                int i3 = this.n0;
                if (i3 <= 1 || (b2 && !this.c)) {
                    i3 = 1;
                }
                if (i3 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.j, b2 ? 1 : 0) & 7;
                    alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
                }
                trd trd = new trd(this.G, textPaint, (int) width);
                trd.l = this.F;
                trd.k = b2;
                trd.e = alignment;
                trd.j = false;
                trd.f = i3;
                float f8 = this.o0;
                float f9 = this.p0;
                trd.g = f8;
                trd.h = f9;
                trd.i = this.q0;
                StaticLayout a2 = trd.a();
                a2.getClass();
                this.i0 = a2;
                this.H = a2.getText();
            }
        }
    }

    public final void d(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas.save();
        if (this.H != null) {
            RectF rectF = this.i;
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                TextPaint textPaint = this.T;
                textPaint.setTextSize(this.M);
                float f2 = this.u;
                float f3 = this.v;
                float f4 = this.L;
                if (f4 != 1.0f && !this.c) {
                    canvas2.scale(f4, f4, f2, f3);
                }
                if (this.n0 <= 1 || ((this.I && !this.c) || (this.c && this.b <= this.e))) {
                    canvas2.translate(f2, f3);
                    this.i0.draw(canvas2);
                } else {
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(this.u - ((float) this.i0.getLineStart(0)), f3);
                    if (!this.c) {
                        textPaint.setAlpha((int) (this.l0 * ((float) alpha)));
                        if (Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(this.N, this.O, this.P, vx3.j(this.Q, textPaint.getAlpha()));
                        }
                        this.i0.draw(canvas2);
                    }
                    if (!this.c) {
                        textPaint.setAlpha((int) (this.k0 * ((float) alpha)));
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, vx3.j(this.Q, textPaint.getAlpha()));
                    }
                    int lineBaseline = this.i0.getLineBaseline(0);
                    CharSequence charSequence = this.m0;
                    float f5 = (float) lineBaseline;
                    float f6 = f5;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                    if (i2 >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, this.Q);
                    }
                    if (!this.c) {
                        String trim = this.m0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        textPaint.setAlpha(alpha);
                        canvas.drawText(trim, 0, Math.min(this.i0.getLineEnd(0), trim.length()), 0.0f, f6, textPaint);
                    }
                }
                canvas2.restoreToCount(save);
            }
        }
    }

    public final float e() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.w);
        textPaint.setLetterSpacing(this.f0);
        return -textPaint.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.y;
            if (typeface != null) {
                this.x = r1g.w(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = r1g.w(configuration, typeface2);
            }
            Typeface typeface3 = this.x;
            if (typeface3 == null) {
                typeface3 = this.y;
            }
            this.w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.z = typeface4;
            i(true);
        }
    }

    public final void i(boolean z2) {
        float f2;
        float f3;
        StaticLayout staticLayout;
        boolean z3 = z2;
        View view = this.a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z3) {
            c(1.0f, z3);
            CharSequence charSequence = this.H;
            TextPaint textPaint = this.T;
            if (!(charSequence == null || (staticLayout = this.i0) == null)) {
                this.m0 = TextUtils.ellipsize(charSequence, textPaint, (float) staticLayout.getWidth(), this.F);
            }
            CharSequence charSequence2 = this.m0;
            if (charSequence2 != null) {
                this.j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.j0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.k, this.I ? 1 : 0);
            int i2 = absoluteGravity & 112;
            Rect rect = this.h;
            if (i2 == 48) {
                this.r = (float) rect.top;
            } else if (i2 != 80) {
                this.r = ((float) rect.centerY()) - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                this.r = textPaint.ascent() + ((float) rect.bottom);
            }
            int i3 = absoluteGravity & 8388615;
            if (i3 == 1) {
                this.t = ((float) rect.centerX()) - (this.j0 / 2.0f);
            } else if (i3 != 5) {
                this.t = (float) rect.left;
            } else {
                this.t = ((float) rect.right) - this.j0;
            }
            c(0.0f, z3);
            StaticLayout staticLayout2 = this.i0;
            float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
            StaticLayout staticLayout3 = this.i0;
            if (staticLayout3 == null || this.n0 <= 1) {
                CharSequence charSequence3 = this.H;
                f2 = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
            } else {
                f2 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.i0;
            this.p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.j, this.I ? 1 : 0);
            int i4 = absoluteGravity2 & 112;
            Rect rect2 = this.g;
            if (i4 == 48) {
                this.q = (float) rect2.top;
            } else if (i4 != 80) {
                this.q = ((float) rect2.centerY()) - (height / 2.0f);
            } else {
                this.q = textPaint.descent() + (((float) rect2.bottom) - height);
            }
            int i5 = absoluteGravity2 & 8388615;
            if (i5 == 1) {
                this.s = ((float) rect2.centerX()) - (f2 / 2.0f);
            } else if (i5 != 5) {
                this.s = (float) rect2.left;
            } else {
                this.s = ((float) rect2.right) - f2;
            }
            Bitmap bitmap = this.K;
            if (bitmap != null) {
                bitmap.recycle();
                this.K = null;
            }
            q(this.b);
            float f4 = this.b;
            boolean z4 = this.c;
            RectF rectF = this.i;
            if (z4) {
                if (f4 < this.e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g((float) rect2.left, (float) rect.left, f4, this.V);
                rectF.top = g(this.q, this.r, f4, this.V);
                rectF.right = g((float) rect2.right, (float) rect.right, f4, this.V);
                rectF.bottom = g((float) rect2.bottom, (float) rect.bottom, f4, this.V);
            }
            if (!this.c) {
                this.u = g(this.s, this.t, f4, this.V);
                this.v = g(this.q, this.r, f4, this.V);
                q(f4);
                f3 = f4;
            } else if (f4 < this.e) {
                this.u = this.s;
                this.v = this.q;
                q(0.0f);
                f3 = 0.0f;
            } else {
                this.u = this.t;
                this.v = this.r - ((float) Math.max(0, this.f));
                q(1.0f);
                f3 = 1.0f;
            }
            p85 p85 = og.b;
            this.k0 = 1.0f - g(0.0f, 1.0f, 1.0f - f4, p85);
            WeakHashMap weakHashMap = eaf.a;
            view.postInvalidateOnAnimation();
            this.l0 = g(1.0f, 0.0f, f4, p85);
            view.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.o;
            ColorStateList colorStateList2 = this.n;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f(colorStateList2), f3, f(this.o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            int i6 = Build.VERSION.SDK_INT;
            float f5 = this.f0;
            float f6 = this.g0;
            if (f5 != f6) {
                textPaint.setLetterSpacing(g(f6, f5, f4, p85));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.N = og.a(this.b0, this.X, f4);
            this.O = og.a(this.c0, this.Y, f4);
            this.P = og.a(this.d0, this.Z, f4);
            int a2 = a(f(this.e0), f4, f(this.a0));
            this.Q = a2;
            textPaint.setShadowLayer(this.N, this.O, this.P, a2);
            if (this.c) {
                int alpha = textPaint.getAlpha();
                float f7 = this.e;
                textPaint.setAlpha((int) ((f4 <= f7 ? og.b(1.0f, 0.0f, this.d, f7, f4) : og.b(0.0f, 1.0f, f7, 1.0f, f4)) * ((float) alpha)));
                if (i6 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, vx3.j(this.Q, textPaint.getAlpha()));
                }
            }
            view.postInvalidateOnAnimation();
        }
    }

    public final void j(ColorStateList colorStateList) {
        if (this.o != colorStateList || this.n != colorStateList) {
            this.o = colorStateList;
            this.n = colorStateList;
            i(false);
        }
    }

    public final void k(int i2) {
        View view = this.a;
        afe afe = new afe(view.getContext(), i2);
        ColorStateList colorStateList = afe.j;
        if (colorStateList != null) {
            this.o = colorStateList;
        }
        float f2 = afe.k;
        if (f2 != 0.0f) {
            this.m = f2;
        }
        ColorStateList colorStateList2 = afe.a;
        if (colorStateList2 != null) {
            this.a0 = colorStateList2;
        }
        this.Y = afe.e;
        this.Z = afe.f;
        this.X = afe.g;
        this.f0 = afe.i;
        wv1 wv1 = this.E;
        if (wv1 != null) {
            wv1.f = true;
        }
        ea6 ea6 = new ea6(9, this);
        afe.a();
        this.E = new wv1(ea6, afe.n);
        afe.c(view.getContext(), this.E);
        i(false);
    }

    public final void l(int i2) {
        if (this.k != i2) {
            this.k = i2;
            i(false);
        }
    }

    public final boolean m(Typeface typeface) {
        wv1 wv1 = this.E;
        if (wv1 != null) {
            wv1.f = true;
        }
        if (this.y == typeface) {
            return false;
        }
        this.y = typeface;
        Typeface w2 = r1g.w(this.a.getContext().getResources().getConfiguration(), typeface);
        this.x = w2;
        if (w2 == null) {
            w2 = this.y;
        }
        this.w = w2;
        return true;
    }

    public final void n(int i2) {
        View view = this.a;
        afe afe = new afe(view.getContext(), i2);
        ColorStateList colorStateList = afe.j;
        if (colorStateList != null) {
            this.n = colorStateList;
        }
        float f2 = afe.k;
        if (f2 != 0.0f) {
            this.l = f2;
        }
        ColorStateList colorStateList2 = afe.a;
        if (colorStateList2 != null) {
            this.e0 = colorStateList2;
        }
        this.c0 = afe.e;
        this.d0 = afe.f;
        this.b0 = afe.g;
        this.g0 = afe.i;
        wv1 wv1 = this.D;
        if (wv1 != null) {
            wv1.f = true;
        }
        za6 za6 = new za6((Object) this);
        afe.a();
        this.D = new wv1(za6, afe.n);
        afe.c(view.getContext(), this.D);
        i(false);
    }

    public final boolean o(Typeface typeface) {
        wv1 wv1 = this.D;
        if (wv1 != null) {
            wv1.f = true;
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface w2 = r1g.w(this.a.getContext().getResources().getConfiguration(), typeface);
        this.A = w2;
        if (w2 == null) {
            w2 = this.B;
        }
        this.z = w2;
        return true;
    }

    public final void p(float f2) {
        float f3;
        float i2 = xy6.i(f2, 0.0f, 1.0f);
        if (i2 != this.b) {
            this.b = i2;
            boolean z2 = this.c;
            RectF rectF = this.i;
            Rect rect = this.h;
            Rect rect2 = this.g;
            if (z2) {
                if (i2 < this.e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g((float) rect2.left, (float) rect.left, i2, this.V);
                rectF.top = g(this.q, this.r, i2, this.V);
                rectF.right = g((float) rect2.right, (float) rect.right, i2, this.V);
                rectF.bottom = g((float) rect2.bottom, (float) rect.bottom, i2, this.V);
            }
            if (!this.c) {
                this.u = g(this.s, this.t, i2, this.V);
                this.v = g(this.q, this.r, i2, this.V);
                q(i2);
                f3 = i2;
            } else if (i2 < this.e) {
                this.u = this.s;
                this.v = this.q;
                q(0.0f);
                f3 = 0.0f;
            } else {
                this.u = this.t;
                this.v = this.r - ((float) Math.max(0, this.f));
                q(1.0f);
                f3 = 1.0f;
            }
            p85 p85 = og.b;
            this.k0 = 1.0f - g(0.0f, 1.0f, 1.0f - i2, p85);
            WeakHashMap weakHashMap = eaf.a;
            View view = this.a;
            view.postInvalidateOnAnimation();
            this.l0 = g(1.0f, 0.0f, i2, p85);
            view.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.o;
            ColorStateList colorStateList2 = this.n;
            TextPaint textPaint = this.T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f(colorStateList2), f3, f(this.o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            int i3 = Build.VERSION.SDK_INT;
            float f4 = this.f0;
            float f5 = this.g0;
            if (f4 != f5) {
                textPaint.setLetterSpacing(g(f5, f4, i2, p85));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            this.N = og.a(this.b0, this.X, i2);
            this.O = og.a(this.c0, this.Y, i2);
            this.P = og.a(this.d0, this.Z, i2);
            int a2 = a(f(this.e0), i2, f(this.a0));
            this.Q = a2;
            textPaint.setShadowLayer(this.N, this.O, this.P, a2);
            if (this.c) {
                int alpha = textPaint.getAlpha();
                float f6 = this.e;
                textPaint.setAlpha((int) ((i2 <= f6 ? og.b(1.0f, 0.0f, this.d, f6, i2) : og.b(0.0f, 1.0f, f6, 1.0f, i2)) * ((float) alpha)));
                if (i3 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, vx3.j(this.Q, textPaint.getAlpha()));
                }
            }
            view.postInvalidateOnAnimation();
        }
    }

    public final void q(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = eaf.a;
        this.a.postInvalidateOnAnimation();
    }
}
