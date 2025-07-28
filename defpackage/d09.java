package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: d09  reason: default package */
public final class d09 extends r6c {
    public int a = -1;
    public int b = -1;
    public final /* synthetic */ MessagesListWidget c;

    public d09(MessagesListWidget messagesListWidget) {
        this.c = messagesListWidget;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        ipc ipc;
        LinearLayoutManager q = gp0.q(recyclerView);
        if (q != null) {
            int W0 = q.W0();
            int Y0 = q.Y0();
            if (W0 != -1 && Y0 != -1) {
                if (W0 != this.a || Y0 != this.b) {
                    this.a = W0;
                    this.b = Y0;
                    k77[] k77Arr = MessagesListWidget.b1;
                    MessagesListWidget messagesListWidget = this.c;
                    zz8 t0 = messagesListWidget.t0();
                    uw8 uw8 = messagesListWidget.E0;
                    pg7 pg7 = (pg7) o23.Y(W0, uw8.o.f);
                    MessageModel K = pg7 instanceof MessageModel ? (MessageModel) pg7 : pg7 instanceof y62 ? uw8.K(W0 + 1) : null;
                    MessageModel K2 = uw8.K(Y0);
                    t0.getClass();
                    if (K != null && K2 != null && (ipc = ((jpc) t0.w1.a.getValue()).d) != null) {
                        long j = K.c;
                        long j2 = ipc.b;
                        if (j <= j2 && j2 <= K2.c) {
                            xs7.E(t0.a, t0.Y.b(), (ru3) null, new my8(t0, (Continuation) null), 2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Only linear layout manger supported");
    }
}
