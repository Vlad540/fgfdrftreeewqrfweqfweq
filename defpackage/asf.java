package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: asf  reason: default package */
public final class asf {
    public zrf a;

    public asf(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new yrf(hia.k(i, interpolator, j));
        } else {
            this.a = new zrf(i, interpolator, j);
        }
    }
}
