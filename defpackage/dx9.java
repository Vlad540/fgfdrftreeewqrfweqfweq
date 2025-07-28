package defpackage;

/* renamed from: dx9  reason: default package */
public final class dx9 implements xv1 {
    public final ww9 a;
    public final /* synthetic */ ex9 b;

    public dx9(ex9 ex9, ww9 ww9) {
        this.b = ex9;
        this.a = ww9;
    }

    public final void cancel() {
        ex9 ex9 = this.b;
        lr lrVar = ex9.b;
        ww9 ww9 = this.a;
        lrVar.remove(ww9);
        if (hhd.f(ex9.c, ww9)) {
            ww9.a();
            ex9.c = null;
        }
        ww9.b.remove(this);
        s16 s16 = ww9.c;
        if (s16 != null) {
            s16.invoke();
        }
        ww9.c = null;
    }
}
