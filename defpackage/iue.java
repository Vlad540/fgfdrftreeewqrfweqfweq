package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: iue  reason: default package */
public final class iue implements dma, yla {
    public static final Pattern N0 = Pattern.compile("a=ssrc:(\\d+)");
    public final bd4 A0;
    public final izc B0;
    public ema C0;
    public final boolean D0;
    public final xla E0;
    public volatile zla F0;
    public SessionDescription G0;
    public boolean H0;
    public final boolean I0;
    public boolean J0;
    public String K0;
    public final CopyOnWriteArraySet L0;
    public cc9 M0;
    public final axb X;
    public final xwb Y;
    public final mfd Z;
    public final fe1 a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList o;
    public final c2b w0;
    public final ocd x0;
    public final HashSet y0 = new HashSet();
    public final mv4 z0;

    public iue(hzc hzc, izc izc) {
        fe1 fe1 = hzc.m;
        this.a = fe1;
        this.b = hzc.j;
        this.c = hzc.k;
        this.o = hzc.l;
        this.B0 = izc;
        axb axb = hzc.p;
        this.X = axb;
        xwb xwb = hzc.o;
        this.Y = xwb;
        this.Z = hzc.i;
        this.w0 = hzc.r;
        ocd ocd = hzc.a;
        this.x0 = ocd;
        this.A0 = hzc.u;
        this.z0 = hzc.n;
        this.L0 = new CopyOnWriteArraySet();
        this.D0 = hzc.s;
        fe1 fe12 = hzc.m;
        this.I0 = fe12.m;
        xla xla = new xla();
        xla.a = ocd;
        xla.b = hzc.b;
        xla.q = 0;
        xla.c = hzc.d;
        xla.e = hzc.e;
        xla.f = axb;
        xla.g = xwb;
        xla.h = true;
        xla.i = true;
        xla.d = fe1;
        xla.j = fe1.h;
        xla.m = fe1.i;
        xla.s = fe1.g > 0;
        xla.w = hzc.t;
        xla.n = fe12.p;
        xla.o = fe12.q;
        xla.p = fe12.r;
        bd4 bd4 = hzc.u;
        xla.x = new kj(bd4, (h2d) bd4.o, 2);
        bd4 bd42 = hzc.u;
        xla.y = new ni(bd42, (h2d) bd42.o);
        xla.z = 1;
        xla.v = fe1.B.g;
        xla.u = false;
        xla.t = zla.A().b;
        xla.A = hzc.x;
        xla.k = hzc.m.x;
        xla.B = hzc.y;
        xla.C = hzc.z;
        xla.D = hzc.A;
        this.E0 = xla;
        a();
        if (this.F0 != null) {
            this.F0.I(this.C0);
        }
    }

