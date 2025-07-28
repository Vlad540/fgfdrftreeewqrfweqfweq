package one.me.login.confirm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/login/confirm/ConfirmPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Ldc3;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "verifyToken", "phone", "", "codeLength", "(Ljava/lang/String;Ljava/lang/String;I)V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ConfirmPhoneScreen extends Widget implements dc3, lc3 {
    public static final /* synthetic */ k77[] G0;
    public final n0c A0;
    public final n0c B0;
    public TextView C0;
    public final t97 D0;
    public TextView E0;
    public final e3 F0;
    public final jr X;
    public final jj7 Y;
    public final t97 Z;
    public final /* synthetic */ lu7 a;
    public final sy6 b;
    public final jr c;
    public final jr o;
    public final t97 w0;
    public final t97 x0;
    public final n0c y0;
    public final n0c z0;

    static {
        Class<ConfirmPhoneScreen> cls = ConfirmPhoneScreen.class;
        G0 = new k77[]{new khb(cls, "verifyToken", "getVerifyToken()Ljava/lang/String;", 0), m4b.g(m7c.a, cls, "phone", "getPhone()Ljava/lang/String;", 0), new khb(cls, "codeLength", "getCodeLength()I", 0), new khb(cls, "phoneDescTextView", "getPhoneDescTextView()Landroid/widget/TextView;", 0), new khb(cls, "timerTextView", "getTimerTextView()Landroid/widget/TextView;", 0), new khb(cls, "resendButton", "getResendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new khb(cls, "smsInputView", "getSmsInputView()Lone/me/sdk/codeinput/ConfirmSmsInputView;", 0), new hc9(cls, "loginAnimationJob", "getLoginAnimationJob()Lkotlinx/coroutines/Job;")};
    }

    public ConfirmPhoneScreen(String str, String str2, int i) {
        this(jjd.j(new wia[]{new wia("screen:confirm_phone:verify_token", str), new wia("screen:confirm_phone:phone", str2), new wia("screen:confirm_phone:code_length", Integer.valueOf(i))}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l0(one.me.login.confirm.ConfirmPhoneScreen r8, defpackage.nkd r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof defpackage.ib3
            if (r0 == 0) goto L_0x0016
            r0 = r10
            ib3 r0 = (defpackage.ib3) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            ib3 r0 = new ib3
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 0
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L_0x003f
            if (r2 == r5) goto L_0x003b
            if (r2 != r6) goto L_0x0033
            one.me.login.confirm.ConfirmPhoneScreen r8 = r0.o
            wx3.H(r10)
            goto L_0x00f8
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            wx3.H(r10)
            goto L_0x0071
        L_0x003f:
            wx3.H(r10)
            boolean r10 = r9 instanceof defpackage.mkd
            if (r10 == 0) goto L_0x0074
            hc3 r9 = r8.o0()
            ec3 r10 = defpackage.ec3.SUCCESS
            r9.setState(r10)
            r8.t0(r4)
            r0.Z = r5
            yb7 r9 = r8.getViewLifecycleScope()
            ru3 r10 = ru3.b
            jb3 r0 = new jb3
            r0.<init>(r8, r4)
            qod r9 = xs7.E(r9, r4, r10, r0, r5)
            k77[] r10 = G0
            r0 = 7
            r10 = r10[r0]
            e3 r0 = r8.F0
            r0.o1(r8, r10, r9)
            if (r3 != r1) goto L_0x0071
            goto L_0x010f
        L_0x0071:
            r1 = r3
            goto L_0x010f
        L_0x0074:
            boolean r10 = r9 instanceof defpackage.lkd
            if (r10 == 0) goto L_0x0116
            hc3 r10 = r8.o0()
            ec3 r2 = defpackage.ec3.ERROR
            r10.setState(r2)
            r8.s0()
            lkd r9 = (defpackage.lkd) r9
            so7 r10 = r9.a
            boolean r2 = r10 instanceof defpackage.ro7
            if (r2 == 0) goto L_0x00d4
            t97 r10 = r8.x0
            java.lang.Object r10 = r10.getValue()
            c70 r10 = (defpackage.c70) r10
            b70 r2 = new b70
            so7 r9 = r9.a
            ro7 r9 = (defpackage.ro7) r9
            int r7 = r9.e
            r2.<init>(r7)
            r10.a(r2)
            mge r10 = r9.c
            lu7 r2 = r8.a
            r2.getClass()
            android.content.Context r2 = r8.getContext()
            java.lang.CharSequence r10 = r10.a(r2)
            if (r10 != 0) goto L_0x00b4
            goto L_0x00eb
        L_0x00b4:
            mge r9 = r9.d
            if (r9 == 0) goto L_0x00c1
            android.content.Context r2 = r8.getContext()
            java.lang.CharSequence r9 = r9.a(r2)
            goto L_0x00c2
        L_0x00c1:
            r9 = r4
        L_0x00c2:
            hba r2 = new hba
            r2.<init>((one.me.sdk.arch.Widget) r8)
            r2.i(r10)
            r2.b(r9)
            r2.e(r5)
            r2.j()
            goto L_0x00eb
        L_0x00d4:
            boolean r9 = r10 instanceof defpackage.no7
            if (r9 == 0) goto L_0x00e0
            no7 r10 = (defpackage.no7) r10
            mge r9 = r10.c
            r8.t0(r9)
            goto L_0x00eb
        L_0x00e0:
            boolean r9 = r10 instanceof defpackage.oo7
            if (r9 == 0) goto L_0x0106
            oo7 r10 = (defpackage.oo7) r10
            mge r9 = r10.c
            r8.t0(r9)
        L_0x00eb:
            r0.o = r8
            r0.Z = r6
            r9 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = defpackage.ek8.q(r9, r0)
            if (r9 != r1) goto L_0x00f8
            goto L_0x010f
        L_0x00f8:
            r8.t0(r4)
            hc3 r8 = r8.o0()
            ec3 r9 = defpackage.ec3.NORMAL
            r8.setState(r9)
            goto L_0x0071
        L_0x0106:
            boolean r9 = r10 instanceof defpackage.po7
            if (r9 == 0) goto L_0x0110
            fja.y(r8)
            goto L_0x0071
        L_0x010f:
            return r1
        L_0x0110:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x0116:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.login.confirm.ConfirmPhoneScreen.l0(one.me.login.confirm.ConfirmPhoneScreen, nkd, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(String str) {
        rb3 q0 = q0();
        q0.getClass();
        String str2 = rb3.K0;
        udd.q(str2, "onCodeEntered");
        if (str.length() == 0) {
            udd.U(str2, "empty sms");
        } else if (!str.equals(q0.G0)) {
            q0.G0 = str;
            ContextScope contextScope = q0.a;
            ju3 b2 = ((pae) q0.x0.getValue()).b();
            ru3 ru3 = ru3.b;
            mb3 mb3 = new mb3(q0, str, (Continuation) null);
            k77 k77 = rb3.J0[0];
            q0.I0.o1(q0, k77, q0.b.a(contextScope, b2, ru3, mb3));
        }
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.Y;
    }

    public final void i(int i, Bundle bundle) {
        if (i == jpb.oneme_login_sms_code_exceeded_ok_btn) {
            getRouter().C();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m0(android.widget.TextView r11, int r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.db3
            if (r0 == 0) goto L_0x0013
            r0 = r14
            db3 r0 = (defpackage.db3) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            db3 r0 = new db3
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r10 = r0.Y
            pu3 r14 = pu3.a
            int r1 = r0.w0
            jue r2 = jue.a
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 800(0x320, double:3.953E-321)
            if (r1 == 0) goto L_0x003f
            if (r1 == r5) goto L_0x0037
            if (r1 != r4) goto L_0x002f
            wx3.H(r10)
            goto L_0x0085
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0037:
            boolean r13 = r0.X
            android.widget.TextView r11 = r0.o
            wx3.H(r10)
            goto L_0x0068
        L_0x003f:
            wx3.H(r10)
            r11.setText(r12)
            r11.setAlpha(r3)
            android.view.ViewPropertyAnimator r10 = r11.animate()
            r12 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r10 = r10.alpha(r12)
            android.view.ViewPropertyAnimator r10 = r10.setDuration(r6)
            r10.start()
            r0.o = r11
            r0.X = r13
            r0.w0 = r5
            r8 = 2800(0xaf0, double:1.3834E-320)
            java.lang.Object r10 = defpackage.ek8.q(r8, r0)
            if (r10 != r14) goto L_0x0068
            return r14
        L_0x0068:
            if (r13 != 0) goto L_0x0085
            android.view.ViewPropertyAnimator r10 = r11.animate()
            android.view.ViewPropertyAnimator r10 = r10.alpha(r3)
            android.view.ViewPropertyAnimator r10 = r10.setDuration(r6)
            r10.start()
            r10 = 0
            r0.o = r10
            r0.w0 = r4
            java.lang.Object r10 = defpackage.ek8.q(r6, r0)
            if (r10 != r14) goto L_0x0085
            return r14
        L_0x0085:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.login.confirm.ConfirmPhoneScreen.m0(android.widget.TextView, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final OneMeButton n0() {
        return (OneMeButton) this.A0.T0(this, G0[5]);
    }

    public final hc3 o0() {
        return (hc3) this.B0.T0(this, G0[6]);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [hc3, android.view.View] */
    public final void onAttach(View view) {
        ConfirmPhoneScreen.super.onAttach(view);
        o0().requestFocus();
        rb3 q0 = q0();
        qod qod = q0.H0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        q0.H0 = taf.n(q0, (hu3) null, (ru3) null, new qb3(q0, (Continuation) null), 3);
    }

    /* JADX WARNING: type inference failed for: r12v7, types: [hc3, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new bb3(this, 0)));
        linearLayout.setGravity(17);
        linearLayout.addView(nea);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(jpb.oneme_login_confirm_title);
        textView.setText(utb.oneme_login_confirm_title);
        nte.c.b(textView, yq4.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(((float) 24) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f), 0);
        textView.setLayoutParams(layoutParams);
        urd.B(new y9(3, (Continuation) null, 8), textView);
        textView.setGravity(17);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(jpb.oneme_login_confirm_description);
        nte.l.b(textView2, yq4.b);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), 0);
        textView2.setLayoutParams(layoutParams2);
        urd.B(new y9(3, (Continuation) null, 9), textView2);
        textView2.setGravity(17);
        linearLayout.addView(textView2);
        ? hc3 = new hc3(linearLayout.getContext(), (AttributeSet) null);
        hc3.setId(jpb.oneme_login_confirm_sms_input);
        hc3.setListener(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(dh4.c().getDisplayMetrics().density * f), 0);
        hc3.setLayoutParams(layoutParams3);
        afa.a(hc3, new eb3(hc3, hc3, 0));
        hc3.setKeyboardOpen(new hk2(28));
        k77 k77 = G0[2];
        hc3.setCountCells(((Number) this.X.a(this)).intValue());
        linearLayout.setGravity(17);
        linearLayout.addView(hc3);
        Space space = new Space(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, 0);
        layoutParams4.weight = 1.0f;
        space.setLayoutParams(layoutParams4);
        linearLayout.addView(space);
        TextView textView3 = new TextView(linearLayout.getContext());
        textView3.setId(jpb.oneme_login_confirm_timer);
        nte.o.b(textView3, yq4.b);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        float f2 = (float) 16;
        layoutParams5.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2));
        textView3.setLayoutParams(layoutParams5);
        urd.B(new y9(3, (Continuation) null, 7), textView3);
        textView3.setGravity(17);
        linearLayout.addView(textView3);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(jpb.oneme_login_confirm_resend_code);
        oneMeButton.setText(utb.oneme_login_confirm_resend);
        oneMeButton.setMode(u0a.o);
        oneMeButton.setAppearance(s0a.a);
        oneMeButton.setSize(v0a.a);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams6);
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        s0();
        this.C0 = null;
        o0().setListener((dc3) null);
        ConfirmPhoneScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        mhe mhe = view instanceof mhe ? (mhe) view : null;
        if (mhe != null) {
            mhe.onThemeChanged(km4.y0.r(view));
        }
        k77[] k77Arr = G0;
        k77 k77 = k77Arr[3];
        Context context = getContext();
        int i = utb.oneme_login_confirm_description;
        k77 k772 = k77Arr[1];
        ((TextView) this.y0.T0(this, k77)).setText(context.getString(i, new Object[]{(String) this.o.a(this)}));
        a24.a0(n0(), new d5(21, (Object) this));
        o0().setOnAnimationEnded(new bb3(this, 1));
        ez3.N(new ck5(q0().B0, new fb3(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(q0().D0, new gb3(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(new ik5(q0().E0, 2), new hb3(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(q0().A0, new zv(2, this, ConfirmPhoneScreen.class, "processSmsEvent", "processSmsEvent(Lone/me/login/confirm/SmsCodeResultEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14), 5), getViewLifecycleScope());
        rb3 q0 = q0();
        eb6 eb6 = (eb6) ((wkd) q0.y0.getValue());
        eb6.g = q0.c;
        eb6.b();
    }

    public final TextView p0() {
        return (TextView) this.z0.T0(this, G0[4]);
    }

    public final rb3 q0() {
        return (rb3) this.Z.getValue();
    }

    public final void r0(String str) {
        int i = 0;
        boolean z = str != null;
        n0().setVisibility(z ^ true ? 0 : 8);
        TextView p0 = p0();
        if (!z) {
            i = 8;
        }
        p0.setVisibility(i);
        float f = 1.0f;
        n0().setAlpha(z ? 0.0f : 1.0f);
        TextView p02 = p0();
        if (!z) {
            f = 0.0f;
        }
        p02.setAlpha(f);
        if (str != null) {
            p0().setText(((String) this.D0.getValue()) + " " + str);
        }
    }

    public final void s0() {
        k77[] k77Arr = G0;
        k77 k77 = k77Arr[7];
        e3 e3Var = this.F0;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[7], (Object) null);
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.E0);
        }
        this.E0 = null;
        r0((String) q0().D0.a.getValue());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [hc3, android.view.View] */
    public final void t0(mge mge) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator alpha;
        CharSequence charSequence = null;
        float f = 0.0f;
        if (this.C0 == null && mge != null) {
            int indexOfChild = ((ViewGroup) getView()).indexOfChild(o0());
            TextView textView = new TextView(getContext());
            nte.o.b(textView, yq4.b);
            textView.setTextColor(km4.y0.r(textView).getText().b);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            float f2 = (float) 12;
            layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density), 0);
            textView.setLayoutParams(layoutParams);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            View view = getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.addView(textView, indexOfChild + 1);
            }
            this.C0 = textView;
        }
        if (mge != null) {
            f = 1.0f;
        }
        TextView textView2 = this.C0;
        if (textView2 != null) {
            if (mge != null) {
                charSequence = mge.a(getContext());
            }
            textView2.setText(charSequence);
        }
        TextView textView3 = this.C0;
        if (textView3 != null && (animate = textView3.animate()) != null && (duration = animate.setDuration(200)) != null && (alpha = duration.alpha(f)) != null) {
            alpha.start();
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, lu7] */
    public ConfirmPhoneScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new Object();
        this.b = sy6.d;
        Class<String> cls = String.class;
        this.c = new jr(cls, "screen:confirm_phone:verify_token");
        this.o = new jr(cls, "screen:confirm_phone:phone");
        this.X = new jr(Integer.class, "screen:confirm_phone:code_length");
        this.Y = new jj7(new hk2(29), (s16) null, 6);
        this.Z = createViewModelLazy(rb3.class, new rh2(21, new cb3(this, 0)));
        this.w0 = ez3.O(3, new cb3(this, 1));
        this.x0 = ko7.a.getAccessor().d(c70.class);
        this.y0 = viewBinding(jpb.oneme_login_confirm_description);
        this.z0 = viewBinding(jpb.oneme_login_confirm_timer);
        this.A0 = viewBinding(jpb.oneme_login_confirm_resend_code);
        this.B0 = viewBinding(jpb.oneme_login_confirm_sms_input);
        this.D0 = ez3.O(3, new cb3(this, 2));
        this.F0 = hwf.t();
    }
}
