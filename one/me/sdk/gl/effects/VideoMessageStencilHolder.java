package one.me.sdk.gl.effects;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.annotation.Keep;

@Keep
public class VideoMessageStencilHolder {
    private boolean isRecording;
    private final long nativeInstance;

    static {
        Throwable th = ((gyf) gyf.c.getValue()).b;
    }

    public VideoMessageStencilHolder(int i, int i2) {
        r7e r7e = gyf.c;
        if (((gyf) r7e.getValue()).b == null) {
            long createNativeInstance = createNativeInstance(i, i2);
            this.nativeInstance = createNativeInstance;
            updateTextures(createNativeInstance);
            return;
        }
        throw new RuntimeException("VideoMessageStencilHolder failed to init", ((gyf) r7e.getValue()).b);
    }

    private static native long createNativeInstance(int i, int i2);

    private static native void handleTextureId(long j, int i, int i2, int i3);

    private static native void onStartRecording(long j);

    private static native void onStopRecording(long j);

    private static native void release(long j);

    private static native void render(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    private static native void updateTextures(long j);

    public boolean notifyRecording(boolean z) {
        if (this.isRecording == z) {
            return false;
        }
        this.isRecording = z;
        if (z) {
            onStartRecording(this.nativeInstance);
            return true;
        }
        onStopRecording(this.nativeInstance);
        return true;
    }

    public void release() {
        release(this.nativeInstance);
    }

    public void render(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        render(this.nativeInstance, i, i2, i3, i4, i5, z, z2);
    }

    public void setStencilBitmap(Bitmap bitmap, boolean z) {
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Tried to push recycled bitmap to video messages stencil effect");
        } else if (!bitmap.isRecycled()) {
            int[] iArr = {0};
            GLES20.glGenTextures(1, iArr, 0);
            int i = iArr[0];
            if (i == 0) {
                i = 0;
            } else {
                new BitmapFactory.Options().inScaled = false;
                GLES20.glBindTexture(3553, i);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLUtils.texImage2D(3553, 0, GLUtils.getInternalFormat(bitmap), bitmap, 0);
            }
            handleTextureId(this.nativeInstance, i, bitmap.getWidth(), bitmap.getHeight());
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            ek8.c("glDeleteTextures");
        } else {
            throw new IllegalArgumentException("The specified bitmap is recycled".toString());
        }
    }
}
