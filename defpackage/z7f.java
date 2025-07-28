package defpackage;

import android.graphics.Matrix;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* renamed from: z7f  reason: default package */
public final class z7f extends cf3 implements SurfaceTextureHelper.FrameGeometryAdjuster {
    public volatile float A0;
    public final PeerConnectionFactory Y;
    public final lyf Z;
    public SurfaceTextureHelper w0;
    public j1c x0;
    public final y4f y0;
    public volatile Size z0;

    public z7f(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, Integer num, boolean z, lyf lyf, xwb xwb) {
        super(str, mediaStream, xwb);
        this.Y = peerConnectionFactory;
        this.Z = lyf;
        this.y0 = new y4f(z, num != null ? num.intValue() : 960, new h87(1, this, z7f.class, "logBufferTransform", "logBufferTransform(Ljava/lang/String;)V", 0, 21));
        this.z0 = new Size(960, 540);
        this.A0 = 1.0f;
    }

    public final SurfaceTextureHelper.FrameGeometry adjustFrameGeometry(Matrix matrix, int i, int i2) {
        zna zna;
        Integer num;
        Integer num2;
        Integer num3;
        y4f y4f = this.y0;
        y4f.getClass();
        if (i == 0 || i2 == 0) {
            u16 u16 = y4f.b;
            u16.invoke("Wrong frame size: " + i + "x" + i2);
            zna = w4f.a;
        } else {
            zna = y4f.f;
            Integer num4 = y4f.d;
            Integer num5 = y4f.e;
            int i3 = y4f.c;
            if (num4 != null && num5 != null) {
                i3 = Math.min(num4.intValue(), num5.intValue());
            } else if (num4 != null) {
                i3 = num4.intValue();
            } else if (num5 != null) {
                i3 = num5.intValue();
            }
            if (zna == null || (num = y4f.g) == null || num.intValue() != i || (num2 = y4f.h) == null || num2.intValue() != i2 || (num3 = y4f.i) == null || num3.intValue() != i3) {
                zna = y4f.a(i, i2);
                y4f.f = zna;
                y4f.g = Integer.valueOf(i);
                y4f.h = Integer.valueOf(i2);
                y4f.i = Integer.valueOf(i3);
                u16 u162 = y4f.b;
                int i4 = zna.g;
                int i5 = zna.h;
                StringBuilder i6 = rf0.i("get new transform ", i, "x", i2, " -> ");
                i6.append(i4);
                i6.append("x");
                i6.append(i5);
                u162.invoke(i6.toString());
            }
        }
        return zna.a(matrix, i, i2);
    }

    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        videoTrack.setContentHint(VideoTrack.ContentHint.NONE);
        if (mediaStream != null) {
            mediaStream.addTrack(videoTrack);
        }
    }

    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.removeTrack(videoTrack);
        }
        SurfaceTextureHelper surfaceTextureHelper = this.w0;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.w0 = null;
    }

    public final MediaSource g() {
        return this.Y.createVideoSource(false);
    }

    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.Y.createVideoTrack(str, (VideoSource) mediaSource);
    }

    public final String j() {
        return "VideoRecord";
    }

    public final void m() {
        z7f.super.m();
        this.x0 = null;
    }

    public final String toString() {
        return "OkSdkVideoRecord(isScreenCast=false)";
    }

    public final void u() {
        VideoSource videoSource = (VideoSource) ((MediaSource) this.o);
        if (videoSource == null) {
            ((xwb) this.c).log("VideoRecord", "No source while trying to update video format");
            return;
        }
        Size b = this.y0.b(this.z0.width, this.z0.height);
        if (b == null) {
            b = new Size(960, 540);
        }
        ((xwb) this.c).log("VideoRecord", me4.g("Apply output format adaptation: size= ", b.width, b.height, "x"));
        videoSource.adaptOutputFormat(b.width, b.height, a24.X(this.A0 * 24.0f));
    }
}
