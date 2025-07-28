package defpackage;

/* renamed from: cx9  reason: default package */
public final class cx9 implements dc7, xv1 {
    public final pc7 a;
    public final ww9 b;
    public dx9 c;
    public final /* synthetic */ ex9 o;

    public cx9(ex9 ex9, pc7 pc7, ww9 ww9) {
        this.o = ex9;
        this.a = pc7;
        this.b = ww9;
        pc7.a(this);
    }

    public final void cancel() {
        this.a.f(this);
        this.b.b.remove(this);
        dx9 dx9 = this.c;
        if (dx9 != null) {
            dx9.cancel();
        }
        this.c = null;
    }

    public final void m(nc7 nc7, nb7 nb7) {
        if (nb7 == nb7.ON_START) {
            this.c = this.o.b(this.b);
        } else if (nb7 == nb7.ON_STOP) {
            dx9 dx9 = this.c;
            if (dx9 != null) {
                dx9.cancel();
            }
        } else if (nb7 == nb7.ON_DESTROY) {
            cancel();
        }
    }
}
