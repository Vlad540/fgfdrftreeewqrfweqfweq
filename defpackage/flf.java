package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: flf  reason: default package */
public final /* synthetic */ class flf implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppRootScreen b;

    public /* synthetic */ flf(WebAppRootScreen webAppRootScreen, int i) {
        this.a = i;
        this.b = webAppRootScreen;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [android.view.View, android.webkit.WebView, sea, lpc] */
    /* JADX WARNING: type inference failed for: r8v3, types: [a9a, android.view.View] */
    public final Object invoke(Object obj) {
        WebAppRootScreen webAppRootScreen = this.b;
        jue jue = jue.a;
        switch (this.a) {
            case 0:
                jue jue2 = jue;
                k77[] k77Arr = WebAppRootScreen.K0;
                pfa.a(1).j((View) obj).e(Collections.singletonList(new pq3(1, (mge) new hge(vub.web_app_root_dots_menu_refresh), Integer.valueOf(zhc.Z), (Integer) null, 20))).build().q(webAppRootScreen);
                return jue2;
            case 1:
                LinearLayout linearLayout = (LinearLayout) obj;
                k77[] k77Arr2 = WebAppRootScreen.K0;
                nea nea = new nea(linearLayout.getContext(), 6);
                nea.setId(vea.i);
                nea.setForm(fea.a);
                WebAppRootScreen webAppRootScreen2 = this.b;
                nea.setRightActions(new cea(new flf(webAppRootScreen2, 0)));
                linearLayout.addView(nea);
                FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
                frameLayout.setId(vea.a);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                Context context = frameLayout.getContext();
                ? sea = new sea(context, (AttributeSet) null, 16842885, 8);
                sea.setId(vea.j);
                sea.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                sea.getSettings().setJavaScriptEnabled(true);
                sea.getSettings().setDomStorageEnabled(true);
                sea.getSettings().setSupportMultipleWindows(true);
                sea.setWebViewClient(new uea(webAppRootScreen2.y0(), new ch5(context)));
                sea.setWebChromeClient(new rea(webAppRootScreen2.y0()));
                sea.addJavascriptInterface(new wpf(webAppRootScreen2.y0()), "WebViewHandler");
                ? a9a = new a9a(frameLayout.getContext());
                a9a.setId(vea.d);
                a9a.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                a9a.setAppearance(p8a.a);
                Context context2 = frameLayout.getContext();
                LinearLayout linearLayout2 = new LinearLayout(context2);
                linearLayout2.setId(vea.b);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
                float f = (float) 20;
                layoutParams.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
                layoutParams.setMarginEnd(a24.X(f * dh4.c().getDisplayMetrics().density));
                linearLayout2.setLayoutParams(layoutParams);
                linearLayout2.setOrientation(1);
                Drawable b2 = gq3.b(linearLayout2.getContext(), phc.v0);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(b2);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 1;
                imageView.setLayoutParams(layoutParams2);
                TextView textView = new TextView(context2);
                textView.setText(vub.web_app_root_error_title);
                textView.setSingleLine();
                nte.d.b(textView, yq4.b);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 1;
                layoutParams3.topMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                textView.setLayoutParams(layoutParams3);
                TextView textView2 = new TextView(context2);
                textView2.setText(vub.web_app_root_error_subtitle);
                textView2.setSingleLine();
                nte.m.b(textView2, yq4.b);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.topMargin = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
                layoutParams4.bottomMargin = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                layoutParams4.gravity = 1;
                textView2.setLayoutParams(layoutParams4);
                OneMeButton oneMeButton = new OneMeButton(context2, (AttributeSet) null);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 1;
                oneMeButton.setLayoutParams(layoutParams5);
                oneMeButton.setText(vub.web_app_root_error_retry_button);
                oneMeButton.setMode(u0a.b);
                oneMeButton.setAppearance(s0a.o);
                a24.a0(oneMeButton, new wfc(13, webAppRootScreen2));
                jue jue3 = jue;
                LinearLayout linearLayout3 = linearLayout2;
                urd.B(new od1(textView, textView2, b2, (Continuation) null, 8), linearLayout3);
                linearLayout3.addView(imageView);
                linearLayout3.addView(textView);
                linearLayout3.addView(textView2);
                linearLayout3.addView(oneMeButton);
                frameLayout.addView(sea);
                e07.B(new ck5(webAppRootScreen2.y0().N0, new glf(webAppRootScreen2, sea, frameLayout, linearLayout3, a9a, (Continuation) null), 5), webAppRootScreen2.getViewLifecycleScope());
                linearLayout.addView(frameLayout);
                return jue3;
            case 2:
                View view = (View) obj;
                k77[] k77Arr3 = WebAppRootScreen.K0;
                b0d b0d = webAppRootScreen.y0().G0;
                b0d.getClass();
                xs7.E((ou3) b0d.b, (hu3) null, (ru3) null, new l57(b0d, (Continuation) null), 3);
                return jue;
            default:
                View view2 = (View) obj;
                k77[] k77Arr4 = WebAppRootScreen.K0;
                kmf y0 = webAppRootScreen.y0();
                y0.getClass();
                taf.n(y0, (hu3) null, (ru3) null, new bmf(y0, (Continuation) null), 3);
                return jue;
        }
    }
}
