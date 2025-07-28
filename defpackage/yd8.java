package defpackage;

import java.util.List;

/* renamed from: yd8  reason: default package */
public final /* synthetic */ class yd8 implements je8, ke8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ me8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yd8(me8 me8, int i, int i2) {
        this.a = i2;
        this.b = me8;
        this.c = i;
    }

    public void b(qza qza, ic8 ic8, List list) {
        switch (this.a) {
            case 1:
                qza.d0(this.b.J0(ic8, qza, this.c), list);
                return;
            case 2:
                me8 me8 = this.b;
                me8.getClass();
                int size = list.size();
                int i = this.c;
                if (size == 1) {
                    qza.A0(me8.J0(ic8, qza, i), (l68) list.get(0));
                    return;
                } else {
                    qza.s0(list, me8.J0(ic8, qza, i), me8.J0(ic8, qza, i + 1));
                    return;
                }
            default:
                qza.d0(this.b.J0(ic8, qza, this.c), list);
                return;
        }
    }

    public void g(qza qza, ic8 ic8) {
        switch (this.a) {
            case 0:
                qza.Z(this.b.J0(ic8, qza, this.c));
                return;
            default:
                qza.S(this.b.J0(ic8, qza, this.c));
                return;
        }
    }
}
