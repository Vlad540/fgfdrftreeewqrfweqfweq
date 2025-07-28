package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Map;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: tz6  reason: default package */
public abstract class tz6 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Object b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    public static int a(Map map, int i, int i2, int i3) {
        int m = o13.m(i);
        int i4 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int d = o13.d(2, i3, value) + o13.d(1, i2, key);
            i4 += o13.j(d) + m + d;
        }
        return i4;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map b(defpackage.n13 r2, java.util.Map r3, defpackage.mt7 r4, int r5, int r6, defpackage.gr8 r7, int r8, int r9) {
        /*
            java.util.Map r3 = r4.m(r3)
            int r4 = r2.p()
            int r4 = r2.e(r4)
            r0 = 0
        L_0x000d:
            int r1 = r2.s()
            if (r1 != 0) goto L_0x0014
            goto L_0x0033
        L_0x0014:
            if (r1 != r8) goto L_0x001b
            java.io.Serializable r0 = r2.k(r5)
            goto L_0x000d
        L_0x001b:
            if (r1 != r9) goto L_0x002d
            r1 = 11
            if (r6 != r1) goto L_0x0028
            r1 = r7
            gr8 r1 = (defpackage.gr8) r1
            r2.j(r1)
            goto L_0x000d
        L_0x0028:
            java.io.Serializable r7 = r2.k(r6)
            goto L_0x000d
        L_0x002d:
            boolean r1 = r2.u(r1)
            if (r1 != 0) goto L_0x000d
        L_0x0033:
            r8 = 0
            r2.a(r8)
            r2.d(r4)
            if (r0 != 0) goto L_0x0040
            java.io.Serializable r0 = c(r5)
        L_0x0040:
            if (r7 != 0) goto L_0x0046
            java.io.Serializable r7 = c(r6)
        L_0x0046:
            r3.put(r0, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz6.b(n13, java.util.Map, mt7, int, int, gr8, int, int):java.util.Map");
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [byte[], java.io.Serializable] */
    public static Serializable c(int i) {
        switch (i) {
            case 1:
                return Double.valueOf(0.0d);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 17:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return BuildConfig.FLAVOR;
            case 12:
                return iu7.o;
            default:
                throw new IllegalArgumentException(rf0.f(i, "Type: ", " is not a primitive type."));
        }
    }

    public static void d(o13 o13, Map map, int i, int i2, int i3) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int d = o13.d(1, i2, key);
            o13.F(i, 2);
            o13.C(o13.d(2, i3, value) + d);
            o13.u(1, i2, key);
            o13.u(2, i3, value);
        }
    }
}
