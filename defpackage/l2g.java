package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: l2g  reason: default package */
public final class l2g {
    public int a;
    public mj7 b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    public final Executor g;
    public volatile ww h;
    public volatile ww i;
    public final Semaphore j;
    public final Set k;

    public l2g(Context context, Set set) {
        ThreadPoolExecutor threadPoolExecutor = ww.w0;
        context.getApplicationContext();
        this.g = threadPoolExecutor;
        this.j = new Semaphore(0);
        this.k = set;
    }

    public final void a() {
        if (this.h != null) {
            if (!this.c) {
                this.f = true;
            }
            if (this.i != null) {
                this.h.getClass();
                this.h = null;
                return;
            }
            this.h.getClass();
            ww wwVar = this.h;
            wwVar.o.set(true);
            if (wwVar.b.cancel(false)) {
                this.i = this.h;
            }
            this.h = null;
        }
    }

    public final void b() {
        if (this.i == null && this.h != null) {
            this.h.getClass();
            ww wwVar = this.h;
            Executor executor = this.g;
            if (wwVar.c != 1) {
                int t = hr1.t(wwVar.c);
                if (t == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                } else if (t != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                wwVar.c = 2;
                wwVar.a.b = null;
                executor.execute(wwVar.b);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        xy6.e(sb, this);
        sb.append(" id=");
        return wn6.j(sb, this.a, "}");
    }
}
