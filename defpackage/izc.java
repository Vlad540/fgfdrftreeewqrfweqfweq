package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.SessionDescription;

/* renamed from: izc  reason: default package */
public final class izc extends sl1 implements lfd, NetworkMonitor.NetworkObserver {
    public final c2b H0;
    public final pd4 I0;
    public final mfd J0;
    public long K0;
    public long L0;
    public final iue M0;
    public final oa2 N0 = new Object();
    public final sg4 O0;

    /* JADX WARNING: type inference failed for: r0v5, types: [oa2, java.lang.Object] */
    public izc(hzc hzc) {
        super(hzc.h, hzc.g, hzc.m, hzc.o, hzc.p, hzc.q, hzc.b, hzc.v, hzc.w, hzc.A);
        S(this + " ctor");
        mfd mfd = hzc.i;
        this.J0 = mfd;
        this.I0 = hzc.c;
        this.H0 = hzc.r;
        mfd.k.add(this);
        iue iue = new iue(hzc, this);
        this.M0 = iue;
        this.O0 = new sg4(hzc.o, iue);
        NetworkMonitor.getInstance().addObserver(this);
    }

    public final Map A() {
        int i;
        koc koc = this.M0.F0.b;
        if (koc == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = koc.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            nxf nxf = (nxf) entry.getValue();
            if (nxf != null) {
                r24 r24 = nxf.g;
                long j = (long) nxf.l.get();
                long j2 = (long) nxf.m.get();
                long j3 = (long) nxf.n.get();
                long j4 = (long) nxf.o.get();
                Iterator it2 = it;
                HashMap hashMap2 = hashMap;
                long j5 = (long) nxf.p.get();
                long j6 = (long) nxf.q.get();
                long j7 = (long) nxf.r.get();
                long j8 = (long) nxf.s.get();
                long j9 = (long) nxf.t.get();
                long j10 = (long) nxf.y.get();
                long j11 = (long) nxf.z.get();
                lje lje = nxf.u;
                Map.Entry entry2 = entry;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j12 = j11;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                double convert = (double) timeUnit.convert((long) lje.b.b, timeUnit2);
                double convert2 = (double) timeUnit.convert((long) nxf.v.b.b, timeUnit2);
                double convert3 = (double) timeUnit.convert((long) nxf.w.b.b, timeUnit2);
                double convert4 = (double) timeUnit.convert((long) nxf.x.b.b, timeUnit2);
                if (r24 == null || (i = r24.Y) == 1 || i == 2) {
                    if (r24 != null) {
                        r24.B0.get();
                    }
                    if (r24 != null) {
                        r24.C0.get();
                    }
                    loc loc = r5;
                    loc loc2 = new loc(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j12, convert, convert2, convert3, convert4, (zz5) nxf.A.o);
                    hashMap = hashMap2;
                    hashMap.put((ge1) entry2.getKey(), loc);
                    it = it2;
                } else {
                    throw null;
                }
            }
        }
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [tyf, java.lang.Runnable] */
    public final void C(jsd jsd) {
        joc joc = new joc(this, 1, jsd);
        iue iue = this.M0;
        if (iue.F0 != null) {
            zla zla = iue.F0;
            zla.getClass();
            zla.i("getStats.legacy", new tyf(zla, new sla(zla, 2, joc), 1));
        }
    }

    public final String D() {
        return "ServerCallTopology";
    }

    public final void E(ge1 ge1, List list, boolean z, rw0 rw0) {
        try {
            this.J0.h(x87.x(ge1, list, z), rw0);
        } catch (JSONException unused) {
            this.Y.reportException("ServerCallTopology", "server.topology.send.grantRoles", new Exception("server.topology.send.grantRoles"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f8 A[Catch:{ JSONException -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fb A[Catch:{ JSONException -> 0x0117 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G() {
        /*
            r24 = this;
            r0 = r24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "handleStateChanged, "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = ", state = "
            r1.append(r2)
            r2 = 1
            java.lang.String r3 = defpackage.sl1.B(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.S(r1)
            boolean r1 = r24.I()
            java.lang.String r4 = " state"
            if (r1 == 0) goto L_0x015c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "enable processing signaling replies in "
            r1.<init>(r5)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.v(r1)
            mfd r1 = r0.J0
            java.util.concurrent.CopyOnWriteArraySet r1 = r1.k
            r1.add(r0)
            axb r1 = r0.X
            tqd r3 = defpackage.tqd.app_event
            java.lang.String r4 = "rtc.disable.hw.vpx"
            r5 = 0
            r1.log((defpackage.tqd) r3, (java.lang.String) r4, (java.lang.String) r5)
            iue r1 = r0.M0
            boolean r0 = r24.I()
            if (r0 == 0) goto L_0x0158
            boolean r0 = r1.D0
            r3 = 0
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "request-realloc"
            x66 r0 = defpackage.x87.d(r5, r0)
            mfd r2 = r1.Z
            r2.i(r0)
            goto L_0x0121
        L_0x0067:
            java.lang.String r0 = "estimatedPerformanceIndex"
            c2b r4 = r1.w0
            java.lang.String r6 = "PeerConnectionWrapperBase"
            xwb r7 = r1.Y
            fe1 r8 = r1.a
            java.lang.String r9 = "video tracks count enabled: "
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "sendRequestAllocConsumer,"
            r10.<init>(r11)
            r10.append(r1)
            java.lang.String r11 = ", sdp=null"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            xwb r11 = r1.Y
            java.lang.String r12 = "UnifiedPeerConnection"
            r11.log(r12, r10)
            mv4 r10 = r1.z0     // Catch:{ JSONException -> 0x0117 }
            java.lang.Object r10 = r10.b     // Catch:{ JSONException -> 0x0117 }
            r7e r10 = (r7e) r10     // Catch:{ JSONException -> 0x0117 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ JSONException -> 0x0117 }
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ JSONException -> 0x0117 }
            int r11 = r10.intValue()     // Catch:{ JSONException -> 0x0117 }
            int r10 = r8.g     // Catch:{ JSONException -> 0x0117 }
            if (r10 <= 0) goto L_0x00a3
            r12 = r2
            goto L_0x00a4
        L_0x00a3:
            r12 = r3
        L_0x00a4:
            if (r12 == 0) goto L_0x00b8
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0117 }
            r12.<init>(r9)     // Catch:{ JSONException -> 0x0117 }
            r12.append(r10)     // Catch:{ JSONException -> 0x0117 }
            java.lang.String r9 = r12.toString()     // Catch:{ JSONException -> 0x0117 }
            r7.log(r6, r9)     // Catch:{ JSONException -> 0x0117 }
            r20 = r10
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r9 = "video tracks count disabled"
            r7.log(r6, r9)     // Catch:{ JSONException -> 0x0117 }
            r20 = r3
        L_0x00bf:
            mfd r9 = r1.Z     // Catch:{ JSONException -> 0x0117 }
            android.content.SharedPreferences r10 = r4.a     // Catch:{ JSONException -> 0x0117 }
            boolean r10 = r10.contains(r0)     // Catch:{ JSONException -> 0x0117 }
            if (r10 == 0) goto L_0x00d3
            android.content.SharedPreferences r4 = r4.a     // Catch:{ JSONException -> 0x0117 }
            int r0 = r4.getInt(r0, r3)     // Catch:{ JSONException -> 0x0117 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0117 }
        L_0x00d3:
            r12 = r5
            pe0 r0 = r8.A     // Catch:{ JSONException -> 0x0117 }
            oe0 r0 = r0.c     // Catch:{ JSONException -> 0x0117 }
            boolean r0 = r0.b     // Catch:{ JSONException -> 0x0117 }
            if (r0 == 0) goto L_0x00df
            r0 = 3
        L_0x00dd:
            r13 = r0
            goto L_0x00e6
        L_0x00df:
            int r0 = r8.g     // Catch:{ JSONException -> 0x0117 }
            if (r0 <= 0) goto L_0x00e5
            r0 = 2
            goto L_0x00dd
        L_0x00e5:
            r13 = r2
        L_0x00e6:
            boolean r14 = r8.e     // Catch:{ JSONException -> 0x0117 }
            boolean r15 = r8.f     // Catch:{ JSONException -> 0x0117 }
            boolean r0 = r8.h     // Catch:{ JSONException -> 0x0117 }
            boolean r4 = r8.i     // Catch:{ JSONException -> 0x0117 }
            cma r5 = defpackage.zla.A()     // Catch:{ JSONException -> 0x0117 }
            boolean r5 = r5.b     // Catch:{ JSONException -> 0x0117 }
            bd4 r10 = r1.A0     // Catch:{ JSONException -> 0x0117 }
            if (r10 == 0) goto L_0x00fb
            r19 = r2
            goto L_0x00fd
        L_0x00fb:
            r19 = r3
        L_0x00fd:
            boolean r2 = r8.x     // Catch:{ JSONException -> 0x0117 }
            boolean r10 = r8.u     // Catch:{ JSONException -> 0x0117 }
            boolean r8 = r8.v     // Catch:{ JSONException -> 0x0117 }
            r16 = r0
            r17 = r4
            r18 = r5
            r21 = r2
            r22 = r10
            r23 = r8
            x66 r0 = defpackage.x87.w(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x0117 }
            r9.i(r0)     // Catch:{ JSONException -> 0x0117 }
            goto L_0x0121
        L_0x0117:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r2 = "server.topology.send.alloc.consumer"
            r0.<init>(r2)
            r7.reportException(r6, r2, r0)
        L_0x0121:
            zla r0 = r1.F0
            boolean r0 = r0.E()
            if (r0 != 0) goto L_0x0177
            ocd r0 = r1.x0
            es9 r0 = r0.e
            r0.c = r3
            zla r0 = r1.F0
            boolean r0 = r0.E()
            if (r0 != 0) goto L_0x0177
            zla r0 = r1.F0
            fe1 r2 = r1.a
            boolean r2 = r2.d
            if (r2 == 0) goto L_0x0150
            izc r1 = r1.B0
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r1 = r1.x0
            r2.<init>(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            goto L_0x0154
        L_0x0150:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x0154:
            r0.y(r1)
            goto L_0x0177
        L_0x0158:
            r1.getClass()
            goto L_0x0177
        L_0x015c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "disable processing signaling replies in "
            r1.<init>(r2)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.V(r1)
            mfd r1 = r0.J0
            java.util.concurrent.CopyOnWriteArraySet r1 = r1.k
            r1.remove(r0)
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izc.G():void");
    }

    public final void K(ge1 ge1, w2d w2d, boolean z, sw0 sw0) {
        try {
            this.J0.h(x87.y(ge1, w2d, z), sw0);
        } catch (JSONException unused) {
            this.Y.reportException("ServerCallTopology", "server.topology.send.pinParticipant", new Exception("server.topology.send.pinParticipant"));
        }
    }

    public final void L() {
        V(this + " release");
        NetworkMonitor.getInstance().removeObserver(this);
        this.a.removeCallbacksAndMessages((Object) null);
        this.J0.k.remove(this);
        iue iue = this.M0;
        iue.j();
        iue.F0.p(true);
        super.L();
    }

    public final void M(long j, long j2) {
        bac bac = new bac(j, j2);
        ne0 ne0 = this.o.A.d;
        xwb xwb = this.Y;
        ne0.b(xwb, "ServerCallTopology", "send report-network-stat: " + bac);
        this.M0.F0.B().d(new bhc(new bhc((ahc) bac)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: cod} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N(defpackage.zwb r8) {
        /*
            r7 = this;
            java.util.List r0 = r8.c
            java.util.ArrayList r0 = gwf.y(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0071
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            cod r2 = (defpackage.cod) r2
            iw1 r8 = r8.c()
            if (r8 == 0) goto L_0x002a
            java.util.ArrayList r8 = gwf.P(r0, r8)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x002a
            java.lang.Object r8 = r8.get(r1)
            r2 = r8
            cod r2 = (defpackage.cod) r2
        L_0x002a:
            fe1 r8 = r7.o
            r8.getClass()
            long r0 = r2.o
            long r3 = r7.K0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x003f
            long r3 = r2.p
            long r5 = r7.L0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0071
        L_0x003f:
            long r2 = r2.p
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0071
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0071
            r7.K0 = r0
            r7.L0 = r2
            dac r8 = new dac
            r8.<init>(r2, r0)
            iue r0 = r7.M0
            zla r0 = r0.F0
            dhc r0 = r0.B()
            sic r1 = new sic
            r2 = 6
            r1.<init>(r2, r7)
            bhc r7 = new bhc
            r7.<init>((defpackage.ahc) r8)
            r7.c = r1
            bhc r8 = new bhc
            r8.<init>((defpackage.bhc) r7)
            r0.d(r8)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izc.N(zwb):void");
    }

    public final void O(boolean z) {
        this.M0.F0.B().d(new bhc(new bhc((ahc) new mac(z))));
        iue iue = this.M0;
        iue.J0 = z;
        iue.F0.y0 = iue.J0;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [tyf, java.lang.Runnable] */
    public final void P(zrd zrd) {
        iue iue = this.M0;
        if (iue.F0 != null) {
            zla zla = iue.F0;
            zla.getClass();
            zla.i("getStats.new", new tyf(zla, new mf3(3, zrd), 1));
        }
    }

    public final void R(xm1 xm1, List list) {
        iue iue = this.M0;
        if (iue.F0.E()) {
            ge1 ge1 = xm1.b;
            iue.F0.t1.p("video-" + ge1.c(), xm1, list);
        }
    }

    public final void T(List list) {
        S("updateDisplayLayouts, " + this);
        this.O0.a(list);
        this.N0.getClass();
        this.M0.k(oa2.C(list));
    }

    public final void U(ema ema) {
        iue iue = this.M0;
        iue.C0 = ema;
        if (iue.F0 != null) {
            iue.F0.I(iue.C0);
        }
    }

    public final void W() {
        this.M0.a();
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [tyf, java.lang.Runnable] */
    public final void a(mod mod) {
        iue iue = this.M0;
        x7f x7f = (x7f) mod.b;
        if (iue.F0 != null) {
            zla zla = iue.F0;
            zla.getClass();
            Integer valueOf = Integer.valueOf(x7f.c);
            nw3 nw3 = zla.s1;
            if (!x7f.equals((x7f) ((zzc) nw3.i).b.get(valueOf))) {
                zzc zzc = (zzc) nw3.i;
                zzc.getClass();
                zzc.b.put(Integer.valueOf(x7f.c), x7f);
                zla.O0.log("PCRTCClient", "updateVideoQuality, " + zla + " update=" + x7f);
                zla.i("updateVideoQuality", new tyf(zla, new sla(zla, 1, x7f), 1));
            }
        }
    }

    public final void j(cc9 cc9) {
        iue iue = this.M0;
        iue.F0.s(cc9);
        iue.M0 = cc9;
    }

    public final void k(JSONObject jSONObject) {
        String str;
        List list;
        String string = jSONObject.getString("notification");
        if ("producer-updated".equals(string)) {
            iue iue = this.M0;
            iue.getClass();
            iue.Y.log("UnifiedPeerConnection", "handleProducerUpdatedNotify, " + iue + " " + jSONObject);
            String string2 = jSONObject.getString("sessionId");
            if (!iue.I0 || !iue.L0.contains(string2)) {
                String string3 = jSONObject.getString("description");
                SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.OFFER, string3);
                Matcher matcher = iue.N0.matcher(string3);
                HashSet hashSet = iue.y0;
                hashSet.clear();
                while (matcher.find()) {
                    hashSet.add(matcher.group(1));
                }
                if (!iue.I0 || (str = iue.K0) == null || str.equals(string2)) {
                    if (iue.F0.q1 && iue.G0 != null) {
                        iue.Y.log("UnifiedPeerConnection", "producer is stable but offerForProducer exists");
                        iue.G0 = null;
                    }
                    if (iue.F0.q1) {
                        iue.Y.log("UnifiedPeerConnection", "set remote sdp=" + sessionDescription.type.canonicalForm() + " to " + iue.F0);
                        iue.F0.J(sessionDescription);
                    } else {
                        iue.Y.log("UnifiedPeerConnection", iue.F0 + " is NOT STABLE, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                        iue.G0 = sessionDescription;
                    }
                } else {
                    iue.L0.add(iue.K0);
                    iue.Y.log("UnifiedPeerConnection", iue.F0 + " is JUST RECREATED, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                    iue.G0 = sessionDescription;
                    iue.j();
                    iue.a();
                    if (iue.F0 != null) {
                        iue.F0.I(iue.C0);
                    }
                    iue.x0.e.c = false;
                    if (!iue.F0.E()) {
                        zla zla = iue.F0;
                        if (iue.a.d) {
                            izc izc = iue.B0;
                            izc.getClass();
                            list = Collections.unmodifiableList(new ArrayList(izc.x0));
                        } else {
                            list = Collections.emptyList();
                        }
                        zla.y(list);
                    }
                }
                iue.K0 = string2;
            } else {
                iue.Y.log("UnifiedPeerConnection", rf0.h("producer-updated contains expired sessionId: ", string2));
            }
            S("resendDisplayLayouts, " + this);
            List list2 = this.O0.c;
            this.N0.getClass();
            this.M0.k(oa2.C(list2));
            sg4 sg4 = this.O0;
            sg4.e = true;
            sg4.a(sg4.c);
        } else if ("consumer-answered".equals(string)) {
            this.M0.getClass();
        }
    }

    public final void onActiveParticipantUpdated(px0 px0) {
        onActiveParticipantsRemoved(new ox0(px0.a, Collections.emptyList()));
    }

    public final void onActiveParticipantsAdded(lx0 lx0) {
    }

    public final void onActiveParticipantsChanged(mx0 mx0) {
    }

    public final void onActiveParticipantsDeAnonimized(nx0 nx0) {
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [lzc, java.lang.Object] */
    public final void onActiveParticipantsRemoved(ox0 ox0) {
        S("onCallParticipantsRemoved, " + ox0.a.size());
        for (ke1 ke1 : ox0.a) {
            ge1 ge1 = ke1.a;
            if (ge1 != null) {
                iue iue = this.M0;
                if (iue.F0.E()) {
                    iue.F0.t1.e(ge1, "video-" + ge1.c());
                }
            }
            ge1 ge12 = ke1.a;
            if (ge12 != null) {
                sg4 sg4 = this.O0;
                Set<xm1> set = (Set) sg4.d.get(ge12);
                if (set == null) {
                    set = new HashSet<>();
                }
                it4 it4 = new it4();
                it4.a = ge12;
                it4.b = w8f.a;
                set.add(it4.a());
                it4 it42 = new it4();
                it42.a = ge12;
                it42.b = w8f.b;
                set.add(it42.a());
                ? obj = new Object();
                obj.a = true;
                ArrayList arrayList = new ArrayList();
                for (xm1 mzc : set) {
                    arrayList.add(new mzc(mzc, obj));
                }
                gve gve = new gve(arrayList, false);
                dhc B = ((iue) sg4.b).F0.B();
                rg4 rg4 = new rg4(sg4, 2);
                rg4 rg42 = new rg4(sg4, 3);
                bhc bhc = new bhc((ahc) gve);
                bhc.c = rg4;
                bhc.d = rg42;
                B.d(new bhc(bhc));
            }
        }
    }

    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        S("onConnectionTypeChanged, " + this + ", type=" + connectionType);
        if (NetworkMonitor.isOnline()) {
            this.a.post(new gzc(this, 0));
        }
    }

    public final Runnable w() {
        this.o.b.getClass();
        return new gzc(this, 1);
    }

    public final ane y() {
        return ane.c;
    }
}
