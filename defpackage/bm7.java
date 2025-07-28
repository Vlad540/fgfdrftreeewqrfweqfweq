package defpackage;

import java.util.HashMap;
import java.util.List;

/* renamed from: bm7  reason: default package */
public final class bm7 extends fy {
    public final long X;
    public final long Y;
    public final long Z;
    public final dm7 o;
    public final List w0;
    public final String x0;
    public final float y0;
    public final boolean z0;

    public bm7(dm7 dm7, long j, long j2, long j3, List list, String str, float f, boolean z, boolean z2, boolean z3) {
        super(e00.LOCATION, z2, z3);
        this.o = dm7;
        this.X = j;
        this.Y = j2;
        this.Z = j3;
        this.w0 = list;
        this.x0 = str;
        this.z0 = z;
        this.y0 = f;
    }

    public final HashMap a() {
        HashMap a = super.a();
        dm7 dm7 = this.o;
        a.put("latitude", Double.valueOf(dm7.a));
        a.put("longitude", Double.valueOf(dm7.b));
        long j = this.X;
        if (j > 0) {
            a.put("livePeriod", Long.valueOf(j));
        }
        float f = this.y0;
        if (f > 0.0f) {
            a.put("zoom", Float.valueOf(f));
        }
        double d = dm7.c;
        if (d != 0.0d) {
            a.put("alt", Double.valueOf(d));
        }
        float f2 = dm7.o;
        if (f2 != 0.0f) {
            a.put("epu", Float.valueOf(f2));
        }
        float f3 = dm7.X;
        if (f3 != 0.0f) {
            a.put("hdn", Float.valueOf(f3));
        }
        float f4 = dm7.Y;
        if (f4 != 0.0f) {
            a.put("spd", Float.valueOf(f4));
        }
        return a;
    }
}
