package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: d1c  reason: default package */
public final class d1c {
    public final long a;
    public final int b;
    public final Object c;
    public Object d;
    public final Object e;

    public d1c(kee kee, TimeUnit timeUnit) {
        this.b = 5;
        this.a = timeUnit.toNanos(5);
        this.c = kee.f();
        this.d = new el6(this, wn6.l(new StringBuilder(), nze.g, " ConnectionPool"), 1);
        this.e = new ConcurrentLinkedQueue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.contains(r1) != false) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = defpackage.r1g.p(r0)
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = "youtube"
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L_0x0013
            goto L_0x0026
        L_0x0013:
            java.lang.String r1 = "vimeo"
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L_0x001c
            goto L_0x0026
        L_0x001c:
            java.lang.String r1 = "instagram"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            r0 = 2
            int r3 = r3.b
            if (r3 == r0) goto L_0x0032
            r0 = 3
            if (r3 != r0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            java.lang.String r3 = "player"
            goto L_0x0034
        L_0x0032:
            java.lang.String r3 = "attachment"
        L_0x0034:
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = "/"
            java.lang.String r3 = me4.i(r3, r0, r1)
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1c.a():java.lang.String");
    }

    public boolean b(ca caVar, y0c y0c, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.e).iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                return false;
            }
            c1c c1c = (c1c) it.next();
            synchronized (c1c) {
                if (z) {
                    if (c1c.f != null) {
                        z2 = true;
                    }
                    if (!z2) {
                    }
                }
                if (c1c.h(caVar, arrayList)) {
                    y0c.b(c1c);
                    return true;
                }
            }
        }
    }

    public int c(c1c c1c, long j) {
        byte[] bArr = nze.a;
        ArrayList arrayList = c1c.o;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                kxa kxa = kxa.a;
                kxa.a.j(((x0c) reference).a, "A connection to " + c1c.q.a.a + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                c1c.i = true;
                if (arrayList.isEmpty()) {
                    c1c.p = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public void d(Throwable th) {
        String str;
        boolean z;
        String a2 = a();
        if (!((ed3) vl.b().getAccessor().c(ed3.class)).f() || (((z = th instanceof FetcherException)) && ((FetcherException) th).a == 2)) {
            str = "offline";
        } else if (z && ((FetcherException) th).a == 4) {
            str = "parse_manifest";
        } else if (!z) {
            str = th instanceof TimeoutException ? "timeout" : "unknown";
        } else {
            return;
        }
        String str2 = str;
        int i = this.b;
        f("error", str2, (String) null, (String) null, i == 1, a2, i == 5, i == 3 ? "auto" : null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.lang.Object r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            u2f r0 = (u2f) r0
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r7 = r10.a()
            java.lang.Object r0 = r10.d
            u2f r0 = (u2f) r0
            boolean r1 = r0 instanceof xy3
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "VIDEO_DASH"
        L_0x0016:
            r4 = r1
            goto L_0x0027
        L_0x0018:
            boolean r1 = r0 instanceof uj6
            if (r1 == 0) goto L_0x001f
            java.lang.String r1 = "HLS_PLAYLIST"
            goto L_0x0016
        L_0x001f:
            boolean r1 = r0 instanceof y79
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = "VIDEO_MP4"
            goto L_0x0016
        L_0x0026:
            r4 = r2
        L_0x0027:
            android.net.Uri r0 = r0.l()
            java.lang.String r5 = r0.getHost()
            r0 = 1
            r1 = 0
            int r3 = r10.b
            if (r3 != r0) goto L_0x0037
            r6 = r0
            goto L_0x0038
        L_0x0037:
            r6 = r1
        L_0x0038:
            r8 = 5
            if (r3 != r8) goto L_0x003d
            r8 = r0
            goto L_0x003e
        L_0x003d:
            r8 = r1
        L_0x003e:
            r0 = 3
            if (r3 != r0) goto L_0x0045
            java.lang.String r0 = "auto"
            r9 = r0
            goto L_0x0046
        L_0x0045:
            r9 = r2
        L_0x0046:
            r1 = r10
            r2 = r12
            r3 = r11
            r1.f(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1c.e(java.lang.Object, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [a07, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v5, types: [java.util.Map, kgd] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010c, code lost:
        if (r1.equals("stop") == false) goto L_0x00ee;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.lang.String r19, java.lang.Object r20, java.lang.String r21, java.lang.String r22, boolean r23, java.lang.String r24, boolean r25, java.lang.String r26) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r22
            r4 = r24
            r5 = r26
            r10 = 0
            r11 = 1
            java.lang.Object r12 = r0.e
            oa7 r12 = (defpackage.oa7) r12
            java.lang.Object r13 = r12.get()
            if (r13 != 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.Object r13 = r12.get()
            bd r13 = (bd) r13
            in7 r14 = r13.a()
            boolean r14 = r14.c()
            java.lang.String r15 = "place"
            if (r14 == 0) goto L_0x002d
            goto L_0x00b6
        L_0x002d:
            a07 r14 = new a07
            r14.<init>()
            java.lang.String r6 = "VIDEO_STATS"
            r14.c = r6
            long r7 = java.lang.System.currentTimeMillis()
            r14.a = r7
            r14.o = r1
            yr r7 = new yr
            r7.<init>(r10)
            long r9 = r0.a
            r16 = 0
            int r16 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r16 == 0) goto L_0x0054
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.String r10 = "vid"
            r7.put(r10, r9)
        L_0x0054:
            if (r20 == 0) goto L_0x005f
            java.lang.String r9 = "param"
            java.lang.String r10 = r20.toString()
            r7.put(r9, r10)
        L_0x005f:
            if (r2 == 0) goto L_0x006d
            int r9 = r21.length()
            if (r9 != 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            java.lang.String r9 = "ct"
            r7.put(r9, r2)
        L_0x006d:
            if (r3 == 0) goto L_0x007b
            int r2 = r22.length()
            if (r2 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            java.lang.String r2 = "cdn_host"
            r7.put(r2, r3)
        L_0x007b:
            java.lang.String r2 = "dst"
            if (r23 == 0) goto L_0x0084
            java.lang.String r3 = "pip"
            r7.put(r2, r3)
        L_0x0084:
            if (r4 == 0) goto L_0x0090
            int r3 = r24.length()
            if (r3 != 0) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            r7.put(r15, r4)
        L_0x0090:
            if (r25 == 0) goto L_0x0097
            java.lang.String r3 = "chromecast"
            r7.put(r2, r3)
        L_0x0097:
            if (r5 == 0) goto L_0x00a5
            int r2 = r26.length()
            if (r2 != 0) goto L_0x00a0
            goto L_0x00a5
        L_0x00a0:
            java.lang.String r2 = "stat_type"
            r7.put(r2, r5)
        L_0x00a5:
            boolean r2 = r7.isEmpty()
            r2 = r2 ^ r11
            if (r2 == 0) goto L_0x00af
            r14.c(r7)
        L_0x00af:
            ln7 r2 = r14.d()
            r13.j(r2)
        L_0x00b6:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r0 = r0.b
            r3 = 2
            r5 = 3
            if (r0 == r11) goto L_0x00da
            r6 = 4
            if (r0 == r3) goto L_0x00d6
            r7 = 5
            if (r0 == r5) goto L_0x00d3
            if (r0 == r6) goto L_0x00d0
            if (r0 != r7) goto L_0x00ce
            java.lang.String r0 = "CAST"
            goto L_0x00de
        L_0x00ce:
            r0 = 0
            throw r0
        L_0x00d0:
            java.lang.String r0 = "PLAYER"
            goto L_0x00de
        L_0x00d3:
            java.lang.String r0 = "INBUBBLE_AUTOPLAY"
            goto L_0x00de
        L_0x00d6:
            r7 = 5
            java.lang.String r0 = "INBUBBLE"
            goto L_0x00de
        L_0x00da:
            r6 = 4
            r7 = 5
            java.lang.String r0 = "PIP"
        L_0x00de:
            java.lang.String r8 = "sourceType"
            r2.put(r8, r0)
            r2.put(r15, r4)
            r0 = -1
            int r4 = r19.hashCode()
            switch(r4) {
                case -934524953: goto L_0x0130;
                case -702473442: goto L_0x0125;
                case -401282369: goto L_0x011a;
                case 3443508: goto L_0x010f;
                case 3540994: goto L_0x0106;
                case 96784904: goto L_0x00fb;
                case 106440182: goto L_0x00f0;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            r6 = r0
            goto L_0x013a
        L_0x00f0:
            java.lang.String r3 = "pause"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00f9
            goto L_0x00ee
        L_0x00f9:
            r6 = 6
            goto L_0x013a
        L_0x00fb:
            java.lang.String r3 = "error"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0104
            goto L_0x00ee
        L_0x0104:
            r6 = r7
            goto L_0x013a
        L_0x0106:
            java.lang.String r3 = "stop"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x013a
            goto L_0x00ee
        L_0x010f:
            java.lang.String r3 = "play"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0118
            goto L_0x00ee
        L_0x0118:
            r6 = r5
            goto L_0x013a
        L_0x011a:
            java.lang.String r4 = "play_toggle"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0123
            goto L_0x00ee
        L_0x0123:
            r6 = r3
            goto L_0x013a
        L_0x0125:
            java.lang.String r3 = "first_frame"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x012e
            goto L_0x00ee
        L_0x012e:
            r6 = r11
            goto L_0x013a
        L_0x0130:
            java.lang.String r3 = "replay"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0139
            goto L_0x00ee
        L_0x0139:
            r6 = 0
        L_0x013a:
            switch(r6) {
                case 0: goto L_0x019d;
                case 1: goto L_0x0189;
                case 2: goto L_0x017d;
                case 3: goto L_0x0171;
                case 4: goto L_0x0165;
                case 5: goto L_0x0155;
                case 6: goto L_0x013e;
                default: goto L_0x013d;
            }
        L_0x013d:
            goto L_0x01a8
        L_0x013e:
            r0 = r20
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x01a8 }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x01a8 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.Object r2 = r12.get()     // Catch:{ Exception -> 0x01a8 }
            bd r2 = (bd) r2     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r3 = "ACTION_VIDEO_PAUSED"
            r2.i(r0, r3)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01a8
        L_0x0155:
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object r1 = r12.get()     // Catch:{ Exception -> 0x01a8 }
            bd r1 = (bd) r1     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r2 = "ACTION_VIDEO_LOADING_ERROR"
            r1.g(r2, r0)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01a8
        L_0x0165:
            java.lang.Object r0 = r12.get()
            bd r0 = (bd) r0
            java.lang.String r1 = "ACTION_VIDEO_STOP"
            r0.h(r1, r2)
            goto L_0x01a8
        L_0x0171:
            java.lang.Object r0 = r12.get()
            bd r0 = (bd) r0
            java.lang.String r1 = "ACTION_VIDEO_PLAY"
            r0.h(r1, r2)
            goto L_0x01a8
        L_0x017d:
            java.lang.Object r0 = r12.get()
            bd r0 = (bd) r0
            java.lang.String r1 = "ACTION_VIDEO_PLAY_TOGGLE"
            r0.h(r1, r2)
            goto L_0x01a8
        L_0x0189:
            r0 = r20
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x01a8 }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object r2 = r12.get()     // Catch:{ Exception -> 0x01a8 }
            bd r2 = (bd) r2     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r3 = "ACTION_VIDEO_FIRST_FRAME"
            r2.i(r0, r3)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01a8
        L_0x019d:
            java.lang.Object r0 = r12.get()
            bd r0 = (bd) r0
            java.lang.String r1 = "ACTION_VIDEO_REPLAY"
            r0.h(r1, r2)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1c.f(java.lang.String, java.lang.Object, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String):void");
    }

    public d1c(long j, int i, String str, oa7 oa7) {
        this.a = j;
        this.b = i;
        this.c = str != null ? str.toLowerCase() : null;
        this.e = oa7;
    }
}
