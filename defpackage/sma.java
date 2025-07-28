package defpackage;

import android.content.Context;

/* renamed from: sma  reason: default package */
public final class sma {
    public final vf4 a;
    public final boolean b;

    public sma(Context context) {
        vf4 D = swb.D(context);
        this.a = D;
        this.b = D.compareTo(vf4.o) >= 0;
    }

    public final String toString() {
        return i0e.D("\n        PerformanceConfig(\n            perfClass=" + this.a + ",\n        )\n    ");
    }
}
