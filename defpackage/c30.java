package defpackage;

import android.os.PowerManager;

/* renamed from: c30  reason: default package */
public final /* synthetic */ class c30 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h30 b;

    public /* synthetic */ c30(h30 h30, int i) {
        this.a = i;
        this.b = h30;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(32, "ru.ok.tamtam:tam-tam-prox");
            default:
                return ((PowerManager) this.b.a.getSystemService("power")).newWakeLock(536870918, "ru.ok.tamtam:tam-tam-screen-dim");
        }
    }
}
