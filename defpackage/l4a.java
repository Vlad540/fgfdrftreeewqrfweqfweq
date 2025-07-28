package defpackage;

import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: l4a  reason: default package */
public final class l4a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeDraweeView b;

    public /* synthetic */ l4a(OneMeDraweeView oneMeDraweeView, int i) {
        this.a = i;
        this.b = oneMeDraweeView;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v2, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v3, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v4, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void run() {
        switch (this.a) {
            case 0:
                ? r1 = this.b;
                r1.requestLayout();
                r1.invalidate();
                return;
            case 1:
                ? r12 = this.b;
                r12.requestLayout();
                r12.invalidate();
                return;
            case 2:
                ? r13 = this.b;
                r13.requestLayout();
                r13.invalidate();
                return;
            default:
                ? r14 = this.b;
                r14.requestLayout();
                r14.invalidate();
                return;
        }
    }
}
