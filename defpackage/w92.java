package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: w92  reason: default package */
public final class w92 extends ol implements qce, tna {
    public final long X;
    public final long o;

    public w92(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
    }

    public final void c(lbe lbe) {
        l().c(new x92(this.a, this.o));
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
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.ChannelLeave channelLeave = new Tasks.ChannelLeave();
        channelLeave.requestId = this.a;
        channelLeave.chatId = this.o;
        channelLeave.chatServerId = this.X;
        return gr8.toByteArray(channelLeave);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_LEAVE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 23);
        dtVar.n(this.X, ApiProtocol.PARAM_CHAT_ID);
        return dtVar;
    }
}
