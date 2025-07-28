package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: u62  reason: default package */
public final class u62 extends ol implements qce, tna {
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;

    public u62(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
    }

    public final void c(lbe lbe) {
        t52 m = m();
        m62 m62 = m62.o;
        long j = this.o;
        m.i(j, m62);
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((jz2) plVar.K.getValue()).a(j, this.Y);
        l().c(new w8c(j));
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
        }
    }

    public final int e() {
        t52 m = m();
        long j = this.o;
        i22 B = m.B(j);
        if (B == null || B.b.c != m62.o) {
            return 1;
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((jz2) plVar.K.getValue()).a(j, this.Y);
        return 3;
    }

    public final void f() {
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.ChatDelete chatDelete = new Tasks.ChatDelete();
        chatDelete.requestId = this.a;
        chatDelete.chatId = this.o;
        chatDelete.chatServerId = this.X;
        chatDelete.lastEventTime = this.Y;
        chatDelete.forAll = this.Z;
        return gr8.toByteArray(chatDelete);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_DELETE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 18);
        dtVar.n(this.X, ApiProtocol.PARAM_CHAT_ID);
        dtVar.n(this.Y, "lastEventTime");
        dtVar.d("forAll", this.Z);
        return dtVar;
    }
}
