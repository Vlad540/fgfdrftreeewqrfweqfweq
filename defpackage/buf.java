package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;

/* renamed from: buf  reason: default package */
public final class buf {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public buf(aec aec) {
        this.a = aec;
        this.b = new qtf(aec, 1);
        this.c = new f74(aec, 7);
        this.d = new rtf(aec, 5);
        this.e = new rtf(aec, 6);
        this.f = new rtf(aec, 7);
        this.g = new rtf(aec, 8);
        this.h = new rtf(aec, 9);
        this.i = new rtf(aec, 10);
        this.j = new rtf(aec, 11);
        this.k = new rtf(aec, 1);
        this.l = new rtf(aec, 2);
        new rtf(aec, 3);
        new rtf(aec, 4);
    }

    public static void d(udd udd) {
        if (udd instanceof kgc) {
            ((kgc) udd).getClass();
        } else if (udd instanceof sx3) {
            ((sx3) udd).getClass();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kgd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: yr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: kgd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: yr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: kgd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: yr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: kgd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.yr r9) {
        /*
            r8 = this;
            java.util.Set r0 = r9.keySet()
            vr r0 = (defpackage.vr) r0
            yr r1 = r0.a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x000f
            return
        L_0x000f:
            int r2 = r9.c
            r3 = 999(0x3e7, float:1.4E-42)
            r4 = 0
            if (r2 <= r3) goto L_0x0046
            yr r0 = new yr
            r0.<init>(r3)
            int r1 = r9.c
            r2 = r4
            r5 = r2
        L_0x001f:
            if (r2 >= r1) goto L_0x0040
            java.lang.Object r6 = r9.f(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.i(r2)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0.put(r6, r7)
            int r2 = r2 + 1
            int r5 = r5 + 1
            if (r5 != r3) goto L_0x001f
            r8.a(r0)
            yr r0 = new yr
            r0.<init>(r3)
            r5 = r4
            goto L_0x001f
        L_0x0040:
            if (r5 <= 0) goto L_0x0045
            r8.a(r0)
        L_0x0045:
            return
        L_0x0046:
            java.lang.String r2 = "SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN ("
            java.lang.StringBuilder r2 = defpackage.hr1.l(r2)
            int r1 = r1.c
            defpackage.a06.e(r2, r1)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            pec r1 = defpackage.pec.a(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L_0x0063:
            r3 = r0
            ur r3 = (defpackage.ur) r3
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007e
            java.lang.Object r3 = r3.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0078
            r1.W(r2)
            goto L_0x007b
        L_0x0078:
            r1.f(r2, r3)
        L_0x007b:
            int r2 = r2 + 1
            goto L_0x0063
        L_0x007e:
            java.lang.Object r8 = r8.a
            aec r8 = (defpackage.aec) r8
            r0 = 0
            android.database.Cursor r8 = r8.o(r1, r0)
            java.lang.String r1 = "work_spec_id"
            int r1 = gp0.n(r8, r1)     // Catch:{ all -> 0x00ba }
            r2 = -1
            if (r1 != r2) goto L_0x0094
            r8.close()
            return
        L_0x0094:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x00bc
            java.lang.String r2 = r8.getString(r1)     // Catch:{ all -> 0x00ba }
            java.lang.Object r2 = r9.get(r2)     // Catch:{ all -> 0x00ba }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x0094
            boolean r3 = r8.isNull(r4)     // Catch:{ all -> 0x00ba }
            if (r3 == 0) goto L_0x00ae
            r3 = r0
            goto L_0x00b2
        L_0x00ae:
            byte[] r3 = r8.getBlob(r4)     // Catch:{ all -> 0x00ba }
        L_0x00b2:
            zy3 r3 = defpackage.zy3.a(r3)     // Catch:{ all -> 0x00ba }
            r2.add(r3)     // Catch:{ all -> 0x00ba }
            goto L_0x0094
        L_0x00ba:
            r9 = move-exception
            goto L_0x00c0
        L_0x00bc:
            r8.close()
            return
        L_0x00c0:
            r8.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buf.a(yr):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kgd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: yr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: kgd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: yr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: kgd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: yr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: kgd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(defpackage.yr r9) {
        /*
            r8 = this;
            java.util.Set r0 = r9.keySet()
            vr r0 = (defpackage.vr) r0
            yr r1 = r0.a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x000f
            return
        L_0x000f:
            int r2 = r9.c
            r3 = 999(0x3e7, float:1.4E-42)
            r4 = 0
            if (r2 <= r3) goto L_0x0046
            yr r0 = new yr
            r0.<init>(r3)
            int r1 = r9.c
            r2 = r4
            r5 = r2
        L_0x001f:
            if (r2 >= r1) goto L_0x0040
            java.lang.Object r6 = r9.f(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.i(r2)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0.put(r6, r7)
            int r2 = r2 + 1
            int r5 = r5 + 1
            if (r5 != r3) goto L_0x001f
            r8.b(r0)
            yr r0 = new yr
            r0.<init>(r3)
            r5 = r4
            goto L_0x001f
        L_0x0040:
            if (r5 <= 0) goto L_0x0045
            r8.b(r0)
        L_0x0045:
            return
        L_0x0046:
            java.lang.String r2 = "SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN ("
            java.lang.StringBuilder r2 = defpackage.hr1.l(r2)
            int r1 = r1.c
            defpackage.a06.e(r2, r1)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            pec r1 = defpackage.pec.a(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L_0x0063:
            r3 = r0
            ur r3 = (defpackage.ur) r3
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007e
            java.lang.Object r3 = r3.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0078
            r1.W(r2)
            goto L_0x007b
        L_0x0078:
            r1.f(r2, r3)
        L_0x007b:
            int r2 = r2 + 1
            goto L_0x0063
        L_0x007e:
            java.lang.Object r8 = r8.a
            aec r8 = (defpackage.aec) r8
            r0 = 0
            android.database.Cursor r8 = r8.o(r1, r0)
            java.lang.String r1 = "work_spec_id"
            int r1 = gp0.n(r8, r1)     // Catch:{ all -> 0x00b6 }
            r2 = -1
            if (r1 != r2) goto L_0x0094
            r8.close()
            return
        L_0x0094:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x00b8
            java.lang.String r2 = r8.getString(r1)     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = r9.get(r2)     // Catch:{ all -> 0x00b6 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x0094
            boolean r3 = r8.isNull(r4)     // Catch:{ all -> 0x00b6 }
            if (r3 == 0) goto L_0x00ae
            r3 = r0
            goto L_0x00b2
        L_0x00ae:
            java.lang.String r3 = r8.getString(r4)     // Catch:{ all -> 0x00b6 }
        L_0x00b2:
            r2.add(r3)     // Catch:{ all -> 0x00b6 }
            goto L_0x0094
        L_0x00b6:
            r9 = move-exception
            goto L_0x00bc
        L_0x00b8:
            r8.close()
            return
        L_0x00bc:
            r8.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buf.b(yr):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ead, java.lang.Object] */
    public ead c() {
        ? obj = new Object();
        obj.a = (udd) this.a;
        obj.b = (udd) this.b;
        obj.c = (udd) this.c;
        obj.d = (udd) this.d;
        obj.e = (du3) this.e;
        obj.f = (du3) this.f;
        obj.g = (du3) this.g;
        obj.h = (du3) this.h;
        obj.i = (qr4) this.i;
        obj.j = (qr4) this.j;
        obj.k = (qr4) this.k;
        obj.l = (qr4) this.l;
        return obj;
    }

    public void e(String str) {
        aec aec = (aec) this.a;
        aec.b();
        rtf rtf = (rtf) this.d;
        yz5 f2 = rtf.f();
        if (str == null) {
            f2.W(1);
        } else {
            f2.f(1, str);
        }
        aec.c();
        try {
            f2.n();
            aec.r();
        } finally {
            aec.l();
            rtf.u(f2);
        }
    }

    public ArrayList f() {
        pec pec;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        pec a2 = pec.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        a2.j(1, (long) 200);
        aec aec = (aec) this.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, HasExtraData.KEY_ID);
            int o3 = gp0.o(o, "state");
            int o4 = gp0.o(o, "worker_class_name");
            int o5 = gp0.o(o, "input_merger_class_name");
            int o6 = gp0.o(o, "input");
            int o7 = gp0.o(o, "output");
            int o8 = gp0.o(o, "initial_delay");
            int o9 = gp0.o(o, "interval_duration");
            int o10 = gp0.o(o, "flex_duration");
            int o11 = gp0.o(o, "run_attempt_count");
            int o12 = gp0.o(o, "backoff_policy");
            int o13 = gp0.o(o, "backoff_delay_duration");
            int o14 = gp0.o(o, "last_enqueue_time");
            int o15 = gp0.o(o, "minimum_retention_duration");
            pec = a2;
            try {
                int o16 = gp0.o(o, "schedule_requested_at");
                int o17 = gp0.o(o, "run_in_foreground");
                int o18 = gp0.o(o, "out_of_quota_policy");
                int o19 = gp0.o(o, "period_count");
                int o20 = gp0.o(o, "generation");
                int o21 = gp0.o(o, "required_network_type");
                int o22 = gp0.o(o, "requires_charging");
                int o23 = gp0.o(o, "requires_device_idle");
                int o24 = gp0.o(o, "requires_battery_not_low");
                int o25 = gp0.o(o, "requires_storage_not_low");
                int o26 = gp0.o(o, "trigger_content_update_delay");
                int o27 = gp0.o(o, "trigger_max_content_delay");
                int o28 = gp0.o(o, "content_uri_triggers");
                int i7 = o15;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(o2) ? null : o.getString(o2);
                    ctf t = wx3.t(o.getInt(o3));
                    String string2 = o.isNull(o4) ? null : o.getString(o4);
                    String string3 = o.isNull(o5) ? null : o.getString(o5);
                    zy3 a3 = zy3.a(o.isNull(o6) ? null : o.getBlob(o6));
                    zy3 a4 = zy3.a(o.isNull(o7) ? null : o.getBlob(o7));
                    long j2 = o.getLong(o8);
                    long j3 = o.getLong(o9);
                    long j4 = o.getLong(o10);
                    int i8 = o.getInt(o11);
                    he0 q = wx3.q(o.getInt(o12));
                    long j5 = o.getLong(o13);
                    long j6 = o.getLong(o14);
                    int i9 = i7;
                    long j7 = o.getLong(i9);
                    int i10 = o2;
                    int i11 = o16;
                    long j8 = o.getLong(i11);
                    o16 = i11;
                    int i12 = o17;
                    if (o.getInt(i12) != 0) {
                        o17 = i12;
                        i2 = o18;
                        z = true;
                    } else {
                        o17 = i12;
                        i2 = o18;
                        z = false;
                    }
                    vga s = wx3.s(o.getInt(i2));
                    o18 = i2;
                    int i13 = o19;
                    int i14 = o.getInt(i13);
                    o19 = i13;
                    int i15 = o20;
                    int i16 = o.getInt(i15);
                    o20 = i15;
                    int i17 = o21;
                    int r = wx3.r(o.getInt(i17));
                    o21 = i17;
                    int i18 = o22;
                    if (o.getInt(i18) != 0) {
                        o22 = i18;
                        i3 = o23;
                        z2 = true;
                    } else {
                        o22 = i18;
                        i3 = o23;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        o23 = i3;
                        i4 = o24;
                        z3 = true;
                    } else {
                        o23 = i3;
                        i4 = o24;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        o24 = i4;
                        i5 = o25;
                        z4 = true;
                    } else {
                        o24 = i4;
                        i5 = o25;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        o25 = i5;
                        i6 = o26;
                        z5 = true;
                    } else {
                        o25 = i5;
                        i6 = o26;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    o26 = i6;
                    int i19 = o27;
                    long j10 = o.getLong(i19);
                    o27 = i19;
                    int i20 = o28;
                    o28 = i20;
                    arrayList.add(new ztf(string, t, string2, string3, a3, a4, j2, j3, j4, new if3(r, z2, z3, z4, z5, j9, j10, wx3.b(o.isNull(i20) ? null : o.getBlob(i20))), i8, q, j5, j6, j7, j8, z, s, i14, i16));
                    o2 = i10;
                    i7 = i9;
                }
                o.close();
                pec.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o.close();
            pec.m();
            throw th;
        }
    }

    public ArrayList g(int i2) {
        pec pec;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        pec a2 = pec.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a2.j(1, (long) i2);
        aec aec = (aec) this.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, HasExtraData.KEY_ID);
            int o3 = gp0.o(o, "state");
            int o4 = gp0.o(o, "worker_class_name");
            int o5 = gp0.o(o, "input_merger_class_name");
            int o6 = gp0.o(o, "input");
            int o7 = gp0.o(o, "output");
            int o8 = gp0.o(o, "initial_delay");
            int o9 = gp0.o(o, "interval_duration");
            int o10 = gp0.o(o, "flex_duration");
            int o11 = gp0.o(o, "run_attempt_count");
            int o12 = gp0.o(o, "backoff_policy");
            int o13 = gp0.o(o, "backoff_delay_duration");
            int o14 = gp0.o(o, "last_enqueue_time");
            int o15 = gp0.o(o, "minimum_retention_duration");
            pec = a2;
            try {
                int o16 = gp0.o(o, "schedule_requested_at");
                int o17 = gp0.o(o, "run_in_foreground");
                int o18 = gp0.o(o, "out_of_quota_policy");
                int o19 = gp0.o(o, "period_count");
                int o20 = gp0.o(o, "generation");
                int o21 = gp0.o(o, "required_network_type");
                int o22 = gp0.o(o, "requires_charging");
                int o23 = gp0.o(o, "requires_device_idle");
                int o24 = gp0.o(o, "requires_battery_not_low");
                int o25 = gp0.o(o, "requires_storage_not_low");
                int o26 = gp0.o(o, "trigger_content_update_delay");
                int o27 = gp0.o(o, "trigger_max_content_delay");
                int o28 = gp0.o(o, "content_uri_triggers");
                int i8 = o15;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(o2) ? null : o.getString(o2);
                    ctf t = wx3.t(o.getInt(o3));
                    String string2 = o.isNull(o4) ? null : o.getString(o4);
                    String string3 = o.isNull(o5) ? null : o.getString(o5);
                    zy3 a3 = zy3.a(o.isNull(o6) ? null : o.getBlob(o6));
                    zy3 a4 = zy3.a(o.isNull(o7) ? null : o.getBlob(o7));
                    long j2 = o.getLong(o8);
                    long j3 = o.getLong(o9);
                    long j4 = o.getLong(o10);
                    int i9 = o.getInt(o11);
                    he0 q = wx3.q(o.getInt(o12));
                    long j5 = o.getLong(o13);
                    long j6 = o.getLong(o14);
                    int i10 = i8;
                    long j7 = o.getLong(i10);
                    int i11 = o2;
                    int i12 = o16;
                    long j8 = o.getLong(i12);
                    o16 = i12;
                    int i13 = o17;
                    if (o.getInt(i13) != 0) {
                        o17 = i13;
                        i3 = o18;
                        z = true;
                    } else {
                        o17 = i13;
                        i3 = o18;
                        z = false;
                    }
                    vga s = wx3.s(o.getInt(i3));
                    o18 = i3;
                    int i14 = o19;
                    int i15 = o.getInt(i14);
                    o19 = i14;
                    int i16 = o20;
                    int i17 = o.getInt(i16);
                    o20 = i16;
                    int i18 = o21;
                    int r = wx3.r(o.getInt(i18));
                    o21 = i18;
                    int i19 = o22;
                    if (o.getInt(i19) != 0) {
                        o22 = i19;
                        i4 = o23;
                        z2 = true;
                    } else {
                        o22 = i19;
                        i4 = o23;
                        z2 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        o23 = i4;
                        i5 = o24;
                        z3 = true;
                    } else {
                        o23 = i4;
                        i5 = o24;
                        z3 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        o24 = i5;
                        i6 = o25;
                        z4 = true;
                    } else {
                        o24 = i5;
                        i6 = o25;
                        z4 = false;
                    }
                    if (o.getInt(i6) != 0) {
                        o25 = i6;
                        i7 = o26;
                        z5 = true;
                    } else {
                        o25 = i6;
                        i7 = o26;
                        z5 = false;
                    }
                    long j9 = o.getLong(i7);
                    o26 = i7;
                    int i20 = o27;
                    long j10 = o.getLong(i20);
                    o27 = i20;
                    int i21 = o28;
                    o28 = i21;
                    arrayList.add(new ztf(string, t, string2, string3, a3, a4, j2, j3, j4, new if3(r, z2, z3, z4, z5, j9, j10, wx3.b(o.isNull(i21) ? null : o.getBlob(i21))), i9, q, j5, j6, j7, j8, z, s, i15, i17));
                    o2 = i11;
                    i8 = i10;
                }
                o.close();
                pec.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o.close();
            pec.m();
            throw th;
        }
    }

    public ArrayList h() {
        pec pec;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        pec a2 = pec.a(0, "SELECT * FROM workspec WHERE state=1");
        aec aec = (aec) this.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, HasExtraData.KEY_ID);
            int o3 = gp0.o(o, "state");
            int o4 = gp0.o(o, "worker_class_name");
            int o5 = gp0.o(o, "input_merger_class_name");
            int o6 = gp0.o(o, "input");
            int o7 = gp0.o(o, "output");
            int o8 = gp0.o(o, "initial_delay");
            int o9 = gp0.o(o, "interval_duration");
            int o10 = gp0.o(o, "flex_duration");
            int o11 = gp0.o(o, "run_attempt_count");
            int o12 = gp0.o(o, "backoff_policy");
            int o13 = gp0.o(o, "backoff_delay_duration");
            int o14 = gp0.o(o, "last_enqueue_time");
            int o15 = gp0.o(o, "minimum_retention_duration");
            pec = a2;
            try {
                int o16 = gp0.o(o, "schedule_requested_at");
                int o17 = gp0.o(o, "run_in_foreground");
                int o18 = gp0.o(o, "out_of_quota_policy");
                int o19 = gp0.o(o, "period_count");
                int o20 = gp0.o(o, "generation");
                int o21 = gp0.o(o, "required_network_type");
                int o22 = gp0.o(o, "requires_charging");
                int o23 = gp0.o(o, "requires_device_idle");
                int o24 = gp0.o(o, "requires_battery_not_low");
                int o25 = gp0.o(o, "requires_storage_not_low");
                int o26 = gp0.o(o, "trigger_content_update_delay");
                int o27 = gp0.o(o, "trigger_max_content_delay");
                int o28 = gp0.o(o, "content_uri_triggers");
                int i7 = o15;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(o2) ? null : o.getString(o2);
                    ctf t = wx3.t(o.getInt(o3));
                    String string2 = o.isNull(o4) ? null : o.getString(o4);
                    String string3 = o.isNull(o5) ? null : o.getString(o5);
                    zy3 a3 = zy3.a(o.isNull(o6) ? null : o.getBlob(o6));
                    zy3 a4 = zy3.a(o.isNull(o7) ? null : o.getBlob(o7));
                    long j2 = o.getLong(o8);
                    long j3 = o.getLong(o9);
                    long j4 = o.getLong(o10);
                    int i8 = o.getInt(o11);
                    he0 q = wx3.q(o.getInt(o12));
                    long j5 = o.getLong(o13);
                    long j6 = o.getLong(o14);
                    int i9 = i7;
                    long j7 = o.getLong(i9);
                    int i10 = o2;
                    int i11 = o16;
                    long j8 = o.getLong(i11);
                    o16 = i11;
                    int i12 = o17;
                    if (o.getInt(i12) != 0) {
                        o17 = i12;
                        i2 = o18;
                        z = true;
                    } else {
                        o17 = i12;
                        i2 = o18;
                        z = false;
                    }
                    vga s = wx3.s(o.getInt(i2));
                    o18 = i2;
                    int i13 = o19;
                    int i14 = o.getInt(i13);
                    o19 = i13;
                    int i15 = o20;
                    int i16 = o.getInt(i15);
                    o20 = i15;
                    int i17 = o21;
                    int r = wx3.r(o.getInt(i17));
                    o21 = i17;
                    int i18 = o22;
                    if (o.getInt(i18) != 0) {
                        o22 = i18;
                        i3 = o23;
                        z2 = true;
                    } else {
                        o22 = i18;
                        i3 = o23;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        o23 = i3;
                        i4 = o24;
                        z3 = true;
                    } else {
                        o23 = i3;
                        i4 = o24;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        o24 = i4;
                        i5 = o25;
                        z4 = true;
                    } else {
                        o24 = i4;
                        i5 = o25;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        o25 = i5;
                        i6 = o26;
                        z5 = true;
                    } else {
                        o25 = i5;
                        i6 = o26;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    o26 = i6;
                    int i19 = o27;
                    long j10 = o.getLong(i19);
                    o27 = i19;
                    int i20 = o28;
                    o28 = i20;
                    arrayList.add(new ztf(string, t, string2, string3, a3, a4, j2, j3, j4, new if3(r, z2, z3, z4, z5, j9, j10, wx3.b(o.isNull(i20) ? null : o.getBlob(i20))), i8, q, j5, j6, j7, j8, z, s, i14, i16));
                    o2 = i10;
                    i7 = i9;
                }
                o.close();
                pec.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o.close();
            pec.m();
            throw th;
        }
    }

    public ArrayList i() {
        pec pec;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        pec a2 = pec.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        aec aec = (aec) this.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, HasExtraData.KEY_ID);
            int o3 = gp0.o(o, "state");
            int o4 = gp0.o(o, "worker_class_name");
            int o5 = gp0.o(o, "input_merger_class_name");
            int o6 = gp0.o(o, "input");
            int o7 = gp0.o(o, "output");
            int o8 = gp0.o(o, "initial_delay");
            int o9 = gp0.o(o, "interval_duration");
            int o10 = gp0.o(o, "flex_duration");
            int o11 = gp0.o(o, "run_attempt_count");
            int o12 = gp0.o(o, "backoff_policy");
            int o13 = gp0.o(o, "backoff_delay_duration");
            int o14 = gp0.o(o, "last_enqueue_time");
            int o15 = gp0.o(o, "minimum_retention_duration");
            pec = a2;
            try {
                int o16 = gp0.o(o, "schedule_requested_at");
                int o17 = gp0.o(o, "run_in_foreground");
                int o18 = gp0.o(o, "out_of_quota_policy");
                int o19 = gp0.o(o, "period_count");
                int o20 = gp0.o(o, "generation");
                int o21 = gp0.o(o, "required_network_type");
                int o22 = gp0.o(o, "requires_charging");
                int o23 = gp0.o(o, "requires_device_idle");
                int o24 = gp0.o(o, "requires_battery_not_low");
                int o25 = gp0.o(o, "requires_storage_not_low");
                int o26 = gp0.o(o, "trigger_content_update_delay");
                int o27 = gp0.o(o, "trigger_max_content_delay");
                int o28 = gp0.o(o, "content_uri_triggers");
                int i7 = o15;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(o2) ? null : o.getString(o2);
                    ctf t = wx3.t(o.getInt(o3));
                    String string2 = o.isNull(o4) ? null : o.getString(o4);
                    String string3 = o.isNull(o5) ? null : o.getString(o5);
                    zy3 a3 = zy3.a(o.isNull(o6) ? null : o.getBlob(o6));
                    zy3 a4 = zy3.a(o.isNull(o7) ? null : o.getBlob(o7));
                    long j2 = o.getLong(o8);
                    long j3 = o.getLong(o9);
                    long j4 = o.getLong(o10);
                    int i8 = o.getInt(o11);
                    he0 q = wx3.q(o.getInt(o12));
                    long j5 = o.getLong(o13);
                    long j6 = o.getLong(o14);
                    int i9 = i7;
                    long j7 = o.getLong(i9);
                    int i10 = o2;
                    int i11 = o16;
                    long j8 = o.getLong(i11);
                    o16 = i11;
                    int i12 = o17;
                    if (o.getInt(i12) != 0) {
                        o17 = i12;
                        i2 = o18;
                        z = true;
                    } else {
                        o17 = i12;
                        i2 = o18;
                        z = false;
                    }
                    vga s = wx3.s(o.getInt(i2));
                    o18 = i2;
                    int i13 = o19;
                    int i14 = o.getInt(i13);
                    o19 = i13;
                    int i15 = o20;
                    int i16 = o.getInt(i15);
                    o20 = i15;
                    int i17 = o21;
                    int r = wx3.r(o.getInt(i17));
                    o21 = i17;
                    int i18 = o22;
                    if (o.getInt(i18) != 0) {
                        o22 = i18;
                        i3 = o23;
                        z2 = true;
                    } else {
                        o22 = i18;
                        i3 = o23;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        o23 = i3;
                        i4 = o24;
                        z3 = true;
                    } else {
                        o23 = i3;
                        i4 = o24;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        o24 = i4;
                        i5 = o25;
                        z4 = true;
                    } else {
                        o24 = i4;
                        i5 = o25;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        o25 = i5;
                        i6 = o26;
                        z5 = true;
                    } else {
                        o25 = i5;
                        i6 = o26;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    o26 = i6;
                    int i19 = o27;
                    long j10 = o.getLong(i19);
                    o27 = i19;
                    int i20 = o28;
                    o28 = i20;
                    arrayList.add(new ztf(string, t, string2, string3, a3, a4, j2, j3, j4, new if3(r, z2, z3, z4, z5, j9, j10, wx3.b(o.isNull(i20) ? null : o.getBlob(i20))), i8, q, j5, j6, j7, j8, z, s, i14, i16));
                    o2 = i10;
                    i7 = i9;
                }
                o.close();
                pec.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o.close();
            pec.m();
            throw th;
        }
    }

    public ctf j(String str) {
        pec a2 = pec.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        aec aec = (aec) this.a;
        aec.b();
        ctf ctf = null;
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            if (o.moveToFirst()) {
                Integer valueOf = o.isNull(0) ? null : Integer.valueOf(o.getInt(0));
                if (valueOf != null) {
                    ctf = wx3.t(valueOf.intValue());
                }
            }
            return ctf;
        } finally {
            o.close();
            a2.m();
        }
    }

    public ArrayList k(String str) {
        pec a2 = pec.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        aec aec = (aec) this.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : o.getString(0));
            }
            return arrayList;
        } finally {
            o.close();
            a2.m();
        }
    }

    public ztf l(String str) {
        pec pec;
        ztf ztf;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        String str2 = str;
        pec a2 = pec.a(1, "SELECT * FROM workspec WHERE id=?");
        if (str2 == null) {
            a2.W(1);
        } else {
            a2.f(1, str2);
        }
        aec aec = (aec) this.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, HasExtraData.KEY_ID);
            int o3 = gp0.o(o, "state");
            int o4 = gp0.o(o, "worker_class_name");
            int o5 = gp0.o(o, "input_merger_class_name");
            int o6 = gp0.o(o, "input");
            int o7 = gp0.o(o, "output");
            int o8 = gp0.o(o, "initial_delay");
            int o9 = gp0.o(o, "interval_duration");
            int o10 = gp0.o(o, "flex_duration");
            int o11 = gp0.o(o, "run_attempt_count");
            int o12 = gp0.o(o, "backoff_policy");
            int o13 = gp0.o(o, "backoff_delay_duration");
            int o14 = gp0.o(o, "last_enqueue_time");
            int o15 = gp0.o(o, "minimum_retention_duration");
            pec = a2;
            try {
                int o16 = gp0.o(o, "schedule_requested_at");
                int o17 = gp0.o(o, "run_in_foreground");
                int o18 = gp0.o(o, "out_of_quota_policy");
                int o19 = gp0.o(o, "period_count");
                int o20 = gp0.o(o, "generation");
                int o21 = gp0.o(o, "required_network_type");
                int o22 = gp0.o(o, "requires_charging");
                int o23 = gp0.o(o, "requires_device_idle");
                int o24 = gp0.o(o, "requires_battery_not_low");
                int o25 = gp0.o(o, "requires_storage_not_low");
                int o26 = gp0.o(o, "trigger_content_update_delay");
                int o27 = gp0.o(o, "trigger_max_content_delay");
                int o28 = gp0.o(o, "content_uri_triggers");
                if (o.moveToFirst()) {
                    String string = o.isNull(o2) ? null : o.getString(o2);
                    ctf t = wx3.t(o.getInt(o3));
                    String string2 = o.isNull(o4) ? null : o.getString(o4);
                    String string3 = o.isNull(o5) ? null : o.getString(o5);
                    zy3 a3 = zy3.a(o.isNull(o6) ? null : o.getBlob(o6));
                    zy3 a4 = zy3.a(o.isNull(o7) ? null : o.getBlob(o7));
                    long j2 = o.getLong(o8);
                    long j3 = o.getLong(o9);
                    long j4 = o.getLong(o10);
                    int i7 = o.getInt(o11);
                    he0 q = wx3.q(o.getInt(o12));
                    long j5 = o.getLong(o13);
                    long j6 = o.getLong(o14);
                    long j7 = o.getLong(o15);
                    long j8 = o.getLong(o16);
                    if (o.getInt(o17) != 0) {
                        i2 = o18;
                        z = true;
                    } else {
                        z = false;
                        i2 = o18;
                    }
                    vga s = wx3.s(o.getInt(i2));
                    int i8 = o.getInt(o19);
                    int i9 = o.getInt(o20);
                    int r = wx3.r(o.getInt(o21));
                    if (o.getInt(o22) != 0) {
                        i3 = o23;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = o23;
                    }
                    if (o.getInt(i3) != 0) {
                        i4 = o24;
                        z3 = true;
                    } else {
                        z3 = false;
                        i4 = o24;
                    }
                    if (o.getInt(i4) != 0) {
                        i5 = o25;
                        z4 = true;
                    } else {
                        z4 = false;
                        i5 = o25;
                    }
                    if (o.getInt(i5) != 0) {
                        i6 = o26;
                        z5 = true;
                    } else {
                        z5 = false;
                        i6 = o26;
                    }
                    ztf = new ztf(string, t, string2, string3, a3, a4, j2, j3, j4, new if3(r, z2, z3, z4, z5, o.getLong(i6), o.getLong(o27), wx3.b(o.isNull(o28) ? null : o.getBlob(o28))), i7, q, j5, j6, j7, j8, z, s, i8, i9);
                } else {
                    ztf = null;
                }
                o.close();
                pec.m();
                return ztf;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o.close();
            pec.m();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, xtf] */
    public ArrayList m(String str) {
        pec a2 = pec.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a2.W(1);
        } else {
            a2.f(1, str);
        }
        aec aec = (aec) this.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                String string = o.isNull(0) ? null : o.getString(0);
                ctf t = wx3.t(o.getInt(1));
                ? obj = new Object();
                obj.a = string;
                obj.b = t;
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            o.close();
            a2.m();
        }
    }

    public void n(long j2, String str) {
        aec aec = (aec) this.a;
        aec.b();
        rtf rtf = (rtf) this.k;
        yz5 f2 = rtf.f();
        f2.j(1, j2);
        if (str == null) {
            f2.W(2);
        } else {
            f2.f(2, str);
        }
        aec.c();
        try {
            f2.n();
            aec.r();
        } finally {
            aec.l();
            rtf.u(f2);
        }
    }

    public void o(long j2, String str) {
        aec aec = (aec) this.a;
        aec.b();
        rtf rtf = (rtf) this.h;
        yz5 f2 = rtf.f();
        f2.j(1, j2);
        if (str == null) {
            f2.W(2);
        } else {
            f2.f(2, str);
        }
        aec.c();
        try {
            f2.n();
            aec.r();
        } finally {
            aec.l();
            rtf.u(f2);
        }
    }

    public void p(String str, zy3 zy3) {
        aec aec = (aec) this.a;
        aec.b();
        rtf rtf = (rtf) this.g;
        yz5 f2 = rtf.f();
        byte[] f3 = zy3.f(zy3);
        if (f3 == null) {
            f2.W(1);
        } else {
            f2.k(1, f3);
        }
        if (str == null) {
            f2.W(2);
        } else {
            f2.f(2, str);
        }
        aec.c();
        try {
            f2.n();
            aec.r();
        } finally {
            aec.l();
            rtf.u(f2);
        }
    }

    public void q(ctf ctf, String str) {
        aec aec = (aec) this.a;
        aec.b();
        rtf rtf = (rtf) this.e;
        yz5 f2 = rtf.f();
        f2.j(1, (long) wx3.G(ctf));
        if (str == null) {
            f2.W(2);
        } else {
            f2.f(2, str);
        }
        aec.c();
        try {
            f2.n();
            aec.r();
        } finally {
            aec.l();
            rtf.u(f2);
        }
    }

    public buf() {
        this.a = new kgc();
        this.b = new kgc();
        this.c = new kgc();
        this.d = new kgc();
        this.e = new a0(0.0f);
        this.f = new a0(0.0f);
        this.g = new a0(0.0f);
        this.h = new a0(0.0f);
        this.i = new qr4(0);
        this.j = new qr4(0);
        this.k = new qr4(0);
        this.l = new qr4(0);
    }
}
