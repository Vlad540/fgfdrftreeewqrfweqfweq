package one.me.calls.ui.bottomsheet.ratecall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/calls/ui/bottomsheet/ratecall/CallRateBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lqxb;", "Lwxb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "callId", "", "isVideoCall", "", "sdkReasons", "(Ljava/lang/String;ZLjava/util/List;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class CallRateBottomSheet extends BottomSheetWidget implements qxb, wxb {
    public static final /* synthetic */ k77[] M0;
    public final jr C0;
    public final jr D0;
    public final jr E0;
    public final AutoTransition F0;
    public final t97 G0;
    public final n0c H0;
    public final n0c I0;
    public final n0c J0;
    public final n0c K0;
    public final n0c L0;

    static {
        Class<CallRateBottomSheet> cls = CallRateBottomSheet.class;
        khb khb = new khb(cls, "callId", "getCallId()Ljava/lang/String;", 0);
        n7c n7c = m7c.a;
        M0 = new k77[]{khb, wn6.e(n7c, cls, "isVideoCall", "isVideoCall()Z", 0), wn6.f(cls, "sdkReasons", "getSdkReasons()Ljava/util/List;", 0, n7c), wn6.f(cls, "title", "getTitle()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "rateCallButtonGroup", "getRateCallButtonGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButtonGroup;", 0, n7c), wn6.f(cls, "reasonsChipGroup", "getReasonsChipGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallReasonsChipGroup;", 0, n7c), wn6.f(cls, "sendButton", "getSendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c), wn6.f(cls, "customReasonEditText", "getCustomReasonEditText()Lone/me/calls/ui/bottomsheet/ratecall/view/CustomReasonInputView;", 0, n7c)};
    }

    public CallRateBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = new jr(String.class, "ratecall:call_id");
        this.D0 = new jr(Boolean.class, "ratecall:is_video_call");
        this.E0 = new jr(List.class, "ratecall:sdk_reasons");
        this.F0 = new AutoTransition();
        this.G0 = createViewModelLazy(qf1.class, new s(17, new c6(27, this)));
        this.H0 = viewBinding(o1a.A0);
        this.I0 = viewBinding(o1a.t0);
        this.J0 = viewBinding(o1a.u0);
        this.K0 = viewBinding(o1a.z0);
        this.L0 = viewBinding(o1a.v0);
    }

    public final qf1 A0() {
        return (qf1) this.G0.getValue();
    }

    public final void onViewCreated(View view) {
        t0c t0c = A0().x0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new ef1((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(A0().z0, getViewLifecycleOwner().R(), ob7), new ff1((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(A0().B0, getViewLifecycleOwner().R(), ob7), new gf1((Continuation) null, view, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(A0().C0, getViewLifecycleOwner().R(), ob7), new hf1((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(A0().D0, getViewLifecycleOwner().R(), ob7), new if1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r5v7, types: [android.widget.LinearLayout, android.view.View, sxb] */
    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        TextView textView = new TextView(context);
        textView.setId(o1a.A0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 24;
        layoutParams.bottomMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        nge.d(nte.b, textView);
        urd.B(new y9(3, (Continuation) null, 1), textView);
        ? linearLayout = new LinearLayout(context, (AttributeSet) null);
        linearLayout.b = 3;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.c = hw4.a;
        linearLayout.setId(o1a.t0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setGravity(17);
        linearLayout.setListener(this);
        xxb xxb = new xxb(context, (AttributeSet) null);
        xxb.setId(o1a.u0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        xxb.setLayoutParams(layoutParams3);
        xxb.setListener(this);
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setId(o1a.z0);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setText(r1a.D0);
        a24.Z(oneMeButton, 300, new d5(11, this));
        jx3 jx3 = new jx3(context);
        jx3.setId(o1a.v0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        float f2 = (float) 84;
        jx3.setMinimumHeight(a24.X(dh4.c().getDisplayMetrics().density * f2));
        layoutParams4.bottomMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        jx3.setLayoutParams(layoutParams4);
        jx3.setHint(d8.u(jx3.getContext(), r1a.l0));
        jx3.setMaxCount(50);
        jx3.setMinimumHeight(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        jx3.setTextChangeListener(new l(16, this));
        jx3.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(frameLayout.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        float f3 = (float) 12;
        linearLayout2.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f3 * dh4.c().getDisplayMetrics().density), 0);
        linearLayout2.addView(textView);
        linearLayout2.addView(linearLayout);
        linearLayout2.addView(xxb);
        linearLayout2.addView(jx3);
        linearLayout2.addView(oneMeButton);
        return linearLayout2;
    }

    public final xxb z0() {
        return (xxb) this.J0.T0(this, M0[5]);
    }

    public CallRateBottomSheet(String str, boolean z, List<String> list) {
        this(jjd.j(new wia("ratecall:call_id", str), new wia("ratecall:is_video_call", Boolean.valueOf(z)), new wia("ratecall:sdk_reasons", list)));
    }
}
