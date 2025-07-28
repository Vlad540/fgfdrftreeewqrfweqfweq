package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.animated.gif.GifImage;

/* renamed from: lm0  reason: default package */
public final class lm0 implements vf {
    public int A0;
    public final boolean X;
    public final sm0 Y;
    public final j54 Z;
    public final mxa a;
    public final rm0 b;
    public final gg c;
    public final te o;
    public final Bitmap.Config w0 = Bitmap.Config.ARGB_8888;
    public final Paint x0 = new Paint(6);
    public Rect y0;
    public int z0;

    public lm0(mxa mxa, rm0 rm0, za6 za6, te teVar, boolean z, sm0 sm0, j54 j54) {
        this.a = mxa;
        this.b = rm0;
        this.c = za6;
        this.o = teVar;
        this.X = z;
        this.Y = sm0;
        this.Z = j54;
        new Path();
        new Matrix();
        e();
    }

    public final void B(Rect rect) {
        this.y0 = rect;
        te teVar = this.o;
        ue ueVar = (ue) teVar.c;
        if (!ue.a((GifImage) ueVar.e, rect).equals((Rect) ueVar.f)) {
            boolean z = ueVar.b;
            ueVar = new ue((qr4) ueVar.c, (stf) ueVar.d, rect, z);
        }
        if (ueVar != ((ue) teVar.c)) {
            teVar.c = ueVar;
            teVar.o = new e06(ueVar, teVar.a, (e3) teVar.X);
        }
        e();
    }

    public final int F() {
        return this.z0;
    }

    public final void G(hs1 hs1) {
    }

    public final boolean H(Drawable drawable, Canvas canvas, int i) {
        j54 j54;
        sm0 sm0;
        boolean d = d(canvas, i, 0);
        if (!(this.X || (j54 = this.Z) == null || (sm0 = this.Y) == null)) {
            sm0.o(j54, this.b, this, i, (s16) null);
        }
        return d;
    }

    public final int I() {
        return this.c.I();
    }

    public final void a(int i) {
        this.x0.setAlpha(i);
    }

    public final boolean b(int i, e13 e13, Canvas canvas, int i2) {
        if (e13 == null || !e13.n0(e13)) {
            return false;
        }
        Bitmap bitmap = (Bitmap) e13.e0();
        Rect rect = this.y0;
        Paint paint = this.x0;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        } else {
            rect.width();
            rect.height();
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        }
        if (i2 == 3 || this.X) {
            return true;
        }
        this.b.r(i, e13);
        return true;
    }

    public final int c() {
        return this.c.c();
    }

    public final void clear() {
        if (this.X) {
            sm0 sm0 = this.Y;
            if (sm0 != null) {
                sm0.q();
                return;
            }
            return;
        }
        this.b.clear();
    }

    public final boolean d(Canvas canvas, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        e13 e13 = null;
        try {
            boolean z4 = false;
            int i3 = 1;
            if (this.X) {
                sm0 sm0 = this.Y;
                e13 p = sm0 != null ? sm0.p(i, canvas.getWidth(), canvas.getHeight()) : null;
                if (p != null) {
                    try {
                        if (p.m0()) {
                            Bitmap bitmap = (Bitmap) p.e0();
                            Rect rect = this.y0;
                            Paint paint = this.x0;
                            if (rect == null) {
                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                            } else {
                                rect.width();
                                rect.height();
                                canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                            }
                            e13.S(p);
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        e13 = p;
                        e13.S(e13);
                        throw th;
                    }
                }
                if (sm0 != null) {
                    sm0.r(canvas.getWidth(), canvas.getHeight());
                }
                e13.S(p);
                return false;
            }
            rm0 rm0 = this.b;
            if (i2 != 0) {
                te teVar = this.o;
                if (i2 == 1) {
                    e13 = rm0.u();
                    if (e13 != null) {
                        if (e13.m0()) {
                            z2 = teVar.d((Bitmap) e13.e0(), i);
                            if (!z2) {
                                e13.S(e13);
                            }
                            if (z2 && b(i, e13, canvas, 1)) {
                                z4 = true;
                            }
                            z = z4;
                            i3 = 2;
                        }
                    }
                    z2 = false;
                    z4 = true;
                    z = z4;
                    i3 = 2;
                } else if (i2 == 2) {
                    e13 = this.a.c(this.z0, this.A0, this.w0);
                    if (e13 != null) {
                        if (e13.m0()) {
                            z3 = teVar.d((Bitmap) e13.e0(), i);
                            if (!z3) {
                                e13.S(e13);
                            }
                            if (z3 && b(i, e13, canvas, 2)) {
                                z4 = true;
                            }
                            z = z4;
                            i3 = 3;
                        }
                    }
                    z3 = false;
                    z4 = true;
                    z = z4;
                    i3 = 3;
                } else if (i2 != 3) {
                    return false;
                } else {
                    e13 = rm0.q();
                    z = b(i, e13, canvas, 3);
                    i3 = -1;
                }
            } else {
                e13 = rm0.v(i);
                z = b(i, e13, canvas, 0);
            }
            e13.S(e13);
            return (z || i3 == -1) ? z : d(canvas, i, i3);
        } catch (RuntimeException e) {
            m75.i(lm0.class, "Failed to create frame bitmap", e);
            return false;
        } catch (Throwable th2) {
            th = th2;
            e13.S(e13);
            throw th;
        }
    }

    public final void e() {
        te teVar = this.o;
        int k = ((GifImage) ((ue) teVar.c).e).k();
        this.z0 = k;
        int i = -1;
        if (k == -1) {
            Rect rect = this.y0;
            this.z0 = rect != null ? rect.width() : -1;
        }
        int h = ((GifImage) ((ue) teVar.c).e).h();
        this.A0 = h;
        if (h == -1) {
            Rect rect2 = this.y0;
            if (rect2 != null) {
                i = rect2.height();
            }
            this.A0 = i;
        }
    }

    public final void h(ColorFilter colorFilter) {
        this.x0.setColorFilter(colorFilter);
    }

    public final int i() {
        return this.c.i();
    }

    public final int o(int i) {
        return this.c.o(i);
    }

    public final int s() {
        return this.A0;
    }
}
