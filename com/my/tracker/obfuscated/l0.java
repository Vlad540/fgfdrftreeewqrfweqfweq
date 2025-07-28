package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.obfuscated.e;
import com.my.tracker.obfuscated.o0;
import com.my.tracker.obfuscated.u0;
import com.my.tracker.obfuscated.z0;
import java.util.Map;

public class l0 extends q0 {
    private static int a(int i) {
        if (i == 1) {
            return 12;
        }
        if (i == 2) {
            return 13;
        }
        if (i == 3) {
            return 11;
        }
        if (i == 5) {
            return 17;
        }
        if (i == 31) {
            return 39;
        }
        if (i == 33) {
            return 41;
        }
        if (i == 7) {
            return 18;
        }
        if (i == 8) {
            return 19;
        }
        if (i != 14) {
            return i != 15 ? -1 : 16;
        }
        return 14;
    }

    public static l0 b() {
        return new l0();
    }

    public static void a(r0 r0Var, z0.a aVar, l lVar) {
        lVar.a();
        int i = aVar.b;
        if (i >= 0) {
            lVar.a(1, i);
        }
        lVar.a(2, 0);
        lVar.a(3, 0);
        if (!aVar.e) {
            lVar.a(4, 0);
        }
        int i2 = aVar.c;
        if (i2 != 900) {
            lVar.a(5, i2);
        }
        int i3 = aVar.d;
        if (i3 != 0) {
            lVar.a(6, i3);
        }
        lVar.a(7, 0);
        if (!aVar.f) {
            lVar.a(8, 0);
        }
        if (!aVar.g) {
            lVar.a(9, 0);
        }
        lVar.a(11, 0);
        lVar.a(12, 0);
        lVar.a(13, 0);
        lVar.a(14, 0);
        lVar.a(15, 0);
        if (lVar.b() > 0) {
            r0Var.a(27, lVar);
        }
    }

    public synchronized byte[] b(boolean z, String str, String str2, Map map) {
        return a(8, z, str, str2, map);
    }

