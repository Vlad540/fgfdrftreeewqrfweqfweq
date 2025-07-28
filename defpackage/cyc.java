package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: cyc  reason: default package */
public final class cyc implements SensorEventListener {
    public static final /* synthetic */ int d = 0;
    public final SensorManager a;
    public final Sensor b;
    public final Set c = Collections.synchronizedSet(new LinkedHashSet());

    public cyc(Context context) {
        Collections.synchronizedSet(new LinkedHashSet());
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        this.b = sensorManager.getDefaultSensor(8);
        sensorManager.getDefaultSensor(5);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this.c) {
            try {
                if (sensorEvent.sensor.getType() == 8) {
                    boolean z = false;
                    if (sensorEvent.values[0] < sensorEvent.sensor.getMaximumRange()) {
                        z = true;
                    }
                    for (h30 h30 : this.c) {
                        if (z) {
                            h30.getClass();
                            udd.q("h30", "onDeviceNextToEar");
                            nb9 nb9 = h30.c;
                            if (nb9.x) {
                                if (!h30.k()) {
                                    ((PowerManager.WakeLock) h30.x0.getValue()).acquire();
                                }
                                if (nb9.x) {
                                    nb9.m();
                                    ns7 ns7 = m68.a;
                                }
                            }
                        } else {
                            h30.m();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
