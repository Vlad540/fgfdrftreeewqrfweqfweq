package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: had  reason: default package */
public final class had extends mad {
    public final jad c;

    public had(jad jad) {
        this.c = jad;
    }

    public final void a(Matrix matrix, cad cad, int i, Canvas canvas) {
        cad cad2 = cad;
        int i2 = i;
        Canvas canvas2 = canvas;
        jad jad = this.c;
        float f = jad.f;
        float f2 = jad.g;
        RectF rectF = new RectF(jad.b, jad.c, jad.d, jad.e);
        cad.getClass();
        boolean z = f2 < 0.0f;
        Path path = cad2.g;
        int[] iArr = cad.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = cad2.f;
            iArr[2] = cad2.e;
            iArr[3] = cad2.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i2);
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = cad2.d;
            iArr[2] = cad2.e;
            iArr[3] = cad2.f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (((float) i2) / width);
            float[] fArr = cad.l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = cad2.b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas2.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, cad2.h);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }
}
