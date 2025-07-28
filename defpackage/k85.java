package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.coroutines.Continuation;
import one.me.webview.FaqWebViewWidget;

/* renamed from: k85  reason: default package */
public final class k85 extends WebViewClient {
    public final /* synthetic */ FaqWebViewWidget a;

    public k85(FaqWebViewWidget faqWebViewWidget) {
        this.a = faqWebViewWidget;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            String scheme = url.getScheme();
            FaqWebViewWidget faqWebViewWidget = this.a;
            if (scheme == null || !h0e.R(scheme, "mailto", false)) {
                String scheme2 = url.getScheme();
                if (scheme2 != null && h0e.R(scheme2, ((gg7) ((al) faqWebViewWidget.o.getValue())).b, false)) {
                    k77[] k77Arr = FaqWebViewWidget.Z;
                    try {
                        faqWebViewWidget.startActivity(new Intent("android.intent.action.VIEW", url));
                    } catch (ActivityNotFoundException e) {
                        String name = FaqWebViewWidget.class.getName();
                        String message = e.getMessage();
                        udd.s(name, "error handleUrl - " + url + ": " + message, e);
                    }
                    return true;
                }
            } else {
                k77[] k77Arr2 = FaqWebViewWidget.Z;
                qod E = xs7.E(faqWebViewWidget.getViewLifecycleScope(), (hu3) null, ru3.b, new m85(faqWebViewWidget, (Continuation) null), 1);
                faqWebViewWidget.c.o1(faqWebViewWidget, FaqWebViewWidget.Z[1], E);
                return true;
            }
        }
        return false;
    }
}
