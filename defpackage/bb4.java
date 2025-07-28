package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bb4  reason: default package */
public final class bb4 implements r4e, SurfaceTexture.OnFrameAvailableListener {
    public final AtomicBoolean X = new AtomicBoolean(false);
    public final float[] Y = new float[16];
    public final float[] Z = new float[16];
    public final vj4 a;
    public final HandlerThread b;
    public final vd6 c;
    public final Handler o;
    public final LinkedHashMap w0 = new LinkedHashMap();
    public int x0 = 0;
    public boolean y0 = false;
    public final ArrayList z0 = new ArrayList();

    public bb4(zq4 zq4) {
        Map emptyMap = Collections.emptyMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.o = handler;
        this.c = new vd6(handler);
        this.a = new vj4();
        try {
            hwf.f(new xz(this, zq4, emptyMap, 5)).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            e = e instanceof ExecutionException ? e.getCause() : e;
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    public final void a(y4e y4e) {
        if (this.X.get()) {
            y4e.d();
        } else {
            e(new dr1(this, 25, y4e), new za4(y4e, 0));
        }
    }

    public final ch7 b(int i, int i2) {
        return ct0.A(hwf.f(new y34(i, i2, this)));
    }

    public final void c(q4e q4e) {
        if (this.X.get()) {
            q4e.close();
            return;
        }
        dr1 dr1 = new dr1(this, 24, q4e);
        Objects.requireNonNull(q4e);
        e(dr1, new ds1(28, q4e));
    }

    public final void d() {
        if (this.y0 && this.x0 == 0) {
            LinkedHashMap linkedHashMap = this.w0;
            for (q4e close : linkedHashMap.keySet()) {
                close.close();
            }
            Iterator it = this.z0.iterator();
            while (it.hasNext()) {
                ((b90) it.next()).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            this.a.q();
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new g5(this, runnable2, runnable, 19));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.z0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b90) it.next()).c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap g(Size size, float[] fArr, int i) {
        int i2 = i;
        float[] fArr2 = (float[]) fArr.clone();
        e07.G(fArr2, (float) i2);
        e07.H(fArr2);
        Size g = hqe.g(size, i2);
        vj4 vj4 = this.a;
        vj4.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(g.getHeight() * g.getWidth() * 4);
        e07.j("ByteBuffer capacity is not equal to width * height * 4.", allocateDirect.capacity() == (g.getHeight() * g.getWidth()) * 4);
        e07.j("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = w36.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        w36.b("glGenTextures");
        int i3 = iArr2[0];
        GLES20.glActiveTexture(33985);
        w36.b("glActiveTexture");
        GLES20.glBindTexture(3553, i3);
        w36.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, g.getWidth(), g.getHeight(), 0, 6407, 5121, (Buffer) null);
        w36.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        w36.b("glGenFramebuffers");
        int i4 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i4);
        w36.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
        w36.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        w36.b("glActiveTexture");
        GLES20.glBindTexture(36197, vj4.b);
        w36.b("glBindTexture");
        vj4.k = null;
        GLES20.glViewport(0, 0, g.getWidth(), g.getHeight());
        GLES20.glScissor(0, 0, g.getWidth(), g.getHeight());
        u36 u36 = (u36) vj4.m;
        u36.getClass();
        if (u36 instanceof v36) {
            GLES20.glUniformMatrix4fv(((v36) u36).f, 1, false, fArr2, 0);
            w36.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        w36.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, g.getWidth(), g.getHeight(), 6408, 5121, allocateDirect);
        w36.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i3}, 0);
        w36.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i4}, 0);
        w36.b("glDeleteFramebuffers");
        int i5 = vj4.b;
        GLES20.glActiveTexture(33984);
        w36.b("glActiveTexture");
        GLES20.glBindTexture(36197, i5);
        w36.b("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(g.getWidth(), g.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.e(createBitmap, allocateDirect, g.getWidth() * 4);
        return createBitmap;
    }

    public final void h(ese ese) {
        ByteArrayOutputStream byteArrayOutputStream;
        ArrayList arrayList = this.z0;
        if (!arrayList.isEmpty()) {
            if (ese == null) {
                f(new Exception("Failed to snapshot: no JPEG Surface."));
                return;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    b90 b90 = (b90) it.next();
                    int i3 = b90.b;
                    if (i != i3 || bitmap == null) {
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = g((Size) ese.b, (float[]) ese.c, i3);
                        i2 = -1;
                        i = i3;
                    }
                    int i4 = b90.a;
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.f(bArr, (Surface) ese.a);
                    b90.c.b((Object) null);
                    it.remove();
                }
                byteArrayOutputStream.close();
                return;
            } catch (IOException e) {
                f(e);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (!this.X.get()) {
            surfaceTexture.updateTexImage();
            float[] fArr = this.Y;
            surfaceTexture.getTransformMatrix(fArr);
            ese ese = null;
            for (Map.Entry entry : this.w0.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                q4e q4e = (q4e) entry.getKey();
                float[] fArr2 = this.Z;
                q4e.n(fArr2, fArr);
                int i = q4e.c;
                if (i == 34) {
                    try {
                        this.a.t(surfaceTexture.getTimestamp(), fArr2, surface);
                    } catch (RuntimeException unused) {
                    }
                } else {
                    boolean z = true;
                    e07.p("Unsupported format: " + i, i == 256);
                    if (ese != null) {
                        z = false;
                    }
                    e07.p("Only one JPEG output is supported.", z);
                    ese = new ese(surface, q4e.o, (float[]) fArr2.clone());
                }
            }
            try {
                h(ese);
            } catch (RuntimeException e) {
                f(e);
            }
        }
    }

    public final void release() {
        if (!this.X.getAndSet(true)) {
            e(new ds1(29, this), new lc(5));
        }
    }
}
