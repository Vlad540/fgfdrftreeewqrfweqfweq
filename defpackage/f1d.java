package defpackage;

/* renamed from: f1d  reason: default package */
public abstract class f1d extends c0d {
    public final String A0;
    public final long B0;
    public final nd4 C0;
    public final vw6 X;
    public final long Y;
    public final boolean Z;
    public final String b = getClass().getName();
    public final long c;
    public final sq8 o;
    public final String w0;
    public final int x0;
    public long y0;
    public final long z0;

    public f1d(long j, sq8 sq8, vw6 vw6, long j2, boolean z, int i, String str, long j3, String str2, long j4, nd4 nd4) {
        this.c = j;
        this.o = sq8;
        this.X = vw6;
        this.Y = j2;
        this.Z = z;
        this.x0 = i;
        this.w0 = str;
        this.z0 = j3;
        this.A0 = str2;
        this.B0 = j4;
        this.C0 = nd4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r5v14, types: [java.lang.Object, p10] */
    /* JADX WARNING: type inference failed for: r7v11, types: [java.lang.Object, p10] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05b1  */
    /* JADX WARNING: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x029d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x() {
        /*
            r84 = this;
            r0 = r84
            r1 = 50
            r2 = 300(0x12c, float:4.2E-43)
            r3 = 0
            t52 r6 = r84.b()
            long r7 = r0.c
            i22 r6 = r6.B(r7)
            java.lang.String r9 = r0.b
            if (r6 != 0) goto L_0x0026
            ru.ok.tamtam.exception.ChatNotFoundException r0 = new ru.ok.tamtam.exception.ChatNotFoundException
            java.lang.String r1 = "chat is null #"
            java.lang.String r1 = defpackage.us8.i(r7, r1)
            r0.<init>(r1)
            java.lang.String r1 = "chat is null!"
            udd.S(r9, r1, r0)
            return
        L_0x0026:
            long r10 = java.lang.System.currentTimeMillis()
            boolean r12 = r6.J()
            r13 = 0
            xm8 r15 = r6.c
            o62 r4 = r6.b
            r16 = r6
            if (r12 != 0) goto L_0x0043
            long r5 = r4.a
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x0043
            if (r15 != 0) goto L_0x0043
            long r5 = r4.l
            goto L_0x0051
        L_0x0043:
            long r5 = java.lang.System.nanoTime()
            java.util.UUID r17 = java.util.UUID.randomUUID()
            int r12 = r17.hashCode()
            long r13 = (long) r12
            long r5 = r5 ^ r13
        L_0x0051:
            uo8 r13 = r84.y()
            r14 = 0
            if (r13 != 0) goto L_0x0064
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r1 = "message is null. skipping task"
            udd.R(r9, r14, r1, r0)
            return
        L_0x0064:
            r13.f = r5
            nd4 r9 = r0.C0
            r13.H = r9
            java.lang.String r9 = r13.g
            boolean r9 = r1g.p(r9)
            if (r9 != 0) goto L_0x0227
            g2b r9 = r84.p()
            j2b r9 = (defpackage.j2b) r9
            yzc r9 = r9.b
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r12 = ru.ok.tamtam.android.prefs.PmsKey.f65maxmsglength
            r14 = 4000(0xfa0, float:5.605E-42)
            r20 = r4
            long r3 = (long) r14
            long r3 = r9.o(r12, r3)
            int r3 = (int) r3
            java.lang.String r4 = r13.g
            int r4 = r4.length()
            if (r4 <= r3) goto L_0x0223
            jk9 r4 = new jk9
            java.lang.String r4 = r13.g
            java.util.regex.Pattern r9 = defpackage.ehe.a
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r12 = r4.length()
            if (r12 >= r3) goto L_0x00a9
            r9.add(r4)
            r24 = r5
            goto L_0x011a
        L_0x00a9:
            if (r2 > r3) goto L_0x021b
            if (r1 > r3) goto L_0x0213
            int r12 = r3 + -300
            java.lang.String r14 = r4.substring(r12, r3)
            java.lang.String[] r12 = defpackage.ehe.i
            int r2 = r12.length
            r24 = r5
            r1 = 0
        L_0x00b9:
            r5 = -1
            if (r1 >= r2) goto L_0x00c9
            r6 = r12[r1]
            int r6 = r14.lastIndexOf(r6)
            if (r6 <= r5) goto L_0x00c5
            goto L_0x00ca
        L_0x00c5:
            r6 = 1
            int r1 = r1 + r6
            r6 = r12
            goto L_0x00b9
        L_0x00c9:
            r6 = r5
        L_0x00ca:
            if (r6 != r5) goto L_0x00eb
            r1 = 50
            int r2 = r3 + -50
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String[] r6 = defpackage.ehe.j
            int r14 = r6.length
            r1 = 0
        L_0x00d8:
            if (r1 >= r14) goto L_0x00e7
            r12 = r6[r1]
            int r12 = r2.lastIndexOf(r12)
            if (r12 <= r5) goto L_0x00e4
            r6 = r12
            goto L_0x00e8
        L_0x00e4:
            r12 = 1
            int r1 = r1 + r12
            goto L_0x00d8
        L_0x00e7:
            r6 = r5
        L_0x00e8:
            r1 = 50
            goto L_0x00ed
        L_0x00eb:
            r1 = 300(0x12c, float:4.2E-43)
        L_0x00ed:
            if (r6 != r5) goto L_0x00ff
            r2 = 0
            java.lang.String r1 = r4.substring(r2, r3)
            r9.add(r1)
            java.lang.String r1 = r4.substring(r3)
            r9.add(r1)
            goto L_0x011a
        L_0x00ff:
            r2 = 0
            int r3 = r3 - r1
            java.lang.String r1 = r4.substring(r2, r3)
            int r1 = r1.length()
            int r1 = r1 + r6
            java.lang.String r3 = r4.substring(r2, r1)
            r9.add(r3)
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r1 = r4.substring(r1)
            r9.add(r1)
        L_0x011a:
            int r1 = r9.size()
            r2 = 2
            if (r1 == r2) goto L_0x0138
            int r1 = r9.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "jk9"
            java.lang.String r3 = "Wrong message split! Size is %d"
            udd.t(r2, r3, r1)
        L_0x0134:
            r26 = r7
            goto L_0x022a
        L_0x0138:
            r1 = 0
            java.lang.Object r2 = r9.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = h0e.B0(r2)
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.lang.Object r5 = r9.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.CharSequence r3 = h0e.B0(r5)
            java.lang.String r3 = r3.toString()
            r13.g = r2
            r13.u = r1
            java.util.List r1 = r13.F
            if (r1 == 0) goto L_0x01e7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r4 = r4.length()
            int r9 = r2.length()
            int r14 = r3.length()
            int r14 = r14 + r9
            int r4 = r4 - r14
            java.util.Iterator r1 = r1.iterator()
        L_0x017a:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x01e4
            java.lang.Object r9 = r1.next()
            fp8 r9 = (defpackage.fp8) r9
            int r14 = r9.d
            int r12 = r2.length()
            r22 = r1
            int r1 = r9.d
            if (r14 <= r12) goto L_0x01a8
            int r12 = r2.length()
            int r1 = r1 - r12
            r12 = 55
            r14 = 0
            fp8 r1 = defpackage.fp8.a(r9, r1, r14, r12)
            fp8 r1 = r1.b()
            r6.add(r1)
            r1 = r22
            goto L_0x017a
        L_0x01a8:
            r14 = 0
            int r12 = r9.e
            int r14 = r1 + r12
            r26 = r7
            int r7 = r2.length()
            if (r14 <= r7) goto L_0x01d8
            int r7 = r2.length()
            int r7 = r7 - r1
            r1 = 47
            r8 = 0
            fp8 r1 = defpackage.fp8.a(r9, r8, r7, r1)
            fp8 r1 = r1.b()
            r5.add(r1)
            int r12 = r12 - r4
            int r12 = r12 - r7
            r1 = 39
            fp8 r1 = defpackage.fp8.a(r9, r8, r12, r1)
            fp8 r1 = r1.b()
            r6.add(r1)
            goto L_0x01df
        L_0x01d8:
            fp8 r1 = r9.b()
            r5.add(r1)
        L_0x01df:
            r1 = r22
            r7 = r26
            goto L_0x017a
        L_0x01e4:
            r26 = r7
            goto L_0x01eb
        L_0x01e7:
            r26 = r7
            r5 = 0
            r6 = 0
        L_0x01eb:
            if (r5 == 0) goto L_0x01f2
            java.util.List r1 = o23.T(r5)
            goto L_0x01f3
        L_0x01f2:
            r1 = 0
        L_0x01f3:
            r13.F = r1
            uo8 r1 = new uo8
            r1.<init>()
            r1.g = r3
            if (r6 == 0) goto L_0x0203
            java.util.List r2 = o23.T(r6)
            goto L_0x0204
        L_0x0203:
            r2 = 0
        L_0x0204:
            r1.F = r2
            vo8 r2 = r13.r
            r1.r = r2
            boolean r2 = r13.u
            r1.u = r2
            nd4 r2 = r13.H
            r1.H = r2
            goto L_0x022b
        L_0x0213:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "deltaForSpaceSeparator should be less then maxLength"
            r0.<init>(r1)
            throw r0
        L_0x021b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "deltaForNewLineSeparator should be less then maxLength"
            r0.<init>(r1)
            throw r0
        L_0x0223:
            r24 = r5
            goto L_0x0134
        L_0x0227:
            r20 = r4
            goto L_0x0223
        L_0x022a:
            r1 = 0
        L_0x022b:
            sq8 r2 = r0.o
            if (r2 == 0) goto L_0x0288
            xm8 r3 = r2.c
            int r4 = r2.a
            r5 = 2
            if (r4 != r5) goto L_0x026a
            vo8 r5 = r3.a
            jj7 r6 = r5.D0
            if (r6 == 0) goto L_0x0243
            java.lang.Object r7 = r6.b
            vw6 r7 = (defpackage.vw6) r7
            if (r7 == 0) goto L_0x0243
            goto L_0x024b
        L_0x0243:
            if (r6 == 0) goto L_0x0267
            java.lang.Object r7 = r6.c
            v9c r7 = (defpackage.v9c) r7
            if (r7 == 0) goto L_0x0267
        L_0x024b:
            uo8 r5 = r5.E()
            p10 r7 = new p10
            r7.<init>()
            java.lang.Object r6 = r6.a
            java.util.List r6 = (java.util.List) r6
            r7.a = r6
            jj7 r6 = r7.c()
            r5.n = r6
            vo8 r5 = r5.a()
            r13.r = r5
            goto L_0x026e
        L_0x0267:
            r13.r = r5
            goto L_0x026e
        L_0x026a:
            vo8 r5 = r3.a
            r13.r = r5
        L_0x026e:
            r13.p = r4
            long r4 = r2.b
            r13.q = r4
            vo8 r3 = r3.a
            long r3 = r3.c
            java.lang.String r3 = r2.d
            r13.s = r3
            java.lang.String r3 = r2.e
            r13.t = r3
            long r3 = r2.f
            r13.x = r3
            long r3 = r2.g
            r13.y = r3
        L_0x0288:
            g2b r3 = r84.p()
            j2b r3 = (defpackage.j2b) r3
            i03 r3 = r3.a
            java.lang.String r4 = "server.timeDelta"
            r5 = 0
            long r3 = r3.e(r4, r5)
            long r3 = r3 + r10
            if (r15 != 0) goto L_0x029d
            r5 = r3
            goto L_0x02a1
        L_0x029d:
            vo8 r5 = r15.a
            long r5 = r5.o
        L_0x02a1:
            r13.k = r3
            r13.c = r5
            boolean r3 = r16.G()
            if (r3 == 0) goto L_0x02b5
            r3 = r20
            d62 r3 = r3.H
            boolean r3 = r3.a
            if (r3 != 0) goto L_0x02b5
            r3 = 4
            goto L_0x02b6
        L_0x02b5:
            r3 = 2
        L_0x02b6:
            r13.I = r3
            r3 = r26
            r13.h = r3
            boolean r5 = r16.D()
            if (r5 != 0) goto L_0x02cf
            g2b r5 = r84.p()
            j2b r5 = (defpackage.j2b) r5
            i03 r5 = r5.a
            long r5 = r5.s()
            goto L_0x02d1
        L_0x02cf:
            r5 = 0
        L_0x02d1:
            r13.e = r5
            jj7 r5 = r13.n
            if (r5 != 0) goto L_0x02e2
            p10 r5 = new p10
            r5.<init>()
            jj7 r5 = r5.c()
            r13.n = r5
        L_0x02e2:
            vw6 r5 = r0.X
            if (r5 != 0) goto L_0x02e7
            goto L_0x02f5
        L_0x02e7:
            jj7 r6 = r13.n
            p10 r6 = r6.I()
            r6.b = r5
            jj7 r5 = r6.c()
            r13.n = r5
        L_0x02f5:
            vo8 r5 = r13.a()
            d0d r6 = r0.a
            if (r6 == 0) goto L_0x02fe
            goto L_0x02ff
        L_0x02fe:
            r6 = 0
        L_0x02ff:
            t97 r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            v2c r6 = (defpackage.v2c) r6
            r6.getClass()
            java.util.List r7 = r5.V0
            boolean r8 = defpackage.ek8.J(r7)
            if (r8 == 0) goto L_0x0317
            java.util.List r8 = java.util.Collections.emptyList()
            goto L_0x0336
        L_0x0317:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r7.iterator()
        L_0x0320:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0336
            java.lang.Object r10 = r9.next()
            fp8 r10 = (defpackage.fp8) r10
            ep8 r11 = r10.c
            ep8 r12 = defpackage.ep8.z0
            if (r11 != r12) goto L_0x0320
            r8.add(r10)
            goto L_0x0320
        L_0x0336:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r8)
            boolean r8 = r10.isEmpty()
            r11 = 1
            r8 = r8 ^ r11
            java.lang.String r13 = r5.w0
            t97 r14 = r6.b
            if (r8 == 0) goto L_0x03d5
            java.lang.Object r8 = r14.getValue()
            w6a r8 = (w6a) r8
            nu4 r8 = r8.j
            java.util.List r8 = r8.f(r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r8)
            int r8 = r14.size()
            r15 = 0
        L_0x0362:
            if (r15 >= r8) goto L_0x03d0
            java.lang.Object r18 = r14.get(r15)
            r12 = r18
            wia r12 = (wia) r12
            java.lang.Object r11 = r12.a
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.Object r12 = r12.b
            fz6 r12 = (fz6) r12
            java.util.Iterator r22 = r10.iterator()
        L_0x0378:
            boolean r23 = r22.hasNext()
            if (r23 == 0) goto L_0x0396
            java.lang.Object r23 = r22.next()
            r26 = r8
            r8 = r23
            fp8 r8 = (defpackage.fp8) r8
            int r8 = r8.d
            r27 = r14
            int r14 = r12.a
            if (r8 != r14) goto L_0x0391
            goto L_0x039c
        L_0x0391:
            r8 = r26
            r14 = r27
            goto L_0x0378
        L_0x0396:
            r26 = r8
            r27 = r14
            r23 = 0
        L_0x039c:
            r8 = r23
            fp8 r8 = (defpackage.fp8) r8
            if (r8 == 0) goto L_0x03b5
            oi r11 = new oi
            r31 = r1
            r32 = r2
            long r1 = r8.a
            r11.<init>(r1)
            r9.add(r11)
            r10.remove(r8)
        L_0x03b3:
            r1 = 1
            goto L_0x03c6
        L_0x03b5:
            r31 = r1
            r32 = r2
            vu4 r1 = new vu4
            java.lang.String r2 = r11.toString()
            r1.<init>(r2)
            r9.add(r1)
            goto L_0x03b3
        L_0x03c6:
            int r15 = r15 + r1
            r8 = r26
            r14 = r27
            r1 = r31
            r2 = r32
            goto L_0x0362
        L_0x03d0:
            r31 = r1
            r32 = r2
            goto L_0x041b
        L_0x03d5:
            r31 = r1
            r32 = r2
            r1 = 1
            java.lang.Object r2 = r14.getValue()
            w6a r2 = (w6a) r2
            nu4 r2 = r2.j
            java.util.List r2 = r2.c(r13)
            boolean r8 = r2.isEmpty()
            r8 = r8 ^ r1
            if (r8 == 0) goto L_0x041b
            defpackage.ek8.U(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r8 = 10
            int r10 = q23.H(r2, r8)
            r1.<init>(r10)
            java.util.Iterator r2 = r2.iterator()
        L_0x03ff:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0418
            java.lang.Object r8 = r2.next()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            vu4 r10 = new vu4
            java.lang.String r8 = r8.toString()
            r10.<init>(r8)
            r1.add(r10)
            goto L_0x03ff
        L_0x0418:
            r9.addAll(r1)
        L_0x041b:
            jj7 r1 = r5.D0
            if (r1 == 0) goto L_0x0424
            java.lang.Object r2 = r1.a
            java.util.List r2 = (java.util.List) r2
            goto L_0x0425
        L_0x0424:
            r2 = 0
        L_0x0425:
            hw4 r8 = hw4.a
            if (r2 != 0) goto L_0x042a
            r2 = r8
        L_0x042a:
            java.util.Iterator r2 = r2.iterator()
        L_0x042e:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x044f
            java.lang.Object r10 = r2.next()
            o10 r10 = (defpackage.o10) r10
            i10 r10 = r10.f
            if (r10 == 0) goto L_0x042e
            long r10 = r10.a
            r14 = 0
            int r19 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r19 == 0) goto L_0x042e
            utd r12 = new utd
            r12.<init>(r10, r10)
            r9.add(r12)
            goto L_0x042e
        L_0x044f:
            r14 = 0
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x0458
            goto L_0x048f
        L_0x0458:
            n2c r2 = r6.b()
            bec r10 = r2.a
            mv9 r10 = r10.n()
            m2c r11 = new m2c
            r12 = 2
            r11.<init>(r2, r9, r12)
            w63 r2 = new w63
            r2.<init>(r10, r12, r11)
            t97 r9 = r6.c
            java.lang.Object r9 = r9.getValue()
            qmc r9 = (qmc) r9
            f73 r2 = r2.k(r9)
            d74 r9 = new d74
            r10 = 7
            r9.<init>(r10)
            hk9 r10 = hk9.Y
            pn1 r11 = new pn1
            r12 = 0
            r11.<init>(r10, r12, r9)
            r2.i(r11)
            zef r2 = r6.f
            r2.a(r11)
        L_0x048f:
            to8 r2 = r84.n()
            a04 r2 = r2.a
            hz3 r2 = (defpackage.hz3) r2
            nec r2 = r2.c
            r2.getClass()
            vo8 r6 = r5.G0
            if (r6 == 0) goto L_0x04fb
            int r9 = r5.E0
            r10 = 2
            if (r9 != r10) goto L_0x04fb
            jj7 r1 = r6.D0
            if (r1 == 0) goto L_0x04ec
            java.lang.Object r7 = r1.a
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x04b0
            goto L_0x04ed
        L_0x04b0:
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = q23.H(r7, r10)
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L_0x04bf:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x04e1
            java.lang.Object r10 = r7.next()
            o10 r10 = (defpackage.o10) r10
            m00 r10 = r10.j()
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            r10.l = r11
            o10 r10 = r10.a()
            r9.add(r10)
            goto L_0x04bf
        L_0x04e1:
            p10 r1 = r1.I()
            r1.a = r9
            jj7 r1 = r1.c()
            goto L_0x04ed
        L_0x04ec:
            r1 = 0
        L_0x04ed:
            java.util.List r7 = r6.V0
            if (r7 != 0) goto L_0x04f2
            r7 = r8
        L_0x04f2:
            java.lang.String r13 = r6.w0
        L_0x04f4:
            r53 = r1
            r80 = r7
            r46 = r13
            goto L_0x04ff
        L_0x04fb:
            if (r7 != 0) goto L_0x04f4
            r7 = r8
            goto L_0x04f4
        L_0x04ff:
            int r54 = defpackage.fu7.c(r53)
            if (r6 == 0) goto L_0x050a
            long r13 = r6.b
            r57 = r13
            goto L_0x050c
        L_0x050a:
            r57 = r14
        L_0x050c:
            nd4 r1 = r5.X0
            if (r1 == 0) goto L_0x0519
            long r6 = r1.a
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r82 = r6
            goto L_0x051b
        L_0x0519:
            r82 = 0
        L_0x051b:
            if (r1 == 0) goto L_0x0526
            boolean r1 = r1.b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r83 = r1
            goto L_0x0528
        L_0x0526:
            r83 = 0
        L_0x0528:
            bp8 r47 = defpackage.bp8.SENDING
            ls8 r48 = defpackage.ls8.ACTIVE
            jp8 r1 = new jp8
            r33 = r1
            long r6 = r5.U0
            r78 = r6
            yr8 r6 = r5.W0
            r81 = r6
            r34 = 0
            r36 = 0
            long r6 = r5.o
            r38 = r6
            r40 = 0
            long r6 = r5.Y
            r42 = r6
            long r6 = r5.Z
            r44 = r6
            long r6 = r5.A0
            r49 = r6
            r51 = 0
            r52 = 0
            boolean r6 = r5.K0
            r55 = r6
            int r6 = r5.E0
            r56 = r6
            r59 = 0
            long r6 = r5.F0
            r60 = r6
            java.lang.String r6 = r5.H0
            r62 = r6
            java.lang.String r6 = r5.I0
            r63 = r6
            long r6 = r5.N0
            r64 = r6
            long r6 = r5.O0
            r66 = r6
            int r6 = r5.Z0
            r68 = r6
            long r6 = r5.x0
            r69 = r6
            int r6 = r5.Q0
            r71 = r6
            r72 = 0
            r73 = 0
            long r6 = r5.R0
            r74 = r6
            r76 = 0
            int r5 = r5.T0
            r77 = r5
            r33.<init>(r34, r36, r38, r40, r42, r44, r46, r47, r48, r49, r51, r52, r53, r54, r55, r56, r57, r59, r60, r62, r63, r64, r66, r68, r69, r71, r72, r73, r74, r76, r77, r78, r80, r81, r82, r83)
            cw8 r2 = r2.d()
            long r1 = r2.f(r1)
            to8 r5 = r84.n()
            vo8 r1 = r5.q(r1)
            boolean r2 = r1.n()
            if (r2 != 0) goto L_0x05ad
            t52 r2 = r84.b()
            r5 = 1
            i22 r6 = r2.k0(r3, r1, r5)
            goto L_0x05af
        L_0x05ad:
            r6 = r16
        L_0x05af:
            if (r6 == 0) goto L_0x0637
            boolean r2 = r6.J()
            if (r2 == 0) goto L_0x05bd
            boolean r2 = r6.A()
            if (r2 == 0) goto L_0x05c3
        L_0x05bd:
            boolean r2 = r6.O()
            if (r2 == 0) goto L_0x05cc
        L_0x05c3:
            t52 r2 = r84.b()
            m62 r5 = defpackage.m62.a
            r2.i(r3, r5)
        L_0x05cc:
            d0d r2 = r0.a
            if (r2 == 0) goto L_0x05d2
            r14 = r2
            goto L_0x05d3
        L_0x05d2:
            r14 = 0
        L_0x05d3:
            t97 r2 = r14.c
            java.lang.Object r2 = r2.getValue()
            tt0 r2 = (tt0) r2
            yga r3 = new yga
            long r4 = r1.Y
            md4 r7 = r1.Y0
            long r9 = r0.c
            long r11 = r1.b
            java.lang.String r13 = r0.w0
            r20 = r3
            r21 = r9
            r23 = r24
            r25 = r11
            r27 = r13
            r28 = r4
            r30 = r7
            r20.<init>(r21, r23, r25, r27, r28, r30)
            r2.c(r3)
            long r1 = r1.b
            long r1 = r0.z(r1, r6)
            r0.y0 = r1
            if (r31 == 0) goto L_0x0637
            r3 = r31
            java.lang.String r12 = r3.g
            java.util.List r4 = r3.F
            h1d r5 = new h1d
            if (r4 != 0) goto L_0x0611
            r14 = r8
            goto L_0x0612
        L_0x0611:
            r14 = r4
        L_0x0612:
            long r10 = r0.c
            r13 = 0
            r9 = r5
            r9.<init>(r10, r12, r13, r14)
            r4 = r32
            r5.b = r4
            r5.d = r1
            boolean r1 = r0.Z
            r5.e = r1
            long r1 = r0.B0
            r5.f = r1
            nd4 r1 = r3.H
            r5.k = r1
            j1d r1 = new j1d
            r1.<init>(r5)
            luf r0 = r84.u()
            r0.a(r1)
        L_0x0637:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1d.x():void");
    }

    public abstract uo8 y();

    public long z(long j, i22 i22) {
        long j2;
        long j3;
        long j4;
        long j5 = j;
        i22 i222 = i22;
        long j6 = i222.b.a;
        long s = ((lqc) i()).s();
        if (i22.J()) {
            if (i222.b.f(s)) {
                j4 = s;
            } else {
                tf3 k = i22.k();
                j4 = k != null ? k.n() : 0;
            }
            j2 = j4;
            j3 = j4 != 0 ? 0 : j6;
        } else {
            j3 = j6;
            j2 = 0;
        }
        t52 b2 = b();
        c52 c52 = r15;
        c52 c522 = new c52(b2, i222.a, ((j2b) b2.n).a.m(), 1);
        tic.a(c52, b2.z, (j6) null, new ak0(21), (qmc) null);
        if (!i222.b.f(s)) {
            t52 b3 = b();
            long j7 = this.c;
            b3.getClass();
            b3.h(j7, false, new cz0(false, 1));
        }
        String str = this.b;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.i(j5, "Service task finish process and call msgSend, msgId = "), (Throwable) null);
        }
        pk a = a();
        long j8 = i222.a;
        long j9 = this.Y;
        boolean z = this.Z;
        long j10 = this.B0;
        gy9 gy9 = (gy9) a;
        if (!gy9.p(j5)) {
            return 0;
        }
        return gy9.A().c(new d99(((j2b) gy9.z()).a.n(), j, j8, j3, j2, z, j10), false, j9, 1);
    }

    public f1d(e1d e1d) {
        this.c = e1d.a;
        this.o = e1d.b;
        this.X = e1d.c;
        this.Y = e1d.d;
        this.Z = e1d.e;
        this.x0 = e1d.g;
        this.w0 = e1d.h;
        this.z0 = e1d.i;
        this.A0 = e1d.j;
        this.B0 = e1d.f;
        this.C0 = e1d.k;
    }
}
