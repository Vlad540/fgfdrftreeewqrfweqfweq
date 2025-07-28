package defpackage;

import android.app.Application;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: a09  reason: default package */
public final /* synthetic */ class a09 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ a09(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    public final Object invoke() {
        boolean z = true;
        boolean z2 = false;
        MessagesListWidget messagesListWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MessagesListWidget.b1;
                return Boolean.valueOf(messagesListWidget.t0().A().d());
            case 1:
                k77[] k77Arr2 = MessagesListWidget.b1;
                return new ij5((Application) xv8.a.getAccessor().c(Application.class), new b09(messagesListWidget, 2));
            case 2:
                k77[] k77Arr3 = MessagesListWidget.b1;
                return new cx8(messagesListWidget.q0(), new a09(messagesListWidget, 5));
            case 3:
                k77[] k77Arr4 = MessagesListWidget.b1;
                a09 a09 = new a09(messagesListWidget, 4);
                vqc vqc = (vqc) ((xzc) xv8.a.getAccessor().c(xzc.class));
                vqc.getClass();
                int i = 40;
                int o = (int) vqc.o(PmsKey.f80msggetreactionspagesize, (long) 40);
                if (o > 0) {
                    i = o;
                }
                if (((pyb) messagesListWidget.p0().q().n.getValue()).compareTo(pyb.b) < 0) {
                    z = false;
                }
                return new d2b(a09, i, z, (qf3) messagesListWidget.p0().q().o.getValue());
            case 4:
                k77[] k77Arr5 = MessagesListWidget.b1;
                List<MessageModel> list = ((tw8) messagesListWidget.t0().s1.getValue()).a;
                ArrayList arrayList = new ArrayList(q23.H(list, 10));
                for (MessageModel messageModel : list) {
                    arrayList.add(Long.valueOf(messageModel.b));
                }
                return arrayList;
            case 5:
                k77[] k77Arr6 = MessagesListWidget.b1;
                if ((((tw8) messagesListWidget.t0().s1.getValue()).b || ((tw8) messagesListWidget.t0().s1.getValue()).c) && !messagesListWidget.q0().O0()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                k77[] k77Arr7 = MessagesListWidget.b1;
                return messagesListWidget.getRouter();
            case 7:
                k77[] k77Arr8 = MessagesListWidget.b1;
                zz8 t0 = messagesListWidget.t0();
                i22 i22 = (i22) t0.r1.a.getValue();
                if (i22 != null && (t0.A().d() || !i22.R(((gn8) t0.K0.getValue()).g()) || !i22.b.g())) {
                    z2 = true;
                }
                return Boolean.valueOf(!z2);
            case 8:
                k77[] k77Arr9 = MessagesListWidget.b1;
                messagesListWidget.getContext();
                return new MessagesLayoutManager();
            case 9:
                k77[] k77Arr10 = MessagesListWidget.b1;
                return new f29(messagesListWidget.q0(), messagesListWidget.t0().b, messagesListWidget.t0().A1, messagesListWidget.E0, messagesListWidget.r0());
            case 10:
                k77[] k77Arr11 = MessagesListWidget.b1;
                FrameLayout frameLayout = new FrameLayout(messagesListWidget.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return frameLayout;
            case 11:
                k77[] k77Arr12 = MessagesListWidget.b1;
                dzb dzb = new dzb(messagesListWidget.getContext());
                dzb.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return dzb;
            default:
                k77[] k77Arr13 = MessagesListWidget.b1;
                return new we1(new r7e(new a09(messagesListWidget, 6)), new jrf(messagesListWidget, 0));
        }
    }
}
