package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: e09  reason: default package */
public final class e09 extends r6c {
    public final int a = a24.X(((float) 80) * dh4.c().getDisplayMetrics().density);
    public Boolean b;
    public boolean c;
    public final /* synthetic */ MessagesListWidget d;

    public e09(MessagesListWidget messagesListWidget) {
        this.d = messagesListWidget;
    }

    public final void a(RecyclerView recyclerView, int i) {
        this.c = i != 0;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        grd grd;
        Object value;
        f6c adapter;
        grd grd2;
        Object value2;
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        int computeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
        int height = recyclerView.getHeight();
        int i3 = this.a;
        if (computeVerticalScrollRange >= height + i3) {
            LinearLayoutManager q = gp0.q(recyclerView);
            MessagesListWidget messagesListWidget = this.d;
            if (!(q == null || (adapter = recyclerView.getAdapter()) == null)) {
                int j = adapter.j();
                Integer valueOf = Integer.valueOf(j);
                if (j <= 0) {
                    valueOf = null;
                }
                if (!(valueOf == null || q.r(valueOf.intValue() - 1) == null || computeVerticalScrollRange - (computeVerticalScrollOffset + computeVerticalScrollExtent) >= i3)) {
                    Boolean bool = this.b;
                    if (bool == null || bool.equals(Boolean.TRUE)) {
                        k77[] k77Arr = MessagesListWidget.b1;
                        zz8 t0 = messagesListWidget.t0();
                        do {
                            grd2 = t0.v1;
                            value2 = grd2.getValue();
                        } while (!grd2.b(value2, jpc.a((jpc) value2, 0, false, false, (ipc) null, 13)));
                        this.b = Boolean.FALSE;
                        return;
                    }
                    return;
                }
            }
            Boolean bool2 = this.b;
            if (bool2 == null || bool2.equals(Boolean.FALSE)) {
                k77[] k77Arr2 = MessagesListWidget.b1;
                zz8 t02 = messagesListWidget.t0();
                do {
                    grd = t02.v1;
                    value = grd.getValue();
                } while (!grd.b(value, jpc.a((jpc) value, 0, true, false, (ipc) null, 13)));
                this.b = Boolean.TRUE;
            }
        }
    }
}
