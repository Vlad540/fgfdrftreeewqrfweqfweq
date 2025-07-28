package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: xce  reason: default package */
public final class xce implements the {
    public static final /* synthetic */ int B0 = 0;
    public wce A0;
    public final di3 X;
    public final t52 Y;
    public final float Z = 100.0f;
    public final Context a;
    public final j2b b;
    public final x7 c;
    public final n1b o;
    public xi4 w0;
    public c97 x0;
    public wce y0;
    public wce z0;

    public xce(Context context, j2b j2b, x7 x7Var, n1b n1b, t52 t52, di3 di3) {
        this.a = context;
        this.b = j2b;
        this.c = x7Var;
        this.o = n1b;
        this.Y = t52;
        this.X = di3;
        wce.b0 = this;
        c();
    }

    public final void a(String str, boolean z) {
        if (z) {
            this.z0 = null;
            this.b.c.l("app.theme", str);
            km4.y0.n(this.a).l(str);
        }
        this.y0 = null;
        grd grd = wce.c0;
        grd.setValue((Object) null);
        this.o.a();
        this.X.e();
        this.Y.s();
        wce c2 = c();
        this.y0 = c2;
        grd.setValue(c2);
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            b bVar = (Activity) ((WeakReference) it.next()).get();
            if (bVar instanceof r5) {
                udd.q("xce", "changeTamTheme: call recreate for ".concat(bVar.getClass().getName()));
                b bVar2 = (r5) bVar;
                wce wce = this.y0;
                if (bVar2.h0()) {
                    bVar2.R0 = wce;
                    try {
                        bVar2.a0();
                        r5.X(wce, bVar2.P().c.f());
                    } catch (Exception unused) {
                        bVar2.recreate();
                    }
                } else {
                    bVar2.recreate();
                }
            }
        }
    }

    public final void b(boolean z) {
        c97 c97;
        if (!this.b.c.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode")) {
            if (z || (c97 = this.x0) == null || c97.h()) {
                wce d = d();
                if (!d.e.equals(c().e)) {
                    if (z) {
                        c97 c972 = this.x0;
                        if (c972 != null) {
                            if (!c972.h()) {
                                c97 c973 = this.x0;
                                c973.getClass();
                                bj4.a(c973);
                            }
                            this.x0 = null;
                        }
                        StringBuilder sb = new StringBuilder("checkNightModeState: change theme to ");
                        String str = d.e;
                        sb.append(str);
                        udd.q("xce", sb.toString());
                        a(str, false);
                    } else {
                        udd.q("xce", "changeThemeAfterNightModeCheck: schedule theme change after delay");
                        nu9 n = ms9.u(MultiFileUploader.UPLOAD_NEXT_INTERVAL, TimeUnit.MILLISECONDS, cnc.a()).n(de.a());
                        c97 c974 = new c97(new kce(6), new kce(7), new f5(18, this));
                        n.a(c974);
                        this.x0 = c974;
                    }
                    if (z) {
                        f();
                    }
                }
            }
        }
    }

    public final wce c() {
        if (this.y0 == null) {
            wce d = d();
            this.y0 = d;
            wce.c0.setValue(d);
        }
        return this.y0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        urd.l(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.wce d() {
        /*
            r8 = this;
            boolean r0 = r8.e()
            if (r0 == 0) goto L_0x000c
            wce r1 = r8.A0
            if (r1 == 0) goto L_0x000c
            goto L_0x00f4
        L_0x000c:
            if (r0 != 0) goto L_0x0014
            wce r1 = r8.z0
            if (r1 == 0) goto L_0x0014
            goto L_0x00f4
        L_0x0014:
            j2b r1 = r8.b
            kp r1 = r1.c
            r1.getClass()
            if (r0 == 0) goto L_0x002a
            ck9 r2 = defpackage.ck9.e0
            java.lang.String r2 = r2.e
            x97 r1 = r1.g
            java.lang.String r3 = "app.night.theme"
            java.lang.String r1 = r1.getString(r3, r2)
            goto L_0x0036
        L_0x002a:
            db4 r2 = defpackage.db4.e0
            java.lang.String r2 = r2.e
            x97 r1 = r1.g
            java.lang.String r3 = "app.theme"
            java.lang.String r1 = r1.getString(r3, r2)
        L_0x0036:
            r2 = 0
            boolean r2 = defpackage.wce.b(r1, r2)
            r3 = 1
            boolean r4 = defpackage.wce.b(r1, r3)
            r7e r5 = defpackage.wce.a0
            java.lang.Object r5 = r5.getValue()
            java.util.Set r5 = (java.util.Set) r5
            boolean r6 = r5 instanceof java.util.Collection
            java.lang.String r7 = "xce"
            if (r6 == 0) goto L_0x0055
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0055
            goto L_0x006e
        L_0x0055:
            java.util.Iterator r5 = r5.iterator()
        L_0x0059:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x006e
            java.lang.Object r6 = r5.next()
            wce r6 = (defpackage.wce) r6
            java.lang.String r6 = r6.e
            boolean r6 = hhd.f(r6, r1)
            if (r6 == 0) goto L_0x0059
            goto L_0x00a7
        L_0x006e:
            if (r4 == 0) goto L_0x00a7
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0099 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0099 }
            java.nio.charset.Charset r1 = e22.a     // Catch:{ Exception -> 0x0099 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0099 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0099 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x0099 }
            r3.<init>(r4, r1)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r1 = r2.getPath()     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = n1g.S(r3)     // Catch:{ all -> 0x0092 }
            wce r1 = oyb.r(r2, r1)     // Catch:{ all -> 0x0092 }
            r2 = 0
            urd.l(r3, r2)     // Catch:{ Exception -> 0x0099 }
            goto L_0x00ed
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r2 = move-exception
            urd.l(r3, r1)     // Catch:{ Exception -> 0x0099 }
            throw r2     // Catch:{ Exception -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            java.lang.String r2 = "failed to get file theme"
            udd.s(r7, r2, r1)
            if (r0 == 0) goto L_0x00a4
            ck9 r1 = defpackage.ck9.e0
            goto L_0x00ed
        L_0x00a4:
            db4 r1 = defpackage.db4.e0
            goto L_0x00ed
        L_0x00a7:
            if (r2 != 0) goto L_0x00de
            r7e r2 = defpackage.wce.a0     // Catch:{ Exception -> 0x00d3 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x00d3 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ Exception -> 0x00d3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00d3 }
        L_0x00b5:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00d3 }
            if (r3 == 0) goto L_0x00cb
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00d3 }
            wce r3 = (defpackage.wce) r3     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r4 = r3.e     // Catch:{ Exception -> 0x00d3 }
            boolean r4 = hhd.f(r4, r1)     // Catch:{ Exception -> 0x00d3 }
            if (r4 == 0) goto L_0x00b5
            r1 = r3
            goto L_0x00ed
        L_0x00cb:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r8.<init>(r0)     // Catch:{ Exception -> 0x00d3 }
            throw r8     // Catch:{ Exception -> 0x00d3 }
        L_0x00d3:
            r8 = move-exception
            java.lang.String r0 = "TamTheme.getThemeBy(themeId) failure, themeId = %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            udd.u(r7, r8, r0, r1)
            throw r8
        L_0x00de:
            if (r0 == 0) goto L_0x00e5
            ck9 r2 = defpackage.ck9.e0     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00e7
        L_0x00e3:
            r8 = move-exception
            goto L_0x00f5
        L_0x00e5:
            db4 r2 = defpackage.db4.e0     // Catch:{ Exception -> 0x00e3 }
        L_0x00e7:
            java.lang.String r4 = r2.e     // Catch:{ Exception -> 0x00e3 }
            r8.a(r4, r3)     // Catch:{ Exception -> 0x00e3 }
            r1 = r2
        L_0x00ed:
            if (r0 == 0) goto L_0x00f2
            r8.A0 = r1
            goto L_0x00f4
        L_0x00f2:
            r8.z0 = r1
        L_0x00f4:
            return r1
        L_0x00f5:
            java.lang.String r0 = "TamTheme.changeCurrentTheme(themeId) failure, themeId = %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            udd.u(r7, r8, r0, r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xce.d():wce");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r16 = this;
            r0 = r16
            r1 = -1
            r2 = 1
            r3 = 0
            java.lang.String r4 = "app.night.mode.system"
            j2b r5 = r0.b
            kp r6 = r5.c
            x97 r6 = r6.g
            java.lang.String r7 = "app.night.mode"
            java.lang.String r6 = r6.getString(r7, r4)
            r6.getClass()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            kp r5 = r5.c
            int r7 = r6.hashCode()
            switch(r7) {
                case -700569351: goto L_0x0044;
                case -123544841: goto L_0x0039;
                case 1712040927: goto L_0x002e;
                case 2051489143: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r4 = r1
            goto L_0x004e
        L_0x0025:
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x002c
            goto L_0x0023
        L_0x002c:
            r4 = 3
            goto L_0x004e
        L_0x002e:
            java.lang.String r4 = "app.night.mode.schedule"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0037
            goto L_0x0023
        L_0x0037:
            r4 = 2
            goto L_0x004e
        L_0x0039:
            java.lang.String r4 = "app.night.mode.auto"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r4 = r2
            goto L_0x004e
        L_0x0044:
            java.lang.String r4 = "app.night.mode.enabled"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x004d
            goto L_0x0023
        L_0x004d:
            r4 = r3
        L_0x004e:
            switch(r4) {
                case 0: goto L_0x0122;
                case 1: goto L_0x00fa;
                case 2: goto L_0x0068;
                case 3: goto L_0x0054;
                default: goto L_0x0051;
            }
        L_0x0051:
            r2 = r3
            goto L_0x0122
        L_0x0054:
            android.content.Context r0 = r0.a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L_0x0051
            goto L_0x0122
        L_0x0068:
            x97 r0 = r5.g
            java.lang.String r4 = "app.night.mode.start.h"
            r6 = 23
            int r4 = r0.getInt(r4, r6)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "app.night.mode.start.m"
            int r0 = r0.getInt(r4, r3)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            x97 r0 = r5.g
            java.lang.String r4 = "app.night.mode.end.h"
            r5 = 8
            int r4 = r0.getInt(r4, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "app.night.mode.end.m"
            int r0 = r0.getInt(r5, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.TimeZone r5 = java.util.TimeZone.getDefault()
            long r6 = java.lang.System.currentTimeMillis()
            l04 r5 = l04.g(r6, r5)
            l04 r6 = new l04
            java.lang.Integer r8 = r5.a
            java.lang.Integer r9 = r5.b
            java.lang.Integer r10 = r5.c
            r7 = r6
            r13 = r15
            r14 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            l04 r14 = new l04
            java.lang.Integer r8 = r5.a
            java.lang.Integer r9 = r5.b
            java.lang.Integer r10 = r5.c
            r7 = r14
            r11 = r4
            r12 = r0
            r13 = r15
            r0 = r14
            r14 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            int r4 = r5.e(r6)
            if (r4 >= 0) goto L_0x00df
            int r4 = r5.e(r0)
            if (r4 >= 0) goto L_0x00df
            int r4 = r6.e(r0)
            if (r4 <= 0) goto L_0x00df
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            l04 r6 = r6.l(r1)
        L_0x00dd:
            r14 = r0
            goto L_0x00ed
        L_0x00df:
            int r1 = r0.e(r6)
            if (r1 >= 0) goto L_0x00dd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            l04 r14 = r0.l(r1)
        L_0x00ed:
            int r0 = r5.e(r6)
            if (r0 < 0) goto L_0x0051
            int r0 = r5.e(r14)
            if (r0 >= 0) goto L_0x0051
            goto L_0x0122
        L_0x00fa:
            x97 r1 = r5.g
            java.lang.String r4 = "app.night.mode.brightness"
            r5 = 30
            int r1 = r1.getInt(r4, r5)
            float r0 = r0.Z
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x010c
            r0 = r4
        L_0x010c:
            r4 = 1176256512(0x461c4000, float:10000.0)
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0114
            r0 = r4
        L_0x0114:
            double r4 = (double) r0
            double r4 = java.lang.Math.log10(r4)
            r6 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r4 = r4 / r6
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r6
            int r0 = (int) r4
            if (r0 > r1) goto L_0x0051
        L_0x0122:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xce.e():boolean");
    }

    public final void f() {
        long j;
        xi4 xi4 = this.w0;
        if (xi4 != null) {
            if (!xi4.h()) {
                this.w0.f();
            }
            this.w0 = null;
        }
        j2b j2b = this.b;
        if (!j2b.c.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode")) {
            kp kpVar = j2b.c;
            if (kpVar.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode.schedule")) {
                l04 g = l04.g(System.currentTimeMillis(), TimeZone.getDefault());
                x97 x97 = kpVar.g;
                Integer valueOf = Integer.valueOf(x97.getInt("app.night.mode.start.h", 23));
                Integer valueOf2 = Integer.valueOf(x97.getInt("app.night.mode.start.m", 0));
                x97 x972 = kpVar.g;
                Integer valueOf3 = Integer.valueOf(x972.getInt("app.night.mode.end.h", 8));
                Integer valueOf4 = Integer.valueOf(x972.getInt("app.night.mode.end.m", 0));
                l04 l04 = new l04(g.a, g.b, g.c, valueOf, valueOf2, 0, 0);
                l04 l042 = new l04(g.a, g.b, g.c, valueOf3, valueOf4, 0, 0);
                if (l04.e(g) < 0) {
                    l04 = l04.l(1);
                }
                if (l042.e(g) < 0) {
                    l042 = l042.l(1);
                }
                if (l04.e(l042) >= 0) {
                    l04 = l042;
                }
                if (!g.n(new int[]{1, 2, 3}) || !l04.n(new int[]{1, 2, 3})) {
                    j = 0;
                } else {
                    l04.f();
                    g.f();
                    j = (long) (((l04.c() - 2400001) - (g.c() - 2400001)) * 86400);
                }
                long k = (j - ((long) g.k())) + ((long) l04.k());
                udd.q("xce", "createScheduledJobsIfNeed: next time to check: " + l04.toString() + " delay: " + k);
                this.w0 = de.a().c(new pzb(29, this), k, TimeUnit.SECONDS);
            }
        }
    }

    public final wce t() {
        return c();
    }
}
