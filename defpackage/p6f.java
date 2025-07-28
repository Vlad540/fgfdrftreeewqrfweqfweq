package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Size;
import kotlin.coroutines.Continuation;

/* renamed from: p6f  reason: default package */
public final class p6f extends l5e implements i26 {
    public final /* synthetic */ Size X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p6f(Size size, Continuation continuation) {
        super(2, continuation);
        this.X = size;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p6f(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int width = this.X.getWidth();
        Path f = h2g.f("M328 164c0 90.446-73.554 164-164 164S0 254.446 0 164S73.554 0 164 0s164 73.554 164 164Z");
        RectF rectF = new RectF();
        f.computeBounds(rectF, true);
        float f2 = (float) width;
        float max = f2 / Math.max(rectF.width(), rectF.height());
        Matrix matrix = new Matrix();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.postScale(max, max);
        float f3 = (float) 2;
        matrix.postTranslate((f2 - (rectF.width() * max)) / f3, (f2 - (rectF.height() * max)) / f3);
        f.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setFlags(7);
        Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(createBitmap);
        f.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        canvas.drawPath(f, paint);
        return createBitmap;
    }
}
