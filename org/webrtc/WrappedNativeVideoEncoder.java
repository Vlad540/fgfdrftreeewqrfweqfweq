package org.webrtc;

import org.webrtc.VideoEncoder;

public abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    public abstract long createNative(long j);

    public final VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final VideoEncoder.ScalingSettings getScalingSettings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public abstract boolean isHardwareEncoder();

    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public final VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
