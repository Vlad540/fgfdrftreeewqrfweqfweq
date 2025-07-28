package defpackage;

import android.app.Notification;
import android.opengl.GLES20;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.nio.IntBuffer;
import jp.co.cyberagent.android.gpuimage.GPUImageNativeLibrary;

/* renamed from: a46  reason: default package */
public final class a46 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public a46(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.X = systemForegroundService;
        this.b = i;
        this.o = notification;
        this.c = i2;
    }

    public final void run() {
        char c2;
        switch (this.a) {
            case 0:
                b46 b46 = (b46) this.X;
                int[] array = b46.Y.array();
                int i = this.b;
                int i2 = this.c;
                GPUImageNativeLibrary.YUVtoRBGA((byte[]) this.o, i, i2, array);
                IntBuffer intBuffer = b46.Y;
                int i3 = b46.c;
                int[] iArr = new int[1];
                int i4 = this.b;
                int i5 = this.c;
                if (i3 == -1) {
                    GLES20.glGenTextures(1, iArr, 0);
                    GLES20.glBindTexture(3553, iArr[0]);
                    GLES20.glTexParameterf(3553, 10240, 9729.0f);
                    GLES20.glTexParameterf(3553, 10241, 9729.0f);
                    GLES20.glTexParameterf(3553, 10242, 33071.0f);
                    GLES20.glTexParameterf(3553, 10243, 33071.0f);
                    c2 = 0;
                    GLES20.glTexImage2D(3553, 0, 6408, i4, i5, 0, 6408, 5121, intBuffer);
                } else {
                    c2 = 0;
                    GLES20.glBindTexture(3553, i3);
                    GLES20.glTexSubImage2D(3553, 0, 0, 0, i4, i5, 6408, 5121, intBuffer);
                    iArr[0] = i3;
                }
                b46.c = iArr[c2];
                if (b46.x0 != i) {
                    b46.x0 = i;
                    b46.y0 = i2;
                    b46.b();
                    return;
                }
                return;
            default:
                int i6 = Build.VERSION.SDK_INT;
                int i7 = this.c;
                Notification notification = (Notification) this.o;
                int i8 = this.b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.X;
                if (i6 >= 31) {
                    d8e.a(systemForegroundService, i8, notification, i7);
                    return;
                } else {
                    c8e.a(systemForegroundService, i8, notification, i7);
                    return;
                }
        }
    }

    public a46(b46 b46, byte[] bArr, int i, int i2) {
        this.X = b46;
        this.o = bArr;
        this.b = i;
        this.c = i2;
    }
}
