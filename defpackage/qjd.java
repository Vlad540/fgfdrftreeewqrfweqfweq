package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: qjd  reason: default package */
public final class qjd {
    public final PointF a = new PointF();
    public final RectF b = new RectF();
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public int p;
    public final qb9 q;
    public final RectF r;
    public float s;

    /* JADX WARNING: type inference failed for: r0v2, types: [qb9, java.lang.Object] */
    public qjd() {
        ? obj = new Object();
        obj.a = new float[16];
        this.q = obj;
        this.r = new RectF();
    }

    public final float a(float f2) {
        int i2 = this.p;
        RectF rectF = this.r;
        if (i2 <= 1) {
            return rectF.left;
        }
        qb9 qb9 = this.q;
        int i3 = 0;
        float a2 = (qb9.a(1) - qb9.a(0)) / 2.0f;
        int i4 = qb9.b - 1;
        float f3 = rectF.left;
        while (i3 <= i4) {
            int i5 = (i3 + i4) / 2;
            float a3 = qb9.a(i5);
            float f4 = a3 - f2;
            if (Math.abs(f4) <= a2) {
                return a3;
            }
            if (Math.abs(f4) < Math.abs(f3 - f2)) {
                f3 = a3;
            }
            if (a3 < f2) {
                i3 = i5 + 1;
            } else {
                i4 = i5 - 1;
            }
        }
        return f3;
    }

    public final void b(int i2) {
        this.p = i2;
        RectF rectF = this.r;
        float X = (float) a24.X(rectF.width());
        int i3 = this.p - 1;
        if (i3 < 1) {
            i3 = 1;
        }
        float f2 = X / ((float) i3);
        int X2 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        int i4 = this.f;
        float f3 = (((float) ((this.d - i4) - this.h)) / 2.0f) + ((float) i4);
        float f4 = ((float) X2) / 2.0f;
        this.n = f3 - f4;
        this.o = f3 + f4;
        float f5 = rectF.left;
        int i5 = this.p;
        qb9 qb9 = this.q;
        float[] fArr = qb9.a;
        if (fArr.length < i5) {
            qb9.a = Arrays.copyOf(fArr, Math.max(i5, (fArr.length * 3) / 2));
        }
        int i6 = this.p;
        for (int i7 = 0; i7 < i6; i7++) {
            float f6 = (((float) i7) * f2) + f5;
            int i8 = qb9.b;
            if (i8 <= i7) {
                int i9 = i8 + 1;
                float[] fArr2 = qb9.a;
                if (fArr2.length < i9) {
                    qb9.a = Arrays.copyOf(fArr2, Math.max(i9, (fArr2.length * 3) / 2));
                }
                float[] fArr3 = qb9.a;
                int i10 = qb9.b;
                fArr3[i10] = f6;
                qb9.b = i10 + 1;
            } else if (i7 < 0 || i7 >= i8) {
                StringBuilder m2 = me4.m(i7, "set index ", " must be between 0 .. ");
                m2.append(qb9.b - 1);
                throw new IndexOutOfBoundsException(m2.toString());
            } else {
                float[] fArr4 = qb9.a;
                float f7 = fArr4[i7];
                fArr4[i7] = f6;
            }
        }
    }

    public final void c(float f2) {
        RectF rectF = this.r;
        this.s = gwf.i(f2, rectF.left, rectF.right);
    }

    public final void d() {
        RectF rectF = this.r;
        int i2 = this.f;
        float f2 = (((float) ((this.d - i2) - this.h)) / 2.0f) + ((float) i2);
        rectF.top = f2;
        rectF.bottom = f2;
        float g2 = gwf.g(((float) this.e) + this.i, 0.0f);
        rectF.left = g2;
        float g3 = gwf.g(((float) (this.c - this.g)) - this.k, g2);
        rectF.right = g3;
        this.s = gwf.i(this.s, rectF.left, g3);
    }
}
