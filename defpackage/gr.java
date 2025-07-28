package defpackage;

import java.util.concurrent.Executor;

/* renamed from: gr  reason: default package */
public final /* synthetic */ class gr implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ gr(int i) {
        this.a = i;
    }

    private final void a(Runnable runnable) {
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                hr.U().j.k.execute(runnable);
                return;
            case 1:
                return;
            default:
                runnable.run();
                return;
        }
    }
}
