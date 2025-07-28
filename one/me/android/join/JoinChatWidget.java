package one.me.android.join;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.fresco.middleware.HasExtraData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.deeplink.LinkInterceptorActivity;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/android/join/JoinChatWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "title", "", "isChannel", "(JLjava/lang/String;Ljava/lang/String;Z)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class JoinChatWidget extends BaseBottomSheetWidget {
    public static final /* synthetic */ k77[] B0;
    public static final String C0 = "join:id";
    public static final String D0 = "join:link";
    public static final String E0 = "join:title";
    public static final String F0 = "join:channel";
    public final boolean A0;
    public final jr w0;
    public final jr x0;
    public final jr y0;
    public final t97 z0;

    static {
        Class<JoinChatWidget> cls = JoinChatWidget.class;
        khb khb = new khb(cls, HasExtraData.KEY_ID, "getId()J", 0);
        n7c n7c = m7c.a;
        B0 = new k77[]{khb, wn6.e(n7c, cls, "link", "getLink()Ljava/lang/String;", 0), wn6.f(cls, "title", "getTitle()Ljava/lang/String;", 0, n7c), wn6.f(cls, "isChannel", "isChannel()Z", 0, n7c)};
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rr3, one.me.sdk.arch.Widget, java.lang.Object, one.me.android.join.JoinChatWidget] */
    public JoinChatWidget(Bundle bundle) {
        super(bundle);
        Class<String> cls = String.class;
        this.w0 = new jr(cls, D0);
        this.x0 = new jr(cls, (Object) null, E0);
        this.y0 = new jr(Boolean.class, F0);
        t97 createViewModelLazy = createViewModelLazy(w47.class, new js5(7, new gz3(24, this)));
        this.z0 = createViewModelLazy;
        this.A0 = true;
        ez3.N(new ck5(new ik5(wx3.e(((w47) createViewModelLazy.getValue()).X, this.lifecycleOwner.R(), ob7.o), 10), new m47(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final boolean isDialog() {
        return this.A0;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rr3, one.me.sdk.arch.Widget, java.lang.Object, one.me.android.join.JoinChatWidget] */
    public final void onViewCreated(View view) {
        ex9 onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            nc7 viewLifecycleOwner = getViewLifecycleOwner();
            or3 or3 = new or3(true, (u16) new gw2(20, this));
            if (viewLifecycleOwner != null) {
                onBackPressedDispatcher.a(viewLifecycleOwner, or3);
            } else {
                onBackPressedDispatcher.b(or3);
            }
        }
        getRouter().I();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.android.join.JoinChatWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget] */
    public final void s0() {
        JoinChatWidget.super.s0();
        Activity d = getRouter().d();
        LinkInterceptorActivity linkInterceptorActivity = d instanceof LinkInterceptorActivity ? (LinkInterceptorActivity) d : null;
        if (linkInterceptorActivity != null) {
            linkInterceptorActivity.finish();
        }
    }

    public final void v0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        String str;
        int X = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        float f = (float) 12;
        frameLayout.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), X, a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f2 = (float) 16;
        textView.setPaddingRelative(textView.getPaddingStart(), a24.X(f2 * dh4.c().getDisplayMetrics().density), textView.getPaddingEnd(), a24.X(dh4.c().getDisplayMetrics().density * f2));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        k77[] k77Arr = B0;
        k77 k77 = k77Arr[3];
        jr jrVar = this.y0;
        boolean booleanValue = ((Boolean) jrVar.a(this)).booleanValue();
        jr jrVar2 = this.x0;
        if (booleanValue) {
            Context context = textView.getContext();
            int i = ysb.join_chat_title_channel;
            k77 k772 = k77Arr[2];
            str = context.getString(i, new Object[]{(String) jrVar2.a(this)});
        } else {
            Context context2 = textView.getContext();
            int i2 = ysb.join_chat_title_chat;
            k77 k773 = k77Arr[2];
            str = context2.getString(i2, new Object[]{(String) jrVar2.a(this)});
        }
        textView.setText(str);
        nge.d(nte.c, textView);
        urd.B(new y9(3, (Continuation) null, 16), textView);
        linearLayout.addView(textView);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        v0a v0a = v0a.c;
        oneMeButton.setSize(v0a);
        u0a u0a = u0a.o;
        oneMeButton.setMode(u0a);
        s0a s0a = s0a.c;
        oneMeButton.setAppearance(s0a);
        k77 k774 = k77Arr[3];
        oneMeButton.setText(d8.u(oneMeButton.getContext(), ((Boolean) jrVar.a(this)).booleanValue() ? ysb.join_chat_confirm_channel_button : ysb.join_chat_confirm_chat_button));
        a24.Z(oneMeButton, 300, new xv5(oneMeButton, 6, this));
        linearLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton2.setSize(v0a);
        oneMeButton2.setMode(u0a);
        oneMeButton2.setAppearance(s0a);
        oneMeButton2.setText(ysb.join_chat_cancel_button);
        a24.Z(oneMeButton2, 300, new eu5(7, this));
        linearLayout.addView(oneMeButton2);
        frameLayout.addView(linearLayout, -1, -2);
        sm4 sm4 = new sm4(frameLayout.getContext());
        sm4.setTranslationY((float) me4.c((float) 6, dh4.c().getDisplayMetrics().density, -X));
        frameLayout.addView(sm4);
    }

    public JoinChatWidget(long j, String str, String str2, boolean z) {
        this(jjd.j(new wia(C0, Long.valueOf(j)), new wia(D0, str), new wia(E0, str2), new wia(F0, Boolean.valueOf(z))));
    }
}
