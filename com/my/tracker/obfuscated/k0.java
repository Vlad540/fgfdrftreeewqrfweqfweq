package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.j0;

public final class k0 {
    final j0 a;
    final int b;
    final int c;
    long d;
    long e;

    private k0(j0 j0Var, int i, int i2) {
        this.a = j0Var;
        this.b = i;
        this.c = i2;
        Long b2 = j0Var.b("timestamp_base");
        if (b2 == null) {
            this.d = 0;
        } else {
            this.d = b2.longValue();
        }
        this.e = j0Var.h();
    }

    public static k0 a(j0 j0Var) {
        return a(j0Var, 1000, 500);
    }

    public s0 b() {
        return new t0(this.a);
    }

    public u0 c() {
        return new v0(this.a, "default_session");
    }

    public boolean d(byte[] bArr, long j) {
        return a(31, bArr, true, false, j);
    }

    public long e() {
        return this.e;
    }

    public boolean f(byte[] bArr, long j) {
        return a(7, bArr, true, true, j);
    }

    public boolean g(byte[] bArr, long j) {
        return a(2, bArr, true, false, j);
    }

    public boolean h(byte[] bArr, long j) {
        return a(8, bArr, true, true, j);
    }

    public boolean i(byte[] bArr, long j) {
        return a(5, bArr, true, false, j);
    }

