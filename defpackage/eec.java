package defpackage;

import java.util.concurrent.Callable;

/* renamed from: eec  reason: default package */
public final /* synthetic */ class eec implements Callable {
    public final /* synthetic */ nec a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ym8 c;
    public final /* synthetic */ long o;

    public /* synthetic */ eec(nec nec, long j, ym8 ym8, long j2) {
        this.a = nec;
        this.b = j;
        this.c = ym8;
        this.o = j2;
    }

    public final Object call() {
        return Long.valueOf(this.a.f(this.b, this.o, this.c, false));
    }
}
