package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;

/* renamed from: oad  reason: default package */
public abstract class oad {
    public static final xm0 a = new xm0(10, 3);
    public static final Matrix b = new Matrix();

    public static final void a(Path path, Rect rect) {
        if (rect == null || rect.isEmpty()) {
            path.reset();
            return;
        }
        Matrix matrix = new Matrix();
        int min = Math.min(rect.width(), rect.height()) / 2;
        Path path2 = (Path) a.c(new lnd(min));
        if (path2 == null) {
            path2 = b(min, 4.0d);
        }
        path.set(path2);
        float f = (float) min;
        matrix.setTranslate(((float) rect.left) + ((((float) rect.width()) / 2.0f) - f), ((float) rect.top) + ((((float) rect.height()) / 2.0f) - f));
        path.transform(matrix);
    }

    public static final Path b(int i, double d) {
        double d2;
        double d3;
        int i2 = i;
        double d4 = d;
        Path path = new Path();
        if (i2 <= 0) {
            return path;
        }
        double d5 = (double) i2;
        double pow = Math.pow(d5, d4);
        float f = (float) i2;
        path.moveTo(-f, 0.0f);
        double d6 = -d5;
        double d7 = d6;
        boolean z = false;
        while (true) {
            double pow2 = pow - Math.pow(Math.abs(d6), d4);
            double d8 = 1.0d;
            d2 = 1.0d / d4;
            d3 = d5;
            double d9 = d6;
            path.lineTo((float) d9, (float) (Math.pow(Math.abs(pow2), d2) * Math.signum(pow2)));
            if (z) {
                break;
            }
            double d10 = d3 / ((double) 80);
            if (d10 < 0.2d) {
                d8 = 0.2d;
            } else if (d10 <= 1.0d) {
                d8 = d10;
            }
            d6 = d8 + d9;
            if (d6 >= d3) {
                d5 = d3;
                d6 = d5;
                z = true;
            } else {
                d5 = d3;
            }
        }
        double d11 = d3;
        boolean z2 = false;
        while (true) {
            double pow3 = pow - Math.pow(Math.abs(d11), d4);
            path.lineTo((float) d11, (float) (Math.pow(Math.abs(pow3), d2) * (-Math.signum(pow3))));
            if (z2) {
                path.close();
                path.offset(f, f);
                return path;
            }
            double d12 = d3 / ((double) 80);
            if (d12 < 0.2d) {
                d12 = 0.2d;
            } else if (d12 > 1.0d) {
                d12 = 1.0d;
            }
            d11 -= d12;
            if (d11 <= ((double) (-i2))) {
                d11 = d7;
                z2 = true;
            }
        }
    }
}
