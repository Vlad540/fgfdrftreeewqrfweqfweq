package defpackage;

import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoderFactory;

/* renamed from: yka  reason: default package */
public final class yka implements VideoEncoderFactory.VideoEncoderSelector, iy7 {
    public volatile nyf X = new nyf(1, false);
    public final wka a;
    public final xwb b;
    public VideoCodecInfo c;
    public VideoCodecInfo o;

    public yka(wka wka, xwb xwb) {
        this.a = wka;
        this.b = xwb;
    }

    public static VideoCodecInfo b(VideoCodecInfo[] videoCodecInfoArr, String str) {
        if (videoCodecInfoArr != null) {
            for (VideoCodecInfo videoCodecInfo : videoCodecInfoArr) {
                if (hhd.f(videoCodecInfo.name, str)) {
                    return videoCodecInfo;
                }
            }
        }
        return null;
    }

    public final VideoCodecInfo a() {
        VideoCodecInfo videoCodecInfo;
        if (this.o == null) {
            return null;
        }
        nyf nyf = this.X;
        if (xka.$EnumSwitchMapping$0[hr1.t(nyf.a)] == 1) {
            videoCodecInfo = this.o;
        } else if (nyf.b) {
            VideoCodecInfo[] supportedCodecs = this.a.a.getSupportedCodecs();
            VideoCodecInfo b2 = b(supportedCodecs, "VP9");
            if (b2 == null) {
                videoCodecInfo = b(supportedCodecs, "VP8");
                if (videoCodecInfo == null) {
                    videoCodecInfo = b(this.a.b.getSupportedCodecs(), "VP8");
                }
            } else {
                videoCodecInfo = b2;
            }
        } else {
            videoCodecInfo = b(this.a.b.getSupportedCodecs(), "VP8");
            if (videoCodecInfo == null) {
                this.b.log("PatchedVideoEncoderFactoryCodecSelector", "Software VP8 encoder not found");
            }
        }
        if (hhd.f(videoCodecInfo, this.c)) {
            return null;
        }
        xwb xwb = this.b;
        VideoCodecInfo videoCodecInfo2 = this.c;
        xwb.log("PatchedVideoEncoderFactoryCodecSelector", "Selected encoder " + videoCodecInfo + " differs from current one " + videoCodecInfo2 + ". Let us suggest an update");
        return videoCodecInfo;
    }

    public final VideoCodecInfo onAvailableBitrate(int i) {
        return a();
    }

    public final void onCurrentEncoder(VideoCodecInfo videoCodecInfo) {
        if (this.o == null && videoCodecInfo != null) {
            xwb xwb = this.b;
            xwb.log("PatchedVideoEncoderFactoryCodecSelector", "Encoder  " + videoCodecInfo + " was selected as default");
            this.o = videoCodecInfo;
        }
        this.c = videoCodecInfo;
        xwb xwb2 = this.b;
        nyf nyf = this.X;
        xwb2.log("PatchedVideoEncoderFactoryCodecSelector", "Codec selected: " + videoCodecInfo + " for condition " + nyf);
    }

    public final VideoCodecInfo onEncoderBroken() {
        boolean f = hhd.f(this.c, this.o);
        xwb xwb = this.b;
        if (f) {
            VideoCodecInfo videoCodecInfo = this.o;
            if (videoCodecInfo != null) {
                xwb.log("PatchedVideoEncoderFactoryCodecSelector", "Default encoder " + videoCodecInfo + " was broken. reset");
            }
            this.o = null;
        }
        VideoCodecInfo videoCodecInfo2 = this.c;
        if (videoCodecInfo2 != null) {
            xwb.log("PatchedVideoEncoderFactoryCodecSelector", "Current encoder " + videoCodecInfo2 + " was broken. reset");
        }
        this.c = null;
        return a();
    }

    public final VideoCodecInfo onResolutionChange(int i, int i2) {
        return a();
    }

    public final void q(jy7 jy7) {
        xwb xwb = this.b;
        xwb.log("PatchedVideoEncoderFactoryCodecSelector", "Network condition did change. New condition is " + jy7);
        this.X = new nyf(jy7.a, jy7.c);
    }
}
