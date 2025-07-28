package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: f52  reason: default package */
public final /* synthetic */ class f52 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t52 b;
    public final /* synthetic */ long c;

    public /* synthetic */ f52(t52 t52, long j, int i) {
        this.a = i;
        this.b = t52;
        this.c = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                ConcurrentHashMap concurrentHashMap = this.b.f;
                long j = this.c;
                i22 i22 = (i22) concurrentHashMap.get(Long.valueOf(j));
                if (i22 != null) {
                    return i22;
                }
                throw new IllegalArgumentException(us8.i(j, "chat not found: "));
            default:
                ConcurrentHashMap concurrentHashMap2 = this.b.g;
                long j2 = this.c;
                i22 i222 = (i22) concurrentHashMap2.get(Long.valueOf(j2));
                if (i222 != null) {
                    return i222;
                }
                throw new IllegalArgumentException(us8.i(j2, "chat not found: "));
        }
    }
}
