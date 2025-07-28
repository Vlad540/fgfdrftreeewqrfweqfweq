package defpackage;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: v93  reason: default package */
public final /* synthetic */ class v93 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ v93(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable, (String) this.b);
                thread.setPriority(10);
                return thread;
            case 1:
                return new Thread(runnable, (String) this.b);
            case 2:
                return new Thread(runnable, (String) this.b);
            case 3:
                return new Thread(runnable, (String) this.b);
            default:
                return new Thread(runnable, "tracer-io-" + ((AtomicInteger) this.b).getAndIncrement());
        }
    }
}
