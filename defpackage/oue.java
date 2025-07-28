package defpackage;

/* renamed from: oue  reason: default package */
public final class oue {
    public final ou3 a;
    public final ap3 b;
    public final pae c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final grd h;
    public final t0c i;

    public oue(zqd zqd, ou3 ou3, ap3 ap3, pae pae, t97 t97, t97 t972, t97 t973, t97 t974) {
        tf3 k;
        pae pae2 = pae;
        this.a = ou3;
        this.b = ap3;
        this.c = pae2;
        this.d = t972;
        this.e = t973;
        this.f = t974;
        this.g = t97;
        Long l = null;
        grd a2 = hrd.a((Object) null);
        this.h = a2;
        this.i = new t0c(a2);
        i22 i22 = (i22) zqd.getValue();
        if (i22 != null && i22.J() && ((i22.A() || i22.O()) && (k = i22.k()) != null && !k.t())) {
            l = Long.valueOf(k.n());
        }
        if (l != null) {
            ez3.N(ez3.J(new ck5(new ik5(ap3.c(l.longValue()), 2), new kbb(2, this, oue.class, "handleContact", "handleContact(Lru/ok/tamtam/contacts/Contact;)V", 4, 21), 5), ((n3a) pae2).b()), ou3);
        }
    }
}
