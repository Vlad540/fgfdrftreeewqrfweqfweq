package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: z47  reason: default package */
public abstract class z47 {
    public static final zy a;

    static {
        ArrayList arrayList = new ArrayList(4);
        Collections.addAll(arrayList, new Integer[]{2, 7, 4, 5});
        a = arrayList;
    }

    public static final int a(rfc rfc, ax4 ax4) {
        ax4.n0();
        Integer valueOf = Integer.valueOf(ax4.X);
        zy zyVar = a;
        int indexOf = zyVar.indexOf(valueOf);
        if (indexOf >= 0) {
            return ((Number) zyVar.get(indexOf % zyVar.size())).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations".toString());
    }

    public static final int b(rfc rfc, ax4 ax4) {
        rfc.getClass();
        ax4.n0();
        int i = ax4.o;
        if (i != 90 && i != 180 && i != 270) {
            return 0;
        }
        ax4.n0();
        return ax4.o;
    }

    public static final int c(rfc rfc, hbc hbc, ax4 ax4, boolean z) {
        int i;
        int i2;
        if (!z || hbc == null) {
            return 8;
        }
        int b = b(rfc, ax4);
        ax4.n0();
        boolean z2 = false;
        int a2 = a.contains(Integer.valueOf(ax4.X)) ? a(rfc, ax4) : 0;
        if (b == 90 || b == 270 || a2 == 5 || a2 == 7) {
            z2 = true;
        }
        if (z2) {
            ax4.n0();
            i = ax4.Z;
        } else {
            ax4.n0();
            i = ax4.Y;
        }
        if (z2) {
            ax4.n0();
            i2 = ax4.Y;
        } else {
            ax4.n0();
            i2 = ax4.Z;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(((float) hbc.a) / f, ((float) hbc.b) / f2);
        float f3 = hbc.c;
        if (f * max > f3) {
            max = f3 / f;
        }
        if (f2 * max > f3) {
            max = f3 / f2;
        }
        int i3 = (int) ((max * ((float) 8)) + hbc.d);
        if (i3 > 8) {
            return 8;
        }
        if (i3 < 1) {
            return 1;
        }
        return i3;
    }
}
