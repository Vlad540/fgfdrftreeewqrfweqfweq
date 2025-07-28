package defpackage;

import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;

/* renamed from: rs4  reason: default package */
public final /* synthetic */ class rs4 implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ EglRenderer a;
    public final /* synthetic */ RendererCommon.GlDrawer b;
    public final /* synthetic */ EglRenderer.FrameListener c;
    public final /* synthetic */ float o;

    public /* synthetic */ rs4(EglRenderer eglRenderer, RendererCommon.GlDrawer glDrawer, EglRenderer.FrameListener frameListener, float f, boolean z) {
        this.a = eglRenderer;
        this.b = glDrawer;
        this.c = frameListener;
        this.o = f;
        this.X = z;
    }

    public final void run() {
        this.a.lambda$addFrameListener$1(this.b, this.c, this.o, this.X);
    }
}
