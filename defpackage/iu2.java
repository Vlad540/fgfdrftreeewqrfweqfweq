package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* renamed from: iu2  reason: default package */
public final class iu2 extends l5e implements o26 {
    public /* synthetic */ hq2 X;
    public /* synthetic */ List Y;
    public /* synthetic */ List Z;
    public /* synthetic */ List w0;
    public final /* synthetic */ ChatsListWidget x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iu2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(5, continuation);
        this.x0 = chatsListWidget;
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu2 iu2 = new iu2((Continuation) obj5, this.x0);
        iu2.X = (hq2) obj;
        iu2.Y = (List) obj2;
        iu2.Z = (List) obj3;
        iu2.w0 = (List) obj4;
        jue jue = jue.a;
        iu2.o(jue);
        return jue;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [rr3, one.me.chats.list.ChatsListWidget] */
    /* JADX WARNING: type inference failed for: r0v1, types: [fv4, ig7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r0v6, types: [mr5, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        hq2 hq2 = this.X;
        List list = this.Y;
        List list2 = this.Z;
        List list3 = this.w0;
        hq2 hq22 = hq2.c;
        hw4 hw4 = hw4.a;
        ? r5 = this.x0;
        if (hq2 == hq22) {
            r5.E0.E(hw4);
        } else {
            r5.E0.E(list);
        }
        r5.D0.E(hq2.a);
        View view = r5.getView();
        boolean z = hq2.b;
        if (view != null) {
            r5.n0().setRefreshingNext(z);
        }
        r5.F0.E(list2);
        cpf cpf = r5.G0;
        if (z) {
            cpf.E(hw4);
        } else if (hhd.f(r5.b, "all.chat.folder")) {
            cpf.E(list3);
        }
        return jue.a;
    }
}
