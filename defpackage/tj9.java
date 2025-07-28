package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: tj9  reason: default package */
public final class tj9 extends qmc {
    public static final qic d = new qic("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);
    public final ThreadFactory c = d;

    public final omc a() {
        return new uj9(this.c);
    }
}
