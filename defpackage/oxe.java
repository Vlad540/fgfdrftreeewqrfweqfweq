package defpackage;

import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import one.me.sdk.transfer.exceptions.HttpErrorException;

/* renamed from: oxe  reason: default package */
public final class oxe {
    public static final lg8 h = oyb.A("application/octet-stream");
    public final long a;
    public final int b;
    public final String c = oxe.class.getName();
    public final t97 d;
    public final tc9 e;
    public final ec9 f;
    public final long g;

    static {
        Pattern pattern = lg8.d;
    }

    public oxe(t97 t97, zpe zpe, long j, int i) {
        this.a = j;
        this.b = i;
        this.d = t97;
        this.e = uc9.a();
        this.f = new ec9();
        int i2 = zc3.$EnumSwitchMapping$0[zpe.c().ordinal()];
        this.g = (i2 == 1 || i2 == 2) ? 2097152 : i2 != 3 ? 16384 : 32768;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.jxe
            if (r0 == 0) goto L_0x0013
            r0 = r5
            jxe r0 = (defpackage.jxe) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            jxe r0 = new jxe
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            tc9 r4 = r0.X
            oxe r0 = r0.o
            wx3.H(r5)
            r5 = r4
            r4 = r0
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            wx3.H(r5)
            r0.o = r4
            tc9 r5 = r4.e
            r0.X = r5
            r0.w0 = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = 0
            int r1 = r4.b     // Catch:{ all -> 0x0052 }
            r2 = 3
            if (r1 != r2) goto L_0x0054
            xve r4 = r4.b()     // Catch:{ all -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r4 = move-exception
            goto L_0x005c
        L_0x0054:
            xve r4 = r4.c()     // Catch:{ all -> 0x0052 }
        L_0x0058:
            r5.e(r0)
            return r4
        L_0x005c:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxe.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final xve b() {
        long j;
        ec9 ec9 = this.f;
        boolean z = ec9.b == 0;
        long j2 = this.a;
        long j3 = this.g;
        if (z) {
            xve xve = new xve(0, Math.min(j3, j2));
            ec9.b(xve);
            return xve;
        }
        int i = 0;
        for (int i2 = 1; i < ec9.b - i2; i2 = 1) {
            xve xve2 = (xve) ec9.c(i);
            int i3 = i + 1;
            xve xve3 = (xve) ec9.c(i3);
            long j4 = xve2.b;
            if (j4 == xve2.c && xve3.b == xve3.c && xve2.a + j4 == xve3.a) {
                ec9.d(i3);
                ec9.d(i);
                long j5 = j4 + xve3.b;
                ec9.a(i, new xve(xve2.a, j5, j5));
            } else {
                i = i3;
            }
        }
        int i4 = 0;
        while (true) {
            xve xve4 = null;
            if (i4 >= ec9.b) {
                return null;
            }
            xve xve5 = (xve) ec9.c(i4);
            if (i4 != ec9.b - 1) {
                xve4 = (xve) ec9.c(i4 + 1);
            }
            long j6 = xve5.a + xve5.b;
            if (xve4 == null) {
                if (j6 < j2) {
                    j = Math.min(j3, j2 - j6);
                }
                j = -1;
            } else {
                long j7 = xve4.a;
                if (j6 < j7) {
                    j = Math.min(j3, j7 - j6);
                }
                j = -1;
            }
            if (j > 0) {
                xve xve6 = new xve(j6, j);
                ec9.a(i4 + 1, xve6);
                return xve6;
            }
            i4++;
        }
    }

    public final xve c() {
        ec9 ec9 = this.f;
        int i = ec9.b;
        long j = this.a;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                return null;
            }
            if (i != 0) {
                z = false;
            }
            if (!z) {
                long j2 = ((xve) ec9.a[0]).b;
                if (j2 == j) {
                    return null;
                }
                xve xve = new xve(j2, j - j2);
                ec9.b(xve);
                return xve;
            }
            throw new NoSuchElementException("ObjectList is empty.");
        }
        xve xve2 = new xve(0, j);
        ec9.b(xve2);
        return xve2;
    }

    public final void d(xbc xbc) {
        String str;
        String str2 = null;
        try {
            str = xbc.Y.a("X-Reason");
            if (str == null) {
                str = null;
            }
        } catch (Throwable th) {
            str = new kcc(th);
        }
        if (str instanceof kcc) {
            str = null;
        }
        am6 o = pa2.o(xbc.o, str);
        boolean m = xbc.m();
        String str3 = this.c;
        if (m || o.equals(pa2.b) || o.equals(pa2.c)) {
            udd.U(str3, "getErrorUploadPositionFromResponse not loaded yet, starting upload from 0");
            return;
        }
        boolean equals = o.equals(pa2.g);
        f1c f1c = xbc.Z;
        if (equals || o.equals(pa2.e)) {
            udd.U(str3, "getErrorUploadPositionFromResponse forbidden or bad request: error=" + o);
            if (f1c != null) {
                str2 = f1c.U();
            }
            throw new HttpErrorException("Expired url on GET", o, str2);
        }
        udd.s(str3, "getErrorUploadPositionFromResponse error=" + o, (Throwable) null);
        if (f1c != null) {
            str2 = f1c.U();
        }
        throw new HttpErrorException("Failed receiving upload status", o, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(sm6 r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.kxe
            if (r0 == 0) goto L_0x0013
            r0 = r14
            kxe r0 = (defpackage.kxe) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            kxe r0 = new kxe
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            oxe r12 = r0.o
            wx3.H(r14)
            goto L_0x00c4
        L_0x002b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0033:
            wx3.H(r14)
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 20
            r2.<init>(r5)
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r5 != 0) goto L_0x0052
            r14.remove(r6)
            goto L_0x0064
        L_0x0052:
            boolean r7 = r14.isEmpty()
            if (r7 == 0) goto L_0x005d
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
        L_0x005d:
            java.lang.Object r5 = r6.cast(r5)
            r14.put(r6, r5)
        L_0x0064:
            java.lang.String r5 = "x-uploading-mode"
            z3d.j(r5)
            java.lang.String r6 = "parallel"
            z3d.l(r6, r5)
            r2.add(r5)
            java.lang.CharSequence r5 = h0e.B0(r6)
            java.lang.String r5 = r5.toString()
            r2.add(r5)
            if (r13 == 0) goto L_0x0182
            ye6 r9 = new ye6
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r5)
            if (r2 == 0) goto L_0x017a
            java.lang.String[] r2 = (java.lang.String[]) r2
            r9.<init>(r2)
            byte[] r2 = nze.a
            boolean r2 = r14.isEmpty()
            if (r2 == 0) goto L_0x0099
            iw4 r14 = iw4.a
        L_0x0097:
            r11 = r14
            goto L_0x00a3
        L_0x0099:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r14)
            java.util.Map r14 = java.util.Collections.unmodifiableMap(r2)
            goto L_0x0097
        L_0x00a3:
            lac r14 = new lac
            java.lang.String r8 = "GET"
            r10 = 0
            r6 = r14
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            t97 r13 = r12.d
            java.lang.Object r13 = r13.getValue()
            qw9 r13 = (qw9) r13
            y0c r13 = r13.b(r14)
            r0.o = r12
            r0.Z = r4
            java.lang.Object r14 = jjd.i(r13, r0)
            if (r14 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            xbc r14 = (xbc) r14
            ye6 r13 = r14.Y
            java.lang.String r0 = "Range"
            java.lang.String r13 = r13.a(r0)
            if (r13 == 0) goto L_0x016d
            int r0 = r13.length()
            if (r0 != 0) goto L_0x00d8
            goto L_0x016d
        L_0x00d8:
            java.lang.String r14 = r12.c
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x00df
            goto L_0x00f1
        L_0x00df:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x00f1
            tn7 r1 = defpackage.tn7.X
            java.lang.String r2 = "initChunksForFile: got headers from server = "
            java.lang.String r2 = r2.concat(r13)
            r5 = 0
            r0.d(r1, r14, r2, r5)
        L_0x00f1:
            java.lang.String r14 = ","
            java.lang.String[] r14 = new java.lang.String[]{r14}
            r0 = 6
            java.util.List r13 = h0e.q0(r13, r14, r3, r0)
            java.util.Iterator r13 = r13.iterator()
        L_0x0100:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0177
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            int r1 = r14.length()
            if (r1 != 0) goto L_0x0113
            goto L_0x0100
        L_0x0113:
            java.lang.String r1 = "/"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r14 = h0e.q0(r14, r1, r3, r0)
            int r1 = r14.size()
            r2 = 2
            if (r1 != r2) goto L_0x0100
            java.lang.Object r1 = r14.get(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0131
            goto L_0x0100
        L_0x0131:
            java.lang.Object r14 = r14.get(r3)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.String r1 = "-"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r14 = h0e.q0(r14, r1, r3, r0)
            int r1 = r14.size()
            if (r1 != r2) goto L_0x0100
            java.lang.Object r1 = r14.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            long r6 = java.lang.Long.parseLong(r1)
            java.lang.Object r14 = r14.get(r4)
            java.lang.String r14 = (java.lang.String) r14
            long r1 = java.lang.Long.parseLong(r14)
            long r1 = r1 - r6
            r8 = 1
            long r10 = r1 + r8
            xve r14 = new xve
            r5 = r14
            r8 = r10
            r5.<init>(r6, r8, r10)
            ec9 r1 = r12.f
            r1.b(r14)
            goto L_0x0100
        L_0x016d:
            r12.d(r14)
            java.lang.Long r12 = new java.lang.Long
            r13 = 0
            r12.<init>(r13)
        L_0x0177:
            jue r12 = jue.a
            return r12
        L_0x017a:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.Array<T>"
            r12.<init>(r13)
            throw r12
        L_0x0182:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "url == null"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxe.e(sm6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(sm6 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lxe
            if (r0 == 0) goto L_0x0013
            r0 = r6
            lxe r0 = (defpackage.lxe) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            lxe r0 = new lxe
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            oxe r4 = r0.o
            wx3.H(r6)
            goto L_0x006c
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            wx3.H(r6)
            s86 r6 = new s86
            r6.<init>()
            r6.a = r5
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            r6.p(r5)
            cg5 r5 = new cg5
            r2 = 1
            r5.<init>(r2)
            java.lang.String r2 = "POST"
            r6.m(r2, r5)
            lac r5 = r6.j()
            t97 r6 = r4.d
            java.lang.Object r6 = r6.getValue()
            qw9 r6 = (qw9) r6
            y0c r5 = r6.b(r5)
            r0.o = r4
            r0.Z = r3
            java.lang.Object r6 = jjd.i(r5, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            xbc r6 = (xbc) r6
            boolean r5 = r6.m()
            r0 = 0
            if (r5 == 0) goto L_0x00a9
            r4.getClass()
            ye6 r5 = r6.Y
            java.lang.String r2 = "X-Last-Known-Byte"
            java.lang.String r5 = r5.a(r2)
            r2 = 0
            if (r5 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r5 = r2
        L_0x0086:
            if (r5 == 0) goto L_0x00ac
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0090 }
            r2 = 1
            long r5 = r5 + r2
            goto L_0x00ad
        L_0x0090:
            one.me.sdk.transfer.exceptions.HttpUrlExpiredException r4 = new one.me.sdk.transfer.exceptions.HttpUrlExpiredException
            java.lang.String r0 = "Cannot parse range header='"
            java.lang.String r1 = "'"
            java.lang.String r5 = defpackage.wn6.i(r0, r5, r1)
            f1c r6 = r6.Z
            if (r6 == 0) goto L_0x00a3
            java.lang.String r6 = r6.U()
            goto L_0x00a4
        L_0x00a3:
            r6 = r2
        L_0x00a4:
            r0 = 2
            r4.<init>(r5, r2, r6, r0)
            throw r4
        L_0x00a9:
            r4.d(r6)
        L_0x00ac:
            r5 = r0
        L_0x00ad:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00bb
            ec9 r4 = r4.f
            xve r2 = new xve
            r2.<init>(r0, r5)
            r4.b(r2)
        L_0x00bb:
            jue r4 = jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxe.f(sm6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085 A[Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a7 A[Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bc A[Catch:{ all -> 0x00ff, all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd A[Catch:{ all -> 0x00ff, all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0116 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0117 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(sm6 r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            java.lang.String r0 = "requestInitialChunks: for type="
            boolean r1 = r13 instanceof defpackage.mxe
            if (r1 == 0) goto L_0x0015
            r1 = r13
            mxe r1 = (defpackage.mxe) r1
            int r2 = r1.x0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.x0 = r2
            goto L_0x001a
        L_0x0015:
            mxe r1 = new mxe
            r1.<init>(r11, r13)
        L_0x001a:
            java.lang.Object r13 = r1.Z
            pu3 r2 = pu3.a
            int r3 = r1.x0
            r4 = 4
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L_0x005d
            if (r3 == r8) goto L_0x004f
            if (r3 == r7) goto L_0x0048
            if (r3 != r6) goto L_0x0040
            java.lang.Object r11 = r1.X
            qc9 r11 = (qc9) r11
            oxe r12 = r1.o
        L_0x0033:
            wx3.H(r13)     // Catch:{ HttpErrorException -> 0x003d, IOException -> 0x003a }
            goto L_0x0098
        L_0x0037:
            r12 = move-exception
            goto L_0x0126
        L_0x003a:
            r12 = move-exception
            goto L_0x010a
        L_0x003d:
            r12 = move-exception
            goto L_0x0123
        L_0x0040:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0048:
            java.lang.Object r11 = r1.X
            qc9 r11 = (qc9) r11
            oxe r12 = r1.o
            goto L_0x0033
        L_0x004f:
            tc9 r11 = r1.Y
            java.lang.Object r12 = r1.X
            sm6 r12 = (sm6) r12
            oxe r3 = r1.o
            wx3.H(r13)
            r13 = r11
            r11 = r3
            goto L_0x0071
        L_0x005d:
            wx3.H(r13)
            tc9 r13 = r11.e
            r1.o = r11
            r1.X = r12
            r1.Y = r13
            r1.x0 = r8
            java.lang.Object r3 = r13.d(r1)
            if (r3 != r2) goto L_0x0071
            return r2
        L_0x0071:
            ec9 r3 = r11.f     // Catch:{ all -> 0x009b }
            java.lang.Object[] r8 = r3.a     // Catch:{ all -> 0x0124 }
            int r9 = r3.b     // Catch:{ all -> 0x0124 }
            r10 = 0
            java.util.Arrays.fill(r8, r10, r9, r5)     // Catch:{ all -> 0x0124 }
            r3.b = r10     // Catch:{ all -> 0x0124 }
            int r3 = r11.b     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            int r3 = hr1.t(r3)     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            if (r3 == 0) goto L_0x00a7
            if (r3 == r4) goto L_0x00b6
            r1.o = r11     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            r1.X = r13     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            r1.Y = r5     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            r1.x0 = r6     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            java.lang.Object r12 = r11.e(r12, r1)     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            if (r12 != r2) goto L_0x0096
            return r2
        L_0x0096:
            r12 = r11
            r11 = r13
        L_0x0098:
            r13 = r11
            r11 = r12
            goto L_0x00b6
        L_0x009b:
            r12 = move-exception
        L_0x009c:
            r11 = r13
            goto L_0x0126
        L_0x009f:
            r12 = move-exception
            r11 = r13
            goto L_0x010a
        L_0x00a3:
            r12 = move-exception
            r11 = r13
            goto L_0x0123
        L_0x00a7:
            r1.o = r11     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            r1.X = r13     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            r1.Y = r5     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            r1.x0 = r7     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            java.lang.Object r12 = r11.f(r12, r1)     // Catch:{ HttpErrorException -> 0x00a3, IOException -> 0x009f }
            if (r12 != r2) goto L_0x0096
            return r2
        L_0x00b6:
            java.lang.String r12 = r11.c     // Catch:{ all -> 0x009b }
            fn6 r1 = udd.e     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x00bd
            goto L_0x0102
        L_0x00bd:
            boolean r2 = r1.c()     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0102
            tn7 r2 = defpackage.tn7.X     // Catch:{ all -> 0x009b }
            int r3 = r11.b     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r4.<init>(r0)     // Catch:{ all -> 0x009b }
            r0 = 1
            if (r3 == r0) goto L_0x00ea
            r0 = 2
            if (r3 == r0) goto L_0x00e7
            r0 = 3
            if (r3 == r0) goto L_0x00e4
            r0 = 4
            if (r3 == r0) goto L_0x00e1
            r0 = 5
            if (r3 == r0) goto L_0x00de
            java.lang.String r0 = "null"
            goto L_0x00ec
        L_0x00de:
            java.lang.String r0 = "STICKER"
            goto L_0x00ec
        L_0x00e1:
            java.lang.String r0 = "FILE"
            goto L_0x00ec
        L_0x00e4:
            java.lang.String r0 = "VIDEO"
            goto L_0x00ec
        L_0x00e7:
            java.lang.String r0 = "AUDIO"
            goto L_0x00ec
        L_0x00ea:
            java.lang.String r0 = "PHOTO"
        L_0x00ec:
            r4.append(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = " chunks are="
            r4.append(r0)     // Catch:{ all -> 0x009b }
            r4.append(r11)     // Catch:{ all -> 0x009b }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x009b }
            r1.d(r2, r12, r11, r5)     // Catch:{ all -> 0x009b }
            goto L_0x0102
        L_0x00ff:
            r11 = move-exception
        L_0x0100:
            r12 = r11
            goto L_0x009c
        L_0x0102:
            jue r11 = jue.a     // Catch:{ all -> 0x009b }
            tc9 r13 = (tc9) r13
            r13.e(r5)
            return r11
        L_0x010a:
            one.me.sdk.transfer.exceptions.HttpErrorException r13 = new one.me.sdk.transfer.exceptions.HttpErrorException     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "Failed during retrieving upload position"
            am6 r1 = defpackage.pa2.l     // Catch:{ all -> 0x0037 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0037 }
            if (r12 != 0) goto L_0x0117
            goto L_0x011f
        L_0x0117:
            am6 r1 = new am6     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "UNKNOWN_ERROR"
            r3 = -1
            r1.<init>(r3, r2, r12)     // Catch:{ all -> 0x0037 }
        L_0x011f:
            r13.<init>(r0, r1, r5, r4)     // Catch:{ all -> 0x0037 }
            throw r13     // Catch:{ all -> 0x0037 }
        L_0x0123:
            throw r12     // Catch:{ all -> 0x0037 }
        L_0x0124:
            r11 = move-exception
            goto L_0x0100
        L_0x0126:
            tc9 r11 = (tc9) r11
            r11.e(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxe.g(sm6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[Catch:{ all -> 0x005d }, LOOP:0: B:18:0x0051->B:19:0x0053, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.nxe
            if (r0 == 0) goto L_0x0013
            r0 = r8
            nxe r0 = (defpackage.nxe) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            nxe r0 = new nxe
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            tc9 r7 = r0.X
            oxe r0 = r0.o
            wx3.H(r8)
            r8 = r7
            r7 = r0
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            wx3.H(r8)
            r0.o = r7
            tc9 r8 = r7.e
            r0.X = r8
            r0.w0 = r3
            java.lang.Object r0 = r8.d(r0)
            if (r0 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = 0
            ec9 r7 = r7.f     // Catch:{ all -> 0x005d }
            java.lang.Object[] r1 = r7.a     // Catch:{ all -> 0x005d }
            int r7 = r7.b     // Catch:{ all -> 0x005d }
            r2 = 0
            r4 = 0
        L_0x0051:
            if (r4 >= r7) goto L_0x005f
            r5 = r1[r4]     // Catch:{ all -> 0x005d }
            xve r5 = (defpackage.xve) r5     // Catch:{ all -> 0x005d }
            long r5 = r5.c     // Catch:{ all -> 0x005d }
            long r2 = r2 + r5
            int r4 = r4 + 1
            goto L_0x0051
        L_0x005d:
            r7 = move-exception
            goto L_0x0068
        L_0x005f:
            java.lang.Long r7 = new java.lang.Long     // Catch:{ all -> 0x005d }
            r7.<init>(r2)     // Catch:{ all -> 0x005d }
            r8.e(r0)
            return r7
        L_0x0068:
            r8.e(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxe.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String toString() {
        StringBuilder l = hr1.l("(");
        ec9 ec9 = this.f;
        Object[] objArr = ec9.a;
        int i = ec9.b;
        for (int i2 = 0; i2 < i; i2++) {
            xve xve = (xve) objArr[i2];
            if (l.length() > 1) {
                l.append(",");
            }
            l.append(xve.a);
            l.append("-");
            l.append((xve.a + xve.b) - 1);
        }
        l.append(")");
        return l.toString();
    }
}
