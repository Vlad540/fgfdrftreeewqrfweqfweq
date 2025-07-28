package defpackage;

/* renamed from: e57  reason: default package */
public abstract class e57 implements h57 {
    public final us0 a = xs7.a(Integer.MAX_VALUE, 0, 6);
    public final a73 b = z3d.a();

    public final void a(Object obj) {
        this.a.i((Throwable) null);
        this.b.makeCompleting$kotlinx_coroutines_core(new mcc(obj));
    }

    public final void b(Throwable th) {
        this.a.i((Throwable) null);
        a73 a73 = this.b;
        a73.getClass();
        a73.makeCompleting$kotlinx_coroutines_core(new r73(th, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[Catch:{ all -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(i26 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.a57
            if (r0 == 0) goto L_0x0013
            r0 = r7
            a57 r0 = (defpackage.a57) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            a57 r0 = new a57
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r5 = r0.o
            e57 r5 = (defpackage.e57) r5
            wx3.H(r7)     // Catch:{ all -> 0x006c }
            goto L_0x006c
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            e57 r5 = r0.X
            java.lang.Object r6 = r0.o
            i26 r6 = (i26) r6
            wx3.H(r7)     // Catch:{ all -> 0x006c }
            goto L_0x0052
        L_0x0040:
            wx3.H(r7)
            a73 r7 = r5.b     // Catch:{ all -> 0x006c }
            r0.o = r6     // Catch:{ all -> 0x006c }
            r0.X = r5     // Catch:{ all -> 0x006c }
            r0.w0 = r4     // Catch:{ all -> 0x006c }
            java.lang.Object r7 = r7.awaitInternal(r0)     // Catch:{ all -> 0x006c }
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            mcc r7 = (mcc) r7     // Catch:{ all -> 0x006c }
            java.lang.Object r7 = r7.a     // Catch:{ all -> 0x006c }
            boolean r2 = r7 instanceof kcc     // Catch:{ all -> 0x006c }
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x006c
            wx3.H(r7)     // Catch:{ all -> 0x006c }
            r0.o = r5     // Catch:{ all -> 0x006c }
            r2 = 0
            r0.X = r2     // Catch:{ all -> 0x006c }
            r0.w0 = r3     // Catch:{ all -> 0x006c }
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch:{ all -> 0x006c }
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e57.c(i26, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(i26 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.b57
            if (r0 == 0) goto L_0x0013
            r0 = r8
            b57 r0 = (defpackage.b57) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            b57 r0 = new b57
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.o
            e57 r6 = (defpackage.e57) r6
            wx3.H(r8)
            goto L_0x00a9
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            java.lang.Object r6 = r0.X
            e57 r6 = (defpackage.e57) r6
            java.lang.Object r7 = r0.o
            i26 r7 = (i26) r7
            wx3.H(r8)     // Catch:{ all -> 0x0046 }
            goto L_0x008d
        L_0x0046:
            r8 = move-exception
            goto L_0x0090
        L_0x0048:
            java.lang.Object r6 = r0.X
            e57 r6 = (defpackage.e57) r6
            java.lang.Object r7 = r0.o
            i26 r7 = (i26) r7
            wx3.H(r8)     // Catch:{ all -> 0x0046 }
            goto L_0x0066
        L_0x0054:
            wx3.H(r8)
            a73 r8 = r6.b     // Catch:{ all -> 0x0046 }
            r0.o = r7     // Catch:{ all -> 0x0046 }
            r0.X = r6     // Catch:{ all -> 0x0046 }
            r0.w0 = r5     // Catch:{ all -> 0x0046 }
            java.lang.Object r8 = r8.awaitInternal(r0)     // Catch:{ all -> 0x0046 }
            if (r8 != r1) goto L_0x0066
            return r1
        L_0x0066:
            mcc r8 = (mcc) r8     // Catch:{ all -> 0x0046 }
            java.lang.Object r8 = r8.a     // Catch:{ all -> 0x0046 }
            boolean r2 = r8 instanceof kcc     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x008d
            java.lang.Throwable r8 = mcc.a(r8)     // Catch:{ all -> 0x0046 }
            if (r8 == 0) goto L_0x0081
            r0.o = r7     // Catch:{ all -> 0x0046 }
            r0.X = r6     // Catch:{ all -> 0x0046 }
            r0.w0 = r4     // Catch:{ all -> 0x0046 }
            java.lang.Object r8 = r7.invoke(r8, r0)     // Catch:{ all -> 0x0046 }
            if (r8 != r1) goto L_0x008d
            return r1
        L_0x0081:
            java.lang.String r8 = "Required value was null."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0046 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0046 }
            r2.<init>(r8)     // Catch:{ all -> 0x0046 }
            throw r2     // Catch:{ all -> 0x0046 }
        L_0x008d:
            jue r8 = jue.a     // Catch:{ all -> 0x0046 }
            goto L_0x0096
        L_0x0090:
            kcc r2 = new kcc
            r2.<init>(r8)
            r8 = r2
        L_0x0096:
            java.lang.Throwable r2 = mcc.a(r8)
            if (r2 == 0) goto L_0x00a9
            r0.o = r6
            r0.X = r8
            r0.w0 = r3
            java.lang.Object r7 = r7.invoke(r2, r0)
            if (r7 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e57.d(i26, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.jjf r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.c57
            if (r0 == 0) goto L_0x0013
            r0 = r6
            c57 r0 = (defpackage.c57) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            c57 r0 = new c57
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            e57 r4 = r0.o
            wx3.H(r6)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            wx3.H(r6)
            d57 r6 = new d57
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.o = r4
            r0.Z = r3
            java.lang.Object r5 = n1g.f(r6, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e57.e(jjf, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
