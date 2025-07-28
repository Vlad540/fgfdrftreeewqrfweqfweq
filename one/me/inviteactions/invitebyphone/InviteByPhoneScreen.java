package one.me.inviteactions.invitebyphone;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/inviteactions/invitebyphone/InviteByPhoneScreen;", "Lone/me/sdk/arch/Widget;", "Lkv3;", "", "Llc3;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0})
public final class InviteByPhoneScreen extends Widget implements kv3, lc3 {
    public static final /* synthetic */ k77[] F0;
    public final r7e A0 = new r7e(new fs5(23));
    public final t97 B0 = x07.a.getAccessor().d(loa.class);
    public b07 C0;
    public final jr D0 = new jr(v3a.class, u3a.b, "screen:input_phone:country_model");
    public final ae1 E0 = new ae1(this, 5);
    public final jr X = new jr(String.class, BuildConfig.FLAVOR, "screen:input_phone:phone");
    public final n0c Y = viewBinding(u5a.i);
    public final n0c Z = viewBinding(u5a.g);
    public final /* synthetic */ lu7 a = new Object();
    public final jj7 b = new jj7((s16) new fs5(21), (s16) null, 6);
    public final sy6 c = sy6.d;
    public final t97 o = createViewModelLazy(r17.class, new js5(5, new fs5(22)));
    public final n0c w0 = viewBinding(u5a.f);
    public final n0c x0 = viewBinding(u5a.h);
    public final n0c y0 = viewBinding(u5a.j);
    public AppCompatTextView z0;

