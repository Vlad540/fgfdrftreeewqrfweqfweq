package defpackage;

import android.hardware.Camera;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: b46  reason: default package */
public final class b46 implements GLSurfaceView.Renderer, Camera.PreviewCallback {
    public static final float[] F0 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public final LinkedList A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public int E0 = 2;
    public final FloatBuffer X;
    public IntBuffer Y;
    public int Z;
    public z36 a;
    public final Object b = new Object();
    public int c = -1;
    public final FloatBuffer o;
    public int w0;
    public int x0;
    public int y0;
    public final LinkedList z0;

    public b46(z36 z36) {
        this.a = z36;
        this.z0 = new LinkedList();
        this.A0 = new LinkedList();
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.o = asFloatBuffer;
        asFloatBuffer.put(F0).position(0);
        this.X = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.C0 = false;
        this.D0 = false;
        this.B0 = 1;
        b();
    }

    public static float a(float f, float f2) {
        return f == 0.0f ? f2 : 1.0f - f2;
    }

    public static void c(LinkedList linkedList) {
        synchronized (linkedList) {
            while (!linkedList.isEmpty()) {
                try {
                    ((Runnable) linkedList.poll()).run();
                } finally {
                }
            }
        }
    }

    public final void b() {
        float f = (float) this.Z;
        float f2 = (float) this.w0;
        int i = this.B0;
        if (i == 4 || i == 2) {
            float f3 = f2;
            f2 = f;
            f = f3;
        }
        float max = Math.max(f / ((float) this.x0), f2 / ((float) this.y0));
        float round = ((float) Math.round(((float) this.x0) * max)) / f;
        float round2 = ((float) Math.round(((float) this.y0) * max)) / f2;
        float[] fArr = F0;
        int i2 = this.B0;
        boolean z = this.C0;
        boolean z2 = this.D0;
        int t = hr1.t(i2);
        float[] fArr2 = t != 1 ? t != 2 ? t != 3 ? a24.e : a24.h : a24.g : a24.f;
        if (z) {
            fArr2 = new float[]{a24.z(fArr2[0]), fArr2[1], a24.z(fArr2[2]), fArr2[3], a24.z(fArr2[4]), fArr2[5], a24.z(fArr2[6]), fArr2[7]};
        }
        if (z2) {
            fArr2 = new float[]{fArr2[0], a24.z(fArr2[1]), fArr2[2], a24.z(fArr2[3]), fArr2[4], a24.z(fArr2[5]), fArr2[6], a24.z(fArr2[7])};
        }
        if (this.E0 == 2) {
            float f4 = (1.0f - (1.0f / round)) / 2.0f;
            float f5 = (1.0f - (1.0f / round2)) / 2.0f;
            fArr2 = new float[]{a(fArr2[0], f4), a(fArr2[1], f5), a(fArr2[2], f4), a(fArr2[3], f5), a(fArr2[4], f4), a(fArr2[5], f5), a(fArr2[6], f4), a(fArr2[7], f5)};
        } else {
            fArr = new float[]{fArr[0] / round2, fArr[1] / round, fArr[2] / round2, fArr[3] / round, fArr[4] / round2, fArr[5] / round, fArr[6] / round2, fArr[7] / round};
        }
        FloatBuffer floatBuffer = this.o;
        floatBuffer.clear();
        floatBuffer.put(fArr).position(0);
        FloatBuffer floatBuffer2 = this.X;
        floatBuffer2.clear();
        floatBuffer2.put(fArr2).position(0);
    }

    public final void d(Runnable runnable) {
        synchronized (this.z0) {
            this.z0.add(runnable);
        }
    }

    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        c(this.z0);
        z36 z36 = this.a;
        int i = this.c;
        FloatBuffer floatBuffer = this.o;
        FloatBuffer floatBuffer2 = this.X;
        GLES20.glUseProgram(z36.d);
        synchronized (z36.a) {
            while (!z36.a.isEmpty()) {
                try {
                    ((Runnable) z36.a.removeFirst()).run();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        if (z36.h) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(z36.e, 2, 5126, false, 0, floatBuffer);
            GLES20.glEnableVertexAttribArray(z36.e);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(z36.g, 2, 5126, false, 0, floatBuffer2);
            GLES20.glEnableVertexAttribArray(z36.g);
            if (i != -1) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i);
                GLES20.glUniform1i(z36.f, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(z36.e);
            GLES20.glDisableVertexAttribArray(z36.g);
            GLES20.glBindTexture(3553, 0);
        }
        c(this.A0);
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        int i = previewSize.width;
        int i2 = previewSize.height;
        if (this.Y == null) {
            this.Y = IntBuffer.allocate(i * i2);
        }
        if (this.z0.isEmpty()) {
            d(new a46(this, bArr, i, i2));
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.Z = i;
        this.w0 = i2;
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glUseProgram(this.a.d);
        this.a.b(i, i2);
        b();
        synchronized (this.b) {
            this.b.notifyAll();
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glDisable(2929);
        z36 z36 = this.a;
        if (!z36.h) {
            z36.a();
        }
    }
}
