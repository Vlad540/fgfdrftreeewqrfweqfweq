package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: mpa  reason: default package */
public final class mpa extends ii0 {
    public final /* synthetic */ int c;
    public final int d;

    public /* synthetic */ mpa(int i, int i2) {
        this.c = i2;
        this.d = i;
    }

    public final e13 a(Bitmap bitmap, mxa mxa) {
        switch (this.c) {
            case 0:
                Matrix matrix = new Matrix();
                int i = this.d;
                if (i > 0) {
                    matrix.postRotate((float) i, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
                }
                return e13.p0(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true), new dd9(29), e13.Y);
            default:
                Matrix matrix2 = new Matrix();
                int i2 = this.d;
                if (i2 > 0) {
                    matrix2.postRotate((float) i2, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
                }
                return e13.p0(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true), new lpa(0), e13.Y);
        }
    }

    public final ov0 b() {
        switch (this.c) {
            case 0:
                return new ngd(String.valueOf(this.d));
            default:
                return new ngd(String.valueOf(this.d));
        }
    }
}
