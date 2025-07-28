package one.me.login.welcome;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/login/welcome/WelcomeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class WelcomeScreen extends Widget {
    public static final /* synthetic */ k77[] w0;
    public final t97 X;
    public final t97 Y;
    public final qda Z;
    public final sy6 a = new sy6(0, new up0(3, 1, false), 1);
    public final jj7 b = new jj7(new vif(8), (s16) null, 6);
    public final t97 c;
    public final n0c o;

    static {
        Class<WelcomeScreen> cls = WelcomeScreen.class;
        w0 = new k77[]{new khb(cls, "imageView", "getImageView()Landroid/widget/ImageView;", 0), wn6.e(m7c.a, cls, "termsTextView", "getTermsTextView()Landroid/widget/TextView;", 0)};
    }

    public WelcomeScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        m25getSharedViewModelcp94BC8("LoginScope", hp7.class, (s16) null);
        this.c = mqc.m;
        viewBinding(jpb.oneme_login_welcome_placeholder);
        this.o = viewBinding(jpb.oneme_login_welcome_terms);
        this.X = ez3.O(3, new q6e(12, this));
        this.Y = ez3.O(3, new vif(9));
        this.Z = qda.a;
    }

    public static final void l0(WelcomeScreen welcomeScreen, String str) {
        welcomeScreen.getClass();
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        try {
            welcomeScreen.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            udd.s("WelcomeScreen", "open web link with tamtam terms is failed, no activity found", (Throwable) null);
            hba hba = new hba((Widget) welcomeScreen);
            hba.i(welcomeScreen.getContext().getString(cic.D1));
            hba.j();
        }
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final rnc getScreenDelegate() {
        return this.b;
    }

    public final void m0(String str, String str2, SpannableString spannableString, ClickableSpan clickableSpan) {
        int a0 = h0e.a0(str, str2, 0, false, 6);
        int length = str2.length() + a0;
        spannableString.setSpan(clickableSpan, a0, length, 33);
        this.Z.getClass();
        spannableString.setSpan(new ForegroundColorSpan(-855638017), a0, length, 33);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        bad bad = new bad(constraintLayout.getContext());
        re3 re3 = new re3(-1, -1);
        re3.i = 0;
        re3.t = 0;
        re3.v = 0;
        re3.l = 0;
        bad.setLayoutParams(re3);
        constraintLayout.addView(bad);
        View view = new View(constraintLayout.getContext());
        view.setId(jpb.oneme_login_welcome_toolbar);
        re3 re32 = new re3(0, a24.X(((float) 52) * dh4.c().getDisplayMetrics().density));
        re32.i = 0;
        re32.t = 0;
        re32.v = 0;
        view.setLayoutParams(re32);
        ek8.h(view);
        constraintLayout.addView(view);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(jpb.oneme_login_welcome_title);
        re3 re33 = new re3(-2, -2);
        float f = (float) 16;
        re33.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(dh4.c().getDisplayMetrics().density * f), 0);
        re33.j = jpb.oneme_login_welcome_toolbar;
        re33.t = 0;
        re33.v = 0;
        re33.k = jpb.oneme_login_welcome_description;
        re33.K = 2;
        textView.setLayoutParams(re33);
        textView.setGravity(17);
        qda qda = this.Z;
        qda.getClass();
        textView.setTextColor(-855638017);
        nte.w.b(textView, yq4.b);
        textView.setText(utb.oneme_login_welcome_title);
        t97 t97 = this.Y;
        ((q0a) t97.getValue()).getClass();
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(jpb.oneme_login_welcome_description);
        re3 re34 = new re3(-2, -2);
        float f2 = (float) 12;
        re34.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f), 0);
        re34.j = jpb.oneme_login_welcome_title;
        re34.t = 0;
        re34.v = 0;
        re34.k = jpb.oneme_login_welcome_placeholder;
        textView2.setLayoutParams(re34);
        textView2.setTextColor(-1107296257);
        nte.l.b(textView2, yq4.b);
        textView2.setText(utb.oneme_login_welcome_description);
        ((q0a) t97.getValue()).getClass();
        constraintLayout.addView(textView2);
        t96 t96 = new t96(constraintLayout.getContext());
        t96.setId(jpb.oneme_login_welcome_placeholder);
        float f3 = (float) 234;
        re3 re35 = new re3(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        re35.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(dh4.c().getDisplayMetrics().density * f), 0);
        re35.j = jpb.oneme_login_welcome_title;
        re35.k = jpb.oneme_login_welcome_continue_btn;
        re35.t = 0;
        re35.v = 0;
        t96.setLayoutParams(re35);
        t96.setImageDrawable(gq3.b(getContext(), hnb.welcome_logo));
        ((q0a) t97.getValue()).getClass();
        constraintLayout.addView(t96);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(jpb.oneme_login_welcome_continue_btn);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setText(utb.oneme_login_welcome_continue_btn);
        re3 re36 = new re3(0, -2);
        re36.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f2), 0, a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f));
        re36.k = jpb.oneme_login_welcome_terms;
        re36.t = 0;
        re36.v = 0;
        oneMeButton.setLayoutParams(re36);
        a24.a0(oneMeButton, new wfc(14, this));
        oneMeButton.setCustomTheme(qda);
        constraintLayout.addView(oneMeButton);
        TextView textView3 = new TextView(constraintLayout.getContext());
        textView3.setId(jpb.oneme_login_welcome_terms);
        textView3.setGravity(1);
        re3 re37 = new re3(-1, -2);
        re37.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f2), 0, a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        re37.l = 0;
        re37.t = 0;
        re37.v = 0;
        textView3.setLayoutParams(re37);
        nte.o.b(textView3, yq4.b);
        textView3.setTextColor(1895825407);
        constraintLayout.addView(textView3);
        return constraintLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        k77[] k77Arr = w0;
        k77 k77 = k77Arr[1];
        n0c n0c = this.o;
        String u = d8.u(getContext(), utb.oneme_login_welcome_terms);
        String u2 = d8.u(getContext(), utb.oneme_login_welcome_privacy_policy_clickable_part);
        String u3 = d8.u(getContext(), utb.oneme_login_welcome_user_agreement_clickable_part);
        SpannableString spannableString = new SpannableString(u);
        m0(u, u2, spannableString, new arf(this, 0));
        m0(u, u3, spannableString, new arf(this, 1));
        ((TextView) n0c.T0(this, k77)).setText(spannableString);
        ((TextView) n0c.T0(this, k77Arr[1])).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
