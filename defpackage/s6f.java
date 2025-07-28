package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.gl.effects.VideoMessageStencilHolder;
import one.me.sdk.gl.effects.objects.FrameBuffer;
import one.me.sdk.gl.effects.objects.OesToImage2dRenderer;
import one.me.sdk.gl.effects.objects.TrivialFragmentShader;

/* renamed from: s6f  reason: default package */
public final class s6f extends vj4 {
    public final Size o;
    public final String p;
    public msd q;
    public OesToImage2dRenderer r;
    public TrivialFragmentShader s;
    public final float[] t = new float[16];
    public long u;
    public int v = -1;

    public s6f(Size size, zq4 zq4) {
        this.o = size;
        String name = s6f.class.getName();
        this.p = name;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, name, "init, previewSize=" + size + ", dynamicRange=" + zq4, (Throwable) null);
        }
        n(zq4, Collections.emptyMap());
    }

    public final void q() {
        udd.U(this.p, "release");
        TrivialFragmentShader trivialFragmentShader = this.s;
        if (trivialFragmentShader != null) {
            trivialFragmentShader.release();
        }
        this.s = null;
        OesToImage2dRenderer oesToImage2dRenderer = this.r;
        if (oesToImage2dRenderer != null) {
            oesToImage2dRenderer.release();
        }
        this.r = null;
        msd msd = this.q;
        if (msd != null) {
            udd.U(msd.d, "release");
            msd.e.release();
            msd.f.release();
        }
        this.q = null;
        s6f.super.q();
    }

    public final void w(SurfaceTexture surfaceTexture, Surface surface, float[] fArr, boolean z) {
        TrivialFragmentShader trivialFragmentShader;
        FrameBuffer frameBuffer;
        Surface surface2 = surface;
        float[] fArr2 = fArr;
        da0 l = l(surface2);
        if (l.equals(w36.j)) {
            l = h(surface2);
            if (l != null) {
                ((HashMap) this.d).put(surface2, l);
            } else {
                return;
            }
        }
        da0 da0 = l;
        w36.d((AtomicBoolean) this.c, true);
        w36.c((Thread) this.e);
        int i = this.b;
        long timestamp = surfaceTexture.getTimestamp();
        msd msd = this.q;
        if (msd == null) {
            msd = new msd(this.o);
            this.q = msd;
        }
        msd msd2 = msd;
        OesToImage2dRenderer oesToImage2dRenderer = this.r;
        if (oesToImage2dRenderer == null) {
            oesToImage2dRenderer = new OesToImage2dRenderer();
            this.r = oesToImage2dRenderer;
        }
        TrivialFragmentShader trivialFragmentShader2 = this.s;
        if (trivialFragmentShader2 == null) {
            trivialFragmentShader2 = new TrivialFragmentShader(0, false);
            this.s = trivialFragmentShader2;
        }
        TrivialFragmentShader trivialFragmentShader3 = trivialFragmentShader2;
        int i2 = (timestamp > this.u ? 1 : (timestamp == this.u ? 0 : -1));
        FrameBuffer frameBuffer2 = msd2.f;
        float[] fArr3 = this.t;
        if (i2 == 0 && i == this.v && Arrays.equals(fArr2, fArr3)) {
            frameBuffer = frameBuffer2;
            trivialFragmentShader = trivialFragmentShader3;
        } else {
            frameBuffer2.bind();
            GLES20.glViewport(0, 0, msd2.b, msd2.c);
            frameBuffer = frameBuffer2;
            trivialFragmentShader = trivialFragmentShader3;
            OesToImage2dRenderer.render$default(oesToImage2dRenderer, i, fArr, (float[]) null, 4, (Object) null);
            frameBuffer.unbind();
            System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
            this.u = timestamp;
            this.v = i;
        }
        int textureId = frameBuffer.getTextureId();
        Size size = msd2.a;
        int width = size.getWidth();
        int height = size.getHeight();
        VideoMessageStencilHolder videoMessageStencilHolder = msd2.e;
        int i3 = da0.b;
        int i4 = da0.c;
        videoMessageStencilHolder.render(textureId, width, height, i3, i4, !z, false);
        boolean f = hhd.f((Surface) this.k, surface2);
        EGLSurface eGLSurface = da0.a;
        if (!f) {
            o(eGLSurface);
            this.k = surface2;
        }
        GLES20.glViewport(0, 0, i3, i4);
        TrivialFragmentShader trivialFragmentShader4 = trivialFragmentShader;
        trivialFragmentShader4.setTextureId(frameBuffer.getTextureId());
        trivialFragmentShader4.render();
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, timestamp);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            int eglGetError = EGL14.eglGetError();
            iu7.f(16);
            udd.s(this.p, rf0.h("failed to swap buffers, error=0x", d8.F(16, ((long) eglGetError) & 4294967295L)), (Throwable) null);
            s(surface2, false);
        }
    }
}
