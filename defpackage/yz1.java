package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: yz1  reason: default package */
public final class yz1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChangeOwnerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yz1(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.Y = changeOwnerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yz1 yz1 = new yz1(continuation, this.Y);
        yz1.X = obj;
        return yz1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kj8 kj8 = (kj8) this.X;
        boolean z = kj8 instanceof gj8;
        ChangeOwnerScreen changeOwnerScreen = this.Y;
        if (z) {
            k77[] k77Arr = ChangeOwnerScreen.y0;
            e02 e02 = (e02) changeOwnerScreen.Y.getValue();
            long j = ((gj8) kj8).a;
            boolean m0 = changeOwnerScreen.m0();
            tf3 tf3 = (tf3) ((ap3) e02.X.getValue()).c(j).a.getValue();
            String d = tf3 != null ? tf3.d() : null;
            if (d == null) {
                d = "";
            }
            i22 i22 = (i22) ((aw2) ((bv2) e02.o.getValue())).m(e02.b).a.getValue();
            if (i22 != null) {
                taf.o(e02.Z, new c02(new hge(m0 ? l8a.d0 : l8a.k0), i22.G() ? new jge(l8a.g0, cs.g0(new Object[]{d, i22.p()})) : new jge(l8a.i0, cs.g0(new Object[]{i22.p(), d})), j));
            }
        } else if (kj8 instanceof jj8) {
            hba hba = new hba((Widget) changeOwnerScreen);
            hba.i(d8.u(changeOwnerScreen.getContext(), cic.w2));
            hba.j();
        }
        return jue.a;
    }
}
