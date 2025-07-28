package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: sa3  reason: default package */
public final class sa3 {
    public final Executor a;
    public final Executor b;
    public final iuf c;
    public final cqc d;
    public final gvf e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX WARNING: type inference failed for: r0v6, types: [cqc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, iuf] */
    public sa3(di9 di9) {
        Executor executor = (Executor) di9.b;
        if (executor == null) {
            this.a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new pa3(false));
        } else {
            this.a = executor;
        }
        Executor executor2 = (Executor) di9.d;
        if (executor2 == null) {
            this.b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new pa3(true));
        } else {
            this.b = executor2;
        }
        iuf iuf = (iuf) di9.c;
        if (iuf == null) {
            String str = iuf.a;
            this.c = new Object();
        } else {
            this.c = iuf;
        }
        this.d = new Object();
        this.e = new gvf(12);
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = di9.a;
    }
}
