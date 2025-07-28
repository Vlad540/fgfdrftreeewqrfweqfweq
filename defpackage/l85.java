package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.webview.FaqWebViewWidget;

/* renamed from: l85  reason: default package */
public final class l85 extends l5e implements i26 {
    public Uri.Builder X;
    public int Y;
    public final /* synthetic */ FaqWebViewWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l85(FaqWebViewWidget faqWebViewWidget, Continuation continuation) {
        super(2, continuation);
        this.Z = faqWebViewWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l85(this.Z, continuation);
    }

    public final Object o(Object obj) {
        Uri.Builder builder;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        FaqWebViewWidget faqWebViewWidget = this.Z;
        if (i == 0) {
            wx3.H(obj);
            Uri.Builder buildUpon = Uri.parse(d8.u(faqWebViewWidget.getContext(), cic.I1)).buildUpon();
            this.X = buildUpon;
            this.Y = 1;
            Object awaitInternal = faqWebViewWidget.Y.awaitInternal(this);
            if (awaitInternal == pu3) {
                return pu3;
            }
            Uri.Builder builder2 = buildUpon;
            obj = awaitInternal;
            builder = builder2;
        } else if (i == 1) {
            builder = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            builder.appendQueryParameter("source", "settings");
        } else {
            builder.appendQueryParameter("source", "reg");
        }
        String uri = builder.build().toString();
        k77[] k77Arr = FaqWebViewWidget.Z;
        faqWebViewWidget.getClass();
        ((sea) faqWebViewWidget.a.T0(faqWebViewWidget, FaqWebViewWidget.Z[0])).loadUrl(uri);
        return jue.a;
    }
}
