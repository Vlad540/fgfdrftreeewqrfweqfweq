package defpackage;

import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: r95  reason: default package */
public final /* synthetic */ class r95 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r95(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                gy9 gy9 = (gy9) ((w95) this.c).a;
                return Long.valueOf(sce.d(gy9.A(), new ct(5, ((j2b) gy9.z()).a.n(), this.b), false, 0, 12));
            default:
                return ((zsd) ((fa5) this.c).b.get()).d(Collections.singletonList(Long.valueOf(this.b)));
        }
    }
}
