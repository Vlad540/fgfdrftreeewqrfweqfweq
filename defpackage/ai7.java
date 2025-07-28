package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ai7  reason: default package */
public final class ai7 implements cw9 {
    public final AtomicBoolean a = new AtomicBoolean(true);
    public final ls9 b;
    public final Executor c;

    public ai7(Executor executor, ls9 ls9) {
        this.c = executor;
        this.b = ls9;
    }

    public final void a(Object obj) {
        this.c.execute(new zo5(this, 13, (bi7) obj));
    }
}
