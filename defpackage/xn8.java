package defpackage;

import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: xn8  reason: default package */
public final /* synthetic */ class xn8 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ao8 b;
    public final /* synthetic */ qn8 c;

    public /* synthetic */ xn8(qn8 qn8, ao8 ao8) {
        this.c = qn8;
        this.b = ao8;
    }

    public final void onClick(View view) {
        qn8 qn8 = this.c;
        ao8 ao8 = this.b;
        switch (this.a) {
            case 0:
                long j = ao8.N0;
                k09 k09 = (k09) qn8;
                k09.getClass();
                k77[] k77Arr = MessagesListWidget.b1;
                k09.a.v0(j, ao8.M0);
                return;
            default:
                ao8.L(qn8, (String) null);
                return;
        }
    }

    public /* synthetic */ xn8(ao8 ao8, qn8 qn8) {
        this.b = ao8;
        this.c = qn8;
    }
}
