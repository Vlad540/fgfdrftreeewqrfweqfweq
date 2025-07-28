package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: iad  reason: default package */
public final class iad extends mad {
    public final kad c;
    public final float d;
    public final float e;

    public iad(kad kad, float f, float f2) {
        this.c = kad;
        this.d = f;
        this.e = f2;
    }

    public final void a(Matrix matrix, cad cad, int i, Canvas canvas) {
        cad cad2 = cad;
        int i2 = i;
        Canvas canvas2 = canvas;
        kad kad = this.c;
        float f = kad.c;
        float f2 = this.e;
        float f3 = kad.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f - f2), (double) (f3 - f4)), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        cad.getClass();
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        int[] iArr = cad.i;
        iArr[0] = cad2.f;
        iArr[1] = cad2.e;
        iArr[2] = cad2.d;
        Paint paint = cad2.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, cad.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas2.concat(matrix2);
        canvas2.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        kad kad = this.c;
        return (float) Math.toDegrees(Math.atan((double) ((kad.c - this.e) / (kad.b - this.d))));
    }
}
