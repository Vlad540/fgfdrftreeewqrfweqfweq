package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaListWidget;

/* renamed from: sc2  reason: default package */
public final class sc2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sc2(Continuation continuation, ChatMediaListWidget chatMediaListWidget) {
        super(2, continuation);
        this.Y = chatMediaListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sc2 sc2 = new sc2(continuation, this.Y);
        sc2.X = obj;
        return sc2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        le2 le2 = (le2) this.X;
        ChatMediaListWidget chatMediaListWidget = this.Y;
        ChatMediaListWidget.l0(chatMediaListWidget).setRefreshingNext(false);
        LinearLayoutManager layoutManager = ChatMediaListWidget.l0(chatMediaListWidget).getLayoutManager();
        pc2 pc2 = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        Integer num = linearLayoutManager != null ? new Integer(linearLayoutManager.T0()) : null;
        pc2 adapter = ChatMediaListWidget.l0(chatMediaListWidget).getAdapter();
        if (adapter instanceof pc2) {
            pc2 = adapter;
        }
        if (pc2 != null) {
            pc2.E(le2.a);
        }
        if (num != null && num.intValue() == 0) {
            ChatMediaListWidget.l0(chatMediaListWidget).B0(0);
        }
        return jue.a;
    }
}
