package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: xn2  reason: default package */
public final class xn2 extends ol implements qce, tna {
    public final boolean X;
    public final long o;

    public xn2(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.X = z;
    }

    public final void c(lbe lbe) {
    }

    public final void d(uae uae) {
        l().c(new jh0(this.a, uae));
        if (!iu7.F(uae.b)) {
            f();
        }
    }

    public final int e() {
        return 1;
    }

    public final void f() {
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.ChatSubscribe chatSubscribe = new Tasks.ChatSubscribe();
        chatSubscribe.requestId = this.a;
        chatSubscribe.chatServerId = this.o;
        chatSubscribe.subscribe = this.X;
        return gr8.toByteArray(chatSubscribe);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_SUBSCRIBE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        pn2 pn2 = new pn2((dfa) null, 1);
        pn2.n(this.o, ApiProtocol.PARAM_CHAT_ID);
        pn2.d("subscribe", this.X);
        return pn2;
    }
}
