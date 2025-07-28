package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.work.WorkRequest;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: y65  reason: default package */
public final class y65 extends v2 {
    public static final int[] K0 = {2, 3, 6, 7, 8, 9, 11, 14};
    public static final long L0 = (oze.O() ? WorkRequest.MIN_BACKOFF_MILLIS : 500);
    public final boolean A0;
    public final boolean B0;
    public int C0;
    public int D0;
    public boolean E0;
    public bz5 F0;
    public bz5 G0;
    public ScheduledFuture H0;
    public boolean I0;
    public long J0;
    public u65 X;
    public final int Y;
    public final Surface Z;
    public final h96 o;
    public final SurfaceTexture w0;
    public final float[] x0;
    public final ConcurrentLinkedQueue y0;
    public final ScheduledExecutorService z0;

    public y65(h96 h96, ew0 ew0, boolean z, boolean z2) {
        super(ew0);
        this.o = h96;
        this.A0 = z;
        this.B0 = z2;
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            gt0.g();
            int i = iArr[0];
            gt0.e(36197, i, 9729);
            this.Y = i;
            SurfaceTexture surfaceTexture = new SurfaceTexture(i);
            this.w0 = surfaceTexture;
            this.x0 = new float[16];
            this.y0 = new ConcurrentLinkedQueue();
            this.z0 = Executors.newSingleThreadScheduledExecutor(new v93(3, "ExtTexMgr:Timer"));
            surfaceTexture.setOnFrameAvailableListener(new w65(this, ew0));
            this.Z = new Surface(surfaceTexture);
            this.J0 = -9223372036854775807L;
        } catch (GlUtil$GlException e) {
            throw new Exception(e);
        }
    }

    public static float A(int i, float f) {
        float f2 = 1.0f;
        float f3 = 1.0f;
        for (int i2 = 2; i2 <= 256; i2 *= 2) {
            int i3 = (((i + i2) - 1) / i2) * i2;
            for (int i4 = 0; i4 <= 2; i4++) {
                float f4 = (float) i;
                float f5 = (float) i3;
                float f6 = (f4 - ((float) i4)) / f5;
                if (Math.abs(f6 - f) < Math.abs(f2 - f)) {
                    f3 = f4 / f5;
                    f2 = f6;
                }
            }
        }
        return Math.abs(f2 - f) > 1.0E-9f ? f : f3;
    }

    public final void B() {
        bz5 bz5;
        boolean z = true;
        if (this.C0 != 0 && this.D0 != 0 && this.F0 == null) {
            this.w0.updateTexImage();
            this.D0--;
            if (this.A0) {
                bz5 = this.G0;
                bz5.getClass();
            } else {
                bz5 = (bz5) this.y0.element();
            }
            this.F0 = bz5;
            this.C0--;
            this.w0.getTransformMatrix(this.x0);
            long timestamp = (this.w0.getTimestamp() / 1000) + bz5.e;
            if (this.B0) {
                float[] fArr = this.x0;
                int i = bz5.b;
                int i2 = bz5.c;
                char c = 0;
                boolean z2 = fArr.length != 16;
                int[] iArr = K0;
                for (int i3 = 0; i3 < 8; i3++) {
                    z2 |= Math.abs(fArr[iArr[i3]]) > 1.0E-9f;
                }
                boolean z3 = z2 | (Math.abs(fArr[10] - 1.0f) > 1.0E-9f) | (Math.abs(fArr[15] - 1.0f) > 1.0E-9f);
                char c2 = 13;
                char c3 = 12;
                char c4 = 4;
                if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
                    boolean z4 = z3 | (Math.abs(fArr[1]) > 1.0E-9f);
                    if (Math.abs(fArr[4]) <= 1.0E-9f) {
                        z = false;
                    }
                    z |= z4;
                    c4 = 5;
                    c3 = 13;
                    c2 = 12;
                } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
                    c = 65535;
                    c2 = 65535;
                    c3 = 65535;
                    c4 = 65535;
                } else {
                    boolean z5 = z3 | (Math.abs(fArr[0]) > 1.0E-9f);
                    if (Math.abs(fArr[5]) > 1.0E-9f) {
                        c = 1;
                    }
                    boolean z6 = z5 | c;
                    c = 1;
                    z = z6;
                }
                if (z) {
                    LinkedHashMap linkedHashMap = b24.a;
                    synchronized (b24.class) {
                    }
                } else {
                    float f = fArr[c];
                    float f2 = fArr[c2];
                    if (Math.abs(f) + 1.0E-9f < 1.0f) {
                        float copySign = Math.copySign(A(i, Math.abs(f)), f);
                        float g = us8.g(f, copySign, 0.5f, f2);
                        LinkedHashMap linkedHashMap2 = b24.a;
                        synchronized (b24.class) {
                        }
                        fArr[c] = copySign;
                        fArr[c2] = g;
                    }
                    float f3 = fArr[c4];
                    float f4 = fArr[c3];
                    if (Math.abs(f3) + 1.0E-9f < 1.0f) {
                        float copySign2 = Math.copySign(A(i2, Math.abs(f3)), f3);
                        float g2 = us8.g(f3, copySign2, 0.5f, f4);
                        LinkedHashMap linkedHashMap3 = b24.a;
                        synchronized (b24.class) {
                        }
                        fArr[c4] = copySign2;
                        fArr[c3] = g2;
                    }
                }
            }
            u65 u65 = this.X;
            u65.getClass();
            ((na4) u65).h.p("uTexTransformationMatrix", this.x0);
            u65 u652 = this.X;
            u652.getClass();
            ((lh0) u652).a(this.o, new p96(this.Y, -1, bz5.b, bz5.c), timestamp);
            if (!this.A0) {
                oyb.l((bz5) this.y0.remove());
            }
            b24.a();
        }
    }

    public final void C(CountDownLatch countDownLatch) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        while (true) {
            int i = this.D0;
            concurrentLinkedQueue = this.y0;
            if (i <= 0) {
                break;
            }
            this.D0 = i - 1;
            this.w0.updateTexImage();
            concurrentLinkedQueue.remove();
        }
        if (concurrentLinkedQueue.isEmpty() || (this.J0 != -9223372036854775807L && System.currentTimeMillis() - this.J0 >= L0)) {
            this.J0 = -9223372036854775807L;
            countDownLatch.countDown();
            return;
        }
        if (this.J0 == -9223372036854775807L) {
            this.J0 = System.currentTimeMillis();
        }
        this.z0.schedule(new ii4(this, 22, countDownLatch), 10, TimeUnit.MILLISECONDS);
    }

    public final void h() {
        this.C0 = 0;
        this.F0 = null;
        this.y0.clear();
        this.G0 = null;
        y65.super.h();
    }

    public final void i() {
        ((ew0) this.a).v(new v65(this, 5));
    }

    public final Surface j() {
        return this.Z;
    }

    public final void k(p96 p96) {
        ((ew0) this.a).v(new v65(this, 1));
    }

    public final int l() {
        return this.y0.size();
    }

    public final void release() {
        this.w0.release();
        this.Z.release();
        this.z0.shutdownNow();
    }

    public final void s(bz5 bz5) {
        this.G0 = bz5;
        if (!this.A0) {
            this.y0.add(bz5);
        }
        ((ew0) this.a).v(new v65(this, 0));
    }

    public final void v() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((ew0) this.a).v(new x65(this, countDownLatch, 0));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            ez3.j0("Interrupted when waiting for MediaCodec frames to arrive.");
        }
    }

    public final void y(na4 na4) {
        ((ew0) this.a).v(new my1(this, 1, na4));
    }

    public final void z() {
        ((ew0) this.a).v(new v65(this, 3));
    }
}
