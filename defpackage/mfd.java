package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mfd  reason: default package */
public final class mfd {
    public final axb a;
    public final xwb b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Handler d = new Handler(Looper.getMainLooper());
    public final AtomicLong e = new AtomicLong(1);
    public final Object f = new Object();
    public final eef g;
    public final ArrayList h = new ArrayList();
    public final LongSparseArray i = new LongSparseArray();
    public final ArrayList j = new ArrayList();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet l = new CopyOnWriteArraySet();
    public final int m;
    public final int n;
    public final ct3 o;
    public boolean p = true;
    public boolean q;
    public boolean r;
    public volatile long s;
    public volatile long t;
    public final boolean u;
    public final boolean v;

    public mfd(eef eef, dt3 dt3, xwb xwb, axb axb, boolean z, boolean z2) {
        this.g = eef;
        this.o = dt3;
        this.b = xwb;
        this.a = axb;
        this.n = 5;
        this.m = 30000;
        this.u = z;
        this.v = z2;
        eef.m = new lv1(4, (Object) this);
    }

    public final zx3 a(pfd pfd, long j2) {
        try {
            return new zx3(pfd.a().put("sequence", j2).toString(), j2);
        } catch (JSONException e2) {
            this.b.reportException("OKSignaling", "signaling.create.command", e2);
            return null;
        }
    }

