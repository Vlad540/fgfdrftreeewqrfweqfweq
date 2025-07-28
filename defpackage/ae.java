package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;

/* renamed from: ae  reason: default package */
public final class ae implements uvf {
    public float X = 1.0f;
    public final boolean Y;
    public final et1 a;
    public final Range b;
    public float c = 1.0f;
    public sn1 o;

    public ae(et1 et1) {
        boolean z = false;
        this.Y = false;
        this.a = et1;
        this.b = (Range) et1.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) et1.b.a).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (iArr[i] == 1) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.Y = z;
    }

    public final void a(TotalCaptureResult totalCaptureResult) {
        if (this.o != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f != null) {
                if (this.X == f.floatValue()) {
                    this.o.b((Object) null);
                    this.o = null;
                }
            }
        }
    }

    public final float b() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    public final float c() {
        return ((Float) this.b.getLower()).floatValue();
    }

    public final void e(mv4 mv4) {
        mv4.P(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.c));
        if (this.Y && Build.VERSION.SDK_INT >= 34) {
            mv4.P(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
        }
    }

    public final Rect f() {
        Rect rect = (Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    public final void h(float f, sn1 sn1) {
        this.c = f;
        sn1 sn12 = this.o;
        if (sn12 != null) {
            sn12.d(new Exception("There is a new zoomRatio being set"));
        }
        this.X = this.c;
        this.o = sn1;
    }

    public final void l() {
        this.c = 1.0f;
        sn1 sn1 = this.o;
        if (sn1 != null) {
            sn1.d(new Exception("Camera is not active."));
            this.o = null;
        }
    }
}
