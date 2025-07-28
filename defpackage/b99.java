package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: b99  reason: default package */
public final class b99 extends ol implements qce {
    public final String X;
    public final int Y = 100;
    public final long Z;
    public final long o;
    public final String w0;

    public b99(String str, long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = str;
        this.Z = j3;
        this.w0 = b99.class.getName();
    }

    public final void c(lbe lbe) {
        c99 c99 = (c99) lbe;
        l().c(new li2(this.a, this.X, c99.c, c99.o, c99.X));
    }

    public final void d(uae uae) {
        l().c(new jh0(this.a, uae));
    }

    public final ibe i() {
        i22 B = m().B(this.o);
        if (B != null) {
            o62 o62 = B.b;
            if (o62.a != 0 || m().P(B)) {
                pn2 pn2 = new pn2((dfa) null, 25);
                pn2.n(o62.a, ApiProtocol.PARAM_CHAT_ID);
                pn2.s("query", this.X);
                pn2.g(this.Y, "count");
                long j = this.Z;
                if (j != 0) {
                    pn2.n(j, "marker");
                }
                return pn2;
            }
        }
        udd.s(this.w0, "createRequest: No chat or serverId == 0. return null", (Throwable) null);
        return null;
    }
}
