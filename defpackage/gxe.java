package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: gxe  reason: default package */
public final /* synthetic */ class gxe implements j26, v1b {
    public final /* synthetic */ int a;
    public final /* synthetic */ hxe b;

    public /* synthetic */ gxe(hxe hxe, int i) {
        this.a = i;
        this.b = hxe;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ys8 ys8 = (ys8) obj;
                hxe hxe = this.b;
                hxe.getClass();
                return ys8.d == 2 ? ((gt3) hxe.d.get()).a(ys8) : ms9.m(ys8);
            case 1:
                this.b.getClass();
                return hxe.b((ys8) obj);
            default:
                wve wve = (wve) obj;
                hxe hxe2 = this.b;
                hxe2.getClass();
                if (!sxe.b(wve.a.c) || !wve.a()) {
                    return ms9.m(new bt8(wve, (osd) null));
                }
                return new au9(hxe2.b.a(wve.h.a).n(), new bwe(wve, 3), 3);
        }
    }

    public boolean test(Object obj) {
        Throwable th = (Throwable) obj;
        this.b.getClass();
        return (th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b);
    }
}
