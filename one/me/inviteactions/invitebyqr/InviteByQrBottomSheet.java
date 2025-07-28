package one.me.inviteactions.invitebyqr;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inviteactions/invitebyqr/InviteByQrBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0})
public final class InviteByQrBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] I0;
    public final n0c C0 = viewBinding(u5a.l);
    public final n0c D0 = viewBinding(u5a.o);
    public final n0c E0 = viewBinding(u5a.m);
    public final t97 F0 = ez3.O(3, new gz3(23, this));
    public final t97 G0 = createViewModelLazy(w17.class, new js5(6, new fs5(24)));
    public final e3 H0 = hwf.t();

    static {
        Class<InviteByQrBottomSheet> cls = InviteByQrBottomSheet.class;
        I0 = new k77[]{new khb(cls, "name", "getName()Landroidx/appcompat/widget/AppCompatTextView;", 0), m4b.g(m7c.a, cls, "shortName", "getShortName()Landroidx/appcompat/widget/AppCompatTextView;", 0), new khb(cls, "qrCode", "getQrCode()Landroidx/appcompat/widget/AppCompatImageView;", 0), new hc9(cls, "shareQrCodeJob", "getShareQrCodeJob()Lkotlinx/coroutines/Job;")};
    }

    public InviteByQrBottomSheet() {
        super((Bundle) null, 1, (x54) null);
    }

    public static final AppCompatTextView A0(InviteByQrBottomSheet inviteByQrBottomSheet) {
        inviteByQrBottomSheet.getClass();
        return (AppCompatTextView) inviteByQrBottomSheet.D0.T0(inviteByQrBottomSheet, I0[1]);
    }

    public static final AppCompatTextView z0(InviteByQrBottomSheet inviteByQrBottomSheet) {
        inviteByQrBottomSheet.getClass();
        return (AppCompatTextView) inviteByQrBottomSheet.C0.T0(inviteByQrBottomSheet, I0[0]);
    }

    public final void onDestroyView(View view) {
        InviteByQrBottomSheet.super.onDestroyView(view);
        g37 g37 = (g37) this.H0.T0(this, I0[3]);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
    }

    public final void onViewCreated(View view) {
        ez3.N(new ck5(((w17) this.G0.getValue()).w0, new s17(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
        appCompatTextView.setId(u5a.l);
        appCompatTextView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 18;
        layoutParams.topMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        float f2 = (float) 20;
        layoutParams.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f2));
        layoutParams.setMarginEnd(a24.X(dh4.c().getDisplayMetrics().density * f2));
        appCompatTextView.setLayoutParams(layoutParams);
        nge.d(nte.z, appCompatTextView);
        s59 s59 = km4.y0;
        appCompatTextView.setTextColor(s59.r(appCompatTextView).getText().e);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
        appCompatTextView2.setId(u5a.o);
        appCompatTextView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
        layoutParams2.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f2));
        layoutParams2.setMarginEnd(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        appCompatTextView2.setLayoutParams(layoutParams2);
        nge.d(nte.o, appCompatTextView2);
        appCompatTextView2.setTextColor(s59.r(appCompatTextView2).getText().f);
        linearLayout.addView(appCompatTextView2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), (AttributeSet) null);
        appCompatImageView.setId(u5a.m);
        float f3 = (float) 244;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        layoutParams3.topMargin = a24.X(f * dh4.c().getDisplayMetrics().density);
        appCompatImageView.setLayoutParams(layoutParams3);
        linearLayout.setGravity(17);
        linearLayout.addView(appCompatImageView);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(u5a.n);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams4);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setAppearance(s0a.c);
        oneMeButton.setText(rhc.e);
        a24.Z(oneMeButton, 300, new eu5(6, this));
        linearLayout.addView(oneMeButton);
        urd.B(new z9(this, (Continuation) null, 16), linearLayout);
        return linearLayout;
    }
}
