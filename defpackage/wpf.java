package defpackage;

import android.webkit.JavascriptInterface;
import kotlin.coroutines.Continuation;

/* renamed from: wpf  reason: default package */
public final class wpf {
    public final kmf a;

    public wpf(kmf kmf) {
        this.a = kmf;
    }

    @JavascriptInterface
    public final void postEvent(String str, String str2) {
        b0d b0d = this.a.G0;
        xs7.E((ou3) b0d.b, ((pae) b0d.c).a(), (ru3) null, new k57(str, str2, b0d, (Continuation) null), 2);
    }

    @JavascriptInterface
    public final void resolveShare(String str, byte[] bArr, String str2, String str3) {
        kmf kmf = this.a;
        kmf.getClass();
        taf.n(kmf, (hu3) null, (ru3) null, new dmf(kmf, str, bArr, str2, str3, (Continuation) null), 3);
    }
}
