package defpackage;

import bolts.Task;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: th4  reason: default package */
public final class th4 implements dr3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public th4(vh4 vh4, wz6 wz6, z4b z4b, ah0 ah0) {
        this.e = vh4;
        this.b = wz6;
        this.c = z4b;
        this.d = ah0;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                boolean isCancelled = task.isCancelled();
                ah0 ah0 = (ah0) this.d;
                c5b c5b = (c5b) this.b;
                z4b z4b = (z4b) this.c;
                if (isCancelled || (task.isFaulted() && (task.getError() instanceof CancellationException))) {
                    c5b.k(z4b, "DiskCacheProducer");
                    ah0.c();
                } else {
                    boolean isFaulted = task.isFaulted();
                    vh4 vh4 = (vh4) this.e;
                    if (isFaulted) {
                        c5b.d(z4b, "DiskCacheProducer", task.getError(), (Map) null);
                        vh4.d.a(ah0, z4b);
                    } else {
                        ax4 ax4 = (ax4) task.getResult();
                        if (ax4 != null) {
                            c5b.a(z4b, "DiskCacheProducer", vh4.c((wz6) c5b, z4b, true, ax4.o()));
                            c5b.e(z4b, "DiskCacheProducer", true);
                            ((ji0) z4b).h("disk", "default");
                            ah0.i(1.0f);
                            ah0.g(1, ax4);
                            ax4.close();
                        } else {
                            c5b.a(z4b, "DiskCacheProducer", vh4.c((wz6) c5b, z4b, false, 0));
                            vh4.d.a(ah0, z4b);
                        }
                    }
                }
                return null;
            default:
                if (!((Boolean) ((Callable) this.b).call()).booleanValue()) {
                    return Task.forResult(null);
                }
                Executor executor = (Executor) this.d;
                return Task.forResult(null).onSuccessTask((dr3) this.c, executor).onSuccessTask((dr3) ((u5g) this.e).b, executor);
        }
    }

    public th4(Callable callable, dr3 dr3, Executor executor, u5g u5g) {
        this.b = callable;
        this.c = dr3;
        this.d = executor;
        this.e = u5g;
    }
}
