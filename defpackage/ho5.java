package defpackage;

import java.util.ArrayList;

/* renamed from: ho5  reason: default package */
public final class ho5 extends dhd implements e36 {
    public final /* synthetic */ int a;
    public final an5 b;

    public /* synthetic */ ho5(p0 p0Var, int i) {
        this.a = i;
        this.b = p0Var;
    }

    public final an5 b() {
        switch (this.a) {
            case 0:
                return new go5(this.b, (Object) null, 0);
            default:
                return new co5(this.b, sr.a, 1);
        }
    }

    public final void l(zhd zhd) {
        an5 an5 = this.b;
        switch (this.a) {
            case 0:
                an5.d(new dn5(zhd, (Object) null));
                return;
            default:
                try {
                    ArrayList arrayList = new ArrayList();
                    h15 h15 = i15.a;
                    an5.d(new oo5(zhd, arrayList));
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    cw4.c(th, zhd);
                    return;
                }
        }
    }
}
