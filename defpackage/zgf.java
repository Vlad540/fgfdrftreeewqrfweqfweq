package defpackage;

import android.content.Context;

/* renamed from: zgf  reason: default package */
public final class zgf {
    public final long a;
    public final long b;
    public final ou3 c;
    public final Context d;
    public final zqd e;
    public final wjf f;
    public final String g = zgf.class.getName();
    public final t97 h;
    public final t97 i;
    public final hcd j;
    public final s0c k;
    public volatile e57 l;

    public zgf(long j2, long j3, ou3 ou3, Context context, t0c t0c, t97 t97, t97 t972) {
        StringBuilder k2 = hr1.k(j2, "webapp_biom_s_key_", "_");
        k2.append(j3);
        wjf wjf = new wjf(k2.toString(), true);
        this.a = j2;
        this.b = j3;
        this.c = ou3;
        this.d = context;
        this.e = t0c;
        this.f = wjf;
        this.h = t97;
        this.i = t972;
        hcd b2 = icd.b(0, Integer.MAX_VALUE, 0, 4);
        this.j = b2;
        this.k = new s0c(b2);
    }

    public static final xff a(zgf zgf) {
        return (xff) zgf.h.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.zgf r6, defpackage.dm0 r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof defpackage.igf
            if (r0 == 0) goto L_0x0013
            r0 = r8
            igf r0 = (defpackage.igf) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            igf r0 = new igf
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            dm0 r7 = r0.X
            zgf r6 = r0.o
            wx3.H(r8)
            goto L_0x0053
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            wx3.H(r8)
            pae r8 = r6.e()
            n3a r8 = (n3a) r8
            ju3 r8 = r8.b()
            jgf r2 = new jgf
            r2.<init>(r6, r3)
            r0.o = r6
            r0.X = r7
            r0.w0 = r4
            java.lang.Object r8 = xs7.U(r8, r2, r0)
            if (r8 != r1) goto L_0x0053
            goto L_0x0078
        L_0x0053:
            ahf r8 = (defpackage.ahf) r8
            jm0 r0 = new jm0
            boolean r1 = r6.f()
            boolean r2 = r8.e
            boolean r5 = r8.f
            java.lang.String r8 = r8.d
            if (r8 == 0) goto L_0x006c
            int r8 = r8.length()
            if (r8 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r8 = 0
            goto L_0x006d
        L_0x006c:
            r8 = r4
        L_0x006d:
            r8 = r8 ^ r4
            r0.<init>(r1, r2, r5, r8)
            r7.a(r0)
            r6.l = r3
            jue r1 = jue.a
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgf.b(zgf, dm0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r7 == r1) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.zgf r5, defpackage.em0 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.lgf
            if (r0 == 0) goto L_0x0013
            r0 = r7
            lgf r0 = (defpackage.lgf) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            lgf r0 = new lgf
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            em0 r6 = r0.X
            zgf r5 = r0.o
            wx3.H(r7)
            goto L_0x0053
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            wx3.H(r7)
            pae r7 = r5.e()
            n3a r7 = (n3a) r7
            ju3 r7 = r7.b()
            mgf r2 = new mgf
            r2.<init>(r5, r4)
            r0.o = r5
            r0.X = r6
            r0.w0 = r3
            java.lang.Object r7 = xs7.U(r7, r2, r0)
            if (r7 != r1) goto L_0x0053
            goto L_0x0078
        L_0x0053:
            ahf r7 = (defpackage.ahf) r7
            if (r7 == 0) goto L_0x0059
            java.lang.String r4 = r7.d
        L_0x0059:
            jue r1 = jue.a
            if (r7 == 0) goto L_0x0070
            if (r4 == 0) goto L_0x0070
            int r7 = r4.length()
            if (r7 != 0) goto L_0x0066
            goto L_0x0070
        L_0x0066:
            wjf r5 = r5.f
            java.lang.String r5 = defpackage.wjf.a(r5, r4)
            r6.a(r5)
            goto L_0x0078
        L_0x0070:
            ghf r5 = new ghf
            r5.<init>()
            r6.b(r5)
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgf.c(zgf, em0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(defpackage.zgf r7, defpackage.hm0 r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof defpackage.xgf
            if (r0 == 0) goto L_0x0013
            r0 = r9
            xgf r0 = (defpackage.xgf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            xgf r0 = new xgf
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            hm0 r8 = r0.o
            wx3.H(r9)
            goto L_0x005d
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            wx3.H(r9)
            java.lang.String r9 = r8.d
            if (r9 != 0) goto L_0x003c
        L_0x003a:
            r1 = r3
            goto L_0x0061
        L_0x003c:
            wjf r2 = r7.f
            java.lang.String r9 = r2.b(r9)
            pae r2 = r7.e()
            n3a r2 = (n3a) r2
            ju3 r2 = r2.b()
            ygf r5 = new ygf
            r6 = 0
            r5.<init>(r7, r9, r6)
            r0.o = r8
            r0.Z = r4
            java.lang.Object r7 = xs7.U(r2, r5, r0)
            if (r7 != r1) goto L_0x005d
            goto L_0x0061
        L_0x005d:
            r8.a(r3)
            goto L_0x003a
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgf.d(zgf, hm0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static String g(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str.length() > 128 ? h0e.y0(128, str) : str;
    }

    public final pae e() {
        return (pae) this.i.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8 A[Catch:{ all -> 0x00f2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r11 = this;
            java.lang.String r0 = "Biometry status: "
            android.content.Context r1 = r11.d     // Catch:{ all -> 0x00f2 }
            qe4 r2 = new qe4     // Catch:{ all -> 0x00f2 }
            x3a r3 = new x3a     // Catch:{ all -> 0x00f2 }
            r3.<init>(r1)     // Catch:{ all -> 0x00f2 }
            r2.<init>(r3)     // Catch:{ all -> 0x00f2 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00f2 }
            java.lang.Object r4 = r2.b     // Catch:{ all -> 0x00f2 }
            android.hardware.biometrics.BiometricManager r4 = (android.hardware.biometrics.BiometricManager) r4     // Catch:{ all -> 0x00f2 }
            r5 = 0
            r6 = 1
            r7 = 15
            r8 = 30
            if (r1 < r8) goto L_0x0027
            if (r4 != 0) goto L_0x0021
            r1 = r6
            goto L_0x00d2
        L_0x0021:
            int r1 = xl0.a(r4, r7)     // Catch:{ all -> 0x00f2 }
            goto L_0x00d2
        L_0x0027:
            java.lang.Object r9 = r3.b     // Catch:{ all -> 0x00f2 }
            android.content.Context r9 = (android.content.Context) r9     // Catch:{ all -> 0x00f2 }
            android.app.KeyguardManager r9 = t87.a(r9)     // Catch:{ all -> 0x00f2 }
            if (r9 == 0) goto L_0x00d0
            boolean r7 = h2g.p(r7)     // Catch:{ all -> 0x00f2 }
            java.lang.Object r9 = r3.b     // Catch:{ all -> 0x00f2 }
            android.content.Context r9 = (android.content.Context) r9     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x0050
            android.app.KeyguardManager r1 = t87.a(r9)     // Catch:{ all -> 0x00f2 }
            if (r1 != 0) goto L_0x0043
            r1 = r5
            goto L_0x0047
        L_0x0043:
            boolean r1 = t87.b(r1)     // Catch:{ all -> 0x00f2 }
        L_0x0047:
            if (r1 == 0) goto L_0x004c
        L_0x0049:
            r1 = r5
            goto L_0x00d2
        L_0x004c:
            r1 = 11
            goto L_0x00d2
        L_0x0050:
            r7 = 29
            if (r1 != r7) goto L_0x00cb
            java.lang.reflect.Method r1 = wl0.c()     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x0078
            stf r7 = lp.k()     // Catch:{ all -> 0x00f2 }
            android.hardware.biometrics.BiometricPrompt$CryptoObject r7 = lp.W(r7)     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x0078
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0078 }
            java.lang.Object r1 = r1.invoke(r4, r7)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0078 }
            boolean r7 = r1 instanceof java.lang.Integer     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0078 }
            if (r7 == 0) goto L_0x0078
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0078 }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0078 }
            goto L_0x00d2
        L_0x0078:
            if (r4 != 0) goto L_0x007c
            r1 = r6
            goto L_0x0080
        L_0x007c:
            int r1 = wl0.a(r4)     // Catch:{ all -> 0x00f2 }
        L_0x0080:
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x00f2 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00f2 }
            if (r7 < r8) goto L_0x0088
        L_0x0086:
            r4 = r5
            goto L_0x00a6
        L_0x0088:
            int r7 = nlb.assume_strong_biometrics_models     // Catch:{ all -> 0x00f2 }
            if (r4 != 0) goto L_0x008d
            goto L_0x0086
        L_0x008d:
            android.content.res.Resources r8 = r9.getResources()     // Catch:{ all -> 0x00f2 }
            java.lang.String[] r7 = r8.getStringArray(r7)     // Catch:{ all -> 0x00f2 }
            int r8 = r7.length     // Catch:{ all -> 0x00f2 }
            r9 = r5
        L_0x0097:
            if (r9 >= r8) goto L_0x0086
            r10 = r7[r9]     // Catch:{ all -> 0x00f2 }
            boolean r10 = r4.equals(r10)     // Catch:{ all -> 0x00f2 }
            if (r10 == 0) goto L_0x00a3
            r4 = r6
            goto L_0x00a6
        L_0x00a3:
            int r9 = r9 + 1
            goto L_0x0097
        L_0x00a6:
            if (r4 != 0) goto L_0x00d2
            if (r1 == 0) goto L_0x00ab
            goto L_0x00d2
        L_0x00ab:
            java.lang.Object r1 = r3.b     // Catch:{ all -> 0x00f2 }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x00f2 }
            android.app.KeyguardManager r1 = t87.a(r1)     // Catch:{ all -> 0x00f2 }
            if (r1 != 0) goto L_0x00b7
            r1 = r5
            goto L_0x00bb
        L_0x00b7:
            boolean r1 = t87.b(r1)     // Catch:{ all -> 0x00f2 }
        L_0x00bb:
            if (r1 != 0) goto L_0x00c2
            int r1 = r2.q()     // Catch:{ all -> 0x00f2 }
            goto L_0x00d2
        L_0x00c2:
            int r1 = r2.q()     // Catch:{ all -> 0x00f2 }
            if (r1 != 0) goto L_0x00c9
            goto L_0x0049
        L_0x00c9:
            r1 = -1
            goto L_0x00d2
        L_0x00cb:
            int r1 = r2.q()     // Catch:{ all -> 0x00f2 }
            goto L_0x00d2
        L_0x00d0:
            r1 = 12
        L_0x00d2:
            java.lang.String r11 = r11.g     // Catch:{ all -> 0x00f2 }
            fn6 r2 = udd.e     // Catch:{ all -> 0x00f2 }
            if (r2 != 0) goto L_0x00d9
            goto L_0x00f4
        L_0x00d9:
            boolean r3 = r2.c()     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x00f4
            tn7 r3 = defpackage.tn7.X     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r4.<init>(r0)     // Catch:{ all -> 0x00f2 }
            r4.append(r1)     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00f2 }
            r4 = 0
            r2.d(r3, r11, r0, r4)     // Catch:{ all -> 0x00f2 }
            goto L_0x00f4
        L_0x00f2:
            r11 = move-exception
            goto L_0x00fc
        L_0x00f4:
            if (r1 != 0) goto L_0x00f7
            r5 = r6
        L_0x00f7:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00f2 }
            goto L_0x0102
        L_0x00fc:
            kcc r0 = new kcc
            r0.<init>(r11)
            r11 = r0
        L_0x0102:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r11 instanceof kcc
            if (r1 == 0) goto L_0x0109
            r11 = r0
        L_0x0109:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgf.f():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.im0 r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.kgf
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kgf r0 = (defpackage.kgf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            kgf r0 = new kgf
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r8) goto L_0x004e
            if (r2 == r7) goto L_0x004a
            if (r2 == r6) goto L_0x0043
            if (r2 == r5) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            wx3.H(r12)
            goto L_0x0124
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            wx3.H(r12)
            goto L_0x00ff
        L_0x0043:
            fm0 r9 = r0.o
            wx3.H(r12)
            goto L_0x00d7
        L_0x004a:
            wx3.H(r12)
            goto L_0x009f
        L_0x004e:
            wx3.H(r12)
            goto L_0x007a
        L_0x0052:
            wx3.H(r12)
            boolean r12 = r10 instanceof defpackage.dm0
            r2 = 0
            if (r12 == 0) goto L_0x007b
            dm0 r10 = (defpackage.dm0) r10
            java.lang.String r12 = r10.c
            if (r11 == 0) goto L_0x0064
            boolean r2 = hhd.f(r12, r11)
        L_0x0064:
            if (r2 != 0) goto L_0x0071
            chf r9 = new chf
            phf r11 = defpackage.phf.REQUEST_ACCESS
            r9.<init>(r11)
            r10.b(r9)
            return r3
        L_0x0071:
            r0.Z = r8
            java.lang.Object r9 = r9.j(r10, r0)
            if (r9 != r1) goto L_0x007a
            return r1
        L_0x007a:
            return r3
        L_0x007b:
            boolean r12 = r10 instanceof defpackage.em0
            if (r12 == 0) goto L_0x00a0
            em0 r10 = (defpackage.em0) r10
            java.lang.String r12 = r10.c
            if (r11 == 0) goto L_0x0089
            boolean r2 = hhd.f(r12, r11)
        L_0x0089:
            if (r2 != 0) goto L_0x0096
            chf r9 = new chf
            phf r11 = defpackage.phf.REQUEST_AUTH
            r9.<init>(r11)
            r10.b(r9)
            return r3
        L_0x0096:
            r0.Z = r7
            java.lang.Object r9 = r9.k(r10, r0)
            if (r9 != r1) goto L_0x009f
            return r1
        L_0x009f:
            return r3
        L_0x00a0:
            boolean r12 = r10 instanceof defpackage.fm0
            if (r12 == 0) goto L_0x00db
            fm0 r10 = (defpackage.fm0) r10
            java.lang.String r12 = r10.c
            if (r11 == 0) goto L_0x00af
            boolean r11 = hhd.f(r12, r11)
            goto L_0x00b0
        L_0x00af:
            r11 = r2
        L_0x00b0:
            if (r11 != 0) goto L_0x00bb
            jm0 r9 = new jm0
            r9.<init>(r2, r2, r2, r2)
            r10.a(r9)
            return r3
        L_0x00bb:
            r0.o = r10
            r0.Z = r6
            pae r11 = r9.e()
            n3a r11 = (n3a) r11
            ju3 r11 = r11.b()
            ngf r12 = new ngf
            r2 = 0
            r12.<init>(r9, r2)
            java.lang.Object r12 = xs7.U(r11, r12, r0)
            if (r12 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            r9 = r10
        L_0x00d7:
            r9.a(r12)
            return r3
        L_0x00db:
            boolean r12 = r10 instanceof defpackage.gm0
            if (r12 == 0) goto L_0x0100
            gm0 r10 = (defpackage.gm0) r10
            java.lang.String r12 = r10.c
            if (r11 == 0) goto L_0x00e9
            boolean r2 = hhd.f(r12, r11)
        L_0x00e9:
            if (r2 != 0) goto L_0x00f6
            chf r9 = new chf
            phf r11 = defpackage.phf.OPEN_SETTINGS
            r9.<init>(r11)
            r10.b(r9)
            return r3
        L_0x00f6:
            r0.Z = r5
            java.lang.Object r9 = r9.i(r10, r0)
            if (r9 != r1) goto L_0x00ff
            return r1
        L_0x00ff:
            return r3
        L_0x0100:
            boolean r12 = r10 instanceof defpackage.hm0
            if (r12 == 0) goto L_0x0125
            hm0 r10 = (defpackage.hm0) r10
            java.lang.String r12 = r10.c
            if (r11 == 0) goto L_0x010e
            boolean r2 = hhd.f(r12, r11)
        L_0x010e:
            if (r2 != 0) goto L_0x011b
            chf r9 = new chf
            phf r11 = defpackage.phf.UPDATE_TOKEN
            r9.<init>(r11)
            r10.b(r9)
            return r3
        L_0x011b:
            r0.Z = r4
            java.lang.Object r9 = r9.l(r10, r0)
            if (r9 != r1) goto L_0x0124
            return r1
        L_0x0124:
            return r3
        L_0x0125:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgf.h(im0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(defpackage.gm0 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.ogf
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ogf r0 = (defpackage.ogf) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            ogf r0 = new ogf
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r6) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            wx3.H(r11)
            goto L_0x00d6
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            gm0 r10 = r0.X
            zgf r9 = r0.o
            wx3.H(r11)
            goto L_0x006c
        L_0x003e:
            wx3.H(r11)
            boolean r11 = r9.f()
            if (r11 != 0) goto L_0x0050
            dhf r9 = new dhf
            r9.<init>(r6)
            r10.b(r9)
            return r3
        L_0x0050:
            pae r11 = r9.e()
            n3a r11 = (n3a) r11
            ju3 r11 = r11.b()
            pgf r2 = new pgf
            r2.<init>(r9, r5)
            r0.o = r9
            r0.X = r10
            r0.w0 = r6
            java.lang.Object r11 = xs7.U(r11, r2, r0)
            if (r11 != r1) goto L_0x006c
            return r1
        L_0x006c:
            ahf r11 = (defpackage.ahf) r11
            if (r11 != 0) goto L_0x0079
            dhf r9 = new dhf
            r9.<init>(r6)
            r10.b(r9)
            return r3
        L_0x0079:
            boolean r2 = r11.e
            if (r2 == 0) goto L_0x008c
            boolean r11 = r11.f
            if (r11 == 0) goto L_0x008c
            ehf r9 = new ehf
            phf r11 = defpackage.phf.OPEN_SETTINGS
            r9.<init>(r11)
            r10.b(r9)
            return r3
        L_0x008c:
            e57 r11 = r9.l
            if (r11 == 0) goto L_0x0098
            s0 r2 = new s0
            r2.<init>()
            r11.b(r2)
        L_0x0098:
            r9.l = r10
            int r10 = defpackage.xea.b
            hge r11 = new hge
            r11.<init>(r10)
            kc3 r10 = new kc3
            int r2 = defpackage.xea.a
            hge r7 = new hge
            r7.<init>(r2)
            r2 = 3
            r10.<init>(r6, r7, r2, r6)
            kc3 r2 = new kc3
            int r7 = defpackage.rhc.h
            hge r8 = new hge
            r8.<init>(r7)
            r2.<init>(r4, r8, r4, r6)
            kc3[] r10 = new defpackage.kc3[]{r10, r2}
            java.util.List r10 = p23.B(r10)
            hcd r9 = r9.j
            bgf r2 = new bgf
            r2.<init>(r11, r10)
            r0.o = r5
            r0.X = r5
            r0.w0 = r4
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgf.i(gm0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(defpackage.dm0 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.qgf
            if (r0 == 0) goto L_0x0013
            r0 = r12
            qgf r0 = (defpackage.qgf) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            qgf r0 = new qgf
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r6) goto L_0x0036
            if (r2 != r5) goto L_0x002e
            wx3.H(r12)
            goto L_0x00f7
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            dm0 r11 = r0.X
            zgf r10 = r0.o
            wx3.H(r12)
            goto L_0x005d
        L_0x003e:
            wx3.H(r12)
            r0.o = r10
            r0.X = r11
            r0.w0 = r6
            pae r12 = r10.e()
            n3a r12 = (n3a) r12
            ju3 r12 = r12.b()
            ngf r2 = new ngf
            r2.<init>(r10, r4)
            java.lang.Object r12 = xs7.U(r12, r2, r0)
            if (r12 != r1) goto L_0x005d
            return r1
        L_0x005d:
            jm0 r12 = (defpackage.jm0) r12
            boolean r2 = r12.a
            if (r2 != 0) goto L_0x006d
            dhf r10 = new dhf
            r12 = 0
            r10.<init>(r12)
            r11.b(r10)
            return r3
        L_0x006d:
            boolean r2 = r12.b
            if (r2 == 0) goto L_0x0080
            boolean r12 = r12.c
            if (r12 != 0) goto L_0x0080
            ehf r10 = new ehf
            phf r12 = defpackage.phf.REQUEST_ACCESS
            r10.<init>(r12)
            r11.b(r10)
            return r3
        L_0x0080:
            e57 r12 = r10.l
            if (r12 == 0) goto L_0x008c
            s0 r2 = new s0
            r2.<init>()
            r12.b(r2)
        L_0x008c:
            r10.l = r11
            int r12 = defpackage.xea.f
            hge r2 = new hge
            r2.<init>(r12)
            java.lang.String r11 = r11.d
            if (r11 != 0) goto L_0x009b
            java.lang.String r11 = ""
        L_0x009b:
            int r12 = r11.length()
            if (r12 != 0) goto L_0x00a9
            int r11 = defpackage.xea.e
            hge r12 = new hge
            r12.<init>(r11)
            goto L_0x00c0
        L_0x00a9:
            int r12 = r11.length()
            r7 = 128(0x80, float:1.794E-43)
            if (r12 <= r7) goto L_0x00bb
            java.lang.String r11 = h0e.y0(r7, r11)
            lge r12 = new lge
            r12.<init>(r11)
            goto L_0x00c0
        L_0x00bb:
            lge r12 = new lge
            r12.<init>(r11)
        L_0x00c0:
            kc3 r11 = new kc3
            int r7 = defpackage.xea.c
            hge r8 = new hge
            r8.<init>(r7)
            r7 = 3
            r11.<init>(r6, r8, r7, r6)
            kc3 r7 = new kc3
            int r8 = defpackage.xea.d
            hge r9 = new hge
            r9.<init>(r8)
            r7.<init>(r5, r9, r5, r6)
            kc3[] r11 = new defpackage.kc3[]{r11, r7}
            java.util.List r11 = p23.B(r11)
            hcd r10 = r10.j
            agf r6 = new agf
            int r7 = defpackage.phc.B
            r6.<init>(r7, r2, r12, r11)
            r0.o = r4
            r0.X = r4
            r0.w0 = r5
            java.lang.Object r10 = r10.a(r6, r0)
            if (r10 != r1) goto L_0x00f7
            return r1
        L_0x00f7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgf.j(dm0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: em0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0130 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(defpackage.em0 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.rgf
            if (r0 == 0) goto L_0x0013
            r0 = r12
            rgf r0 = (defpackage.rgf) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            rgf r0 = new rgf
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            r4 = 3
            r5 = 2
            r6 = 4
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x005d
            if (r2 == r7) goto L_0x0052
            if (r2 == r5) goto L_0x0047
            if (r2 == r4) goto L_0x003c
            if (r2 != r6) goto L_0x0034
            wx3.H(r12)
            goto L_0x0130
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003c:
            java.lang.Object r10 = r0.X
            java.lang.String r10 = (java.lang.String) r10
            zgf r11 = r0.o
            wx3.H(r12)     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            goto L_0x0130
        L_0x0047:
            java.lang.Object r10 = r0.X
            java.lang.String r10 = (java.lang.String) r10
            zgf r11 = r0.o
            wx3.H(r12)     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            goto L_0x00e6
        L_0x0052:
            java.lang.Object r10 = r0.X
            r11 = r10
            em0 r11 = (defpackage.em0) r11
            zgf r10 = r0.o
            wx3.H(r12)
            goto L_0x008c
        L_0x005d:
            wx3.H(r12)
            boolean r12 = r10.f()
            if (r12 != 0) goto L_0x0070
            dhf r10 = new dhf
            r12 = 0
            r10.<init>(r12)
            r11.b(r10)
            return r3
        L_0x0070:
            pae r12 = r10.e()
            n3a r12 = (n3a) r12
            ju3 r12 = r12.b()
            tgf r2 = new tgf
            r2.<init>(r10, r8)
            r0.o = r10
            r0.X = r11
            r0.w0 = r7
            java.lang.Object r12 = xs7.U(r12, r2, r0)
            if (r12 != r1) goto L_0x008c
            return r1
        L_0x008c:
            ahf r12 = (defpackage.ahf) r12
            if (r12 == 0) goto L_0x0093
            java.lang.String r2 = r12.d
            goto L_0x0094
        L_0x0093:
            r2 = r8
        L_0x0094:
            if (r12 == 0) goto L_0x0131
            if (r2 == 0) goto L_0x0131
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00a0
            goto L_0x0131
        L_0x00a0:
            boolean r2 = r12.e
            if (r2 == 0) goto L_0x00b3
            boolean r12 = r12.f
            if (r12 != 0) goto L_0x00b3
            ehf r10 = new ehf
            phf r12 = defpackage.phf.REQUEST_AUTH
            r10.<init>(r12)
            r11.b(r10)
            return r3
        L_0x00b3:
            e57 r12 = r10.l
            if (r12 == 0) goto L_0x00bf
            s0 r2 = new s0
            r2.<init>()
            r12.b(r2)
        L_0x00bf:
            r10.l = r11
            java.lang.String r11 = r11.d
            java.lang.String r11 = g(r11)
            pae r12 = r10.e()     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            n3a r12 = (n3a) r12     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            ju3 r12 = r12.b()     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            sgf r2 = new sgf     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            r2.<init>(r10, r8)     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            r0.o = r10     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            r0.X = r11     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            r0.w0 = r5     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            java.lang.Object r12 = xs7.U(r12, r2, r0)     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            if (r12 != r1) goto L_0x00e3
            return r1
        L_0x00e3:
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x00e6:
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            wjf r2 = r11.f     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            stf r12 = r2.i(r12)     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            hcd r2 = r11.j     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            yff r5 = new yff     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            zqd r7 = r11.e     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            java.lang.Object r7 = r7.getValue()     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            r5.<init>(r12, r7, r10)     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            r0.o = r11     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            r0.X = r10     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            r0.w0 = r4     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            java.lang.Object r10 = r2.a(r5, r0)     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            if (r10 != r1) goto L_0x0130
            return r1
        L_0x010a:
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x010d:
            java.lang.String r12 = r11.g
            java.lang.String r2 = "Can't webapp auth by biometry with crypto, try without crypto"
            udd.U(r12, r2)
            hcd r12 = r11.j
            yff r2 = new yff
            zqd r11 = r11.e
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            r2.<init>(r8, r11, r10)
            r0.o = r8
            r0.X = r8
            r0.w0 = r6
            java.lang.Object r10 = r12.a(r2, r0)
            if (r10 != r1) goto L_0x0130
            return r1
        L_0x0130:
            return r3
        L_0x0131:
            ghf r10 = new ghf
            r10.<init>()
            r11.b(r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgf.k(em0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: hm0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(defpackage.hm0 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ugf
            if (r0 == 0) goto L_0x0013
            r0 = r10
            ugf r0 = (defpackage.ugf) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            ugf r0 = new ugf
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 == r6) goto L_0x0043
            if (r2 == r5) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            wx3.H(r10)
            goto L_0x00d7
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            hm0 r9 = r0.X
            java.lang.Object r8 = r0.o
            zgf r8 = (defpackage.zgf) r8
            wx3.H(r10)     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            goto L_0x007f
        L_0x0043:
            java.lang.Object r8 = r0.o
            r9 = r8
            hm0 r9 = (defpackage.hm0) r9
            wx3.H(r10)
            goto L_0x00d4
        L_0x004d:
            wx3.H(r10)
            java.lang.String r10 = r9.d
            if (r10 == 0) goto L_0x00ba
            int r10 = r10.length()
            if (r10 != 0) goto L_0x005b
            goto L_0x00ba
        L_0x005b:
            wjf r10 = r8.f     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            java.lang.String r2 = r9.d     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            java.lang.String r10 = r10.b(r2)     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            pae r2 = r8.e()     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            n3a r2 = (n3a) r2     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            ju3 r2 = r2.b()     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            wgf r6 = new wgf     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            r6.<init>(r8, r10, r7)     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            r0.o = r8     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            r0.X = r9     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            r0.w0 = r5     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            java.lang.Object r10 = xs7.U(r2, r6, r0)     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            if (r10 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r9.a(r3)     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            goto L_0x00d7
        L_0x0083:
            java.lang.String r10 = r8.g
            java.lang.String r2 = "Can't update token because need auth by biometry"
            udd.U(r10, r2)
            e57 r10 = r8.l
            if (r10 == 0) goto L_0x0096
            s0 r2 = new s0
            r2.<init>()
            r10.b(r2)
        L_0x0096:
            r8.l = r9
            java.lang.String r9 = r9.e
            java.lang.String r9 = g(r9)
            hcd r10 = r8.j
            yff r2 = new yff
            zqd r8 = r8.e
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r2.<init>(r7, r8, r9)
            r0.o = r7
            r0.X = r7
            r0.w0 = r4
            java.lang.Object r8 = r10.a(r2, r0)
            if (r8 != r1) goto L_0x00d7
            return r1
        L_0x00ba:
            pae r10 = r8.e()
            n3a r10 = (n3a) r10
            ju3 r10 = r10.b()
            vgf r2 = new vgf
            r2.<init>(r8, r9, r7)
            r0.o = r9
            r0.w0 = r6
            java.lang.Object r8 = xs7.U(r10, r2, r0)
            if (r8 != r1) goto L_0x00d4
            return r1
        L_0x00d4:
            r9.a(r3)
        L_0x00d7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgf.l(hm0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
