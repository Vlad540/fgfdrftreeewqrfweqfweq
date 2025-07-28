package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.InputStream;
import org.apache.http.HttpHost;

/* renamed from: uea  reason: default package */
public final class uea extends WebViewClient {
    public static final /* synthetic */ int d = 0;
    public final kmf a;
    public final ch5 b;
    public final r7e c = new r7e(new my9(29));

    public uea(kmf kmf, ch5 ch5) {
        this.a = kmf;
        this.b = ch5;
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        String str2;
        if (webView != null) {
            fyb fyb = (fyb) this.c.getValue();
            Context context = webView.getContext();
            int i = wea.a;
            ThreadLocal threadLocal = fyb.a;
            byte[] bArr = (byte[]) threadLocal.get();
            if (bArr == null) {
                bArr = new byte[65536];
                threadLocal.set(bArr);
            }
            String str3 = null;
            try {
                InputStream openRawResource = context.getResources().openRawResource(i);
                ThreadLocal threadLocal2 = fyb.b;
                byte[] bArr2 = (byte[]) threadLocal2.get();
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                    threadLocal2.set(bArr2);
                }
                int i2 = 0;
                while (true) {
                    try {
                        int read = openRawResource.read(bArr2, 0, bArr2.length);
                        if (read < 0) {
                            break;
                        }
                        int i3 = i2 + read;
                        if (bArr.length < i3) {
                            byte[] bArr3 = new byte[(bArr.length * 2)];
                            System.arraycopy(bArr, 0, bArr3, 0, i2);
                            threadLocal.set(bArr3);
                            bArr = bArr3;
                        }
                        if (read > 0) {
                            System.arraycopy(bArr2, 0, bArr, i2, read);
                            i2 = i3;
                        }
                    } catch (Throwable th) {
                        urd.l(openRawResource, th);
                        throw th;
                    }
                }
                urd.l(openRawResource, (Throwable) null);
                str2 = new String(bArr, 0, i2, e22.a);
            } catch (Throwable th2) {
                str2 = new kcc(th2);
            }
            if (!(str2 instanceof kcc)) {
                str3 = str2;
            }
            String str4 = str3;
            if (str4 != null) {
                webView.evaluateJavascript(str4, new tea(0));
            }
        }
        super.onPageCommitVisible(webView, str);
    }

    public final void onPageFinished(WebView webView, String str) {
        grd grd = this.a.H0;
        oia oia = oia.a;
        oia oia2 = oia.b;
        grd.getClass();
        grd.m(oia, oia2);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.a.H0.m((Object) null, oia.a);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a.H0.m((Object) null, oia.o);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        kmf kmf = this.a;
        if (((i03) kmf.Z).g.getBoolean("web_app:ssl_check", false)) {
            sslErrorHandler.proceed();
            return;
        }
        kmf.H0.m((Object) null, oia.o);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        ch5 ch5 = this.b;
        ch5.getClass();
        if (!hhd.f(url.getScheme(), HttpHost.DEFAULT_SCHEME_NAME) && !hhd.f(url.getScheme(), "https")) {
            try {
                ch5.a.startActivity(new Intent("android.intent.action.VIEW", url));
                return true;
            } catch (ActivityNotFoundException unused) {
                return true;
            } catch (Exception e) {
                udd.s("WebAppUrlInterceptor", "Unexpected exception when try to open activity by link", e);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
