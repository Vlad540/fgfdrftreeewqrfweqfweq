package defpackage;

/* renamed from: h2c  reason: default package */
public final /* synthetic */ class h2c implements v1b, j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2c b;

    public /* synthetic */ h2c(i2c i2c, int i) {
        this.a = i;
        this.b = i2c;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                i2c i2c = this.b;
                i2c.getClass();
                return new y63(1, new sz(i2c, 8, (tf3) obj));
            default:
                i2c i2c2 = this.b;
                i2c2.getClass();
                return new y63(1, new sz(i2c2, 9, (i22) obj));
        }
    }

    public boolean test(Object obj) {
        tf3 k;
        tf3 k2;
        tf3 k3;
        xm8 xm8;
        switch (this.a) {
            case 0:
                i22 E = this.b.a.E(((tf3) obj).n());
                return E == null || E.b.Y == 0;
            case 1:
                i22 i22 = (i22) obj;
                return !this.b.a.P(i22) && i22.b.Z != 0 && i22.J() && ((k = i22.k()) == null || !k.s());
            case 2:
                i22 i222 = (i22) obj;
                this.b.getClass();
                return i222.b.Y != 0 && ((k2 = i222.k()) == null || !k2.s());
            case 3:
                i22 i223 = (i22) obj;
                this.b.getClass();
                return i223.J() && ((k3 = i223.k()) == null || !k3.s()) && i223.b.g() && (xm8 = i223.c) != null && !xm8.a.v();
            default:
                tf3 tf3 = (tf3) obj;
                this.b.getClass();
                return tf3.a.c.r != 0 && !tf3.s();
        }
    }
}
