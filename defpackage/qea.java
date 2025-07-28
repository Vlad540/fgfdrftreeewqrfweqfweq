package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: qea  reason: default package */
public final class qea extends WebViewClient {
    public final /* synthetic */ rea a;
    public final /* synthetic */ sea b;

    public qea(rea rea, sea sea) {
        this.a = rea;
        this.b = sea;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        kmf kmf = this.a.a;
        kmf.getClass();
        taf.o(kmf.O0, new nlf(uri));
        this.b.destroy();
        return true;
    }
}
