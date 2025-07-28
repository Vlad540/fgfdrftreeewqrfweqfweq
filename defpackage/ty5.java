package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.EncodedImage;
import org.webrtc.EncoderCallback;
import org.webrtc.GlUtil;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxEncoderWrapper;

/* renamed from: ty5  reason: default package */
public final class ty5 implements EncoderCallback, VideoSink {
    public final AtomicInteger A0 = new AtomicInteger(0);
    public volatile boolean B0;
    public volatile long C0;
    public final ufc X;
    public volatile VpxEncoderWrapper Y;
    public volatile hz5 Z;
    public final long a;
    public final long b;
    public final jr3 c;
    public final xwb o;
    public volatile hz5 w0;
    public volatile long x0;
    public final lje y0;
    public final lje z0;

    public ty5(xwb xwb, ufc ufc) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = timeUnit.toMillis(5);
        this.b = timeUnit.toNanos(1) / 10;
        this.o = xwb;
        this.X = ufc;
        this.c = new jr3("SSFrameEncoder");
        this.y0 = new lje();
        this.z0 = new lje();
    }

    public final void a() {
        this.B0 = false;
        VpxEncoderWrapper vpxEncoderWrapper = this.Y;
        if (vpxEncoderWrapper != null) {
            vpxEncoderWrapper.release();
        }
        this.Y = null;
    }

    public final void onEncodedImage(EncodedImage encodedImage) {
        this.y0.a();
        EncodedImage.FrameType frameType = encodedImage.frameType;
        EncodedImage.FrameType frameType2 = EncodedImage.FrameType.VideoFrameKey;
        if (frameType == frameType2) {
            this.x0 = SystemClock.elapsedRealtime();
        }
        if (this.Z != null) {
            hz5 hz5 = this.Z;
            if (!hz5.a) {
                encodedImage.release();
                return;
            }
            if (encodedImage.frameType == frameType2) {
                hz5.h = false;
            }
            hz5.c.add(encodedImage);
            hz5.d.addAndGet(encodedImage.buffer.remaining());
            hz5.b(hz5.g);
        }
    }

    public final void onFrame(VideoFrame videoFrame) {
        hz5 hz5 = this.w0;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (elapsedRealtimeNanos >= this.C0 + this.b) {
            if ((hz5 == null || (hz5.c.size() <= 15 && hz5.d.get() <= 4000000)) && this.A0.get() < 5) {
                try {
                    VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                    this.X.getClass();
                    float rotation = (((float) (videoFrame.getRotation() + 360)) + 0.0f) % 360.0f;
                    xwb xwb = this.o;
                    xwb.log("SSFrameEncoder", "rotation angle = " + rotation);
                    VideoFrame videoFrame2 = new VideoFrame(i420, (int) rotation, videoFrame.getTimestampNs());
                    this.C0 = elapsedRealtimeNanos;
                    this.A0.incrementAndGet();
                    this.c.c(new px4(this, hz5, videoFrame2, 6));
                } catch (GlUtil.GlOutOfMemoryException unused) {
                    this.o.log("SSFrameEncoder", "gl oom @ toI420, skipping");
                }
            }
        }
    }

    public final void onFrameDropped(int i) {
        this.z0.a();
    }
}
