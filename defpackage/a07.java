package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: a07  reason: default package */
public final class a07 implements d4f {
    public long X;
    public Object Y;
    public long a;
    public long b;
    public String c;
    public String o;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.yz6
            if (r0 == 0) goto L_0x0013
            r0 = r14
            yz6 r0 = (defpackage.yz6) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            yz6 r0 = new yz6
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            a07 r13 = r0.o
            wx3.H(r14)
            goto L_0x0080
        L_0x002a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0032:
            wx3.H(r14)
            java.lang.String r14 = r13.o
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0061
            tn7 r5 = defpackage.tn7.X
            long r6 = r13.a
            java.lang.String r8 = r13.c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Fetch video. Internal fetcher, videoId:"
            r9.<init>(r10)
            r9.append(r6)
            java.lang.String r6 = ", token:"
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            r2.d(r5, r14, r6, r4)
        L_0x0061:
            java.lang.Object r14 = r13.Y
            pk r14 = (defpackage.pk) r14
            bm9 r2 = new bm9
            long r7 = r13.a
            long r9 = r13.b
            long r11 = r13.X
            java.lang.String r6 = r13.c
            r5 = r2
            r5.<init>(r6, r7, r9, r11)
            r0.o = r13
            r0.Z = r3
            gy9 r14 = (defpackage.gy9) r14
            java.lang.Object r14 = r14.K(r2, r0)
            if (r14 != r1) goto L_0x0080
            return r1
        L_0x0080:
            g7f r14 = (defpackage.g7f) r14
            java.lang.String r13 = r13.o
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x0089
            goto L_0x00a2
        L_0x0089:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x00a2
            tn7 r1 = defpackage.tn7.X
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Fetch video. Internal fetcher, response:"
            r2.<init>(r5)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r0.d(r1, r13, r2, r4)
        L_0x00a2:
            lg7 r13 = hwf.c()
            java.util.Map r0 = r14.c
            java.lang.String r1 = "DASH"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x00b5
            r0 = r1
        L_0x00b5:
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x00c4
            wb5 r2 = new wb5
            r5 = 2
            r2.<init>(r5, r0)
            r13.add(r2)
        L_0x00c4:
            java.util.Map r0 = r14.c
            java.lang.String r2 = "HLS"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r1 = r0
        L_0x00d2:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00e0
            wb5 r0 = new wb5
            r0.<init>(r3, r1)
            r13.add(r0)
        L_0x00e0:
            java.util.Map r14 = r14.c
            java.util.Set r14 = r14.entrySet()
            es r0 = new es
            r1 = 2
            r0.<init>(r1, r14)
            xz6 r14 = new xz6
            r1 = 0
            r14.<init>(r1)
            sg5 r14 = myc.L(r0, r14)
            gu6 r0 = new gu6
            r1 = 3
            r0.<init>(r1)
            ij4 r1 = new ij4
            r2 = 3
            r1.<init>(r14, r2, r0)
            xz6 r14 = new xz6
            r0 = 1
            r14.<init>(r0)
            vqe r0 = new vqe
            r0.<init>(r1, r14)
            java.util.List r14 = myc.U(r0)
            r13.addAll(r14)
            lg7 r13 = hwf.a(r13)
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x011f
            goto L_0x0124
        L_0x011f:
            yb5 r4 = new yb5
            r4.<init>(r13)
        L_0x0124:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a07.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void b(Object obj, String str) {
        if (((HashMap) this.Y) == null) {
            this.Y = new HashMap();
        }
        ((HashMap) this.Y).put(str, obj);
    }

    public void c(Map map) {
        if (map != null && !map.isEmpty()) {
            if (((HashMap) this.Y) == null) {
                this.Y = new HashMap();
            }
            ((HashMap) this.Y).putAll(map);
        }
    }

    public ln7 d() {
        if (r1g.p(this.c) || r1g.p(this.o)) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        HashMap hashMap = (HashMap) this.Y;
        if (hashMap == null || hashMap.size() <= 10) {
            if (this.a == 0) {
                this.a = System.currentTimeMillis();
            }
            return new ln7(this.a, this.b, this.X, this.c, this.o, (HashMap) this.Y);
        }
        throw new IllegalArgumentException("params can't be greater than limit = 10");
    }
}
