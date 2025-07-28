package defpackage;

import java.util.Comparator;
import java.util.List;

/* renamed from: d15  reason: default package */
public final class d15 implements Comparator {
    public static final t13 c = new t13(16);
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d15(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        r4 = r3.b(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L_0x00c6;
                case 1: goto L_0x00ad;
                case 2: goto L_0x0079;
                case 3: goto L_0x0032;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.util.Rational r4 = (android.util.Rational) r4
            android.util.Rational r5 = (android.util.Rational) r5
            float r4 = r4.floatValue()
            java.lang.Object r3 = r3.b
            android.util.Rational r3 = (android.util.Rational) r3
            float r0 = r3.floatValue()
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x001b
            float r0 = r0 / r4
            goto L_0x001d
        L_0x001b:
            float r0 = r4 / r0
        L_0x001d:
            float r4 = r5.floatValue()
            float r3 = r3.floatValue()
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x002b
            float r3 = r3 / r4
            goto L_0x002d
        L_0x002b:
            float r3 = r4 / r3
        L_0x002d:
            int r3 = java.lang.Float.compare(r3, r0)
            return r3
        L_0x0032:
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            boolean r0 = r4.G0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.G0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L_0x0049
            goto L_0x0078
        L_0x0049:
            boolean r0 = r4.isPressed()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.isPressed()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L_0x0060
            goto L_0x0078
        L_0x0060:
            java.lang.Object r3 = r3.b
            com.google.android.material.button.MaterialButtonToggleGroup r3 = (com.google.android.material.button.MaterialButtonToggleGroup) r3
            int r4 = r3.indexOfChild(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r3 = r3.indexOfChild(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = r4.compareTo(r3)
        L_0x0078:
            return r0
        L_0x0079:
            o46 r5 = (defpackage.o46) r5
            java.lang.Object r3 = r3.b
            bv6 r3 = (defpackage.bv6) r3
            java.util.concurrent.ConcurrentHashMap r0 = r3.F0
            n46 r5 = r5.a
            java.lang.Object r5 = r0.get(r5)
            yk7 r5 = (defpackage.yk7) r5
            r0 = 0
            if (r5 == 0) goto L_0x0093
            long r1 = r5.X
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            goto L_0x0094
        L_0x0093:
            r5 = r0
        L_0x0094:
            o46 r4 = (defpackage.o46) r4
            java.util.concurrent.ConcurrentHashMap r3 = r3.F0
            n46 r4 = r4.a
            java.lang.Object r3 = r3.get(r4)
            yk7 r3 = (defpackage.yk7) r3
            if (r3 == 0) goto L_0x00a8
            long r3 = r3.X
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
        L_0x00a8:
            int r3 = defpackage.gp0.f(r5, r0)
            return r3
        L_0x00ad:
            le1 r4 = (le1) r4
            java.lang.Object r3 = r3.b
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r3.get(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            le1 r5 = (le1) r5
            java.lang.Object r3 = r3.get(r5)
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = defpackage.gp0.f(r4, r3)
            return r3
        L_0x00c6:
            java.lang.Object r3 = r3.b
            dc9 r3 = (dc9) r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == 0) goto L_0x00da
            int r4 = r3.b(r4)
            if (r4 < 0) goto L_0x00da
            int[] r1 = r3.c
            r4 = r1[r4]
            goto L_0x00db
        L_0x00da:
            r4 = r0
        L_0x00db:
            if (r5 == 0) goto L_0x00e7
            int r5 = r3.b(r5)
            if (r5 < 0) goto L_0x00e7
            int[] r3 = r3.c
            r0 = r3[r5]
        L_0x00e7:
            int r3 = hhd.o(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d15.compare(java.lang.Object, java.lang.Object):int");
    }

    public d15(List list) {
        this.a = 0;
        ete.g(1, c);
        dc9 dc9 = new dc9(list.size());
        int i = 0;
        for (Object d : list) {
            int i2 = i + 1;
            if (i >= 0) {
                dc9.d(i, d);
                i = i2;
            } else {
                p23.G();
                throw null;
            }
        }
        this.b = dc9;
    }
}
