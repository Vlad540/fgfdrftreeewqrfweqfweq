package defpackage;

/* renamed from: a5g  reason: default package */
public final class a5g extends m4g {
    public final /* synthetic */ vde b;
    public final /* synthetic */ m4g c;
    public final /* synthetic */ f6g o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a5g(f6g f6g, vde vde, vde vde2, n3g n3g) {
        super(vde);
        this.b = vde2;
        this.c = n3g;
        this.o = f6g;
    }

    public final void a() {
        synchronized (this.o.f) {
            try {
                f6g f6g = this.o;
                vde vde = this.b;
                f6g.e.add(vde);
                vde.a.i(new v4b(f6g, 17, vde));
                if (this.o.k.getAndIncrement() > 0) {
                    this.o.b.b("Already connected to the service.", new Object[0]);
                }
                f6g.b(this.o, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
