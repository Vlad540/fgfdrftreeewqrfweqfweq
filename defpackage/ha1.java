package defpackage;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ha1  reason: default package */
public final /* synthetic */ class ha1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ ha1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    public final Object invoke() {
        yfc yfc = yfc.a;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallJoinLinkPreviewWidget.F0;
                return new we1(new r7e(new ha1(widget, 4)), new jrf(widget, 0));
            case 1:
                k77[] k77Arr2 = CallJoinLinkPreviewWidget.F0;
                OneMeButton oneMeButton = new OneMeButton(widget.getContext(), (AttributeSet) null);
                oneMeButton.setId(View.generateViewId());
                oneMeButton.setText(r1a.b0);
                oneMeButton.setCustomTheme(qda.a);
                oneMeButton.setMode(u0a.a);
                oneMeButton.setSize(v0a.c);
                oneMeButton.setAppearance(s0a.o);
                a24.Z(oneMeButton, 300, new ja1(widget, 1));
                return oneMeButton;
            case 2:
                k77[] k77Arr3 = CallJoinLinkPreviewWidget.F0;
                return gq3.b(widget.getContext(), n1a.X);
            case 3:
                k77[] k77Arr4 = CallJoinLinkPreviewWidget.F0;
                return gq3.b(widget.getContext(), n1a.Y);
            case 4:
                k77[] k77Arr5 = CallJoinLinkPreviewWidget.F0;
                return widget.getRouter();
            case 5:
                k77[] k77Arr6 = CallJoinLinkPreviewWidget.F0;
                return gq3.b(widget.getContext(), n1a.A0);
            case 6:
                k77[] k77Arr7 = CallJoinLinkPreviewWidget.F0;
                return gq3.b(widget.getContext(), n1a.C0);
            case 7:
                k77[] k77Arr8 = CallJoinLinkPreviewWidget.F0;
                TextView textView = new TextView(widget.getContext());
                textView.setId(o1a.a0);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                textView.setText(r1a.c0);
                nge.d(nte.i, textView);
                textView.setTextColor(-855638017);
                return textView;
            case 8:
                k77[] k77Arr9 = CallJoinLinkPreviewWidget.F0;
                dgc dgc = new dgc(widget.getContext(), (AttributeSet) null);
                dgc.setId(o1a.Y);
                dgc.setContentDescription(dgc.getContext().getString(r1a.F));
                dgc.y(n1a.E, -855638017);
                a24.Z(dgc, 300, new ja1(widget, 0));
                float f = (float) 40;
                dgc.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
                dgc.setButtonPadding(a24.X(((float) 3) * dh4.c().getDisplayMetrics().density));
                dgc.setMode(yfc);
                return dgc;
            case 9:
                k77[] k77Arr10 = CallJoinLinkPreviewWidget.F0;
                jca jca = new jca(widget.getContext());
                jca.setId(o1a.Z);
                jca.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return jca;
            case 10:
                k77[] k77Arr11 = CallJoinLinkPreviewWidget.F0;
                dgc dgc2 = new dgc(widget.getContext(), (AttributeSet) null);
                dgc2.setId(o1a.b0);
                dgc2.setAccessibility(Integer.valueOf(r1a.a0));
                dgc2.setTextColor(-855638017);
                dgc2.setListener(new ia1(widget, 0));
                dgc2.setMode(yfc);
                dgc2.y(n1a.W, -855638017);
                float f2 = (float) 54;
                dgc2.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density)));
                dgc2.setButtonPadding(a24.X(((float) 5) * dh4.c().getDisplayMetrics().density));
                return dgc2;
            default:
                k77[] k77Arr12 = CallJoinLinkPreviewWidget.F0;
                dgc dgc3 = new dgc(widget.getContext(), (AttributeSet) null);
                dgc3.setId(o1a.e0);
                dgc3.y(n1a.z0, -855638017);
                dgc3.setAccessibility(Integer.valueOf(r1a.d0));
                dgc3.setTextColor(-855638017);
                dgc3.setMode(yfc);
                dgc3.setListener(new ia1(widget, 1));
                float f3 = (float) 54;
                dgc3.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density)));
                dgc3.setButtonPadding(a24.X(((float) 5) * dh4.c().getDisplayMetrics().density));
                return dgc3;
        }
    }
}
