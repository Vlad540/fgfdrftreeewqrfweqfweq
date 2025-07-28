package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* renamed from: ic3  reason: default package */
public final /* synthetic */ class ic3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ ic3(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
        this.c = i;
    }

    public final void onClick(View view) {
        lc3 lc3 = null;
        int i = this.c;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ConfirmationBottomSheet.K0;
                ConfirmationBottomSheet confirmationBottomSheet = (ConfirmationBottomSheet) obj;
                confirmationBottomSheet.getClass();
                k77[] k77Arr2 = ConfirmationBottomSheet.K0;
                k77 k77 = k77Arr2[5];
                jr jrVar = confirmationBottomSheet.I0;
                if (!((Boolean) jrVar.a(confirmationBottomSheet)).booleanValue()) {
                    k77 k772 = k77Arr2[5];
                    jrVar.b(confirmationBottomSheet, Boolean.TRUE);
                    lc3 targetController = confirmationBottomSheet.getTargetController();
                    if (targetController instanceof lc3) {
                        lc3 = targetController;
                    }
                    if (lc3 != null) {
                        k77 k773 = k77Arr2[4];
                        lc3.i(i, (Bundle) confirmationBottomSheet.G0.a(confirmationBottomSheet));
                    }
                }
                confirmationBottomSheet.r0(true);
                return;
            case 1:
                k77[] k77Arr3 = ConfirmationBottomSheet.K0;
                ConfirmationBottomSheet confirmationBottomSheet2 = (ConfirmationBottomSheet) obj;
                confirmationBottomSheet2.getClass();
                k77[] k77Arr4 = ConfirmationBottomSheet.K0;
                k77 k774 = k77Arr4[5];
                jr jrVar2 = confirmationBottomSheet2.I0;
                if (!((Boolean) jrVar2.a(confirmationBottomSheet2)).booleanValue()) {
                    k77 k775 = k77Arr4[5];
                    jrVar2.b(confirmationBottomSheet2, Boolean.TRUE);
                    lc3 targetController2 = confirmationBottomSheet2.getTargetController();
                    if (targetController2 instanceof lc3) {
                        lc3 = targetController2;
                    }
                    if (lc3 != null) {
                        k77 k776 = k77Arr4[4];
                        lc3.i(i, (Bundle) confirmationBottomSheet2.G0.a(confirmationBottomSheet2));
                    }
                }
                confirmationBottomSheet2.r0(true);
                return;
            default:
                cyb cyb = (cyb) obj;
                cyb.K0 = i;
                for (int i2 = 0; i2 < 5; i2++) {
                    ImageView imageView = (ImageView) cyb.getChildAt(i2);
                    if (i2 <= i) {
                        imageView.setImageResource(j5a.b);
                    } else {
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(cyb.getContext(), j5a.c);
                        r0e h = km4.y0.r(cyb).h();
                        VectorPath findPath = enhancedVectorDrawable.findPath("stroke");
                        if (findPath != null) {
                            findPath.setStrokeColor(h.j);
                            enhancedVectorDrawable.invalidatePath();
                        }
                        imageView.setImageDrawable(enhancedVectorDrawable);
                    }
                }
                cyb.setContentDescription(cyb.getResources().getQuantityString(l5a.a, 5, new Object[]{Integer.valueOf(cyb.getSelected()), 5}));
                xz xzVar = cyb.L0;
                if (xzVar != null) {
                    int selected = cyb.getSelected();
                    xz xzVar2 = xzVar;
                    k77[] k77Arr5 = FakeInAppReviewBottomSheet.L0;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) xzVar2.b;
                    appCompatTextView.setPressed(false);
                    FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) xzVar2.c;
                    appCompatTextView.setBackground((RippleDrawable) fakeInAppReviewBottomSheet.I0.getValue());
                    appCompatTextView.setTextColor(-1);
                    a24.a0(appCompatTextView, new fz2(fakeInAppReviewBottomSheet, selected, (FrameLayout) xzVar2.o, 1));
                    return;
                }
                return;
        }
    }
}
