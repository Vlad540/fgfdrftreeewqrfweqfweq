package defpackage;

import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* renamed from: ku1  reason: default package */
public final class ku1 {
    public final ibe a;
    public final ArrayMap b = new ArrayMap(4);

    public ku1(lu1 lu1) {
        this.a = lu1;
    }

    public final et1 a(String str) {
        et1 et1;
        synchronized (this.b) {
            et1 = (et1) this.b.get(str);
            if (et1 == null) {
                try {
                    et1 et12 = new et1(this.a.E(str), str);
                    this.b.put(str, et12);
                    et1 = et12;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e.getMessage(), e);
                }
            }
        }
        return et1;
    }
}
