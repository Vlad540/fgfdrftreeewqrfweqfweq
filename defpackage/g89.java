package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: g89  reason: default package */
public final class g89 extends ol implements qce, tna, qyb {
    public static final /* synthetic */ int w0 = 0;
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;

    public g89(long j, long j2, long j3, long j4, long j5) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
    }

    public final void c(lbe lbe) {
        vr8 vr8 = ((h89) lbe).c;
        pl plVar = null;
        Integer valueOf = vr8 != null ? Integer.valueOf(vr8.b) : null;
        udd.q("g89", "reactions, cancelTask onSuccess, reactionInfoTotalCount = " + valueOf + "}");
        pl plVar2 = this.c;
        if (plVar2 != null) {
            plVar = plVar2;
        }
        ((bs8) plVar.H.getValue()).f(this.o, Collections.singletonMap(Long.valueOf(this.Z), vr8));
    }

    public final void d(uae uae) {
        udd.u("g89", uae.X, "reactions, cancelTask onFail %s", new Object[]{uae});
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
        for (zde zde : t().h(this.a, una.TYPE_MSG_CANCEL_REACTION)) {
            g89 g89 = (g89) zde.f;
            if (g89.o == j2 && g89.X == j) {
                udd.q("g89", "onPreExecute: later cancel_reaction task found, REMOVE");
                return 3;
            }
        }
        if (q == null || q.z0 == ls8.DELETED || B == null || (!B.A() && !B.O())) {
            udd.q("g89", "onPreExecute: message or chat not found, REMOVE");
            return 3;
        } else if (this.Z == 0) {
            udd.q("g89", "onPreExecute: message serverId == 0, REMOVE");
            return 3;
        } else if (B.b.a != 0 || m().P(B)) {
            return 1;
        } else {
            udd.q("g89", "onPreExecute: chat serverId == 0, SKIP");
            return 2;
        }
    }

    public final void f() {
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.MsgCancelReaction msgCancelReaction = new Tasks.MsgCancelReaction();
        msgCancelReaction.requestId = this.a;
        msgCancelReaction.chatId = this.o;
        msgCancelReaction.chatServerId = this.Y;
        msgCancelReaction.messageId = this.X;
        msgCancelReaction.messageServerId = this.Z;
        return gr8.toByteArray(msgCancelReaction);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_MSG_CANCEL_REACTION;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        pn2 pn2 = new pn2((dfa) null, 17);
        long j = this.Z;
        if (j != 0) {
            pn2.n(this.Y, ApiProtocol.PARAM_CHAT_ID);
            pn2.n(j, "messageId");
            return pn2;
        }
        throw new IllegalArgumentException("param messageId can't be 0".toString());
    }
}