    public synchronized byte[] b(String str, String str2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 2", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(String str, String str2, long j, long j2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
            this.a.a(3, j2);
            this.a.a(4, j);
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 31", th);
            return null;
        }
        return this.a.c();
    }

    public static void a(r0 r0Var, e eVar, l lVar) {
        if (!eVar.a.isEmpty()) {
            for (e.a aVar : eVar.a) {
                lVar.a();
                lVar.a(1, aVar.a);
                lVar.a(2, aVar.b);
                r0Var.a(31, lVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00be, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c6, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r9.addSuppressed(r10);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:45:0x00ba, B:49:0x00c2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(com.my.tracker.obfuscated.r0 r9, com.my.tracker.obfuscated.s0 r10, com.my.tracker.obfuscated.l r11) {
        /*
            r0 = 0
            com.my.tracker.obfuscated.s0$a r10 = r10.a()     // Catch:{ all -> 0x00cb }
            r1 = r0
        L_0x0006:
            boolean r2 = r10.a()     // Catch:{ all -> 0x00b8 }
            if (r2 == 0) goto L_0x00ba
            long r2 = r10.f()     // Catch:{ all -> 0x00b8 }
            int r2 = (int) r2
            r11.a()     // Catch:{ all -> 0x004d }
            com.my.tracker.obfuscated.s0$b r3 = r10.d()     // Catch:{ all -> 0x004d }
        L_0x0018:
            boolean r4 = r3.a()     // Catch:{ all -> 0x0028 }
            if (r4 == 0) goto L_0x002a
            long r4 = r3.k()     // Catch:{ all -> 0x0028 }
            int r4 = (int) r4     // Catch:{ all -> 0x0028 }
            r5 = 2
            r11.a((int) r5, (int) r4)     // Catch:{ all -> 0x0028 }
            goto L_0x0018
        L_0x0028:
            r4 = move-exception
            goto L_0x0097
        L_0x002a:
            r3.close()     // Catch:{ all -> 0x004d }
            int r3 = r11.b()     // Catch:{ all -> 0x004d }
            java.lang.String r4 = ", event ignored"
            if (r3 != 0) goto L_0x004f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r5 = "Error: no timestamps for event "
            r3.append(r5)     // Catch:{ all -> 0x004d }
            r3.append(r2)     // Catch:{ all -> 0x004d }
            r3.append(r4)     // Catch:{ all -> 0x004d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004d }
            com.my.tracker.obfuscated.y0.b(r3)     // Catch:{ all -> 0x004d }
            goto L_0x0006
        L_0x004d:
            r3 = move-exception
            goto L_0x00a2
        L_0x004f:
            r3 = 1
            r11.a((int) r3, (int) r2)     // Catch:{ all -> 0x004d }
            long r5 = r10.b()     // Catch:{ all -> 0x004d }
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0062
            int r3 = (int) r5     // Catch:{ all -> 0x004d }
            r5 = 3
            r11.a((int) r5, (int) r3)     // Catch:{ all -> 0x004d }
        L_0x0062:
            byte[] r3 = r10.l()     // Catch:{ all -> 0x004d }
            int r5 = r3.length     // Catch:{ all -> 0x004d }
            if (r5 <= 0) goto L_0x008c
            int r5 = a((int) r2)     // Catch:{ all -> 0x004d }
            r6 = -1
            if (r5 != r6) goto L_0x0089
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r5 = "Error: unrecognized eventType "
            r3.append(r5)     // Catch:{ all -> 0x004d }
            r3.append(r2)     // Catch:{ all -> 0x004d }
            r3.append(r4)     // Catch:{ all -> 0x004d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004d }
            com.my.tracker.obfuscated.y0.b(r3)     // Catch:{ all -> 0x004d }
            goto L_0x0006
        L_0x0089:
            r11.a((int) r5, (byte[]) r3)     // Catch:{ all -> 0x004d }
        L_0x008c:
            r3 = 41
            int r2 = r9.a((int) r3, (com.my.tracker.obfuscated.l) r11)     // Catch:{ all -> 0x004d }
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L_0x0006
        L_0x0097:
            if (r3 == 0) goto L_0x00a1
            r3.close()     // Catch:{ all -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ all -> 0x004d }
        L_0x00a1:
            throw r4     // Catch:{ all -> 0x004d }
        L_0x00a2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r4.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r5 = "Error: failed to pack event "
            r4.append(r5)     // Catch:{ all -> 0x00b8 }
            r4.append(r2)     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00b8 }
            com.my.tracker.obfuscated.y0.b(r2, r3)     // Catch:{ all -> 0x00b8 }
            goto L_0x0006
        L_0x00b8:
            r9 = move-exception
            goto L_0x00c0
        L_0x00ba:
            r10.close()     // Catch:{ all -> 0x00be }
            goto L_0x00d2
        L_0x00be:
            r9 = move-exception
            goto L_0x00cd
        L_0x00c0:
            if (r10 == 0) goto L_0x00ca
            r10.close()     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r10 = move-exception
            r9.addSuppressed(r10)     // Catch:{ all -> 0x00be }
        L_0x00ca:
            throw r9     // Catch:{ all -> 0x00be }
        L_0x00cb:
            r9 = move-exception
            r1 = r0
        L_0x00cd:
            java.lang.String r10 = "Error: failed to get stored events"
            com.my.tracker.obfuscated.y0.b(r10, r9)
        L_0x00d2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Written: events="
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r10 = ", bytes="
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.my.tracker.obfuscated.y0.a((java.lang.String) r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.l0.a(com.my.tracker.obfuscated.r0, com.my.tracker.obfuscated.s0, com.my.tracker.obfuscated.l):int");
    }

    public static int a(r0 r0Var, u0 u0Var, l lVar, l lVar2) {
        int i;
        u0.b d;
        int i2 = 0;
        try {
            u0.a a = u0Var.a();
            i = 0;
            while (a.a()) {
                try {
                    String j = a.j();
                    lVar.a();
                    try {
                        d = a.d();
                        while (d.a()) {
                            lVar2.a();
                            lVar2.a(1, (int) d.g());
                            if (!d.e()) {
                                lVar2.a(2, (int) d.i());
                            }
                            lVar.a(1, lVar2);
                        }
                        d.close();
                    } catch (Throwable th) {
                        y0.b("Error: failed to read session " + j + ": ", th);
                    }
                    if (lVar.b() == 0) {
                        y0.a("No periods for session " + j + ", id=" + a.c() + ", session ignored");
                    } else {
                        int b = (int) a.b();
                        if (b > 0) {
                            lVar.a(2, b);
                        }
                        i2 += r0Var.a(42, lVar);
                        i++;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            a.close();
        } catch (Throwable th3) {
            th = th3;
            i = 0;
            y0.b("Error: failed to get stored sessions", th);
            y0.a("Written: sessions=" + i + ", bytes=" + i2);
            return i2;
        }
        y0.a("Written: sessions=" + i + ", bytes=" + i2);
        return i2;
        throw th;
        throw th;
    }

    public synchronized boolean a(r0 r0Var, long j) {
        if (j > 0) {
            try {
                r0Var.a(4, j);
            } catch (Exception e) {
                y0.a("Write timestamp send error: " + e, e);
                return false;
            }
        }
        return true;
    }

    public synchronized int a(r0 r0Var, z0.a aVar, boolean z, b1 b1Var, u uVar, long j, s0 s0Var, u0 u0Var) {
        String str;
        String str2;
        r0 r0Var2 = r0Var;
        z0.a aVar2 = aVar;
        boolean z2 = z;
        u uVar2 = uVar;
        long j2 = j;
        synchronized (this) {
            try {
                if (a(r0Var2, s0Var, this.a) + a(r0Var2, u0Var, this.a, this.b) == 0) {
                    y0.a("No events to send");
                    return 3;
                }
                r0Var2.a(1, MyTracker.VERSION);
                r0Var2.a(2, aVar2.a);
                if (j2 != -1) {
                    r0Var2.a(3, j2);
                }
                Map map = aVar2.h.b;
                r0Var2.a(43, map, this.b);
                if (z2 || map.isEmpty()) {
                    str2 = null;
                    str = null;
                } else {
                    String str3 = (String) map.get("android_id");
                    str = (String) map.get("mac");
                    str2 = str3;
                }
                q0.a(r0Var2, uVar2.a, uVar2.b, this.a, this.b);
                q0.a(r0Var2, z2, b1Var, this.a);
                q0.a(r0Var, str2, str, uVar, this.a, this.b);
                a(r0Var2, aVar2, this.a);
                a(r0Var2, uVar2.e, this.a);
                a();
                return 1;
            } catch (Exception e) {
                y0.a("Create packet error: " + e, e);
                a();
                return 2;
            }
        }
    }

    public synchronized byte[] a(boolean z, String str, String str2, Map map) {
        return a(7, z, str, str2, map);
    }

    public synchronized byte[] a(long j, String str, o0.a aVar) {
        try {
            this.a.a();
            this.a.a(1, j);
            this.b.a();
            if (!TextUtils.isEmpty(str)) {
                this.b.a(1, str);
            }
            if (aVar != null) {
                this.b.a(2, aVar.a);
            }
            if (aVar != null) {
                this.b.a(3, aVar.b);
            }
            if (aVar != null) {
                this.b.a(4, aVar.c);
            }
            if (this.b.b() > 0) {
                this.a.a(2, this.b);
            }
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 1", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, long j, long j2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
            this.a.a(3, j2);
            this.a.a(4, j);
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 14", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str) {
        try {
            this.a.a();
            this.a.a(1, str);
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 33", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5) {
        try {
            this.a.a();
            this.a.a(1, str3);
            this.a.a(2, str4);
            this.a.a(3, str);
            this.a.a(4, str2);
            if (!TextUtils.isEmpty(str5)) {
                this.b.a();
                this.b.a(1, str5);
                if (this.b.b() > 0) {
                    this.a.a(5, this.b);
                }
            }
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 5", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: 15", th);
            return null;
        }
        return this.a.c();
    }

    private byte[] a(int i, boolean z, String str, String str2, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            if (!z) {
                this.a.a(2, str);
                this.a.a(3, str2);
            }
            return this.a.c();
        } catch (Throwable th) {
            y0.b("Event serialization failed, type: " + i, th);
            return null;
        }
    }
}
