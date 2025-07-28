package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: mn0  reason: default package */
public abstract class mn0 {
    public static final r7e a = new r7e(new m(19));

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, afc] */
    public static final afc a(InputStream inputStream) {
        wia wia = null;
        if (inputStream != null) {
            r7e r7e = a;
            ByteBuffer byteBuffer = (ByteBuffer) ((p0b) r7e.getValue()).h();
            if (byteBuffer == null) {
                rt0 rt0 = d24.a;
                byteBuffer = ByteBuffer.allocate(16384);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                options.inTempStorage = byteBuffer.array();
                BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                ColorSpace colorSpace = options.outColorSpace;
                int i = options.outWidth;
                int i2 = options.outHeight;
                ? obj = new Object();
                obj.a = colorSpace;
                if (i != -1) {
                    if (i2 != -1) {
                        wia = new wia(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                }
                obj.b = wia;
                return obj;
            } finally {
                ((p0b) r7e.getValue()).g(byteBuffer);
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public static final int b(Bitmap.Config config) {
        switch (config == null ? -1 : ln0.$EnumSwitchMapping$0[config.ordinal()]) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int c(int i, int i2, Bitmap.Config config) {
        if (i <= 0) {
            throw new IllegalArgumentException(wn6.h(i, "width must be > 0, width is: ").toString());
        } else if (i2 > 0) {
            int b = b(config);
            int i3 = i * i2 * b;
            if (i3 > 0) {
                return i3;
            }
            StringBuilder i4 = rf0.i("size must be > 0: size: ", i3, ", width: ", i, ", height: ");
            i4.append(i2);
            i4.append(", pixelSize: ");
            i4.append(b);
            throw new IllegalStateException(i4.toString().toString());
        } else {
            throw new IllegalArgumentException(wn6.h(i2, "height must be > 0, height is: ").toString());
        }
    }

    public static final int d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
