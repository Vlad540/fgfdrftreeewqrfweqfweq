package defpackage;

/* renamed from: owf  reason: default package */
public final class owf implements nhc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ owf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: nxf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.az3 r8, byte[] r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x0099;
                case 2: goto L_0x0084;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r7.b
            koc r7 = (defpackage.koc) r7
            boolean r8 = r7.f
            if (r8 == 0) goto L_0x000f
            goto L_0x0083
        L_0x000f:
            qwf r8 = new qwf
            r8.<init>(r9)
            gvf r9 = r7.c
            int r10 = r8.d
            ge1 r9 = r9.r(r10)
            if (r9 != 0) goto L_0x001f
            goto L_0x0083
        L_0x001f:
            boolean r10 = r7.f
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0026
            goto L_0x005a
        L_0x0026:
            java.util.concurrent.ConcurrentHashMap r10 = r7.a
            java.lang.Object r10 = r10.get(r9)
            if (r10 != 0) goto L_0x0051
            java.util.Set r10 = r7.h
            if (r10 != 0) goto L_0x0034
            r10 = r0
            goto L_0x003a
        L_0x0034:
            java.util.Set r10 = r7.h
            boolean r10 = r10.contains(r9)
        L_0x003a:
            if (r10 != 0) goto L_0x003d
            goto L_0x005a
        L_0x003d:
            nxf r10 = new nxf
            xwb r1 = r7.b
            eje r2 = r7.i
            joc r3 = new joc
            r4 = 0
            r3.<init>(r7, r4, r9)
            r10.<init>(r1, r2, r3)
            java.util.concurrent.ConcurrentHashMap r1 = r7.a
            r1.put(r9, r10)
        L_0x0051:
            java.util.concurrent.ConcurrentHashMap r10 = r7.a
            java.lang.Object r10 = r10.get(r9)
            r1 = r10
            nxf r1 = (defpackage.nxf) r1
        L_0x005a:
            if (r1 == 0) goto L_0x0067
            android.os.Handler r10 = r1.e
            jwf r2 = new jwf
            r3 = 3
            r2.<init>(r1, r3, r8)
            r10.post(r2)
        L_0x0067:
            byte r8 = r8.a
            r8 = r8 & 8
            if (r8 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            if (r0 == 0) goto L_0x0083
            java.util.concurrent.ConcurrentHashMap r8 = r7.a
            java.lang.Object r8 = r8.get(r9)
            nxf r8 = (defpackage.nxf) r8
            if (r8 == 0) goto L_0x0083
            r8.a()
            java.util.concurrent.ConcurrentHashMap r7 = r7.a
            r7.remove(r9)
        L_0x0083:
            return
        L_0x0084:
            nx4 r6 = new nx4
            r5 = 6
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r7 = r7.b
            dhc r7 = (defpackage.dhc) r7
            android.os.Handler r7 = r7.f
            r7.post(r6)
            return
        L_0x0099:
            java.lang.Object r7 = r7.b
            b0d r7 = (b0d) r7
            java.lang.Object r8 = r7.o
            gvf r8 = (gvf) r8
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.get()
            r9.get()
            r9.getShort()
            int r10 = r9.getInt()
            r0 = 268435455(0xfffffff, float:2.5243547E-29)
            r10 = r10 & r0
            r9.getInt()
            r9.getInt()
            java.nio.ByteBuffer r9 = r9.slice()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.CharBuffer r9 = r0.decode(r9)
            java.lang.String r9 = r9.toString()
            r8.r(r10)
            vs r0 = new vs
            ge1 r8 = r8.r(r10)
            r0.<init>(r8, r9)
            java.lang.Object r7 = r7.X
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x00de:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00f4
            java.lang.Object r8 = r7.next()
            ow0 r8 = (defpackage.ow0) r8
            gx0 r8 = r8.a
            ob1 r8 = r8.a2
            ss r8 = r8.o
            r8.onAsrDataPackage(r0)
            goto L_0x00de
        L_0x00f4:
            return
        L_0x00f5:
            nx4 r0 = new nx4
            r6 = 5
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = r7.b
            km4 r7 = (km4) r7
            java.lang.Object r7 = r7.X
            android.os.Handler r7 = (android.os.Handler) r7
            r7.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owf.a(az3, byte[], int):void");
    }
}
