package defpackage;

import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: ou8  reason: default package */
public final /* synthetic */ class ou8 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ ou8(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    public final Object invoke() {
        MessageWriteWidget messageWriteWidget = this.b;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((kp) ((ip) messageWriteWidget.Y.getValue())).g.getBoolean("app.messages.send.by.enter", false));
            default:
                k77[] k77Arr = MessageWriteWidget.J0;
                flb flb = new flb(messageWriteWidget.getContext());
                flb.setLayoutParams(new ViewGroup.LayoutParams(-1, a24.X(((float) 52) * dh4.c().getDisplayMetrics().density)));
                flb.setEndIconDrawable(gq3.b(flb.getContext(), phc.w));
                flb.setEndIconClickListener(new pu8(messageWriteWidget, 0));
                urd.B(new pf0(3, (Continuation) null, 9), flb);
                if (!flb.isLaidOut() || flb.isLayoutRequested()) {
                    flb.addOnLayoutChangeListener(new zm1(flb, 3, messageWriteWidget));
                } else if (tge.c(flb.getTitleView())) {
                    MessageWriteWidget.A0(flb, true);
                }
                return flb;
        }
    }
}
