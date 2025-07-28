package defpackage;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: rie  reason: default package */
public final class rie implements y4b {
    public final y4b a;
    public int b = 0;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final Executor d;

    public rie(Executor executor, gbc gbc) {
        executor.getClass();
        this.d = executor;
        this.a = gbc;
    }

    public final void a(ah0 ah0, z4b z4b) {
        boolean z;
        ((ji0) z4b).c.j(z4b, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.b;
                z = true;
                if (i >= 5) {
                    this.c.add(Pair.create(ah0, z4b));
                } else {
                    this.b = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z) {
            ((ji0) z4b).c.a(z4b, "ThrottlingProducer", (Map) null);
            this.a.a(new qie(this, ah0), z4b);
        }
    }
}
