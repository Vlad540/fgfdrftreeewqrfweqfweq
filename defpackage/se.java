package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: se  reason: default package */
public final class se extends Drawable implements Animatable, en4 {
    public static final j06 E0 = new Object();
    public int A0;
    public volatile j06 B0 = E0;
    public hd6 C0;
    public final re D0;
    public long X;
    public long Y;
    public int Z;
    public final vf a;
    public final xw2 b;
    public volatile boolean c;
    public long o;
    public long w0;
    public long x0;
    public int y0;
    public final long z0 = 8;

    /* JADX WARNING: type inference failed for: r0v2, types: [hs1, java.lang.Object] */
    public se(wf wfVar) {
        this.a = wfVar;
        ? obj = new Object();
        this.D0 = new re(0, this);
        this.b = new xw2(wfVar);
        wfVar.G(obj);
    }

    public final void a() {
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.clear();
        }
    }

    public final void draw(Canvas canvas) {
        if (this.a != null && this.b != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long max = this.c ? uptimeMillis - this.o : (long) Math.max((double) this.X, 0.0d);
            int T = this.b.T(max);
            if (T == -1) {
                T = this.a.c() - 1;
                this.B0.getClass();
                this.c = false;
            } else if (T == 0 && this.Z != -1 && uptimeMillis >= this.Y) {
                this.B0.getClass();
            }
            boolean H = this.a.H(this, canvas, T);
            if (H) {
                this.B0.getClass();
                this.Z = T;
            }
            if (!H) {
                this.A0++;
                if (m75.a.i(2)) {
                    m75.d(se.class, Integer.valueOf(this.A0), "Dropped a frame. Count: %s");
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.c) {
                long V = this.b.V(uptimeMillis2 - this.o);
                if (V != -1) {
                    long j = this.o + V + this.z0;
                    this.Y = j;
                    scheduleSelf(this.D0, j);
                } else {
                    this.B0.getClass();
                    this.c = false;
                }
            }
            this.X = max;
        }
    }

    public final int getIntrinsicHeight() {
        vf vfVar = this.a;
        return vfVar != null ? vfVar.s() : super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        vf vfVar = this.a;
        return vfVar != null ? vfVar.F() : super.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.c;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.B(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        if (this.c) {
            return false;
        }
        long j = (long) i;
        if (this.X == j) {
            return false;
        }
        this.X = j;
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i) {
        if (this.C0 == null) {
            this.C0 = new hd6();
        }
        this.C0.c = i;
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.a(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.C0 == null) {
            this.C0 = new hd6();
        }
        hd6 hd6 = this.C0;
        hd6.f = colorFilter;
        hd6.b = colorFilter != null;
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.h(colorFilter);
        }
    }

    public final void start() {
        vf vfVar;
        if (!this.c && (vfVar = this.a) != null && vfVar.c() > 1) {
            this.c = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis - this.w0;
            this.o = j;
            this.Y = j;
            this.X = uptimeMillis - this.x0;
            this.Z = this.y0;
            invalidateSelf();
            this.B0.getClass();
        }
    }

    public final void stop() {
        if (this.c) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.w0 = uptimeMillis - this.o;
            this.x0 = uptimeMillis - this.X;
            this.y0 = this.Z;
            this.c = false;
            this.o = 0;
            this.Y = 0;
            this.X = -1;
            this.Z = -1;
            unscheduleSelf(this.D0);
            this.B0.getClass();
        }
    }
}
