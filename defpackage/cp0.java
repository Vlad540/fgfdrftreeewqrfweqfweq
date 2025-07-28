package defpackage;

import java.util.Collections;

/* renamed from: cp0  reason: default package */
public final class cp0 extends ol implements qce {
    public final long X;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp0(long j, long j2, int i) {
        super(j);
        this.o = i;
        this.X = j2;
    }

    private final void u(uae uae) {
    }

    private final void v(uae uae) {
    }

    private final void w(lbe lbe) {
    }

    public final void c(lbe lbe) {
        switch (this.o) {
            case 0:
                dp0 dp0 = (dp0) lbe;
                uj3 uj3 = dp0.o;
                if (uj3 != null) {
                    tf3 i = n().i(uj3.a, false);
                    if ((i != null ? i.a.c.k : null) == mi3.a) {
                        n().u(Collections.singletonList(uj3));
                    } else {
                        n().v(Collections.singletonList(uj3));
                    }
                    t52 m = m();
                    long j = this.X;
                    i22 E = m.E(j);
                    l().c(new m32(this.a, E.a, dp0.c, Collections.singletonMap(Long.valueOf(j), uj3)));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void d(uae uae) {
        int i = this.o;
    }

    public final ibe i() {
        long j = this.X;
        switch (this.o) {
            case 0:
                dt dtVar = new dt(dfa.BOT_INFO, 9);
                dtVar.n(j, "botId");
                return dtVar;
            default:
                if (j == 0) {
                    return new pn2(0, 26, (byte) 0);
                }
                i22 B = m().B(j);
                if (B != null) {
                    o62 o62 = B.b;
                    if (o62.a != 0 || m().P(B)) {
                        return new pn2(o62.a, 26, (byte) 0);
                    }
                }
                udd.s("cp0", "createRequest: No chat or serverId == 0. return null", (Throwable) null);
                return null;
        }
    }
}
