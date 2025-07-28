package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.sdk.arch.Widget;

/* renamed from: r22  reason: default package */
public final class r22 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatAdminsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r22(ChatAdminsScreen chatAdminsScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = chatAdminsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((kj8) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r22 r22 = new r22(this.Y, continuation);
        r22.X = obj;
        return r22;
    }

    public final Object o(Object obj) {
        String str;
        wx3.H(obj);
        kj8 kj8 = (kj8) this.X;
        boolean z = kj8 instanceof gj8;
        ChatAdminsScreen chatAdminsScreen = this.Y;
        if (z) {
            kdb kdb = kdb.c;
            k77[] k77Arr = ChatAdminsScreen.A0;
            long m0 = chatAdminsScreen.m0();
            long j = ((gj8) kj8).a;
            kdb.getClass();
            kdb.R1(kdb.b2(m0, j));
        } else if (kj8 instanceof fj8) {
            fj8 fj8 = (fj8) kj8;
            int i = fj8.a;
            k77[] k77Arr2 = ChatAdminsScreen.A0;
            chatAdminsScreen.getClass();
            if (i == j8a.p0) {
                y22 l0 = chatAdminsScreen.l0();
                long j2 = fj8.b;
                ez3.N(ez3.J(new djc(new v22(((ap3) l0.o.getValue()).c(j2), (Continuation) null, l0, j2)), ((pae) l0.X.getValue()).b()), l0.a);
            }
        } else if (kj8 instanceof hj8) {
            if (((hj8) kj8).a == j8a.t0) {
                kdb kdb2 = kdb.c;
                k77[] k77Arr3 = ChatAdminsScreen.A0;
                long m02 = chatAdminsScreen.m0();
                d34 P1 = kdb2.P1();
                P1.b(":profile/add-admins?chat_id=" + m02, (Bundle) null);
            }
        } else if (kj8 instanceof jj8) {
            if (((Boolean) chatAdminsScreen.Z.getValue()).booleanValue()) {
                kdb kdb3 = kdb.c;
                long m03 = chatAdminsScreen.m0();
                long longValue = ((Number) chatAdminsScreen.w0.getValue()).longValue();
                kdb3.getClass();
                kdb3.R1(kdb.b2(m03, longValue));
            } else {
                hba hba = new hba((Widget) chatAdminsScreen);
                hba.i(d8.u(chatAdminsScreen.getContext(), cic.w2));
                hba.j();
            }
        } else if (!(kj8 instanceof ij8)) {
            throw new NoWhenBranchMatchedException();
        } else if (((Boolean) chatAdminsScreen.Z.getValue()).booleanValue()) {
            kdb kdb4 = kdb.c;
            long m04 = chatAdminsScreen.m0();
            long j3 = ((ij8) kj8).a;
            kdb4.getClass();
            kdb4.R1(kdb.b2(m04, j3));
        } else {
            hba hba2 = new hba((Widget) chatAdminsScreen);
            i22 q = chatAdminsScreen.l0().q();
            if (q == null || !q.G()) {
                str = d8.u(chatAdminsScreen.getContext(), cic.B);
            } else {
                str = d8.u(chatAdminsScreen.getContext(), cic.w);
            }
            hba2.i(str);
            hba2.j();
        }
        return jue.a;
    }
}
