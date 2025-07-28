package defpackage;

import android.view.View;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* renamed from: d85  reason: default package */
public final /* synthetic */ class d85 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FakeInAppReviewBottomSheet b;

    public /* synthetic */ d85(FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet, int i) {
        this.a = i;
        this.b = fakeInAppReviewBottomSheet;
    }

    public final void onClick(View view) {
        FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = this.b;
        switch (this.a) {
            case 0:
                fakeInAppReviewBottomSheet.K0 = false;
                tt6 tt6 = (tt6) pt6.a.getAccessor().e();
                if (tt6 != null) {
                    tt6.b(4);
                }
                fakeInAppReviewBottomSheet.r0(true);
                return;
            default:
                k77[] k77Arr = FakeInAppReviewBottomSheet.L0;
                fakeInAppReviewBottomSheet.r0(true);
                return;
        }
    }
}
