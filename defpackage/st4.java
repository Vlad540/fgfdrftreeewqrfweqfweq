package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: st4  reason: default package */
public final class st4 extends a06 {
    public final /* synthetic */ a06 i;
    public final /* synthetic */ ThreadPoolExecutor j;

    public st4(a06 a06, ThreadPoolExecutor threadPoolExecutor) {
        this.i = a06;
        this.j = threadPoolExecutor;
    }

    public final void A(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.A(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void B(o39 o39) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.B(o39);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
