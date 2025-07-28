package defpackage;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* renamed from: tc1  reason: default package */
public final class tc1 {
    public final xwb a;
    public final EglBase.Context b;
    public final re c;
    public final String d;
    public final rc1 e;
    public final Matrix f = new Matrix();
    public final VideoFrameDrawer g = new VideoFrameDrawer();
    public final GlRectDrawer h = new GlRectDrawer();
    public final ArrayList i = new ArrayList();

    public tc1(xwb xwb, EglBase.Context context, int[] iArr, String str) {
        EglBase.Context context2 = context;
        this.a = xwb;
        this.b = context2;
        this.d = rf0.h("CallOpenGL_renderer_", str);
        rc1 rc1 = new rc1(xwb, ((EglBase14.Context) context2).getRawContext(), iArr, new h87(1, this, tc1.class, "onReleaseContext", "onReleaseContext(Lru/ok/android/webrtc/opengl/CallOpenGLContext;)V", 0, 25), str);
        this.e = rc1;
        re reVar = new re(7, this);
        try {
            rc1.k.postDelayed(reVar, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        } catch (IllegalStateException e2) {
            rc1.a.reportException(rc1.j, "OpenGL tread died, is it fine?", e2);
        }
        this.c = reVar;
    }

    public final void a() {
        rc1 rc1 = this.e;
        rc1.a.log(rc1.j, "Release requested");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (rc1.h) {
            if (!rc1.i) {
                rc1.a.log(rc1.j, "Already released, ignore");
                countDownLatch.countDown();
            } else {
                rc1.i = false;
                rc1.k.postAtFrontOfQueue(new c(rc1, 15, countDownLatch));
                rc1.a.log(rc1.j, "Release action submitted");
            }
        }
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    public final void b(rc1 rc1, um1 um1, VideoFrame videoFrame, xf1 xf1) {
        rc1 rc12 = rc1;
        um1 um12 = um1;
        xf1 xf12 = xf1;
        EGLSurface eGLSurface = um12.a;
        if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            long nanoTime = System.nanoTime();
            rc12.b(eGLSurface);
            rc1.a("makeCurrent()");
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            Matrix matrix = this.f;
            matrix.reset();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(xf12.c ? -1.0f : 1.0f, 1.0f);
            matrix.preScale(xf12.a, xf12.b);
            matrix.preTranslate(-0.5f, -0.5f);
            RendererCommon.GlDrawer glDrawer = um12.k;
            if (glDrawer == null) {
                glDrawer = this.h;
            }
            RendererCommon.GlDrawer glDrawer2 = glDrawer;
            EGLDisplay eGLDisplay = rc12.e;
            if (eGLDisplay != null) {
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
                int i2 = iArr[0];
                EGLDisplay eGLDisplay2 = rc12.e;
                if (eGLDisplay2 != null) {
                    int[] iArr2 = new int[1];
                    EGL14.eglQuerySurface(eGLDisplay2, eGLSurface, 12374, iArr2, 0);
                    this.g.drawFrame(videoFrame, glDrawer2, matrix, 0, 0, i2, iArr2[0]);
                    rc1.a("drawFrame()");
                    long nanoTime2 = System.nanoTime();
                    EGLDisplay eGLDisplay3 = rc12.e;
                    if (eGLDisplay3 != null) {
                        EGL14.eglSwapBuffers(eGLDisplay3, eGLSurface);
                        rc1.a("swapBuffers()");
                        long nanoTime3 = System.nanoTime();
                        vm1 vm1 = um12.l;
                        vm1.h += nanoTime3 - nanoTime;
                        vm1.i += nanoTime3 - nanoTime2;
                        rc1.a("swapBuffers()");
                        return;
                    }
                    throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                }
                throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
            }
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
    }
}
