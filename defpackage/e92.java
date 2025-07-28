package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: e92  reason: default package */
public final class e92 extends ol implements qce {
    public final long A0;
    public final boolean B0;
    public final boolean C0;
    public final md4 D0;
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final String w0;
    public final int x0;
    public final long y0;
    public final int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e92(long j, long j2, long j3, long j4, long j5, String str, int i, int i2, long j6, md4 md4, int i3) {
        super(j);
        int i4 = i3;
        String str2 = (i4 & 32) != 0 ? null : str;
        int i5 = (i4 & 64) != 0 ? 0 : i;
        int i6 = (i4 & 256) != 0 ? 0 : i2;
        long j7 = (i4 & 512) != 0 ? 0 : j6;
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.w0 = str2;
        this.x0 = i5;
        this.y0 = 0;
        this.z0 = i6;
        this.A0 = j7;
        this.B0 = false;
        this.C0 = true;
        this.D0 = md4;
    }

    public final void c(lbe lbe) {
        zde j;
        f92 f92 = (f92) lbe;
        try {
            xs7.N(new d92(this, f92, (Continuation) null));
        } catch (TamErrorException unused) {
            String name = e92.class.getName();
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.w0, name, "fail to get missed contacts for chat history", (Throwable) null);
            }
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((l92) plVar.S.getValue()).a(this.a, this.o, this.Y, this.x0, this.y0, this.z0, this.A0, f92, this.D0);
        long j2 = this.Z;
        if (j2 != 0 && (j = t().j(j2)) != null) {
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            ((luf) plVar2.g.getValue()).a((n1d) j.f);
        }
    }

    public final void d(uae uae) {
        tf3 k;
        if ("not.found".equals(uae.b)) {
            i22 B = m().B(this.o);
            if (!(B == null || !B.J() || (k = B.k()) == null)) {
                n().o(k.n());
            }
        } else {
            l().c(new jh0(this.a, uae));
        }
        long j = this.Z;
        if (j == 0) {
            return;
        }
        if (uae instanceof lae) {
            t().n(j, lee.WAITING);
        } else {
            t().d(j);
        }
    }

    public final ibe i() {
        return new dt(this.X, this.Y, this.x0, this.y0, this.z0, this.A0, this.B0, this.C0, this.w0, this.D0);
    }
}
