package defpackage;

import android.util.Range;
import android.util.Size;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: uwb  reason: default package */
public final class uwb implements f83 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[Catch:{ NumberFormatException -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009d A[Catch:{ NumberFormatException -> 0x0053 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uwb(defpackage.xwb r17, org.webrtc.StatsReport[] r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r0 = 0
            r1.a = r0
            r16.<init>()
            r0 = 0
            r1.c = r0
            r1.b = r2
            int r4 = r3.length
            r6 = 0
        L_0x0013:
            if (r6 >= r4) goto L_0x0236
            r7 = r3[r6]
            java.lang.String r0 = r7.type
            java.lang.String r8 = "VideoBwe"
            boolean r0 = r0.equals(r8)
            java.lang.String r8 = "stat.parse"
            java.lang.String r9 = "RTCDeprecatedStat"
            if (r0 == 0) goto L_0x00ae
            org.webrtc.StatsReport$Value[] r10 = r7.values
            int r11 = r10.length
            r12 = 0
        L_0x0029:
            if (r12 >= r11) goto L_0x00ae
            r0 = r10[r12]
            java.lang.String r13 = r0.name     // Catch:{ NumberFormatException -> 0x0053 }
            int r14 = r13.hashCode()     // Catch:{ NumberFormatException -> 0x0053 }
            r5 = -1709278787(0xffffffff9a1e79bd, float:-3.2771974E-23)
            r15 = 2
            if (r14 == r5) goto L_0x0069
            r5 = -1197172950(0xffffffffb8a4972a, float:-7.848286E-5)
            if (r14 == r5) goto L_0x005f
            r5 = 1074688577(0x400e7241, float:2.2257235)
            if (r14 == r5) goto L_0x0055
            r5 = 1093751428(0x41315284, float:11.082645)
            if (r14 == r5) goto L_0x0049
            goto L_0x0073
        L_0x0049:
            java.lang.String r5 = "googTargetEncBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = 0
            goto L_0x0074
        L_0x0053:
            r0 = move-exception
            goto L_0x00a7
        L_0x0055:
            java.lang.String r5 = "googActualEncBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = r15
            goto L_0x0074
        L_0x005f:
            java.lang.String r5 = "googRetransmitBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = 3
            goto L_0x0074
        L_0x0069:
            java.lang.String r5 = "googTransmitBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = 1
            goto L_0x0074
        L_0x0073:
            r5 = -1
        L_0x0074:
            if (r5 == 0) goto L_0x009d
            r13 = 1
            if (r5 == r13) goto L_0x0093
            if (r5 == r15) goto L_0x0089
            r13 = 3
            if (r5 == r13) goto L_0x007f
            goto L_0x00aa
        L_0x007f:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x0089:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x0093:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x009d:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x00a7:
            r2.logException(r9, r8, r0)
        L_0x00aa:
            int r12 = r12 + 1
            goto L_0x0029
        L_0x00ae:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            org.webrtc.StatsReport$Value[] r0 = r7.values
            int r10 = r0.length
            r11 = 0
        L_0x00b7:
            if (r11 >= r10) goto L_0x00c5
            r12 = r0[r11]
            java.lang.String r13 = r12.name
            java.lang.String r12 = r12.value
            r5.put(r13, r12)
            int r11 = r11 + 1
            goto L_0x00b7
        L_0x00c5:
            java.lang.String r0 = r7.type
            java.lang.String r10 = "ssrc"
            boolean r0 = r0.equals(r10)
            java.lang.String r11 = "video"
            java.lang.String r12 = "mediaType"
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = r7.id
            java.lang.String r13 = "recv"
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r5.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r11.equals(r0)
            java.lang.String r13 = "googJitterBufferMs"
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = "googNacksSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "googPlisSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "googFirsSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.Object r0 = r5.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "framesDecoded"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "framesReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            goto L_0x0135
        L_0x012c:
            java.lang.Object r0 = r5.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
        L_0x0135:
            java.lang.String r0 = r7.type
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = r7.id
            java.lang.String r10 = "send"
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x01e0
            java.lang.Object r0 = r5.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = "framesEncoded"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "googNacksReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "googPlisReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "googFirsReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "googAvgEncodeMs"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googAdaptationChanges"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googFrameWidthSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = "googFrameHeightSent"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r0 == 0) goto L_0x01b6
            if (r10 == 0) goto L_0x01b6
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01b2 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x01b2 }
            java.lang.Math.min(r0, r10)     // Catch:{ NumberFormatException -> 0x01b2 }
            java.lang.Math.max(r0, r10)     // Catch:{ NumberFormatException -> 0x01b2 }
            goto L_0x01b6
        L_0x01b2:
            r0 = move-exception
            r2.logException(r9, r8, r0)
        L_0x01b6:
            java.lang.String r0 = "bytesSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "packetsLost"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = "packetsSent"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x01e0
            if (r0 == 0) goto L_0x01e0
            java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01dc }
            java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x01dc }
            goto L_0x01e0
        L_0x01dc:
            r0 = move-exception
            r2.logException(r9, r8, r0)
        L_0x01e0:
            java.lang.String r0 = r7.type
            java.lang.String r7 = "googCandidatePair"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0232
            java.lang.String r0 = "googActiveConnection"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = "true"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x021e
            java.lang.String r0 = "googRtt"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googTransportType"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googRemoteCandidateType"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.c = r0
            java.lang.String r0 = "googLocalCandidateType"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.d = r0
        L_0x021e:
            java.lang.String r0 = "googLocalAddress"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.e = r0
            java.lang.String r0 = "googRemoteAddress"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.f = r0
        L_0x0232:
            int r6 = r6 + 1
            goto L_0x0013
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwb.<init>(xwb, org.webrtc.StatsReport[]):void");
    }

    public Object a(Class cls) {
        if (((Set) this.b).contains(pjb.a(cls))) {
            Object a2 = ((f83) this.f).a(cls);
            if (!cls.equals(cjb.class)) {
                return a2;
            }
            cjb cjb = (cjb) a2;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    public Set b(pjb pjb) {
        if (((Set) this.d).contains(pjb)) {
            return ((f83) this.f).b(pjb);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + pjb + ">.");
    }

    public jib c(Class cls) {
        return e(pjb.a(cls));
    }

    public jib d(pjb pjb) {
        if (((Set) this.e).contains(pjb)) {
            return ((f83) this.f).d(pjb);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<Set<" + pjb + ">>.");
    }

    public jib e(pjb pjb) {
        if (((Set) this.c).contains(pjb)) {
            return ((f83) this.f).e(pjb);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + pjb + ">.");
    }

    public Object f(pjb pjb) {
        if (((Set) this.b).contains(pjb)) {
            return ((f83) this.f).f(pjb);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + pjb + ".");
    }

    public long g(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e2) {
            ((xwb) this.b).logException("RTCDeprecatedStat", "stat.parse", e2);
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0093, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(qb7 r5, ybf r6, java.util.List r7, java.util.List r8, ope r9) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            boolean r1 = r8.isEmpty()     // Catch:{ all -> 0x001a }
            r1 = r1 ^ 1
            e07.k(r1)     // Catch:{ all -> 0x001a }
            r4.f = r9     // Catch:{ all -> 0x001a }
            nc7 r9 = r5.c()     // Catch:{ all -> 0x001a }
            sb7 r1 = r4.k(r9)     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r4 = move-exception
            goto L_0x00a5
        L_0x001d:
            java.lang.Object r2 = r4.d     // Catch:{ all -> 0x001a }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x001a }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r4.f     // Catch:{ all -> 0x001a }
            ope r2 = (ope) r2     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0032
            int r2 = r2.b     // Catch:{ all -> 0x001a }
            r3 = 2
            if (r2 == r3) goto L_0x0068
        L_0x0032:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x001a }
        L_0x0036:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x001a }
            v90 r2 = (v90) r2     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r4.c     // Catch:{ all -> 0x001a }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x001a }
            qb7 r2 = (qb7) r2     // Catch:{ all -> 0x001a }
            r2.getClass()     // Catch:{ all -> 0x001a }
            boolean r3 = r2.equals(r5)     // Catch:{ all -> 0x001a }
            if (r3 != 0) goto L_0x0036
            java.util.List r2 = r2.e()     // Catch:{ all -> 0x001a }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0060
            goto L_0x0036
        L_0x0060:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner."
            r4.<init>(r5)     // Catch:{ all -> 0x001a }
            throw r4     // Catch:{ all -> 0x001a }
        L_0x0068:
            ev1 r1 = r5.c     // Catch:{ CameraException -> 0x0097 }
            java.lang.Object r2 = r1.A0     // Catch:{ CameraException -> 0x0097 }
            monitor-enter(r2)     // Catch:{ CameraException -> 0x0097 }
            r1.x0 = r6     // Catch:{ all -> 0x009c }
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            ev1 r6 = r5.c     // Catch:{ CameraException -> 0x0097 }
            java.lang.Object r1 = r6.A0     // Catch:{ CameraException -> 0x0097 }
            monitor-enter(r1)     // Catch:{ CameraException -> 0x0097 }
            r6.y0 = r7     // Catch:{ all -> 0x0099 }
            monitor-exit(r1)     // Catch:{ all -> 0x0099 }
            java.lang.Object r6 = r5.a     // Catch:{ CameraException -> 0x0097 }
            monitor-enter(r6)     // Catch:{ CameraException -> 0x0097 }
            ev1 r5 = r5.c     // Catch:{ all -> 0x0094 }
            r5.c(r8)     // Catch:{ all -> 0x0094 }
            monitor-exit(r6)     // Catch:{ all -> 0x0094 }
            pc7 r5 = r9.R()     // Catch:{ all -> 0x001a }
            ob7 r5 = r5.d     // Catch:{ all -> 0x001a }
            ob7 r6 = ob7.o     // Catch:{ all -> 0x001a }
            boolean r5 = r5.a(r6)     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0092
            r4.n(r9)     // Catch:{ all -> 0x001a }
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x0094:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0094 }
            throw r4     // Catch:{ CameraException -> 0x0097 }
        L_0x0097:
            r4 = move-exception
            goto L_0x009f
        L_0x0099:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0099 }
            throw r4     // Catch:{ CameraException -> 0x0097 }
        L_0x009c:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r4     // Catch:{ CameraException -> 0x0097 }
        L_0x009f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001a }
            r5.<init>(r4)     // Catch:{ all -> 0x001a }
            throw r5     // Catch:{ all -> 0x001a }
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwb.h(qb7, ybf, java.util.List, java.util.List, ope):void");
    }

    public va0 i() {
        String str = ((Size) this.b) == null ? " resolution" : "";
        if (((zq4) this.c) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Range) this.d) == null) {
            str = hr1.g(str, " expectedFrameRateRange");
        }
        if (((Boolean) this.f) == null) {
            str = hr1.g(str, " zslDisabled");
        }
        if (str.isEmpty()) {
            return new va0((Size) this.b, (zq4) this.c, (Range) this.d, (ia3) this.e, ((Boolean) this.f).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public qb7 j(nc7 nc7, ev1 ev1) {
        synchronized (this.b) {
            try {
                e07.j("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", ((HashMap) this.c).get(new v90(nc7, ev1.X)) == null);
                qb7 qb7 = new qb7(nc7, ev1);
                if (((ArrayList) ev1.w()).isEmpty()) {
                    qb7.i();
                }
                if (nc7.R().d == ob7.a) {
                    return qb7;
                }
                m(qb7);
                return qb7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public sb7 k(nc7 nc7) {
        synchronized (this.b) {
            try {
                for (sb7 sb7 : ((HashMap) this.d).keySet()) {
                    if (nc7.equals(sb7.b)) {
                        return sb7;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean l(nc7 nc7) {
        synchronized (this.b) {
            try {
                sb7 k = k(nc7);
                if (k == null) {
                    return false;
                }
                for (v90 v90 : (Set) ((HashMap) this.d).get(k)) {
                    qb7 qb7 = (qb7) ((HashMap) this.c).get(v90);
                    qb7.getClass();
                    if (!qb7.e().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(qb7 qb7) {
        synchronized (this.b) {
            try {
                nc7 c2 = qb7.c();
                ev1 ev1 = qb7.c;
                v90 v90 = new v90(c2, ev1.t(ev1.G0, ev1.H0));
                sb7 k = k(c2);
                Set hashSet = k != null ? (Set) ((HashMap) this.d).get(k) : new HashSet();
                hashSet.add(v90);
                ((HashMap) this.c).put(v90, qb7);
                if (k == null) {
                    sb7 sb7 = new sb7(c2, this);
                    ((HashMap) this.d).put(sb7, hashSet);
                    c2.R().a(sb7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(nc7 nc7) {
        synchronized (this.b) {
            try {
                if (l(nc7)) {
                    if (((ArrayDeque) this.e).isEmpty()) {
                        ((ArrayDeque) this.e).push(nc7);
                    } else {
                        ope ope = (ope) this.f;
                        if (ope == null || ope.b != 2) {
                            nc7 nc72 = (nc7) ((ArrayDeque) this.e).peek();
                            if (!nc7.equals(nc72)) {
                                p(nc72);
                                ((ArrayDeque) this.e).remove(nc7);
                                ((ArrayDeque) this.e).push(nc7);
                            }
                        }
                    }
                    s(nc7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(nc7 nc7) {
        synchronized (this.b) {
            try {
                ((ArrayDeque) this.e).remove(nc7);
                p(nc7);
                if (!((ArrayDeque) this.e).isEmpty()) {
                    s((nc7) ((ArrayDeque) this.e).peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(nc7 nc7) {
        synchronized (this.b) {
            try {
                sb7 k = k(nc7);
                if (k != null) {
                    for (v90 v90 : (Set) ((HashMap) this.d).get(k)) {
                        qb7 qb7 = (qb7) ((HashMap) this.c).get(v90);
                        qb7.getClass();
                        qb7.i();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(List list) {
        synchronized (this.b) {
            for (v90 v90 : ((HashMap) this.c).keySet()) {
                qb7 qb7 = (qb7) ((HashMap) this.c).get(v90);
                boolean z = !qb7.e().isEmpty();
                synchronized (qb7.a) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.retainAll(qb7.c.w());
                    qb7.c.z(arrayList);
                }
                if (z) {
                    if (qb7.e().isEmpty()) {
                        o(qb7.c());
                    }
                }
            }
        }
    }

    public void r() {
        synchronized (this.b) {
            for (v90 v90 : ((HashMap) this.c).keySet()) {
                qb7 qb7 = (qb7) ((HashMap) this.c).get(v90);
                synchronized (qb7.a) {
                    ev1 ev1 = qb7.c;
                    ev1.z((ArrayList) ev1.w());
                }
                o(qb7.c());
            }
        }
    }

    public void s(nc7 nc7) {
        synchronized (this.b) {
            try {
                for (v90 v90 : (Set) ((HashMap) this.d).get(k(nc7))) {
                    qb7 qb7 = (qb7) ((HashMap) this.c).get(v90);
                    qb7.getClass();
                    if (!qb7.e().isEmpty()) {
                        qb7.q();
                    }
                }
            } finally {
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(super.toString());
                sb.append(10);
                for (Field field : uwb.class.getDeclaredFields()) {
                    try {
                        sb.append(field.getName());
                        sb.append('=');
                        sb.append(field.get(this));
                        sb.append(10);
                    } catch (IllegalAccessException e2) {
                        sb.append("\nCaught ");
                        sb.append(e2.getMessage());
                        sb.append(10);
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public uwb(t73 t73, f83 f83) {
        this.a = 3;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (oe4 oe4 : t73.c) {
            int i = oe4.c;
            boolean z = i == 0;
            int i2 = oe4.b;
            pjb pjb = oe4.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(pjb);
                } else {
                    hashSet.add(pjb);
                }
            } else if (i == 2) {
                hashSet3.add(pjb);
            } else if (i2 == 2) {
                hashSet5.add(pjb);
            } else {
                hashSet2.add(pjb);
            }
        }
        if (!t73.g.isEmpty()) {
            hashSet.add(pjb.a(cjb.class));
        }
        this.b = Collections.unmodifiableSet(hashSet);
        this.c = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = f83;
    }

    public uwb(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new Object();
                this.c = new HashMap();
                this.d = new HashMap();
                this.e = new ArrayDeque();
                return;
            default:
                return;
        }
    }
}
