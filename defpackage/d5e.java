package defpackage;

import java.util.Collection;
import java.util.Collections;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: d5e  reason: default package */
public final class d5e extends ol implements qce, tna {
    public final long X;
    public final boolean Y;
    public final long o;

    public d5e(long j, long j2, boolean z, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = z;
    }

    public final void c(lbe lbe) {
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
        }
    }

    public final int e() {
        return 1;
    }

    public final void f() {
        t().d(this.a);
        t52 m = m();
        m.getClass();
        cz0 cz0 = new cz0(false, 1);
        long j = this.o;
        m.h(j, false, cz0);
        l().c(new mw2(Collections.singletonList(Long.valueOf(j)), false, false, (md4) null, (a4b) null, 124));
        l().c(new lp3((Collection) Collections.singletonList(Long.valueOf(this.X))));
    }

    public final byte[] g() {
        Tasks.SuspendBot suspendBot = new Tasks.SuspendBot();
        suspendBot.requestId = this.a;
        suspendBot.chatId = this.o;
        suspendBot.botId = this.X;
        suspendBot.suspend = this.Y;
        return gr8.toByteArray(suspendBot);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_SUSPEND_BOT;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        bm9 bm9 = new bm9((dfa) null, 12);
        bm9.n(this.X, "botId");
        bm9.d("value", this.Y);
        return bm9;
    }
}
