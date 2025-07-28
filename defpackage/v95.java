package defpackage;

import java.util.concurrent.Callable;

/* renamed from: v95  reason: default package */
public final /* synthetic */ class v95 implements Callable {
    public final /* synthetic */ w95 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ v95(w95 w95, long j, long j2) {
        this.a = w95;
        this.b = j;
        this.c = j2;
    }

    public final Object call() {
        gy9 gy9 = (gy9) this.a.a;
        return Long.valueOf(sce.d(gy9.A(), new ot(((j2b) gy9.z()).a.n(), 5, this.b, this.c, -1), false, 0, 12));
    }
}
