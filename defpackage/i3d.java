package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: i3d  reason: default package */
public final class i3d {
    public final Context a;
    public final Object b = new Object();
    public final v2b c = new v2b((s16) new ke(7, this));
    public volatile boolean d;
    public final long e = System.currentTimeMillis();
    public c9e f;
    public long g = Long.MIN_VALUE;
    public c9e h;
    public long i = Long.MIN_VALUE;
    public List j = hw4.a;
    public volatile d3d k;
    public volatile d3d l;

    public i3d(Context context) {
        this.a = context;
    }

    public static void d(i3d i3d, int i2, boolean z, z9d z9d, int i3) {
        d3d d3d = null;
        if ((i3 & 1) != 0) {
            d3d d3d2 = i3d.k;
            if (d3d2 == null) {
                d3d2 = null;
            }
            i2 = d3d2.f;
        }
        if ((i3 & 2) != 0) {
            d3d d3d3 = i3d.k;
            if (d3d3 == null) {
                d3d3 = null;
            }
            z = d3d3.h;
        }
        if ((i3 & 4) != 0) {
            d3d d3d4 = i3d.k;
            if (d3d4 == null) {
                d3d4 = null;
            }
            z9d = d3d4.g;
        }
        synchronized (i3d.b) {
            i3d.b();
            d3d d3d5 = i3d.k;
            if (d3d5 == null) {
                d3d5 = null;
            }
            i3d.k = d3d.a(d3d5, i2, z9d, z, 31);
            List S = o23.S(1, i3d.j);
            d3d d3d6 = i3d.k;
            if (d3d6 != null) {
                d3d = d3d6;
            }
            ArrayList j0 = o23.j0(S, d3d);
            i3d.j = j0;
            i3d.c.p(js.F(j0).toString(), "session_states");
            i3d.c.s();
        }
    }