    public final l75 b(long j2) {
        l75 l75;
        synchronized (this.f) {
            try {
                int indexOfKey = this.i.indexOfKey(j2);
                if (indexOfKey >= 0) {
                    l75 = (l75) this.i.valueAt(indexOfKey);
                    this.i.removeAt(indexOfKey);
                } else {
                    l75 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l75;
    }

    public final void c(pfd pfd, lfd lfd, lfd lfd2) {
        synchronized (this.f) {
            try {
                xwb xwb = this.b;
                xwb.log("OKSignaling", "<!> postpone send " + pfd);
                if (!this.v || !e(pfd, lfd, lfd2)) {
                    zx3 a2 = a(pfd, this.e.getAndIncrement());
                    if (a2 != null) {
                        this.h.add(new l75(this, pfd, a2, lfd, lfd2));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.pfd r10, boolean r11, defpackage.lfd r12, defpackage.lfd r13) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f
            monitor-enter(r0)
            boolean r1 = r9.u     // Catch:{ all -> 0x000f }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0011
            boolean r4 = r9.q     // Catch:{ all -> 0x000f }
            if (r4 == 0) goto L_0x0011
            r4 = r3
            goto L_0x0012
        L_0x000f:
            r9 = move-exception
            goto L_0x004d
        L_0x0011:
            r4 = r2
        L_0x0012:
            if (r1 == 0) goto L_0x0019
            boolean r1 = r9.r     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x0019
            r2 = r3
        L_0x0019:
            if (r4 != 0) goto L_0x0024
            if (r2 != 0) goto L_0x0024
            if (r11 == 0) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            r9.c(r10, r12, r13)     // Catch:{ all -> 0x000f }
            goto L_0x004b
        L_0x0024:
            java.util.concurrent.atomic.AtomicLong r11 = r9.e     // Catch:{ all -> 0x000f }
            long r1 = r11.getAndIncrement()     // Catch:{ all -> 0x000f }
            zx3 r11 = r9.a(r10, r1)     // Catch:{ all -> 0x000f }
            if (r11 != 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return
        L_0x0032:
            l75 r1 = new l75     // Catch:{ all -> 0x000f }
            r3 = r1
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x000f }
            android.util.LongSparseArray r10 = r9.i     // Catch:{ all -> 0x000f }
            long r12 = r11.b     // Catch:{ all -> 0x000f }
            r10.put(r12, r1)     // Catch:{ all -> 0x000f }
            eef r9 = r9.g     // Catch:{ all -> 0x000f }
            java.lang.String r10 = r11.a     // Catch:{ all -> 0x000f }
            r9.f(r10)     // Catch:{ all -> 0x000f }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfd.d(pfd, boolean, lfd, lfd):void");
    }

    public final boolean e(pfd pfd, lfd lfd, lfd lfd2) {
        String str;
        pfd pfd2 = pfd;
        l75 l75 = null;
        lm8 lm8 = pfd2 instanceof rfd ? new lm8((rfd) pfd2, 1) : pfd2 instanceof qfd ? new lm8((qfd) pfd2, 0) : null;
        if (lm8 == null) {
            return false;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (size > 0) {
            if (size > 0) {
                int i2 = size - 1;
                vfd D = lm8.D(((l75) arrayList.get(i2)).a);
                if (!D.equals(sfd.a)) {
                    if (D instanceof ufd) {
                        l75 l752 = (l75) arrayList.get(i2);
                        long longValue = Long.valueOf(l752.b).longValue();
                        pfd pfd3 = ((ufd) D).a;
                        zx3 a2 = a(pfd3, longValue);
                        if (a2 != null) {
                            l75 = new l75(this, pfd3, a2, lfd, lfd2);
                        }
                        if (l75 == null) {
                            return false;
                        }
                        try {
                            if (l752.e != null) {
                                l752.f.c.post(new oc4(17, l752));
                            }
                        } catch (Throwable th) {
                            try {
                                str = l752.a.a().optString("command");
                            } catch (JSONException unused) {
                                str = "";
                            }
                            this.b.logException("SignalingCommandQueueIterator", rf0.h("Error on discard command ", str), th);
                        }
                        arrayList.set(i2, l75);
                    } else if (!D.equals(tfd.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return true;
                }
                size = i2;
            } else {
                throw new IndexOutOfBoundsException("No more elements in the list");
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: l75} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v16, types: [lfd] */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r0 = "type"
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r1 = "stamp"
            r2 = 0
            long r4 = r11.optLong(r1, r2)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001a
            long r6 = r10.s
            long r4 = java.lang.Math.max(r4, r6)
            r10.s = r4
        L_0x001a:
            java.lang.String r1 = "response"
            boolean r1 = r0.equals(r1)
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0099
            java.lang.String r0 = "response"
            java.lang.String r0 = r11.optString(r0, r5)
            java.lang.String r1 = "sequence"
            long r1 = r11.getLong(r1)
            java.lang.String r3 = "recover"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0081
            boolean r0 = r10.u
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "messages"
            org.json.JSONArray r11 = r11.optJSONArray(r0)
            if (r11 == 0) goto L_0x0055
            r0 = r4
        L_0x0045:
            int r3 = r11.length()
            if (r0 >= r3) goto L_0x0055
            org.json.JSONObject r3 = r11.getJSONObject(r0)
            r10.f(r3)
            int r0 = r0 + 1
            goto L_0x0045
        L_0x0055:
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
        L_0x0058:
            android.util.LongSparseArray r11 = r10.i     // Catch:{ all -> 0x007b }
            int r11 = r11.size()     // Catch:{ all -> 0x007b }
            if (r4 >= r11) goto L_0x007d
            android.util.LongSparseArray r11 = r10.i     // Catch:{ all -> 0x007b }
            java.lang.Object r11 = r11.valueAt(r4)     // Catch:{ all -> 0x007b }
            l75 r11 = (defpackage.l75) r11     // Catch:{ all -> 0x007b }
            zx3 r11 = r11.c     // Catch:{ all -> 0x007b }
            long r5 = r11.b     // Catch:{ all -> 0x007b }
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            goto L_0x0078
        L_0x0071:
            eef r3 = r10.g     // Catch:{ all -> 0x007b }
            java.lang.String r11 = r11.a     // Catch:{ all -> 0x007b }
            r3.f(r11)     // Catch:{ all -> 0x007b }
        L_0x0078:
            int r4 = r4 + 1
            goto L_0x0058
        L_0x007b:
            r10 = move-exception
            goto L_0x007f
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            return
        L_0x007f:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            throw r10
        L_0x0081:
            l75 r0 = r10.b(r1)
            if (r0 != 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            lfd r5 = r0.d
        L_0x008a:
            if (r5 == 0) goto L_0x0324
            android.os.Handler r0 = r10.c
            kfd r1 = new kfd
            r2 = 0
            r1.<init>(r10, r5, r11, r2)
            r0.post(r1)
            goto L_0x0324
        L_0x0099:
            java.lang.String r1 = "notification"
            boolean r1 = r0.equals(r1)
            r6 = 2
            if (r1 == 0) goto L_0x01fb
            java.lang.String r0 = "notification"
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r1 = "connection"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = "recoverMessages"
            org.json.JSONArray r0 = r11.optJSONArray(r0)
            if (r0 == 0) goto L_0x00ce
            boolean r1 = r10.u
            if (r1 == 0) goto L_0x00ce
            r1 = r4
        L_0x00be:
            int r5 = r0.length()
            if (r1 >= r5) goto L_0x00ce
            org.json.JSONObject r5 = r0.getJSONObject(r1)
            r10.f(r5)
            int r1 = r1 + 1
            goto L_0x00be
        L_0x00ce:
            java.lang.String r0 = "conversation"
            org.json.JSONObject r0 = r11.getJSONObject(r0)
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.getString(r1)
            xwb r1 = r10.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "cur cid="
            r5.<init>(r8)
            ct3 r8 = r10.o
            dt3 r8 = (defpackage.dt3) r8
            java.lang.String r8 = r8.a
            r5.append(r8)
            java.lang.String r8 = ", new cid="
            r5.append(r8)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = "OKSignaling"
            r1.log(r8, r5)
            ct3 r1 = r10.o
            boolean r5 = r1 instanceof defpackage.dt3
            if (r5 == 0) goto L_0x0107
            dt3 r1 = (defpackage.dt3) r1
            r1.a = r0
        L_0x0107:
            java.lang.String r0 = "conversationParams"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            if (r0 != 0) goto L_0x0110
            goto L_0x016b
        L_0x0110:
            java.lang.String r1 = "activityTimeout"
            r8 = -1
            long r0 = r0.optLong(r1, r8)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x016b
            eef r5 = r10.g
            r5.getClass()
            long r6 = r0 / r6
            r8 = 60000(0xea60, double:2.9644E-319)
            long r8 = r0 - r8
            long r6 = java.lang.Math.max(r6, r8)
            r8 = 30000(0x7530, double:1.4822E-319)
            long r6 = java.lang.Math.max(r6, r8)
            r5.i = r6
            long r6 = r5.r
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x014c
            r2 = 4
            long r0 = r0 / r2
            r2 = 61000(0xee48, double:3.0138E-319)
            long r0 = java.lang.Math.min(r0, r2)
            r2 = 11000(0x2af8, double:5.4347E-320)
            long r0 = java.lang.Math.max(r0, r2)
            r5.r = r0
        L_0x014c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "updateTimeoutMS timeoutMS="
            r0.<init>(r1)
            long r1 = r5.i
            r0.append(r1)
            java.lang.String r1 = " serverPingTimeoutMs="
            r0.append(r1)
            long r1 = r5.r
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            d4b r1 = r5.q
            r1.n(r0)
        L_0x016b:
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
            r1 = 1
            r10.r = r1     // Catch:{ all -> 0x019f }
            boolean r2 = r10.q     // Catch:{ all -> 0x019f }
            if (r2 == 0) goto L_0x01ac
            boolean r2 = r10.u     // Catch:{ all -> 0x019f }
            if (r2 != 0) goto L_0x01ac
            long r1 = r10.t     // Catch:{ all -> 0x019f }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a1 }
            r3.<init>()     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r4 = "stamp"
            r3.put((java.lang.String) r4, (long) r1)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r1 = "recover"
            x66 r1 = defpackage.x87.d(r3, r1)     // Catch:{ JSONException -> 0x01a1 }
            java.util.concurrent.atomic.AtomicLong r2 = r10.e     // Catch:{ JSONException -> 0x01a1 }
            long r2 = r2.getAndIncrement()     // Catch:{ JSONException -> 0x01a1 }
            zx3 r1 = r10.a(r1, r2)     // Catch:{ JSONException -> 0x01a1 }
            if (r1 == 0) goto L_0x01e9
            eef r2 = r10.g     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r1 = r1.a     // Catch:{ JSONException -> 0x01a1 }
            r2.f(r1)     // Catch:{ JSONException -> 0x01a1 }
            goto L_0x01e9
        L_0x019f:
            r10 = move-exception
            goto L_0x01eb
        L_0x01a1:
            r1 = move-exception
            xwb r2 = r10.b     // Catch:{ all -> 0x019f }
            java.lang.String r3 = "OKSignaling"
            java.lang.String r4 = "signaling.recover"
            r2.reportException(r3, r4, r1)     // Catch:{ all -> 0x019f }
            goto L_0x01e9
        L_0x01ac:
            r10.q = r1     // Catch:{ all -> 0x019f }
        L_0x01ae:
            java.util.ArrayList r1 = r10.h     // Catch:{ all -> 0x019f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x019f }
            if (r1 != 0) goto L_0x01e9
            java.util.ArrayList r1 = r10.h     // Catch:{ all -> 0x019f }
            java.lang.Object r1 = r1.remove(r4)     // Catch:{ all -> 0x019f }
            l75 r1 = (defpackage.l75) r1     // Catch:{ all -> 0x019f }
            zx3 r2 = r1.c     // Catch:{ all -> 0x019f }
            xwb r3 = r10.b     // Catch:{ all -> 0x019f }
            java.lang.String r5 = "OKSignaling"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
            r6.<init>()     // Catch:{ all -> 0x019f }
            java.lang.String r7 = "send postponed "
            r6.append(r7)     // Catch:{ all -> 0x019f }
            r6.append(r2)     // Catch:{ all -> 0x019f }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x019f }
            r3.log(r5, r2)     // Catch:{ all -> 0x019f }
            zx3 r2 = r1.c     // Catch:{ all -> 0x019f }
            android.util.LongSparseArray r3 = r10.i     // Catch:{ all -> 0x019f }
            long r5 = r2.b     // Catch:{ all -> 0x019f }
            r3.put(r5, r1)     // Catch:{ all -> 0x019f }
            eef r1 = r10.g     // Catch:{ all -> 0x019f }
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x019f }
            r1.f(r2)     // Catch:{ all -> 0x019f }
            goto L_0x01ae
        L_0x01e9:
            monitor-exit(r0)     // Catch:{ all -> 0x019f }
            goto L_0x01ed
        L_0x01eb:
            monitor-exit(r0)     // Catch:{ all -> 0x019f }
            throw r10
        L_0x01ed:
            android.os.Handler r0 = r10.c
            sbc r1 = new sbc
            r2 = 19
            r1.<init>(r10, r2, r11)
            r0.post(r1)
            goto L_0x0324
        L_0x01fb:
            java.lang.String r1 = "error"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0324
            java.lang.String r0 = "sequence"
            boolean r0 = r11.has(r0)
            if (r0 == 0) goto L_0x0317
            java.lang.String r0 = "sequence"
            long r0 = r11.getLong(r0)
            l75 r2 = r10.b(r0)
            if (r2 != 0) goto L_0x0219
            r2 = r5
            goto L_0x021b
        L_0x0219:
            lfd r2 = r2.e
        L_0x021b:
            if (r2 == 0) goto L_0x0228
            android.os.Handler r3 = r10.c
            kfd r8 = new kfd
            r9 = 1
            r8.<init>(r10, r2, r11, r9)
            r3.post(r8)
        L_0x0228:
            java.lang.String r2 = "error"
            java.lang.String r2 = r11.getString(r2)
            java.lang.String r3 = "service-unavailable"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02f4
            axb r2 = r10.a
            tqd r3 = defpackage.tqd.app_event
            java.lang.String r8 = "rtc.cmd.service.unavailable"
            r2.log((defpackage.tqd) r3, (java.lang.String) r8, (java.lang.String) r5)
            java.lang.String r2 = "recoverable"
            boolean r2 = r11.optBoolean(r2, r4)
            if (r2 != 0) goto L_0x0256
            java.lang.String r0 = "signaling.listener.response.error.seq"
            android.os.Handler r1 = r10.c
            ncd r2 = new ncd
            r3 = 2
            r2.<init>(r10, r11, r0, r3)
            r1.post(r2)
            goto L_0x0324
        L_0x0256:
            java.lang.String r11 = "<!> retrying "
            java.lang.String r2 = "<!> quit retrying "
            java.lang.Object r3 = r10.f
            monitor-enter(r3)
            android.util.LongSparseArray r4 = r10.i     // Catch:{ all -> 0x026f }
            int r0 = r4.indexOfKey(r0)     // Catch:{ all -> 0x026f }
            if (r0 < 0) goto L_0x0272
            android.util.LongSparseArray r1 = r10.i     // Catch:{ all -> 0x026f }
            java.lang.Object r1 = r1.valueAt(r0)     // Catch:{ all -> 0x026f }
            r5 = r1
            l75 r5 = (defpackage.l75) r5     // Catch:{ all -> 0x026f }
            goto L_0x0272
        L_0x026f:
            r10 = move-exception
            goto L_0x02f2
        L_0x0272:
            if (r5 == 0) goto L_0x02f0
            zx3 r1 = r5.c     // Catch:{ all -> 0x026f }
            long r4 = r1.d     // Catch:{ all -> 0x026f }
            r8 = 1
            long r4 = r4 + r8
            r1.d = r4     // Catch:{ all -> 0x026f }
            int r8 = r10.n     // Catch:{ all -> 0x026f }
            long r8 = (long) r8     // Catch:{ all -> 0x026f }
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x02bc
            xwb r11 = r10.b     // Catch:{ all -> 0x026f }
            java.lang.String r4 = "OKSignaling"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            r5.<init>(r2)     // Catch:{ all -> 0x026f }
            ct3 r2 = r10.o     // Catch:{ all -> 0x026f }
            dt3 r2 = (defpackage.dt3) r2     // Catch:{ all -> 0x026f }
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x026f }
            r5.append(r2)     // Catch:{ all -> 0x026f }
            java.lang.String r2 = " "
            r5.append(r2)     // Catch:{ all -> 0x026f }
            r5.append(r1)     // Catch:{ all -> 0x026f }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x026f }
            r11.log(r4, r1)     // Catch:{ all -> 0x026f }
            xwb r11 = r10.b     // Catch:{ all -> 0x026f }
            java.lang.String r1 = "OKSignaling"
            java.lang.String r2 = "signaling.retry"
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x026f }
            java.lang.String r5 = "retry.fail"
            r4.<init>(r5)     // Catch:{ all -> 0x026f }
            r11.reportException(r1, r2, r4)     // Catch:{ all -> 0x026f }
            android.util.LongSparseArray r10 = r10.i     // Catch:{ all -> 0x026f }
            r10.removeAt(r0)     // Catch:{ all -> 0x026f }
            monitor-exit(r3)     // Catch:{ all -> 0x026f }
            goto L_0x0324
        L_0x02bc:
            q36 r0 = new q36     // Catch:{ all -> 0x026f }
            r2 = 5
            r4 = 0
            r0.<init>(r10, r1, r4, r2)     // Catch:{ all -> 0x026f }
            java.util.ArrayList r2 = r10.j     // Catch:{ all -> 0x026f }
            r2.add(r0)     // Catch:{ all -> 0x026f }
            xwb r2 = r10.b     // Catch:{ all -> 0x026f }
            java.lang.String r4 = "OKSignaling"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            r5.<init>(r11)     // Catch:{ all -> 0x026f }
            r5.append(r1)     // Catch:{ all -> 0x026f }
            java.lang.String r11 = r5.toString()     // Catch:{ all -> 0x026f }
            r2.log(r4, r11)     // Catch:{ all -> 0x026f }
            android.os.Handler r11 = r10.d     // Catch:{ all -> 0x026f }
            long r4 = r1.c     // Catch:{ all -> 0x026f }
            r11.postDelayed(r0, r4)     // Catch:{ all -> 0x026f }
            long r4 = r1.c     // Catch:{ all -> 0x026f }
            long r4 = r4 * r6
            r1.c = r4     // Catch:{ all -> 0x026f }
            int r10 = r10.m     // Catch:{ all -> 0x026f }
            long r10 = (long) r10     // Catch:{ all -> 0x026f }
            long r10 = java.lang.Math.min(r4, r10)     // Catch:{ all -> 0x026f }
            r1.c = r10     // Catch:{ all -> 0x026f }
        L_0x02f0:
            monitor-exit(r3)     // Catch:{ all -> 0x026f }
            goto L_0x0324
        L_0x02f2:
            monitor-exit(r3)     // Catch:{ all -> 0x026f }
            throw r10
        L_0x02f4:
            axb r0 = r10.a
            tqd r1 = defpackage.tqd.app_event
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "rtc.cmd.error."
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.log((defpackage.tqd) r1, (java.lang.String) r2, (java.lang.String) r5)
            java.lang.String r0 = "signaling.listener.response.error.seq"
            android.os.Handler r1 = r10.c
            ncd r2 = new ncd
            r3 = 2
            r2.<init>(r10, r11, r0, r3)
            r1.post(r2)
            goto L_0x0324
        L_0x0317:
            java.lang.String r0 = "listener.response.error"
            android.os.Handler r1 = r10.c
            ncd r2 = new ncd
            r3 = 2
            r2.<init>(r10, r11, r0, r3)
            r1.post(r2)
        L_0x0324:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfd.f(org.json.JSONObject):void");
    }

    public final void g() {
        this.g.b();
        synchronized (this.f) {
            try {
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    this.d.removeCallbacks((Runnable) it.next());
                }
                this.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(x66 x66, lfd lfd) {
        d(x66, false, lfd, (lfd) null);
    }

    public final void i(pfd pfd) {
        d(pfd, false, (lfd) null, (lfd) null);
    }

    public final void j(JSONObject jSONObject, lfd lfd, lfd lfd2) {
        d(new x66(jSONObject), false, lfd, lfd2);
    }
}
