package org.webrtc;

import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;

class NativeCapturerObserver implements CapturerObserver {
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    @CalledByNative
    public NativeCapturerObserver(long j) {
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j);
    }

    public void onCapturerStarted(boolean z) {
        this.nativeAndroidVideoTrackSource.setState(z);
    }

    public void onCapturerStopped() {
        this.nativeAndroidVideoTrackSource.setState(false);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        VideoProcessor.FrameAdaptationParameters adaptFrame = this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
        if (adaptFrame != null) {
            VideoFrame.Buffer cropAndScale = videoFrame.getBuffer().cropAndScale(adaptFrame.cropX, adaptFrame.cropY, adaptFrame.cropWidth, adaptFrame.cropHeight, adaptFrame.scaleWidth, adaptFrame.scaleHeight);
            this.nativeAndroidVideoTrackSource.onFrameCaptured(new VideoFrame(cropAndScale, videoFrame.getRotation(), adaptFrame.timestampNs));
            cropAndScale.release();
        }
    }
}
