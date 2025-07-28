package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: s93  reason: default package */
public final class s93 implements vr6 {
    public static final s93 c = new s93(true, 1);
    public final boolean a;
    public final int b;

    public /* synthetic */ s93(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public String a() {
        return "SimpleImageTranscoder";
    }

    public ii5 b(ax4 ax4, kl8 kl8, rfc rfc, hbc hbc, ColorSpace colorSpace) {
        Bitmap bitmap;
        ii5 ii5;
        ax4 ax42 = ax4;
        ColorSpace colorSpace2 = colorSpace;
        Integer num = 85;
        rfc rfc2 = rfc == null ? rfc.b : rfc;
        int i = 1;
        int i2 = !this.a ? 1 : n1g.i(rfc2, hbc, ax42, this.b);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i2;
        if (colorSpace2 != null) {
            options.inPreferredColorSpace = colorSpace2;
        }
        try {
            Matrix matrix = null;
            Bitmap decodeStream = BitmapFactory.decodeStream(ax4.n(), (Rect) null, options);
            if (decodeStream == null) {
                if (m75.a.i(6)) {
                    m75.a.e("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                }
                return new ii5(2, 7);
            }
            zy zyVar = z47.a;
            ax4.n0();
            if (z47.a.contains(Integer.valueOf(ax42.X))) {
                int a2 = z47.a(rfc2, ax42);
                Matrix matrix2 = new Matrix();
                if (a2 == 2) {
                    matrix2.setScale(-1.0f, 1.0f);
                } else if (a2 == 7) {
                    matrix2.setRotate(-90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (a2 == 4) {
                    matrix2.setRotate(180.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (a2 == 5) {
                    matrix2.setRotate(90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                }
                matrix = matrix2;
            } else {
                int b2 = z47.b(rfc2, ax42);
                if (b2 != 0) {
                    matrix = new Matrix();
                    matrix.setRotate((float) b2);
                }
            }
            Matrix matrix3 = matrix;
            if (matrix3 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix3, false);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmap = decodeStream;
                    try {
                        m75.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                        ii5 = new ii5(2, 7);
                        bitmap.recycle();
                        decodeStream.recycle();
                        return ii5;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), kl8);
                if (i2 > 1) {
                    i = 0;
                }
                ii5 = new ii5(i, 7);
            } catch (OutOfMemoryError e2) {
                e = e2;
                m75.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                ii5 = new ii5(2, 7);
                bitmap.recycle();
                decodeStream.recycle();
                return ii5;
            }
            bitmap.recycle();
            decodeStream.recycle();
            return ii5;
        } catch (OutOfMemoryError e3) {
            m75.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new ii5(2, 7);
        }
    }

    public boolean c(lq6 lq6) {
        return lq6 == o84.k || lq6 == o84.a;
    }

    public boolean d(ax4 ax4, rfc rfc, hbc hbc) {
        if (rfc == null) {
            rfc = rfc.b;
        }
        return this.a && n1g.i(rfc, hbc, ax4, this.b) > 1;
    }

    public s93(int i, boolean z) {
        this.b = i;
        this.a = z;
    }
}
