package defpackage;

import android.hardware.SensorManager;

/* renamed from: kib  reason: default package */
public final /* synthetic */ class kib implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mib b;

    public /* synthetic */ kib(mib mib, int i) {
        this.a = i;
        this.b = mib;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((SensorManager) this.b.a.getValue()).getDefaultSensor(8);
            default:
                return new sc7(1, this.b);
        }
    }
}
