package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: i2g  reason: default package */
public final class i2g implements s5g, tx9, kx9, gx9 {
    public final /* synthetic */ int a;
    public final Executor b;
    public final cr3 c;
    public final n6g o;

    public /* synthetic */ i2g(Executor executor, cr3 cr3, n6g n6g, int i) {
        this.a = i;
        this.b = executor;
        this.c = cr3;
        this.o = n6g;
    }

    public void a(Object obj) {
        this.o.n(obj);
    }

    public final void b(Task task) {
        switch (this.a) {
            case 0:
                this.b.execute(new mzf((s5g) this, task, 1));
                return;
            default:
                this.b.execute(new q36((Object) this, (Object) task, false, 29));
                return;
        }
    }

    public void d() {
        this.o.o();
    }

    public void onFailure(Exception exc) {
        this.o.m(exc);
    }
}
