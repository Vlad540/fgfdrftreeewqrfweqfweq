package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h6e  reason: default package */
public final class h6e {
    public final zpe a;
    public final String b = h6e.class.getName();
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final tc9 h;
    public final jc9 i;

    public h6e(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, zpe zpe) {
        this.a = zpe;
        this.c = t97;
        this.d = t972;
        this.e = t973;
        this.f = t974;
        this.g = t975;
        this.h = uc9.a();
        long[] jArr = llc.a;
        this.i = new jc9();
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [vve, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.h6e r4, defpackage.fwe r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.o5e
            if (r0 == 0) goto L_0x0013
            r0 = r6
            o5e r0 = (defpackage.o5e) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            o5e r0 = new o5e
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            fwe r5 = r0.X
            h6e r4 = r0.o
            wx3.H(r6)     // Catch:{ all -> 0x002b }
            goto L_0x0067
        L_0x002b:
            r6 = move-exception
            goto L_0x006a
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            wx3.H(r6)
            t97 r6 = r4.f     // Catch:{ all -> 0x002b }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x002b }
            zxe r6 = (defpackage.zxe) r6     // Catch:{ all -> 0x002b }
            ax7 r6 = r6.d(r5)     // Catch:{ all -> 0x002b }
            r0.o = r4     // Catch:{ all -> 0x002b }
            r0.X = r5     // Catch:{ all -> 0x002b }
            r0.w0 = r3     // Catch:{ all -> 0x002b }
            zv1 r2 = new zv1     // Catch:{ all -> 0x002b }
            kotlin.coroutines.Continuation r0 = urd.y(r0)     // Catch:{ all -> 0x002b }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x002b }
            r2.n()     // Catch:{ all -> 0x002b }
            kic r0 = new kic     // Catch:{ all -> 0x002b }
            r3 = 2
            r0.<init>(r2, r3)     // Catch:{ all -> 0x002b }
            r6.a(r0)     // Catch:{ all -> 0x002b }
            java.lang.Object r6 = r2.m()     // Catch:{ all -> 0x002b }
            if (r6 != r1) goto L_0x0067
            goto L_0x00f5
        L_0x0067:
            wve r6 = (defpackage.wve) r6     // Catch:{ all -> 0x002b }
            goto L_0x0070
        L_0x006a:
            kcc r0 = new kcc
            r0.<init>(r6)
            r6 = r0
        L_0x0070:
            boolean r0 = r6 instanceof kcc
            r1 = 0
            if (r0 == 0) goto L_0x0076
            r6 = r1
        L_0x0076:
            wve r6 = (defpackage.wve) r6
            if (r6 != 0) goto L_0x00d4
            java.lang.String r4 = r4.b
            fn6 r6 = udd.e
            if (r6 != 0) goto L_0x0081
            goto L_0x008e
        L_0x0081:
            boolean r0 = r6.c()
            if (r0 == 0) goto L_0x008e
            tn7 r0 = defpackage.tn7.X
            java.lang.String r2 = "No upload in repository, created new"
            r6.d(r0, r4, r2, r1)
        L_0x008e:
            vve r4 = new vve
            r4.<init>()
            rxe r6 = defpackage.rxe.UNKNOWN
            r4.g = r6
            r4.a = r5
            rxe r6 = defpackage.rxe.UPLOADING
            r4.g = r6
            java.lang.String r5 = r5.a
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00ad }
            r6.<init>(r5)     // Catch:{ all -> 0x00ad }
            long r5 = r6.length()     // Catch:{ all -> 0x00ad }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00ad }
            goto L_0x00b4
        L_0x00ad:
            r5 = move-exception
            kcc r6 = new kcc
            r6.<init>(r5)
            r5 = r6
        L_0x00b4:
            r0 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            boolean r0 = r5 instanceof kcc
            if (r0 == 0) goto L_0x00bf
            r5 = r6
        L_0x00bf:
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            r4.f = r5
            long r5 = java.lang.System.currentTimeMillis()
            r4.i = r5
            wve r5 = new wve
            r5.<init>(r4)
            r1 = r5
            goto L_0x00f5
        L_0x00d4:
            java.lang.String r4 = r4.b
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x00db
            goto L_0x00f4
        L_0x00db:
            boolean r0 = r5.c()
            if (r0 == 0) goto L_0x00f4
            tn7 r0 = defpackage.tn7.X
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Found upload in repository = "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.d(r0, r4, r2, r1)
        L_0x00f4:
            r1 = r6
        L_0x00f5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6e.a(h6e, fwe, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r10v9, types: [java.lang.Object, pxe] */
    /* JADX WARNING: type inference failed for: r10v12, types: [java.lang.Object, pxe] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.h6e r8, defpackage.wve r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof defpackage.q5e
            if (r0 == 0) goto L_0x0016
            r0 = r10
            q5e r0 = (defpackage.q5e) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            q5e r0 = new q5e
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            wve r9 = r0.o
            wx3.H(r10)
            goto L_0x00f0
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            wx3.H(r10)
            java.lang.String r10 = r9.d
            r2 = 0
            if (r10 == 0) goto L_0x0067
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0044
            goto L_0x0067
        L_0x0044:
            java.lang.String r8 = r8.b
            fn6 r10 = udd.e
            if (r10 != 0) goto L_0x004c
            goto L_0x0184
        L_0x004c:
            boolean r0 = r10.c()
            if (r0 == 0) goto L_0x0184
            tn7 r0 = defpackage.tn7.X
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "requestUploadUrl: already has upload url for="
            r1.<init>(r3)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r10.d(r0, r8, r1, r2)
            goto L_0x0184
        L_0x0067:
            java.lang.String r10 = r8.b
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x006e
            goto L_0x0087
        L_0x006e:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0087
            tn7 r5 = defpackage.tn7.X
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "requestUploadUrl: requesting uploadUrl for="
            r6.<init>(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r4.d(r5, r10, r6, r2)
        L_0x0087:
            t97 r10 = r8.c
            java.lang.Object r10 = r10.getValue()
            pk r10 = (defpackage.pk) r10
            fwe r10 = r9.a
            int r10 = r10.c
            int r4 = hr1.t(r10)
            switch(r4) {
                case 1: goto L_0x00d6;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00ce;
                case 7: goto L_0x00b1;
                case 8: goto L_0x00aa;
                default: goto L_0x009a;
            }
        L_0x009a:
            one.me.sdk.transfer.domain.UploadException r8 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r9 = defpackage.sxe.s(r10)
            java.lang.String r10 = "tamRequestFromUploadType, can't request url for unknown media type="
            java.lang.String r9 = r10.concat(r9)
            r8.<init>(r9)
            throw r8
        L_0x00aa:
            bm9 r10 = new bm9
            r2 = 2
            r10.<init>((int) r2, (int) r3)
            goto L_0x00db
        L_0x00b1:
            bm9 r10 = new bm9
            r4 = 11
            r10.<init>((defpackage.dfa) r2, (int) r4)
            goto L_0x00db
        L_0x00b9:
            bm9 r10 = new bm9
            r2 = 3
            r10.<init>((int) r2, (int) r3)
            goto L_0x00db
        L_0x00c0:
            pn2 r10 = new pn2
            r10.<init>()
            goto L_0x00db
        L_0x00c6:
            bm9 r10 = new bm9
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r10.<init>((java.lang.Boolean) r2)
            goto L_0x00db
        L_0x00ce:
            bm9 r10 = new bm9
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r10.<init>((java.lang.Boolean) r2)
            goto L_0x00db
        L_0x00d6:
            bm9 r10 = new bm9
            r10.<init>((int) r3, (int) r3)
        L_0x00db:
            int r2 = zp4.o
            eq4 r2 = eq4.o
            long r4 = mt0.P(r3, r2)
            r0.o = r9
            r0.Z = r3
            java.lang.Object r10 = r8.i(r10, r4, r0)
            if (r10 != r1) goto L_0x00f0
            r9 = r1
            goto L_0x0184
        L_0x00f0:
            lbe r10 = (defpackage.lbe) r10
            boolean r8 = r10 instanceof defpackage.x8f
            r0 = 0
            if (r8 == 0) goto L_0x012d
            x8f r10 = (defpackage.x8f) r10
            java.util.ArrayList r8 = r10.c
            if (r8 == 0) goto L_0x0102
            java.util.List r8 = o23.s0(r8)
            goto L_0x0104
        L_0x0102:
            hw4 r8 = hw4.a
        L_0x0104:
            java.lang.Object r8 = r8.get(r0)
            y8f r8 = (defpackage.y8f) r8
            vve r9 = r9.b()
            java.lang.String r10 = r8.a
            r9.d = r10
            pxe r10 = new pxe
            r10.<init>()
            java.lang.String r0 = r8.c
            r10.a = r0
            long r0 = r8.b
            r10.b = r0
            qxe r8 = new qxe
            r8.<init>(r10)
            r9.h = r8
            wve r8 = new wve
            r8.<init>(r9)
        L_0x012b:
            r9 = r8
            goto L_0x0184
        L_0x012d:
            boolean r8 = r10 instanceof defpackage.of5
            if (r8 == 0) goto L_0x015d
            of5 r10 = (defpackage.of5) r10
            java.util.List r8 = r10.c
            java.lang.Object r8 = r8.get(r0)
            pf5 r8 = (defpackage.pf5) r8
            vve r9 = r9.b()
            java.lang.String r10 = r8.c
            r9.d = r10
            pxe r10 = new pxe
            r10.<init>()
            java.lang.String r0 = r8.b
            r10.a = r0
            long r0 = r8.a
            r10.b = r0
            qxe r8 = new qxe
            r8.<init>(r10)
            r9.h = r8
            wve r8 = new wve
            r8.<init>(r9)
            goto L_0x012b
        L_0x015d:
            boolean r8 = r10 instanceof defpackage.qpa
            if (r8 == 0) goto L_0x0171
            vve r8 = r9.b()
            qpa r10 = (defpackage.qpa) r10
            java.lang.String r9 = r10.c
            r8.d = r9
            wve r9 = new wve
            r9.<init>(r8)
            goto L_0x0184
        L_0x0171:
            boolean r8 = r10 instanceof defpackage.tud
            if (r8 == 0) goto L_0x0185
            vve r8 = r9.b()
            tud r10 = (defpackage.tud) r10
            java.lang.String r9 = r10.c
            r8.d = r9
            wve r9 = new wve
            r9.<init>(r8)
        L_0x0184:
            return r9
        L_0x0185:
            one.me.sdk.transfer.domain.UploadException r8 = new one.me.sdk.transfer.domain.UploadException
            fwe r9 = r9.a
            int r9 = r9.c
            java.lang.String r9 = defpackage.sxe.s(r9)
            java.lang.String r10 = "can't request url for unknown media type="
            java.lang.String r9 = r10.concat(r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6e.b(h6e, wve, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b6, code lost:
        if (r7 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.h6e r5, java.lang.Throwable r6, kotlin.coroutines.Continuation r7) {
        /*
            r0 = 1
            r5.getClass()
            boolean r1 = r7 instanceof defpackage.s5e
            if (r1 == 0) goto L_0x0017
            r1 = r7
            s5e r1 = (defpackage.s5e) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.Y = r2
            goto L_0x001c
        L_0x0017:
            s5e r1 = new s5e
            r1.<init>(r5, r7)
        L_0x001c:
            java.lang.Object r7 = r1.o
            pu3 r2 = pu3.a
            int r3 = r1.Y
            r4 = 2
            if (r3 == 0) goto L_0x003a
            if (r3 == r0) goto L_0x0036
            if (r3 != r4) goto L_0x002e
            wx3.H(r7)
            goto L_0x00d1
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            wx3.H(r7)
            goto L_0x0085
        L_0x003a:
            wx3.H(r7)
            t97 r7 = r5.e
            java.lang.Object r7 = r7.getValue()
            f3d r7 = (defpackage.f3d) r7
            h3d r7 = (defpackage.h3d) r7
            int r7 = r7.h
            boolean r7 = defpackage.lce.a(r7)
            if (r7 != 0) goto L_0x0088
            java.lang.String r6 = r5.b
            java.lang.String r7 = "shouldRetryOnException: no connection, await for connection available"
            udd.q(r6, r7)
            t97 r6 = r5.e
            java.lang.Object r6 = r6.getValue()
            f3d r6 = (defpackage.f3d) r6
            h3d r6 = (defpackage.h3d) r6
            jk0 r6 = r6.e
            zl3 r7 = defpackage.zl3.X
            r6.getClass()
            ps9 r3 = new ps9
            r3.<init>(r6, r7, r0)
            c9 r6 = new c9
            r7 = 23
            r6.<init>(r7, r5)
            gf6 r5 = z3d.j
            z26 r7 = z3d.i
            kt9 r4 = new kt9
            r4.<init>(r3, r6, r5, r7)
            r1.Y = r0
            java.lang.Object r5 = e07.e(r4, r1)
            if (r5 != r2) goto L_0x0085
            goto L_0x00d5
        L_0x0085:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L_0x00d5
        L_0x0088:
            boolean r7 = r6 instanceof one.me.sdk.transfer.exceptions.HttpUrlExpiredException
            r3 = 0
            if (r7 == 0) goto L_0x0096
            java.lang.String r5 = r5.b
            java.lang.String r6 = "shouldRetryOnException: skipped retry on TamHttpUrlExpiredException"
            udd.U(r5, r6)
        L_0x0094:
            r0 = r3
            goto L_0x00d1
        L_0x0096:
            boolean r7 = r6 instanceof one.me.sdk.transfer.exceptions.HttpErrorException
            if (r7 == 0) goto L_0x00b9
            r7 = r6
            one.me.sdk.transfer.exceptions.HttpErrorException r7 = (one.me.sdk.transfer.exceptions.HttpErrorException) r7
            am6 r7 = r7.a
            boolean r7 = defpackage.pa2.v(r7)
            java.lang.String r5 = r5.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "shouldRetryOnException: error isCritical="
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            udd.s(r5, r1, r6)
            if (r7 != 0) goto L_0x0094
            goto L_0x00d1
        L_0x00b9:
            java.lang.String r5 = r5.b
            java.lang.String r7 = "shouldRetryOnException: can retry error"
            udd.S(r5, r7, r6)
            int r5 = zp4.o
            eq4 r5 = eq4.o
            long r5 = mt0.P(r0, r5)
            r1.Y = r4
            java.lang.Object r5 = defpackage.ek8.r(r5, r1)
            if (r5 != r2) goto L_0x00d1
            goto L_0x00d5
        L_0x00d1:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x00d5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6e.c(h6e, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.fwe r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.m5e
            if (r0 == 0) goto L_0x0013
            r0 = r11
            m5e r0 = (defpackage.m5e) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            m5e r0 = new m5e
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r5) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            wx3.H(r11)
            goto L_0x0078
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            fwe r10 = r0.X
            h6e r9 = r0.o
            wx3.H(r11)
            goto L_0x006b
        L_0x003b:
            wx3.H(r11)
            java.lang.String r11 = r9.b
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x0045
            goto L_0x005e
        L_0x0045:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x005e
            tn7 r6 = defpackage.tn7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Cancelling upload="
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r2.d(r6, r11, r7, r3)
        L_0x005e:
            r0.o = r9
            r0.X = r10
            r0.w0 = r5
            java.lang.Object r11 = r9.h(r10, r0)
            if (r11 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r0.o = r3
            r0.X = r3
            r0.w0 = r4
            java.lang.Object r9 = r9.g(r10, r0)
            if (r9 != r1) goto L_0x0078
            return r1
        L_0x0078:
            jue r9 = jue.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6e.d(fwe, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.wve r9, defpackage.eq3 r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.n5e
            if (r0 == 0) goto L_0x0013
            r0 = r11
            n5e r0 = (defpackage.n5e) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            n5e r0 = new n5e
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            eq3 r10 = r0.Y
            wve r9 = r0.X
            h6e r8 = r0.o
            wx3.H(r11)
            goto L_0x006b
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            wx3.H(r11)
            java.lang.String r11 = r8.b
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x0040
            goto L_0x0055
        L_0x0040:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0055
            tn7 r5 = defpackage.tn7.X
            fwe r6 = r9.a
            java.lang.String r6 = r6.a
            java.lang.String r7 = "copyFromUri: started for uri="
            java.lang.String r6 = defpackage.rf0.h(r7, r6)
            r2.d(r5, r11, r6, r3)
        L_0x0055:
            k61 r11 = new k61
            r2 = 12
            r11.<init>(r8, r9, r10, r2)
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.x0 = r4
            java.lang.Object r11 = udd.M(r11, r0)
            if (r11 != r1) goto L_0x006b
            return r1
        L_0x006b:
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = defpackage.zl3.f(r11)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r8 = r8.b
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x007a
            goto L_0x008f
        L_0x007a:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x008f
            tn7 r1 = defpackage.tn7.X
            fwe r2 = r9.a
            java.lang.String r2 = r2.a
            java.lang.String r4 = "copyFromUri: finished for uri="
            java.lang.String r2 = defpackage.rf0.h(r4, r2)
            r0.d(r1, r8, r2, r3)
        L_0x008f:
            vve r8 = r9.b()
            r8.b = r11
            java.lang.String r9 = r10.c
            r8.c = r9
            long r9 = r10.b
            r8.f = r9
            wve r9 = new wve
            r9.<init>(r8)
            return r9
        L_0x00a3:
            one.me.sdk.transfer.domain.UploadException r8 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r9 = "failed to copy file"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6e.e(wve, eq3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object f(wve wve, Continuation continuation) {
        String str = this.b;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "putInRepository: started for=" + wve, (Throwable) null);
        }
        Object c2 = e07.c(((zxe) this.f.getValue()).a(wve), continuation);
        return c2 == pu3.a ? c2 : jue.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(defpackage.fwe r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.p5e
            if (r0 == 0) goto L_0x0013
            r0 = r6
            p5e r0 = (defpackage.p5e) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            p5e r0 = new p5e
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            tc9 r4 = r0.Y
            fwe r5 = r0.X
            h6e r0 = r0.o
            wx3.H(r6)
            r6 = r4
            r4 = r0
            goto L_0x004b
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            wx3.H(r6)
            r0.o = r4
            r0.X = r5
            tc9 r6 = r4.h
            r0.Y = r6
            r0.x0 = r3
            java.lang.Object r0 = r6.d(r0)
            if (r0 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = 0
            jc9 r4 = r4.i     // Catch:{ all -> 0x0058 }
            java.lang.Object r4 = r4.i(r5)     // Catch:{ all -> 0x0058 }
            pj5 r4 = (pj5) r4     // Catch:{ all -> 0x0058 }
            r6.e(r0)
            return r4
        L_0x0058:
            r4 = move-exception
            r6.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6e.g(fwe, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object h(fwe fwe, Continuation continuation) {
        String str = this.b;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "removeFromRepository: started for=" + fwe, (Throwable) null);
        }
        Object c2 = e07.c(((zxe) this.f.getValue()).c(fwe), continuation);
        return c2 == pu3.a ? c2 : jue.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0116 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(defpackage.ibe r18, long r19, kotlin.coroutines.Continuation r21) {
        /*
            r17 = this;
            r0 = r21
            boolean r1 = r0 instanceof defpackage.r5e
            if (r1 == 0) goto L_0x0017
            r1 = r0
            r5e r1 = (defpackage.r5e) r1
            int r2 = r1.y0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.y0 = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            r5e r1 = new r5e
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.w0
            pu3 r3 = pu3.a
            int r4 = r1.y0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0053
            if (r4 == r7) goto L_0x0045
            if (r4 == r6) goto L_0x0038
            if (r4 != r5) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            long r8 = r1.Z
            lbe r2 = r1.Y
            ibe r4 = r1.X
            h6e r10 = r1.o
            wx3.H(r0)
            goto L_0x0102
        L_0x0045:
            long r8 = r1.Z
            lbe r2 = r1.Y
            ibe r4 = r1.X
            h6e r10 = r1.o
            wx3.H(r0)     // Catch:{ all -> 0x0051 }
            goto L_0x0080
        L_0x0051:
            r0 = move-exception
            goto L_0x0094
        L_0x0053:
            wx3.H(r0)
            r0 = 0
            r8 = r19
            r10 = r0
            r4 = r1
            r1 = r18
        L_0x005d:
            t97 r0 = r2.c     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0092 }
            pk r0 = (defpackage.pk) r0     // Catch:{ all -> 0x0092 }
            r4.o = r2     // Catch:{ all -> 0x0092 }
            r4.X = r1     // Catch:{ all -> 0x0092 }
            r4.Y = r10     // Catch:{ all -> 0x0092 }
            r4.Z = r8     // Catch:{ all -> 0x0092 }
            r4.y0 = r7     // Catch:{ all -> 0x0092 }
            gy9 r0 = (defpackage.gy9) r0     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r0.K(r1, r4)     // Catch:{ all -> 0x0092 }
            if (r0 != r3) goto L_0x0078
            return r3
        L_0x0078:
            r15 = r4
            r4 = r1
            r1 = r15
            r16 = r10
            r10 = r2
            r2 = r16
        L_0x0080:
            lbe r0 = (defpackage.lbe) r0     // Catch:{ all -> 0x0051 }
            r2 = r10
            r10 = r0
            r15 = r4
            r4 = r1
            r1 = r15
            goto L_0x010a
        L_0x0089:
            r15 = r4
            r4 = r1
            r1 = r15
            r16 = r10
            r10 = r2
            r2 = r16
            goto L_0x0094
        L_0x0092:
            r0 = move-exception
            goto L_0x0089
        L_0x0094:
            boolean r11 = defpackage.lce.d(r0)
            if (r11 == 0) goto L_0x00eb
            t97 r11 = r10.e
            java.lang.Object r11 = r11.getValue()
            f3d r11 = (defpackage.f3d) r11
            h3d r11 = (defpackage.h3d) r11
            int r11 = r11.h
            boolean r11 = defpackage.lce.a(r11)
            if (r11 != 0) goto L_0x00eb
            java.lang.String r0 = r10.b
            java.lang.String r11 = "retry api request: no connection, await for connection available"
            udd.q(r0, r11)
            t97 r0 = r10.e
            java.lang.Object r0 = r0.getValue()
            f3d r0 = (defpackage.f3d) r0
            h3d r0 = (defpackage.h3d) r0
            jk0 r0 = r0.e
            oa2 r11 = defpackage.oa2.Y
            r0.getClass()
            ps9 r12 = new ps9
            r13 = 1
            r12.<init>(r0, r11, r13)
            gvf r0 = new gvf
            r11 = 28
            r0.<init>(r11, r10)
            gf6 r11 = z3d.j
            z26 r13 = z3d.i
            kt9 r14 = new kt9
            r14.<init>(r12, r0, r11, r13)
            r1.o = r10
            r1.X = r4
            r1.Y = r2
            r1.Z = r8
            r1.y0 = r6
            java.lang.Object r0 = e07.e(r14, r1)
            if (r0 != r3) goto L_0x0102
            return r3
        L_0x00eb:
            boolean r11 = defpackage.lce.c(r0)
            if (r11 == 0) goto L_0x0123
            r1.o = r10
            r1.X = r4
            r1.Y = r2
            r1.Z = r8
            r1.y0 = r5
            java.lang.Object r0 = defpackage.ek8.r(r8, r1)
            if (r0 != r3) goto L_0x0102
            return r3
        L_0x0102:
            r15 = r4
            r4 = r1
            r1 = r15
            r16 = r10
            r10 = r2
            r2 = r16
        L_0x010a:
            hu3 r0 = r4.b
            boolean r0 = lp.u(r0)
            if (r0 == 0) goto L_0x0114
            if (r10 == 0) goto L_0x005d
        L_0x0114:
            if (r10 == 0) goto L_0x0117
            return r10
        L_0x0117:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0123:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6e.i(ibe, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
