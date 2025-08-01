package org.webrtc;

import java.util.List;

public class RtpSender {
    private MediaStreamTrack cachedTrack;
    private final DtmfSender dtmfSender;
    private long nativeRtpSender;
    private boolean ownsTrack = true;

    @CalledByNative
    public RtpSender(long j) {
        this.nativeRtpSender = j;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j));
        DtmfSender dtmfSender2 = null;
        if (nativeGetMediaType(j).equalsIgnoreCase(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            long nativeGetDtmfSender = nativeGetDtmfSender(j);
            this.dtmfSender = nativeGetDtmfSender != 0 ? new DtmfSender(nativeGetDtmfSender) : dtmfSender2;
            return;
        }
        this.dtmfSender = null;
    }

    private void checkRtpSenderExists() {
        if (this.nativeRtpSender == 0) {
            throw new IllegalStateException("RtpSender has been disposed.");
        }
    }

    private static native long nativeGetDtmfSender(long j);

    private static native String nativeGetId(long j);

    private static native String nativeGetMediaType(long j);

    private static native RtpParameters nativeGetParameters(long j);

    private static native List<String> nativeGetStreams(long j);

    private static native long nativeGetTrack(long j);

    private static native void nativeSetFrameEncryptor(long j, long j2);

    private static native boolean nativeSetParameters(long j, RtpParameters rtpParameters);

    private static native void nativeSetStreams(long j, List<String> list);

    private static native boolean nativeSetTrack(long j, long j2);

    private static native void nativeSetVideoEncoderObserver(long j, VideoEncoderObserver videoEncoderObserver);

    public void dispose() {
        checkRtpSenderExists();
        DtmfSender dtmfSender2 = this.dtmfSender;
        if (dtmfSender2 != null) {
            dtmfSender2.dispose();
        }
        MediaStreamTrack mediaStreamTrack = this.cachedTrack;
        if (mediaStreamTrack != null && this.ownsTrack) {
            mediaStreamTrack.dispose();
        }
        JniCommon.nativeReleaseRef(this.nativeRtpSender);
        this.nativeRtpSender = 0;
    }

    public DtmfSender dtmf() {
        return this.dtmfSender;
    }

    public long getNativeRtpSender() {
        checkRtpSenderExists();
        return this.nativeRtpSender;
    }

    public RtpParameters getParameters() {
        checkRtpSenderExists();
        return nativeGetParameters(this.nativeRtpSender);
    }

    public List<String> getStreams() {
        checkRtpSenderExists();
        return nativeGetStreams(this.nativeRtpSender);
    }

    public String id() {
        checkRtpSenderExists();
        return nativeGetId(this.nativeRtpSender);
    }

    public void setFrameEncryptor(FrameEncryptor frameEncryptor) {
        checkRtpSenderExists();
        nativeSetFrameEncryptor(this.nativeRtpSender, frameEncryptor.getNativeFrameEncryptor());
    }

    public boolean setParameters(RtpParameters rtpParameters) {
        checkRtpSenderExists();
        return nativeSetParameters(this.nativeRtpSender, rtpParameters);
    }

    public void setStreams(List<String> list) {
        checkRtpSenderExists();
        nativeSetStreams(this.nativeRtpSender, list);
    }

    public boolean setTrack(MediaStreamTrack mediaStreamTrack, boolean z) {
        checkRtpSenderExists();
        if (!nativeSetTrack(this.nativeRtpSender, mediaStreamTrack == null ? 0 : mediaStreamTrack.getNativeMediaStreamTrack())) {
            return false;
        }
        MediaStreamTrack mediaStreamTrack2 = this.cachedTrack;
        if (mediaStreamTrack2 != null && this.ownsTrack) {
            mediaStreamTrack2.dispose();
        }
        this.cachedTrack = mediaStreamTrack;
        this.ownsTrack = z;
        return true;
    }

    public void setVideoEncoderObserver(VideoEncoderObserver videoEncoderObserver) {
        long j = this.nativeRtpSender;
        if (j != 0) {
            nativeSetVideoEncoderObserver(j, videoEncoderObserver);
        }
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
