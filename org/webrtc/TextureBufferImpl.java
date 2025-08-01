package org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;
import org.webrtc.VideoFrame;

public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;
    private final int id;
    private final RefCountDelegate refCountDelegate;
    /* access modifiers changed from: private */
    public final RefCountMonitor refCountMonitor;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    public interface RefCountMonitor {
        void onDestroy(TextureBufferImpl textureBufferImpl);

        void onRelease(TextureBufferImpl textureBufferImpl);

        void onRetain(TextureBufferImpl textureBufferImpl);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextureBufferImpl(int r12, int r13, org.webrtc.VideoFrame.TextureBuffer.Type r14, int r15, android.graphics.Matrix r16, android.os.Handler r17, org.webrtc.YuvConverter r18, java.lang.Runnable r19) {
        /*
            r11 = this;
            org.webrtc.TextureBufferImpl$1 r10 = new org.webrtc.TextureBufferImpl$1
            r0 = r19
            r10.<init>(r0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.TextureBufferImpl.<init>(int, int, org.webrtc.VideoFrame$TextureBuffer$Type, int, android.graphics.Matrix, android.os.Handler, org.webrtc.YuvConverter, java.lang.Runnable):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(RefCountMonitor refCountMonitor2) {
        refCountMonitor2.onDestroy(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$1() throws Exception {
        return this.yuvConverter.convert(this);
    }

    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix();
        int i7 = this.height;
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) (i7 - (i2 + i4))) / ((float) i7));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        return applyTransformMatrix(matrix, Math.round(((float) (this.unscaledWidth * i3)) / ((float) this.width)), Math.round(((float) (this.unscaledHeight * i4)) / ((float) this.height)), i5, i6);
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.id;
    }

    public Handler getToI420Handler() {
        return this.toI420Handler;
    }

    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    public int getWidth() {
        return this.width;
    }

    public YuvConverter getYuvConverter() {
        return this.yuvConverter;
    }

    public void release() {
        this.refCountMonitor.onRelease(this);
        this.refCountDelegate.release();
    }

    public void retain() {
        this.refCountMonitor.onRetain(this);
        this.refCountDelegate.retain();
    }

    public VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new m5(16, this));
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type2, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter2, RefCountMonitor refCountMonitor2) {
        this(i, i2, i, i2, type2, i3, matrix, handler, yuvConverter2, refCountMonitor2);
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2) {
        return applyTransformMatrix(matrix, i, i2, i, i2);
    }

    public TextureBufferImpl(int i, int i2, int i3, int i4, VideoFrame.TextureBuffer.Type type2, int i5, Matrix matrix, Handler handler, YuvConverter yuvConverter2, RefCountMonitor refCountMonitor2) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i3;
        this.height = i4;
        this.type = type2;
        this.id = i5;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter2;
        this.refCountDelegate = new RefCountDelegate(new b(this, 2, refCountMonitor2));
        this.refCountMonitor = refCountMonitor2;
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2, int i3, int i4) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        Matrix matrix3 = matrix;
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i, i2, i3, i4, this.type, this.id, matrix2, this.toI420Handler, this.yuvConverter, new RefCountMonitor() {
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.release();
            }

            public void onRelease(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.refCountMonitor.onRelease(TextureBufferImpl.this);
            }

            public void onRetain(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.refCountMonitor.onRetain(TextureBufferImpl.this);
            }
        });
    }
}
