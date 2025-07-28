package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: pu8  reason: default package */
public final /* synthetic */ class pu8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ pu8(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    public final void onClick(View view) {
        MessageWriteWidget messageWriteWidget = this.b;
        switch (this.a) {
            case 0:
                int i = messageWriteWidget.I0;
                if (i != 0) {
                    nu8 u0 = messageWriteWidget.u0();
                    CharSequence charSequence = (CharSequence) messageWriteWidget.p0().getMessageState().getValue();
                    Integer num = (Integer) messageWriteWidget.p0().getMessagePosition().getValue();
                    u0.getClass();
                    int t = hr1.t(i);
                    if (t == 0) {
                        nu8.C(u0, (Long) null, (CharSequence) null, (Integer) null, 14);
                        return;
                    } else if (t == 1) {
                        u0.T0.m((Object) null, new rt8(charSequence, num));
                        u0.D((Long) null);
                        return;
                    } else if (t == 2) {
                        taf.o(u0.D0, new Object());
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                k77[] k77Arr = MessageWriteWidget.J0;
                messageWriteWidget.X.f.k = messageWriteWidget.p0().getText();
                nu8 u02 = messageWriteWidget.u0();
                taf.o(u02.D0, zt8.a);
                return;
        }
    }
}
