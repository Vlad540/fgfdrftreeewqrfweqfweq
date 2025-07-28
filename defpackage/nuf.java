package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: nuf  reason: default package */
public final class nuf implements Runnable {
    public static final String H0 = a24.e0("WorkerWrapper");
    public final buf A0;
    public final qe4 B0;
    public final List C0;
    public String D0;
    public final b4d E0 = new Object();
    public final b4d F0 = new Object();
    public volatile boolean G0;
    public final ztf X;
    public hh7 Y;
    public final bee Z;
    public final Context a;
    public final String b;
    public final List c;
    public final w4g o;
    public gh7 w0 = gh7.a();
    public final sa3 x0;
    public final ju5 y0;
    public final WorkDatabase z0;

    /* JADX WARNING: type inference failed for: r0v1, types: [b4d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [b4d, java.lang.Object] */
    public nuf(km4 km4) {
        this.a = (Context) km4.b;
        this.Z = (bee) km4.a;
        this.y0 = (ju5) km4.c;
        ztf ztf = (ztf) km4.Y;
        this.X = ztf;
        this.b = ztf.a;
        this.c = (List) km4.Z;
        this.o = (w4g) km4.x0;
        this.Y = null;
        this.x0 = (sa3) km4.o;
        WorkDatabase workDatabase = (WorkDatabase) km4.X;
        this.z0 = workDatabase;
        this.A0 = workDatabase.y();
        this.B0 = workDatabase.t();
        this.C0 = (List) km4.w0;
    }

    public final void a(gh7 gh7) {
        boolean z = gh7 instanceof fh7;
        ztf ztf = this.X;
        String str = H0;
        if (z) {
            a24 B = a24.B();
            B.P(str, "Worker result SUCCESS for " + this.D0);
            if (ztf.d()) {
                d();
                return;
            }
            qe4 qe4 = this.B0;
            String str2 = this.b;
            buf buf = this.A0;
            WorkDatabase workDatabase = this.z0;
            workDatabase.c();
            try {
                buf.q(ctf.c, str2);
                buf.p(str2, ((fh7) this.w0).a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = qe4.x(str2).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (buf.j(str3) == ctf.X && qe4.C(str3)) {
                        a24 B2 = a24.B();
                        B2.P(str, "Setting status to enqueued for " + str3);
                        buf.q(ctf.a, str3);
                        buf.o(currentTimeMillis, str3);
                    }
                }
                workDatabase.r();
                workDatabase.l();
                e(false);
            } catch (Throwable th) {
                workDatabase.l();
                e(false);
                throw th;
            }
        } else if (gh7 instanceof eh7) {
            a24 B3 = a24.B();
            B3.P(str, "Worker result RETRY for " + this.D0);
            c();
        } else {
            a24 B4 = a24.B();
            B4.P(str, "Worker result FAILURE for " + this.D0);
            if (ztf.d()) {
                d();
            } else {
                g();
            }
        }
    }

