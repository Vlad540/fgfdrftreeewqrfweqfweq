package defpackage;

import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: bp7  reason: default package */
public final class bp7 {
    public static final /* synthetic */ int F = 0;
    public final t97 A;
    public final t97 B;
    public final t97 C;
    public final t97 D;
    public final t97 E;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final t97 i;
    public final t97 j;
    public final t97 k;
    public final t97 l;
    public final t97 m;
    public final t97 n;
    public final t97 o;
    public final t97 p;
    public final t97 q;
    public final t97 r;
    public final t97 s;
    public final t97 t;
    public final t97 u;
    public final t97 v;
    public final t97 w;
    public final t97 x;
    public final t97 y;
    public final t97 z;

    public bp7(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978, t97 t979, t97 t9710, t97 t9711, t97 t9712, t97 t9713, t97 t9714, t97 t9715, t97 t9716, t97 t9717, t97 t9718, t97 t9719, t97 t9720, t97 t9721, t97 t9722, t97 t9723, t97 t9724, t97 t9725, t97 t9726, t97 t9727, t97 t9728, t97 t9729, t97 t9730, t97 t9731) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = t976;
        this.g = t977;
        this.h = t978;
        this.i = t979;
        this.j = t9710;
        this.k = t9711;
        this.l = t9712;
        this.m = t9713;
        this.n = t9714;
        this.o = t9715;
        this.p = t9716;
        this.q = t9717;
        this.r = t9718;
        this.s = t9719;
        this.t = t9720;
        this.u = t9721;
        this.v = t9722;
        this.w = t9723;
        this.x = t9724;
        this.y = t9725;
        this.z = t9726;
        this.A = t9727;
        this.B = t9728;
        this.C = t9729;
        this.D = t9730;
        this.E = t9731;
    }

    public static final long a(k7c k7c) {
        int i2 = zp4.o;
        long Q = mt0.Q(System.nanoTime(), eq4.b);
        long g2 = zp4.g(Q, k7c.a);
        k7c.a = Q;
        return g2;
    }

    public final gj b() {
        return (gj) this.D.getValue();
    }

    public final w10 c() {
        return (w10) this.t.getValue();
    }

    public final jq1 d() {
        return (jq1) this.B.getValue();
    }

    public final t52 e() {
        return (t52) this.h.getValue();
    }

    public final rf4 f() {
        return (rf4) this.d.getValue();
    }

    public final l95 g() {
        return (l95) this.x.getValue();
    }

    public final in7 h() {
        return (in7) this.E.getValue();
    }

    public final u98 i() {
        return (u98) this.o.getValue();
    }

    public final r59 j() {
        return (r59) this.z.getValue();
    }

    public final noa k() {
        return (noa) this.r.getValue();
    }

    public final xoa l() {
        return (xoa) this.s.getValue();
    }

    public final g2b m() {
        return (g2b) this.c.getValue();
    }

    public final q2b n() {
        return (q2b) this.k.getValue();
    }

    public final g4b o() {
        return (g4b) this.y.getValue();
    }

    public final luf p() {
        return (luf) this.l.getValue();
    }

    public final void q(jo7 jo7, long j2) {
        long j3;
        jo7 jo72;
        bp7 bp7;
        long j4 = ((j2b) m()).a.g.getLong("app.last.chat.marker", 0);
        Long valueOf = Long.valueOf(j4);
        if (j4 == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            j3 = valueOf.longValue();
            jo72 = jo7;
        } else {
            jo72 = jo7;
            j3 = Long.MAX_VALUE;
        }
        long j5 = jo72.z0;
        Long valueOf2 = Long.valueOf(j5);
        if (j5 == 0) {
            valueOf2 = null;
        }
        long min = Math.min(j3, valueOf2 != null ? valueOf2.longValue() : Long.MAX_VALUE);
        if (min != Long.MAX_VALUE && min > 0) {
            fn6 fn6 = udd.e;
            if (fn6 == null) {
                bp7 = this;
                long j6 = j2;
            } else {
                if (fn6.c()) {
                    tn7 tn7 = tn7.X;
                    yzc yzc = ((j2b) m()).b;
                    yzc.getClass();
                    StringBuilder k2 = hr1.k(min, "api.chatsList(", ", ");
                    k2.append(j2);
                    k2.append(", ");
                    k2.append((int) yzc.o(PmsKey.f21chatspagesize, (long) 50));
                    k2.append(")");
                    fn6.d(tn7, "bp7", k2.toString(), (Throwable) null);
                } else {
                    long j7 = j2;
                }
                bp7 = this;
            }
            yzc yzc2 = ((j2b) m()).b;
            yzc2.getClass();
            gy9 gy9 = (gy9) ((pk) bp7.a.getValue());
            sce.d(gy9.A(), new iq2((int) yzc2.o(PmsKey.f21chatspagesize, (long) 50), ((j2b) gy9.z()).a.n(), min, j2), false, 0, 12);
        }
    }

    public final void r() {
        long j2;
        i03 i03 = ((j2b) m()).a;
        long j3 = i03.g.getLong("app.reset.at.time", 0);
        String f2 = ((zy9) this.b.getValue()).f();
        long m2 = i03.m();
        if (j3 <= 0 || j3 >= m2 || f2 == null || f2.length() == 0) {
            gy9 gy9 = (gy9) ((pk) this.a.getValue());
            j2b j2b = (j2b) gy9.z();
            i03 i032 = j2b.a;
            long o2 = i032.o();
            long j4 = i032.g.getLong("user.contactsLastSync", 0);
            long e2 = i032.e("user.presenceLastSync", 0);
            String name = gy9.class.getName();
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                String T = ez3.T(Long.valueOf(o2));
                String T2 = ez3.T(Long.valueOf(j4));
                String T3 = ez3.T(Long.valueOf(e2));
                StringBuilder j5 = c3d.j("LoginTamTask: chatsLastSync = ", T, ", contactLastSync = ", T2, ", presenceLastSync = ");
                j5.append(T3);
                fn6.d(tn7, name, j5.toString(), (Throwable) null);
            }
            String v2 = j2b.b.v(uqc.a, (String) null);
            if (j2b.b.g.getInt(ClientCookie.VERSION_ATTR, 1) < 6) {
                j2b.b.j(6, ClientCookie.VERSION_ATTR);
                v2 = null;
                j2 = 0;
            } else {
                j2 = o2;
            }
            long n2 = ((j2b) gy9.z()).a.n();
            String f3 = ((zy9) gy9.d.getValue()).f();
            if (f3 != null) {
                gy9.v(gy9, new go7(n2, f3, j2, j4, e2, v2, i032.g.getLong("user.callsLastSync", 0), i032.g.getLong("app.last.login.time", 0), i032.g.getLong("user.draftsLastSync", -1)));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        fn6 fn62 = udd.e;
        if (fn62 != null && fn62.c()) {
            tn7 tn72 = tn7.X;
            StringBuilder k2 = hr1.k(j3, "Drop cache: resetAt=", ", lastLogin=");
            k2.append(m2);
            fn62.d(tn72, "bp7", k2.toString(), (Throwable) null);
        }
        ((pae) this.A.getValue()).b().dispatch(bw4.a, new eq6(4, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: i03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v13, resolved type: i03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: i03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v61, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v14, resolved type: i03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v15, resolved type: i03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v63, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: i03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: i03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: i03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v74, resolved type: i03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v40, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v75, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: i03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v49, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v51, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v52, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v80, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v94, resolved type: i03} */
    /* JADX WARNING: type inference failed for: r9v32, types: [k7c, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x036a A[SYNTHETIC, Splitter:B:127:0x036a] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0547 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0652  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0752  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0754  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0771  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0797  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0799  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x07b6  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x08c1  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x08ca  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x08f5  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x093a  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0978  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x098a  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x098d  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x09c8  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0a64  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0a73  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x096b A[EDGE_INSN: B:410:0x096b->B:341:0x096b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(long r35, defpackage.jo7 r37, long r38, kotlin.coroutines.Continuation r40) {
        /*
            r34 = this;
            r1 = r34
            r2 = r37
            r3 = r38
            r0 = r40
            r5 = 3
            r6 = 1
            boolean r7 = r0 instanceof defpackage.yo7
            if (r7 == 0) goto L_0x001d
            r7 = r0
            yo7 r7 = (defpackage.yo7) r7
            int r8 = r7.F0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8 & r9
            if (r10 == 0) goto L_0x001d
            int r8 = r8 - r9
            r7.F0 = r8
            goto L_0x0022
        L_0x001d:
            yo7 r7 = new yo7
            r7.<init>(r1, r0)
        L_0x0022:
            java.lang.Object r0 = r7.D0
            pu3 r8 = pu3.a
            int r9 = r7.F0
            r11 = 2
            java.lang.String r12 = "bp7"
            java.lang.String r14 = "onLogin#21("
            java.lang.String r15 = "onLogin#5.5("
            r16 = r14
            if (r9 == 0) goto L_0x00d9
            if (r9 == r6) goto L_0x0096
            if (r9 == r11) goto L_0x0066
            if (r9 != r5) goto L_0x005e
            int r1 = r7.C0
            long r2 = r7.z0
            boolean r4 = r7.B0
            long r8 = r7.y0
            long r13 = r7.x0
            zb9 r5 = r7.w0
            f03 r15 = r7.Z
            k7c r11 = r7.Y
            jo7 r10 = r7.X
            bp7 r7 = r7.o
            wx3.H(r0)
            r0 = r7
            r19 = r10
            r6 = r12
            r7 = r16
            r31 = r2
            r2 = r11
            r10 = r31
            r3 = 0
            goto L_0x0932
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0066:
            int r1 = r7.C0
            long r2 = r7.A0
            boolean r4 = r7.B0
            long r9 = r7.z0
            long r13 = r7.y0
            long r5 = r7.x0
            zb9 r15 = r7.w0
            f03 r11 = r7.Z
            r34 = r1
            k7c r1 = r7.Y
            r35 = r1
            jo7 r1 = r7.X
            r36 = r1
            bp7 r1 = r7.o
            wx3.H(r0)
            r0 = r1
            r21 = r4
            r4 = r5
            r20 = r8
            r22 = r9
            r6 = r12
            r1 = r34
            r12 = r35
            r10 = r36
            goto L_0x055c
        L_0x0096:
            int r1 = r7.C0
            long r2 = r7.A0
            boolean r4 = r7.B0
            long r5 = r7.z0
            long r9 = r7.y0
            long r13 = r7.x0
            f03 r11 = r7.Z
            r34 = r1
            k7c r1 = r7.Y
            r35 = r1
            jo7 r1 = r7.X
            r36 = r1
            bp7 r1 = r7.o
            wx3.H(r0)     // Catch:{ all -> 0x00c4 }
            r22 = r5
            r20 = r11
            r6 = r12
            r5 = r34
            r11 = r2
            r3 = r36
            r2 = r1
            r1 = r8
            r8 = r4
            r4 = r35
            goto L_0x035d
        L_0x00c4:
            r0 = move-exception
            r20 = r0
            r22 = r5
            r5 = r11
            r6 = r12
            r11 = r9
            r10 = r34
            r9 = r35
            r34 = r1
            r1 = r8
            r8 = r4
            r3 = r2
            r2 = r36
            goto L_0x0402
        L_0x00d9:
            wx3.H(r0)
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x00e1
            goto L_0x0109
        L_0x00e1:
            boolean r5 = r0.c()
            if (r5 == 0) goto L_0x0109
            tn7 r5 = defpackage.tn7.X
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r3)
            java.lang.String r6 = ez3.T(r6)
            long r9 = r2.z0
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            java.lang.String r9 = ez3.T(r11)
            java.lang.String r10 = "onLogin#1: start, chatsLastSync = "
            java.lang.String r11 = ", chatMarker = "
            java.lang.String r6 = defpackage.me4.j(r10, r6, r11, r9)
            r9 = 0
            r0.d(r5, r12, r6, r9)
        L_0x0109:
            int r0 = zp4.o
            long r5 = java.lang.System.nanoTime()
            eq4 r0 = eq4.b
            long r5 = mt0.Q(r5, r0)
            k7c r9 = new k7c
            r9.<init>()
            r9.a = r5
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x0123
        L_0x0120:
            r20 = r8
            goto L_0x0156
        L_0x0123:
            boolean r10 = r0.c()
            if (r10 == 0) goto L_0x0120
            tn7 r10 = defpackage.tn7.X
            long r13 = a(r9)
            java.lang.String r11 = zp4.j(r13)
            ra3 r13 = r2.x0
            if (r13 == 0) goto L_0x0139
            r13 = 1
            goto L_0x013a
        L_0x0139:
            r13 = 0
        L_0x013a:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r20 = r8
            java.lang.String r8 = "onLogin#2("
            r14.<init>(r8)
            r14.append(r11)
            java.lang.String r8 = "): notifConfigLogic.onConfiguration with config="
            r14.append(r8)
            r14.append(r13)
            java.lang.String r8 = r14.toString()
            r11 = 0
            r0.d(r10, r12, r8, r11)
        L_0x0156:
            ra3 r0 = r2.x0
            if (r0 == 0) goto L_0x0166
            t97 r8 = r1.m
            java.lang.Object r8 = r8.getValue()
            pl9 r8 = (defpackage.pl9) r8
            r10 = 1
            r8.b(r0, r10)
        L_0x0166:
            rf4 r0 = r34.f()
            boolean r8 = r0.d()
            java.lang.String r0 = r2.Z
            fn6 r10 = udd.e
            if (r10 != 0) goto L_0x0179
        L_0x0174:
            r22 = r5
            r21 = r8
            goto L_0x01a8
        L_0x0179:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x0174
            tn7 r11 = defpackage.tn7.X
            long r13 = a(r9)
            java.lang.String r13 = zp4.j(r13)
            tzc r14 = defpackage.cqc.Y
            r14.getClass()
            if (r0 == 0) goto L_0x0197
            java.lang.String r14 = h2g.s(r0)
            r21 = r8
            goto L_0x019a
        L_0x0197:
            r21 = r8
            r14 = 0
        L_0x019a:
            java.lang.String r8 = "onLogin#3("
            r22 = r5
            java.lang.String r5 = "): updateToken="
            java.lang.String r5 = defpackage.me4.j(r8, r13, r5, r14)
            r6 = 0
            r10.d(r11, r12, r5, r6)
        L_0x01a8:
            if (r0 == 0) goto L_0x01bd
            int r5 = r0.length()
            if (r5 != 0) goto L_0x01b1
            goto L_0x01bd
        L_0x01b1:
            t97 r5 = r1.b
            java.lang.Object r5 = r5.getValue()
            zy9 r5 = (defpackage.zy9) r5
            r6 = 0
            r5.h(r0, r6)
        L_0x01bd:
            g2b r0 = r34.m()
            j2b r0 = (defpackage.j2b) r0
            i03 r5 = r0.a
            uj3 r0 = r2.c
            if (r0 == 0) goto L_0x01d3
            long r10 = r0.a
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r10)
            r5.A(r0)
        L_0x01d3:
            long r13 = r2.w0
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r13 - r10
            r5.z(r10)
            long r10 = r2.C0
            r17 = 0
            int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e9
            r5.y(r10)
        L_0x01e9:
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x01ef
            r6 = 1
            goto L_0x01f0
        L_0x01ef:
            r6 = 0
        L_0x01f0:
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x01f7
        L_0x01f4:
            r24 = r13
            goto L_0x0226
        L_0x01f7:
            boolean r8 = r0.c()
            if (r8 == 0) goto L_0x01f4
            tn7 r8 = defpackage.tn7.X
            long r10 = a(r9)
            java.lang.String r10 = zp4.j(r10)
            r24 = r13
            r11 = 1
            r13 = r6 ^ 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r14 = "onLogin#4("
            r11.<init>(r14)
            r11.append(r10)
            java.lang.String r10 = "): attachmentsReadyLogic="
            r11.append(r10)
            r11.append(r13)
            java.lang.String r10 = r11.toString()
            r11 = 0
            r0.d(r8, r12, r10, r11)
        L_0x0226:
            if (r6 != 0) goto L_0x022f
            w10 r0 = r34.c()
            r0.c()
        L_0x022f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            uj3 r10 = r2.c
            if (r10 == 0) goto L_0x0240
            r0.add(r10)
        L_0x0240:
            java.util.ArrayList r10 = r37.c()
            java.util.Iterator r10 = r10.iterator()
        L_0x0248:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0271
            java.lang.Object r11 = r10.next()
            uj3 r11 = (defpackage.uj3) r11
            ln3 r13 = r11.w0
            r14 = -1
            if (r13 != 0) goto L_0x025b
            r13 = r14
            goto L_0x0263
        L_0x025b:
            int[] r26 = defpackage.xo7.$EnumSwitchMapping$0
            int r13 = r13.ordinal()
            r13 = r26[r13]
        L_0x0263:
            if (r13 == r14) goto L_0x026d
            r14 = 1
            if (r13 == r14) goto L_0x0269
            goto L_0x0248
        L_0x0269:
            r8.add(r11)
            goto L_0x0248
        L_0x026d:
            r0.add(r11)
            goto L_0x0248
        L_0x0271:
            fn6 r10 = udd.e
            if (r10 != 0) goto L_0x0278
        L_0x0275:
            r26 = r6
            goto L_0x02a8
        L_0x0278:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x0275
            tn7 r11 = defpackage.tn7.X
            long r13 = a(r9)
            java.lang.String r13 = zp4.j(r13)
            int r14 = r0.size()
            r26 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r3 = "onLogin#5("
            r6.<init>(r3)
            r6.append(r13)
            java.lang.String r3 = "): ContactsController.onLogin contactsSize="
            r6.append(r3)
            r6.append(r14)
            java.lang.String r3 = r6.toString()
            r4 = 0
            r10.d(r11, r12, r3, r4)
        L_0x02a8:
            t97 r3 = r1.j
            java.lang.Object r3 = r3.getValue()
            di3 r3 = (defpackage.di3) r3
            r3.p(r0)
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x02b8
            goto L_0x02e6
        L_0x02b8:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x02e6
            tn7 r3 = defpackage.tn7.X
            long r10 = a(r9)
            java.lang.String r4 = zp4.j(r10)
            int r6 = r8.size()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "onLogin#5.1("
            r10.<init>(r11)
            r10.append(r4)
            java.lang.String r4 = "): ContactsController.storeRemovedContactsFromServer contactsSize="
            r10.append(r4)
            r10.append(r6)
            java.lang.String r4 = r10.toString()
            r6 = 0
            r0.d(r3, r12, r4, r6)
        L_0x02e6:
            t97 r0 = r1.j
            java.lang.Object r0 = r0.getValue()
            di3 r0 = (defpackage.di3) r0
            r0.v(r8)
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x02f6
            goto L_0x0310
        L_0x02f6:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x0310
            tn7 r3 = defpackage.tn7.X
            long r10 = a(r9)
            java.lang.String r4 = zp4.j(r10)
            java.lang.String r6 = "): loadMissedContactsUseCase is started"
            java.lang.String r4 = defpackage.wn6.i(r15, r4, r6)
            r6 = 0
            r0.d(r3, r12, r4, r6)
        L_0x0310:
            r59 r0 = r34.j()     // Catch:{ all -> 0x03f5 }
            int r3 = zp4.o     // Catch:{ all -> 0x03f5 }
            eq4 r3 = eq4.o     // Catch:{ all -> 0x03f5 }
            r4 = 3
            long r13 = mt0.P(r4, r3)     // Catch:{ all -> 0x03f5 }
            r7.o = r1     // Catch:{ all -> 0x03f5 }
            r7.X = r2     // Catch:{ all -> 0x03f5 }
            r7.Y = r9     // Catch:{ all -> 0x03f5 }
            r7.Z = r5     // Catch:{ all -> 0x03f5 }
            r3 = r35
            r7.x0 = r3     // Catch:{ all -> 0x03f5 }
            r6 = r12
            r11 = r38
            r7.y0 = r11     // Catch:{ all -> 0x03f3 }
            r3 = r22
            r7.z0 = r3     // Catch:{ all -> 0x03eb }
            r8 = r21
            r7.B0 = r8     // Catch:{ all -> 0x03e3 }
            r22 = r3
            r3 = r24
            r7.A0 = r3     // Catch:{ all -> 0x03dd }
            r10 = r26
            r7.C0 = r10     // Catch:{ all -> 0x03d5 }
            r1 = 1
            r7.F0 = r1     // Catch:{ all -> 0x03d5 }
            java.lang.Object r0 = r0.p(r2, r13, r7)     // Catch:{ all -> 0x03d5 }
            r1 = r20
            if (r0 != r1) goto L_0x034c
            return r1
        L_0x034c:
            r13 = r35
            r20 = r5
            r5 = r10
            r31 = r2
            r2 = r34
            r32 = r3
            r3 = r31
            r4 = r9
            r9 = r11
            r11 = r32
        L_0x035d:
            fn6 r0 = udd.e     // Catch:{ all -> 0x03cd }
            if (r0 != 0) goto L_0x036a
        L_0x0361:
            r34 = r2
            r35 = r3
            r36 = r4
            r37 = r5
            goto L_0x03b9
        L_0x036a:
            boolean r21 = r0.c()     // Catch:{ all -> 0x03c9 }
            if (r21 == 0) goto L_0x0361
            r34 = r2
            tn7 r2 = defpackage.tn7.X     // Catch:{ all -> 0x03b5 }
            long r24 = a(r4)     // Catch:{ all -> 0x03b5 }
            r35 = r3
            java.lang.String r3 = zp4.j(r24)     // Catch:{ all -> 0x03b1 }
            r36 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            r4.<init>()     // Catch:{ all -> 0x03ad }
            r37 = r5
            java.lang.String r5 = "onLogin#5.x5("
            r4.append(r5)     // Catch:{ all -> 0x03ab }
            r4.append(r3)     // Catch:{ all -> 0x03ab }
            java.lang.String r3 = "): loadMissedContactsUseCase is ended"
            r4.append(r3)     // Catch:{ all -> 0x03ab }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x03ab }
            r4 = 0
            r0.d(r2, r6, r3, r4)     // Catch:{ all -> 0x03ab }
            goto L_0x03b9
        L_0x039d:
            r2 = r35
            r3 = r11
            r5 = r20
            r20 = r0
            r11 = r9
            r9 = r36
            r10 = r37
            goto L_0x0402
        L_0x03ab:
            r0 = move-exception
            goto L_0x039d
        L_0x03ad:
            r0 = move-exception
        L_0x03ae:
            r37 = r5
            goto L_0x039d
        L_0x03b1:
            r0 = move-exception
        L_0x03b2:
            r36 = r4
            goto L_0x03ae
        L_0x03b5:
            r0 = move-exception
        L_0x03b6:
            r35 = r3
            goto L_0x03b2
        L_0x03b9:
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r0 = r20
            r20 = r11
        L_0x03c5:
            r11 = r22
            goto L_0x043d
        L_0x03c9:
            r0 = move-exception
            r34 = r2
            goto L_0x03b6
        L_0x03cd:
            r0 = move-exception
            r34 = r2
            r35 = r3
            r36 = r4
            goto L_0x03ae
        L_0x03d5:
            r0 = move-exception
            r1 = r20
        L_0x03d8:
            r13 = r35
            r20 = r0
            goto L_0x0402
        L_0x03dd:
            r0 = move-exception
            r1 = r20
        L_0x03e0:
            r10 = r26
            goto L_0x03d8
        L_0x03e3:
            r0 = move-exception
            r22 = r3
            r1 = r20
        L_0x03e8:
            r3 = r24
            goto L_0x03e0
        L_0x03eb:
            r0 = move-exception
            r22 = r3
        L_0x03ee:
            r1 = r20
            r8 = r21
            goto L_0x03e8
        L_0x03f3:
            r0 = move-exception
            goto L_0x03ee
        L_0x03f5:
            r0 = move-exception
            r6 = r12
            r1 = r20
            r8 = r21
            r3 = r24
            r10 = r26
            r11 = r38
            goto L_0x03d8
        L_0x0402:
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x040d
        L_0x0406:
            r35 = r2
            r36 = r3
            r38 = r5
            goto L_0x0431
        L_0x040d:
            boolean r21 = r0.c()
            if (r21 == 0) goto L_0x0406
            r35 = r2
            tn7 r2 = defpackage.tn7.w0
            long r24 = a(r9)
            r36 = r3
            java.lang.String r3 = zp4.j(r24)
            java.lang.String r4 = jjd.Q(r20)
            r38 = r5
            java.lang.String r5 = "): loadMissedContactsUseCase is ended "
            java.lang.String r3 = defpackage.me4.j(r15, r3, r5, r4)
            r4 = 0
            r0.d(r2, r6, r3, r4)
        L_0x0431:
            r2 = r34
            r3 = r35
            r20 = r36
            r0 = r38
            r4 = r9
            r5 = r10
            r9 = r11
            goto L_0x03c5
        L_0x043d:
            fn6 r15 = udd.e
            if (r15 != 0) goto L_0x044a
        L_0x0441:
            r22 = r1
            r25 = r5
            r23 = r8
            r34 = r11
            goto L_0x0482
        L_0x044a:
            boolean r22 = r15.c()
            if (r22 == 0) goto L_0x0441
            r22 = r1
            tn7 r1 = defpackage.tn7.X
            long r23 = a(r4)
            r25 = r5
            java.lang.String r5 = zp4.j(r23)
            r23 = r8
            java.util.List r8 = r3.o
            int r8 = r8.size()
            r34 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "onLogin#6("
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r5 = "): ChatsController.storeChatsFromServer chatsSize="
            r11.append(r5)
            r11.append(r8)
            java.lang.String r5 = r11.toString()
            r8 = 0
            r15.d(r1, r6, r5, r8)
        L_0x0482:
            t52 r1 = r2.e()
            java.util.List r5 = r3.o
            ra3 r8 = r3.x0
            if (r8 == 0) goto L_0x048f
            java.util.Map r8 = r8.c
            goto L_0x0490
        L_0x048f:
            r8 = 0
        L_0x0490:
            zb9 r1 = r1.d0(r5, r8)
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x049b
        L_0x0498:
            r36 = r9
            goto L_0x04d3
        L_0x049b:
            boolean r8 = r5.c()
            if (r8 == 0) goto L_0x0498
            tn7 r8 = defpackage.tn7.X
            long r11 = a(r4)
            java.lang.String r11 = zp4.j(r11)
            ra3 r12 = r3.x0
            if (r12 == 0) goto L_0x04b1
            r12 = 1
            goto L_0x04b2
        L_0x04b1:
            r12 = 0
        L_0x04b2:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r36 = r9
            java.lang.String r9 = "onLogin#7("
            r15.<init>(r9)
            r15.append(r11)
            java.lang.String r9 = "): notifConfigLogic.onChatsAndFolders with config="
            r15.append(r9)
            r15.append(r12)
            java.lang.String r9 = "}"
            r15.append(r9)
            java.lang.String r9 = r15.toString()
            r10 = 0
            r5.d(r8, r6, r9, r10)
        L_0x04d3:
            ra3 r5 = r3.x0
            if (r5 == 0) goto L_0x04e2
            t97 r8 = r2.m
            java.lang.Object r8 = r8.getValue()
            pl9 r8 = (defpackage.pl9) r8
            r8.a(r5, r1)
        L_0x04e2:
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x04e7
            goto L_0x0517
        L_0x04e7:
            boolean r8 = r5.c()
            if (r8 == 0) goto L_0x0517
            tn7 r8 = defpackage.tn7.X
            long r9 = a(r4)
            java.lang.String r9 = zp4.j(r9)
            java.util.Map r10 = r3.y0
            int r10 = r10.size()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "onLogin#8("
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = "): updateMessages with size="
            r11.append(r9)
            r11.append(r10)
            java.lang.String r9 = r11.toString()
            r10 = 0
            r5.d(r8, r6, r9, r10)
        L_0x0517:
            java.util.Map r5 = r3.y0
            r7.o = r2
            r7.X = r3
            r7.Y = r4
            r7.Z = r0
            r7.w0 = r1
            r7.x0 = r13
            r9 = r36
            r7.y0 = r9
            r11 = r34
            r7.z0 = r11
            r8 = r23
            r7.B0 = r8
            r15 = r0
            r34 = r1
            r0 = r20
            r7.A0 = r0
            r0 = r25
            r7.C0 = r0
            r1 = 2
            r7.F0 = r1
            java.lang.Object r1 = r2.v(r5, r7)
            r5 = r22
            if (r1 != r5) goto L_0x0548
            return r5
        L_0x0548:
            r1 = r0
            r0 = r2
            r22 = r11
            r11 = r15
            r15 = r34
            r12 = r4
            r31 = r9
            r10 = r3
            r2 = r20
            r20 = r5
            r21 = r8
            r4 = r13
            r13 = r31
        L_0x055c:
            fn6 r8 = udd.e
            if (r8 != 0) goto L_0x0565
        L_0x0560:
            r34 = r4
            r24 = r7
            goto L_0x0585
        L_0x0565:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x0560
            tn7 r9 = defpackage.tn7.X
            long r24 = a(r12)
            r34 = r4
            java.lang.String r4 = zp4.j(r24)
            java.lang.String r5 = "onLogin#9("
            r24 = r7
            java.lang.String r7 = "): PresenceController.onLogin"
            java.lang.String r4 = defpackage.wn6.i(r5, r4, r7)
            r5 = 0
            r8.d(r9, r6, r4, r5)
        L_0x0585:
            q2b r4 = r0.n()
            java.util.Map r5 = r10.Y
            java.util.HashMap r5 = defpackage.fu7.n(r5)
            r4.i(r5, r2)
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x0597
            goto L_0x05b3
        L_0x0597:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x05b3
            tn7 r5 = defpackage.tn7.X
            long r7 = a(r12)
            java.lang.String r7 = zp4.j(r7)
            java.lang.String r8 = "onLogin#11("
            java.lang.String r9 = "): loadChatsIfNeed"
            java.lang.String r7 = defpackage.wn6.i(r8, r7, r9)
            r8 = 0
            r4.d(r5, r6, r7, r8)
        L_0x05b3:
            r0.q(r10, r13)
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x05bb
            goto L_0x05d7
        L_0x05bb:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x05d7
            tn7 r5 = defpackage.tn7.X
            long r7 = a(r12)
            java.lang.String r7 = zp4.j(r7)
            java.lang.String r8 = "onLogin#12("
            java.lang.String r9 = "): processDraftNewsUseCase"
            java.lang.String r7 = defpackage.wn6.i(r8, r7, r9)
            r8 = 0
            r4.d(r5, r6, r7, r8)
        L_0x05d7:
            g4b r4 = r0.o()
            pm4 r5 = r10.D0
            long r7 = r10.w0
            r4.a(r5, r7)
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x05e7
            goto L_0x0603
        L_0x05e7:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0603
            tn7 r5 = defpackage.tn7.X
            long r7 = a(r12)
            java.lang.String r7 = zp4.j(r7)
            java.lang.String r8 = "onLogin#13("
            java.lang.String r9 = "): ServiceTaskTransmitTamTasks.execute"
            java.lang.String r7 = defpackage.wn6.i(r8, r7, r9)
            r8 = 0
            r4.d(r5, r6, r7, r8)
        L_0x0603:
            luf r4 = r0.p()
            defpackage.o1d.y(r4)
            rf4 r4 = r0.f()
            tf4 r4 = (defpackage.tf4) r4
            ezd r4 = r4.g
            fb6 r4 = (defpackage.fb6) r4
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x062c
            java.lang.String r4 = "update push token on server"
            udd.q(r6, r4)
            t97 r4 = r0.a
            java.lang.Object r4 = r4.getValue()
            pk r4 = (defpackage.pk) r4
            gy9 r4 = (defpackage.gy9) r4
            r4.s()
        L_0x062c:
            boolean r4 = h2g.c
            java.lang.String r5 = "onLogin#14("
            if (r4 == 0) goto L_0x0652
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x0637
            goto L_0x067d
        L_0x0637:
            boolean r7 = r4.c()
            if (r7 == 0) goto L_0x067d
            tn7 r7 = defpackage.tn7.X
            long r8 = a(r12)
            java.lang.String r8 = zp4.j(r8)
            java.lang.String r9 = "): phonebook already checked"
            java.lang.String r5 = defpackage.wn6.i(r5, r8, r9)
            r8 = 0
            r4.d(r7, r6, r5, r8)
            goto L_0x067d
        L_0x0652:
            r4 = 1
            h2g.c = r4
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x065a
            goto L_0x0674
        L_0x065a:
            boolean r7 = r4.c()
            if (r7 == 0) goto L_0x0674
            tn7 r7 = defpackage.tn7.X
            long r8 = a(r12)
            java.lang.String r8 = zp4.j(r8)
            java.lang.String r9 = "): phonebook.checkUpdates()"
            java.lang.String r5 = defpackage.wn6.i(r5, r8, r9)
            r8 = 0
            r4.d(r7, r6, r5, r8)
        L_0x0674:
            noa r4 = r0.k()
            voa r4 = (defpackage.voa) r4
            r4.c()
        L_0x067d:
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x0682
            goto L_0x069e
        L_0x0682:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x069e
            tn7 r5 = defpackage.tn7.X
            long r7 = a(r12)
            java.lang.String r7 = zp4.j(r7)
            java.lang.String r8 = "onLogin#15("
            java.lang.String r9 = "): phonebookSyncService.sync()"
            java.lang.String r7 = defpackage.wn6.i(r8, r7, r9)
            r8 = 0
            r4.d(r5, r6, r7, r8)
        L_0x069e:
            xoa r4 = r0.l()
            r4.c()
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x06aa
            goto L_0x06c6
        L_0x06aa:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x06c6
            tn7 r5 = defpackage.tn7.X
            long r7 = a(r12)
            java.lang.String r7 = zp4.j(r7)
            java.lang.String r8 = "onLogin#16("
            java.lang.String r9 = "): updateStickers"
            java.lang.String r7 = defpackage.wn6.i(r8, r7, r9)
            r8 = 0
            r4.d(r5, r6, r7, r8)
        L_0x06c6:
            u98 r4 = r0.i()
            r4.getClass()
            t97 r4 = r0.a
            java.lang.Object r4 = r4.getValue()
            pk r4 = (defpackage.pk) r4
            r5 = r11
            lqc r5 = (defpackage.lqc) r5
            long r7 = r5.r()
            gy9 r4 = (defpackage.gy9) r4
            r5 = 2
            r4.g(r5, r7)
            l95 r4 = r0.g()
            r4.i()
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x06ee
            goto L_0x070a
        L_0x06ee:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x070a
            tn7 r5 = defpackage.tn7.X
            long r7 = a(r12)
            java.lang.String r7 = zp4.j(r7)
            java.lang.String r8 = "onLogin#17("
            java.lang.String r9 = "): updateReactions"
            java.lang.String r7 = defpackage.wn6.i(r8, r7, r9)
            r8 = 0
            r4.d(r5, r6, r7, r8)
        L_0x070a:
            gj r4 = r0.b()
            r4.k()
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x0716
            goto L_0x0732
        L_0x0716:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0732
            tn7 r5 = defpackage.tn7.X
            long r7 = a(r12)
            java.lang.String r7 = zp4.j(r7)
            java.lang.String r8 = "onLogin#18("
            java.lang.String r9 = "): callsCredRepository.fetchTokenAsync()"
            java.lang.String r7 = defpackage.wn6.i(r8, r7, r9)
            r8 = 0
            r4.d(r5, r6, r7, r8)
        L_0x0732:
            jq1 r4 = r0.d()
            mq1 r4 = (mq1) r4
            r4.b()
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x0740
            goto L_0x076f
        L_0x0740:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x076f
            tn7 r5 = defpackage.tn7.X
            long r7 = a(r12)
            java.lang.String r7 = zp4.j(r7)
            if (r1 != 0) goto L_0x0754
            r8 = 1
            goto L_0x0755
        L_0x0754:
            r8 = 0
        L_0x0755:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r13 = "onLogin#19("
            r9.<init>(r13)
            r9.append(r7)
            java.lang.String r7 = "): analytics.logSkippedPushes="
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            r8 = 0
            r4.d(r5, r6, r7, r8)
        L_0x076f:
            if (r1 != 0) goto L_0x0780
            t97 r4 = r0.g
            java.lang.Object r4 = r4.getValue()
            bd r4 = (defpackage.bd) r4
            rf4 r5 = r0.f()
            r4.c(r10, r11, r5)
        L_0x0780:
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x0785
            goto L_0x07b4
        L_0x0785:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x07b4
            tn7 r5 = defpackage.tn7.X
            long r7 = a(r12)
            java.lang.String r7 = zp4.j(r7)
            if (r1 != 0) goto L_0x0799
            r8 = 1
            goto L_0x079a
        L_0x0799:
            r8 = 0
        L_0x079a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r13 = "onLogin#20("
            r9.<init>(r13)
            r9.append(r7)
            java.lang.String r7 = "): notificationsListener.cancelServerChatId="
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            r8 = 0
            r4.d(r5, r6, r7, r8)
        L_0x07b4:
            if (r1 != 0) goto L_0x08a7
            long[] r4 = r15.b
            long[] r5 = r15.a
            int r7 = r5.length
            r8 = 2
            int r7 = r7 - r8
            if (r7 < 0) goto L_0x08a7
            r8 = 0
        L_0x07c0:
            r13 = r5[r8]
            r25 = r2
            long r2 = ~r13
            r9 = 7
            long r2 = r2 << r9
            long r2 = r2 & r13
            r27 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r27
            int r2 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r2 == 0) goto L_0x0887
            int r2 = r8 - r7
            int r2 = ~r2
            int r2 = r2 >>> 31
            r3 = 8
            int r2 = 8 - r2
            r9 = 0
        L_0x07dd:
            if (r9 >= r2) goto L_0x0876
            r27 = 255(0xff, double:1.26E-321)
            long r27 = r13 & r27
            r29 = 128(0x80, double:6.32E-322)
            int r27 = (r27 > r29 ? 1 : (r27 == r29 ? 0 : -1))
            if (r27 >= 0) goto L_0x0857
            r19 = 3
            int r27 = r8 << 3
            int r27 = r27 + r9
            r19 = r10
            r28 = r11
            r10 = r4[r27]
            t52 r3 = r0.e()
            i22 r3 = r3.B(r10)
            if (r3 == 0) goto L_0x084c
            o62 r10 = r3.b
            int r11 = r10.m
            if (r11 != 0) goto L_0x084c
            long r10 = r10.k
            long r29 = r3.m()
            int r10 = (r10 > r29 ? 1 : (r10 == r29 ? 0 : -1))
            if (r10 > 0) goto L_0x084c
            fn6 r10 = udd.e
            if (r10 != 0) goto L_0x081c
        L_0x0813:
            r38 = r1
            r27 = r4
            r29 = r5
            r39 = r12
            goto L_0x083c
        L_0x081c:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x0813
            tn7 r11 = defpackage.tn7.Y
            r27 = r4
            o62 r4 = r3.b
            r29 = r5
            long r4 = r4.a
            r38 = r1
            java.lang.String r1 = "cancel notifications for chat "
            r39 = r12
            java.lang.String r12 = " because of no new messages!"
            java.lang.String r1 = defpackage.us8.j(r4, r1, r12)
            r4 = 0
            r10.d(r11, r6, r1, r4)
        L_0x083c:
            t97 r1 = r0.n
            java.lang.Object r1 = r1.getValue()
            p7a r1 = (p7a) r1
            o62 r3 = r3.b
            long r3 = r3.a
            r1.a(r3)
            goto L_0x0854
        L_0x084c:
            r38 = r1
            r27 = r4
            r29 = r5
            r39 = r12
        L_0x0854:
            r1 = 8
            goto L_0x0864
        L_0x0857:
            r38 = r1
            r27 = r4
            r29 = r5
            r19 = r10
            r28 = r11
            r39 = r12
            r1 = r3
        L_0x0864:
            long r13 = r13 >> r1
            r10 = 1
            int r9 = r9 + r10
            r12 = r39
            r3 = r1
            r10 = r19
            r4 = r27
            r11 = r28
            r5 = r29
            r1 = r38
            goto L_0x07dd
        L_0x0876:
            r38 = r1
            r1 = r3
            r27 = r4
            r29 = r5
            r19 = r10
            r28 = r11
            r39 = r12
            r10 = 1
            if (r2 != r1) goto L_0x08b2
            goto L_0x0894
        L_0x0887:
            r38 = r1
            r27 = r4
            r29 = r5
            r19 = r10
            r28 = r11
            r39 = r12
            r10 = 1
        L_0x0894:
            if (r8 == r7) goto L_0x08b2
            int r8 = r8 + r10
            r1 = r38
            r12 = r39
            r10 = r19
            r2 = r25
            r4 = r27
            r11 = r28
            r5 = r29
            goto L_0x07c0
        L_0x08a7:
            r38 = r1
            r25 = r2
            r19 = r10
            r28 = r11
            r39 = r12
            r10 = 1
        L_0x08b2:
            t97 r1 = r0.n
            java.lang.Object r1 = r1.getValue()
            p7a r1 = (p7a) r1
            r1.e(r15)
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x08c4
        L_0x08c1:
            r7 = r16
            goto L_0x08f3
        L_0x08c4:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x08c1
            tn7 r2 = defpackage.tn7.X
            long r3 = a(r39)
            java.lang.String r3 = zp4.j(r3)
            if (r38 == 0) goto L_0x08d8
            r4 = r10
            goto L_0x08d9
        L_0x08d8:
            r4 = 0
        L_0x08d9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r7 = r16
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r3 = "): sending critical logs if initial="
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r4 = 0
            r1.d(r2, r6, r3, r4)
        L_0x08f3:
            if (r38 == 0) goto L_0x093a
            in7 r1 = r0.h()
            r2 = r24
            r2.o = r0
            r3 = r19
            r2.X = r3
            r4 = r39
            r2.Y = r4
            r11 = r28
            r2.Z = r11
            r2.w0 = r15
            r13 = r34
            r2.x0 = r13
            r8 = r22
            r2.y0 = r8
            r5 = r21
            r2.B0 = r5
            r10 = r25
            r2.z0 = r10
            r12 = r38
            r2.C0 = r12
            r3 = 3
            r2.F0 = r3
            r3 = 0
            java.lang.Object r1 = r1.f(r3, r2)
            r2 = r20
            if (r1 != r2) goto L_0x092c
            return r2
        L_0x092c:
            r2 = r4
            r4 = r5
            r1 = r12
            r5 = r15
            r15 = r28
        L_0x0932:
            r12 = r2
            r25 = r5
            r20 = r13
            r2 = r19
            goto L_0x0952
        L_0x093a:
            r13 = r34
            r12 = r38
            r4 = r39
            r5 = r21
            r8 = r22
            r10 = r25
            r3 = 0
            r1 = r12
            r20 = r13
            r25 = r15
            r2 = r19
            r15 = r28
            r12 = r4
            r4 = r5
        L_0x0952:
            lqc r15 = (defpackage.lqc) r15
            r15.x(r10)
            t97 r5 = r0.f
            java.lang.Object r5 = r5.getValue()
            tt0 r5 = (tt0) r5
            java.util.List r10 = r2.o
            boolean r11 = r10 instanceof java.util.Collection
            if (r11 == 0) goto L_0x096e
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x096e
        L_0x096b:
            r23 = r3
            goto L_0x0984
        L_0x096e:
            java.util.Iterator r10 = r10.iterator()
        L_0x0972:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x096b
            java.lang.Object r11 = r10.next()
            j22 r11 = (defpackage.j22) r11
            int r11 = r11.A0
            if (r11 <= 0) goto L_0x0972
            r23 = 1
        L_0x0984:
            boolean r10 = r2.B0
            to7 r11 = new to7
            if (r1 == 0) goto L_0x098d
            r22 = 1
            goto L_0x098f
        L_0x098d:
            r22 = r3
        L_0x098f:
            r19 = r11
            r24 = r10
            r19.<init>(r20, r22, r23, r24, r25)
            r5.c(r11)
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x099e
            goto L_0x09ba
        L_0x099e:
            boolean r10 = r5.c()
            if (r10 == 0) goto L_0x09ba
            tn7 r10 = defpackage.tn7.X
            long r13 = a(r12)
            java.lang.String r11 = zp4.j(r13)
            java.lang.String r13 = "onLogin#20.saved_messages "
            java.lang.String r14 = ": saved messages"
            java.lang.String r11 = defpackage.wn6.i(r13, r11, r14)
            r13 = 0
            r5.d(r10, r6, r11, r13)
        L_0x09ba:
            g2b r5 = r0.m()
            j2b r5 = (defpackage.j2b) r5
            yzc r5 = r5.b
            boolean r5 = r5.u()
            if (r5 == 0) goto L_0x0a1d
            uj3 r5 = r2.c
            if (r5 == 0) goto L_0x0a11
            long r10 = r5.a
            java.util.List r5 = r2.o
            boolean r13 = r5 instanceof java.util.Collection
            if (r13 == 0) goto L_0x09db
            boolean r13 = r5.isEmpty()
            if (r13 == 0) goto L_0x09db
            goto L_0x0a01
        L_0x09db:
            java.util.Iterator r5 = r5.iterator()
        L_0x09df:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x0a01
            java.lang.Object r13 = r5.next()
            j22 r13 = (defpackage.j22) r13
            long r14 = r13.a
            r16 = 0
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x09ff
            int r14 = r13.b1
            r15 = 2
            if (r14 != r15) goto L_0x09df
            long r13 = r13.c
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x09df
            goto L_0x0a1d
        L_0x09ff:
            r15 = 2
            goto L_0x09df
        L_0x0a01:
            t97 r5 = r0.a
            java.lang.Object r5 = r5.getValue()
            pk r5 = (defpackage.pk) r5
            gy9 r5 = (defpackage.gy9) r5
            r10 = 0
            r5.j(r10)
            goto L_0x0a1d
        L_0x0a11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0a1d:
            int r5 = zp4.o
            long r10 = java.lang.System.nanoTime()
            eq4 r5 = eq4.b
            long r10 = mt0.Q(r10, r5)
            long r8 = zp4.g(r10, r8)
            long r10 = r2.a
            eq4 r2 = eq4.c
            long r10 = mt0.Q(r10, r2)
            long r8 = zp4.h(r8, r10)
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x0a3e
            goto L_0x0a58
        L_0x0a3e:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0a58
            tn7 r5 = defpackage.tn7.X
            long r10 = a(r12)
            java.lang.String r10 = zp4.j(r10)
            java.lang.String r11 = "): sendAction"
            java.lang.String r7 = defpackage.wn6.i(r7, r10, r11)
            r10 = 0
            r2.d(r5, r6, r7, r10)
        L_0x0a58:
            if (r4 == 0) goto L_0x0a73
            rf4 r2 = r0.f()
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0a73
            if (r1 == 0) goto L_0x0a67
            r3 = 1
        L_0x0a67:
            rf4 r1 = r0.f()
            vf4 r1 = r1.b()
            r0.u(r3, r1, r8)
            goto L_0x0a81
        L_0x0a73:
            if (r1 == 0) goto L_0x0a76
            r3 = 1
        L_0x0a76:
            rf4 r1 = r0.f()
            vf4 r1 = r1.b()
            r0.t(r3, r1, r8)
        L_0x0a81:
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x0a86
            goto L_0x0a9c
        L_0x0a86:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0a9c
            tn7 r1 = defpackage.tn7.X
            java.lang.String r2 = zp4.j(r8)
            java.lang.String r3 = "onLogin#22: finished "
            java.lang.String r2 = r3.concat(r2)
            r3 = 0
            r0.d(r1, r6, r2, r3)
        L_0x0a9c:
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp7.s(long, jo7, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void t(boolean z2, vf4 vf4, long j2) {
        ((bd) this.g.getValue()).e(zp4.e(j2), z2 ? "FIRST_LOGIN_PROCESSING_TIME" : "LOGIN_PROCESSING_TIME", vf4.name());
    }

    public final void u(boolean z2, vf4 vf4, long j2) {
        ((bd) this.g.getValue()).e(zp4.e(j2), z2 ? "INTERACTIVE_FIRST_LOGIN_PROCESSING_TIME" : "INTERACTIVE_LOGIN_PROCESSING_TIME", vf4.name());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: ym8} */
    /* JADX WARNING: type inference failed for: r9v17, types: [l7c, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0520 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01b3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0493  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(java.util.Map r31, kotlin.coroutines.Continuation r32) {
        /*
            r30 = this;
            r0 = r32
            r1 = 3
            boolean r2 = r0 instanceof defpackage.zo7
            if (r2 == 0) goto L_0x0018
            r2 = r0
            zo7 r2 = (defpackage.zo7) r2
            int r3 = r2.G0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.G0 = r3
            r3 = r30
            goto L_0x001f
        L_0x0018:
            zo7 r2 = new zo7
            r3 = r30
            r2.<init>(r3, r0)
        L_0x001f:
            java.lang.Object r0 = r2.E0
            pu3 r4 = pu3.a
            int r5 = r2.G0
            r6 = 1
            java.lang.String r7 = "bp7"
            r9 = 2
            if (r5 == 0) goto L_0x00b8
            if (r5 == r6) goto L_0x008a
            if (r5 == r9) goto L_0x005a
            if (r5 != r1) goto L_0x0052
            int r3 = r2.D0
            int r5 = r2.C0
            l7c r10 = r2.A0
            ym8 r11 = r2.z0
            java.util.Iterator r12 = r2.y0
            xm8 r13 = r2.x0
            xm8 r14 = r2.w0
            k62 r15 = r2.Z
            i22 r9 = r2.Y
            java.util.Iterator r6 = r2.X
            bp7 r8 = r2.o
            wx3.H(r0)
            r16 = r7
            r7 = r15
            r15 = r6
            r6 = r4
            r4 = r1
            goto L_0x03f4
        L_0x0052:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005a:
            int r3 = r2.D0
            int r5 = r2.C0
            l7c r6 = r2.B0
            l7c r8 = r2.A0
            ym8 r9 = r2.z0
            java.util.Iterator r10 = r2.y0
            xm8 r11 = r2.x0
            xm8 r12 = r2.w0
            k62 r13 = r2.Z
            i22 r14 = r2.Y
            java.util.Iterator r15 = r2.X
            bp7 r1 = r2.o
            wx3.H(r0)
            r16 = r7
            r7 = r13
            r13 = r11
            r11 = r6
            r6 = r4
            r4 = 2
            r28 = r8
            r8 = r1
            r1 = r10
            r10 = r28
            r29 = r12
            r12 = r9
            r9 = r14
            r14 = r29
            goto L_0x03b6
        L_0x008a:
            int r1 = r2.D0
            int r3 = r2.C0
            l7c r5 = r2.B0
            l7c r6 = r2.A0
            ym8 r8 = r2.z0
            java.util.Iterator r9 = r2.y0
            xm8 r10 = r2.x0
            xm8 r11 = r2.w0
            k62 r12 = r2.Z
            i22 r13 = r2.Y
            java.util.Iterator r14 = r2.X
            bp7 r15 = r2.o
            wx3.H(r0)
            r16 = r7
            r28 = r11
            r11 = r6
            r6 = r15
            r15 = r28
            r29 = r12
            r12 = r8
            r8 = r13
            r13 = r9
            r9 = r14
            r14 = r10
            r10 = r29
            goto L_0x01c0
        L_0x00b8:
            wx3.H(r0)
            java.util.Set r0 = r31.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0520
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r5 = r1.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            t97 r8 = r3.u
            java.lang.Object r8 = r8.getValue()
            l92 r8 = (defpackage.l92) r8
            r8.getClass()
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L_0x00f5
            java.util.List r8 = java.util.Collections.emptyList()
            goto L_0x0109
        L_0x00f5:
            una r9 = defpackage.una.TYPE_MSG_EDIT
            jee r8 = r8.g
            r10 = 0
            java.util.List r8 = r8.h(r10, r9)
            d52 r9 = new d52
            r10 = 3
            r9.<init>(r10, r8)
            java.util.List r8 = defpackage.ek8.s(r1, r9)
        L_0x0109:
            int r9 = r8.size()
            int r10 = r1.size()
            if (r9 == r10) goto L_0x012f
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0118
            goto L_0x012e
        L_0x0118:
            boolean r9 = r1.c()
            if (r9 == 0) goto L_0x012e
            tn7 r9 = defpackage.tn7.X
            int r10 = r8.size()
            java.lang.String r11 = "updateMessages: local edit found by size "
            java.lang.String r10 = defpackage.wn6.h(r10, r11)
            r11 = 0
            r1.d(r9, r7, r10, r11)
        L_0x012e:
            r1 = r8
        L_0x012f:
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L_0x013f
            t52 r8 = r3.e()
            i22 r5 = r8.y(r5)
            if (r5 != 0) goto L_0x0144
        L_0x013f:
            r6 = r4
            r16 = r7
            goto L_0x051b
        L_0x0144:
            o62 r6 = r5.b
            k62 r6 = r6.o0
            xm8 r8 = r5.c
            xm8 r9 = r5.X
            java.util.Iterator r1 = r1.iterator()
            r10 = 0
            r11 = r5
            r13 = r6
            r15 = r8
            r14 = r9
            r6 = r1
            r5 = r3
            r1 = r10
            r3 = r1
        L_0x0159:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x04da
            java.lang.Object r8 = r6.next()
            r12 = r8
            ym8 r12 = (defpackage.ym8) r12
            l7c r9 = new l7c
            r9.<init>()
            t97 r8 = r5.e
            java.lang.Object r8 = r8.getValue()
            a04 r8 = (defpackage.a04) r8
            hz3 r8 = (defpackage.hz3) r8
            nec r8 = r8.c
            r16 = r7
            r10 = r8
            long r7 = r11.a
            r30 = r7
            long r7 = r12.a
            r2.o = r5
            r2.X = r0
            r2.Y = r11
            r2.Z = r13
            r2.w0 = r15
            r2.x0 = r14
            r2.y0 = r6
            r2.z0 = r12
            r2.A0 = r9
            r2.B0 = r9
            r2.C0 = r3
            r2.D0 = r1
            r17 = r0
            r0 = 1
            r2.G0 = r0
            r18 = r30
            r20 = r7
            r8 = r10
            r0 = r9
            r9 = r18
            r7 = r11
            r18 = r12
            r11 = r20
            r19 = r13
            r13 = r2
            java.lang.Object r8 = r8.j(r9, r11, r13)
            if (r8 != r4) goto L_0x01b4
            return r4
        L_0x01b4:
            r11 = r0
            r13 = r6
            r9 = r17
            r12 = r18
            r10 = r19
            r6 = r5
            r0 = r8
            r5 = r11
            r8 = r7
        L_0x01c0:
            r5.a = r0
            ms8 r0 = r12.X
            if (r0 == 0) goto L_0x01d6
            int[] r5 = defpackage.xo7.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r5[r0]
            java.lang.String r5 = ", message.id = "
            r7 = 1
            if (r0 == r7) goto L_0x02f6
            r7 = 2
            if (r0 == r7) goto L_0x01e6
        L_0x01d6:
            r26 = r1
            r30 = r3
            r17 = r6
            r0 = r8
            r1 = r9
            r19 = r10
            r18 = r13
            r13 = r2
            r6 = r4
            goto L_0x04a5
        L_0x01e6:
            java.lang.Object r0 = r11.a
            if (r0 == 0) goto L_0x0279
            t97 r0 = r6.e
            java.lang.Object r0 = r0.getValue()
            a04 r0 = (defpackage.a04) r0
            hz3 r0 = (defpackage.hz3) r0
            nec r0 = r0.c
            r30 = r3
            r24 = r4
            long r3 = r8.a
            java.lang.Object r7 = r11.a
            vo8 r7 = (defpackage.vo8) r7
            r31 = r13
            r25 = r14
            long r13 = r7.b
            java.util.List r7 = hr1.o(r13)
            ls8 r13 = defpackage.ls8.DELETED
            cw8 r0 = r0.d()
            r0.o(r3, r7, r13)
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x021e
        L_0x0217:
            r26 = r1
            r27 = r2
            r4 = r16
            goto L_0x0245
        L_0x021e:
            boolean r3 = r0.c()
            if (r3 == 0) goto L_0x0217
            tn7 r3 = defpackage.tn7.X
            long r13 = r8.a
            java.lang.Object r4 = r11.a
            vo8 r4 = (defpackage.vo8) r4
            r26 = r1
            r27 = r2
            long r1 = r4.b
            java.lang.String r4 = "updateMessages, REMOVED: chat.id = "
            java.lang.StringBuilder r4 = hr1.k(r13, r4, r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = r16
            r2 = 0
            r0.d(r3, r4, r1, r2)
        L_0x0245:
            t97 r0 = r6.f
            java.lang.Object r0 = r0.getValue()
            tt0 r0 = (tt0) r0
            l89 r1 = new l89
            long r2 = r8.a
            java.lang.Object r5 = r11.a
            vo8 r5 = (defpackage.vo8) r5
            long r13 = r5.b
            java.util.List r5 = hr1.o(r13)
            r7 = 0
            r1.<init>(r2, r5, r7)
            r0.c(r1)
            t97 r0 = r6.v
            java.lang.Object r0 = r0.getValue()
            mm9 r0 = (defpackage.mm9) r0
            t97 r1 = r6.n
            java.lang.Object r1 = r1.getValue()
            p7a r1 = (p7a) r1
            r0.getClass()
            defpackage.mm9.a(r8, r1)
            goto L_0x0287
        L_0x0279:
            r26 = r1
            r27 = r2
            r30 = r3
            r24 = r4
            r31 = r13
            r25 = r14
            r4 = r16
        L_0x0287:
            if (r10 == 0) goto L_0x02e4
            long r0 = r10.c
            long r2 = r12.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x02e4
            t52 r0 = r6.e()
            o62 r1 = r8.b
            long r1 = r1.a
            r0.getClass()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r5 = "t52"
            java.lang.String r7 = "removeLastPushMessage %d"
            udd.p(r5, r7, r3)
            i22 r3 = r0.y(r1)
            if (r3 != 0) goto L_0x02c5
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r13 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r13)
            java.lang.String r1 = "removeLastPushMessage: chat not found! %d"
            r2 = 0
            udd.R(r5, r2, r1, r0)
            goto L_0x02e4
        L_0x02c5:
            r13 = 1
            ak0 r1 = new ak0
            r2 = 22
            r1.<init>(r2)
            long r2 = r3.a
            r0.h(r2, r13, r1)
            mw2 r1 = new mw2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.<init>(r2, r13)
            tt0 r0 = r0.m
            r0.c(r1)
        L_0x02e4:
            r18 = r31
            r16 = r4
            r17 = r6
            r0 = r8
            r1 = r9
            r19 = r10
            r6 = r24
            r14 = r25
            r13 = r27
            goto L_0x04a5
        L_0x02f6:
            r26 = r1
            r27 = r2
            r30 = r3
            r24 = r4
            r31 = r13
            r25 = r14
            r4 = r16
            r13 = r7
            java.lang.Object r0 = r11.a
            if (r0 == 0) goto L_0x0448
            t97 r0 = r6.e
            java.lang.Object r0 = r0.getValue()
            a04 r0 = (defpackage.a04) r0
            hz3 r0 = (defpackage.hz3) r0
            nec r0 = r0.c
            long r1 = r8.a
            r23 = 0
            r20 = 0
            r17 = r0
            r18 = r1
            r22 = r12
            r17.p(r18, r20, r22, r23)
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x0329
            goto L_0x035a
        L_0x0329:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x035a
            tn7 r1 = defpackage.tn7.X
            long r2 = r8.a
            java.lang.Object r7 = r11.a
            vo8 r7 = (defpackage.vo8) r7
            if (r7 == 0) goto L_0x0341
            long r13 = r7.b
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r13)
            goto L_0x0342
        L_0x0341:
            r7 = 0
        L_0x0342:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "updateMessages, EDITED: chat.id = "
            r13.<init>(r14)
            r13.append(r2)
            r13.append(r5)
            r13.append(r7)
            java.lang.String r2 = r13.toString()
            r3 = 0
            r0.d(r1, r4, r2, r3)
        L_0x035a:
            t97 r0 = r6.e
            java.lang.Object r0 = r0.getValue()
            a04 r0 = (defpackage.a04) r0
            hz3 r0 = (defpackage.hz3) r0
            nec r5 = r0.c
            long r0 = r8.a
            long r2 = r12.a
            r13 = r27
            r13.o = r6
            r13.X = r9
            r13.Y = r8
            r13.Z = r10
            r13.w0 = r15
            r14 = r25
            r13.x0 = r14
            r7 = r31
            r13.y0 = r7
            r13.z0 = r12
            r13.A0 = r11
            r13.B0 = r11
            r16 = r4
            r4 = r30
            r13.C0 = r4
            r4 = r26
            r13.D0 = r4
            r4 = 2
            r13.G0 = r4
            r17 = r6
            r18 = r7
            r6 = r0
            r0 = r8
            r1 = r9
            r8 = r2
            r19 = r10
            r10 = r13
            java.lang.Object r2 = r5.j(r6, r8, r10)
            r6 = r24
            if (r2 != r6) goto L_0x03a5
            return r6
        L_0x03a5:
            r5 = r30
            r9 = r0
            r0 = r2
            r10 = r11
            r2 = r13
            r13 = r14
            r14 = r15
            r8 = r17
            r7 = r19
            r3 = r26
            r15 = r1
            r1 = r18
        L_0x03b6:
            r11.a = r0
            java.lang.Object r0 = r10.a
            if (r0 == 0) goto L_0x0441
            t97 r0 = r8.A
            java.lang.Object r0 = r0.getValue()
            pae r0 = (defpackage.pae) r0
            n3a r0 = (n3a) r0
            ju3 r0 = r0.b()
            ap7 r11 = new ap7
            r4 = 0
            r11.<init>(r8, r10, r12, r4)
            r2.o = r8
            r2.X = r15
            r2.Y = r9
            r2.Z = r7
            r2.w0 = r14
            r2.x0 = r13
            r2.y0 = r1
            r2.z0 = r12
            r2.A0 = r10
            r2.B0 = r4
            r2.C0 = r5
            r2.D0 = r3
            r4 = 3
            r2.G0 = r4
            java.lang.Object r0 = xs7.U(r0, r11, r2)
            if (r0 != r6) goto L_0x03f2
            return r6
        L_0x03f2:
            r11 = r12
            r12 = r1
        L_0x03f4:
            t97 r0 = r8.p
            java.lang.Object r0 = r0.getValue()
            n1b r0 = (defpackage.n1b) r0
            java.lang.Object r1 = r10.a
            vo8 r1 = (defpackage.vo8) r1
            t52 r4 = r8.e()
            r30 = r2
            java.lang.Object r2 = r10.a
            vo8 r2 = (defpackage.vo8) r2
            r31 = r3
            long r2 = r2.x0
            i22 r2 = r4.B(r2)
            r0.b(r2, r1)
            t97 r0 = r8.f
            java.lang.Object r0 = r0.getValue()
            tt0 r0 = (tt0) r0
            ove r1 = new ove
            long r2 = r9.a
            java.lang.Object r4 = r10.a
            vo8 r4 = (defpackage.vo8) r4
            r10 = r5
            long r4 = r4.b
            r22 = 0
            r17 = r1
            r18 = r2
            r20 = r4
            r17.<init>(r18, r20, r22)
            r0.c(r1)
            r2 = r30
            r1 = r31
            r3 = r10
            r0 = r14
            r10 = r7
            r14 = r13
            r13 = r12
            r12 = r11
            goto L_0x0464
        L_0x0441:
            r10 = r7
            r0 = r14
            r14 = r13
            r13 = r1
            r1 = r3
            r3 = r5
            goto L_0x0464
        L_0x0448:
            r18 = r31
            r16 = r4
            r17 = r6
            r0 = r8
            r1 = r9
            r19 = r10
            r6 = r24
            r14 = r25
            r13 = r27
            r3 = r30
            r9 = r0
            r2 = r13
            r0 = r15
            r8 = r17
            r13 = r18
            r15 = r1
            r1 = r26
        L_0x0464:
            if (r10 == 0) goto L_0x0493
            long r4 = r10.c
            r31 = r0
            r30 = r1
            long r0 = r12.a
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x048f
            t52 r17 = r8.e()
            o62 r0 = r9.b
            long r0 = r0.a
            long r4 = r12.a
            java.lang.String r7 = r12.Z
            r11 = r2
            r25 = r3
            long r2 = r12.c
            r18 = r7
            r19 = r0
            r21 = r4
            r23 = r2
            r17.m0(r18, r19, r21, r23)
            goto L_0x0498
        L_0x048f:
            r11 = r2
            r25 = r3
            goto L_0x0498
        L_0x0493:
            r31 = r0
            r30 = r1
            goto L_0x048f
        L_0x0498:
            r1 = r30
            r5 = r8
            r19 = r10
            r2 = r11
            r0 = r15
            r3 = r25
            r15 = r31
            r11 = r9
            goto L_0x04b0
        L_0x04a5:
            r3 = r30
            r11 = r0
            r0 = r1
            r2 = r13
            r5 = r17
            r13 = r18
            r1 = r26
        L_0x04b0:
            if (r15 == 0) goto L_0x04bd
            vo8 r4 = r15.a
            long r7 = r4.c
            long r9 = r12.a
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x04bd
            r3 = 1
        L_0x04bd:
            if (r14 == 0) goto L_0x04d2
            vo8 r4 = r14.a
            long r7 = r4.c
            long r9 = r12.a
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x04d2
            r4 = r6
            r6 = r13
            r7 = r16
            r13 = r19
            r1 = 1
            goto L_0x0159
        L_0x04d2:
            r4 = r6
            r6 = r13
            r7 = r16
            r13 = r19
            goto L_0x0159
        L_0x04da:
            r17 = r0
            r6 = r4
            r16 = r7
            r7 = r11
            if (r3 == 0) goto L_0x0508
            t52 r0 = r5.e()
            long r3 = r7.a
            r0.v(r3)
            t97 r0 = r5.f
            java.lang.Object r0 = r0.getValue()
            tt0 r0 = (tt0) r0
            mw2 r3 = new mw2
            long r8 = r7.a
            java.util.List r9 = hr1.o(r8)
            r12 = 0
            r13 = 0
            r10 = 0
            r11 = 0
            r14 = 124(0x7c, float:1.74E-43)
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.c(r3)
        L_0x0508:
            if (r1 == 0) goto L_0x0513
            t52 r0 = r5.e()
            long r3 = r7.a
            r0.o0(r3)
        L_0x0513:
            r3 = r5
            r4 = r6
            r7 = r16
            r0 = r17
            goto L_0x00c3
        L_0x051b:
            r4 = r6
            r7 = r16
            goto L_0x00c3
        L_0x0520:
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp7.v(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
