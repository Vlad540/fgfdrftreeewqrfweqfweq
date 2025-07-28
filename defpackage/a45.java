package defpackage;

/* renamed from: a45  reason: default package */
public final /* synthetic */ class a45 implements lh7, kh7, nf3, of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ a45(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((qza) obj).L(this.b, this.c);
                return;
            case 4:
                ((qza) obj).t0(this.b, this.c);
                return;
            default:
                m00 m00 = (m00) obj;
                boolean K = ete.K(m00);
                if (m00.d != null || K) {
                    int i = this.b;
                    int i2 = this.c;
                    if (K) {
                        k10 a2 = m00.b().d.d.a();
                        a2.o = i;
                        a2.p = i2;
                        n10 n10 = new n10(a2);
                        m00 j = m00.b().d.j();
                        j.d = n10;
                        o10 a3 = j.a();
                        u00 a4 = m00.b().a();
                        a4.e = a3;
                        m00.r = new v00(a4);
                        return;
                    }
                    k10 a5 = m00.c().a();
                    a5.o = i;
                    a5.p = i2;
                    m00.d = new n10(a5);
                    return;
                }
                return;
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((hya) obj).m(this.b, this.c);
                return;
            case 1:
                ((gya) obj).m(this.b, this.c);
                return;
            default:
                ((hya) obj).m(this.b, this.c);
                return;
        }
    }
}
