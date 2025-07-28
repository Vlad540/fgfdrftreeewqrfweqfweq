package defpackage;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: jn0  reason: default package */
public final class jn0 extends v2 {
    public final h96 X;
    public final boolean Y;
    public q9c Z;
    public final LinkedBlockingQueue o = new LinkedBlockingQueue();
    public p96 w0;
    public int x0;
    public boolean y0;
    public boolean z0;

    public jn0(h96 h96, ew0 ew0, boolean z) {
        super(ew0);
        this.X = h96;
        this.Y = z;
    }

    public final void A() {
        if (!this.o.isEmpty() && this.x0 != 0) {
            in0 in0 = (in0) this.o.element();
            bz5 bz5 = in0.b;
            dke dke = in0.c;
            oyb.k(dke.hasNext());
            long next = dke.next() + in0.b.e;
            if (!this.z0) {
                this.z0 = true;
                Bitmap bitmap = in0.a;
                try {
                    p96 p96 = this.w0;
                    if (p96 != null) {
                        p96.a();
                    }
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    gt0.g();
                    int i = iArr[0];
                    gt0.d(bitmap.getWidth(), bitmap.getHeight());
                    gt0.e(3553, i, 9729);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    gt0.g();
                    this.w0 = new p96(i, -1, bz5.b, bz5.c);
                    if (oze.a >= 34 && bitmap.hasGainmap()) {
                        q9c q9c = this.Z;
                        q9c.getClass();
                        Gainmap c = bitmap.getGainmap();
                        c.getClass();
                        ((na4) q9c).l(fn0.d(c));
                    }
                    if (this.Y) {
                        q9c q9c2 = this.Z;
                        q9c2.getClass();
                        na4 na4 = (na4) q9c2;
                        oyb.k(na4.a.b == 1);
                        na4.t = true;
                        na4.u = false;
                    }
                } catch (GlUtil$GlException e) {
                    throw VideoFrameProcessingException.a(e);
                }
            }
            this.x0--;
            q9c q9c3 = this.Z;
            q9c3.getClass();
            h96 h96 = this.X;
            p96 p962 = this.w0;
            p962.getClass();
            ((lh0) q9c3).a(h96, p962, next);
            int i2 = bz5.b;
            LinkedHashMap linkedHashMap = b24.a;
            synchronized (b24.class) {
            }
            if (!in0.c.hasNext()) {
                this.z0 = false;
                ((in0) this.o.remove()).a.recycle();
                if (this.o.isEmpty() && this.y0) {
                    q9c q9c4 = this.Z;
                    q9c4.getClass();
                    ((lh0) q9c4).c();
                    b24.a();
                    this.y0 = false;
                }
            }
        }
    }

    public final void h() {
        this.o.clear();
        this.z0 = false;
        this.y0 = false;
        this.x0 = 0;
        p96 p96 = this.w0;
        if (p96 != null) {
            try {
                p96.a();
                this.w0 = null;
            } catch (GlUtil$GlException e) {
                throw VideoFrameProcessingException.a(e);
            }
        }
        jn0.super.h();
    }

    public final void i() {
        ((ew0) this.a).v(new hn0(this, 1));
    }

    public final int l() {
        return 0;
    }

    public final void q(Bitmap bitmap, bz5 bz5, dke dke) {
        ((ew0) this.a).v(new gn0(this, bitmap, bz5, dke));
    }

    public final void release() {
        ((ew0) this.a).v(new hn0(this, 2));
    }

    public final void y(na4 na4) {
        this.x0 = 0;
        this.Z = na4;
    }

    public final void z() {
        ((ew0) this.a).v(new hn0(this, 0));
    }
}
