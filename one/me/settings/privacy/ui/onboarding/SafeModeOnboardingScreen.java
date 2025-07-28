package one.me.settings.privacy.ui.onboarding;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/onboarding/SafeModeOnboardingScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SafeModeOnboardingScreen extends Widget {
    public static final /* synthetic */ int c = 0;
    public final sy6 a = sy6.d;
    public final jj7 b = new jj7(mnc.SETTINGS_PRIVACY_SAFE_MODE);

    public SafeModeOnboardingScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        sy6 sy6 = sy6.c;
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final rnc getScreenDelegate() {
        return this.b;
    }

    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup constraintLayout = new ConstraintLayout(viewGroup.getContext());
        constraintLayout.setId(mqb.oneme_settings_privacy_onboarding_root);
        s59 s59 = km4.y0;
        constraintLayout.setBackgroundColor(s59.r(constraintLayout).b().i);
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        constraintLayout.setClipToOutline(false);
        nea nea = new nea(constraintLayout.getContext(), 6);
        nea.setId(mqb.oneme_settings_privacy_onboarding_toolbar);
        nea.setForm(fea.a);
        nea.setBackgroundColor(0);
        nea.setLayoutParams(new re3(-1, -2));
        nea.setTranslationZ(1000.0f);
        nea.setLeftActions(new vda(new ljc(0, this)));
        constraintLayout.addView(nea);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(mqb.oneme_settings_privacy_onboarding_scroll_view);
        scrollView.setLayoutParams(new re3(-1, -2));
        Context context = scrollView.getContext();
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(mqb.oneme_settings_privacy_onboarding_content);
        constraintLayout2.setClipChildren(false);
        constraintLayout2.setClipToPadding(false);
        constraintLayout2.setClipToOutline(false);
        Guideline guideline = new Guideline(context);
        guideline.setId(mqb.oneme_settings_privacy_onboarding_top_guideline);
        re3 re3 = new re3(0, 0);
        re3.a = a24.X(((float) 60) * dh4.c().getDisplayMetrics().density);
        re3.V = 0;
        guideline.setLayoutParams(re3);
        constraintLayout2.addView(guideline);
        View view = new View(context);
        view.setId(mqb.oneme_settings_privacy_onboarding_lock_background);
        re3 re32 = new re3(0, 0);
        re32.topMargin = guideline.getLayoutParams().a;
        view.setLayoutParams(re32);
        constraintLayout2.setClipToPadding(false);
        view.setClipToOutline(false);
        idd idd = new idd(context);
        idd.c(false);
        view.setBackground(idd);
        constraintLayout2.addView(view);
        ImageView imageView = new ImageView(context);
        imageView.setId(mqb.oneme_settings_privacy_onboarding_lock);
        imageView.setLayoutParams(new re3(0, 0));
        imageView.setImageResource(qnb.oneme_settings_privacy_big_lock);
        constraintLayout2.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(mqb.oneme_settings_privacy_onboarding_content_title);
        re3 re33 = new re3(-2, -2);
        float f = (float) 32;
        re33.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
        re33.setMarginEnd(a24.X(dh4.c().getDisplayMetrics().density * f));
        textView.setLayoutParams(re33);
        textView.setMaxLines(1);
        textView.setTextAlignment(4);
        nte.c.b(textView, yq4.b);
        textView.setTextColor(s59.r(textView).getText().e);
        textView.setText(oub.oneme_settings_privacy_screen_safe_mode);
        constraintLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setId(mqb.oneme_settings_privacy_onboarding_content_subtitle);
        re3 re34 = new re3(-2, -2);
        re34.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
        re34.setMarginEnd(a24.X(dh4.c().getDisplayMetrics().density * f));
        textView2.setLayoutParams(re34);
        textView2.setMaxLines(2);
        textView2.setTextAlignment(4);
        nte.m.b(textView2, yq4.b);
        textView2.setTextColor(s59.r(textView2).getText().f);
        textView2.setText(oub.oneme_settings_privacy_onboarding_content_subtitle);
        constraintLayout2.addView(textView2);
        ConstraintLayout n7d = new n7d(context, (AttributeSet) null);
        n7d.setId(mqb.oneme_settings_privacy_onboarding_item_1);
        n7d.setStartIcon(zhc.k);
        n7d.setTitle((CharSequence) d8.u(n7d.getContext(), oub.oneme_settings_privacy_onboarding_item_1_title));
        n7d.setDescription((CharSequence) d8.u(n7d.getContext(), oub.oneme_settings_privacy_onboarding_item_1_subtitle));
        n7d.onThemeChanged(s59.n(context).g());
        constraintLayout2.addView(n7d);
        ConstraintLayout n7d2 = new n7d(context, (AttributeSet) null);
        n7d2.setId(mqb.oneme_settings_privacy_onboarding_item_2);
        n7d2.setStartIcon(zhc.h);
        n7d2.setTitle((CharSequence) d8.u(n7d2.getContext(), oub.oneme_settings_privacy_onboarding_item_2_title));
        n7d2.setDescription((CharSequence) d8.u(n7d2.getContext(), oub.oneme_settings_privacy_onboarding_item_2_subtitle));
        n7d2.onThemeChanged(s59.n(context).g());
        constraintLayout2.addView(n7d2);
        ConstraintLayout n7d3 = new n7d(context, (AttributeSet) null);
        n7d3.setId(mqb.oneme_settings_privacy_onboarding_item_3);
        n7d3.setStartIcon(zhc.Y);
        nea nea2 = nea;
        n7d3.setTitle((CharSequence) d8.u(n7d3.getContext(), oub.oneme_settings_privacy_onboarding_item_3_title));
        n7d3.setDescription((CharSequence) d8.u(n7d3.getContext(), oub.oneme_settings_privacy_onboarding_item_3_subtitle));
        n7d3.onThemeChanged(s59.n(context).g());
        constraintLayout2.addView(n7d3);
        bf3 p = a06.p(constraintLayout2);
        int id = view.getId();
        p.d(id, 3, 0, 3);
        p.d(id, 6, 0, 6);
        p.d(id, 7, 0, 7);
        float f2 = (float) HttpStatus.SC_MULTIPLE_CHOICES;
        ViewGroup viewGroup2 = constraintLayout;
        p.g(id).d.Z = a24.X(dh4.c().getDisplayMetrics().density * f2);
        p.g(id).d.a0 = a24.X(dh4.c().getDisplayMetrics().density * f2);
        p.g(id).d.y = "1:1";
        int id2 = imageView.getId();
        p.d(id2, 3, guideline.getId(), 3);
        p.d(id2, 6, view.getId(), 6);
        p.d(id2, 7, view.getId(), 7);
        p.d(id2, 4, view.getId(), 4);
        p.g(id2).d.Z = a24.X(f2 * dh4.c().getDisplayMetrics().density);
        p.g(id2).d.a0 = a24.X(((float) 212) * dh4.c().getDisplayMetrics().density);
        int id3 = textView.getId();
        p.d(id3, 3, view.getId(), 4);
        p.d(id3, 6, 0, 6);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id3, 4));
        p.d(id3, 7, 0, 7);
        new hw9(p, 7, id3, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        int id4 = textView2.getId();
        p.d(id4, 3, textView.getId(), 4);
        p.d(id4, 6, 0, 6);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id4, 4));
        p.d(id4, 7, 0, 7);
        new hw9(p, 7, id4, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        int id5 = n7d.getId();
        p.d(id5, 3, textView2.getId(), 4);
        hr1.q((float) 36, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id5, 4));
        p.d(id5, 6, 0, 6);
        float f3 = (float) 12;
        new hw9(p, 6, id5, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f3));
        p.d(id5, 7, 0, 7);
        new hw9(p, 7, id5, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f3));
        int id6 = n7d2.getId();
        p.d(id6, 3, n7d.getId(), 4);
        float f4 = (float) 4;
        hr1.q(f4, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id6, 4));
        p.d(id6, 6, 0, 6);
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id6, 4));
        p.d(id6, 7, 0, 7);
        new hw9(p, 7, id6, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f3));
        int id7 = n7d3.getId();
        p.d(id7, 3, n7d2.getId(), 4);
        hr1.q(f4, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id7, 4));
        p.d(id7, 6, 0, 6);
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id7, 4));
        p.d(id7, 7, 0, 7);
        new hw9(p, 7, id7, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f3));
        p.a(constraintLayout2);
        scrollView.addView(constraintLayout2);
        ViewGroup viewGroup3 = viewGroup2;
        viewGroup3.addView(scrollView);
        OneMeButton oneMeButton = new OneMeButton(viewGroup3.getContext(), (AttributeSet) null);
        oneMeButton.setId(mqb.oneme_settings_privacy_onboarding_set_pin_code_button);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setAppearance(s0a.c);
        oneMeButton.setText(oub.oneme_settings_privacy_onboarding_set_pin_code);
        oneMeButton.setLayoutParams(new re3(0, -2));
        a24.a0(oneMeButton, new b20(7));
        viewGroup3.addView(oneMeButton);
        bf3 p2 = a06.p(viewGroup3);
        int id8 = nea2.getId();
        p2.d(id8, 3, 0, 3);
        p2.d(id8, 6, 0, 6);
        p2.d(id8, 7, 0, 7);
        int id9 = scrollView.getId();
        p2.d(id9, 3, 0, 3);
        p2.d(id9, 6, 0, 6);
        p2.d(id9, 7, 0, 7);
        int id10 = oneMeButton.getId();
        p2.d(id10, 6, 0, 6);
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p2, 6, id10, 4));
        p2.d(id10, 7, 0, 7);
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p2, 7, id10, 4));
        p2.d(id10, 4, 0, 4);
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p2, 4, id10, 4));
        p2.g(id10).d.Z = a24.X(((float) 336) * dh4.c().getDisplayMetrics().density);
        p2.a(viewGroup3);
        return viewGroup3;
    }

    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        km4.y0.n(view.getContext()).g();
        window.setStatusBarColor(0);
    }

    public final void onViewCreated(View view) {
        urd.B(new wua(view, (Continuation) null, 10, false), view);
    }
}
