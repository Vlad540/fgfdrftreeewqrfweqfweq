package defpackage;

/* renamed from: o73  reason: default package */
public final class o73 extends dhd {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public o73(dhd dhd, v63 v63) {
        this.a = 3;
        this.c = dhd;
        this.b = v63;
    }

    public final void l(zhd zhd) {
        switch (this.a) {
            case 0:
                ((v63) this.b).i(new b2b((Object) this, 12, (Object) zhd));
                return;
            case 1:
                ((ay7) this.b).a(new cy7(zhd, (dhd) this.c, 0));
                return;
            case 2:
                ((ay7) this.b).a(new i73(zhd, 3, this.c));
                return;
            case 3:
                ((v63) this.b).i(new cy7(zhd, (dhd) this.c, 1));
                return;
            case 4:
                ((dhd) this.b).k(new pn1(zhd, (j6) this.c));
                return;
            case 5:
                ((dhd) this.b).k(new d4b(this, zhd, false, 6));
                return;
            default:
                dhd[] dhdArr = (dhd[]) this.b;
                int length = dhdArr.length;
                int i = 0;
                if (length == 1) {
                    dhdArr[0].k(new v2b(zhd, new mb1(21, this), false, 7));
                    return;
                }
                cjd cjd = new cjd(length, (j26) this.c, zhd);
                zhd.d(cjd);
                while (i < length && !cjd.h()) {
                    dhd dhd = dhdArr[i];
                    if (dhd == null) {
                        cjd.a(new NullPointerException("One of the sources is null"), i);
                        return;
                    } else {
                        dhd.k(cjd.c[i]);
                        i++;
                    }
                }
                return;
        }
    }

    public /* synthetic */ o73(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
