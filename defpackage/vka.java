package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import java.lang.reflect.Field;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSink;
import org.webrtc.YuvConverter;

/* renamed from: vka  reason: default package */
public final class vka implements CameraVideoCapturer {
    public SurfaceTextureHelper X;
    public volatile VideoSink Y;
    public final CameraVideoCapturer a;
    public final xu1 b;
    public final xwb c;
    public YuvConverter o;

    public vka(CameraVideoCapturer cameraVideoCapturer, xu1 xu1, xwb xwb) {
        this.a = cameraVideoCapturer;
        this.b = xu1;
        this.c = xwb;
    }

    public final void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        this.c.log("PatchedVideoCapturer", "addMediaRecorderToCamera");
    }

    public final void changeCaptureFormat(int i, int i2, int i3) {
        this.a.changeCaptureFormat(i, i2, i3);
    }

    public final void dispose() {
        this.a.dispose();
    }

    public final void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        xwb xwb = this.c;
        xwb.log("PatchedVideoCapturer", "initialize");
        if (this.X == null) {
            this.X = surfaceTextureHelper;
            try {
                Field declaredField = SurfaceTextureHelper.class.getDeclaredField("yuvConverter");
                declaredField.setAccessible(true);
                this.o = (YuvConverter) declaredField.get(surfaceTextureHelper);
            } catch (NoSuchFieldException e) {
                xwb.logException("PatchedVideoCapturer", "Cant get yuv converter", e);
            } catch (IllegalAccessException e2) {
                xwb.logException("PatchedVideoCapturer", "Cant get yuv converter", e2);
            }
            this.a.initialize(surfaceTextureHelper, context, new b2b(this, 28, capturerObserver));
            return;
        }
        throw new IllegalStateException("Repeated initialization".toString());
    }

    public final boolean isScreencast() {
        this.c.log("PatchedVideoCapturer", "isScreencast");
        return this.a.isScreencast();
    }

    public final void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        this.c.log("PatchedVideoCapturer", "removeMediaRecorderFromCamera");
    }

    public final void startCapture(int i, int i2, int i3) {
        this.c.log("PatchedVideoCapturer", "startCapture");
        this.a.startCapture(i, i2, i3);
    }

    public final void stopCapture() {
        this.c.log("PatchedVideoCapturer", "stopCapture");
        this.a.stopCapture();
    }

    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        this.c.log("PatchedVideoCapturer", "switchCamera");
        this.a.switchCamera(cameraSwitchHandler);
    }

    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        this.c.log("PatchedVideoCapturer", "switchCamera");
        this.a.switchCamera(cameraSwitchHandler, str);
    }
}
