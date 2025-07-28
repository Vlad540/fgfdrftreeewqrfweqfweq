package androidx.camera.core;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;

public abstract class ImageProcessingUtil {
    public static int a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static lr6 a(yic yic, byte[] bArr) {
        e07.k(yic.f() == 256);
        bArr.getClass();
        Surface surface = yic.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            return null;
        }
        return yic.c();
    }

    public static Bitmap b(lr6 lr6) {
        if (lr6.k0() == 35) {
            int width = lr6.getWidth();
            int height = lr6.getHeight();
            int H = lr6.v()[0].H();
            int H2 = lr6.v()[1].H();
            int H3 = lr6.v()[2].H();
            int F = lr6.v()[0].F();
            int F2 = lr6.v()[1].F();
            Bitmap createBitmap = Bitmap.createBitmap(lr6.getWidth(), lr6.getHeight(), Bitmap.Config.ARGB_8888);
            int rowBytes = createBitmap.getRowBytes();
            if (nativeConvertAndroid420ToBitmap(lr6.v()[0].E(), H, lr6.v()[1].E(), H2, lr6.v()[2].E(), H3, F, F2, createBitmap, rowBytes, width, height) == 0) {
                return createBitmap;
            }
            throw new UnsupportedOperationException("YUV to RGB conversion failed");
        }
        throw new IllegalArgumentException("Input image format must be YUV_420_888");
    }

    public static pp6 c(lr6 lr6, nr6 nr6, ByteBuffer byteBuffer, int i, boolean z) {
        int i2 = i;
        if (!(lr6.k0() == 35 && lr6.v().length == 3)) {
            return null;
        }
        System.currentTimeMillis();
        if (i2 != 0 && i2 != 90 && i2 != 180 && i2 != 270) {
            return null;
        }
        Surface surface = nr6.getSurface();
        int width = lr6.getWidth();
        int height = lr6.getHeight();
        int H = lr6.v()[0].H();
        int H2 = lr6.v()[1].H();
        int H3 = lr6.v()[2].H();
        int F = lr6.v()[0].F();
        int F2 = lr6.v()[1].F();
        if (nativeConvertAndroid420ToABGR(lr6.v()[0].E(), H, lr6.v()[1].E(), H2, lr6.v()[2].E(), H3, F, F2, surface, byteBuffer, width, height, z ? F : 0, z ? F2 : 0, z ? F2 : 0, i) != 0) {
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            a++;
        }
        lr6 c = nr6.c();
        if (c == null) {
            return null;
        }
        pp6 pp6 = new pp6(c);
        pp6.a(new kr6(c, lr6));
        return pp6;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void f(byte[] bArr, Surface surface) {
        surface.getClass();
        nativeWriteJpegToSurface(bArr, surface);
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
