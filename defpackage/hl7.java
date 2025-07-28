package defpackage;

import android.graphics.Point;

/* renamed from: hl7  reason: default package */
public final /* synthetic */ class hl7 implements ml7 {
    public final /* synthetic */ jl7 a;

    public /* synthetic */ hl7(jl7 jl7) {
        this.a = jl7;
    }

    public void a(int i, int i2) {
        pnc pnc = this.a.t;
        if (pnc != null) {
            Point a2 = d59.a(i, i2);
            pnc.a(a2.x, a2.y);
        }
    }
}