    public static k0 a(j0 j0Var, int i, int i2) {
        try {
            return new k0(j0Var, i, i2);
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th);
            return null;
        }
    }

    public boolean b(long j) {
        return a(3, new byte[0], j);
    }

    public boolean c(byte[] bArr, long j) {
        return a(15, bArr, true, true, j);
    }

    public b d() {
        try {
            return this.a.f();
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: ", th);
            return null;
        }
    }

    public boolean e(byte[] bArr, long j) {
        return a(1, bArr, true, false, j);
    }

    public long f() {
        return this.d;
    }

    public boolean g() {
        int i;
        j0.b g;
        j0.d a2;
        try {
            g = this.a.g();
            i = g.a();
            try {
                g.close();
                a2 = this.a.a("default_session");
                if (a2.a()) {
                    i++;
                }
                a2.close();
            } catch (Exception unused) {
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } catch (Exception unused2) {
            i = 0;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        if (i != 0) {
            return true;
        }
        return false;
        throw th;
        throw th;
    }

    public boolean b(byte[] bArr, long j) {
        return a(33, bArr, true, false, j);
    }

    public void c(long j) {
        try {
            this.a.a("timestamp_base", Long.valueOf(j));
            this.d = j;
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: ", th);
        }
    }

    public boolean a(byte[] bArr, long j) {
        return a(14, bArr, true, false, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(long r24, long r26) {
        /*
            r23 = this;
            r0 = r23
            java.lang.String r1 = "MyTrackerRepository error: session insertion failed "
            java.lang.String r2 = "default_session"
            java.lang.String r3 = "MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: "
            java.lang.String r4 = "MyTrackerRepository: session timestamps count: "
            r6 = 0
            com.my.tracker.obfuscated.j0 r7 = r0.a     // Catch:{ all -> 0x00d5 }
            com.my.tracker.obfuscated.j0$d r6 = r7.a((java.lang.String) r2)     // Catch:{ all -> 0x00d5 }
            boolean r7 = r6.a()     // Catch:{ all -> 0x00a6 }
            r8 = 0
            if (r7 == 0) goto L_0x00aa
            long r13 = r6.c()     // Catch:{ all -> 0x00a6 }
            long r10 = r6.m()     // Catch:{ all -> 0x00a6 }
            long r18 = r6.b()     // Catch:{ all -> 0x00a6 }
            r20 = r6
            long r5 = r0.d     // Catch:{ all -> 0x0031 }
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0036
            r0.c(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x0036
        L_0x0031:
            r0 = move-exception
            r6 = r20
            goto L_0x00d6
        L_0x0036:
            java.lang.String r2 = "MyTrackerRepository: finish previous session"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r2)     // Catch:{ all -> 0x0031 }
            int r2 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0051
            com.my.tracker.obfuscated.j0 r2 = r0.a     // Catch:{ all -> 0x0031 }
            long r5 = r0.d     // Catch:{ all -> 0x0031 }
            long r5 = r10 - r5
            r15 = 1
            r16 = 0
            r10 = r2
            r11 = r13
            r21 = r13
            r13 = r5
            r10.a(r11, r13, r15, r16)     // Catch:{ all -> 0x0031 }
            goto L_0x0062
        L_0x0051:
            r21 = r13
            com.my.tracker.obfuscated.j0 r2 = r0.a     // Catch:{ all -> 0x0031 }
            long r5 = r0.d     // Catch:{ all -> 0x0031 }
            long r13 = r10 - r5
            long r16 = r26 - r5
            r15 = 0
            r10 = r2
            r11 = r21
            r10.a(r11, r13, r15, r16)     // Catch:{ all -> 0x0031 }
        L_0x0062:
            com.my.tracker.obfuscated.j0 r2 = r0.a     // Catch:{ all -> 0x0031 }
            r5 = r21
            long r10 = r2.d(r5)     // Catch:{ all -> 0x0031 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0031 }
            r2.<init>(r4)     // Catch:{ all -> 0x0031 }
            r2.append(r10)     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0031 }
            com.my.tracker.obfuscated.y0.a((java.lang.String) r2)     // Catch:{ all -> 0x0031 }
            int r2 = r0.c     // Catch:{ all -> 0x0031 }
            long r12 = (long) r2     // Catch:{ all -> 0x0031 }
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0096
            com.my.tracker.obfuscated.j0 r2 = r0.a     // Catch:{ all -> 0x0031 }
            long r10 = r10 - r12
            long r8 = r2.b(r5, r10)     // Catch:{ all -> 0x0031 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0031 }
            r2.<init>(r3)     // Catch:{ all -> 0x0031 }
            r2.append(r8)     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0031 }
            com.my.tracker.obfuscated.y0.a((java.lang.String) r2)     // Catch:{ all -> 0x0031 }
        L_0x0096:
            java.lang.String r2 = "MyTrackerRepository: start new session"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r2)     // Catch:{ all -> 0x0031 }
            com.my.tracker.obfuscated.j0 r10 = r0.a     // Catch:{ all -> 0x0031 }
            long r15 = r18 + r8
            r11 = r5
            r13 = r24
            r10.a((long) r11, (long) r13, (long) r15)     // Catch:{ all -> 0x0031 }
            goto L_0x00d0
        L_0x00a6:
            r0 = move-exception
            r20 = r6
            goto L_0x00d6
        L_0x00aa:
            r20 = r6
            java.lang.String r3 = "MyTrackerRepository: insert session"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r3)     // Catch:{ all -> 0x0031 }
            com.my.tracker.obfuscated.j0 r3 = r0.a     // Catch:{ all -> 0x0031 }
            r4 = r24
            long r2 = r3.a((java.lang.String) r2, (long) r4)     // Catch:{ all -> 0x0031 }
            long r10 = com.my.tracker.obfuscated.j0.u     // Catch:{ all -> 0x0031 }
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x00c7
            com.my.tracker.obfuscated.y0.b(r1)     // Catch:{ all -> 0x0031 }
            r20.close()
            r1 = 0
            return r1
        L_0x00c7:
            long r2 = r0.d     // Catch:{ all -> 0x0031 }
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x00d0
            r23.c(r24)     // Catch:{ all -> 0x0031 }
        L_0x00d0:
            r20.close()
            r0 = 1
            return r0
        L_0x00d5:
            r0 = move-exception
        L_0x00d6:
            com.my.tracker.obfuscated.y0.b(r1, r0)     // Catch:{ all -> 0x00e0 }
            if (r6 == 0) goto L_0x00de
            r6.close()
        L_0x00de:
            r1 = 0
            return r1
        L_0x00e0:
            r0 = move-exception
            r1 = r0
            if (r6 == 0) goto L_0x00e7
            r6.close()
        L_0x00e7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.k0.a(long, long):boolean");
    }

    public boolean a(int i, byte[] bArr, boolean z, boolean z2, long j) {
        long j2;
        j0.a aVar;
        int i2 = i;
        byte[] bArr2 = bArr;
        boolean z3 = z;
        long j3 = j;
        try {
            long j4 = j0.u;
            if (z2) {
                aVar = null;
                long j5 = j4;
                j0.b a2 = this.a.a((long) i2, bArr2);
                if (a2.a()) {
                    j4 = a2.c();
                    j2 = a2.b();
                } else {
                    j4 = j5;
                    j2 = 0;
                }
                a2.close();
            } else {
                long j6 = j4;
                j2 = 0;
            }
            if (j4 == j0.u) {
                y0.a("MyTrackerRepository: insert " + i2 + " event");
                j4 = this.a.a(i2, bArr2, z3);
                if (j4 != j0.u && z3) {
                    this.e++;
                }
            } else {
                y0.a("MyTrackerRepository: aggregate " + i2 + " event");
            }
            if (j4 == j0.u) {
                y0.b("MyTrackerRepository error: event insertion failed, type: " + i2);
                return false;
            }
            if (this.d == 0) {
                c(j3);
            }
            this.a.c(j4, j3 - this.d);
            long b2 = this.a.b(j4);
            y0.a("MyTrackerRepository: event timestamps count: " + b2);
            long j7 = (long) this.b;
            if (b2 <= j7) {
                return true;
            }
            long a3 = this.a.a(j4, b2 - j7);
            this.a.d(j4, j2 + a3);
            y0.a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + a3);
            return true;
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: event insertion failed, type: " + i2, th);
            return false;
        }
    }

    public boolean a() {
        j0.d a2;
        try {
            this.a.c();
            this.a.b();
            this.a.e();
            this.a.d();
            this.a.a();
            this.e = 0;
            a2 = this.a.a("default_session");
            if (a2.a()) {
                c(a2.m());
            } else {
                c(0);
            }
            a2.close();
            return true;
        } catch (Throwable unused) {
            return false;
        }
        throw th;
    }

    public void a(byte[] bArr) {
        try {
            this.a.f(14);
            this.a.a(bArr);
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: ", th);
        }
    }

    public void a(long j) {
        try {
            this.a.a(j);
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: ", th);
        }
    }

    private boolean a(int i, byte[] bArr, long j) {
        try {
            return a(i, bArr, false, true, j);
        } catch (Throwable th) {
            y0.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }
}
