package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: c92  reason: default package */
public final class c92 extends ol implements qce, tna {
    public final long X;
    public final String Y = c92.class.getName();
    public final long o;

    public c92(long j, long j2, long j3) {
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
        return m().B(this.o) != null ? 1 : 3;
    }

    public final void f() {
        long j = this.a;
        udd.t(this.Y, "onMaxFailCount: remove task, requestId = %d", new Object[]{Long.valueOf(j)});
        t().d(j);
    }

    public final byte[] g() {
        Tasks.ChatHide chatHide = new Tasks.ChatHide();
        chatHide.requestId = this.a;
        chatHide.chatId = this.o;
        chatHide.chatServerId = this.X;
        return gr8.toByteArray(chatHide);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_HIDE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 19);
        dtVar.n(this.X, ApiProtocol.PARAM_CHAT_ID);
        return dtVar;
    }
}
