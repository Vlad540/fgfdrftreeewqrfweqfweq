package defpackage;

import android.view.KeyEvent;
import android.view.View;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: ru8  reason: default package */
public final /* synthetic */ class ru8 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ru8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        CharSequence text;
        Object obj = this.b;
        boolean z = true;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MessageWriteWidget.J0;
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) obj;
                if (!((Boolean) messageWriteWidget.x0.getValue()).booleanValue() || i != 66 || keyEvent.getAction() != 0 || (text = messageWriteWidget.p0().getText()) == null || h0e.c0(text)) {
                    return false;
                }
                messageWriteWidget.z0();
                return true;
            default:
                if (!(keyEvent.getAction() == 0 && i == 67)) {
                    z = false;
                }
                ((y7a) obj).w0 = z;
                return false;
        }
    }
}
