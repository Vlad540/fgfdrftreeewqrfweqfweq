package defpackage;

import android.net.Uri;
import android.os.Message;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: rea  reason: default package */
public final class rea extends WebChromeClient {
    public final kmf a;

    public rea(kmf kmf) {
        this.a = kmf;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Object obj = null;
        sea sea = new sea(webView.getContext(), (AttributeSet) null, 0, 14);
        sea.setWebViewClient(new qea(this, sea));
        if (message != null) {
            obj = message.obj;
        }
        ((WebView.WebViewTransport) obj).setWebView(sea);
        message.sendToTarget();
        return true;
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        sea sea = webView instanceof sea ? (sea) webView : null;
        if (sea == null) {
            return false;
        }
        ValueCallback<Uri[]> filePathCallback = sea.getFilePathCallback();
        if (filePathCallback != null) {
            filePathCallback.onReceiveValue((Object) null);
        }
        sea.setFilePathCallback(valueCallback);
        kmf kmf = this.a;
        kmf.getClass();
        taf.o(kmf.O0, new slf(fileChooserParams));
        return true;
    }
}
