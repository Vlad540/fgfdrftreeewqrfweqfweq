package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: oja  reason: default package */
public final /* synthetic */ class oja implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PartialMediaAccessWidget b;

    public /* synthetic */ oja(PartialMediaAccessWidget partialMediaAccessWidget, int i) {
        this.a = i;
        this.b = partialMediaAccessWidget;
    }

    public final Object invoke() {
        PartialMediaAccessWidget partialMediaAccessWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = PartialMediaAccessWidget.o;
                LinearLayout linearLayout = new LinearLayout(partialMediaAccessWidget.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(a24.X(((float) 0) * dh4.c().getDisplayMetrics().density), -2, 1.0f));
                AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
                appCompatTextView.setText(k2a.y);
                appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), a24.X(((float) 2) * dh4.c().getDisplayMetrics().density));
                nge.d(nte.i, appCompatTextView);
                urd.B(new f85(3, (Continuation) null, 2), appCompatTextView);
                linearLayout.addView(appCompatTextView);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
                appCompatTextView2.setText(k2a.x);
                nge.d(nte.m, appCompatTextView2);
                urd.B(new f85(3, (Continuation) null, 3), appCompatTextView2);
                linearLayout.addView(appCompatTextView2);
                linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), linearLayout.getPaddingBottom());
                return linearLayout;
            default:
                k77[] k77Arr2 = PartialMediaAccessWidget.o;
                LinearLayout linearLayout2 = new LinearLayout(partialMediaAccessWidget.getContext());
                linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                linearLayout2.setVerticalGravity(16);
                k77 k77 = PartialMediaAccessWidget.o[0];
                linearLayout2.addView((LinearLayout) partialMediaAccessWidget.b.getValue());
                OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), (AttributeSet) null);
                oneMeButton.setText(k2a.w);
                oneMeButton.setSize(v0a.a);
                oneMeButton.setMode(u0a.b);
                oneMeButton.setAppearance(s0a.c);
                a24.Z(oneMeButton, 300, new eu5(22, partialMediaAccessWidget));
                linearLayout2.addView(oneMeButton);
                float f = (float) 12;
                float f2 = (float) 4;
                linearLayout2.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
                urd.B(new o(3, (Continuation) null, 9), linearLayout2);
                return linearLayout2;
        }
    }
}
