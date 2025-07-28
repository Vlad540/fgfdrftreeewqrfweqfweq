package defpackage;

/* renamed from: ac7  reason: default package */
public final class ac7 extends yb7 implements dc7 {
    public final pc7 a;
    public final hu3 b;

    public ac7(pc7 pc7, hu3 hu3) {
        this.a = pc7;
        this.b = hu3;
        if (pc7.d == ob7.a) {
            lp.d(hu3);
        }
    }

    public final hu3 getCoroutineContext() {
        return this.b;
    }

    public final void m(nc7 nc7, nb7 nb7) {
        pc7 pc7 = this.a;
        if (pc7.d.compareTo(ob7.a) <= 0) {
            pc7.f(this);
            lp.d(this.b);
        }
    }
}
