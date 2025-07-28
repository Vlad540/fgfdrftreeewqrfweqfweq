package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: v89  reason: default package */
public final class v89 extends ol implements qce {
    public final long X;
    public final List Y;
    public final String Z = v89.class.getName();
    public final long o;

    public v89(long j, long j2, long j3, List list) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = list;
    }

    public final void c(lbe lbe) {
        Map map = ((w89) lbe).c;
        udd.q(this.Z, wn6.h(map.keySet().size(), "reactions: onSuccess: reactionsCount = "));
        List list = this.Y;
        int S = ju7.S(q23.H(list, 10));
        if (S < 16) {
            S = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S);
        for (Object next : list) {
            linkedHashMap.put(next, (vr8) map.get(Long.valueOf(((Number) next).longValue())));
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((bs8) plVar.H.getValue()).f(this.o, linkedHashMap);
    }

    public final void d(uae uae) {
        udd.u(this.Z, uae.X, "reactions, onFail %s", new Object[]{uae});
        l().c(new jh0(this.a, uae));
    }

    public final ibe i() {
        List list = this.Y;
        if (!list.isEmpty()) {
            pn2 pn2 = new pn2(dfa.MSG_GET_REACTIONS, 23);
            if (!list.isEmpty()) {
                pn2.n(this.X, ApiProtocol.PARAM_CHAT_ID);
                pn2.h("messageIds", list);
                return pn2;
            }
            throw new IllegalArgumentException("mesageIds can't be empty".toString());
        }
        throw new IllegalArgumentException("messageIds is empty, MsgGetReactions requires at least one messageId".toString());
    }
}
