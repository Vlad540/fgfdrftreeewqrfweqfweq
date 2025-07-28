package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jy8  reason: default package */
public final class jy8 extends l5e implements i26 {
    public final /* synthetic */ String A0;
    public l05 X;
    public long Y;
    public int Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ rz x0;
    public final /* synthetic */ zz8 y0;
    public final /* synthetic */ long z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jy8(rz rzVar, zz8 zz8, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.x0 = rzVar;
        this.y0 = zz8;
        this.z0 = j;
        this.A0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jy8 jy8 = new jy8(this.x0, this.y0, this.z0, this.A0, continuation);
        jy8.w0 = obj;
        return jy8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: i22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: zz8} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x028b, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x028d, code lost:
        if (r4 != null) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0296, code lost:
        if (r4.n.c() != false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0298, code lost:
        r0 = defpackage.zz8.I1;
        r0 = r13.z();
        r1 = r13.b.a;
        r10.Z = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b0, code lost:
        if (r0.a(r1, r10.z0, r4.q, r6, r17) != r11) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02b2, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b3, code lost:
        r0 = (defpackage.i22) r13.r1.a.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02bd, code lost:
        if (r0 == null) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02bf, code lost:
        r3 = ((defpackage.qhd) r5).b;
        r10.Z = 7;
        r0 = r10.y0.w(r0.a, r3, r10.z0, false, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d6, code lost:
        if (r0 != r11) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02d8, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02d9, code lost:
        defpackage.taf.o(r13.B1, (defpackage.sg9) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e2, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x030e, code lost:
        defpackage.taf.o(r13.B1, (defpackage.sg9) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03d0, code lost:
        r0 = (defpackage.nfa) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03d8, code lost:
        if (hhd.f(r0, defpackage.kfa.a) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03dc, code lost:
        if ((r0 instanceof defpackage.lfa) == false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03de, code lost:
        r0 = (defpackage.lfa) r0;
        defpackage.taf.o(r13.B1, new defpackage.jfa(r0.a, r0.b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03f2, code lost:
        if ((r0 instanceof defpackage.mfa) == false) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03f4, code lost:
        r8 = r13.B1;
        r1 = r12.a;
        r0 = (defpackage.mfa) r0;
        r3 = r0.b;
        r10.w0 = r13;
        r10.X = r8;
        r10.Z = 13;
        r0 = r13.w(r1, r3, r0.a, true, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x040e, code lost:
        if (r0 != r11) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0410, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0411, code lost:
        r1 = defpackage.zz8.I1;
        r13.getClass();
        defpackage.taf.o(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x041f, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e3, code lost:
        r0 = (defpackage.vo8) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e5, code lost:
        if (r0 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e7, code lost:
        r1 = r0.G0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ea, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00eb, code lost:
        if (r1 == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        if (r1.o() != true) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f3, code lost:
        r1 = r1.G0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f6, code lost:
        r3 = r13.B1;
        r6 = defpackage.bx8.c;
        r7 = r13.b.a;
        r5 = (defpackage.b76) r5;
        r9 = r5.a;
        r13 = r5.d;
        r15 = r12;
        r11 = r5.e;
        r5 = r5.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        if (r1 == null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010b, code lost:
        r4 = new java.lang.Long(r1.Y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0113, code lost:
        if (r0 == null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        r4 = new java.lang.Long(r0.Y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011d, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011e, code lost:
        r6.getClass();
        r1 = new java.lang.StringBuilder(":location/show?lat=");
        r1.append(r13);
        r1.append("&lon=");
        r1.append(r11);
        r1.append("&z=");
        r1.append(r5);
        hr1.s(r1, "&chat_id=", r7, "&msg_id=");
        r1.append(r9);
        r0 = new java.lang.StringBuilder(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014c, code lost:
        if (r4 == null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014e, code lost:
        r0.append("&sender_id=" + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015f, code lost:
        defpackage.rf0.j(r0.toString(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c2, code lost:
        r0 = (defpackage.vo8) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c4, code lost:
        if (r0 == null) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c6, code lost:
        r0 = r0.D0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c8, code lost:
        if (r0 == null) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ca, code lost:
        r0 = (java.util.List) r0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ce, code lost:
        if (r0 == null) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d0, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d8, code lost:
        if (r0.hasNext() == false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01da, code lost:
        r4 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e9, code lost:
        if (hhd.f(((defpackage.o10) r4).q, r10.A0) == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ec, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ed, code lost:
        r4 = (defpackage.o10) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ef, code lost:
        if (r4 != null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f2, code lost:
        r0 = r4.i();
        r5 = r4.q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f8, code lost:
        if (r0 != false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0200, code lost:
        if (r4.n.c() != false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0202, code lost:
        r0 = defpackage.zz8.I1;
        r0 = r13.z();
        r2 = r13.b.a;
        r10.Z = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0218, code lost:
        if (r0.a(r2, r10.z0, r5, r6, r17) != r11) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x021a, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x021b, code lost:
        r10.Z = 4;
        r0 = defpackage.zz8.I1;
        r0 = r10.y0.w(r2, r5, r10.z0, false, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x022e, code lost:
        if (r0 != r11) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0230, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0231, code lost:
        defpackage.taf.o(r13.B1, (defpackage.sg9) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x023a, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x025c, code lost:
        r0 = ((defpackage.xm8) r0).a.D0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0262, code lost:
        if (r0 == null) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0264, code lost:
        r0 = (java.util.List) r0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0268, code lost:
        if (r0 == null) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x026a, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0272, code lost:
        if (r0.hasNext() == false) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0274, code lost:
        r1 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0286, code lost:
        if (hhd.f(r1.q, ((defpackage.qhd) r5).b) == false) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0288, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x028a, code lost:
        r4 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r10 = r17
            pu3 r11 = pu3.a
            int r0 = r10.Z
            g10 r6 = defpackage.g10.c
            jue r12 = jue.a
            r1 = 3
            java.lang.String r2 = "&chat_id="
            r3 = 1
            rz r5 = r10.x0
            zz8 r13 = r10.y0
            switch(r0) {
                case 0: goto L_0x006f;
                case 1: goto L_0x0068;
                case 2: goto L_0x005e;
                case 3: goto L_0x005a;
                case 4: goto L_0x0052;
                case 5: goto L_0x004a;
                case 6: goto L_0x005a;
                case 7: goto L_0x0042;
                case 8: goto L_0x003a;
                case 9: goto L_0x005a;
                case 10: goto L_0x005a;
                case 11: goto L_0x005a;
                case 12: goto L_0x002d;
                case 13: goto L_0x001d;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001d:
            l05 r0 = r10.X
            java.lang.Object r1 = r10.w0
            r13 = r1
            zz8 r13 = (defpackage.zz8) r13
            wx3.H(r18)
            r8 = r0
            r15 = r12
            r0 = r18
            goto L_0x0411
        L_0x002d:
            java.lang.Object r0 = r10.w0
            i22 r0 = (defpackage.i22) r0
            wx3.H(r18)
            r15 = r12
            r12 = r0
            r0 = r18
            goto L_0x03d0
        L_0x003a:
            wx3.H(r18)
            r0 = r18
            r15 = r12
            goto L_0x030e
        L_0x0042:
            wx3.H(r18)
            r0 = r18
            r15 = r12
            goto L_0x02d9
        L_0x004a:
            wx3.H(r18)
            r0 = r18
            r15 = r12
            goto L_0x025c
        L_0x0052:
            wx3.H(r18)
            r0 = r18
            r15 = r12
            goto L_0x0231
        L_0x005a:
            wx3.H(r18)
            goto L_0x00a1
        L_0x005e:
            long r2 = r10.Y
            wx3.H(r18)
            r0 = r18
            r15 = r12
            goto L_0x01c2
        L_0x0068:
            wx3.H(r18)
            r0 = r18
            goto L_0x00e3
        L_0x006f:
            wx3.H(r18)
            java.lang.Object r0 = r10.w0
            ou3 r0 = (ou3) r0
            boolean r7 = r5 instanceof defpackage.pz0
            if (r7 == 0) goto L_0x00ce
            pz0 r5 = (defpackage.pz0) r5
            nz0 r0 = r5.e
            boolean r1 = r0 instanceof defpackage.mz0
            gq1 r2 = defpackage.gq1.ATTACH
            if (r1 == 0) goto L_0x00a4
            mz0 r0 = (defpackage.mz0) r0
            boolean r1 = r0.b
            t97 r3 = r13.g1
            java.lang.Object r3 = r3.getValue()
            iq1 r3 = (defpackage.iq1) r3
            r3.e(r2, r1)
            rfa r1 = new rfa
            long r2 = r0.a
            boolean r0 = r0.b
            r1.<init>(r2, r0)
            l05 r0 = r13.B1
            defpackage.taf.o(r0, r1)
        L_0x00a1:
            r15 = r12
            goto L_0x0462
        L_0x00a4:
            boolean r1 = r0 instanceof defpackage.lz0
            if (r1 == 0) goto L_0x00c8
            lz0 r0 = (defpackage.lz0) r0
            boolean r1 = r0.b
            t97 r3 = r13.g1
            java.lang.Object r3 = r3.getValue()
            iq1 r3 = (defpackage.iq1) r3
            r3.e(r2, r1)
            ffa r1 = new ffa
            long r2 = r0.a
            boolean r4 = r0.b
            java.lang.String r0 = r0.c
            r1.<init>(r2, r0, r4)
            l05 r0 = r13.B1
            defpackage.taf.o(r0, r1)
            goto L_0x00a1
        L_0x00c8:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ce:
            boolean r7 = r5 instanceof defpackage.b76
            long r8 = r10.z0
            if (r7 == 0) goto L_0x0168
            k77[] r0 = defpackage.zz8.I1
            b29 r0 = r13.y()
            r10.Z = r3
            java.lang.Object r0 = r0.a(r8, r10)
            if (r0 != r11) goto L_0x00e3
            return r11
        L_0x00e3:
            vo8 r0 = (defpackage.vo8) r0
            if (r0 == 0) goto L_0x00ea
            vo8 r1 = r0.G0
            goto L_0x00eb
        L_0x00ea:
            r1 = 0
        L_0x00eb:
            if (r1 == 0) goto L_0x00f6
            boolean r6 = r1.o()
            if (r6 != r3) goto L_0x00f6
            vo8 r1 = r1.G0
            goto L_0x00eb
        L_0x00f6:
            l05 r3 = r13.B1
            bx8 r6 = defpackage.bx8.c
            f19 r7 = r13.b
            long r7 = r7.a
            b76 r5 = (defpackage.b76) r5
            long r9 = r5.a
            double r13 = r5.d
            r15 = r12
            double r11 = r5.e
            float r5 = r5.f
            if (r1 == 0) goto L_0x0113
            java.lang.Long r4 = new java.lang.Long
            long r0 = r1.Y
            r4.<init>(r0)
            goto L_0x011e
        L_0x0113:
            if (r0 == 0) goto L_0x011d
            java.lang.Long r4 = new java.lang.Long
            long r0 = r0.Y
            r4.<init>(r0)
            goto L_0x011e
        L_0x011d:
            r4 = 0
        L_0x011e:
            r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = ":location/show?lat="
            r1.<init>(r6)
            r1.append(r13)
            java.lang.String r6 = "&lon="
            r1.append(r6)
            r1.append(r11)
            java.lang.String r6 = "&z="
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = "&msg_id="
            hr1.s(r1, r2, r7, r5)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            if (r4 == 0) goto L_0x015f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "&sender_id="
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L_0x015f:
            java.lang.String r0 = r0.toString()
            defpackage.rf0.j(r0, r3)
            goto L_0x0462
        L_0x0168:
            r15 = r12
            boolean r7 = r5 instanceof defpackage.gtd
            if (r7 == 0) goto L_0x019f
            l05 r0 = r13.B1
            bx8 r1 = defpackage.bx8.c
            gtd r5 = (defpackage.gtd) r5
            ktd r3 = r5.a
            long r3 = r3.a
            f19 r5 = r13.b
            long r5 = r5.a
            r1.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = ":stickers/preview?sticker_id="
            r1.<init>(r7)
            r1.append(r3)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "&forward_id="
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            defpackage.rf0.j(r1, r0)
            goto L_0x0462
        L_0x019f:
            boolean r2 = r5 instanceof defpackage.w13
            r7 = 2
            if (r2 == 0) goto L_0x023b
            t0c r0 = r13.r1
            zqd r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            i22 r0 = (defpackage.i22) r0
            if (r0 == 0) goto L_0x023a
            b29 r2 = r13.y()
            long r4 = r0.a
            r10.Y = r4
            r10.Z = r7
            java.lang.Object r0 = r2.a(r8, r10)
            if (r0 != r11) goto L_0x01c1
            return r11
        L_0x01c1:
            r2 = r4
        L_0x01c2:
            vo8 r0 = (defpackage.vo8) r0
            if (r0 == 0) goto L_0x023a
            jj7 r0 = r0.D0
            if (r0 == 0) goto L_0x023a
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x023a
            java.util.Iterator r0 = r0.iterator()
        L_0x01d4:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01ec
            java.lang.Object r4 = r0.next()
            r5 = r4
            o10 r5 = (defpackage.o10) r5
            java.lang.String r5 = r5.q
            java.lang.String r7 = r10.A0
            boolean r5 = hhd.f(r5, r7)
            if (r5 == 0) goto L_0x01d4
            goto L_0x01ed
        L_0x01ec:
            r4 = 0
        L_0x01ed:
            o10 r4 = (defpackage.o10) r4
            if (r4 != 0) goto L_0x01f2
            goto L_0x023a
        L_0x01f2:
            boolean r0 = r4.i()
            java.lang.String r5 = r4.q
            if (r0 != 0) goto L_0x021b
            g10 r0 = r4.n
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x021b
            k77[] r0 = defpackage.zz8.I1
            nve r0 = r13.z()
            f19 r2 = r13.b
            long r2 = r2.a
            r10.Z = r1
            long r7 = r10.z0
            r1 = r2
            r3 = r7
            r7 = r17
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7)
            if (r0 != r11) goto L_0x0462
            return r11
        L_0x021b:
            r0 = 4
            r10.Z = r0
            k77[] r0 = defpackage.zz8.I1
            r6 = 0
            zz8 r0 = r10.y0
            long r7 = r10.z0
            r1 = r2
            r3 = r5
            r4 = r7
            r7 = r17
            java.lang.Object r0 = r0.w(r1, r3, r4, r6, r7)
            if (r0 != r11) goto L_0x0231
            return r11
        L_0x0231:
            sg9 r0 = (defpackage.sg9) r0
            l05 r1 = r13.B1
            defpackage.taf.o(r1, r0)
            goto L_0x0462
        L_0x023a:
            return r15
        L_0x023b:
            boolean r2 = r5 instanceof defpackage.qhd
            if (r2 == 0) goto L_0x02e3
            k77[] r0 = defpackage.zz8.I1
            t97 r0 = r13.U0
            java.lang.Object r0 = r0.getValue()
            sk7 r0 = (defpackage.sk7) r0
            r1 = r5
            qhd r1 = (defpackage.qhd) r1
            long r1 = r1.a
            mv9 r0 = defpackage.sk7.a(r0, r1)
            r1 = 5
            r10.Z = r1
            java.lang.Object r0 = e07.d(r0, r10)
            if (r0 != r11) goto L_0x025c
            return r11
        L_0x025c:
            xm8 r0 = (defpackage.xm8) r0
            vo8 r0 = r0.a
            jj7 r0 = r0.D0
            if (r0 == 0) goto L_0x02e2
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x02e2
            java.util.Iterator r0 = r0.iterator()
        L_0x026e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x028a
            java.lang.Object r1 = r0.next()
            r2 = r1
            o10 r2 = (defpackage.o10) r2
            java.lang.String r2 = r2.q
            r3 = r5
            qhd r3 = (defpackage.qhd) r3
            java.lang.String r3 = r3.b
            boolean r2 = hhd.f(r2, r3)
            if (r2 == 0) goto L_0x026e
            r4 = r1
            goto L_0x028b
        L_0x028a:
            r4 = 0
        L_0x028b:
            o10 r4 = (defpackage.o10) r4
            if (r4 != 0) goto L_0x0290
            goto L_0x02e2
        L_0x0290:
            g10 r0 = r4.n
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x02b3
            k77[] r0 = defpackage.zz8.I1
            nve r0 = r13.z()
            f19 r1 = r13.b
            long r1 = r1.a
            r3 = 6
            r10.Z = r3
            long r7 = r10.z0
            java.lang.String r5 = r4.q
            r3 = r7
            r7 = r17
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7)
            if (r0 != r11) goto L_0x0462
            return r11
        L_0x02b3:
            t0c r0 = r13.r1
            zqd r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            i22 r0 = (defpackage.i22) r0
            if (r0 == 0) goto L_0x02e2
            qhd r5 = (defpackage.qhd) r5
            java.lang.String r3 = r5.b
            r1 = 7
            r10.Z = r1
            r6 = 0
            zz8 r1 = r10.y0
            long r4 = r0.a
            long r7 = r10.z0
            r0 = r1
            r1 = r4
            r4 = r7
            r7 = r17
            java.lang.Object r0 = r0.w(r1, r3, r4, r6, r7)
            if (r0 != r11) goto L_0x02d9
            return r11
        L_0x02d9:
            sg9 r0 = (defpackage.sg9) r0
            l05 r1 = r13.B1
            defpackage.taf.o(r1, r0)
            goto L_0x0462
        L_0x02e2:
            return r15
        L_0x02e3:
            boolean r2 = r5 instanceof defpackage.wid
            if (r2 == 0) goto L_0x0318
            t0c r0 = r13.r1
            zqd r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            i22 r0 = (defpackage.i22) r0
            if (r0 == 0) goto L_0x0317
            wid r5 = (defpackage.wid) r5
            java.lang.String r3 = r5.b
            r1 = 8
            r10.Z = r1
            r6 = 0
            zz8 r1 = r10.y0
            long r4 = r0.a
            long r7 = r10.z0
            r0 = r1
            r1 = r4
            r4 = r7
            r7 = r17
            java.lang.Object r0 = r0.w(r1, r3, r4, r6, r7)
            if (r0 != r11) goto L_0x030e
            return r11
        L_0x030e:
            sg9 r0 = (defpackage.sg9) r0
            l05 r1 = r13.B1
            defpackage.taf.o(r1, r0)
            goto L_0x0462
        L_0x0317:
            return r15
        L_0x0318:
            boolean r2 = r5 instanceof defpackage.h5f
            if (r2 == 0) goto L_0x033c
            t0c r0 = r13.r1
            zqd r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            i22 r0 = (defpackage.i22) r0
            if (r0 != 0) goto L_0x0329
            return r15
        L_0x0329:
            t97 r1 = r13.i1
            java.lang.Object r1 = r1.getValue()
            u5f r1 = (defpackage.u5f) r1
            r2 = 9
            r10.Z = r2
            java.lang.Object r0 = r1.a(r0, r5, r10)
            if (r0 != r11) goto L_0x0462
            return r11
        L_0x033c:
            boolean r2 = r5 instanceof defpackage.pc5
            if (r2 == 0) goto L_0x043d
            t0c r0 = r13.r1
            zqd r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            r12 = r0
            i22 r12 = (defpackage.i22) r12
            if (r12 != 0) goto L_0x0355
            java.lang.String r0 = "File attach click. Can't process click because chat is null"
            java.lang.String r1 = r13.F0
            udd.U(r1, r0)
            return r15
        L_0x0355:
            pc5 r5 = (defpackage.pc5) r5
            oc5 r0 = r5.i
            boolean r0 = r0 instanceof defpackage.nc5
            t97 r2 = r13.X0
            if (r0 == 0) goto L_0x037f
            java.lang.Object r0 = r2.getValue()
            hc5 r0 = (defpackage.hc5) r0
            long r3 = r5.b
            long r6 = r5.a
            java.lang.String r8 = r5.c
            java.lang.String r9 = r5.d
            r1 = 10
            r10.Z = r1
            long r1 = r12.a
            r5 = r6
            r7 = r8
            r8 = r9
            r9 = r17
            java.lang.Object r0 = r0.c(r1, r3, r5, r7, r8, r9)
            if (r0 != r11) goto L_0x0462
            return r11
        L_0x037f:
            zqd r0 = r5.n
            java.lang.Object r4 = r0.getValue()
            boolean r4 = r4 instanceof defpackage.az
            if (r4 != 0) goto L_0x0420
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof defpackage.dz
            if (r0 == 0) goto L_0x0393
            goto L_0x0420
        L_0x0393:
            oc5 r0 = r5.i
            boolean r0 = r0 instanceof defpackage.lc5
            if (r0 == 0) goto L_0x0462
            java.lang.Object r0 = r2.getValue()
            hc5 r0 = (defpackage.hc5) r0
            long r8 = r5.b
            java.lang.String r6 = r5.c
            java.lang.String r14 = r5.d
            java.lang.String r4 = r5.h
            int r2 = r5.j
            int r2 = hr1.t(r2)
            if (r2 == 0) goto L_0x03b7
            if (r2 == r3) goto L_0x03b4
            r16 = r1
            goto L_0x03b9
        L_0x03b4:
            r16 = r7
            goto L_0x03b9
        L_0x03b7:
            r16 = r3
        L_0x03b9:
            r10.w0 = r12
            r1 = 12
            r10.Z = r1
            long r1 = r12.a
            r7 = r4
            r3 = r8
            r5 = r6
            r6 = r14
            r8 = r16
            r9 = r17
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7, r8, r9)
            if (r0 != r11) goto L_0x03d0
            return r11
        L_0x03d0:
            nfa r0 = (defpackage.nfa) r0
            kfa r1 = defpackage.kfa.a
            boolean r1 = hhd.f(r0, r1)
            if (r1 != 0) goto L_0x0462
            boolean r1 = r0 instanceof defpackage.lfa
            if (r1 == 0) goto L_0x03f0
            l05 r1 = r13.B1
            jfa r2 = new jfa
            lfa r0 = (defpackage.lfa) r0
            android.content.Intent r3 = r0.a
            android.net.Uri r0 = r0.b
            r2.<init>(r3, r0)
            defpackage.taf.o(r1, r2)
            goto L_0x0462
        L_0x03f0:
            boolean r1 = r0 instanceof defpackage.mfa
            if (r1 == 0) goto L_0x041a
            l05 r8 = r13.B1
            long r1 = r12.a
            mfa r0 = (defpackage.mfa) r0
            java.lang.String r3 = r0.b
            r10.w0 = r13
            r10.X = r8
            r4 = 13
            r10.Z = r4
            r6 = 1
            long r4 = r0.a
            r0 = r13
            r7 = r17
            java.lang.Object r0 = r0.w(r1, r3, r4, r6, r7)
            if (r0 != r11) goto L_0x0411
            return r11
        L_0x0411:
            k77[] r1 = defpackage.zz8.I1
            r13.getClass()
            defpackage.taf.o(r8, r0)
            goto L_0x0462
        L_0x041a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0420:
            java.lang.Object r0 = r2.getValue()
            hc5 r0 = (defpackage.hc5) r0
            long r3 = r5.b
            long r6 = r5.a
            java.lang.String r8 = r5.c
            r1 = 11
            r10.Z = r1
            long r1 = r12.a
            r5 = r6
            r7 = r8
            r8 = r17
            java.lang.Object r0 = r0.b(r1, r3, r5, r7, r8)
            if (r0 != r11) goto L_0x0462
            return r11
        L_0x043d:
            boolean r1 = r5 instanceof defpackage.rad
            if (r1 == 0) goto L_0x0449
            rad r5 = (defpackage.rad) r5
            java.lang.String r0 = r5.b
            r13.C(r0)
            goto L_0x0462
        L_0x0449:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Didn't handle attach click:"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            udd.q(r0, r1)
        L_0x0462:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy8.o(java.lang.Object):java.lang.Object");
    }
}
