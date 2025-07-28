package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;

/* renamed from: lw7  reason: default package */
public class lw7 extends Drawable implements pad {
    public static final Paint M0;
    public final Region A0;
    public ead B0;
    public final Paint C0;
    public final Paint D0;
    public final cad E0;
    public final lv1 F0;
    public final pf8 G0;
    public PorterDuffColorFilter H0;
    public PorterDuffColorFilter I0;
    public int J0;
    public final RectF K0;
    public final boolean L0;
    public boolean X;
    public final Matrix Y;
    public final Path Z;
    public kw7 a;
    public final mad[] b;
    public final mad[] c;
    public final BitSet o;
    public final Path w0;
    public final RectF x0;
    public final RectF y0;
    public final Region z0;

    static {
        Paint paint = new Paint(1);
        M0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public lw7() {
        this(new ead());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        kw7 kw7 = this.a;
        this.G0.d(kw7.a, kw7.j, rectF, this.F0, path);
        if (this.a.i != 1.0f) {
            Matrix matrix = this.Y;
            matrix.reset();
            float f = this.a.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.K0, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            if (z) {
                int color = paint.getColor();
                int d = d(color);
                this.J0 = d;
                if (d != color) {
                    return new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
                }
            }
            return null;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = d(colorForState);
        }
        this.J0 = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int d(int i) {
        kw7 kw7 = this.a;
        float f = kw7.n + kw7.o + kw7.m;
        zs4 zs4 = kw7.b;
        return zs4 != null ? zs4.a(i, f) : i;
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Paint paint = this.C0;
        paint.setColorFilter(this.H0);
        int alpha = paint.getAlpha();
        int i = this.a.l;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.D0;
        paint2.setColorFilter(this.I0);
        paint2.setStrokeWidth(this.a.k);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.l;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.X;
        Path path = this.Z;
        if (z) {
            float f = 0.0f;
            float f2 = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            ead ead = this.a.a;
            buf e = ead.e();
            du3 du3 = ead.e;
            if (!(du3 instanceof m8c)) {
                du3 = new da(f2, du3);
            }
            e.e = du3;
            du3 du32 = ead.f;
            if (!(du32 instanceof m8c)) {
                du32 = new da(f2, du32);
            }
            e.f = du32;
            du3 du33 = ead.h;
            if (!(du33 instanceof m8c)) {
                du33 = new da(f2, du33);
            }
            e.h = du33;
            du3 du34 = ead.g;
            if (!(du34 instanceof m8c)) {
                du34 = new da(f2, du34);
            }
            e.g = du34;
            ead c2 = e.c();
            this.B0 = c2;
            float f3 = this.a.j;
            RectF rectF = this.y0;
            rectF.set(h());
            if (i()) {
                f = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f, f);
            this.G0.d(c2, f3, rectF, (lv1) null, this.w0);
            b(h(), path);
            this.X = false;
        }
        kw7 kw7 = this.a;
        int i3 = kw7.p;
        if (i3 != 1 && kw7.q > 0) {
            if (i3 == 2) {
                canvas.save();
                kw7 kw72 = this.a;
                double sin = Math.sin(Math.toRadians((double) kw72.s));
                kw7 kw73 = this.a;
                canvas2.translate((float) ((int) (sin * ((double) kw72.r))), (float) ((int) (Math.cos(Math.toRadians((double) kw73.s)) * ((double) kw73.r))));
                if (!this.L0) {
                    e(canvas);
                    canvas.restore();
                } else {
                    RectF rectF2 = this.K0;
                    int width = (int) (rectF2.width() - ((float) getBounds().width()));
                    int height = (int) (rectF2.height() - ((float) getBounds().height()));
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.a.q * 2) + ((int) rectF2.width()) + width, (this.a.q * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    float f4 = (float) ((getBounds().left - this.a.q) - width);
                    float f5 = (float) ((getBounds().top - this.a.q) - height);
                    canvas3.translate(-f4, -f5);
                    e(canvas3);
                    canvas2.drawBitmap(createBitmap, f4, f5, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                }
            } else if (!kw7.a.d(h())) {
                path.isConvex();
            }
        }
        kw7 kw74 = this.a;
        Paint.Style style = kw74.u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            f(canvas, paint, path, kw74.a, h());
        }
        if (i()) {
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        this.o.cardinality();
        int i = this.a.r;
        Path path = this.Z;
        cad cad = this.E0;
        if (i != 0) {
            canvas.drawPath(path, cad.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            mad mad = this.b[i2];
            int i3 = this.a.q;
            Matrix matrix = mad.b;
            mad.a(matrix, cad, i3, canvas);
            this.c[i2].a(matrix, cad, this.a.q, canvas);
        }
        if (this.L0) {
            kw7 kw7 = this.a;
            int sin = (int) (Math.sin(Math.toRadians((double) kw7.s)) * ((double) kw7.r));
            kw7 kw72 = this.a;
            int cos = (int) (Math.cos(Math.toRadians((double) kw72.s)) * ((double) kw72.r));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, M0);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, ead ead, RectF rectF) {
        if (ead.d(rectF)) {
            float a2 = ead.f.a(rectF) * this.a.j;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void g(Canvas canvas) {
        Paint paint = this.D0;
        Path path = this.w0;
        ead ead = this.B0;
        RectF rectF = this.y0;
        rectF.set(h());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, ead, rectF);
    }

    public int getAlpha() {
        return this.a.l;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        kw7 kw7 = this.a;
        if (kw7.p != 2) {
            if (kw7.a.d(h())) {
                outline.setRoundRect(getBounds(), this.a.a.e.a(h()) * this.a.j);
                return;
            }
            RectF h = h();
            Path path = this.Z;
            b(h, path);
            if (Build.VERSION.SDK_INT >= 30) {
                an4.a(outline, path);
                return;
            }
            try {
                zm4.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.z0;
        region.set(bounds);
        RectF h = h();
        Path path = this.Z;
        b(h, path);
        Region region2 = this.A0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.x0;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean i() {
        Paint.Style style = this.a.u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.D0.getStrokeWidth() > 0.0f;
    }

    public final void invalidateSelf() {
        this.X = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.a.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r1.a.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.a.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.a.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            kw7 r0 = r1.a
            android.content.res.ColorStateList r0 = r0.f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            kw7 r0 = r1.a
            android.content.res.ColorStateList r0 = r0.e
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            kw7 r0 = r1.a
            android.content.res.ColorStateList r0 = r0.d
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            kw7 r1 = r1.a
            android.content.res.ColorStateList r1 = r1.c
            if (r1 == 0) goto L_0x0037
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r1 = 0
            goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw7.isStateful():boolean");
    }

    public final void j(Context context) {
        this.a.b = new zs4(context);
        q();
    }

    public final void k(float f) {
        kw7 kw7 = this.a;
        if (kw7.n != f) {
            kw7.n = f;
            q();
        }
    }

    public final void l(ColorStateList colorStateList) {
        kw7 kw7 = this.a;
        if (kw7.c != colorStateList) {
            kw7.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m() {
        kw7 kw7 = this.a;
        if (kw7.p != 2) {
            kw7.p = 2;
            super.invalidateSelf();
        }
    }

    public Drawable mutate() {
        this.a = new kw7(this.a);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        kw7 kw7 = this.a;
        if (kw7.d != colorStateList) {
            kw7.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean o(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || (color2 = paint2.getColor()) == (colorForState2 = this.a.c.getColorForState(iArr, color2))) {
            z = false;
        } else {
            (paint2 = this.C0).setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || (color = paint.getColor()) == (colorForState = this.a.d.getColorForState(iArr, color))) {
            return z;
        }
        (paint = this.D0).setColor(colorForState);
        return true;
    }

    public void onBoundsChange(Rect rect) {
        this.X = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = o(iArr) || p();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p() {
        PorterDuffColorFilter porterDuffColorFilter = this.H0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.I0;
        kw7 kw7 = this.a;
        this.H0 = c(kw7.f, kw7.g, this.C0, true);
        kw7 kw72 = this.a;
        this.I0 = c(kw72.e, kw72.g, this.D0, false);
        kw7 kw73 = this.a;
        if (kw73.t) {
            int colorForState = kw73.f.getColorForState(getState(), 0);
            cad cad = this.E0;
            cad.getClass();
            cad.d = j33.h(colorForState, 68);
            cad.e = j33.h(colorForState, 20);
            cad.f = j33.h(colorForState, 0);
            cad.a.setColor(cad.d);
        }
        return !Objects.equals(porterDuffColorFilter, this.H0) || !Objects.equals(porterDuffColorFilter2, this.I0);
    }

    public final void q() {
        kw7 kw7 = this.a;
        float f = kw7.n + kw7.o;
        kw7.q = (int) Math.ceil((double) (0.75f * f));
        this.a.r = (int) Math.ceil((double) (f * 0.25f));
        p();
        super.invalidateSelf();
    }

    public void setAlpha(int i) {
        kw7 kw7 = this.a;
        if (kw7.l != i) {
            kw7.l = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(ead ead) {
        this.a.a = ead;
        invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.a.f = colorStateList;
        p();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        kw7 kw7 = this.a;
        if (kw7.g != mode) {
            kw7.g = mode;
            p();
            super.invalidateSelf();
        }
    }

    public lw7(Context context, AttributeSet attributeSet, int i, int i2) {
        this(ead.b(context, attributeSet, i, i2).c());
    }

    public lw7(ead ead) {
        this(new kw7(ead));
    }

    public lw7(kw7 kw7) {
        pf8 pf8;
        this.b = new mad[4];
        this.c = new mad[4];
        this.o = new BitSet(8);
        this.Y = new Matrix();
        this.Z = new Path();
        this.w0 = new Path();
        this.x0 = new RectF();
        this.y0 = new RectF();
        this.z0 = new Region();
        this.A0 = new Region();
        Paint paint = new Paint(1);
        this.C0 = paint;
        Paint paint2 = new Paint(1);
        this.D0 = paint2;
        this.E0 = new cad();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            pf8 = fad.a;
        } else {
            pf8 = new pf8();
        }
        this.G0 = pf8;
        this.K0 = new RectF();
        this.L0 = true;
        this.a = kw7;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        p();
        o(getState());
        this.F0 = new lv1(21, this);
    }
}
