package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: go7  reason: default package */
public final class go7 extends ol implements qce {
    public final pce A0 = new pce();
    public final long X;
    public final long Y;
    public final long Z;
    public final String o;
    public final String w0;
    public final long x0;
    public final long y0;
    public final long z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public go7(long j, String str, long j2, long j3, long j4, String str2, long j5, long j6, long j7) {
        super(j);
        this.o = str;
        this.X = j2;
        this.Y = j3;
        this.Z = j4;
        this.w0 = str2;
        this.x0 = j5;
        this.y0 = j6;
        this.z0 = j7;
    }

    public final pce b() {
        return this.A0;
    }

    public final void c(lbe lbe) {
        xs7.N(new fo7(this, (jo7) lbe, (Continuation) null));
    }

    public final void d(uae uae) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((wo7) plVar.l.getValue()).a(uae);
    }

    public final ibe i() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return new io7(this.o, ((rf4) plVar.b.getValue()).d(), this.X, this.Y, this.Z, this.w0, this.x0, this.y0, this.z0);
    }
}
