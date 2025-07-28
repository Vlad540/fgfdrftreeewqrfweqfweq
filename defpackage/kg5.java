package defpackage;

/* renamed from: kg5  reason: default package */
public final class kg5 implements d4f, ws1 {
    public long a;
    public Object b;
    public Object c;

    public kg5() {
        this.b = new ws4(this);
        this.c = new ws4(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.ig5
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ig5 r0 = (defpackage.ig5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            ig5 r0 = new ig5
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r9)
            goto L_0x0068
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002f:
            wx3.H(r9)
            java.lang.Object r9 = r8.c
            java.lang.String r9 = (java.lang.String) r9
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x003b
            goto L_0x004f
        L_0x003b:
            boolean r4 = r2.c()
            if (r4 == 0) goto L_0x004f
            tn7 r4 = defpackage.tn7.X
            long r5 = r8.a
            java.lang.String r7 = "Fetch video. File fetcher, fileId "
            java.lang.String r5 = defpackage.us8.i(r5, r7)
            r6 = 0
            r2.d(r4, r9, r5, r6)
        L_0x004f:
            java.lang.Object r9 = r8.b
            pk r9 = (defpackage.pk) r9
            pn2 r2 = new pn2
            long r4 = r8.a
            r8 = 14
            r6 = 0
            r2.<init>(r4, r8, r6)
            r0.Y = r3
            gy9 r9 = (defpackage.gy9) r9
            java.lang.Object r9 = r9.K(r2, r0)
            if (r9 != r1) goto L_0x0068
            return r1
        L_0x0068:
            pd5 r9 = (defpackage.pd5) r9
            wb5 r8 = new wb5
            java.lang.String r9 = r9.c
            r0 = 3
            r8.<init>(r0, r9)
            yb5 r9 = new yb5
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg5.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public s9e e() {
        return (s9e) this.c;
    }

    public us1 f() {
        ws1 ws1 = (ws1) this.b;
        return ws1 != null ? ws1.f() : us1.a;
    }

    public int g() {
        ws1 ws1 = (ws1) this.b;
        if (ws1 != null) {
            return ws1.g();
        }
        return 1;
    }

    public long getTimestamp() {
        ws1 ws1 = (ws1) this.b;
        if (ws1 != null) {
            return ws1.getTimestamp();
        }
        long j = this.a;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    public ss1 m() {
        ws1 ws1 = (ws1) this.b;
        return ws1 != null ? ws1.m() : ss1.a;
    }

    public ts1 s() {
        ws1 ws1 = (ws1) this.b;
        return ws1 != null ? ws1.s() : ts1.a;
    }

    public kg5(ws1 ws1, s9e s9e, long j) {
        this.b = ws1;
        this.c = s9e;
        this.a = j;
    }
}
