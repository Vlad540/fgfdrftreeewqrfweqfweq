package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ImageWriter;
import java.nio.ByteBuffer;

/* renamed from: lp6  reason: default package */
public abstract class lp6 implements mr6 {
    public final Object A0;
    public boolean B0;
    public ImageWriter X;
    public Rect Y = new Rect();
    public Matrix Z;
    public volatile int a;
    public volatile int b = 1;
    public volatile boolean c;
    public yic o;
    public ByteBuffer w0;
    public ByteBuffer x0;
    public ByteBuffer y0;
    public ByteBuffer z0;

    public lp6() {
        new Rect();
        this.Z = new Matrix();
        new Matrix();
        this.A0 = new Object();
        this.B0 = true;
    }

    public abstract lr6 a(nr6 nr6);

    public final ch7 b(lr6 lr6) {
        int i = this.c ? this.a : 0;
        synchronized (this.A0) {
            try {
                if (this.c && i != 0) {
                    g(lr6, i);
                }
                if (this.c) {
                    d(lr6);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return new as6(1, new RuntimeException("No analyzer or executor currently set.".toString()));
    }

    public abstract void c();

    public final void d(lr6 lr6) {
        if (this.b == 1) {
            if (this.x0 == null) {
                this.x0 = ByteBuffer.allocateDirect(lr6.getHeight() * lr6.getWidth());
            }
            this.x0.position(0);
            if (this.y0 == null) {
                this.y0 = ByteBuffer.allocateDirect((lr6.getHeight() * lr6.getWidth()) / 4);
            }
            this.y0.position(0);
            if (this.z0 == null) {
                this.z0 = ByteBuffer.allocateDirect((lr6.getHeight() * lr6.getWidth()) / 4);
            }
            this.z0.position(0);
        } else if (this.b == 2 && this.w0 == null) {
            this.w0 = ByteBuffer.allocateDirect(lr6.getHeight() * lr6.getWidth() * 4);
        }
    }

    public abstract void e(lr6 lr6);

    public final void f(nr6 nr6) {
        try {
            lr6 a2 = a(nr6);
            if (a2 != null) {
                e(a2);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void g(lr6 lr6, int i) {
        yic yic = this.o;
        if (yic != null) {
            yic.a();
            int width = lr6.getWidth();
            int height = lr6.getHeight();
            int f = this.o.f();
            int l = this.o.l();
            boolean z = i == 90 || i == 270;
            int i2 = z ? height : width;
            if (!z) {
                width = height;
            }
            this.o = new yic(x87.n(i2, width, f, l));
            if (this.b == 1) {
                ImageWriter imageWriter = this.X;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                this.X = ImageWriter.newInstance(this.o.getSurface(), this.o.l());
            }
        }
    }
}