    public final void a() {
        synchronized (this.b) {
            b();
            this.i = this.e;
            this.j = Collections.singletonList(o23.e0(this.j));
            this.c.p(Long.valueOf(this.i), "session_state_upload_ts");
            this.c.p(js.F(this.j).toString(), "session_states");
            this.c.s();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00c1 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd A[SYNTHETIC, Splitter:B:32:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0100 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010b A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0121 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0122 A[Catch:{ all -> 0x002e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.d
            if (r0 != 0) goto L_0x014c
            java.lang.Object r0 = r15.b
            monitor-enter(r0)
            boolean r1 = r15.d     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x0148
            v2b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "session_start_ts"
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x002e }
            r7e r1 = (r7e) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002e }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x002e }
            r2 = -9223372036854775808
            if (r1 == 0) goto L_0x0031
            long r4 = r1.longValue()     // Catch:{ all -> 0x002e }
            goto L_0x0032
        L_0x002e:
            r15 = move-exception
            goto L_0x014a
        L_0x0031:
            r4 = r2
        L_0x0032:
            r15.g = r4     // Catch:{ all -> 0x002e }
            v2b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.lang.String r4 = "session_system_state"
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x002e }
            r7e r1 = (r7e) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002e }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x002e }
            r4 = 0
            if (r1 != 0) goto L_0x0053
        L_0x0051:
            r1 = r4
            goto L_0x0057
        L_0x0053:
            c9e r1 = xs7.s(r1)     // Catch:{ Exception -> 0x0051 }
        L_0x0057:
            r15.h = r1     // Catch:{ all -> 0x002e }
            android.content.Context r1 = r15.a     // Catch:{ all -> 0x002e }
            c9e r1 = at7.k(r1)     // Catch:{ all -> 0x002e }
            c9e r5 = r15.h     // Catch:{ all -> 0x002e }
            if (r5 == 0) goto L_0x0066
            java.util.Map r5 = r5.m     // Catch:{ all -> 0x002e }
            goto L_0x0067
        L_0x0066:
            r5 = r4
        L_0x0067:
            if (r5 == 0) goto L_0x007a
            java.util.Map r6 = r1.m     // Catch:{ all -> 0x002e }
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch:{ all -> 0x002e }
            r7.<init>(r5)     // Catch:{ all -> 0x002e }
            r7.putAll(r6)     // Catch:{ all -> 0x002e }
            r5 = 12287(0x2fff, float:1.7218E-41)
            r6 = 0
            c9e r1 = defpackage.c9e.a(r1, r6, r7, r5)     // Catch:{ all -> 0x002e }
        L_0x007a:
            r15.f = r1     // Catch:{ all -> 0x002e }
            v2b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.lang.String r5 = "session_state_upload_ts"
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x002e }
            r7e r1 = (r7e) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002e }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x002e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x009c
            long r2 = r1.longValue()     // Catch:{ all -> 0x002e }
        L_0x009c:
            r15.i = r2     // Catch:{ all -> 0x002e }
            v2b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "session_states"
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x002e }
            r7e r1 = (r7e) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002e }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x002e }
            hw4 r2 = hw4.a     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x00bd
            goto L_0x00c1
        L_0x00bd:
            java.util.ArrayList r2 = js.k(r1)     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            c9e r1 = r15.f     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x00c6
            r1 = r4
        L_0x00c6:
            d3d r3 = new d3d     // Catch:{ all -> 0x002e }
            java.util.Map r5 = r1.m     // Catch:{ all -> 0x002e }
            java.lang.String r6 = "processName"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x002e }
            r11 = r5
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x002e }
            long r6 = r1.b     // Catch:{ all -> 0x002e }
            java.lang.String r8 = r1.a     // Catch:{ all -> 0x002e }
            java.lang.String r9 = r1.d     // Catch:{ all -> 0x002e }
            java.lang.String r10 = r1.f     // Catch:{ all -> 0x002e }
            boolean r14 = r1.k     // Catch:{ all -> 0x002e }
            r13 = 0
            r12 = 1
            r5 = r3
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x002e }
            java.util.ArrayList r1 = o23.j0(r2, r3)     // Catch:{ all -> 0x002e }
            r2 = 50
            java.util.List r1 = o23.o0(r2, r1)     // Catch:{ all -> 0x002e }
            r15.j = r1     // Catch:{ all -> 0x002e }
            int r1 = r1.size()     // Catch:{ all -> 0x002e }
            java.util.List r2 = r15.j     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = o23.e0(r2)     // Catch:{ all -> 0x002e }
            d3d r2 = (defpackage.d3d) r2     // Catch:{ all -> 0x002e }
            r15.k = r2     // Catch:{ all -> 0x002e }
            r2 = 1
            if (r1 <= r2) goto L_0x010b
            java.util.List r3 = r15.j     // Catch:{ all -> 0x002e }
            int r1 = r1 + -2
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x002e }
            d3d r1 = (defpackage.d3d) r1     // Catch:{ all -> 0x002e }
            goto L_0x010c
        L_0x010b:
            r1 = r4
        L_0x010c:
            r15.l = r1     // Catch:{ all -> 0x002e }
            v2b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.lang.String r3 = "session_start_ts"
            long r5 = r15.e     // Catch:{ all -> 0x002e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x002e }
            r1.p(r5, r3)     // Catch:{ all -> 0x002e }
            v2b r1 = r15.c     // Catch:{ all -> 0x002e }
            c9e r3 = r15.f     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r4 = r3
        L_0x0123:
            org.json.JSONObject r3 = xs7.S(r4)     // Catch:{ all -> 0x002e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x002e }
            java.lang.String r4 = "session_system_state"
            r1.p(r3, r4)     // Catch:{ all -> 0x002e }
            v2b r1 = r15.c     // Catch:{ all -> 0x002e }
            java.util.List r3 = r15.j     // Catch:{ all -> 0x002e }
            org.json.JSONArray r3 = js.F(r3)     // Catch:{ all -> 0x002e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x002e }
            java.lang.String r4 = "session_states"
            r1.p(r3, r4)     // Catch:{ all -> 0x002e }
            v2b r1 = r15.c     // Catch:{ all -> 0x002e }
            r1.s()     // Catch:{ all -> 0x002e }
            r15.d = r2     // Catch:{ all -> 0x002e }
        L_0x0148:
            monitor-exit(r0)
            goto L_0x014c
        L_0x014a:
            monitor-exit(r0)
            throw r15
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3d.b():void");
    }

    public final c9e c() {
        Map map;
        b();
        c9e c9e = this.f;
        if (c9e == null) {
            c9e = null;
        }
        c9e.getClass();
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(new Date());
        Map map2 = c9e.m;
        if (map2.isEmpty()) {
            map = Collections.singletonMap("date", format);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.put("date", format);
            map = linkedHashMap;
        }
        return c9e.a(c9e, false, map, 12287);
    }

    public final void e(boolean z) {
        synchronized (this.b) {
            b();
            c9e c9e = this.f;
            if ((c9e == null ? null : c9e).k != z) {
                if (c9e == null) {
                    c9e = null;
                }
                c9e a2 = c9e.a(c9e, z, (Map) null, 15359);
                this.f = a2;
                this.c.p(xs7.S(a2).toString(), "session_system_state");
                d(this, 0, z, (z9d) null, 5);
            }
        }
    }

    public final void f(Map map) {
        boolean z;
        synchronized (this.b) {
            try {
                b();
                c9e c9e = this.f;
                c9e c9e2 = null;
                if (c9e == null) {
                    c9e = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c9e.m);
                loop0:
                while (true) {
                    z = false;
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getValue();
                        String y0 = h0e.y0(32, (String) entry.getKey());
                        String y02 = str != null ? h0e.y0(64, str) : null;
                        if (!hhd.f(linkedHashMap.get(y0), y02)) {
                            if (y02 != null) {
                                linkedHashMap.put(y0, y02);
                            } else {
                                linkedHashMap.remove(y0);
                            }
                            z = true;
                        }
                    }
                    break loop0;
                }
                if (z) {
                    c9e c9e3 = this.f;
                    if (c9e3 != null) {
                        c9e2 = c9e3;
                    }
                    c9e a2 = c9e.a(c9e2, false, linkedHashMap, 12287);
                    this.f = a2;
                    this.c.p(xs7.S(a2).toString(), "session_system_state");
                    this.c.s();
                }
            } finally {
            }
        }
    }

    public final void g(int i2) {
        b();
        d3d d3d = this.l;
        if (d3d != null) {
            synchronized (this.b) {
                b();
                d3d a2 = d3d.a(d3d, i2, (z9d) null, false, 223);
                this.l = a2;
                if (this.j.size() > 1) {
                    ArrayList j0 = o23.j0(o23.j0(o23.S(2, this.j), a2), o23.e0(this.j));
                    this.j = j0;
                    this.c.p(js.F(j0).toString(), "session_states");
                    this.c.s();
                }
            }
        }
    }
}
