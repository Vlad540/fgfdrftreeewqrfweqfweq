package defpackage;

import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* renamed from: v21  reason: default package */
public final /* synthetic */ class v21 implements i34 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ v21(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new CallJoinLinkPreviewWidget(this.b);
            default:
                return new ConfirmPinCodeScreen(this.b);
        }
    }
}
