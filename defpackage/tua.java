package defpackage;

import one.me.pinbars.PinBarsWidget;

/* renamed from: tua  reason: default package */
public final /* synthetic */ class tua implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinBarsWidget b;

    public /* synthetic */ tua(PinBarsWidget pinBarsWidget, int i) {
        this.a = i;
        this.b = pinBarsWidget;
    }

    public final Object invoke() {
        PinBarsWidget pinBarsWidget = this.b;
        switch (this.a) {
            case 0:
                int i = PinBarsWidget.x0;
                tc6 tc6 = pinBarsWidget.l0().X;
                if (tc6 != null) {
                    i22 i22 = (i22) tc6.a.getValue();
                    String str = null;
                    if (i22 != null) {
                        o62 o62 = i22.b;
                        n00 n00 = o62 == null ? null : o62.T;
                        if (n00 != null) {
                            str = n00.c;
                        }
                    }
                    if (str == null || str.length() == 0) {
                        udd.q(tc6.class.getName(), "Can't join to group call in chat because joinLink is empty");
                    } else {
                        tc6.g.g(new yc6(str));
                    }
                }
                return jue.a;
            case 1:
                int i2 = PinBarsWidget.x0;
                return pinBarsWidget.getRouter();
            case 2:
                int i3 = PinBarsWidget.x0;
                qua qua = qua.a;
                r7e d = qua.getAccessor().d(ap3.class);
                r7e d2 = qua.getAccessor().d(ch3.class);
                r7e d3 = qua.getAccessor().d(xf3.class);
                r7e d4 = qua.getAccessor().d(f03.class);
                r7e d5 = qua.getAccessor().d(jb5.class);
                return new sua((pae) qua.getAccessor().c(pae.class), qua.getAccessor().d(ho2.class), qua.getAccessor().d(pj2.class), qua.getAccessor().d(kp2.class), d, d2, d3, qua.getAccessor().d(so1.class), qua.getAccessor().d(r59.class), d4, d5, (va9) qua.getAccessor().c(va9.class), qua.getAccessor().d(hba.class), (rua) pinBarsWidget.b.getValue());
            default:
                int i4 = PinBarsWidget.x0;
                return new we1(new r7e(new tua(pinBarsWidget, 1)), new jrf(pinBarsWidget, 0));
        }
    }
}
