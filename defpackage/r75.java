package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* renamed from: r75  reason: default package */
public final class r75 extends nr {
    public int A0;
    public long B0;
    public final int[] C0;
    public final int[] D0;
    public int E0;
    public final boolean[] F0;
    public int G0;
    public boolean H0;
    public final boolean I0 = true;
    public final Drawable[] x0;
    public final int y0;
    public int z0;

    public r75(Drawable[] drawableArr) {
        super(drawableArr);
        if (drawableArr.length >= 1) {
            this.x0 = drawableArr;
            int[] iArr = new int[drawableArr.length];
            this.C0 = iArr;
            int[] iArr2 = new int[drawableArr.length];
            this.D0 = iArr2;
            this.E0 = 255;
            boolean[] zArr = new boolean[drawableArr.length];
            this.F0 = zArr;
            this.G0 = 0;
            this.y0 = 2;
            this.z0 = 2;
            Arrays.fill(iArr, 0);
            iArr[0] = 255;
            Arrays.fill(iArr2, 0);
            iArr2[0] = 255;
            Arrays.fill(zArr, false);
            zArr[0] = true;
            return;
        }
        throw new IllegalStateException("At least one layer required!");
    }

    public final void c() {
        this.G0--;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        int i2 = this.z0;
        int[] iArr = this.D0;
        Drawable[] drawableArr = this.x0;
        int i3 = 2;
        if (i2 == 0) {
            System.arraycopy(iArr, 0, this.C0, 0, drawableArr.length);
            this.B0 = SystemClock.uptimeMillis();
            z = f(this.A0 == 0 ? 1.0f : 0.0f);
            if (!this.H0 && (i = this.y0) >= 0) {
                boolean[] zArr = this.F0;
                if (i < zArr.length && zArr[i]) {
                    this.H0 = true;
                }
            }
            if (!z) {
                i3 = 1;
            }
            this.z0 = i3;
        } else if (i2 != 1) {
            z = true;
        } else {
            ez3.o(this.A0 > 0);
            z = f(((float) (SystemClock.uptimeMillis() - this.B0)) / ((float) this.A0));
            if (!z) {
                i3 = 1;
            }
            this.z0 = i3;
        }
        for (int i4 = 0; i4 < drawableArr.length; i4++) {
            Drawable drawable = drawableArr[i4];
            int ceil = (int) Math.ceil(((double) (iArr[i4] * this.E0)) / 255.0d);
            if (drawable != null && ceil > 0) {
                this.G0++;
                if (this.I0) {
                    drawable.mutate();
                }
                drawable.setAlpha(ceil);
                this.G0--;
                drawable.draw(canvas);
            }
        }
        if (!z) {
            invalidateSelf();
        } else if (this.H0) {
            this.H0 = false;
        }
    }

    public final void e() {
        this.z0 = 2;
        for (int i = 0; i < this.x0.length; i++) {
            this.D0[i] = this.F0[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    public final boolean f(float f) {
        boolean z = true;
        for (int i = 0; i < this.x0.length; i++) {
            boolean z2 = this.F0[i];
            int i2 = (int) ((((float) ((z2 ? 1 : -1) * 255)) * f) + ((float) this.C0[i]));
            int[] iArr = this.D0;
            iArr[i] = i2;
            if (i2 < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (z2 && iArr[i] < 255) {
                z = false;
            }
            if (!z2 && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    public final int getAlpha() {
        return this.E0;
    }

    public final void invalidateSelf() {
        if (this.G0 == 0) {
            super.invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (this.E0 != i) {
            this.E0 = i;
            invalidateSelf();
        }
    }
}
