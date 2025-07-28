package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zf9  reason: default package */
public final class zf9 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final String b;
    public final Object c;

    public zf9(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = new AtomicInteger(1);
                return;
            default:
                this.c = Executors.defaultThreadFactory();
                this.b = str;
                return;
        }
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.c).newThread(new kjc(runnable, 3));
                newThread.setName(this.b);
                return newThread;
            default:
                hg9 hg9 = new hg9(this, 18, runnable);
                int andIncrement = ((AtomicInteger) this.c).getAndIncrement();
                return new Thread(hg9, this.b + "-" + andIncrement);
        }
    }
}
