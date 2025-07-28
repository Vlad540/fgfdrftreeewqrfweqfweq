package defpackage;

/* renamed from: fx7  reason: default package */
public final class fx7 extends ax7 {
    public final yx7 a;

    public fx7(yx7 yx7) {
        this.a = yx7;
    }

    public final void g(wx7 wx7) {
        ex7 ex7 = new ex7(0, wx7);
        wx7.d(ex7);
        try {
            this.a.c(ex7);
        } catch (Throwable th) {
            ek8.a0(th);
            ex7.onError(th);
        }
    }
}
