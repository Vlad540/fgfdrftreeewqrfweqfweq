package defpackage;

import android.widget.PopupWindow;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: b01  reason: default package */
public final /* synthetic */ class b01 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onDismiss() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((s16) obj).invoke();
                return;
            case 1:
                dgc dgc = ((el1) obj).M0;
                dgc.setIconTint(-855638017);
                dgc.setMode(yfc.a);
                return;
            case 2:
                ((hl1) obj).N0 = null;
                return;
            case 3:
                s16 s16 = ((zq3) obj).b;
                if (s16 != null) {
                    s16.invoke();
                    return;
                }
                return;
            default:
                ((ForwardPickerScreen) obj).L0 = null;
                return;
        }
    }
}
