package defpackage;

import java.util.List;

/* renamed from: wc2  reason: default package */
public final /* synthetic */ class wc2 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd2 b;
    public final /* synthetic */ hc2 c;

    public /* synthetic */ wc2(bd2 bd2, hc2 hc2, int i) {
        this.a = i;
        this.b = bd2;
        this.c = hc2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                bd2 bd2 = this.b;
                bd2.getClass();
                hc2 hc2 = this.c;
                bd2.f(new yc2((List) obj, true, false, hc2.c, hc2.o, hc2.X));
                return;
            default:
                bd2 bd22 = this.b;
                bd22.getClass();
                hc2 hc22 = this.c;
                bd22.f(new yc2((List) obj, false, false, hc22.c, hc22.o, hc22.X));
                return;
        }
    }
}
