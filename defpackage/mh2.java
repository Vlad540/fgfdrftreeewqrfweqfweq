package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.sdk.arch.Widget;

/* renamed from: mh2  reason: default package */
public final class mh2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMembersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mh2(Continuation continuation, ChatMembersScreen chatMembersScreen) {
        super(2, continuation);
        this.Y = chatMembersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((kj8) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mh2 mh2 = new mh2(continuation, this.Y);
        mh2.X = obj;
        return mh2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kj8 kj8 = (kj8) this.X;
        if (kj8 instanceof gj8) {
            kdb.c.e2(((gj8) kj8).a);
        } else {
            boolean z = kj8 instanceof fj8;
            ChatMembersScreen chatMembersScreen = this.Y;
            if (z) {
                fj8 fj8 = (fj8) kj8;
                int i = fj8.a;
                k77[] k77Arr = ChatMembersScreen.y0;
                chatMembersScreen.getClass();
                int i2 = j8a.s0;
                long j = fj8.b;
                if (i == i2) {
                    lj8 n0 = chatMembersScreen.n0();
                    n0.Z.m((Object) null, Collections.singleton(Long.valueOf(j)));
                } else if (i == j8a.r0 || i == j8a.q0) {
                    di2 m0 = chatMembersScreen.m0();
                    taf.n(m0, ((pae) m0.Y.getValue()).b(), (ru3) null, new zh2(m0, j, (Continuation) null), 2);
                }
            } else if (kj8 instanceof hj8) {
                int i3 = ((hj8) kj8).a;
                if (i3 == j8a.u0) {
                    kdb kdb = kdb.c;
                    k77[] k77Arr2 = ChatMembersScreen.y0;
                    kdb.Z1(chatMembersScreen.l0());
                } else if (i3 == j8a.D0) {
                    kdb kdb2 = kdb.c;
                    k77[] k77Arr3 = ChatMembersScreen.y0;
                    kdb2.c2(chatMembersScreen.l0());
                }
            } else if (kj8 instanceof ij8) {
                kdb.c.e2(((ij8) kj8).a);
            } else if (kj8 instanceof jj8) {
                hba hba = new hba((Widget) chatMembersScreen);
                hba.i(d8.u(chatMembersScreen.getContext(), cic.w2));
                hba.j();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