    static {
        Class<InviteByPhoneScreen> cls = InviteByPhoneScreen.class;
        F0 = new k77[]{new hc9(cls, "phone", "getPhone()Ljava/lang/String;"), m4b.g(m7c.a, cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new khb(cls, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0), new khb(cls, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new khb(cls, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new hc9(cls, "selectedCountry", "getSelectedCountry()Lone/me/sdk/phoneutils/OneMeCountryModel;")};
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, lu7] */
    public InviteByPhoneScreen() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l0(one.me.inviteactions.invitebyphone.InviteByPhoneScreen r8, java.lang.CharSequence r9) {
        /*
            androidx.appcompat.widget.AppCompatTextView r0 = r8.z0
            r1 = 0
            if (r0 != 0) goto L_0x0083
            if (r9 == 0) goto L_0x0083
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r2 = r8.getContext()
            r3 = 0
            r0.<init>(r2, r3)
            nge r2 = nte.o
            nge.d(r2, r0)
            s59 r2 = defpackage.km4.y0
            pda r2 = r2.r(r0)
            cfe r2 = r2.getText()
            int r2 = r2.b
            r0.setTextColor(r2)
            re3 r2 = new re3
            r4 = -2
            r2.<init>(r1, r4)
            r4 = 24
            float r4 = (float) r4
            android.content.res.Resources r5 = dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = defpackage.a24.X(r5)
            r6 = 4
            float r6 = (float) r6
            android.content.res.Resources r7 = dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = defpackage.a24.X(r6)
            android.content.res.Resources r7 = dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r4 = r4 * r7
            int r4 = defpackage.a24.X(r4)
            r2.setMargins(r5, r6, r4, r1)
            int r4 = defpackage.u5a.h
            r2.j = r4
            r2.t = r1
            r2.v = r1
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r4)
            r0.setLayoutParams(r2)
            android.view.View r2 = r8.getView()
            boolean r4 = r2 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x007c
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x007c:
            if (r3 == 0) goto L_0x0081
            r3.addView(r0)
        L_0x0081:
            r8.z0 = r0
        L_0x0083:
            androidx.appcompat.widget.AppCompatTextView r0 = r8.z0
            if (r0 == 0) goto L_0x008a
            r0.setText(r9)
        L_0x008a:
            androidx.appcompat.widget.AppCompatTextView r8 = r8.z0
            if (r8 == 0) goto L_0x00a4
            r0 = 1
            if (r9 == 0) goto L_0x009a
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r9 = r1
            goto L_0x009b
        L_0x009a:
            r9 = r0
        L_0x009b:
            r9 = r9 ^ r0
            if (r9 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r1 = 8
        L_0x00a1:
            r8.setVisibility(r1)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.inviteactions.invitebyphone.InviteByPhoneScreen.l0(one.me.inviteactions.invitebyphone.InviteByPhoneScreen, java.lang.CharSequence):void");
    }

    public final void K(v3a v3a) {
        o0().y0.m((Object) null, v3a);
    }

    public final sy6 getInsetsConfig() {
        return this.c;
    }

    public final rnc getScreenDelegate() {
        return this.b;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.sdk.arch.Widget, one.me.inviteactions.invitebyphone.InviteByPhoneScreen] */
    public final void i(int i, Bundle bundle) {
        if (i == h9a.d) {
            getRouter().C();
        } else if (i == u5a.b) {
            ((ak3) this.A0.getValue()).a(getContext());
        }
    }

    public final OneMeButton m0() {
        return (OneMeButton) this.w0.T0(this, F0[3]);
    }

    public final y7a n0() {
        return (y7a) this.x0.T0(this, F0[4]);
    }

    public final r17 o0() {
        return (r17) this.o.getValue();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rr3, one.me.inviteactions.invitebyphone.InviteByPhoneScreen, java.lang.Object] */
    public final void onAttach(View view) {
        InviteByPhoneScreen.super.onAttach(view);
        n0().postDelayed(new vp6(2, this), 200);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i17 i17 = new i17(this, getContext());
        nea nea = new nea(i17.getContext(), 6);
        int i = u5a.j;
        nea.setId(i);
        re3 re3 = new re3(-1, -2);
        re3.i = 0;
        re3.t = 0;
        re3.v = 0;
        nea.setLayoutParams(re3);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new gw2(19, this)));
        i17.addView(nea);
        AppCompatTextView appCompatTextView = new AppCompatTextView(i17.getContext(), (AttributeSet) null);
        int i2 = u5a.i;
        appCompatTextView.setId(i2);
        nge.d(nte.c, appCompatTextView);
        appCompatTextView.setText(v5a.k);
        re3 re32 = new re3(0, -2);
        float f = (float) 28;
        float f2 = (float) 24;
        re32.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f), 0);
        re32.j = i;
        re32.t = 0;
        re32.v = 0;
        appCompatTextView.setGravity(17);
        appCompatTextView.setLayoutParams(re32);
        i17.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(i17.getContext(), (AttributeSet) null);
        int i3 = u5a.g;
        appCompatTextView2.setId(i3);
        nge.d(nte.l, appCompatTextView2);
        appCompatTextView2.setText(v5a.i);
        re3 re33 = new re3(0, -2);
        float f3 = (float) 12;
        re33.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f * dh4.c().getDisplayMetrics().density), 0);
        re33.j = i2;
        re33.t = 0;
        re33.v = 0;
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setLayoutParams(re33);
        i17.addView(appCompatTextView2);
        y7a y7a = new y7a(i17.getContext());
        y7a.setId(u5a.h);
        re3 re34 = new re3(0, -2);
        re34.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f3), 0);
        re34.j = i3;
        re34.t = 0;
        re34.v = 0;
        y7a.setLayoutParams(re34);
        y7a.setPhoneFormatterProvider(new e44(this, 16, y7a));
        y7a.setOnCountryViewClickListener(new gz3(22, this));
        i17.addView(y7a);
        OneMeButton oneMeButton = new OneMeButton(i17.getContext(), (AttributeSet) null);
        oneMeButton.setId(u5a.f);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setAppearance(s0a.o);
        re3 re35 = new re3(0, -2);
        re35.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), 0, a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        re35.l = 0;
        re35.t = 0;
        re35.v = 0;
        oneMeButton.setLayoutParams(re35);
        oneMeButton.setText(v5a.h);
        i17.addView(oneMeButton);
        return i17;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.inviteactions.invitebyphone.InviteByPhoneScreen] */
    public final void onDestroyView(View view) {
        InviteByPhoneScreen.super.onDestroyView(view);
        this.z0 = null;
        y7a n0 = n0();
        n0.A0.removeTextChangedListener(this.C0);
        this.C0 = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.inviteactions.invitebyphone.InviteByPhoneScreen] */
    public final void onDetach(View view) {
        InviteByPhoneScreen.super.onDetach(view);
        bm3.r(view);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [rr3, one.me.sdk.arch.Widget, one.me.inviteactions.invitebyphone.InviteByPhoneScreen, java.lang.Object] */
    public final void onViewCreated(View view) {
        InviteByPhoneScreen.super.onViewCreated(view);
        mhe mhe = view instanceof mhe ? (mhe) view : null;
        if (mhe != null) {
            mhe.onThemeChanged(km4.y0.r(view));
        }
        y7a n0 = n0();
        k77[] k77Arr = F0;
        boolean z = false;
        k77 k77 = k77Arr[0];
        jr jrVar = this.X;
        n0.setText((String) jrVar.a(this));
        OneMeButton m0 = m0();
        k77 k772 = k77Arr[0];
        if (((String) jrVar.a(this)).length() > 0) {
            z = true;
        }
        m0.setEnabled(z);
        a24.Z(m0(), 300, new eu5(5, this));
        k77 k773 = k77Arr[6];
        K((v3a) this.D0.a(this));
        n0().A0.addTextChangedListener(this.E0);
        l05 l05 = o0().Z;
        pc7 R = this.lifecycleOwner.R();
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(l05, R, ob7), new h17((Continuation) null, this), 5), getLifecycleScope());
        ez3.N(new ck5(wx3.e(o0().x0, this.lifecycleOwner.R(), ob7), new j17((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(o0().z0, getViewLifecycleOwner().R(), ob7), new g17((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
