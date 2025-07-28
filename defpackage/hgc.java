package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* renamed from: hgc  reason: default package */
public final class hgc extends mgc {
    public static final /* synthetic */ int Y0 = 0;
    public final Paint S0;
    public final Paint T0;
    public final Bitmap U0;
    public WeakReference V0;
    public boolean W0;
    public RectF X0 = null;

    public hgc(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.S0 = paint2;
        Paint paint3 = new Paint(1);
        this.T0 = paint3;
        this.U0 = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.W0 = false;
    }

    public final void draw(Canvas canvas) {
        Shader shader;
        if (n06.w()) {
            n06.g("RoundedBitmapDrawable#draw");
        }
        if (!h()) {
            super.draw(canvas);
            if (n06.w()) {
                n06.m();
                return;
            }
            return;
        }
        f();
        d();
        WeakReference weakReference = this.V0;
        Paint paint = this.S0;
        Bitmap bitmap = this.U0;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.V0 = new WeakReference(bitmap);
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.Y = true;
            }
        }
        if (this.Y && (shader = paint.getShader()) != null) {
            shader.setLocalMatrix(this.M0);
            this.Y = false;
        }
        paint.setFilterBitmap(this.P0);
        int save = canvas.save();
        canvas.concat(this.J0);
        boolean z = this.W0;
        Path path = this.X;
        if (z || this.X0 == null) {
            canvas.drawPath(path, paint);
        } else {
            int save2 = canvas.save();
            canvas.clipRect(this.X0);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(save2);
        }
        float f = this.o;
        if (f > 0.0f) {
            Paint paint2 = this.T0;
            paint2.setStrokeWidth(f);
            paint2.setColor(lp.A(this.Z, paint.getAlpha()));
            canvas.drawPath(this.w0, paint2);
        }
        canvas.restoreToCount(save);
        if (n06.w()) {
            n06.m();
        }
    }

    public final void f() {
        super.f();
        if (!this.W0) {
            if (this.X0 == null) {
                this.X0 = new RectF();
            }
            this.M0.mapRect(this.X0, this.C0);
        }
    }

    public final void g() {
        this.W0 = false;
    }

    public final boolean h() {
        return (this.b || this.c || this.o > 0.0f) && this.U0 != null;
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.S0;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.S0.setColorFilter(colorFilter);
    }
}
