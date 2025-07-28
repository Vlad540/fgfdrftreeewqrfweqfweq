package defpackage;

import android.content.Context;
import android.media.projection.MediaProjection;
import android.os.Handler;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: py5  reason: default package */
public final class py5 extends MediaProjection.Callback implements CapturerObserver, ml7 {
    public volatile SurfaceTextureHelper X;
    public volatile ScreenCapturerAndroid Y;
    public VideoSink Z;
    public final EglBase.Context a;
    public final Context b;
    public final xwb c;
    public final jr3 o = new jr3("SSFrameCapturer");
    public final lje w0 = new lje();
    public boolean x0;
    public boolean y0;
    public final ygd z0;

    public py5(EglBase.Context context, Context context2, ygd ygd, xwb xwb) {
        this.a = context;
        this.b = context2;
        this.c = xwb;
        this.z0 = ygd;
    }

    public final void a(int i, int i2) {
        this.o.c(new as0(this, i, i2, 1));
    }

    public final void b(Size size, int i) {
        if (this.x0 && !this.y0) {
            try {
                this.Y.startCapture(size.width, size.height, 0);
                this.y0 = true;
            } catch (SecurityException e) {
                this.c.logException("FrameCapturerImpl", "Error starting screen capture", e);
                if (i > 10) {
                    this.c.reportException("FrameCapturerImpl", rf0.f(i, "Error: ", "times of restart screen capture did fail"), e);
                    this.o.c(new oy5(this, 0));
                    return;
                }
                jr3 jr3 = this.o;
                ((Handler) jr3.b).postDelayed(new wg1(this, size, i, 10), 400);
            } catch (RuntimeException e2) {
                this.c.reportException("FrameCapturerImpl", "Error starting screen capture", e2);
                this.o.c(new oy5(this, 0));
            }
        }
    }

    public final void onCapturerStarted(boolean z) {
        ygd ygd;
        this.c.log("FrameCapturerImpl", us8.k("Screen capture did start success=", z));
        if (z && (ygd = this.z0) != null) {
            ((gx0) ygd.a).Z0.log("OKRTCCall", "Screen capture has started, fast=false");
        }
    }

    public final void onCapturerStopped() {
        this.c.log("FrameCapturerImpl", "Screen capture did stop");
        ygd ygd = this.z0;
        if (ygd != null) {
            ygd.e(false);
        }
    }

    public final void onFrameCaptured(VideoFrame videoFrame) {
        this.w0.a();
        VideoSink videoSink = this.Z;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    public final void onStop() {
        this.o.c(new oy5(this, 0));
    }
}
