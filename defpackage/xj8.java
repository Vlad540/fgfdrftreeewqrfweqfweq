package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* renamed from: xj8  reason: default package */
public final class xj8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MembersListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xj8(Continuation continuation, MembersListWidget membersListWidget) {
        super(2, continuation);
        this.Y = membersListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xj8 xj8 = new xj8(continuation, this.Y);
        xj8.X = obj;
        return xj8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        Set set = (Set) this.X;
        k77[] k77Arr = MembersListWidget.H0;
        MembersListWidget membersListWidget = this.Y;
        if (!membersListWidget.n0().r()) {
            tw2 tw2 = membersListWidget.F0;
            if (tw2 != null) {
                membersListWidget.m0().p0(tw2);
            }
            membersListWidget.F0 = null;
            u24 u24 = membersListWidget.G0;
            if (u24 != null) {
                membersListWidget.m0().r0(u24);
            }
            membersListWidget.G0 = null;
        } else if (membersListWidget.F0 == null) {
            e98 e98 = new e98(3, membersListWidget);
            tw2 tw22 = new tw2(new vj8(membersListWidget, 0), new ka(e98, 19, membersListWidget), new e12(3, e98), new e12(4, e98));
            membersListWidget.m0().j(tw22);
            membersListWidget.F0 = tw22;
            u24 u242 = new u24(membersListWidget.m0());
            membersListWidget.m0().l(u242);
            membersListWidget.G0 = u242;
        }
        membersListWidget.m0().Y();
        return jue.a;
    }
}
