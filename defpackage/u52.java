package defpackage;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: u52  reason: default package */
public final class u52 extends ol implements qce, tna {
    public final int X;
    public final long Y;
    public final long Z;
    public final long o;
    public final String w0;

    public u52(long j, long j2, int i, long j3, String str, long j4) {
        super(j);
        this.o = j2;
        this.X = i;
        this.Y = j3;
        this.Z = j4;
        this.w0 = str == null ? "" : str;
    }

    public final void c(lbe lbe) {
        j22 j22 = ((v52) lbe).c;
        if (j22 != null) {
            m().c0(Collections.singletonList(j22));
        }
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
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        y8c y8c = (y8c) plVar.L.getValue();
        t52 t52 = (t52) y8c.a.getValue();
        t52.getClass();
        long j = this.o;
        tic.a(new l52(t52, j, 0), t52.z, (j6) null, new ak0(20), (qmc) null);
        ConcurrentHashMap concurrentHashMap = ((m0c) y8c.b.getValue()).i;
        tic.b((xi4) concurrentHashMap.get(0L));
        concurrentHashMap.remove(0L);
        l().c(new mw2(Collections.singletonList(Long.valueOf(j)), true, false, (md4) null, (a4b) null, 124));
    }

    public final byte[] g() {
        Tasks.ChatCreate chatCreate = new Tasks.ChatCreate();
        chatCreate.requestId = this.a;
        int i = this.X;
        if (i != 0) {
            chatCreate.chatType = th2.c(i);
        }
        chatCreate.chatId = this.o;
        chatCreate.groupId = this.Y;
        chatCreate.startPayload = this.w0;
        chatCreate.cid = this.Z;
        return gr8.toByteArray(chatCreate);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_CREATE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 17);
        int i = this.X;
        if (!(i == 0 || i == 1)) {
            dtVar.s("chatType", th2.c(i));
        }
        long j = this.Y;
        if (j != 0) {
            dtVar.n(j, "groupId");
        }
        String str = this.w0;
        if (!r1g.p(str)) {
            dtVar.s("startPayload", str);
        }
        long j2 = this.Z;
        if (j2 != 0) {
            dtVar.n(j2, "cid");
        }
        return dtVar;
    }
}
