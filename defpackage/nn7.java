package defpackage;

/* renamed from: nn7  reason: default package */
public final class nn7 {
    public static final ThreadLocal h = new ThreadLocal();
    public final tn7 a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final Throwable f;
    public final t97 g = ez3.O(2, new jn7(this, 1));

    public nn7(tn7 tn7, String str, String str2, String str3, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = tn7;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = currentTimeMillis;
        this.f = th;
        ez3.O(2, new jn7(this, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.nn7) r8;
        r1 = r8.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.nn7
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            nn7 r8 = (defpackage.nn7) r8
            tn7 r1 = r8.a
            tn7 r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            long r3 = r7.e
            long r5 = r8.e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x003d
            return r2
        L_0x003d:
            java.lang.Throwable r7 = r7.f
            java.lang.Throwable r8 = r8.f
            boolean r7 = hhd.f(r7, r8)
            if (r7 != 0) goto L_0x0048
            return r2
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int m = sxe.m(me4.d((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
        Throwable th = this.f;
        if (th != null) {
            i = th.hashCode();
        }
        return m + i;
    }

    public final String toString() {
        return "LogEntry(level=" + this.a + ", tag=" + this.b + ", message=" + this.c + ", threadName=" + this.d + ", time=" + this.e + ", throwable=" + this.f + ")";
    }
}
