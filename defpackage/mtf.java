package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: mtf  reason: default package */
public final class mtf {
    public static final /* synthetic */ int l = 0;
    public final Context a;
    public final qmc b;
    public final xzc c;
    public final jk0 d = jk0.z(Boolean.TRUE);
    public final t97 e;
    public final Set f;
    public volatile xi4 g;
    public volatile boolean h;
    public final t97 i;
    public final pt9 j;
    public volatile int k;

    public mtf(Context context, qmc qmc, qmc qmc2, r7e r7e, xzc xzc) {
        this.a = context;
        this.b = qmc2;
        this.c = xzc;
        this.e = r7e;
        this.f = z3d.N(new String[]{"ru.ok.tamtam.", "ru.ok.messages."});
        this.i = ez3.O(1, new q6e(16, this));
        this.j = new pt9(new au9(new ps9(new et9(new ea5(1, this), 0).r(qmc).n(qmc), j06.Z, 1), new mb1(23, this), 3));
        this.k = 999;
        d();
    }

    public static ga3 e(mtf mtf, String str, int i2, yma yma, boolean z, int i3) {
        if ((i3 & 16) != 0) {
            z = false;
        }
        if (mtf.k < mtf.f()) {
            udd.p("mtf", "enqueueUniquePeriodicWork %s", new Object[]{str});
            mtf.k++;
            mtf.h().b(str, i2, yma);
            return new ga3(2, false, false);
        }
        udd.R("mtf", (IOException) null, "enqueueUniquePeriodicWork: put %s in backlog", Arrays.copyOf(new Object[]{str}, 1));
        juf juf = new juf(str, i2 == 2 ? a35.b : a35.a, yma);
        mtf.a(juf, z);
        ftf h2 = mtf.h();
        vqc vqc = (vqc) mtf.c;
        vqc.getClass();
        int o = (int) vqc.o(PmsKey.f128wmbacklogworkerbackoffdelaysec, (long) 10);
        if (o < 1) {
            o = 1;
        }
        gp0.G(h2, Integer.valueOf(o), juf).m();
        return new ga3(2, true, false);
    }

    public final void a(juf juf, boolean z) {
        if (z || hhd.f(Looper.getMainLooper(), Looper.myLooper())) {
            this.b.b(new zbe(this, 23, juf));
            return;
        }
        try {
            g().insert(juf);
        } catch (Throwable th) {
            udd.u("mtf", th, "fail to add item %s", new Object[]{juf.b});
        }
    }

    public final vc7 b(String str, a35 a35, cfa cfa, boolean z) {
        if (z || this.k < f()) {
            udd.p("mtf", "beginUniqueWork %s", new Object[]{str});
            if (z) {
                udd.R("mtf", (IOException) null, "ATTENTION! run NOT LIMITED WORK %s", Arrays.copyOf(new Object[]{str}, 1));
            }
            this.k++;
            itf h2 = h();
            h2.getClass();
            List singletonList = Collections.singletonList(cfa);
            itf itf = h2;
            if (!singletonList.isEmpty()) {
                return new vc7(false, new wsf(itf, str, a35, singletonList));
            }
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        udd.R("mtf", (IOException) null, "beginUniqueWork: put %s in backlog", Arrays.copyOf(new Object[]{str}, 1));
        juf juf = new juf(str, a35, cfa);
        a(juf, false);
        ftf h3 = h();
        vqc vqc = (vqc) this.c;
        vqc.getClass();
        int o = (int) vqc.o(PmsKey.f128wmbacklogworkerbackoffdelaysec, (long) 10);
        if (o < 1) {
            o = 1;
        }
        return new vc7(true, gp0.G(h3, Integer.valueOf(o), juf));
    }

    public final void c(String str) {
        udd.p("mtf", "cancelUniqueWork %s", new Object[]{str});
        itf h2 = h();
        h2.getClass();
        h2.d.c(new tv1(h2, str, true));
    }

    public final void d() {
        udd.q("mtf", "enableWorkManager");
        this.d.c(Boolean.TRUE);
        if (!this.h) {
            pt9 pt9 = this.j;
            bae bae = new bae(4, this);
            xhd xhd = xhd.o;
            pt9.getClass();
            pt9.k(new pn1(bae, 2, xhd));
        }
    }

    public final int f() {
        xzc xzc = this.c;
        vqc vqc = (vqc) xzc;
        vqc.getClass();
        int o = (int) vqc.o(PmsKey.f131wmworkerslimit, (long) 16);
        if (o < 1) {
            o = 1;
        }
        vqc vqc2 = (vqc) xzc;
        vqc2.getClass();
        int o2 = (int) vqc2.o(PmsKey.f132wmworkersoffset, (long) 2);
        if (o2 < 0) {
            o2 = 0;
        }
        int i2 = o - o2;
        if (i2 < 1) {
            return 1;
        }
        return i2;
    }

    public final WorkersQueueDao g() {
        return (WorkersQueueDao) this.e.getValue();
    }

    public final ftf h() {
        return (ftf) this.i.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
        urd.l(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009f, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(ftf r9) {
        /*
            r8 = this;
            r0 = 0
            xi4 r1 = r8.g
            if (r1 == 0) goto L_0x0008
            r1.f()
        L_0x0008:
            java.util.Set r2 = r8.f
            jtf r6 = new jtf
            r6.<init>(r0)
            java.lang.String r5 = ")"
            r7 = 24
            java.lang.String r3 = " OR "
            java.lang.String r4 = "("
            java.lang.String r1 = o23.c0(r2, r3, r4, r5, r6, r7)
            r2 = r9
            itf r2 = (itf) r2
            androidx.work.impl.WorkDatabase r2 = r2.c
            d4e r2 = r2.h()
            sz5 r2 = r2.getReadableDatabase()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "SELECT COUNT(*) FROM workspec WHERE "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " AND state=0 AND schedule_requested_at<>-1"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.database.Cursor r1 = r2.q0(r1)
            r1.moveToFirst()     // Catch:{ all -> 0x005a }
            boolean r2 = r1.isNull(r0)     // Catch:{ all -> 0x005a }
            r3 = 0
            if (r2 == 0) goto L_0x004b
            r2 = r3
            goto L_0x0053
        L_0x004b:
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x005a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005a }
        L_0x0053:
            if (r2 == 0) goto L_0x005c
            int r0 = r2.intValue()     // Catch:{ all -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r8 = move-exception
            goto L_0x009a
        L_0x005c:
            urd.l(r1, r3)
            r8.k = r0
            int r0 = r8.k
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "mtf"
            java.lang.String r2 = "scheduleWorkersCountChecking: workersCount = %d"
            udd.p(r1, r2, r0)
            qmc r0 = r8.b
            zbe r1 = new zbe
            r2 = 22
            r1.<init>(r8, r2, r9)
            xzc r9 = r8.c
            vqc r9 = (defpackage.vqc) r9
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f130wmcheckworkerscountintervalsec
            r3 = 10
            long r3 = (long) r3
            long r2 = r9.o(r2, r3)
            int r9 = (int) r2
            r2 = 1
            if (r9 >= r2) goto L_0x0090
            r9 = r2
        L_0x0090:
            long r2 = (long) r9
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            xi4 r9 = r0.c(r1, r2, r9)
            r8.g = r9
            return
        L_0x009a:
            throw r8     // Catch:{ all -> 0x009b }
        L_0x009b:
            r9 = move-exception
            urd.l(r1, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtf.i(ftf):void");
    }
}
