package defpackage;

import org.webrtc.EglRenderer;
import org.webrtc.EglThread;
import org.webrtc.VideoFrame;

/* renamed from: ts4  reason: default package */
public final /* synthetic */ class ts4 implements EglThread.RenderUpdate {
    public final /* synthetic */ EglRenderer a;
    public final /* synthetic */ VideoFrame b;
    public final /* synthetic */ long c;

    public /* synthetic */ ts4(EglRenderer eglRenderer, VideoFrame videoFrame, long j) {
        this.a = eglRenderer;
        this.b = videoFrame;
        this.c = j;
    }

    public final void update(boolean z) {
        this.a.lambda$swapBuffersOnRenderThread$5(this.b, this.c, z);
    }
}
