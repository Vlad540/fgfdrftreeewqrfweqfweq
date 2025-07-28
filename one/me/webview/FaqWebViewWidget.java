package one.me.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/webview/FaqWebViewWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "webview_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FaqWebViewWidget extends Widget {
    public static final /* synthetic */ k77[] Z;
    public final pb5 X;
    public final zc4 Y;
    public final n0c a = viewBinding(yea.a);
    public final sy6 b = sy6.d;
    public final e3 c = hwf.t();
    public final t97 o;

    static {
        Class<FaqWebViewWidget> cls = FaqWebViewWidget.class;
        Z = new k77[]{new khb(cls, "webView", "getWebView()Lone/me/sdk/uikit/common/views/OneMeWebView;", 0), c3d.g(m7c.a, cls, "urlJob", "getUrlJob()Lkotlinx/coroutines/Job;")};
    }

    public FaqWebViewWidget() {
        super((Bundle) null, 0, 3, (x54) null);
        spf spf = spf.a;
        this.o = spf.getAccessor().d(al.class);
        this.X = new pb5((t97) spf.getAccessor().d(rf4.class), (t97) spf.getAccessor().d(zy9.class), (t97) spf.getAccessor().d(ap3.class), (t97) spf.getAccessor().d(f03.class), (t97) spf.getAccessor().d(xzc.class), (t97) spf.getAccessor().d(Context.class));
        this.Y = xs7.d(getLifecycleScope(), ((pae) spf.getAccessor().c(pae.class)).a(), new l5e(2, (Continuation) null), 2);
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setTitle(zea.b);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new gw2(10, this)));
        linearLayout.addView(nea);
        sea sea = new sea(linearLayout.getContext(), (AttributeSet) null, 0, 14);
        sea.setId(yea.a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        sea.setLayoutParams(layoutParams);
        sea.getSettings().setJavaScriptEnabled(true);
        sea.setWebViewClient(new k85(this));
        linearLayout.addView(sea);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        FaqWebViewWidget.super.onDestroyView(view);
        k77[] k77Arr = Z;
        k77 k77 = k77Arr[1];
        e3 e3Var = this.c;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[1], (Object) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        xs7.E(getViewLifecycleScope(), (hu3) null, (ru3) null, new l85(this, (Continuation) null), 3);
    }
}
