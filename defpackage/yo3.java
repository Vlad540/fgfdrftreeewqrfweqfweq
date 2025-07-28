package defpackage;

/* renamed from: yo3  reason: default package */
public final /* synthetic */ class yo3 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yo3(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                return hrd.a((tf3) ((ap3) this.c).a.a.get(Long.valueOf(this.b)));
            case 1:
                if (((jba) obj) != jba.X) {
                    fgb fgb = (fgb) this.c;
                    h5b h5b = fgb.T0;
                    boolean z = h5b.p() && h5b.q();
                    long j = this.b;
                    ((luf) fgb.X.getValue()).a(new f0d(j, z));
                    if (z) {
                        taf.o(fgb.F0, new vdb(j, fgb.b));
                    }
                }
                return jue.a;
            default:
                ((Long) obj).getClass();
                lyd lyd = (lyd) this.c;
                int i = 0;
                for (Object next : ((vxd) lyd.x0.getValue()).b) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ix1 ix1 = (pg7) next;
                        boolean z2 = ix1 instanceof hud;
                        long j2 = this.b;
                        if ((z2 && ((hud) ix1).a == j2) || ((ix1 instanceof ix1) && ix1.b.a == j2)) {
                            lyd.A0.m((Object) null, new uxd(j2, i, 0, 4));
                        }
                        i = i2;
                    } else {
                        p23.G();
                        throw null;
                    }
                }
                return jue.a;
        }
    }
}
