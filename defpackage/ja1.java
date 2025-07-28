package defpackage;

import android.view.View;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: ja1  reason: default package */
public final /* synthetic */ class ja1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ ja1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    public final void onClick(View view) {
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallJoinLinkPreviewWidget.F0;
                callJoinLinkPreviewWidget.q0();
                return;
            default:
                k77[] k77Arr2 = CallJoinLinkPreviewWidget.F0;
                ga1 p0 = callJoinLinkPreviewWidget.p0();
                y91 y91 = (y91) p0.B0.getValue();
                hy7 hy7 = y91.c;
                hy7 hy72 = hy7.b;
                boolean z = false;
                boolean z2 = hy7 == hy72;
                if (y91.b == hy72) {
                    z = true;
                }
                taf.o(p0.E0, new o81(p0.b, z2, z, y91.d));
                return;
        }
    }
}
