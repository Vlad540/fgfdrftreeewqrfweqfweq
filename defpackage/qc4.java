package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: qc4  reason: default package */
public final class qc4 implements k4f {
    public final int a;
    public final boolean b;
    public final h96 c;
    public final ExecutorService d;
    public final q96 e;
    public final int f;
    public final boolean g = false;
    public final boolean h = false;

    public qc4(int i, boolean z, h96 h96, ScheduledExecutorService scheduledExecutorService, hc0 hc0, int i2) {
        this.a = i;
        this.b = z;
        this.c = h96;
        this.d = scheduledExecutorService;
        this.e = hc0;
        this.f = i2;
    }

    public final /* bridge */ /* synthetic */ m4f a(Context context, pv0 pv0, z23 z23, boolean z, xw2 xw2) {
        return b(context, pv0, z23, z, lh4.a, xw2);
    }

    public final rc4 b(Context context, pv0 pv0, z23 z23, boolean z, Executor executor, l4f l4f) {
        ExecutorService executorService = this.d;
        boolean z2 = executorService == null;
        if (executorService == null) {
            int i = oze.a;
            executorService = Executors.newSingleThreadExecutor(new v93(2, "Effect:DefaultVideoFrameProcessor:GlThread"));
        }
        ExecutorService executorService2 = executorService;
        l4f l4f2 = l4f;
        try {
            return (rc4) executorService2.submit(new pc4(this, context, pv0, z23, z, new ew0(executorService2, z2, (h4f) new kc4(l4f2, 1)), executor, l4f2)).get();
        } catch (ExecutionException e2) {
            throw new Exception(e2);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            throw new Exception(e3);
        }
    }
}
