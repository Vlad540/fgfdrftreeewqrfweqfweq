package defpackage;

import android.animation.ValueAnimator;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* renamed from: fz2  reason: default package */
public final /* synthetic */ class fz2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ fz2(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
    }

    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.o;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                hz2 hz2 = (hz2) obj2;
                hz2.getClass();
                cv0 cv0 = (cv0) obj;
                hz2.Z.set(i, new cv0(cv0.a, cv0.b, cv0.c, !cv0.d));
                return;
            case 1:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                fakeInAppReviewBottomSheet.K0 = false;
                tt6 tt6 = (tt6) pt6.a.getAccessor().e();
                if (tt6 != null) {
                    tt6.c(4, Integer.valueOf(i));
                }
                FrameLayout frameLayout = (FrameLayout) obj;
                int height = frameLayout.getHeight();
                FrameLayout frameLayout2 = new FrameLayout(fakeInAppReviewBottomSheet.getContext());
                frameLayout2.setId(k5a.h);
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, height));
                AppCompatTextView appCompatTextView = new AppCompatTextView(frameLayout2.getContext(), (AttributeSet) null);
                appCompatTextView.setId(k5a.k);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                layoutParams.gravity = 49;
                appCompatTextView.setLayoutParams(layoutParams);
                nte.c.b(appCompatTextView, yq4.b);
                appCompatTextView.setText(m5a.e);
                appCompatTextView.setTextColor(km4.y0.r(appCompatTextView).getText().e);
                frameLayout2.addView(appCompatTextView);
                AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout2.getContext(), (AttributeSet) null);
                appCompatImageView.setId(k5a.j);
                float f = (float) 77;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                layoutParams2.gravity = 17;
                appCompatImageView.setLayoutParams(layoutParams2);
                appCompatImageView.setImageResource(j5a.a);
                frameLayout2.addView(appCompatImageView);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(frameLayout2.getContext(), (AttributeSet) null);
                appCompatTextView2.setId(k5a.i);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.bottomMargin = a24.X(((float) 35) * dh4.c().getDisplayMetrics().density);
                layoutParams3.gravity = 81;
                appCompatTextView2.setLayoutParams(layoutParams3);
                nte.e.b(appCompatTextView2, yq4.b);
                appCompatTextView2.setText(m5a.a);
                appCompatTextView2.setTextColor(-16611745);
                a24.a0(appCompatTextView2, new d85(fakeInAppReviewBottomSheet, 1));
                frameLayout2.addView(appCompatTextView2);
                urd.B(new f85(appCompatTextView, (Continuation) null), frameLayout2);
                frameLayout.addView(frameLayout2);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.addUpdateListener(new yl(fakeInAppReviewBottomSheet, 3, ofFloat));
                ofFloat.addListener(new lf(fakeInAppReviewBottomSheet, 2, frameLayout));
                ofFloat.start();
                return;
            default:
                m66 m66 = ((c46) obj2).X;
                m66.getClass();
                StringBuilder sb = new StringBuilder("onItemClicked: ");
                i56 i56 = (i56) obj;
                sb.append(i56);
                udd.q("m66", sb.toString());
                taf.o(m66.U0, new wia(Integer.valueOf(i), i56));
                return;
        }
    }
}
