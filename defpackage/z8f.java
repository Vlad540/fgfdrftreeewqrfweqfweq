package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: z8f  reason: default package */
public final /* synthetic */ class z8f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5c b;

    public /* synthetic */ z8f(s5c s5c, int i) {
        this.a = i;
        this.b = s5c;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((AtomicInteger) this.b.c).decrementAndGet();
                return;
            default:
                ((AtomicInteger) this.b.c).incrementAndGet();
                return;
        }
    }
}
