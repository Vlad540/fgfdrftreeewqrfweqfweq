package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: sc7  reason: default package */
public final class sc7 implements SensorEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sc7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        int i2 = this.a;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.a) {
            case 0:
                int type = sensorEvent.sensor.getType();
                ud udVar = (ud) this.b;
                boolean z = false;
                if (type != 5) {
                    if (type == 8) {
                        if (sensorEvent.values[0] < sensorEvent.sensor.getMaximumRange()) {
                            z = true;
                        }
                        udVar.b = z;
                        return;
                    }
                    return;
                } else if (!udVar.b) {
                    ((grd) udVar.c).m((Object) null, Float.valueOf(sensorEvent.values[0]));
                    return;
                } else {
                    return;
                }
            default:
                mib mib = (mib) this.b;
                if (mib.f != null) {
                    boolean z2 = false;
                    if (((double) sensorEvent.values[0]) < Math.min((double) sensorEvent.sensor.getMaximumRange(), 3.0d)) {
                        z2 = true;
                    }
                    if (z2 != mib.e) {
                        mib.e = z2;
                        if (z2) {
                            for (lib a2 : mib.h) {
                                a2.a();
                            }
                            return;
                        }
                        for (lib b2 : mib.h) {
                            b2.b();
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
