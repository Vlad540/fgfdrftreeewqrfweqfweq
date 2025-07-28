package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* renamed from: ieb  reason: default package */
public final class ieb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ieb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ieb ieb = new ieb(continuation, this.Y);
        ieb.X = obj;
        return ieb;
    }

    public final Object o(Object obj) {
        ProfileScreen profileScreen;
        boolean z;
        wx3.H(obj);
        l5b l5b = (l5b) this.X;
        k77[] k77Arr = ProfileScreen.H0;
        ProfileScreen profileScreen2 = this.Y;
        CharSequence charSequence = null;
        profileScreen2.o0().setRightActions(l5b.b ? new aea((jea) null, new gea(l9a.g, new ty0(10, profileScreen2))) : yda.a);
        k77[] k77Arr2 = ProfileScreen.H0;
        mz9 mz9 = (mz9) profileScreen2.x0.T0(profileScreen2, k77Arr2[4]);
        CharSequence charSequence2 = "";
        CharSequence charSequence3 = l5b.f;
        if (charSequence3 == null) {
            charSequence3 = charSequence2;
        }
        ub0 ub0 = new ub0(charSequence3, l5b.a);
        int i = mz9.O0;
        mz9.g(ub0, true);
        mz9.setAvatarUrls(l5b.c);
        mz9.setAlpha(l5b.i ? 0.4f : 1.0f);
        a24.a0(mz9, new jsc(11, profileScreen2));
        int i2 = 8;
        AppCompatTextView appCompatTextView = (AppCompatTextView) profileScreen2.B0.T0(profileScreen2, k77Arr2[8]);
        mge mge = l5b.g;
        CharSequence a = mge != null ? mge.a(profileScreen2.getContext()) : null;
        boolean z2 = !(a == null || a.length() == 0);
        mge mge2 = l5b.h;
        if (z2) {
            CharSequence a2 = mge2 != null ? mge2.a(profileScreen2.getContext()) : null;
            if (!(a2 == null || a2.length() == 0)) {
                i2 = 0;
            }
        }
        appCompatTextView.setVisibility(i2);
        CharSequence a3 = mge2 != null ? mge2.a(profileScreen2.getContext()) : null;
        if (!(a3 == null || a3.length() == 0)) {
            ((AppCompatTextView) profileScreen2.A0.T0(profileScreen2, k77Arr2[7])).setText(a3);
        }
        TextView textView = (TextView) profileScreen2.z0.T0(profileScreen2, k77Arr2[6]);
        if (mge != null) {
            charSequence = mge.a(profileScreen2.getContext());
        }
        textView.setText(charSequence);
        nea o0 = profileScreen2.o0();
        CharSequence charSequence4 = l5b.e;
        o0.setTitle(charSequence4 == null ? charSequence2 : charSequence4);
        TextView n0 = profileScreen2.n0();
        boolean z3 = l5b.j;
        if (!z3) {
            profileScreen = profileScreen2;
            z = z3;
        } else {
            int o = jjd.o(profileScreen2.getContext());
            ViewGroup.LayoutParams layoutParams = profileScreen2.n0().getLayoutParams();
            int marginStart = o - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams2 = profileScreen2.n0().getLayoutParams();
            int marginEnd = marginStart - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
            Context context = profileScreen2.getContext();
            TextPaint paint = profileScreen2.n0().getPaint();
            qq9 qq9 = new qq9(27);
            if (charSequence4 == null || charSequence4.length() == 0) {
                profileScreen = profileScreen2;
                z = z3;
                if (charSequence4 != null) {
                    charSequence2 = charSequence4;
                }
                charSequence4 = charSequence2;
            } else {
                int C = xy6.C(paint.getTextSize() / context.getResources().getDisplayMetrics().density);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence4);
                spannableStringBuilder.append(8288);
                spannableStringBuilder.append(" ");
                spannableStringBuilder.setSpan(new c1f(context, C, false, qq9), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(spannableStringBuilder);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), paint, marginEnd);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout build = obtain.setAlignment(alignment).setIncludePad(false).build();
                int min = Math.min(build.getLineCount() - 1, 2);
                CharSequence subSequence = build.getText().subSequence(build.getLineStart(0), build.getLineEnd(min));
                if (hhd.f(subSequence, spannableString)) {
                    profileScreen = profileScreen2;
                    z = z3;
                    charSequence4 = spannableString;
                } else {
                    z = z3;
                    profileScreen = profileScreen2;
                    StaticLayout build2 = StaticLayout.Builder.obtain(spannableString, build.getLineStart(min), build.getLineEnd(min), paint, me4.p((float) sxe.f(C), dh4.c().getDisplayMetrics().density, me4.p((float) sxe.i(C), dh4.c().getDisplayMetrics().density, marginEnd))).setAlignment(alignment).setIncludePad(false).build();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(h0e.m0(subSequence, build.getLineStart(min), build.getLineEnd(min), build2.getText().subSequence(build2.getLineStart(0), build2.getLineEnd(0) - 3)));
                    spannableStringBuilder2.append(8288);
                    spannableStringBuilder2.append("...");
                    spannableStringBuilder2.append(8288);
                    spannableStringBuilder2.append(" ");
                    spannableStringBuilder2.setSpan(new c1f(context, C, false, qq9), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    charSequence4 = new SpannableString(spannableStringBuilder2);
                }
            }
        }
        n0.setText(charSequence4);
        ProfileScreen.l0(profileScreen, profileScreen.o0(), z);
        return jue.a;
    }
}
