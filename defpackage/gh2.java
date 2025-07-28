package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.sdk.arch.Widget;

/* renamed from: gh2  reason: default package */
public final class gh2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMembersCompactWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gh2(ChatMembersCompactWidget chatMembersCompactWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = chatMembersCompactWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((kj8) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gh2 gh2 = new gh2(this.Y, continuation);
        gh2.X = obj;
        return gh2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kj8 kj8 = (kj8) this.X;
        if (kj8 instanceof gj8) {
            kdb.c.e2(((gj8) kj8).a);
        } else {
            boolean z = kj8 instanceof fj8;
            ChatMembersCompactWidget chatMembersCompactWidget = this.Y;
            if (z) {
                fj8 fj8 = (fj8) kj8;
                int i = fj8.a;
                k77[] k77Arr = ChatMembersCompactWidget.Z;
                chatMembersCompactWidget.getClass();
                int i2 = j8a.s0;
                long j = fj8.b;
                if (i == i2) {
                    lj8 n0 = chatMembersCompactWidget.n0();
                    n0.Z.m((Object) null, Collections.singleton(Long.valueOf(j)));
                } else if (i == j8a.r0) {
                    di2 m0 = chatMembersCompactWidget.m0();
                    taf.n(m0, ((pae) m0.Y.getValue()).b(), (ru3) null, new zh2(m0, j, (Continuation) null), 2);
                }
            } else if (kj8 instanceof hj8) {
                int i3 = ((hj8) kj8).a;
                if (i3 == j8a.u0) {
                    kdb kdb = kdb.c;
                    k77[] k77Arr2 = ChatMembersCompactWidget.Z;
                    kdb.Z1(chatMembersCompactWidget.l0());
                } else if (i3 == j8a.D0) {
                    kdb kdb2 = kdb.c;
                    k77[] k77Arr3 = ChatMembersCompactWidget.Z;
                    kdb2.c2(chatMembersCompactWidget.l0());
                } else if (i3 == j8a.W0) {
                    kdb kdb3 = kdb.c;
                    k77[] k77Arr4 = ChatMembersCompactWidget.Z;
                    kdb3.d2(chatMembersCompactWidget.l0(), "MEMBER");
                }
            } else if (kj8 instanceof ij8) {
                kdb.c.e2(((ij8) kj8).a);
            } else if (kj8 instanceof jj8) {
                hba hba = new hba((Widget) chatMembersCompactWidget);
                hba.i(d8.u(chatMembersCompactWidget.getContext(), cic.w2));
                hba.j();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
