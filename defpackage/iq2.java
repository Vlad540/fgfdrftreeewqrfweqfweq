package defpackage;

import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: iq2  reason: default package */
public final class iq2 extends ol implements qce, tna {
    public final int X;
    public final long Y;
    public final long o;

    public iq2(int i, long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = i;
        this.Y = j3;
    }

    public final void c(lbe lbe) {
        nq2 nq2 = (nq2) lbe;
        fn6 fn6 = udd.e;
        pl plVar = null;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "ChatsListApiTask", "onSuccess " + nq2, (Throwable) null);
        }
        try {
            q().n(nq2.c);
        } catch (TamErrorException unused) {
        }
        fn6 fn62 = udd.e;
        if (fn62 != null && fn62.c()) {
            fn62.d(tn7.X, "ChatsListApiTask", "chats.storeChatsFromServer", (Throwable) null);
        }
        t52 m = m();
        List list = nq2.c;
        m.getClass();
        zb9 zb9 = (zb9) m.e0("storeChatsFromServer", new ic0((Object) m, (Object) list, (Object) null, 0));
        pl plVar2 = this.c;
        if (plVar2 != null) {
            plVar = plVar2;
        }
        ((lqc) ((f03) plVar.e.getValue())).k("app.last.chat.marker", Long.valueOf(nq2.o));
        if (nq2.o > 0) {
            pk j = j();
            long j2 = nq2.o;
            long j3 = this.Y;
            yzc yzc = ((j2b) r()).b;
            yzc.getClass();
            gy9 gy9 = (gy9) j;
            sce.d(gy9.A(), new iq2((int) yzc.o(PmsKey.f21chatspagesize, (long) 50), ((j2b) gy9.z()).a.n(), j2, j3), false, 0, 12);
        }
    }

    public final void d(uae uae) {
    }

    public final int e() {
        return 1;
    }

    public final void f() {
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.ChatsList chatsList = new Tasks.ChatsList();
        chatsList.requestId = this.a;
        chatsList.marker = this.o;
        chatsList.count = this.X;
        chatsList.chatsSync = this.Y;
        return gr8.toByteArray(chatsList);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHATS_LIST;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        pn2 pn2 = new pn2((dfa) null, 3);
        pn2.n(this.o, "marker");
        pn2.g(this.X, "count");
        return pn2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatsListApiTask(id = ");
        sb.append(this.a);
        sb.append(", marker=");
        sb.append(this.o);
        sb.append(", count=");
        sb.append(this.X);
        sb.append(", chatsSync=");
        return wn6.k(sb, this.Y, ")");
    }
}
