package one.me.login.inputphone;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/login/inputphone/InputPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Lkv3;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class InputPhoneScreen extends Widget implements kv3 {
    public static final /* synthetic */ k77[] I0;
    public final n0c A0;
    public AppCompatTextView B0;
    public final t97 C0;
    public b07 D0;
    public final t97 E0;
    public final t97 F0;
    public final t97 G0;
    public final ae1 H0;
    public final jr X = new jr(String.class, "", "screen:input_phone:phone");
    public final String Y = "LoginScope";
    public final t97 Z;
    public final /* synthetic */ lu7 a = new Object();
    public final sy6 b = new sy6(0, new up0(3, 3, false), 1);
    public final jj7 c = new jj7(new fs5(17), (s16) null, 6);
    public final t97 o = createViewModelLazy(ly6.class, new js5(4, new fs5(18)));
    public final n0c w0;
    public final n0c x0;
    public final n0c y0;
    public final n0c z0;

    static {
        Class<InputPhoneScreen> cls = InputPhoneScreen.class;
        I0 = new k77[]{new hc9(cls, "phone", "getPhone()Ljava/lang/String;"), m4b.g(m7c.a, cls, "containerView", "getContainerView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), new khb(cls, "gradientBgView", "getGradientBgView()Landroid/view/View;", 0), new khb(cls, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new khb(cls, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), new khb(cls, "termsTextView", "getTermsTextView()Landroid/widget/TextView;", 0)};
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, lu7] */
    public InputPhoneScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        ko7 ko7 = ko7.a;
        this.Z = ko7.getAccessor().d(bd.class);
        this.w0 = viewBinding(jpb.oneme_login_input_constraint_layout);
        this.x0 = viewBinding(jpb.oneme_login_input_gradient_bg);
        this.y0 = viewBinding(jpb.oneme_login_input_continue_button);
        this.z0 = viewBinding(jpb.oneme_login_input_phone_number_input);
        this.A0 = viewBinding(jpb.oneme_login_input_help_button);
        this.C0 = ko7.getAccessor().d(loa.class);
        this.E0 = ez3.O(3, new ux6(this, 0));
        rna.a.b();
        this.F0 = ko7.getAccessor().d(c70.class);
        this.G0 = ko7.getAccessor().d(q0a.class);
        this.H0 = new ae1(this, 4);
    }

    public static final void l0(InputPhoneScreen inputPhoneScreen, String str) {
        inputPhoneScreen.getClass();
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        try {
            inputPhoneScreen.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            udd.s("WelcomeScreen", "open web link with tamtam terms is failed, no activity found", (Throwable) null);
            hba hba = new hba((Widget) inputPhoneScreen);
            hba.i(inputPhoneScreen.getContext().getString(cic.D1));
            hba.j();
        }
    }

    public static final void m0(InputPhoneScreen inputPhoneScreen, CharSequence charSequence) {
        int i = 0;
        if (inputPhoneScreen.B0 == null && charSequence != null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(inputPhoneScreen.getContext(), (AttributeSet) null);
            nte.o.b(appCompatTextView, yq4.b);
            re3 re3 = new re3(0, -2);
            float f = (float) 24;
            re3.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), a24.X(f * dh4.c().getDisplayMetrics().density), 0);
            re3.j = jpb.oneme_login_input_phone_number_input;
            re3.t = 0;
            re3.v = 0;
            appCompatTextView.setGravity(8388611);
            appCompatTextView.setLayoutParams(re3);
            urd.B(new f85(3, (Continuation) null, 1), appCompatTextView);
            ((ConstraintLayout) inputPhoneScreen.w0.T0(inputPhoneScreen, I0[1])).addView(appCompatTextView);
            inputPhoneScreen.B0 = appCompatTextView;
        }
        AppCompatTextView appCompatTextView2 = inputPhoneScreen.B0;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(charSequence);
        }
        AppCompatTextView appCompatTextView3 = inputPhoneScreen.B0;
        if (appCompatTextView3 != null) {
            if (!(!(charSequence == null || charSequence.length() == 0))) {
                i = 8;
            }
            appCompatTextView3.setVisibility(i);
        }
    }

    public static void q0(String str, String str2, SpannableString spannableString, ClickableSpan clickableSpan, pda pda) {
        int a0 = h0e.a0(str, str2, 0, false, 6);
        int length = str2.length() + a0;
        spannableString.setSpan(clickableSpan, a0, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(pda.getText().e), a0, length, 33);
    }

    public final void K(v3a v3a) {
        p0().A0.m((Object) null, v3a);
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m7getScopeIdIluPPks() {
        return this.Y;
    }

    public final rnc getScreenDelegate() {
        return this.c;
    }

    public final OneMeButton n0() {
        return (OneMeButton) this.y0.T0(this, I0[3]);
    }

    public final y7a o0() {
        return (y7a) this.z0.T0(this, I0[4]);
    }

    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
        ly6 p0 = p0();
        taf.o(p0.w0, jue.a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setFillViewport(true);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ConstraintLayout constraintLayout = new ConstraintLayout(scrollView.getContext());
        constraintLayout.setId(jpb.oneme_login_input_constraint_layout);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        urd.B(new wx6(this, (Continuation) null, 0), constraintLayout);
        View view = new View(constraintLayout.getContext());
        view.setId(jpb.oneme_login_input_gradient_bg);
        re3 re3 = new re3(-1, a24.X(((float) 283) * dh4.c().getDisplayMetrics().density));
        re3.i = 0;
        re3.t = 0;
        re3.v = 0;
        view.setLayoutParams(re3);
        c59 c59 = new c59();
        c59.setAlpha(127);
        view.setBackground(c59);
        urd.B(new wx6(this, (Continuation) null, 1), view);
        constraintLayout.addView(view);
        nea nea = new nea(constraintLayout.getContext(), 6);
        nea.setId(jpb.oneme_login_input_toolbar);
        re3 re32 = new re3(-1, -2);
        re32.i = 0;
        re32.t = 0;
        re32.v = 0;
        nea.setLayoutParams(re32);
        nea.setForm(fea.a);
        nea.setRightActions(new aea((jea) null, new hea(l9a.A, j9a.G, new ka(nea, 17, this), 6)));
        ((q0a) this.G0.getValue()).getClass();
        ek8.g(nea, new sy6(3, (up0) null, 2), (u16) null);
        constraintLayout.addView(nea);
        fb7 fb7 = new fb7(constraintLayout.getContext());
        fb7.setId(jpb.oneme_login_input_logo);
        re3 re33 = new re3(-1, 0);
        re33.i = 0;
        re33.t = 0;
        re33.v = 0;
        re33.l = jpb.oneme_login_input_toolbar;
        fb7.setLayoutParams(re33);
        ek8.g(fb7, new sy6(3, (up0) null, 2), (u16) null);
        constraintLayout.addView(fb7);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(jpb.oneme_login_input_title);
        nte.c.b(textView, yq4.b);
        textView.setText(utb.oneme_login_input_title);
        re3 re34 = new re3(0, -2);
        float f = (float) 28;
        float f2 = (float) 24;
        re34.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f), 0);
        re34.j = jpb.oneme_login_input_toolbar;
        re34.t = 0;
        re34.v = 0;
        textView.setGravity(17);
        textView.setLayoutParams(re34);
        urd.B(new y9(3, (Continuation) null, 15), textView);
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(jpb.oneme_login_input_description);
        nte.l.b(textView2, yq4.b);
        textView2.setText(utb.oneme_login_input_description);
        re3 re35 = new re3(0, -2);
        float f3 = (float) 12;
        re35.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f * dh4.c().getDisplayMetrics().density), 0);
        re35.j = jpb.oneme_login_input_title;
        re35.t = 0;
        re35.v = 0;
        textView2.setGravity(17);
        textView2.setLayoutParams(re35);
        urd.B(new y9(3, (Continuation) null, 14), textView2);
        constraintLayout.addView(textView2);
        y7a y7a = new y7a(constraintLayout.getContext());
        y7a.setId(jpb.oneme_login_input_phone_number_input);
        re3 re36 = new re3(0, -2);
        re36.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(((float) 40) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f2));
        re36.j = jpb.oneme_login_input_description;
        re36.t = 0;
        re36.v = 0;
        y7a.setLayoutParams(re36);
        y7a.setPhoneFormatterProvider(new e44(this, 14, y7a));
        y7a.setOnCountryViewClickListener(new ux6(this, 1));
        constraintLayout.addView(y7a);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(jpb.oneme_login_input_continue_button);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setAppearance(s0a.o);
        re3 re37 = new re3(0, -2);
        float f4 = (float) 16;
        re37.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f4));
        re37.j = jpb.oneme_login_input_phone_number_input;
        re37.k = jpb.oneme_login_input_help_button;
        re37.t = 0;
        re37.v = 0;
        re37.F = 1.0f;
        oneMeButton.setLayoutParams(re37);
        oneMeButton.setText(utb.oneme_login_input_continue);
        constraintLayout.addView(oneMeButton);
        TextView textView3 = new TextView(constraintLayout.getContext());
        textView3.setId(jpb.oneme_login_input_help_button);
        textView3.setGravity(1);
        re3 re38 = new re3(-1, -2);
        re38.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), 0, a24.X(f4 * dh4.c().getDisplayMetrics().density), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        re38.l = 0;
        re38.t = 0;
        re38.v = 0;
        textView3.setLayoutParams(re38);
        nte.o.b(textView3, yq4.b);
        urd.B(new c3(this, (Continuation) null, 13), textView3);
        constraintLayout.addView(textView3);
        scrollView.addView(constraintLayout);
        return scrollView;
    }

    public final void onDestroyView(View view) {
        InputPhoneScreen.super.onDestroyView(view);
        this.B0 = null;
        y7a o0 = o0();
        o0.A0.removeTextChangedListener(this.D0);
        this.D0 = null;
    }

    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        km4.y0.n(view.getContext()).g();
        window.setStatusBarColor(0);
    }

    public final void onViewCreated(View view) {
        k77[] k77Arr = I0;
        Drawable background = ((View) this.x0.T0(this, k77Arr[2])).getBackground();
        c59 c59 = background instanceof c59 ? (c59) background : null;
        if (c59 != null) {
            c59.start();
        }
        ((TextView) this.A0.T0(this, k77Arr[5])).setMovementMethod(LinkMovementMethod.getInstance());
        y7a o0 = o0();
        boolean z = false;
        k77 k77 = k77Arr[0];
        jr jrVar = this.X;
        o0.setText((String) jrVar.a(this));
        OneMeButton n0 = n0();
        k77 k772 = k77Arr[0];
        if (((String) jrVar.a(this)).length() > 0) {
            z = true;
        }
        n0.setEnabled(z);
        a24.a0(n0(), new eu5(4, this));
        o0().A0.addTextChangedListener(this.H0);
        ez3.N(new ck5(p0().Y, new vx6((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(p0().x0, new zx6((Continuation) null, this), 5), getViewLifecycleScope());
        pj5 pj5 = p0().D0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(pj5, getViewLifecycleOwner().R(), ob7), new xx6((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(p0().w0, getViewLifecycleOwner().R(), ob7), new yx6((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(p0().B0, getViewLifecycleOwner().R(), ob7), new by6((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final ly6 p0() {
        return (ly6) this.o.getValue();
    }
}
