package defpackage;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.List;

/* renamed from: sh5  reason: default package */
public final class sh5 implements xrd {
    public final d4b a;
    public final boolean b;
    public final s16 c;
    public final k40 d;
    public final k40 e;
    public final re4 f;

    /* JADX WARNING: type inference failed for: r2v4, types: [re4, java.lang.Object] */
    public sh5(w41 w41, d4b d4b, fje fje, boolean z, mw0 mw0, bx0 bx0, xwb xwb) {
        boolean z2 = z;
        this.a = d4b;
        this.b = z2;
        this.c = mw0;
        this.d = new k40(fje, w41, xwb, "incomingP2PFirstDataStat", "direct_incoming");
        this.e = new k40(fje, w41, xwb, "outgoingP2PFirstDataStat", "direct_outgoing");
        ? obj = new Object();
        obj.a = z2;
        obj.c = fje;
        obj.d = bx0;
        obj.e = w41;
        obj.f = xwb;
        obj.g = "";
        this.f = obj;
    }

    public static boolean b(b0d b0d) {
        List<ynd> list = (List) b0d.b;
        if (!list.isEmpty()) {
            for (ynd ynd : list) {
                BigInteger bigInteger = ynd.j;
                if (bigInteger != null && bigInteger.compareTo(BigInteger.ZERO) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.zwb r9) {
        /*
            r8 = this;
            re4 r0 = r8.f
            boolean r1 = r0.b
            if (r1 != 0) goto L_0x00ed
            k40 r1 = r8.d
            boolean r2 = r1.b
            if (r2 != 0) goto L_0x00ed
            k40 r2 = r8.e
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x0014
            goto L_0x00ed
        L_0x0014:
            s16 r3 = r8.c
            java.lang.Object r4 = r3.invoke()
            ane r5 = defpackage.ane.c
            java.util.List r6 = r9.c
            r7 = 1
            if (r4 != r5) goto L_0x009b
            iw1 r8 = r9.c()
            if (r8 != 0) goto L_0x0029
            goto L_0x00ed
        L_0x0029:
            java.util.ArrayList r8 = gwf.P(r6, r8)
            b0d r8 = gwf.O(r8)
            boolean r8 = b(r8)
            if (r8 == 0) goto L_0x00ed
            boolean r8 = r0.b
            if (r8 == 0) goto L_0x003d
            goto L_0x00ed
        L_0x003d:
            java.lang.Object r8 = r0.d
            s16 r8 = (s16) r8
            java.lang.Object r8 = r8.invoke()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L_0x0051
            r0.b = r7
            goto L_0x00ed
        L_0x0051:
            java.lang.Object r8 = r0.h
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 != 0) goto L_0x0064
            java.lang.Object r8 = r0.f
            xwb r8 = (defpackage.xwb) r8
            java.lang.String r9 = "ServerTopologyFirstDataStat"
            java.lang.String r0 = "Data is received but accept event wasn't triggered"
            r8.log(r9, r0)
            goto L_0x00ed
        L_0x0064:
            java.lang.Object r9 = r0.c
            eje r9 = (defpackage.eje) r9
            fje r9 = (defpackage.fje) r9
            r9.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8.longValue()
            long r1 = r1 - r8
            ru.ok.android.externcalls.analytics.events.EventItemValue r8 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((long) r1)
            ru.ok.android.externcalls.analytics.events.EventItemsMap r9 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            java.lang.Object r1 = r0.g
            java.lang.String r1 = (java.lang.String) r1
            ru.ok.android.externcalls.analytics.events.EventItemValue r1 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((java.lang.String) r1)
            java.lang.String r2 = "call_type"
            java.util.Map r1 = java.util.Collections.singletonMap(r2, r1)
            r9.<init>(r1)
            java.lang.Object r1 = r0.e
            w41 r1 = (defpackage.w41) r1
            x41 r1 = (defpackage.x41) r1
            java.lang.String r2 = "first_media_received"
            r1.c(r2, r8, r9)
            r0.b = r7
            goto L_0x00ed
        L_0x009b:
            iw1 r9 = r9.c()
            if (r9 != 0) goto L_0x00a2
            goto L_0x00ed
        L_0x00a2:
            java.util.ArrayList r9 = gwf.P(r6, r9)
            b0d r9 = gwf.O(r9)
            boolean r0 = b(r9)
            java.lang.Object r9 = r9.c
            java.util.List r9 = (java.util.List) r9
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x00b9
            goto L_0x00d6
        L_0x00b9:
            java.util.Iterator r9 = r9.iterator()
        L_0x00bd:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x00d6
            java.lang.Object r4 = r9.next()
            cod r4 = (defpackage.cod) r4
            java.math.BigInteger r4 = r4.j
            if (r4 == 0) goto L_0x00bd
            java.math.BigInteger r6 = java.math.BigInteger.ZERO
            int r4 = r4.compareTo(r6)
            if (r4 <= 0) goto L_0x00bd
            goto L_0x00d7
        L_0x00d6:
            r7 = 0
        L_0x00d7:
            if (r0 != 0) goto L_0x00db
            if (r7 == 0) goto L_0x00ed
        L_0x00db:
            java.lang.Object r9 = r3.invoke()
            if (r9 != r5) goto L_0x00e2
            goto L_0x00ed
        L_0x00e2:
            boolean r8 = r8.b
            if (r8 == 0) goto L_0x00ea
            r2.f()
            goto L_0x00ed
        L_0x00ea:
            r1.f()
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh5.a(zwb):void");
    }

    public final void c() {
        this.e.e();
        re4 re4 = this.f;
        if (!re4.b && re4.a) {
            ((fje) ((eje) re4.c)).getClass();
            re4.h = Long.valueOf(SystemClock.elapsedRealtime());
            re4.g = "server_change_topology";
        }
    }

    public final void d() {
        re4 re4 = this.f;
        if (!re4.b) {
            ((fje) ((eje) re4.c)).getClass();
            re4.h = Long.valueOf(SystemClock.elapsedRealtime());
            re4.g = "server_join_server";
        }
    }
}