    public final void b() {
        boolean h = h();
        WorkDatabase workDatabase = this.z0;
        String str = this.b;
        if (!h) {
            workDatabase.c();
            try {
                ctf j = this.A0.j(str);
                workDatabase.x().l(str);
                if (j == null) {
                    e(false);
                } else if (j == ctf.b) {
                    a(this.w0);
                } else if (!j.a()) {
                    c();
                }
                workDatabase.r();
                workDatabase.l();
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
        List<rmc> list = this.c;
        if (list != null) {
            for (rmc d : list) {
                d.d(str);
            }
            dnc.a(this.x0, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.b;
        buf buf = this.A0;
        WorkDatabase workDatabase = this.z0;
        workDatabase.c();
        try {
            buf.q(ctf.a, str);
            buf.o(System.currentTimeMillis(), str);
            buf.n(-1, str);
            workDatabase.r();
        } finally {
            workDatabase.l();
            e(true);
        }
    }

    public final void d() {
        aec aec;
        rtf rtf;
        yz5 f;
        rtf rtf2;
        yz5 f2;
        String str = this.b;
        buf buf = this.A0;
        WorkDatabase workDatabase = this.z0;
        workDatabase.c();
        try {
            buf.o(System.currentTimeMillis(), str);
            aec = (aec) buf.a;
            buf.q(ctf.a, str);
            aec.b();
            rtf = (rtf) buf.j;
            f = rtf.f();
            if (str == null) {
                f.W(1);
            } else {
                f.f(1, str);
            }
            aec.c();
            f.n();
            aec.r();
            aec.l();
            rtf.u(f);
            aec.b();
            rtf2 = (rtf) buf.f;
            f2 = rtf2.f();
            if (str == null) {
                f2.W(1);
            } else {
                f2.f(1, str);
            }
            aec.c();
            f2.n();
            aec.r();
            aec.l();
            rtf2.u(f2);
            buf.n(-1, str);
            workDatabase.r();
            workDatabase.l();
            e(false);
        } catch (Throwable th) {
            workDatabase.l();
            e(false);
            throw th;
        }
    }

    public final void e(boolean z) {
        pec a2;
        Cursor o2;
        boolean containsKey;
        this.z0.c();
        try {
            buf y = this.z0.y();
            y.getClass();
            a2 = pec.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            aec aec = (aec) y.a;
            aec.b();
            o2 = aec.o(a2, (CancellationSignal) null);
            boolean z2 = o2.moveToFirst() && o2.getInt(0) != 0;
            o2.close();
            a2.m();
            if (!z2) {
                iia.a(this.a, RescheduleReceiver.class, false);
            }
            if (z) {
                this.A0.q(ctf.a, this.b);
                this.A0.n(-1, this.b);
            }
            if (!(this.X == null || this.Y == null)) {
                ju5 ju5 = this.y0;
                String str = this.b;
                t4b t4b = (t4b) ju5;
                synchronized (t4b.A0) {
                    containsKey = t4b.Y.containsKey(str);
                }
                if (containsKey) {
                    ju5 ju52 = this.y0;
                    String str2 = this.b;
                    t4b t4b2 = (t4b) ju52;
                    synchronized (t4b2.A0) {
                        t4b2.Y.remove(str2);
                        t4b2.i();
                    }
                }
            }
            this.z0.r();
            this.z0.l();
            this.E0.j(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.z0.l();
            throw th;
        }
    }

    public final void f() {
        buf buf = this.A0;
        String str = this.b;
        ctf j = buf.j(str);
        ctf ctf = ctf.b;
        String str2 = H0;
        if (j == ctf) {
            a24 B = a24.B();
            B.t(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        a24 B2 = a24.B();
        B2.t(str2, "Status for " + str + " is " + j + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.b;
        WorkDatabase workDatabase = this.z0;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                buf buf = this.A0;
                if (!isEmpty) {
                    String str2 = (String) linkedList.remove();
                    if (buf.j(str2) != ctf.Y) {
                        buf.q(ctf.o, str2);
                    }
                    linkedList.addAll(this.B0.x(str2));
                } else {
                    buf.p(str, ((dh7) this.w0).a);
                    workDatabase.r();
                    return;
                }
            }
        } finally {
            workDatabase.l();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.G0) {
            return false;
        }
        a24 B = a24.B();
        String str = H0;
        B.t(str, "Work interrupted for " + this.D0);
        ctf j = this.A0.j(this.b);
        if (j == null) {
            e(false);
        } else {
            e(!j.a());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.work.WorkerParameters, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        if ((r5.b == r9 && r5.k > 0) != false) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Work [ id="
            r0.<init>(r3)
            java.lang.String r3 = r1.b
            r0.append(r3)
            java.lang.String r4 = ", tags={ "
            r0.append(r4)
            java.util.List r4 = r1.C0
            java.util.Iterator r5 = r4.iterator()
            r6 = 1
            r7 = r6
        L_0x001b:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0034
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            if (r7 == 0) goto L_0x002b
            r7 = 0
            goto L_0x0030
        L_0x002b:
            java.lang.String r9 = ", "
            r0.append(r9)
        L_0x0030:
            r0.append(r8)
            goto L_0x001b
        L_0x0034:
            java.lang.String r5 = " } ]"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1.D0 = r0
            ztf r5 = r1.X
            java.lang.String r0 = "Delaying execution for "
            boolean r7 = r24.h()
            if (r7 == 0) goto L_0x004b
            goto L_0x02b7
        L_0x004b:
            androidx.work.impl.WorkDatabase r7 = r1.z0
            r7.c()
            ctf r8 = r5.b     // Catch:{ all -> 0x007d }
            ctf r9 = defpackage.ctf.a
            java.lang.String r10 = r5.c
            java.lang.String r11 = H0
            if (r8 == r9) goto L_0x0080
            r24.f()     // Catch:{ all -> 0x007d }
            r7.r()     // Catch:{ all -> 0x007d }
            a24 r0 = defpackage.a24.B()     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r1.<init>()     // Catch:{ all -> 0x007d }
            r1.append(r10)     // Catch:{ all -> 0x007d }
            java.lang.String r2 = " is not in ENQUEUED state. Nothing more to do"
            r1.append(r2)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007d }
            r0.t(r11, r1)     // Catch:{ all -> 0x007d }
        L_0x0078:
            r7.l()
            goto L_0x02b7
        L_0x007d:
            r0 = move-exception
            goto L_0x02c3
        L_0x0080:
            boolean r8 = r5.d()     // Catch:{ all -> 0x007d }
            if (r8 != 0) goto L_0x0093
            ctf r8 = r5.b     // Catch:{ all -> 0x007d }
            if (r8 != r9) goto L_0x0090
            int r8 = r5.k     // Catch:{ all -> 0x007d }
            if (r8 <= 0) goto L_0x0090
            r8 = r6
            goto L_0x0091
        L_0x0090:
            r8 = 0
        L_0x0091:
            if (r8 == 0) goto L_0x00be
        L_0x0093:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007d }
            long r14 = r5.a()     // Catch:{ all -> 0x007d }
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x00be
            a24 r2 = defpackage.a24.B()     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r3.<init>(r0)     // Catch:{ all -> 0x007d }
            r3.append(r10)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = " because it is being executed before schedule."
            r3.append(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x007d }
            r2.t(r11, r0)     // Catch:{ all -> 0x007d }
            r1.e(r6)     // Catch:{ all -> 0x007d }
            r7.r()     // Catch:{ all -> 0x007d }
            goto L_0x0078
        L_0x00be:
            r7.r()     // Catch:{ all -> 0x007d }
            r7.l()
            boolean r0 = r5.d()
            buf r8 = r1.A0
            sa3 r12 = r1.x0
            if (r0 == 0) goto L_0x00d2
            zy3 r0 = r5.e
            goto L_0x0176
        L_0x00d2:
            cqc r0 = r12.d
            java.lang.String r13 = r5.d
            r0.getClass()
            java.lang.String r0 = defpackage.jx6.a
            r14 = 0
            java.lang.Class r0 = java.lang.Class.forName(r13)     // Catch:{ Exception -> 0x00eb }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r14)     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r0 = r0.newInstance(r14)     // Catch:{ Exception -> 0x00eb }
            jx6 r0 = (defpackage.jx6) r0     // Catch:{ Exception -> 0x00eb }
            goto L_0x00fc
        L_0x00eb:
            r0 = move-exception
            a24 r15 = defpackage.a24.B()
            java.lang.String r2 = "Trouble instantiating + "
            java.lang.String r2 = rf0.h(r2, r13)
            java.lang.String r13 = defpackage.jx6.a
            r15.y(r13, r2, r0)
            r0 = r14
        L_0x00fc:
            if (r0 != 0) goto L_0x011a
            a24 r0 = defpackage.a24.B()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not create Input Merger "
            r2.<init>(r3)
            java.lang.String r3 = r5.d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.x(r11, r2)
            r24.g()
            goto L_0x02b7
        L_0x011a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            zy3 r13 = r5.e
            r2.add(r13)
            r8.getClass()
            java.lang.String r13 = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            pec r13 = defpackage.pec.a(r6, r13)
            if (r3 != 0) goto L_0x0133
            r13.W(r6)
            goto L_0x0136
        L_0x0133:
            r13.f(r6, r3)
        L_0x0136:
            java.lang.Object r15 = r8.a
            aec r15 = (defpackage.aec) r15
            r15.b()
            android.database.Cursor r15 = r15.o(r13, r14)
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0166 }
            int r6 = r15.getCount()     // Catch:{ all -> 0x0166 }
            r14.<init>(r6)     // Catch:{ all -> 0x0166 }
        L_0x014a:
            boolean r6 = r15.moveToNext()     // Catch:{ all -> 0x0166 }
            if (r6 == 0) goto L_0x0169
            r6 = 0
            boolean r16 = r15.isNull(r6)     // Catch:{ all -> 0x0166 }
            if (r16 == 0) goto L_0x015a
            r18 = 0
            goto L_0x015e
        L_0x015a:
            byte[] r18 = r15.getBlob(r6)     // Catch:{ all -> 0x0166 }
        L_0x015e:
            zy3 r6 = defpackage.zy3.a(r18)     // Catch:{ all -> 0x0166 }
            r14.add(r6)     // Catch:{ all -> 0x0166 }
            goto L_0x014a
        L_0x0166:
            r0 = move-exception
            goto L_0x02bc
        L_0x0169:
            r15.close()
            r13.m()
            r2.addAll(r14)
            zy3 r0 = r0.a(r2)
        L_0x0176:
            androidx.work.WorkerParameters r2 = new androidx.work.WorkerParameters
            java.util.UUID r6 = java.util.UUID.fromString(r3)
            int r5 = r5.k
            java.util.concurrent.Executor r13 = r12.a
            ttf r14 = new ttf
            bee r15 = r1.Z
            r14.<init>(r7, r15)
            r17 = r9
            atf r9 = new atf
            r18 = r3
            ju5 r3 = r1.y0
            r9.<init>(r7, r3, r15)
            r2.<init>()
            r2.a = r6
            r2.b = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r4)
            r2.c = r0
            w4g r0 = r1.o
            r2.d = r0
            r2.e = r5
            r2.f = r13
            r2.g = r15
            iuf r0 = r12.c
            r2.h = r0
            r2.i = r14
            r2.j = r9
            hh7 r3 = r1.Y
            if (r3 != 0) goto L_0x01be
            android.content.Context r3 = r1.a
            hh7 r0 = r0.b(r3, r10, r2)
            r1.Y = r0
        L_0x01be:
            hh7 r0 = r1.Y
            if (r0 != 0) goto L_0x01dc
            a24 r0 = defpackage.a24.B()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not create Worker "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r0.x(r11, r2)
            r24.g()
            goto L_0x02b7
        L_0x01dc:
            boolean r0 = r0.isUsed()
            if (r0 == 0) goto L_0x0201
            a24 r0 = defpackage.a24.B()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Received an already-used Worker "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = "; Worker Factory should return new instances"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.x(r11, r2)
            r24.g()
            goto L_0x02b7
        L_0x0201:
            hh7 r0 = r1.Y
            r0.setUsed()
            r7.c()
            r2 = r18
            ctf r0 = r8.j(r2)     // Catch:{ all -> 0x024c }
            r3 = r17
            if (r0 != r3) goto L_0x024e
            ctf r0 = defpackage.ctf.b     // Catch:{ all -> 0x024c }
            r8.q(r0, r2)     // Catch:{ all -> 0x024c }
            java.lang.Object r0 = r8.a     // Catch:{ all -> 0x024c }
            r3 = r0
            aec r3 = (defpackage.aec) r3     // Catch:{ all -> 0x024c }
            r3.b()     // Catch:{ all -> 0x024c }
            java.lang.Object r0 = r8.i     // Catch:{ all -> 0x024c }
            r4 = r0
            rtf r4 = (defpackage.rtf) r4     // Catch:{ all -> 0x024c }
            yz5 r5 = r4.f()     // Catch:{ all -> 0x024c }
            if (r2 != 0) goto L_0x0230
            r6 = 1
            r5.W(r6)     // Catch:{ all -> 0x024c }
            goto L_0x0234
        L_0x0230:
            r6 = 1
            r5.f(r6, r2)     // Catch:{ all -> 0x024c }
        L_0x0234:
            r3.c()     // Catch:{ all -> 0x024c }
            r5.n()     // Catch:{ all -> 0x0244 }
            r3.r()     // Catch:{ all -> 0x0244 }
            r3.l()     // Catch:{ all -> 0x024c }
            r4.u(r5)     // Catch:{ all -> 0x024c }
            goto L_0x024f
        L_0x0244:
            r0 = move-exception
            r3.l()     // Catch:{ all -> 0x024c }
            r4.u(r5)     // Catch:{ all -> 0x024c }
            throw r0     // Catch:{ all -> 0x024c }
        L_0x024c:
            r0 = move-exception
            goto L_0x02b8
        L_0x024e:
            r6 = 0
        L_0x024f:
            r7.r()     // Catch:{ all -> 0x024c }
            r7.l()
            if (r6 == 0) goto L_0x02b4
            boolean r0 = r24.h()
            if (r0 == 0) goto L_0x025e
            goto L_0x02b7
        L_0x025e:
            zsf r0 = new zsf
            hh7 r2 = r1.Y
            android.content.Context r3 = r1.a
            ztf r4 = r1.X
            bee r5 = r1.Z
            r18 = r0
            r19 = r3
            r20 = r4
            r21 = r2
            r22 = r9
            r23 = r5
            r18.<init>(r19, r20, r21, r22, r23)
            duf r15 = (defpackage.duf) r15
            java.lang.Object r2 = r15.c
            m30 r2 = (defpackage.m30) r2
            r2.execute(r0)
            zbe r2 = new zbe
            b4d r0 = r0.a
            r3 = 24
            r2.<init>(r1, r3, r0)
            mh4 r3 = new mh4
            r4 = 6
            r3.<init>(r4)
            b4d r4 = r1.F0
            r4.c(r2, r3)
            q36 r2 = new q36
            r3 = 26
            r5 = 0
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r0, (boolean) r5, (int) r3)
            java.lang.Object r3 = r15.c
            m30 r3 = (defpackage.m30) r3
            r0.c(r2, r3)
            java.lang.String r0 = r1.D0
            p36 r2 = new p36
            r3 = 29
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r0, (boolean) r5, (int) r3)
            java.lang.Object r0 = r15.a
            qm r0 = (defpackage.qm) r0
            r4.c(r2, r0)
            goto L_0x02b7
        L_0x02b4:
            r24.f()
        L_0x02b7:
            return
        L_0x02b8:
            r7.l()
            throw r0
        L_0x02bc:
            r15.close()
            r13.m()
            throw r0
        L_0x02c3:
            r7.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuf.run():void");
    }
}
