package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.webrtc.IceCandidate;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: ih4  reason: default package */
public final class ih4 extends sl1 implements lfd, yla, NetworkMonitor.NetworkObserver {
    public final bd4 H0;
    public final Context I0;
    public final mfd J0;
    public final pd4 K0;
    public final ocd L0;
    public final ExecutorService M0;
    public final HashMap N0 = new HashMap();
    public final HashMap O0 = new HashMap();
    public final HashMap P0 = new HashMap();
    public final ud Q0;
    public final HashMap R0 = new HashMap();
    public final HashMap S0 = new HashMap();
    public final gvf T0;
    public final eje U0;
    public final ihc V0;
    public final cia W0;
    public final gh4 X0 = new gh4(this, 1);
    public final boolean Y0;

    public ih4(hh4 hh4) {
        super(hh4.h, hh4.g, hh4.j, hh4.k, hh4.l, hh4.m, hh4.b, hh4.q, hh4.r, (onc) null);
        S(this + " ctor");
        this.T0 = hh4.o;
        this.U0 = hh4.t;
        this.Q0 = new ud(hh4.k);
        this.I0 = hh4.e;
        mfd mfd = hh4.i;
        this.J0 = mfd;
        this.L0 = hh4.a;
        this.M0 = hh4.d;
        this.K0 = hh4.c;
        this.Y0 = hh4.n;
        this.H0 = hh4.p;
        mfd.k.add(this);
        this.V0 = hh4.s;
        for (ke1 ke1 : this.z0.i()) {
            this.N0.put(ke1.a, X());
        }
        pe0 pe0 = this.o.A;
        ne0 ne0 = pe0.d;
        cia cia = this.W0;
        cia cia2 = null;
        if (cia != null) {
            cia.f.invoke("stop reporter");
            c97 c97 = cia.g;
            if (c97 != null) {
                bj4.a(c97);
            }
            cia.g = null;
            cia.h = null;
        }
        xwb xwb = this.Y;
        gw2 gw2 = new gw2(8, this);
        ka kaVar = new ka(this, 13, ne0);
        cac cac = pe0.b;
        if (cac != null) {
            av3 av3 = new av3(pe0, 2, xwb);
            iw0 iw0 = pe0.a;
            cia2 = new cia(cac, iw0 != null ? new yha(iw0, av3) : new mk9(14), xwb, gw2, kaVar, av3);
        }
        this.W0 = cia2;
        if (cia2 != null) {
            qmc a = de.a();
            cia2.f.invoke("start reporter");
            c97 c972 = cia2.g;
            if (c972 != null) {
                bj4.a(c972);
            }
            cia2.h = a;
            nu9 n = ms9.l((long) cia2.a.b, TimeUnit.MILLISECONDS).n(a);
            uxf uxf = new uxf(cia2, 0);
            uxf uxf2 = new uxf(cia2, 1);
            c97 c973 = new c97(new k2e(cia2), new fte(cia2), z3d.i);
            Objects.requireNonNull(c973, "observer is null");
            try {
                st9 st9 = new st9(c973, uxf2, 1);
                Objects.requireNonNull(st9, "observer is null");
                n.a(new zt9(st9, uxf, 1));
                cia2.g = c973;
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                ek8.a0(th);
                xs7.F(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
        NetworkMonitor.getInstance().addObserver(this);
    }

    public static ge1 W(zla zla, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() == zla) {
                return (ge1) entry.getKey();
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [tyf, java.lang.Runnable] */
    public final void C(jsd jsd) {
        d59.e();
        for (Map.Entry entry : this.O0.entrySet()) {
            zla zla = (zla) entry.getValue();
            xz xzVar = new xz((Object) this, (Object) (ge1) entry.getKey(), (Object) jsd, 7);
            zla.getClass();
            zla.i("getStats.legacy", new tyf(zla, new sla(zla, 2, xzVar), 1));
        }
    }

    public final String D() {
        return "DirectCallTopology";
    }

    public final void E(ge1 ge1, List list, boolean z, rw0 rw0) {
        try {
            this.J0.h(x87.x(ge1, list, z), rw0);
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.grantRoles", new Exception("direct.topology.send.grantRoles"));
        }
    }

    public final void F() {
        v("handleIceApplyPermissionChanged, " + this + ", isPermitted=true");
        ud udVar = this.Q0;
        udVar.b = true;
        if (I()) {
            for (Map.Entry entry : this.O0.entrySet()) {
                ke1 z = z((ge1) entry.getKey());
                if (z != null) {
                    udVar.g(z, (zla) entry.getValue());
                }
            }
        }
    }

    public final void G() {
        StringBuilder sb = new StringBuilder("handleStateChanged, ");
        sb.append(this);
        sb.append(", state=");
        String B = sl1.B(1);
        sb.append(B);
        S(sb.toString());
        boolean I = I();
        mfd mfd = this.J0;
        if (I) {
            this.Y.log("DirectCallTopology", "enable processing signaling replies in " + B + " state");
            mfd.k.add(this);
            U(this.F0);
        } else {
            V("disable processing signaling replies in " + B + " state");
            mfd.k.remove(this);
        }
        a0();
    }

    public final void K(ge1 ge1, w2d w2d, boolean z, sw0 sw0) {
        try {
            this.J0.h(x87.y(ge1, w2d, z), sw0);
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.pinParticipant", new Exception("direct.topology.send.pinParticipant"));
        }
    }

    public final void L() {
        V(this + " release");
        NetworkMonitor.getInstance().removeObserver(this);
        this.a.removeCallbacksAndMessages((Object) null);
        this.J0.k.remove(this);
        HashMap hashMap = this.N0;
        for (zla zla : hashMap.values()) {
            zla.d1 = null;
            zla.p(true);
        }
        HashMap hashMap2 = this.O0;
        for (zla zla2 : hashMap2.values()) {
            zla2.d1 = null;
            zla2.p(true);
        }
        hashMap.clear();
        hashMap2.clear();
        this.P0.clear();
        ((HashMap) this.Q0.c).clear();
        this.R0.clear();
        this.S0.clear();
        cia cia = this.W0;
        if (cia != null) {
            cia.f.invoke("stop reporter");
            c97 c97 = cia.g;
            if (c97 != null) {
                bj4.a(c97);
            }
            cia.g = null;
            cia.h = null;
        }
        super.L();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [tyf, java.lang.Runnable] */
    public final void P(zrd zrd) {
        d59.e();
        for (Map.Entry value : this.O0.entrySet()) {
            zla zla = (zla) value.getValue();
            zla.getClass();
            zla.i("getStats.new", new tyf(zla, new mf3(3, zrd), 1));
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [tyf, java.lang.Runnable] */
    public final void Q(List list) {
        S("setIceServers, " + this);
        super.Q(list);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(this.x0));
        for (zla zla : this.O0.values()) {
            zla.getClass();
            zla.O0.log("PCRTCClient", "setConfig, servers=" + unmodifiableList + ", " + zla);
            zla.i("setConfig", new tyf(zla, new sla(zla, 4, unmodifiableList), 1));
        }
    }

    public final void R(xm1 xm1, List list) {
        S("setRemoteVideoRenderers, " + this + ", " + xm1);
        d59.e();
        zla zla = (zla) this.O0.get(xm1.b);
        if (zla == null) {
            V("peer connection not found for " + xm1);
            return;
        }
        String str = (String) this.P0.get(xm1.b);
        if (TextUtils.isEmpty(str)) {
            V(this + ": video track not found for " + xm1);
            return;
        }
        zla.t1.p(str, xm1, list);
    }

    public final void U(ema ema) {
        for (Map.Entry value : this.O0.entrySet()) {
            zla zla = (zla) value.getValue();
            if (zla != null) {
                zla.I(ema);
                return;
            }
        }
    }

    public final zla X() {
        bma bma;
        v("> createPeerConnectionClient, " + this);
        xla xla = new xla();
        xla.a = this.L0;
        xla.b = this.w0;
        xla.c = this.M0;
        xla.e = this.I0;
        xla.q = 0;
        xla.f = this.X;
        xla.g = this.Y;
        fe1 fe1 = this.o;
        xla.d = fe1;
        xla.r = this.Y0;
        xla.w = this.T0;
        xla.n = fe1.p;
        xla.o = fe1.q;
        xla.p = fe1.r;
        xla.t = zla.A().a;
        cma A = zla.A();
        boolean z = true;
        if (!A.i && ((bma = A.j) == null || !bma.a)) {
            z = false;
        }
        xla.u = z;
        xla.v = fe1.B.g;
        bd4 bd4 = this.H0;
        h2d h2d = (h2d) bd4.o;
        xla.y = new ni(bd4, h2d);
        xla.x = new kj(bd4, h2d, (Integer) null);
        ((bi) bd4.c).getClass();
        xla.z = 4;
        xla.B = false;
        xla.C = this.U0;
        xla.D = this.G0;
        zla a = xla.a();
        a.d1 = this;
        a.Z0 = null;
        a.a1 = false;
        a.e1 = null;
        a.f1 = null;
        a.g1 = null;
        a.i1 = null;
        a.i("createPeerConnectionFactoryInternal", new ola(a, 2));
        v("< createPeerConnectionClient, " + this);
        return a;
    }

    public final void Y(ke1 ke1) {
        S("maybeProcessRemoteAnswers, for " + ke1);
        if (!ke1.b()) {
            V(ke1 + " still not accepted call");
            return;
        }
        vwf vwf = (vwf) this.S0.get(ke1.a);
        if (vwf != null && vwf.e) {
            HashMap hashMap = vwf.a;
            SessionDescription sessionDescription = (SessionDescription) hashMap.get(ke1.j);
            if (sessionDescription != null) {
                StringBuilder sb = new StringBuilder("Found answer for ");
                sb.append(ke1);
                sb.append(", peerid=");
                this.Y.log("DirectCallTopology", wn6.l(sb, (String) ke1.j.a, ", apply it"));
                vwf.c = sessionDescription;
                hashMap.clear();
                ((zla) this.O0.get(ke1.a)).J(sessionDescription);
            }
        }
    }

    public final void Z(zla zla, PeerConnection.IceConnectionState iceConnectionState) {
        S("maybeRestart, " + this);
        if (!I()) {
            V(this + ": is not active yet");
        } else if (!NetworkMonitor.isOnline()) {
            V("No net connectivity");
        } else if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
            v(zla + " has " + iceConnectionState + " state");
            if (!zla.E() || !zla.q1) {
                V(zla + " not ready or not stable");
                return;
            }
            vwf vwf = (vwf) this.S0.get(W(zla, this.O0));
            if (vwf != null && !vwf.d) {
                V("Ice failed, restart " + zla);
                vwf.d = true;
                vwf.e = false;
                vwf.c = null;
                vwf.a.clear();
                zla.x(true);
            }
        }
    }

    public final void a0() {
        S("maybeCreateConnection, " + this);
        if (!I()) {
            this.Y.log("DirectCallTopology", this + ": is not active yet");
            return;
        }
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(this.x0));
        for (zla zla : this.N0.values()) {
            if (!zla.E() && !zla.n1) {
                zla.y(unmodifiableList);
            }
        }
        c0();
        b0();
    }

    public final void b(zla zla, SessionDescription sessionDescription) {
        S("onPeerConnectionRemoteDescription, " + this + ", type=" + sessionDescription.type + ", " + zla);
        ge1 W = W(zla, this.O0);
        if (sessionDescription.type == SessionDescription.Type.OFFER && this.R0.get(W) != null) {
            zla.w();
        }
    }

    public final void b0() {
        zla zla;
        S("maybeProcessSelfAnswers");
        if (!I()) {
            V(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.R0.entrySet()) {
            ge1 ge1 = (ge1) entry.getKey();
            vwf vwf = (vwf) entry.getValue();
            if (vwf.b == null) {
                throw new IllegalStateException("Offer not found for participant=" + ge1);
            } else if (!vwf.d && !vwf.e && (zla = (zla) this.O0.get(ge1)) != null) {
                this.Y.log("DirectCallTopology", this + ": start processing scheduled answer for participant=" + ge1);
                vwf.d = true;
                zla.J(vwf.b);
            }
        }
    }

    public final void c(zla zla) {
        S("onPeerConnectionRenegotiationNeeded, " + this + ", " + zla);
    }

    public final void c0() {
        zla zla;
        S("maybeProcessSelfOffers");
        if (!I()) {
            V(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.S0.entrySet()) {
            ge1 ge1 = (ge1) entry.getKey();
            vwf vwf = (vwf) entry.getValue();
            if (!vwf.d && !vwf.e && (zla = (zla) this.O0.get(ge1)) != null) {
                this.Y.log("DirectCallTopology", this + ": start processing scheduled offer for participant=" + ge1);
                vwf.d = true;
                vwf.a.clear();
                vwf.c = null;
                zla.x(false);
            }
        }
    }

    public final void d(zla zla) {
        rl1 rl1;
        S("onPeerConnectionCreated, " + this + ", " + zla);
        HashMap hashMap = this.N0;
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() == zla) {
                hashMap.remove(entry.getKey());
                if (this.F0 != null) {
                    ((zla) entry.getValue()).I(this.F0);
                }
                this.O0.put((ge1) entry.getKey(), (zla) entry.getValue());
            }
        }
        a0();
        if (hashMap.size() == 0 && (rl1 = this.C0) != null) {
            ((gx0) rl1).z(this);
        }
    }

    public final void e() {
        this.Y.logException("DirectCallTopology", "direct.topology.create.sdp.failed", new Exception("direct.topology.create.sdp.failed"));
    }

    public final void f(String str) {
    }

    public final void g() {
        this.Y.logException("DirectCallTopology", "direct.topology.set.sdp.failed", new Exception("direct.topology.set.sdp.failed"));
    }

    public final void h(zla zla, String str) {
        ge1 ge1;
        S("onPeerConnectionRemoteVideoTrackAdded, " + this + ", track=" + str + ", " + zla);
        ke1 z = z(W(zla, this.O0));
        if (z == null || (ge1 = z.a) == null) {
            V(this + ": participant not found for " + d59.c(zla));
            return;
        }
        this.P0.put(ge1, str);
        ge1 ge12 = z.a;
        pd4 pd4 = this.K0;
        if (pd4.isEnabled()) {
            Map remoteVideoRenderers = pd4.getRemoteVideoRenderers(ge12);
            for (xm1 xm1 : remoteVideoRenderers.keySet()) {
                List list = (List) remoteVideoRenderers.get(xm1);
                if (list != null) {
                    zla.t1.p(str, xm1, list);
                }
            }
        }
    }

    public final void i(zla zla, IceCandidate[] iceCandidateArr) {
        S("onPeerConnectionIceCandidatesRemoved, " + this + ", " + zla);
        ge1 W = W(zla, this.O0);
        StringBuilder sb = new StringBuilder("sendRemovedIceCandidatesRequest, participant=");
        sb.append(W);
        S(sb.toString());
        try {
            this.J0.i(x87.A(W, iceCandidateArr));
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.remove.ice", new Exception("direct.topology.create.remove.ice.request"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(org.json.JSONObject r15) {
        /*
            r14 = this;
            java.lang.String r0 = "notification"
            java.lang.String r0 = r15.getString(r0)
            r0.getClass()
            java.lang.String r1 = "custom-data"
            boolean r1 = r0.equals(r1)
            java.lang.String r2 = "type"
            r3 = 0
            java.lang.String r4 = "data"
            java.lang.String r5 = "DirectCallTopology"
            if (r1 != 0) goto L_0x01e0
            java.lang.String r1 = "transmitted-data"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0022
            goto L_0x0273
        L_0x0022:
            ge1 r0 = defpackage.x87.J(r15)
            ke1 r1 = r14.z(r0)
            if (r1 != 0) goto L_0x003c
            xwb r14 = r14.Y
            java.lang.Exception r15 = new java.lang.Exception
            java.lang.String r0 = "td.unknown.participant.in.p2p"
            r15.<init>(r0)
            java.lang.String r0 = "transmitted.data.npe"
            r14.reportException(r5, r0, r15)
            goto L_0x0273
        L_0x003c:
            org.json.JSONObject r6 = r15.getJSONObject(r4)
            java.lang.String r7 = "sdp"
            org.json.JSONObject r6 = r6.optJSONObject(r7)
            r8 = 0
            if (r6 == 0) goto L_0x005b
            org.webrtc.SessionDescription r9 = new org.webrtc.SessionDescription
            java.lang.String r2 = r6.getString(r2)
            org.webrtc.SessionDescription$Type r2 = org.webrtc.SessionDescription.Type.fromCanonicalForm(r2)
            java.lang.String r6 = r6.getString(r7)
            r9.<init>(r2, r6)
            goto L_0x005c
        L_0x005b:
            r9 = r8
        L_0x005c:
            if (r9 == 0) goto L_0x00f8
            org.webrtc.SessionDescription$Type r2 = r9.type
            org.webrtc.SessionDescription$Type r3 = org.webrtc.SessionDescription.Type.ANSWER
            if (r2 != r3) goto L_0x0273
            java.util.HashMap r2 = r14.S0
            java.lang.Object r2 = r2.get(r0)
            vwf r2 = (defpackage.vwf) r2
            if (r2 != 0) goto L_0x0094
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "no.scheduled.offer.found"
            r15.<init>(r1)
            java.util.HashMap r1 = r14.R0
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = ".but.answer.found"
            r15.append(r0)
        L_0x0082:
            xwb r14 = r14.Y
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r15 = r15.toString()
            r0.<init>(r15)
            java.lang.String r15 = "answer.invariant"
            r14.logException(r5, r15, r0)
            goto L_0x0273
        L_0x0094:
            boolean r0 = r2.e
            if (r0 != 0) goto L_0x00a8
            xwb r14 = r14.Y
            java.lang.Exception r15 = new java.lang.Exception
            java.lang.String r0 = "offer.is.not.ready.yet"
            r15.<init>(r0)
            java.lang.String r0 = "direct.topology.no.offer.for.answer"
            r14.logException(r5, r0, r15)
            goto L_0x0273
        L_0x00a8:
            org.webrtc.SessionDescription r0 = r2.c
            if (r0 != 0) goto L_0x00e3
            wia r0 = defpackage.x87.t(r15)
            if (r0 == 0) goto L_0x00bc
            java.util.HashMap r15 = r2.a
            r15.put(r0, r9)
            r14.Y(r1)
            goto L_0x0273
        L_0x00bc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sdp="
            r0.<init>(r1)
            java.lang.String r15 = r15.toString()
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            xwb r0 = r14.Y
            r0.log(r5, r15)
            xwb r14 = r14.Y
            java.lang.Exception r15 = new java.lang.Exception
            java.lang.String r0 = "bad.sdp.answer.from.participant"
            r15.<init>(r0)
            java.lang.String r0 = "direct.topology.bad.sdp"
            r14.logException(r5, r0, r15)
            goto L_0x0273
        L_0x00e3:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Answer was already applied from "
            r15.<init>(r0)
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            xwb r14 = r14.Y
            r14.log(r5, r15)
            goto L_0x0273
        L_0x00f8:
            ud r2 = r14.Q0
            java.util.HashMap r14 = r14.O0
            java.lang.Object r14 = r14.get(r0)
            zla r14 = (defpackage.zla) r14
            java.lang.Object r0 = r2.o
            xwb r0 = (defpackage.xwb) r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "handleTransmittedData, "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "IceCandidatesHandler"
            r0.log(r6, r5)
            wia r0 = defpackage.x87.t(r15)
            if (r0 != 0) goto L_0x0136
            java.lang.Object r14 = r2.o
            xwb r14 = (defpackage.xwb) r14
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "No peer specified for "
            r15.<init>(r0)
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            r14.log(r6, r15)
            goto L_0x0273
        L_0x0136:
            org.json.JSONObject r15 = r15.getJSONObject(r4)
            java.lang.String r4 = "candidate"
            org.json.JSONObject r5 = r15.optJSONObject(r4)
            java.lang.String r6 = "sdpMLineIndex"
            java.lang.String r7 = "sdpMid"
            if (r5 == 0) goto L_0x0158
            org.webrtc.IceCandidate r9 = new org.webrtc.IceCandidate
            java.lang.String r10 = r5.getString(r7)
            int r11 = r5.getInt(r6)
            java.lang.String r5 = r5.getString(r4)
            r9.<init>(r10, r11, r5)
            goto L_0x0159
        L_0x0158:
            r9 = r8
        L_0x0159:
            java.lang.String r5 = "candidates-removed"
            org.json.JSONArray r15 = r15.optJSONArray(r5)
            if (r15 != 0) goto L_0x0162
            goto L_0x0191
        L_0x0162:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r10 = r15.length()
            r5.<init>(r10)
        L_0x016b:
            int r10 = r15.length()
            if (r3 >= r10) goto L_0x0190
            org.json.JSONObject r10 = r15.getJSONObject(r3)
            if (r10 == 0) goto L_0x0189
            org.webrtc.IceCandidate r11 = new org.webrtc.IceCandidate
            java.lang.String r12 = r10.getString(r7)
            int r13 = r10.getInt(r6)
            java.lang.String r10 = r10.getString(r4)
            r11.<init>(r12, r13, r10)
            goto L_0x018a
        L_0x0189:
            r11 = r8
        L_0x018a:
            r5.add(r11)
            int r3 = r3 + 1
            goto L_0x016b
        L_0x0190:
            r8 = r5
        L_0x0191:
            if (r9 != 0) goto L_0x0197
            if (r8 != 0) goto L_0x0197
            goto L_0x0273
        L_0x0197:
            java.lang.Object r15 = r2.c
            java.util.HashMap r15 = (java.util.HashMap) r15
            java.lang.Object r15 = r15.get(r1)
            java.util.Map r15 = (java.util.Map) r15
            if (r15 != 0) goto L_0x01af
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            java.lang.Object r3 = r2.c
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r1, r15)
        L_0x01af:
            java.lang.Object r3 = r15.get(r0)
            wia r3 = (wia) r3
            if (r3 != 0) goto L_0x01c9
            wia r3 = new wia
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.<init>(r4, r5)
            r15.put(r0, r3)
        L_0x01c9:
            if (r9 == 0) goto L_0x01d2
            java.lang.Object r15 = r3.a
            java.util.List r15 = (java.util.List) r15
            r15.add(r9)
        L_0x01d2:
            if (r8 == 0) goto L_0x01db
            java.lang.Object r15 = r3.b
            java.util.List r15 = (java.util.List) r15
            r15.addAll(r8)
        L_0x01db:
            r2.g(r1, r14)
            goto L_0x0273
        L_0x01e0:
            fe1 r0 = r14.o
            pe0 r0 = r0.A
            ne0 r1 = r0.d
            oe0 r0 = r0.c
            boolean r0 = r0.a
            cia r6 = r14.W0
            if (r0 == 0) goto L_0x0247
            if (r6 == 0) goto L_0x0247
            org.json.JSONObject r15 = r15.optJSONObject(r4)
            if (r15 == 0) goto L_0x0244
            java.lang.String r0 = "sdk"
            org.json.JSONObject r15 = r15.optJSONObject(r0)
            if (r15 == 0) goto L_0x0241
            java.lang.String r0 = r15.optString(r2)
            java.lang.String r2 = "bad-net"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x023e
            java.lang.String r0 = "bitrate"
            double r2 = r15.optDouble(r0)
            u16 r0 = r6.f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "submit bitrate: "
            r4.<init>(r7)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r0.invoke(r4)
            qmc r0 = r6.h
            if (r0 == 0) goto L_0x022f
            zha r4 = new zha
            r4.<init>(r6, r2)
            r0.b(r4)
        L_0x022f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "received bad-net: "
            r0.<init>(r2)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            goto L_0x0260
        L_0x023e:
            java.lang.String r15 = "type != bad-net"
            goto L_0x0260
        L_0x0241:
            java.lang.String r15 = "no sdk"
            goto L_0x0260
        L_0x0244:
            java.lang.String r15 = "no data"
            goto L_0x0260
        L_0x0247:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = "enabled && reporter != null = "
            r15.<init>(r2)
            r15.append(r0)
            java.lang.String r0 = " && "
            r15.append(r0)
            if (r6 == 0) goto L_0x0259
            r3 = 1
        L_0x0259:
            r15.append(r3)
            java.lang.String r15 = r15.toString()
        L_0x0260:
            xwb r14 = r14.Y
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "handleCustomDataNotification: "
            r0.<init>(r2)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r1.b(r14, r5, r15)
        L_0x0273:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih4.k(org.json.JSONObject):void");
    }

    public final void l(zla zla, PeerConnection.SignalingState signalingState) {
        S("onPeerConnectionSignalingState, " + this + " state=" + signalingState + ", " + zla);
        if (signalingState == PeerConnection.SignalingState.STABLE) {
            Z(zla, zla.C());
        }
        ke1 z = z(W(zla, this.O0));
        if (z != null) {
            this.Q0.g(z, zla);
        }
    }

    public final void m(zla zla, IceCandidate iceCandidate) {
        S("onPeerConnectionIceCandidate, " + this + ", " + zla);
        ge1 W = W(zla, this.O0);
        S("sendIceCandidateRequest, participant=" + W + ", candidate=" + iceCandidate);
        try {
            this.J0.i(x87.z(W, iceCandidate));
        } catch (JSONException unused) {
            this.Y.logException("DirectCallTopology", "direct.topology.send.add.ice", new Exception("direct.topology.create.add.ice.request"));
        }
    }

    public final void n(zla zla, SessionDescription sessionDescription) {
        rl1 rl1;
        S("onPeerConnectionLocalDescription, " + this + ", type=" + sessionDescription.type + ", " + zla);
        ge1 W = W(zla, this.O0);
        ke1 z = z(W);
        if (z == null) {
            this.Y.logException("DirectCallTopology", "local.sdp.npe", new Exception("set.local.sdp.for.died.participant"));
            return;
        }
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type == type2) {
            vwf vwf = (vwf) this.S0.get(W);
            if (vwf != null) {
                vwf.d = false;
                vwf.e = true;
            } else {
                throw new IllegalStateException();
            }
        } else {
            vwf vwf2 = (vwf) this.R0.get(W);
            if (vwf2 != null) {
                vwf2.d = false;
                vwf2.e = true;
            } else {
                throw new IllegalStateException();
            }
        }
        S("sendOfferAnswerRequest, participant=" + W + ", sdp type=" + sessionDescription.type.canonicalForm());
        try {
            this.J0.i(x87.d(x87.o(W, sessionDescription), "transmit-data"));
            if (sessionDescription.type == type2 && (rl1 = this.C0) != null) {
                ((gx0) rl1).Z0.log("OKRTCCall", "handleTopologyOfferCreated, " + this + ", " + z + ", sdp=" + sessionDescription.type);
            }
        } catch (JSONException e) {
            throw new RuntimeException("sdp " + sessionDescription.type + " " + sessionDescription.description, e);
        }
    }

    public final void o(zla zla, PeerConnection.IceConnectionState iceConnectionState) {
        Runnable runnable;
        S("onPeerConnectionIceConnectionChange, " + this + ", state=" + iceConnectionState + ", " + zla);
        Z(zla, iceConnectionState);
        rl1 rl1 = this.C0;
        if (rl1 != null) {
            ((gx0) rl1).A(this, iceConnectionState);
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED && (runnable = this.c) != null) {
            this.a.removeCallbacks(runnable);
        }
    }

    public final void onActiveParticipantUpdated(px0 px0) {
        onActiveParticipantsRemoved(new ox0(px0.a, Collections.emptyList()));
        Collection collection = px0.b;
        onActiveParticipantsAdded(new lx0(collection, collection));
    }

    public final void onActiveParticipantsAdded(lx0 lx0) {
        StringBuilder sb = new StringBuilder("onCallParticipantsAdded, ");
        sb.append(this);
        sb.append(", ");
        Collection<ke1> collection = lx0.a;
        sb.append(collection.size());
        S(sb.toString());
        for (ke1 ke1 : collection) {
            HashMap hashMap = this.N0;
            if (hashMap.get(ke1.a) == null && this.O0.get(ke1.a) == null) {
                hashMap.put(ke1.a, X());
            } else {
                throw new IllegalStateException("Peer connection is already created for " + ke1);
            }
        }
        a0();
    }

    public final void onActiveParticipantsChanged(mx0 mx0) {
        StringBuilder sb = new StringBuilder("onCallParticipantsChanged, ");
        Collection<ke1> collection = mx0.a;
        sb.append(collection.size());
        S(sb.toString());
        for (ke1 ke1 : collection) {
            zla zla = (zla) this.O0.get(ke1.a);
            if (zla != null) {
                Y(ke1);
                this.Q0.g(ke1, zla);
            }
        }
    }

    public final void onActiveParticipantsDeAnonimized(nx0 nx0) {
    }

    public final void onActiveParticipantsRemoved(ox0 ox0) {
        StringBuilder sb = new StringBuilder("onCallParticipantsRemoved, ");
        sb.append(this);
        sb.append(", ");
        Collection<ke1> collection = ox0.a;
        sb.append(collection.size());
        S(sb.toString());
        for (ke1 ke1 : collection) {
            zla zla = (zla) this.N0.remove(ke1.a);
            if (zla == null) {
                zla = (zla) this.O0.remove(ke1.a);
            }
            if (zla != null) {
                zla.d1 = null;
                zla.p(true);
            }
            this.P0.remove(ke1.a);
            this.R0.remove(ke1.a);
            this.S0.remove(ke1.a);
            ((HashMap) this.Q0.c).remove(ke1);
        }
    }

    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        S("onConnectionTypeChanged, " + this + ", type=" + connectionType);
        this.a.post(new gh4(this, 0));
    }

    public final void p(zla zla, long j) {
        ge1 W = W(zla, this.N0);
        if (W == null) {
            W = W(zla, this.O0);
        }
        if (W != null) {
            ke1 z = z(W);
            rl1 rl1 = this.C0;
            if (rl1 != null && z != null) {
                ((gx0) rl1).a2.b.onCallParticipantFingerprint(z, j);
            }
        }
    }

    public final void r(zla zla) {
        sh5 sh5 = this.Z;
        if (sh5 != null && !sh5.f.b && !sh5.d.b && !sh5.e.b) {
            P(new ql1(sh5));
        }
    }

    public final void s() {
        S("clearRemoteVideoRenderers");
        d59.e();
        for (zla zla : this.O0.values()) {
            zla.t1.d();
        }
    }

    public final void t(ge1 ge1, SessionDescription sessionDescription) {
        v("createAnswerFor, " + this + ", participant=" + ge1 + ", " + sessionDescription.type);
        d59.e();
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type == type2) {
            ke1 z = z(ge1);
            if (z != null) {
                HashMap hashMap = this.S0;
                vwf vwf = (vwf) hashMap.get(ge1);
                xwb xwb = this.Y;
                if (vwf != null) {
                    if (vwf.e) {
                        xwb.log("DirectCallTopology", "Opponent " + ge1 + " is requesting for renegotiation, let us accept the request, ");
                        hashMap.remove(ge1);
                    } else {
                        xwb.log("DirectCallTopology", this + ": unexpected offer (is concurrent call?) from " + z);
                        return;
                    }
                }
                HashMap hashMap2 = this.R0;
                vwf vwf2 = (vwf) hashMap2.get(ge1);
                if (vwf2 != null) {
                    SessionDescription sessionDescription2 = vwf2.b;
                    if (TextUtils.equals(sessionDescription2 != null ? sessionDescription2.description : "", sessionDescription.description)) {
                        xwb.reportException("DirectCallTopology", "answer.scheduled", new Exception("answer.creation.already.scheduled"));
                        return;
                    } else if (!vwf2.d) {
                        V(this + ": re-schedule answer creation for " + z);
                        hashMap2.remove(ge1);
                    } else {
                        xwb.reportException("DirectCallTopology", "repeated.answer", new Exception("repeated.answer.creation"));
                        return;
                    }
                }
                hashMap2.put(ge1, new vwf(sessionDescription));
                b0();
                return;
            }
            throw new IllegalStateException("Participant(" + ge1 + ") not found");
        }
        throw new IllegalArgumentException(type2 + " expected, but " + sessionDescription.type + " specified");
    }

    public final void u(ke1 ke1, boolean z) {
        S("createOfferFor, " + this + ", " + ke1);
        d59.e();
        if (this.z0.k(ke1)) {
            HashMap hashMap = this.S0;
            vwf vwf = (vwf) hashMap.get(ke1.a);
            if (vwf == null) {
                hashMap.put(ke1.a, new vwf((SessionDescription) null));
            } else if (vwf.d) {
                this.Y.reportException("DirectCallTopology", "offer.scheduled", new Exception("offer.creation.already.scheduled"));
            } else if (z) {
                V(this + ": re-schedule offer creation for " + ke1);
                vwf.e = false;
            } else {
                V(this + ": offer already created for " + ke1);
            }
            c0();
            return;
        }
        throw new IllegalStateException("Participant not found");
    }

    public final Runnable w() {
        return this.X0;
    }

    public final long x() {
        d59.e();
        Iterator it = this.O0.values().iterator();
        if (it.hasNext()) {
            return ((zla) it.next()).Y0;
        }
        return -1;
    }

    public final ane y() {
        return ane.b;
    }
}
