package defpackage;

import android.view.View;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.pinbars.PinBarsWidget;

/* renamed from: uua  reason: default package */
public final /* synthetic */ class uua implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinBarsWidget b;

    public /* synthetic */ uua(PinBarsWidget pinBarsWidget, int i) {
        this.a = i;
        this.b = pinBarsWidget;
    }

    public final void onClick(View view) {
        tva tva;
        Map map;
        lue lue;
        lue lue2;
        boolean z = true;
        int i = 0;
        a34 a34 = null;
        PinBarsWidget pinBarsWidget = this.b;
        switch (this.a) {
            case 0:
                int i2 = PinBarsWidget.x0;
                sua l0 = pinBarsWidget.l0();
                vua parentController = pinBarsWidget.getParentController();
                vua vua = parentController instanceof vua ? parentController : null;
                if (vua != null) {
                    i = ((ChatScreen) vua).x0().getMeasuredHeight();
                }
                tva tva2 = l0.c;
                if (tva2 != null) {
                    qod qod = tva2.g;
                    if (qod == null || !qod.isActive()) {
                        tva2.g = xs7.E(tva2.d, tva2.b.b(), (ru3) null, new sva(tva2, i, (Continuation) null), 2);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i3 = PinBarsWidget.x0;
                sua l02 = pinBarsWidget.l0();
                rua rua = l02.b;
                Long l = rua.c;
                if (l != null && (tva = l02.c) != null) {
                    long longValue = l.longValue();
                    if (rua.o != 1) {
                        z = false;
                    }
                    Object value = tva.h.getValue();
                    xva xva = value instanceof xva ? (xva) value : null;
                    if (xva != null) {
                        iva.c.getClass();
                        a34 = iva.Z1(longValue, xva.a, z);
                    }
                    if (a34 != null) {
                        taf.o(l02.D0, a34);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int i4 = PinBarsWidget.x0;
                sua l03 = pinBarsWidget.l0();
                ((nb9) l03.A0.b).t();
                l03.Y.h();
                jme jme = pinBarsWidget.a;
                if (jme != null) {
                    jme.dismiss();
                }
                pinBarsWidget.a = null;
                return;
            case 3:
                int i5 = PinBarsWidget.x0;
                rya rya = pinBarsWidget.l0().A0;
                nb9 nb9 = (nb9) rya.b;
                boolean z2 = nb9.x;
                v40 v40 = rya.a;
                if (z2) {
                    ((nb9) v40.a).q();
                    return;
                } else if (nb9.w) {
                    ((nb9) v40.a).r();
                    return;
                } else {
                    return;
                }
            case 4:
                int i6 = PinBarsWidget.x0;
                sua l04 = pinBarsWidget.l0();
                rua rua2 = l04.b;
                Long l2 = rua2.c;
                if (rua2.o != 1) {
                    z = false;
                }
                ua9 n = ((nb9) l04.A0.b).n();
                if (!(n == null || (map = n.c) == null)) {
                    Object obj = map.get("MediaMetadata.Extra.MESSAGE_ID");
                    Long l3 = obj instanceof Long ? (Long) obj : null;
                    if (l3 != null) {
                        long longValue2 = l3.longValue();
                        if (l2 == null) {
                            Object obj2 = map.get("MediaMetadata.Extra.CHAT_ID");
                            Long l4 = obj2 instanceof Long ? (Long) obj2 : null;
                            if (l4 != null) {
                                long longValue3 = l4.longValue();
                                iva.c.getClass();
                                a34 = iva.Z1(longValue3, longValue2, z);
                            }
                        } else {
                            iva iva = iva.c;
                            long longValue4 = l2.longValue();
                            iva.getClass();
                            a34 = iva.Z1(longValue4, longValue2, z);
                        }
                    }
                }
                if (a34 != null) {
                    taf.o(l04.D0, a34);
                    return;
                }
                return;
            case 5:
                int i7 = PinBarsWidget.x0;
                sua l05 = pinBarsWidget.l0();
                vua parentController2 = pinBarsWidget.getParentController();
                vua vua2 = parentController2 instanceof vua ? parentController2 : null;
                int measuredHeight = vua2 != null ? ((ChatScreen) vua2).x0().getMeasuredHeight() : 0;
                oue oue = l05.o;
                if (oue != null && (lue = (lue) oue.i.a.getValue()) != null) {
                    xs7.E(oue.a, oue.c.b(), (ru3) null, new mue(oue, lue.a, (Continuation) null), 2);
                    oue.h.setValue((Object) null);
                    hba hba = (hba) oue.f.getValue();
                    hba.c(new pba(0, measuredHeight, 3));
                    hba.f(new vba(phc.A));
                    hba.h(new hge(b8a.h));
                    hba.j();
                    return;
                }
                return;
            default:
                int i8 = PinBarsWidget.x0;
                oue oue2 = pinBarsWidget.l0().o;
                if (oue2 != null && (lue2 = (lue) oue2.i.a.getValue()) != null) {
                    xs7.E(oue2.a, oue2.c.b(), (ru3) null, new nue(oue2, lue2.a, (Continuation) null), 2);
                    oue2.h.setValue((Object) null);
                    return;
                }
                return;
        }
    }
}
