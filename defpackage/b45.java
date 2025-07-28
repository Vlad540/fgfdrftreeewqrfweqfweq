package defpackage;

/* renamed from: b45  reason: default package */
public final /* synthetic */ class b45 implements nh7, lh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n45 b;

    public /* synthetic */ b45(n45 n45, int i) {
        this.a = i;
        this.b = n45;
    }

    public void d(Object obj, wi5 wi5) {
        n45 n45 = this.b;
        n45.getClass();
        ((hya) obj).Y(n45.Z, new fya(wi5));
    }

    public void invoke(Object obj) {
        hya hya = (hya) obj;
        switch (this.a) {
            case 1:
                hya.c0(this.b.d1);
                return;
            default:
                hya.q0(this.b.b1);
                return;
        }
    }
}
