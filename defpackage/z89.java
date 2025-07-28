package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: z89  reason: default package */
public final class z89 extends ol implements qce, tna, qyb {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final rr8 w0;
    public final String x0 = z89.class.getName();

    public z89(long j, long j2, long j3, long j4, long j5, rr8 rr8) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.w0 = rr8;
    }

    public final void c(lbe lbe) {
        a99 a99 = (a99) lbe;
        vr8 vr8 = a99.c;
        pl plVar = null;
        String str = this.x0;
        if (vr8 == null) {
            tt0 l = l();
            String str2 = a99.o;
            if (str2 == null) {
                str2 = "server bug";
            }
            l.c(new jh0(this.a, new uae(str2, "", (String) null)));
            udd.U(str, "onSuccess: its server bug!, skip");
            return;
        }
        udd.q(str, "reactions, reactTamTask onSuccess, reactionInfoTotalCount = " + vr8.b + "}");
        pl plVar2 = this.c;
        if (plVar2 != null) {
            plVar = plVar2;
        }
        ((bs8) plVar.H.getValue()).f(this.o, Collections.singletonMap(Long.valueOf(this.Z), vr8));
    }

    public final void d(uae uae) {
        udd.u(this.x0, uae.X, "reactions, reactTamTask onFail: %s", new Object[]{uae});
        l().c(new jh0(this.a, uae));
        qyb.a(this, uae);
    }

    public final int e() {
        to8 p = p();
        long j = this.X;
        vo8 q = p.q(j);
        t52 m = m();
        long j2 = this.o;
        i22 B = m.B(j2);
        Iterator it = t().h(this.a, una.TYPE_MSG_REACT).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = this.x0;
            if (hasNext) {
                z89 z89 = (z89) ((zde) it.next()).f;
                if (z89.o == j2 && z89.X == j) {
                    udd.q(str, "onPreExecute: later react task found, REMOVE");
                    return 3;
                }
            } else if (q == null || q.z0 == ls8.DELETED || B == null || (!B.A() && !B.O())) {
                udd.q(str, "onPreExecute: message or chat not found, REMOVE");
                return 3;
            } else if (this.Z == 0) {
                udd.q(str, "onPreExecute: message serverId == 0, REMOVE");
                return 3;
            } else if (B.b.a != 0 || m().P(B)) {
                udd.q(str, "onPreExecute, READY");
                return 1;
            } else {
                udd.q(str, "onPreExecute: chat serverId == 0, SKIP");
                return 2;
            }
        }
    }

    public final void f() {
        yr8 yr8;
        t().d(this.a);
        vo8 q = p().q(this.X);
        if (q != null && (yr8 = q.W0) != null) {
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            ryb b = ((zr8) plVar.T.getValue()).b(this.w0.b);
            List<xr8> list = yr8.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (xr8 xr8 : list) {
                    if (hhd.f(xr8.a.b, b)) {
                        udd.q(this.x0, "reactions, onMaxFailCount, remove reaction from message");
                        return;
                    }
                }
            }
        }
    }

    public final byte[] g() {
        Tasks.MsgReact msgReact = new Tasks.MsgReact();
        msgReact.requestId = this.a;
        msgReact.chatId = this.o;
        msgReact.chatServerId = this.Y;
        msgReact.messageId = this.X;
        msgReact.messageServerId = this.Z;
        rr8 rr8 = this.w0;
        msgReact.reaction = rr8.b;
        msgReact.reactionType = rr8.a.ordinal();
        return gr8.toByteArray(msgReact);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_MSG_REACT;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        pn2 pn2 = new pn2((dfa) null, 24);
        long j = this.Z;
        if (j != 0) {
            rr8 rr8 = this.w0;
            String str = rr8.b;
            if (str.length() != 0) {
                pn2.n(this.Y, ApiProtocol.PARAM_CHAT_ID);
                pn2.n(j, "messageId");
                pn2.p("reaction", ju7.T(new wia[]{new wia("reactionType", rr8.a.name()), new wia(ApiProtocol.KEY_ID, str)}));
                return pn2;
            }
            throw new IllegalArgumentException("param reaction.id can't be empty");
        }
        throw new IllegalArgumentException("param messageId can't be 0");
    }
}
