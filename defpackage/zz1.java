package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: zz1  reason: default package */
public final class zz1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChangeOwnerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zz1(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.Y = changeOwnerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zz1 zz1 = new zz1(continuation, this.Y);
        zz1.X = obj;
        return zz1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        sg9 sg9 = (sg9) this.X;
        if (sg9 instanceof vdb) {
            kdb.c.a2(((vdb) sg9).b);
        } else {
            boolean z = sg9 instanceof xdb;
            sgc sgc = null;
            rr3 rr3 = this.Y;
            if (z) {
                k77[] k77Arr = ChangeOwnerScreen.y0;
                if (rr3.getRouter().e().size() == 1) {
                    vgc vgc = (vgc) o23.X(rr3.getRouter().e());
                    if (hhd.f(vgc != null ? vgc.a : null, rr3)) {
                        kdb.c.f2();
                    }
                }
                kdb.c.P1().b(":chat-list", (Bundle) null);
            } else if (sg9 instanceof c02) {
                c02 c02 = (c02) sg9;
                Bundle j = jjd.j(new wia[]{new wia("new_owner_id", new Long(c02.d))});
                k77[] k77Arr2 = BottomSheetWidget.B0;
                jc3 a = a24.a(c02.b, j, 4);
                a.f(c02.c);
                k77[] k77Arr3 = ChangeOwnerScreen.y0;
                if (rr3.m0()) {
                    a.b(j8a.q, new hge(l8a.h0));
                } else {
                    int i = j8a.q;
                    hge hge = new hge(l8a.f0);
                    Bundle bundle = a.a;
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = new ArrayList();
                    }
                    parcelableArrayList.add(new kc3(i, hge, 4, false));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList);
                }
                a.c(j8a.p, new hge(l8a.e0));
                ConfirmationBottomSheet e = a.e();
                e.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                if (ygc != null) {
                    sgc = ygc.S();
                }
                e.y0(rr3);
                if (sgc != null) {
                    vgc vgc2 = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc2, true, "BottomSheetWidget");
                    sgc.G(vgc2);
                }
            }
        }
        return jue.a;
    }
}
