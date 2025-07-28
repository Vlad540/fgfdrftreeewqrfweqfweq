package defpackage;

import java.util.ArrayList;

/* renamed from: b0f  reason: default package */
public final class b0f {
    public final qhe a;
    public final t97 b = ez3.O(3, new opd(23));
    public final ArrayList c;

    public b0f(qhe qhe) {
        this.a = qhe;
        ez3.O(3, new opd(24));
        this.c = new ArrayList();
    }

    public static final void a(int i, int i2, float f, float[] fArr) {
        float f2 = ((float) i) / 2.0f;
        float f3 = ((float) i2) / 2.0f;
        double d = (double) f;
        float cos = (float) Math.cos(Math.toRadians(d));
        float sin = (float) Math.sin(Math.toRadians(d));
        float abs = Math.abs(f2 / cos);
        float abs2 = Math.abs(f3 / sin);
        wia wia = abs >= abs2 ? new wia(Float.valueOf(Math.abs(abs2 * cos)), Float.valueOf(f3)) : new wia(Float.valueOf(f2), Float.valueOf(Math.abs(abs * sin)));
        float floatValue = ((Number) wia.a).floatValue();
        float floatValue2 = ((Number) wia.b).floatValue();
        int i3 = (cos > 0.0f ? 1 : (cos == 0.0f ? 0 : -1));
        if (i3 < 0 || sin < 0.0f) {
            int i4 = (cos > 0.0f ? 1 : (cos == 0.0f ? 0 : -1));
            if (i4 < 0 && sin >= 0.0f) {
                fArr[0] = f2 - floatValue;
                fArr[1] = f3 - floatValue2;
            } else if (i4 < 0 && sin < 0.0f) {
                fArr[0] = f2 - floatValue;
                fArr[1] = f3 + floatValue2;
            } else if (i3 >= 0 && sin < 0.0f) {
                fArr[0] = f2 + floatValue;
                fArr[1] = f3 + floatValue2;
            }
        } else {
            fArr[0] = f2 + floatValue;
            fArr[1] = f3 - floatValue2;
        }
    }
}
