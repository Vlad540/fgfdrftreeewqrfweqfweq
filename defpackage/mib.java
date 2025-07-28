package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.util.LinkedHashSet;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: mib  reason: default package */
public final class mib {
    public final r7e a;
    public final r7e b = new r7e(new kib(this, 0));
    public final r7e c;
    public final r7e d;
    public boolean e;
    public PowerManager.WakeLock f;
    public c9 g;
    public final LinkedHashSet h;

    public mib(t97 t97) {
        this.a = new r7e(new xq(24, t97));
        this.c = new r7e(new xq(25, t97));
        this.d = new r7e(new kib(this, 1));
        this.h = new LinkedHashSet();
    }

    public final void a() {
        Sensor sensor = (Sensor) this.b.getValue();
        if (sensor != null) {
            try {
                this.f = ((PowerManager) this.c.getValue()).newWakeLock(32, "max:proximity_helper");
                ((SensorManager) this.a.getValue()).registerListener((SensorEventListener) this.d.getValue(), sensor, 3);
            } catch (Exception e2) {
                udd.u("ProximityHelperTag", e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    public final void b() {
        if (((Sensor) this.b.getValue()) != null) {
            PowerManager.WakeLock wakeLock = this.f;
            try {
                ((SensorManager) this.a.getValue()).unregisterListener((SensorEventListener) this.d.getValue());
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release(1);
                }
            } catch (Exception e2) {
                udd.u("ProximityHelperTag", e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    public final void c() {
        Object value;
        PowerManager.WakeLock wakeLock = this.f;
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    wakeLock.release(1);
                    c9 c9Var = this.g;
                    if (c9Var != null) {
                        po1 po1 = (po1) c9Var.b;
                        mc9 mc9 = (mc9) po1.p.getValue();
                        do {
                            value = mc9.getValue();
                            CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) value;
                        } while (!mc9.b(value, po1.b.b()));
                    }
                }
            } catch (Exception e2) {
                udd.u("ProximityHelperTag", e2, e2.getMessage(), new Object[0]);
            }
        }
    }
}
