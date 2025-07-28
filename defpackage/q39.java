package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Rational;

/* renamed from: q39  reason: default package */
public abstract class q39 {
    public Rational a;

    /* JADX WARNING: type inference failed for: r6v1, types: [p39, java.lang.Object] */
    public final p39 a(float f, float f2, float f3) {
        PointF pointF;
        l3b l3b = (l3b) this;
        float[] fArr = {f, f2};
        synchronized (l3b) {
            try {
                Matrix matrix = l3b.d;
                if (matrix == null) {
                    pointF = l3b.e;
                } else {
                    matrix.mapPoints(fArr);
                    pointF = new PointF(fArr[0], fArr[1]);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        Rational rational = this.a;
        ? obj = new Object();
        obj.a = f4;
        obj.b = f5;
        obj.c = f3;
        obj.d = rational;
        return obj;
    }
}
