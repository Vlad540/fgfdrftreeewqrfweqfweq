package defpackage;

import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: j76  reason: default package */
public final class j76 extends oz6 {
    public ScaleGestureDetector R0;
    public qfc S0;
    public GestureDetector T0;
    public float U0;
    public float V0;
    public float W0;
    public float X0;
    public boolean Y0;
    public boolean Z0;
    public int a1;

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getDrawable() == null) {
            return true;
        }
        if ((motionEvent.getAction() & 255) == 0) {
            removeCallbacks(this.N0);
            removeCallbacks(this.O0);
        }
        if (motionEvent.getPointerCount() > 1) {
            this.U0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.V0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        this.T0.onTouchEvent(motionEvent);
        if (this.Z0) {
            this.R0.onTouchEvent(motionEvent);
        }
        if (this.Y0) {
            qfc qfc = this.S0;
            qfc.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                qfc.c = motionEvent.getX();
                qfc.d = motionEvent.getY();
                qfc.e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                qfc.g = 0.0f;
                qfc.h = true;
            } else if (actionMasked == 1) {
                qfc.e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    qfc.a = motionEvent.getX();
                    qfc.b = motionEvent.getY();
                    qfc.f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    qfc.g = 0.0f;
                    qfc.h = true;
                } else if (actionMasked == 6) {
                    qfc.f = -1;
                }
            } else if (!(qfc.e == -1 || qfc.f == -1 || motionEvent.getPointerCount() <= qfc.f)) {
                float x = motionEvent.getX(qfc.e);
                float y = motionEvent.getY(qfc.e);
                float x2 = motionEvent.getX(qfc.f);
                float y2 = motionEvent.getY(qfc.f);
                if (qfc.h) {
                    qfc.g = 0.0f;
                    qfc.h = false;
                } else {
                    float f = qfc.a;
                    float degrees = (((float) Math.toDegrees((double) ((float) Math.atan2((double) (y2 - y), (double) (x2 - x))))) % 360.0f) - (((float) Math.toDegrees((double) ((float) Math.atan2((double) (qfc.b - qfc.d), (double) (f - qfc.c))))) % 360.0f);
                    qfc.g = degrees;
                    if (degrees < -180.0f) {
                        qfc.g = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        qfc.g = degrees - 360.0f;
                    }
                }
                wwc wwc = qfc.i;
                if (wwc != null) {
                    float f2 = qfc.g;
                    j76 j76 = (j76) wwc.b;
                    float f3 = j76.U0;
                    float f4 = j76.V0;
                    if (f2 != 0.0f) {
                        Matrix matrix = j76.y0;
                        matrix.postRotate(f2, f3, f4);
                        j76.setImageMatrix(matrix);
                    }
                }
                qfc.a = x2;
                qfc.b = y2;
                qfc.c = x;
                qfc.d = y;
            }
        }
        if ((motionEvent.getAction() & 255) == 1) {
            setImageToWrapCropBounds(true);
        }
        return true;
    }
}
