package defpackage;

import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* renamed from: zj8  reason: default package */
public final class zj8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MembersListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zj8(Continuation continuation, MembersListWidget membersListWidget) {
        super(2, continuation);
        this.Y = membersListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((dj8) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zj8 zj8 = new zj8(continuation, this.Y);
        zj8.X = obj;
        return zj8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        dj8 dj8 = (dj8) this.X;
        boolean z = dj8 instanceof bj8;
        MembersListWidget membersListWidget = this.Y;
        if (z) {
            k77[] k77Arr = MembersListWidget.H0;
            uj8 o0 = membersListWidget.o0();
            Collection collection = ((bj8) dj8).a;
            qod qod = o0.z0;
            if (qod == null || !qod.isActive()) {
                o0.z0 = taf.n(o0, ((pae) o0.Z.getValue()).a(), (ru3) null, new sj8(o0, collection, (Continuation) null), 2);
            }
        } else if (dj8 instanceof cj8) {
            k77[] k77Arr2 = MembersListWidget.H0;
            uj8 o02 = membersListWidget.o0();
            pi8 pi8 = new pi8(o02.b, o02.c, o02.y0);
            xi8 xi8 = o02.Y;
            xi8.getClass();
            xs7.E(xi8.b, (hu3) null, (ru3) null, new wi8(xi8, pi8, (Continuation) null), 3);
            o02.y0 = qw4.a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