    public final void a() {
        xla xla = this.E0;
        xla.l = this.J0;
        this.F0 = xla.a();
        this.F0.d1 = this;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ehc ehc = (ehc) it.next();
            jj7 jj7 = this.F0.B().n;
            if (ehc != null) {
                ((CopyOnWriteArrayList) jj7.b).add(ehc);
            } else {
                jj7.getClass();
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ihc ihc = (ihc) it2.next();
            km4 km4 = this.F0.T0;
            if (km4 == null) {
                throw new IllegalStateException("Notifications receiver is not enabled");
            } else if (ihc != null) {
                ((CopyOnWriteArrayList) km4.a).add(ihc);
            } else {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it3 = this.o.iterator();
        while (it3.hasNext()) {
            ow0 ow0 = (ow0) it3.next();
            if (this.F0.c != null) {
                ((CopyOnWriteArrayList) this.F0.c.X).add(ow0);
            }
        }
        zla zla = this.F0;
        zla.Z0 = null;
        zla.a1 = false;
        zla.e1 = null;
        zla.f1 = null;
        zla.g1 = null;
        zla.i1 = null;
        zla.i("createPeerConnectionFactoryInternal", new ola(zla, 2));
    }

    public final void b(zla zla, SessionDescription sessionDescription) {
        if (sessionDescription.type != SessionDescription.Type.OFFER) {
            return;
        }
        if (!zla.q1) {
            this.F0.w();
            return;
        }
        throw new IllegalStateException();
    }

    public final void c(zla zla) {
        this.Y.log("UnifiedPeerConnection", "onPeerConnectionRenegotiationNeeded, " + zla);
    }

    public final void d(zla zla) {
        if (this.F0.E()) {
            izc izc = this.B0;
            izc.getClass();
            izc.S("resendDisplayLayouts, " + izc);
            sg4 sg4 = izc.O0;
            List list = sg4.c;
            izc.N0.getClass();
            izc.M0.k(oa2.C(list));
            sg4.e = true;
            sg4.a(sg4.c);
            rl1 rl1 = izc.C0;
            if (rl1 != null) {
                ((gx0) rl1).z(izc);
            }
        }
        if (this.F0.q1 && this.G0 != null) {
            this.Y.log("UnifiedPeerConnection", "apply postponed remote sdp=" + this.G0.type.canonicalForm() + " to just created " + zla);
            this.F0.J(this.G0);
            this.G0 = null;
        }
        this.F0.s(this.M0);
    }

    public final void e() {
        this.Y.reportException("PeerConnectionWrapperBase", "server.topology.create.sdp", new Exception("server.topology.create.sdp"));
    }

    public final void f(String str) {
        this.Y.log("UnifiedPeerConnection", "audio-mix enabled");
        izc izc = this.B0;
        izc.getClass();
        if (str != null && str.endsWith("audio-mix") && izc.C0 != null) {
            izc.v("audio-mix enabled");
        }
    }

    public final void g() {
        this.Y.reportException("PeerConnectionWrapperBase", "server.topolog.set.sdp", new Exception("server.topolog.set.sdp"));
    }

    public final void h(zla zla, String str) {
        ge1 ge1;
        izc izc = this.B0;
        izc.getClass();
        izc.S("onPeerConnectionRemoteVideoTrackAdded, " + izc + ", client=" + zla + ", track=" + str);
        ge1 x02 = x87.x0(str);
        ke1 z = x02 != null ? izc.z(x02) : null;
        if (z == null || (ge1 = z.a) == null) {
            izc.Y.log("ServerCallTopology", "Cant find participant  for " + str + " video track, " + zla);
            return;
        }
        pd4 pd4 = izc.I0;
        if (pd4.isEnabled()) {
            Map remoteVideoRenderers = pd4.getRemoteVideoRenderers(ge1);
            for (xm1 xm1 : remoteVideoRenderers.keySet()) {
                List list = (List) remoteVideoRenderers.get(xm1);
                if (list != null) {
                    zla.t1.p(str, xm1, list);
                }
            }
        }
    }

    public final void i(zla zla, IceCandidate[] iceCandidateArr) {
    }

    public final void j() {
        this.F0.d1 = null;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ehc ehc = (ehc) it.next();
            jj7 jj7 = this.F0.B().n;
            if (ehc != null) {
                ((CopyOnWriteArrayList) jj7.b).remove(ehc);
            } else {
                jj7.getClass();
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ihc ihc = (ihc) it2.next();
            km4 km4 = this.F0.T0;
            if (km4 == null) {
                throw new IllegalStateException("Notifications receiver is not enabled");
            } else if (ihc != null) {
                ((CopyOnWriteArrayList) km4.a).remove(ihc);
            } else {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        Iterator it3 = this.o.iterator();
        while (it3.hasNext()) {
            ow0 ow0 = (ow0) it3.next();
            if (this.F0.c != null) {
                ((CopyOnWriteArrayList) this.F0.c.X).remove(ow0);
            }
        }
        this.F0.p(false);
    }

    public final void k(qqe qqe) {
        koc koc = this.F0.b;
        if (koc != null && !koc.f) {
            koc.h = Collections.unmodifiableSet((Set) qqe.a);
            Iterator it = koc.a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!koc.h.contains(entry.getKey())) {
                    nxf nxf = (nxf) entry.getValue();
                    if (nxf != null) {
                        nxf.a();
                    }
                    it.remove();
                }
            }
        }
    }

    public final void l(zla zla, PeerConnection.SignalingState signalingState) {
        if (signalingState == PeerConnection.SignalingState.STABLE && this.G0 != null) {
            this.Y.log("UnifiedPeerConnection", "apply postponed remote sdp=" + this.G0.type.canonicalForm() + " to " + zla);
            this.F0.J(this.G0);
            this.G0 = null;
        }
    }

    public final void m(zla zla, IceCandidate iceCandidate) {
    }

    public final void n(zla zla, SessionDescription sessionDescription) {
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.ANSWER;
        xwb xwb = this.Y;
        if (type == type2) {
            xwb.log("UnifiedPeerConnection", "sendRequestAcceptProducer," + this + ", sdp=" + sessionDescription.type.canonicalForm());
            try {
                mfd mfd = this.Z;
                HashSet hashSet = this.y0;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("description", (Object) sessionDescription.description);
                if (!hashSet.isEmpty()) {
                    jSONObject.put("ssrcs", (Object) new JSONArray((Collection<?>) hashSet));
                }
                mfd.i(x87.d(jSONObject, "accept-producer"));
            } catch (JSONException unused) {
                xwb.reportException("PeerConnectionWrapperBase", "server.topology.send.accept.producer", new Exception("server.topology.send.accept.producer"));
            }
        } else {
            xwb.reportException("UnifiedPeerConnection", "server.topology.producer.create.local.sdp", new Exception("answer.expected"));
        }
    }

    public final void o(zla zla, PeerConnection.IceConnectionState iceConnectionState) {
        this.Y.log("UnifiedPeerConnection", "onPeerConnectionIceConnectionChange, " + zla + " state=" + iceConnectionState);
        izc izc = this.B0;
        if (izc.I()) {
            if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                if (this.I0) {
                    this.L0.add(this.K0);
                    this.Z.i(x87.d((JSONObject) null, "request-realloc"));
                } else {
                    this.H0 = true;
                }
            }
            rl1 rl1 = izc.C0;
            if (rl1 != null) {
                ((gx0) rl1).A(izc, iceConnectionState);
            }
        }
    }

    public final void r(zla zla) {
        izc izc = this.B0;
        sh5 sh5 = izc.Z;
        if (sh5 != null && !sh5.f.b && !sh5.d.b && !sh5.e.b) {
            izc.P(new ql1(sh5));
        }
    }
}
