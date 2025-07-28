package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.c0;
import com.my.tracker.obfuscated.o0;
import com.my.tracker.obfuscated.z0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class t {
    final Map a = new HashMap();
    final z0 b;
    final Context c;
    final a d;
    protected boolean e = false;
    protected b1 f = b1.j;
    k0 g;
    private final l h = new l(65536);
    final l0 i = l0.b();
    long j = 0;

    public interface a {
        void a();

        void a(String str);
    }

    private t(z0 z0Var, a aVar, Context context) {
        this.b = z0Var;
        this.d = aVar;
        this.c = context.getApplicationContext();
    }

    public static t a(z0 z0Var, a aVar, Context context) {
        return new t(z0Var, aVar, context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.util.Map r2) {
        /*
            if (r2 == 0) goto L_0x0030
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x000a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = a((java.lang.String) r1)
            if (r1 != 0) goto L_0x002e
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = a((java.lang.String) r0)
            if (r0 == 0) goto L_0x000a
        L_0x002e:
            r2 = 1
            return r2
        L_0x0030:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.t.b(java.util.Map):boolean");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (!a(this.g)) {
            c();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.g != null) {
            y0.b("EventTracker error: tracker has already been initialized");
            return;
        }
        j0 a2 = j0.a(this.b.g(), this.c);
        if (a2 != null) {
            k0 a3 = k0.a(a2);
            this.g = a3;
            if (!a(a3)) {
                this.j = p0.a(this.c).k();
                this.b.i().a(new cyf(this, 2), new cyf(this, 3));
                b();
            }
        }
    }

    public void c(Boolean bool) {
        a((Runnable) new jwf(this, 6, bool));
    }

    public void d() {
        a((Runnable) new syf(this, 0));
    }

    public void g() {
        a((Runnable) new q50(this, x0.a(), 8));
    }

    public static boolean a(k0 k0Var) {
        if (k0Var != null) {
            return false;
        }
        y0.b("EventTracker error: repository is null");
        return true;
    }

    /* access modifiers changed from: private */
    public void c(b1 b1Var) {
        a((Runnable) new jwf(this, 5, b1Var));
    }

    public static boolean a(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        y0.b("EventTracker error: length of the string " + str + " is more than 255, event ignored");
        return true;
    }

    public void b(String str, String str2, Map map) {
        a((Runnable) new pyf(this, a(map), str, str2, x0.a(), 0));
    }

    public void c() {
        if (!a(this.g)) {
            this.d.a();
            if (!c0.a(this.c)) {
                y0.a("MyTrackerRepository: no network connection");
                return;
            }
            String a2 = a(this.e, this.f, this.g);
            if (a2 != null) {
                this.d.a(a2);
            }
            b(this.g);
        }
    }

    private static Map a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    private static void a(Runnable runnable) {
        h.a(runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Map map, String str, String str2, long j2) {
        byte[] b2;
        if (!a(this.g) && !b(map) && (b2 = this.i.b(this.e, str, str2, map)) != null && this.g.h(b2, j2)) {
            b();
        }
    }

    private static int a(r0 r0Var, k0 k0Var, z0.a aVar, boolean z, b1 b1Var, l0 l0Var, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        if (!k0Var.g()) {
            return 3;
        }
        long f2 = k0Var.f();
        s0 b2 = k0Var.b();
        u0 c2 = k0Var.c();
        z0.a aVar2 = aVar;
        return l0Var.a(r0Var, aVar2, z, b1Var, v.a().a(aVar2.i, z, context), f2, b2, c2);
    }

    public void b(String str) {
        a((Runnable) new v82(this, str, x0.a(), 9));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b1 b1Var) {
        this.f = b1Var;
    }

    public void b(String str, String str2, long j2, long j3) {
        a((Runnable) new oyf(this, str, str2, j2, j3, x0.a(), 0));
    }

    public void a() {
        a((Runnable) new syf(this, 1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j2) {
        if (!a(this.g)) {
            boolean a2 = this.g.a(j2, p0.a(this.c).m());
            if (this.g.b(j2)) {
                a2 = true;
            }
            if (a2) {
                c();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, long j2, long j3, long j4) {
        byte[] b2;
        if (!a(this.g) && (b2 = this.i.b(str, str2, j2, j3)) != null && this.g.d(b2, j4)) {
            b();
        }
    }

    public void a(String str, String str2, Map map) {
        a((Runnable) new pyf(this, a(map), str, str2, x0.a(), 1));
    }

    public void b(Boolean bool) {
        this.e = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(b1 b1Var) {
        y0.a("onUserInfoStateChanged: customUserIds=" + Arrays.toString(b1Var.g));
        if (g.a(this.f.g, b1Var.g) != 0 && !a(this.g)) {
            b(this.e, this.f, this.g);
        }
        this.f = b1Var;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, String str2, long j2) {
        byte[] a2;
        if (!a(this.g) && !b(map) && (a2 = this.i.a(this.e, str, str2, map)) != null && this.g.f(a2, j2)) {
            b();
        }
    }

    public void b(boolean z, b1 b1Var, k0 k0Var) {
        y0.a("createAndStorePartialPacket: start");
        z0.a k = this.b.k();
        MyTrackerConfig.OkHttpClientProvider j2 = this.b.j();
        this.h.a();
        int a2 = a(this.h, k0Var, k, z, b1Var, this.i, j2, this.c);
        y0.a("createAndStorePartialPacket: writeResult=" + a2);
        if (a2 == 1) {
            k0Var.a();
            k0Var.a(this.h.c());
        } else if (a2 == 2) {
            k0Var.a();
        }
        this.h.d();
    }

    public void a(long j2, String str, o0.a aVar) {
        a((Runnable) new qyf(this, j2, str, aVar, x0.a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j2, String str, o0.a aVar, long j3) {
        byte[] a2;
        if (!a(this.g) && (a2 = this.i.a(j2, str, aVar)) != null && this.g.e(a2, j3)) {
            p0.a(this.c).b(j3);
            this.j = j3;
            b();
        }
    }

    public void b(k0 k0Var) {
        b d2;
        String l = this.b.l();
        MyTrackerConfig.OkHttpClientProvider j2 = this.b.j();
        try {
            d2 = k0Var.d();
            if (d2 == null) {
                y0.a("EventTracker error: iterator is null");
                if (d2 == null) {
                    return;
                }
            } else {
                while (true) {
                    if (d2.a()) {
                        long c2 = d2.c();
                        byte[] h2 = d2.h();
                        this.h.a();
                        this.h.b(h2);
                        c0.b a2 = a(l, j2, this.h);
                        if (a2 == null) {
                            break;
                        } else if (a2.b()) {
                            String str = (String) a2.a();
                            if (!TextUtils.isEmpty(str)) {
                                this.d.a(str);
                            }
                            k0Var.a(c2);
                        }
                    }
                }
            }
            d2.close();
            return;
        } catch (Throwable th) {
            y0.b("EventTracker error: ", th);
            return;
        }
        throw th;
    }

    public void a(String str, String str2, Runnable runnable) {
        a((Runnable) new pyf(this, str, str2, x0.a(), runnable));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j2, Runnable runnable) {
        if (!a(this.g)) {
            byte[] b2 = this.i.b(str, str2);
            if (b2 != null && this.g.g(b2, j2)) {
                b();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void a(String str, String str2, long j2, long j3) {
        a((Runnable) new oyf(this, str, str2, j2, j3, x0.a(), 1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j2, long j3, long j4) {
        byte[] a2;
        if (!a(this.g) && (a2 = this.i.a(str, str2, j2, j3)) != null && this.g.a(a2, j4)) {
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j2) {
        byte[] a2;
        if (!a(this.g) && (a2 = this.i.a(str)) != null && this.g.b(a2, j2)) {
            b();
        }
    }

    public void b() {
        int f2;
        if (!a(this.g)) {
            if (this.g.e() != 0 || ((f2 = this.b.f()) > 0 && x0.a() - this.j <= ((long) f2))) {
                c();
            }
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        a((Runnable) new ryf(this, str, str2, str3, str4, str5, x0.a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, long j2) {
        byte[] a2;
        if (!a(this.g) && (a2 = this.i.a(str, str2, str3, str4, str5)) != null && this.g.i(a2, j2)) {
            p0.a(this.c).b(j2);
            this.j = j2;
            b();
        }
    }

    public void a(String str, String str2) {
        a((Runnable) new wo5(this, str, str2, x0.a(), 2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j2) {
        byte[] a2;
        if (!a(this.g) && (a2 = this.i.a(str, str2)) != null && this.g.c(a2, j2)) {
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        y0.a("updateKidMode: newKidMode=" + bool);
        if (bool.booleanValue() != this.e) {
            if (!a(this.g)) {
                b(this.e, this.f, this.g);
            }
            this.e = bool.booleanValue();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        if (android.text.TextUtils.isEmpty(r11) == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(boolean r11, com.my.tracker.obfuscated.b1 r12, com.my.tracker.obfuscated.k0 r13) {
        /*
            r10 = this;
            com.my.tracker.obfuscated.z0 r0 = r10.b
            com.my.tracker.obfuscated.z0$a r3 = r0.k()
            com.my.tracker.obfuscated.z0 r0 = r10.b
            java.lang.String r0 = r0.l()
            com.my.tracker.obfuscated.z0 r1 = r10.b
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r9 = r1.j()
            com.my.tracker.obfuscated.l r1 = r10.h
            r1.a()
            com.my.tracker.obfuscated.l r1 = r10.h
            com.my.tracker.obfuscated.l0 r6 = r10.i
            android.content.Context r8 = r10.c
            r2 = r13
            r4 = r11
            r5 = r12
            r7 = r9
            int r11 = a(r1, r2, r3, r4, r5, r6, r7, r8)
            r12 = 1
            if (r11 == r12) goto L_0x0029
            goto L_0x004d
        L_0x0029:
            com.my.tracker.obfuscated.l r11 = r10.h
            com.my.tracker.obfuscated.c0$b r11 = r10.a((java.lang.String) r0, (com.my.tracker.MyTrackerConfig.OkHttpClientProvider) r9, (com.my.tracker.obfuscated.l) r11)
            if (r11 != 0) goto L_0x0032
            goto L_0x004d
        L_0x0032:
            boolean r12 = r11.b()
            if (r12 == 0) goto L_0x0040
            java.lang.String r12 = "Events were sent successfully"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r12)
            r13.a()
        L_0x0040:
            java.lang.Object r11 = r11.a()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r11 = 0
        L_0x004e:
            com.my.tracker.obfuscated.l r10 = r10.h
            r10.d()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.t.a(boolean, com.my.tracker.obfuscated.b1, com.my.tracker.obfuscated.k0):java.lang.String");
    }

    private c0.b a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, l lVar) {
        if (this.i.a((r0) lVar, x0.a())) {
            return c0.a(new m(lVar), okHttpClientProvider, true).a(str);
        }
        return null;
    }
}
