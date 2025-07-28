package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* renamed from: ak8  reason: default package */
public final class ak8 extends l5e implements i26 {
    public final /* synthetic */ MembersListWidget X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ak8(MembersListWidget membersListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.X = membersListWidget;
        this.Y = j;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ak8(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = MembersListWidget.H0;
        MembersListWidget membersListWidget = this.X;
        lj8 n0 = membersListWidget.n0();
        long j = this.Y;
        List list = (List) n0.b.invoke(Long.valueOf(j));
        boolean z = membersListWidget.l0().c;
        jue jue = jue.a;
        if (z && !list.isEmpty()) {
            Long l = new Long(j);
            k77 k77 = MembersListWidget.H0[2];
            membersListWidget.Z.b(membersListWidget, l);
            pfa.a(2).e(list).j(this.Z).g(dh4.c().getDisplayMetrics().density * 12.0f).build().q(membersListWidget);
        }
        return jue;
    }
}
