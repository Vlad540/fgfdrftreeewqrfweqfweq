package defpackage;

/* renamed from: l8  reason: default package */
public final class l8 extends b97 implements s16 {
    public static final l8 X = new l8(0, 3);
    public static final l8 Y = new l8(0, 4);
    public static final l8 Z = new l8(0, 5);
    public static final l8 b = new l8(0, 0);
    public static final l8 c = new l8(0, 1);
    public static final l8 o = new l8(0, 2);
    public static final l8 w0 = new l8(0, 6);
    public static final l8 x0 = new l8(0, 7);
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8(int i, int i2) {
        super(i);
        this.a = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: cu3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: cu3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: cu3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: cu3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r5 = this;
            r0 = 0
            r1 = 13
            r2 = 0
            int r5 = r5.a
            switch(r5) {
                case 0: goto L_0x0126;
                case 1: goto L_0x0104;
                case 2: goto L_0x00bf;
                case 3: goto L_0x0074;
                case 4: goto L_0x004c;
                case 5: goto L_0x001f;
                case 6: goto L_0x0014;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r5 = android.system.OsConstants._SC_NPROCESSORS_CONF
            long r0 = android.system.Os.sysconf(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L_0x0014:
            int r5 = android.system.OsConstants._SC_CLK_TCK
            long r0 = android.system.Os.sysconf(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L_0x001f:
            nne r5 = nne.a
            java.util.Map r5 = nne.c()
            x3a r3 = defpackage.xie.a
            java.lang.Object r5 = r5.get(r3)
            boolean r3 = r5 instanceof cu3
            if (r3 == 0) goto L_0x0032
            r2 = r5
            cu3 r2 = (cu3) r2
        L_0x0032:
            if (r2 != 0) goto L_0x003c
            b2b r5 = new b2b
            r5.<init>((int) r1)
            r5.s()
        L_0x003c:
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>(r0)
            v93 r0 = new v93
            r1 = 4
            r0.<init>(r1, r5)
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            return r5
        L_0x004c:
            nne r5 = nne.a
            java.util.Map r5 = nne.c()
            x3a r0 = defpackage.xie.a
            java.lang.Object r5 = r5.get(r0)
            boolean r0 = r5 instanceof cu3
            if (r0 == 0) goto L_0x005f
            r2 = r5
            cu3 r2 = (cu3) r2
        L_0x005f:
            if (r2 != 0) goto L_0x0069
            b2b r5 = new b2b
            r5.<init>((int) r1)
            r5.s()
        L_0x0069:
            ig r5 = new ig
            r0 = 1
            r5.<init>(r0)
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newSingleThreadExecutor(r5)
            return r5
        L_0x0074:
            android.content.Context r5 = nne.d
            if (r5 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r5 = r2
        L_0x007a:
            nne r0 = nne.a
            java.util.Map r0 = nne.c()
            x3a r3 = defpackage.xie.a
            java.lang.Object r0 = r0.get(r3)
            boolean r3 = r0 instanceof cu3
            if (r3 == 0) goto L_0x008d
            r2 = r0
            cu3 r2 = (cu3) r2
        L_0x008d:
            if (r2 != 0) goto L_0x0099
            b2b r0 = new b2b
            r0.<init>((int) r1)
            cu3 r2 = new cu3
            r2.<init>(r0)
        L_0x0099:
            tm6 r0 = new tm6
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r3 = "TracerSDK/1.1.1 App/"
            java.lang.String r4 = " "
            java.lang.StringBuilder r1 = defpackage.hr1.m(r3, r1, r4)
            java.lang.String r3 = "http.agent"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            if (r3 == 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r3 = "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)"
        L_0x00b2:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            int r2 = r2.b
            r0.<init>(r2, r5, r1)
            return r0
        L_0x00bf:
            dp4 r5 = new dp4
            android.content.Context r0 = nne.d
            if (r0 == 0) goto L_0x00c6
            r2 = r0
        L_0x00c6:
            java.lang.String r0 = defpackage.xs7.B()
            java.lang.String r1 = r2.getPackageName()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d7
            java.lang.String r0 = "tracer"
            goto L_0x00f1
        L_0x00d7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "tracer-"
            r1.<init>(r3)
            r3 = 58
            r4 = 45
            java.lang.String r0 = r0.replace(r3, r4)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00f1:
            java.io.File r1 = new java.io.File
            java.io.File r2 = r2.getCacheDir()
            r1.<init>(r2, r0)
            java.lang.String r0 = "drops.json"
            java.io.File r0 = defpackage.ng5.N(r1, r0)
            r5.<init>(r0)
            return r5
        L_0x0104:
            nne r5 = nne.a
            java.util.Map r5 = nne.c()
            x3a r1 = defpackage.hwf.a
            java.lang.Object r5 = r5.get(r1)
            boolean r1 = r5 instanceof di4
            if (r1 == 0) goto L_0x0117
            r2 = r5
            di4 r2 = (di4) r2
        L_0x0117:
            if (r2 != 0) goto L_0x0125
            lv1 r5 = new lv1
            r1 = 14
            r5.<init>(r1, r0)
            di4 r2 = new di4
            r2.<init>(r5)
        L_0x0125:
            return r2
        L_0x0126:
            jxb r5 = defpackage.kxb.a
            r5.getClass()
            d3 r5 = defpackage.kxb.b
            r0 = 2147418112(0x7fff0000, float:NaN)
            int r5 = r5.g(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            int r5 = r5 + r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l8.invoke():java.lang.Object");
    }
}
