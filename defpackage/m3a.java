package defpackage;

/* renamed from: m3a  reason: default package */
public final /* synthetic */ class m3a implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3a b;

    public /* synthetic */ m3a(n3a n3a, int i) {
        this.a = i;
        this.b = n3a;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new s15(this.b.d().a());
            case 1:
                return new s15(this.b.d().b());
            case 2:
                x4a d = this.b.d();
                d.getClass();
                k77 k77 = x4a.p[4];
                return new s15(d.d(d.j));
            case 3:
                return new s15(this.b.d().c());
            default:
                x4a d2 = this.b.d();
                d2.getClass();
                k77 k772 = x4a.p[3];
                return new s15(d2.d(d2.i));
        }
    }
}
