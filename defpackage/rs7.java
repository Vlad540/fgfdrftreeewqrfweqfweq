package defpackage;

/* renamed from: rs7  reason: default package */
public final /* synthetic */ class rs7 implements r3e {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ xzc Y;
    public final /* synthetic */ t52 a;
    public final /* synthetic */ di3 b;
    public final /* synthetic */ kn3 c;
    public final /* synthetic */ gsc o;

    public /* synthetic */ rs7(t52 t52, di3 di3, kn3 kn3, gsc gsc, boolean z, xzc xzc) {
        this.a = t52;
        this.b = di3;
        this.c = kn3;
        this.o = gsc;
        this.X = z;
        this.Y = xzc;
    }

    public final Object get() {
        vqc vqc = (vqc) this.Y;
        bsc bsc = null;
        String[] strArr = vqc.u() ? (String[]) vqc.l.getValue() : null;
        t52 t52 = this.a;
        di3 di3 = this.b;
        kn3 kn3 = this.c;
        gsc gsc = this.o;
        boolean z = this.X;
        asc asc = new asc(t52, di3, kn3, gsc, z);
        if (strArr != null) {
            if (!(!(strArr.length == 0))) {
                strArr = null;
            }
            if (strArr != null) {
                bsc = new bsc(strArr, t52, gsc);
            }
        }
        return new zrc(t52, di3, gsc, z, asc, bsc);
    }
}
