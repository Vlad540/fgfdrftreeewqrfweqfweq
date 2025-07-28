package defpackage;

import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* renamed from: goc  reason: default package */
public final class goc extends cf3 {
    public final PeerConnectionFactory Y;
    public SurfaceTextureHelper Z;
    public final w4g w0;

    public goc(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, xwb xwb, ygd ygd, ufc ufc) {
        super(str, mediaStream, xwb);
        this.Y = peerConnectionFactory;
        this.w0 = new w4g(ufc, ygd);
    }

    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.addTrack(videoTrack);
        }
    }

    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.removeTrack(videoTrack);
        }
        SurfaceTextureHelper surfaceTextureHelper = this.Z;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.Z = null;
    }

    public final MediaSource g() {
        return this.Y.createVideoSource(false);
    }

    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.Y.createVideoTrack(str, (VideoSource) mediaSource);
    }

    public final String toString() {
        return "OkSdkScreenShareRecord";
    }

    public final void u(int i, int i2, int i3) {
        n3f n3f;
        int i4;
        if (i <= 0 || i2 <= 0 || i < i2 || i3 <= 0) {
            n3f = null;
        } else {
            int i5 = 320;
            if (i < 320) {
                i4 = a24.X(((float) 320) * (((float) i2) / ((float) i))) / 16;
            } else {
                i5 = (i / 16) * 16;
                i4 = i2 / 16;
            }
            int i6 = i5;
            int i7 = i4 * 16;
            n3f = new n3f(i6, i7, i7, i6, i3);
        }
        if (n3f != null) {
            VideoSource videoSource = (VideoSource) ((MediaSource) this.o);
            if (videoSource != null) {
                videoSource.adaptOutputFormat(n3f.a, n3f.b, n3f.c, n3f.d, i3);
            }
            String j = j();
            StringBuilder sb = new StringBuilder("Set screenshare dimensions to ");
            sb.append(n3f.a);
            sb.append(" x ");
            th2.l(sb, n3f.b, " by requested ", i, " x ");
            sb.append(i2);
            sb.append(" fps ");
            sb.append(i3);
            ((xwb) this.c).log(j, sb.toString());
        }
    }
}
