package defpackage;

/* renamed from: ap8  reason: default package */
public final class ap8 {
    public final String a = ap8.class.getName();
    public final t97 b;
    public final t97 c;

    public ap8(t97 t97, t97 t972) {
        this.b = t97;
        this.c = t972;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(boolean r9, java.util.List r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.zo8
            if (r0 == 0) goto L_0x0013
            r0 = r11
            zo8 r0 = (defpackage.zo8) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            zo8 r0 = new zo8
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            boolean r9 = r0.Y
            java.util.List r10 = r0.X
            ap8 r8 = r0.o
            wx3.H(r11)
            goto L_0x004f
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            wx3.H(r11)
            t97 r11 = r8.b
            java.lang.Object r11 = r11.getValue()
            b29 r11 = (defpackage.b29) r11
            r0.o = r8
            r0.X = r10
            r0.Y = r9
            r0.x0 = r3
            java.lang.Object r11 = r11.b(r10, r0)
            if (r11 != r1) goto L_0x004f
            return r1
        L_0x004f:
            java.util.List r11 = (java.util.List) r11
            int r0 = r11.size()
            int r1 = r10.size()
            if (r0 == r1) goto L_0x0075
            int r10 = r10.size()
            int r0 = r11.size()
            java.lang.String r1 = "Requested to delete "
            java.lang.String r2 = " messages, but found only "
            java.lang.String r10 = defpackage.me4.g(r1, r10, r0, r2)
            java.lang.String r0 = r8.a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r10)
            udd.s(r0, r10, r1)
        L_0x0075:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x007e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r11.next()
            r1 = r0
            vo8 r1 = (defpackage.vo8) r1
            long r1 = r1.x0
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            java.lang.Object r1 = r10.get(r3)
            if (r1 != 0) goto L_0x00a0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.put(r3, r1)
        L_0x00a0:
            java.util.List r1 = (java.util.List) r1
            r1.add(r0)
            goto L_0x007e
        L_0x00a6:
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00ae:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0107
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r0 = r11.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            t97 r0 = r8.c
            java.lang.Object r0 = r0.getValue()
            r7 = r0
            luf r7 = (defpackage.luf) r7
            md4 r6 = defpackage.md4.REGULAR
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = q23.H(r11, r0)
            r3.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x00e4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r0 = r11.next()
            vo8 r0 = (defpackage.vo8) r0
            long r4 = r0.b
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            r3.add(r0)
            goto L_0x00e4
        L_0x00fb:
            j0d r11 = new j0d
            r4 = 0
            r0 = r11
            r5 = r9
            r0.<init>(r1, r3, r4, r5, r6)
            r7.a(r11)
            goto L_0x00ae
        L_0x0107:
            jue r8 = jue.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap8.a(boolean, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
