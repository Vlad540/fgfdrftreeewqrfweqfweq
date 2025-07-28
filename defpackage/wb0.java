package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: wb0  reason: default package */
public final class wb0 extends ii0 {
    public final e13 a(Bitmap bitmap, mxa mxa) {
        e13 c = mxa.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        xm0 xm0 = oad.a;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas((Bitmap) c.e0());
        canvas.drawBitmap(bitmap, oad.b, (Paint) null);
        int min = Math.min(width, height) / 2;
        Path b = oad.b(min, 4.0d);
        Matrix matrix = new Matrix();
        float f = (float) min;
        matrix.postTranslate((((float) width) / 2.0f) - f, (((float) height) / 2.0f) - f);
        b.transform(matrix);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        b.setFillType(Path.FillType.INVERSE_WINDING);
        canvas.drawPath(b, paint);
        return c;
    }

    public final ov0 b() {
        return new ngd("AvatarAsSquirclePostProcessor");
    }
}
