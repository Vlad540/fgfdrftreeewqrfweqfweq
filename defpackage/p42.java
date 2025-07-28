package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: p42  reason: default package */
public final class p42 extends ol implements qce, tna {
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;

    public p42(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
    }

    public final void c(lbe lbe) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((jz2) plVar.K.getValue()).a(this.o, this.Y);
    }

    public final void d(uae uae) {
        if (!(uae instanceof lae)) {
            f();
        }
    }

    public final int e() {
        i22 B = m().B(this.o);
        if (B == null) {
            return 1;
        }
        m62 m62 = B.b.c;
        return (m62 == m62.o || m62 == m62.X) ? 3 : 1;
    }

    public final void f() {
        t().d(this.a);
        p().y(this.o, this.Y, ls8.ACTIVE);
        t52 m = m();
        long j = this.o;
        m.v(j);
        l().c(new mw2(Collections.singletonList(Long.valueOf(j)), true, false, (md4) null, (a4b) null, 124));
    }

    public final byte[] g() {
        Tasks.ChatClear chatClear = new Tasks.ChatClear();
        chatClear.requestId = this.a;
        chatClear.chatId = this.o;
        chatClear.chatServerId = this.X;
        chatClear.lastEventTime = this.Y;
        chatClear.forAll = this.Z;
        return gr8.toByteArray(chatClear);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_CLEAR;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 14);
        dtVar.n(this.X, ApiProtocol.PARAM_CHAT_ID);
        dtVar.n(this.Y, "lastEventTime");
        dtVar.d("forAll", this.Z);
        return dtVar;
    }
}
