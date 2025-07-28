package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: mmd  reason: default package */
public final class mmd implements GLSurfaceView.Renderer, nga {
    public final float[] X;
    public final float[] Y;
    public float Z;
    public final olc a;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] o;
    public float w0;
    public final float[] x0;
    public final float[] y0;
    public final /* synthetic */ nmd z0;

    public mmd(nmd nmd, olc olc) {
        this.z0 = nmd;
        float[] fArr = new float[16];
        this.o = fArr;
        float[] fArr2 = new float[16];
        this.X = fArr2;
        float[] fArr3 = new float[16];
        this.Y = fArr3;
        this.x0 = new float[16];
        this.y0 = new float[16];
        this.a = olc;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.w0 = 3.1415927f;
    }

    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.o;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.w0 = f2;
        Matrix.setRotateM(this.X, 0, -this.Z, (float) Math.cos((double) f2), (float) Math.sin((double) this.w0), 0.0f);
    }

    /* JADX WARNING: type inference failed for: r4v12, types: [wx, java.lang.Object] */
    public final void onDrawFrame(GL10 gl10) {
        Object d;
        Object d2;
        Object d3;
        synchronized (this) {
            Matrix.multiplyMM(this.y0, 0, this.o, 0, this.Y, 0);
            Matrix.multiplyMM(this.x0, 0, this.X, 0, this.y0, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.x0, 0);
        olc olc = this.a;
        float[] fArr = this.c;
        olc.getClass();
        GLES20.glClear(16384);
        ete.k();
        if (olc.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = olc.y0;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            ete.k();
            if (olc.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(olc.Z, 0);
            }
            long timestamp = olc.y0.getTimestamp();
            mje mje = olc.X;
            synchronized (mje) {
                d = mje.d(timestamp, false);
            }
            Long l = (Long) d;
            if (l != null) {
                e06 e06 = olc.o;
                float[] fArr2 = olc.Z;
                long longValue = l.longValue();
                mje mje2 = (mje) e06.o;
                synchronized (mje2) {
                    d3 = mje2.d(longValue, true);
                }
                float[] fArr3 = (float[]) d3;
                if (fArr3 != null) {
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    int i = (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1));
                    float[] fArr4 = (float[]) e06.c;
                    if (i != 0) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees((double) length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!e06.a) {
                        e06.b((float[]) e06.b, (float[]) e06.c);
                        e06.a = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) e06.b, 0, (float[]) e06.c, 0);
                }
            }
            mje mje3 = olc.Y;
            synchronized (mje3) {
                d2 = mje3.d(timestamp, true);
            }
            fhb fhb = (fhb) d2;
            if (fhb != null) {
                ghb ghb = olc.c;
                ghb.getClass();
                if (ghb.b(fhb)) {
                    ghb.a = fhb.c;
                    wx wxVar = fhb.a.a[0];
                    ? obj = new Object();
                    float[] fArr5 = (float[]) wxVar.c;
                    obj.a = fArr5.length / 3;
                    obj.c = (FloatBuffer) ByteBuffer.allocateDirect(fArr5.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr5).flip();
                    float[] fArr6 = (float[]) wxVar.o;
                    obj.o = (FloatBuffer) ByteBuffer.allocateDirect(fArr6.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr6).flip();
                    int i2 = wxVar.b;
                    if (i2 == 1) {
                        obj.b = 5;
                    } else if (i2 != 2) {
                        obj.b = 4;
                    } else {
                        obj.b = 6;
                    }
                    ghb.g = obj;
                    if (!fhb.d) {
                        wx wxVar2 = fhb.b.a[0];
                        float[] fArr7 = (float[]) wxVar2.c;
                        int length2 = fArr7.length;
                        FloatBuffer floatBuffer = (FloatBuffer) ByteBuffer.allocateDirect(fArr7.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr7).flip();
                        float[] fArr8 = (float[]) wxVar2.o;
                        FloatBuffer floatBuffer2 = (FloatBuffer) ByteBuffer.allocateDirect(fArr8.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr8).flip();
                    }
                }
            }
        }
        Matrix.multiplyMM(olc.w0, 0, fArr, 0, olc.Z, 0);
        ghb ghb2 = olc.c;
        int i3 = olc.x0;
        float[] fArr9 = olc.w0;
        wx wxVar3 = (wx) ghb2.g;
        if (wxVar3 != null) {
            int i4 = ghb2.a;
            GLES20.glUniformMatrix3fv(ghb2.c, 1, false, i4 == 1 ? ghb.j : i4 == 2 ? ghb.k : ghb.i, 0);
            GLES20.glUniformMatrix4fv(ghb2.b, 1, false, fArr9, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i3);
            GLES20.glUniform1i(ghb2.f, 0);
            ete.k();
            GLES20.glVertexAttribPointer(ghb2.d, 3, 5126, false, 12, (FloatBuffer) wxVar3.c);
            ete.k();
            GLES20.glVertexAttribPointer(ghb2.e, 2, 5126, false, 8, (FloatBuffer) wxVar3.o);
            ete.k();
            GLES20.glDrawArrays(wxVar3.b, 0, wxVar3.a);
            ete.k();
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = ((float) i) / ((float) i2);
        Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        nmd nmd = this.z0;
        nmd.w0.post(new sbc(nmd, 22, this.a.a()));
    }
}
