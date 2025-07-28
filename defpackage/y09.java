package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: y09  reason: default package */
public final class y09 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y09(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((hx8) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y09 y09 = new y09(continuation, this.Y);
        y09.X = obj;
        return y09;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        hx8 hx8 = (hx8) this.X;
        boolean f = hhd.f(hx8, gx8.a);
        MessagesListWidget messagesListWidget = this.Y;
        if (f) {
            k77[] k77Arr = MessagesListWidget.b1;
            messagesListWidget.q0().x0(messagesListWidget.E0.j() - 1);
        } else if (hhd.f(hx8, dx8.a)) {
            k77[] k77Arr2 = MessagesListWidget.b1;
            x99 A = messagesListWidget.t0().A();
            A.getClass();
            A.f.m((Object) null, new r99());
        } else if (hx8 instanceof fx8) {
            k77[] k77Arr3 = MessagesListWidget.b1;
            x99 A2 = messagesListWidget.t0().A();
            int i = ((fx8) hx8).a;
            List s0 = o23.s0(((r99) A2.f.getValue()).a);
            boolean isEmpty = s0.isEmpty();
            grd grd = A2.f;
            if (isEmpty) {
                grd.m((Object) null, new r99());
            } else {
                A2.d.invoke(s0, Integer.valueOf(i));
                grd.m((Object) null, new r99());
            }
        } else if (hx8 instanceof ex8) {
            ww4 ww4 = messagesListWidget.Z0;
            if (ww4 != null) {
                ww4.q = true;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
