package defpackage;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;

/* renamed from: i76  reason: default package */
public final class i76 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ j76 a;

    public i76(j76 j76) {
        this.a = j76;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        j76 j76 = this.a;
        float f = j76.U0;
        float f2 = j76.V0;
        if (scaleFactor != 0.0f) {
            Matrix matrix = j76.y0;
            matrix.postScale(scaleFactor, scaleFactor, f, f2);
            j76.setImageMatrix(matrix);
        }
        j76.W0 = scaleGestureDetector.getFocusX();
        j76.X0 = scaleGestureDetector.getFocusY();
        return true;
    }
}
