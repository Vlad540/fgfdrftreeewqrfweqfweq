package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ww9  reason: default package */
public abstract class ww9 {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public s16 c;

    public ww9(boolean z) {
        this.a = z;
    }

    public void a() {
    }

    public abstract void b();

    public void c(gd0 gd0) {
    }

    public void d() {
    }

    public final void e() {
        for (xv1 cancel : this.b) {
            cancel.cancel();
        }
    }

    public final void f(boolean z) {
        this.a = z;
        s16 s16 = this.c;
        if (s16 != null) {
            s16.invoke();
        }
    }
}
