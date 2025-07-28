package one.me.android.externalcallback;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/android/externalcallback/ExternalCallbackWidget;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "uriAsParam", "(Ljava/lang/String;)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ExternalCallbackWidget extends BottomSheetWidget {
    public static final /* synthetic */ int F0 = 0;
    public final t97 C0;
    public final t97 D0;
    public final boolean E0;

    public ExternalCallbackWidget(Bundle bundle) {
        super(bundle);
        this.C0 = createViewModelLazy(m65.class, new rh2(28, new xd3(24)));
        this.D0 = ez3.O(3, new xd3(25));
        this.E0 = true;
    }

    public final boolean isDialog() {
        return this.E0;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rr3, one.me.android.externalcallback.ExternalCallbackWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget] */
    public final void onAttach(View view) {
        ExternalCallbackWidget.super.onAttach(view);
        m65 m65 = (m65) this.C0.getValue();
        String string = getArgs().getString("external_callback_param_arg");
        if (string == null) {
            string = BuildConfig.FLAVOR;
        }
        qod qod = m65.X;
        if (qod == null || !qod.isActive()) {
            m65.X = xs7.E(m65.a, ((pae) m65.c.getValue()).b(), (ru3) null, new l65(m65, string, (Continuation) null), 2);
        }
    }

    public final void onViewCreated(View view) {
        ez3.N(new ck5(wx3.e(((m65) this.C0.getValue()).o, getViewLifecycleOwner().R(), ob7.o), new n65((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        float f = (float) 70;
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), a24.X(dh4.c().getDisplayMetrics().density * f), frameLayout2.getPaddingRight(), a24.X(f * dh4.c().getDisplayMetrics().density));
        TextView textView = new TextView(frameLayout2.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        textView.setGravity(17);
        ArrayList arrayList = tge.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (ov6) this.D0.getValue(), (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
        textView.setText(rhc.w0);
        urd.B(new c3(this, (Continuation) null, 11), textView);
        frameLayout2.addView(textView);
        return frameLayout2;
    }

    public ExternalCallbackWidget(String str) {
        this(jjd.j(new wia("external_callback_param_arg", str)));
    }
}
