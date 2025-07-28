package defpackage;

import java.util.concurrent.Executor;

/* renamed from: c93  reason: default package */
public final /* synthetic */ class c93 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd6 b;

    public /* synthetic */ c93(zd6 zd6, int i) {
        this.a = i;
        this.b = zd6;
    }

    public final void execute(Runnable runnable) {
        int i = this.a;
        ((h8e) this.b).d(runnable);
    }
}
