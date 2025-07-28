package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* renamed from: e85  reason: default package */
public final class e85 extends l5e implements k26 {
    public /* synthetic */ ConstraintLayout X;
    public /* synthetic */ pda Y;
    public final /* synthetic */ FakeInAppReviewBottomSheet Z;
    public final /* synthetic */ AppCompatTextView w0;
    public final /* synthetic */ AppCompatTextView x0;
    public final /* synthetic */ AppCompatTextView y0;
    public final /* synthetic */ cyb z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e85(FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, cyb cyb, Continuation continuation) {
        super(3, continuation);
        this.Z = fakeInAppReviewBottomSheet;
        this.w0 = appCompatTextView;
        this.x0 = appCompatTextView2;
        this.y0 = appCompatTextView3;
        this.z0 = cyb;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AppCompatTextView appCompatTextView = this.y0;
        cyb cyb = this.z0;
        e85 e85 = new e85(this.Z, this.w0, this.x0, appCompatTextView, cyb, (Continuation) obj3);
        e85.X = (ConstraintLayout) obj;
        e85.Y = (pda) obj2;
        jue jue = jue.a;
        e85.o(jue);
        return jue;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ConstraintLayout constraintLayout = this.X;
        pda pda = this.Y;
        s59 s59 = km4.y0;
        boolean i = s59.n(constraintLayout.getContext()).i();
        FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = this.Z;
        fakeInAppReviewBottomSheet.F0.getPaint().setColor(pda.h().j);
        fakeInAppReviewBottomSheet.H0.getPaint().setColor(i ? -14860999 : -1969940);
        this.w0.setTextColor(pda.getText().e);
        this.x0.setTextColor(pda.getText().h);
        this.y0.setTextColor(this.z0.getSelected() != 0 ? -1 : s59.r(constraintLayout).getText().h);
        constraintLayout.invalidate();
        return jue.a;
    }
}
