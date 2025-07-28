package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* renamed from: wj8  reason: default package */
public final class wj8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MembersListWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wj8(Continuation continuation, MembersListWidget membersListWidget, View view) {
        super(2, continuation);
        this.Y = membersListWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wj8 wj8 = new wj8(continuation, this.Y, this.Z);
        wj8.X = obj;
        return wj8;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    public final Object o(Object obj) {
        wx3.H(obj);
        mj8 mj8 = (mj8) this.X;
        boolean z = mj8.d;
        List list = hw4.a;
        MembersListWidget membersListWidget = this.Y;
        List list2 = mj8.a;
        if (z) {
            membersListWidget.y0.E(list);
            membersListWidget.z0.E(list);
            i41 i41 = membersListWidget.B0;
            if (list2.isEmpty()) {
                list = Collections.singletonList(nw4.a);
            }
            i41.E(list);
        } else {
            membersListWidget.y0.E(mj8.b);
            membersListWidget.B0.E(list);
            membersListWidget.z0.E(mj8.c);
        }
        k77[] k77Arr = MembersListWidget.H0;
        membersListWidget.m0().setOverScrollMode(membersListWidget.o != null ? 2 : 1);
        membersListWidget.x0.E(list2);
        if (this.Z != null) {
            membersListWidget.m0().setRefreshingNext(mj8.e);
        }
        return jue.a;
    }
}
