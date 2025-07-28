package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: bz4  reason: default package */
public final class bz4 implements Runnable {
    public static final String c = a24.e0("EnqueueRunnable");
    public final wsf a;
    public final otf b;

    public bz4(wsf wsf, otf otf) {
        this.a = wsf;
        this.b = otf;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x016b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.wsf r25) {
        /*
            r0 = r25
            r25.getClass()
            java.util.HashSet r1 = defpackage.wsf.O(r25)
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            long r3 = java.lang.System.currentTimeMillis()
            itf r5 = r0.s
            androidx.work.impl.WorkDatabase r6 = r5.c
            if (r1 == 0) goto L_0x0021
            int r8 = r1.length
            if (r8 <= 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = r2
        L_0x0022:
            ctf r9 = defpackage.ctf.c
            ctf r10 = defpackage.ctf.Y
            ctf r11 = defpackage.ctf.o
            if (r8 == 0) goto L_0x0072
            int r12 = r1.length
            r13 = r2
            r15 = r13
            r16 = r15
            r14 = 1
        L_0x0030:
            if (r13 >= r12) goto L_0x0076
            r2 = r1[r13]
            buf r7 = r6.y()
            ztf r7 = r7.l(r2)
            if (r7 != 0) goto L_0x005e
            a24 r1 = defpackage.a24.B()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Prerequisite "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " doesn't exist; not enqueuing"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = c
            r1.x(r3, r2)
        L_0x005a:
            r1 = 1
            r2 = 0
            goto L_0x02b6
        L_0x005e:
            ctf r2 = r7.b
            if (r2 != r9) goto L_0x0064
            r7 = 1
            goto L_0x0065
        L_0x0064:
            r7 = 0
        L_0x0065:
            r14 = r14 & r7
            if (r2 != r11) goto L_0x006b
            r16 = 1
            goto L_0x006e
        L_0x006b:
            if (r2 != r10) goto L_0x006e
            r15 = 1
        L_0x006e:
            int r13 = r13 + 1
            r2 = 0
            goto L_0x0030
        L_0x0072:
            r14 = 1
            r15 = 0
            r16 = 0
        L_0x0076:
            java.lang.String r2 = r0.t
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            r12 = 1
            r7 = r7 ^ r12
            ctf r12 = defpackage.ctf.a
            if (r7 == 0) goto L_0x01c0
            if (r8 != 0) goto L_0x01c0
            buf r13 = r6.y()
            java.util.ArrayList r13 = r13.m(r2)
            boolean r17 = r13.isEmpty()
            if (r17 != 0) goto L_0x01c0
            r17 = r8
            a35 r8 = defpackage.a35.c
            r18 = r14
            a35 r14 = defpackage.a35.o
            r19 = r15
            a35 r15 = r0.u
            if (r15 == r8) goto L_0x00f3
            if (r15 != r14) goto L_0x00a3
            goto L_0x00f3
        L_0x00a3:
            a35 r8 = defpackage.a35.b
            if (r15 != r8) goto L_0x00c0
            java.util.Iterator r8 = r13.iterator()
        L_0x00ab:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c0
            java.lang.Object r9 = r8.next()
            xtf r9 = (defpackage.xtf) r9
            ctf r9 = r9.b
            if (r9 == r12) goto L_0x005a
            ctf r14 = defpackage.ctf.b
            if (r9 != r14) goto L_0x00ab
            goto L_0x005a
        L_0x00c0:
            tv1 r8 = new tv1
            r9 = 0
            r8.<init>(r5, r2, r9)
            r8.run()
            buf r5 = r6.y()
            java.util.Iterator r8 = r13.iterator()
        L_0x00d1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e3
            java.lang.Object r9 = r8.next()
            xtf r9 = (defpackage.xtf) r9
            java.lang.String r9 = r9.a
            r5.e(r9)
            goto L_0x00d1
        L_0x00e3:
            r23 = r3
            r21 = r7
            r22 = r12
            r8 = r17
            r14 = r18
            r15 = r19
            r3 = 1
            r12 = 0
            goto L_0x01d4
        L_0x00f3:
            qe4 r5 = r6.t()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0100:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x017b
            java.lang.Object r17 = r13.next()
            r20 = r13
            r13 = r17
            xtf r13 = (defpackage.xtf) r13
            r21 = r7
            java.lang.String r7 = r13.a
            r5.getClass()
            r22 = r12
            java.lang.String r12 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r23 = r3
            r3 = 1
            pec r4 = defpackage.pec.a(r3, r12)
            if (r7 != 0) goto L_0x0128
            r4.W(r3)
            goto L_0x012b
        L_0x0128:
            r4.f(r3, r7)
        L_0x012b:
            java.lang.Object r3 = r5.b
            aec r3 = (defpackage.aec) r3
            r3.b()
            r7 = 0
            android.database.Cursor r3 = r3.o(r4, r7)
            boolean r7 = r3.moveToFirst()     // Catch:{ all -> 0x0146 }
            if (r7 == 0) goto L_0x0148
            r12 = 0
            int r7 = r3.getInt(r12)     // Catch:{ all -> 0x0146 }
            if (r7 == 0) goto L_0x0149
            r7 = 1
            goto L_0x014a
        L_0x0146:
            r0 = move-exception
            goto L_0x0174
        L_0x0148:
            r12 = 0
        L_0x0149:
            r7 = r12
        L_0x014a:
            r3.close()
            r4.m()
            if (r7 != 0) goto L_0x016b
            ctf r3 = r13.b
            if (r3 != r9) goto L_0x0158
            r4 = 1
            goto L_0x0159
        L_0x0158:
            r4 = r12
        L_0x0159:
            r4 = r18 & r4
            if (r3 != r11) goto L_0x0160
            r16 = 1
            goto L_0x0164
        L_0x0160:
            if (r3 != r10) goto L_0x0164
            r19 = 1
        L_0x0164:
            java.lang.String r3 = r13.a
            r8.add(r3)
            r18 = r4
        L_0x016b:
            r13 = r20
            r7 = r21
            r12 = r22
            r3 = r23
            goto L_0x0100
        L_0x0174:
            r3.close()
            r4.m()
            throw r0
        L_0x017b:
            r23 = r3
            r21 = r7
            r22 = r12
            r12 = 0
            if (r15 != r14) goto L_0x01ae
            if (r19 != 0) goto L_0x0188
            if (r16 == 0) goto L_0x01ae
        L_0x0188:
            buf r3 = r6.y()
            java.util.ArrayList r4 = r3.m(r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x0194:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a6
            java.lang.Object r5 = r4.next()
            xtf r5 = (defpackage.xtf) r5
            java.lang.String r5 = r5.a
            r3.e(r5)
            goto L_0x0194
        L_0x01a6:
            java.util.List r8 = java.util.Collections.emptyList()
            r15 = r12
            r16 = r15
            goto L_0x01b0
        L_0x01ae:
            r15 = r19
        L_0x01b0:
            java.lang.Object[] r1 = r8.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x01bb
            r8 = 1
            goto L_0x01bc
        L_0x01bb:
            r8 = r12
        L_0x01bc:
            r3 = r12
            r14 = r18
            goto L_0x01d4
        L_0x01c0:
            r23 = r3
            r21 = r7
            r17 = r8
            r22 = r12
            r18 = r14
            r19 = r15
            r12 = 0
            r3 = r12
            r8 = r17
            r14 = r18
            r15 = r19
        L_0x01d4:
            java.util.List r4 = r0.v
            java.util.Iterator r4 = r4.iterator()
        L_0x01da:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b1
            java.lang.Object r5 = r4.next()
            androidx.work.WorkRequest r5 = (androidx.work.WorkRequest) r5
            ztf r7 = r5.getWorkSpec()
            if (r8 == 0) goto L_0x01ff
            if (r14 != 0) goto L_0x01ff
            if (r16 == 0) goto L_0x01f5
            r7.b = r11
        L_0x01f2:
            r12 = r23
            goto L_0x0203
        L_0x01f5:
            if (r15 == 0) goto L_0x01fa
            r7.b = r10
            goto L_0x01f2
        L_0x01fa:
            ctf r9 = defpackage.ctf.X
            r7.b = r9
            goto L_0x01f2
        L_0x01ff:
            r12 = r23
            r7.n = r12
        L_0x0203:
            ctf r9 = r7.b
            r17 = r3
            r3 = r22
            if (r9 != r3) goto L_0x020d
            r17 = 1
        L_0x020d:
            buf r9 = r6.y()
            r22 = r3
            java.lang.Object r3 = r9.a
            aec r3 = (defpackage.aec) r3
            r3.b()
            r3.c()
            java.lang.Object r9 = r9.b     // Catch:{ all -> 0x02ac }
            qtf r9 = (defpackage.qtf) r9     // Catch:{ all -> 0x02ac }
            r9.C(r7)     // Catch:{ all -> 0x02ac }
            r3.r()     // Catch:{ all -> 0x02ac }
            r3.l()
            if (r8 == 0) goto L_0x0266
            int r3 = r1.length
            r9 = 0
        L_0x022e:
            if (r9 >= r3) goto L_0x0266
            r7 = r1[r9]
            r18 = r1
            ne4 r1 = new ne4
            r19 = r3
            java.lang.String r3 = r5.getStringId()
            r1.<init>(r3, r7)
            qe4 r3 = r6.t()
            java.lang.Object r7 = r3.b
            aec r7 = (defpackage.aec) r7
            r7.b()
            r7.c()
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x0261 }
            sh r3 = (sh) r3     // Catch:{ all -> 0x0261 }
            r3.C(r1)     // Catch:{ all -> 0x0261 }
            r7.r()     // Catch:{ all -> 0x0261 }
            r7.l()
            int r9 = r9 + 1
            r1 = r18
            r3 = r19
            goto L_0x022e
        L_0x0261:
            r0 = move-exception
            r7.l()
            throw r0
        L_0x0266:
            r18 = r1
            duf r1 = r6.z()
            java.lang.String r3 = r5.getStringId()
            java.util.Set r7 = r5.getTags()
            r1.s(r3, r7)
            if (r21 == 0) goto L_0x02a3
            otf r1 = r6.w()
            ntf r3 = new ntf
            java.lang.String r5 = r5.getStringId()
            r3.<init>(r2, r5)
            java.lang.Object r5 = r1.a
            aec r5 = (defpackage.aec) r5
            r5.b()
            r5.c()
            java.lang.Object r1 = r1.b     // Catch:{ all -> 0x029e }
            sh r1 = (sh) r1     // Catch:{ all -> 0x029e }
            r1.C(r3)     // Catch:{ all -> 0x029e }
            r5.r()     // Catch:{ all -> 0x029e }
            r5.l()
            goto L_0x02a3
        L_0x029e:
            r0 = move-exception
            r5.l()
            throw r0
        L_0x02a3:
            r23 = r12
            r3 = r17
            r1 = r18
            r12 = 0
            goto L_0x01da
        L_0x02ac:
            r0 = move-exception
            r3.l()
            throw r0
        L_0x02b1:
            r17 = r3
            r2 = r17
            r1 = 1
        L_0x02b6:
            r0.y = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz4.a(wsf):boolean");
    }

    public final void run() {
        boolean z;
        WorkDatabase workDatabase;
        otf otf = this.b;
        wsf wsf = this.a;
        try {
            wsf.getClass();
            itf itf = wsf.s;
            HashSet hashSet = new HashSet();
            hashSet.addAll(wsf.w);
            HashSet O = wsf.O(wsf);
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (O.contains((String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    hashSet.removeAll(wsf.w);
                    z = false;
                    break;
                }
            }
            if (!z) {
                workDatabase = itf.c;
                workDatabase.c();
                boolean a2 = a(wsf);
                workDatabase.r();
                workDatabase.l();
                if (a2) {
                    iia.a(itf.a, RescheduleReceiver.class, true);
                    dnc.a(itf.b, itf.c, itf.e);
                }
                otf.L(aga.Q);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + wsf + ")");
        } catch (Throwable th) {
            otf.L(new xfa(th));
        }
    }
}
