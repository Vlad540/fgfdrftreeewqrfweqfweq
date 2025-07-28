package defpackage;

import android.widget.PopupWindow;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: su8  reason: default package */
public final /* synthetic */ class su8 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ su8(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    public final void onDismiss() {
        switch (this.a) {
            case 0:
                this.b.H0 = null;
                return;
            default:
                this.b.H0 = null;
                return;
        }
    }
}
