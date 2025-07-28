package defpackage;

/* renamed from: a1  reason: default package */
public final class a1 implements Runnable {
    public final l1 a;
    public final ch7 b;

    public a1(l1 l1Var, ch7 ch7) {
        this.a = l1Var;
        this.b = ch7;
    }

    public final void run() {
        if (this.a.a == this) {
            if (l1.Y.h(this.a, this, l1.f(this.b))) {
                l1.b(this.a);
            }
        }
    }
}
