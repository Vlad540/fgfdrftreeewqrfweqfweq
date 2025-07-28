package defpackage;

import java.util.Collection;

/* renamed from: rs9  reason: default package */
public final class rs9 extends dhd implements f36 {
    public final /* synthetic */ int a = 1;
    public final nv9 b;
    public final Object c;

    public rs9(nv9 nv9) {
        this.b = nv9;
        this.c = new y26();
    }

    public final ms9 c() {
        switch (this.a) {
            case 0:
                return new ps9(this.b, (v1b) this.c, 0);
            default:
                return new ov9(this.b, (y26) this.c, 2);
        }
    }

    public final void l(zhd zhd) {
        nv9 nv9 = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                nv9.a(new qs9(zhd, (v1b) obj));
                return;
            default:
                try {
                    Object obj2 = ((y26) obj).get();
                    h15 h15 = i15.a;
                    nv9.a(new i73(zhd, 5, (Collection) obj2));
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    cw4.c(th, zhd);
                    return;
                }
        }
    }

    public rs9(nv9 nv9, v1b v1b) {
        this.b = nv9;
        this.c = v1b;
    }
}
