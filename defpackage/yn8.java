package defpackage;

import java.util.Collections;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: yn8  reason: default package */
public final /* synthetic */ class yn8 implements u16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qn8 b;
    public final /* synthetic */ ao8 c;

    public /* synthetic */ yn8(qn8 qn8, ao8 ao8) {
        this.b = qn8;
        this.c = ao8;
    }

    public final Object invoke(Object obj) {
        d0c d0c;
        tt6 tt6;
        yyb yyb;
        jue jue = jue.a;
        qn8 qn8 = this.b;
        ao8 ao8 = this.c;
        switch (this.a) {
            case 0:
                ao8.L(qn8, (String) obj);
                return jue;
            default:
                ryb ryb = (ryb) obj;
                long j = ao8.N0;
                k77[] k77Arr = MessagesListWidget.b1;
                MessagesListWidget messagesListWidget = ((k09) qn8).a;
                MessageModel e = ((tw8) messagesListWidget.t0().s1.getValue()).e(j);
                ryb ryb2 = null;
                if (e == null) {
                    d0c = null;
                } else {
                    d0c = new d0c(ryb, e.a, e.b, e.E0);
                }
                if (d0c != null) {
                    messagesListWidget.p0().q().l(d0c);
                    yr8 yr8 = d0c.d;
                    if (!(yr8 == null || (yyb = yr8.c) == null)) {
                        ryb2 = yyb.b;
                    }
                    if (!hhd.f(ryb2, ryb) && (tt6 = (tt6) xv8.a.getAccessor().e()) != null) {
                        tt6.f(Collections.singleton(new st6(qt6.X, 1)), mnc.CHAT);
                    }
                }
                return jue;
        }
    }

    public /* synthetic */ yn8(ao8 ao8, qn8 qn8) {
        this.c = ao8;
        this.b = qn8;
    }
}
