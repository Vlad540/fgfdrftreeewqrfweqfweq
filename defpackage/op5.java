package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: op5  reason: default package */
public final class op5 extends jgd {
    public final np5 X;

    public op5(ExecutorService executorService, np5 np5) {
        super(executorService);
        this.X = np5;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [zq5, b7c] */
    /* JADX WARNING: type inference failed for: r4v4, types: [qp5, b7c] */
    /* renamed from: H */
    public final void r(chd chd, int i) {
        int l = l(i) & 536870911;
        boolean G = x87.G(l, 1);
        np5 np5 = this.X;
        if (G) {
            xp5 xp5 = (xp5) chd;
            xp5.A((pg7) C(i));
            xp5.K0 = np5;
        } else if (x87.G(l, 8)) {
            pp5 pp5 = (pg7) C(i);
            a24.Z(((qp5) chd).a, 300, new d5(27, np5));
        } else if (x87.G(l, 4)) {
            ? r4 = (zq5) chd;
            tq5 tq5 = (pg7) C(i);
            r4.A(tq5);
            r4.a.setOnTrailClick(new ub(np5, 28, tq5));
        } else {
            op5.super.H(chd, i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [xp5, b7c] */
    public final b7c t(ViewGroup viewGroup, int i) {
        int i2 = i;
        int i3 = 536870911 & i2;
        if (x87.G(i3, 1)) {
            return new xp5(viewGroup);
        }
        ViewGroup viewGroup2 = viewGroup;
        if (x87.G(i3, 4)) {
            hy1 hy1 = new hy1(viewGroup.getContext());
            b7c b7c = new b7c(hy1);
            hy1.setTrail(phc.x);
            return b7c;
        } else if (x87.G(i3, 2)) {
            vz0 vz0 = new vz0(0, this.X, np5.class, "onAddChatsClick", "onAddChatsClick()V", 0, 25);
            Context context = viewGroup.getContext();
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(layoutParams);
            AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
            appCompatImageView.setImageResource(zhc.g);
            TextView textView = new TextView(context);
            nge.d(nte.i, textView);
            textView.setText(f5a.g);
            urd.B(new od1((Object) appCompatImageView, (Object) textView, (Continuation) null, 3), frameLayout);
            float f = (float) 24;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), 8388627);
            float f2 = (float) 18;
            layoutParams2.leftMargin = a24.X(dh4.c().getDisplayMetrics().density * f2);
            layoutParams2.rightMargin = a24.X(dh4.c().getDisplayMetrics().density * f2);
            float f3 = (float) 12;
            layoutParams2.topMargin = a24.X(dh4.c().getDisplayMetrics().density * f3);
            layoutParams2.bottomMargin = a24.X(dh4.c().getDisplayMetrics().density * f3);
            frameLayout.addView(appCompatImageView, layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 8388627);
            layoutParams3.leftMargin = me4.c(f, dh4.c().getDisplayMetrics().density, a24.X(f2 * dh4.c().getDisplayMetrics().density) * 2);
            layoutParams3.rightMargin = a24.X(f3 * dh4.c().getDisplayMetrics().density);
            frameLayout.addView(textView, layoutParams3);
            b7c b7c2 = new b7c(frameLayout);
            a24.Z(frameLayout, 300, new q6(10, vz0));
            return b7c2;
        } else if (x87.G(i3, 8)) {
            OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), (AttributeSet) null);
            b7c b7c3 = new b7c(oneMeButton);
            oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            oneMeButton.setGravity(17);
            oneMeButton.setSize(v0a.c);
            oneMeButton.setMode(u0a.c);
            oneMeButton.setAppearance(s0a.b);
            oneMeButton.setText(f5a.i);
            return b7c3;
        } else {
            throw new IllegalArgumentException(rf0.f(i2, "Unknown view type ", "!"));
        }
    }
}
