package defpackage;

/* renamed from: xac  reason: default package */
public final class xac {
    public final fb0 a;
    public final z9e b;
    public final vn1 c;
    public final vn1 d;
    public sn1 e;
    public sn1 f;
    public boolean g = false;
    public boolean h = false;
    public ch7 i;

    public xac(fb0 fb0, z9e z9e) {
        this.a = fb0;
        this.b = z9e;
        this.c = hwf.f(new wac(this, 0));
        this.d = hwf.f(new wac(this, 1));
    }

    public final void a() {
        e07.p("The callback can only complete once.", !this.d.b.isDone());
        this.f.b((Object) null);
    }
}
