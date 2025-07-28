package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: fwc  reason: default package */
public final class fwc extends jgd {
    public final sic X;
    public final Executor Y;

    public fwc(sic sic, ExecutorService executorService) {
        super(executorService);
        this.X = sic;
        this.Y = executorService;
    }

    public final void H(chd chd, int i) {
        ((ewc) chd).A((p46) ((pg7) C(i)));
    }

    public final void r(b7c b7c, int i) {
        ((ewc) b7c).A((p46) ((pg7) C(i)));
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final b7c t(ViewGroup viewGroup, int i) {
        int i2 = ewc.N0;
        Context context = viewGroup.getContext();
        ? oneMeDraweeView = new OneMeDraweeView(context);
        float f = (float) 44;
        oneMeDraweeView.setLayoutParams(new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        oneMeDraweeView.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 8.0f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        nte.k.b(appCompatTextView, yq4.b);
        appCompatTextView.setPadding(a24.X(((float) 8) * dh4.c().getDisplayMetrics().density), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setVerticalGravity(16);
        float f2 = (float) 12;
        float f3 = (float) 6;
        linearLayout.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        linearLayout.addView(oneMeDraweeView);
        linearLayout.addView(appCompatTextView);
        return new ewc(this.X, oneMeDraweeView, appCompatTextView, linearLayout);
    }
}
