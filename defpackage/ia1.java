package defpackage;

import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: ia1  reason: default package */
public final /* synthetic */ class ia1 implements agc {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ ia1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    public final void b() {
        boolean z = false;
        hy7 hy7 = hy7.b;
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallJoinLinkPreviewWidget.F0;
                ga1 p0 = callJoinLinkPreviewWidget.p0();
                if (((y91) callJoinLinkPreviewWidget.p0().B0.getValue()).b == hy7) {
                    z = true;
                }
                p0.r(!z);
                return;
            default:
                k77[] k77Arr2 = CallJoinLinkPreviewWidget.F0;
                ga1 p02 = callJoinLinkPreviewWidget.p0();
                if (((y91) callJoinLinkPreviewWidget.p0().B0.getValue()).c == hy7) {
                    z = true;
                }
                p02.s(!z);
                return;
        }
    }
}
