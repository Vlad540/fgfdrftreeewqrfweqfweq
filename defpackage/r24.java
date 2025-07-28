package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxDecoderWrapper;

/* renamed from: r24  reason: default package */
public final class r24 implements VideoSink, VpxDecoderWrapper.ErrorCallback {
    public final AtomicInteger A0 = new AtomicInteger(-1);
    public final AtomicInteger B0 = new AtomicInteger(-1);
    public final AtomicInteger C0 = new AtomicInteger(-1);
    public final /* synthetic */ nxf D0;
    public final Handler X;
    public final int Y;
    public volatile boolean Z = false;
    public final VpxDecoderWrapper a;
    public final joc b;
    public final xwb c;
    public final HandlerThread o;
    public volatile boolean w0 = false;
    public volatile boolean x0 = true;
    public final AtomicInteger y0 = new AtomicInteger(0);
    public final AtomicInteger z0 = new AtomicInteger(0);

    public r24(nxf nxf, int i, joc joc, xwb xwb) {
        this.D0 = nxf;
        this.b = joc;
        this.c = xwb;
        this.a = new VpxDecoderWrapper();
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperVpxQueue");
        this.o = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.X = handler;
        this.Y = i;
        handler.post(new n30(i, 7, this));
    }

    public final void a() {
        if (!this.Z) {
            this.Z = true;
            xwb xwb = this.c;
            xwb.log("DecoderWrapper", "releasing decoder " + System.identityHashCode(this));
            HandlerThread handlerThread = this.o;
            Handler handler = this.D0.e;
            VpxDecoderWrapper vpxDecoderWrapper = this.a;
            Objects.requireNonNull(vpxDecoderWrapper);
            ds1 ds1 = new ds1(20, vpxDecoderWrapper);
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(ds1);
            handlerThread.quitSafely();
            this.w0 = true;
        }
    }

    public final void onDecodeError(int i) {
        StringBuilder m = me4.m(i, "onDecodeError vpx_error_code:", " System.identityHashCode: ");
        m.append(System.identityHashCode(this));
        this.c.log("DecoderWrapper", m.toString());
        nxf nxf = this.D0;
        nxf.x.a();
        nxf.t.incrementAndGet();
        this.x0 = true;
        this.A0.set(this.z0.get());
    }

    public final void onFrame(VideoFrame videoFrame) {
        if (!this.Z) {
            this.D0.s.incrementAndGet();
            this.D0.w.a();
            if (SystemClock.elapsedRealtimeNanos() > nxf.E) {
                joc joc = this.b;
                koc koc = (koc) joc.b;
                ge1 ge1 = (ge1) joc.c;
                if (!koc.f) {
                    koc.e.a(ge1, videoFrame);
                }
            }
            this.B0.set(videoFrame.getRotatedWidth());
            this.C0.set(videoFrame.getRotatedHeight());
        }
    }
}
