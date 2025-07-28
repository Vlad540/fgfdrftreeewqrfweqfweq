package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: yk2  reason: default package */
public final class yk2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yk2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((yk2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yk2 yk2 = new yk2(continuation, this.Y);
        yk2.X = obj;
        return yk2;
    }

    public final Object o(Object obj) {
        tt6 tt6;
        wx3.H(obj);
        fm2 fm2 = (fm2) this.X;
        boolean z = fm2 instanceof cm2;
        ygc ygc = this.Y;
        if (z) {
            cm2 cm2 = (cm2) fm2;
            List list = cm2.a;
            k77[] k77Arr = ChatScreen.n1;
            ygc.getClass();
            pfa.a(1).e(list).h(cm2.b).j(cm2.c).b().build().q(ygc);
        } else if (fm2 instanceof em2) {
            em2 em2 = (em2) fm2;
            ygc.Y.e(gq1.b, false);
            if (em2.a != 0) {
                ygc.z0().l(em2.a, false, new jk2(em2, 0));
            } else {
                String str = em2.c;
                if (!(str == null || str.length() == 0)) {
                    we1 z0 = ygc.z0();
                    if (str != null) {
                        z0.j(str, true, false, false, new jk2(em2, 1));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    long j = em2.b;
                    if (j != 0) {
                        ygc.z0().i(j, false, new jk2(em2, 2));
                    }
                }
            }
        } else if (fm2 instanceof dm2) {
            dm2 dm2 = (dm2) fm2;
            ChatScreen.P0(this.Y, new Integer(dm2.a), (String) null, dm2.b, dm2.c, 2);
        } else {
            sgc sgc = null;
            if (fm2 instanceof am2) {
                k77[] k77Arr2 = BottomSheetWidget.B0;
                am2 am2 = (am2) fm2;
                jc3 a = a24.a(am2.a, (Bundle) null, 6);
                am2.b.forEach(new nl2(new hh2(1, a, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 1), 0));
                ConfirmationBottomSheet e = a.e();
                e.setTargetController(ygc);
                ygc ygc2 = ygc;
                while (ygc2.getParentController() != null) {
                    ygc2 = ygc2.getParentController();
                }
                ygc ygc3 = ygc2 instanceof ygc ? ygc2 : null;
                if (ygc3 != null) {
                    sgc = ygc3.S();
                }
                e.y0(ygc);
                if (sgc != null) {
                    vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    sgc.G(vgc);
                }
            } else if (fm2 instanceof bm2) {
                bm2 bm2 = (bm2) fm2;
                k77[] k77Arr3 = ChatScreen.n1;
                MessageWriteWidget C0 = ygc.C0();
                if (C0 != null) {
                    CharSequence charSequence = bm2.a;
                    C0.p0().setText(charSequence);
                    if (!(charSequence == null || charSequence.length() == 0)) {
                        C0.p0().h(charSequence.length());
                    }
                }
                ((e3e) ygc.J0.getValue()).r(bm2.a);
                Long l = bm2.b;
                if (l != null) {
                    ygc.B0().D(l);
                } else {
                    Long l2 = bm2.c;
                    if (l2 != null) {
                        nu8.C(ygc.B0(), l2, (CharSequence) null, (Integer) null, 6);
                    }
                }
            } else if (fm2 instanceof yl2) {
                yl2 yl2 = (yl2) fm2;
                int i = yl2.a;
                k77[] k77Arr4 = ChatScreen.n1;
                ygc.B0().D((Long) null);
                if (!yl2.c) {
                    ygc.B0().s();
                }
                ygc.D0().q((wia) null);
                t97 t97 = ygc.k1;
                tt6 tt62 = (tt6) t97.getValue();
                if (tt62 != null) {
                    tt62.f(Collections.singleton(new st6(qt6.SEND_5_MESSAGES, i)), mnc.Q0);
                }
                gv5 gv5 = yl2.b;
                if (!(gv5 == null || (tt6 = (tt6) t97.getValue()) == null)) {
                    tt6.f(gv5.a, gv5.b);
                }
            } else if (fm2 instanceof wl2) {
                k77[] k77Arr5 = ChatScreen.n1;
                ygc.B0().s();
                if (!((wl2) fm2).a) {
                    ygc.getRouter().C();
                }
            } else if (hhd.f(fm2, zl2.a)) {
                k77[] k77Arr6 = ChatScreen.n1;
                ygc.F0().r(true);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
