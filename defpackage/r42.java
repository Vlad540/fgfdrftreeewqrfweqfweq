package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: r42  reason: default package */
public final class r42 extends ol implements qce, tna {
    public final long X;
    public final long o;

    public r42(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
    }

    public final void c(lbe lbe) {
        l().c(new mw2(Collections.singletonList(Long.valueOf(this.o)), true, false, (md4) null, (a4b) null, 124));
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
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
        m62 m62;
        t().d(this.a);
        t52 m = m();
        long j = this.o;
        i22 B = m.B(j);
        if (B != null && ((m62 = B.b.c) == m62.o || m62 == m62.X)) {
            m().i(j, m62.a);
        }
        l().c(new mw2(Collections.singletonList(Long.valueOf(j)), true, false, (md4) null, (a4b) null, 124));
    }

    public final byte[] g() {
        Tasks.ChatClose chatClose = new Tasks.ChatClose();
        chatClose.requestId = this.a;
        chatClose.chatId = this.o;
        chatClose.chatServerId = this.X;
        return gr8.toByteArray(chatClose);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_CLOSE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 15);
        dtVar.n(this.X, ApiProtocol.PARAM_CHAT_ID);
        return dtVar;
    }
}
