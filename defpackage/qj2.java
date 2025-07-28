package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: qj2  reason: default package */
public final class qj2 extends ol implements qce, tna {
    public final boolean X;
    public final long o;

    public qj2(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.X = z;
    }

    public final void c(lbe lbe) {
        rj2 rj2 = (rj2) lbe;
        if (rj2.c != null) {
            m().W(this.o, z52.o);
            m().c0(Collections.singletonList(rj2.c));
        }
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
        }
        l().c(new jh0(this.a, uae));
    }

    public final int e() {
        jee t = t();
        una una = una.TYPE_CHAT_PIN_SET_VISIBILITY;
        long j = this.a;
        for (zde zde : t.h(j, una)) {
            qj2 qj2 = (qj2) zde.f;
            if (qj2.o == this.o && qj2.a > j) {
                return 3;
            }
        }
        return 1;
    }

    public final void f() {
        m().W(this.o, z52.o);
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.ChatPinSetVisibility chatPinSetVisibility = new Tasks.ChatPinSetVisibility();
        chatPinSetVisibility.requestId = this.a;
        chatPinSetVisibility.chatServerId = this.o;
        chatPinSetVisibility.show = this.X;
        return gr8.toByteArray(chatPinSetVisibility);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_PIN_SET_VISIBILITY;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 28);
        dtVar.n(this.o, ApiProtocol.PARAM_CHAT_ID);
        dtVar.d("show", this.X);
        return dtVar;
    }
}
