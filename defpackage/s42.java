package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: s42  reason: default package */
public final class s42 extends ol implements qce, tna {
    public final j63 X;
    public final String Y = s42.class.getName();
    public final long o;

    public s42(long j, long j2, j63 j63) {
        super(j);
        this.o = j2;
        this.X = j63;
    }

    public final void c(lbe lbe) {
        l().c(new t42(this.a, this.o));
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
            l().c(new jh0(uae));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r3 = r3.b.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r3 = this;
            t52 r0 = r3.m()
            long r1 = r3.o
            i22 r3 = r0.B(r1)
            if (r3 == 0) goto L_0x001b
            o62 r3 = r3.b
            m62 r3 = r3.c
            m62 r0 = defpackage.m62.o
            if (r3 == r0) goto L_0x001b
            m62 r0 = defpackage.m62.X
            if (r3 != r0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 1
            return r3
        L_0x001b:
            r3 = 3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s42.e():int");
    }

    public final void f() {
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.ChatComplain chatComplain = new Tasks.ChatComplain();
        chatComplain.requestId = this.a;
        chatComplain.chatId = this.o;
        j63 j63 = this.X;
        chatComplain.complaint = j63 == null ? "" : j63.a;
        return gr8.toByteArray(chatComplain);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_COMPLAIN;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        i22 B = m().B(this.o);
        if (B == null) {
            udd.q(this.Y, "chat is null");
            return null;
        }
        long j = B.b.a;
        dt dtVar = new dt((dfa) null, 16);
        dtVar.n(j, ApiProtocol.PARAM_CHAT_ID);
        j63 j63 = this.X;
        if (j63 != null) {
            dtVar.s("complaint", j63.a);
        }
        return dtVar;
    }
}
