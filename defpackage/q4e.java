package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q4e  reason: default package */
public final class q4e implements Closeable {
    public final float[] X;
    public rf3 Y;
    public Executor Z;
    public final Object a = new Object();
    public final Surface b;
    public final int c;
    public final Size o;
    public boolean w0;
    public boolean x0;
    public final vn1 y0;
    public sn1 z0;

    public q4e(Surface surface, int i, Size size, ya0 ya0, ya0 ya02) {
        float[] fArr = new float[16];
        this.X = fArr;
        this.w0 = false;
        this.x0 = false;
        this.b = surface;
        this.c = i;
        this.o = size;
        a(fArr, new float[16], ya0);
        a(new float[16], new float[16], ya02);
        this.y0 = hwf.f(new sic(23, this));
    }

    public static void a(float[] fArr, float[] fArr2, ya0 ya0) {
        Matrix.setIdentityM(fArr, 0);
        if (ya0 != null) {
            e07.H(fArr);
            int i = ya0.d;
            e07.G(fArr, (float) i);
            boolean z = ya0.e;
            if (z) {
                Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
            Size size = ya0.a;
            Size g = hqe.g(size, i);
            float f = (float) 0;
            android.graphics.Matrix a2 = hqe.a(new RectF(f, f, (float) size.getWidth(), (float) size.getHeight()), new RectF(f, f, (float) g.getWidth(), (float) g.getHeight()), i, z);
            RectF rectF = new RectF(ya0.b);
            a2.mapRect(rectF);
            Matrix.translateM(fArr, 0, rectF.left / ((float) g.getWidth()), ((((float) g.getHeight()) - rectF.height()) - rectF.top) / ((float) g.getHeight()), 0.0f);
            Matrix.scaleM(fArr, 0, rectF.width() / ((float) g.getWidth()), rectF.height() / ((float) g.getHeight()), 1.0f);
            Matrix.setIdentityM(fArr2, 0);
            e07.H(fArr2);
            hu1 hu1 = ya0.c;
            if (hu1 != null) {
                e07.p("Camera has no transform.", hu1.n());
                e07.G(fArr2, (float) hu1.p().b());
                if (hu1.d()) {
                    Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                    Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
                }
            }
            Matrix.invertM(fArr2, 0, fArr2, 0);
            Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        }
    }

    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.x0) {
                    this.x0 = true;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.z0.b((Object) null);
    }

    public final Surface d(vd6 vd6, rf3 rf3) {
        boolean z;
        synchronized (this.a) {
            this.Z = vd6;
            this.Y = rf3;
            z = this.w0;
        }
        if (z) {
            m();
        }
        return this.b;
    }

    public final void m() {
        Executor executor;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                if (this.Z != null) {
                    rf3 rf3 = this.Y;
                    if (rf3 != null) {
                        if (!this.x0) {
                            atomicReference.set(rf3);
                            executor = this.Z;
                            this.w0 = false;
                        }
                        executor = null;
                    }
                }
                this.w0 = true;
                executor = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (executor != null) {
            try {
                executor.execute(new sbc(this, 23, atomicReference));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final void n(float[] fArr, float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.X, 0);
    }
}
