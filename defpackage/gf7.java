package defpackage;

import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.sdk.arch.Widget;

/* renamed from: gf7  reason: default package */
public final /* synthetic */ class gf7 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkInterceptorWidget b;

    public /* synthetic */ gf7(LinkInterceptorWidget linkInterceptorWidget, int i) {
        this.a = i;
        this.b = linkInterceptorWidget;
    }

    public final Object invoke() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                int i = LinkInterceptorWidget.o;
                return new we1(new r7e(new gf7(widget, 1)), new jrf(widget, 0));
            default:
                int i2 = LinkInterceptorWidget.o;
                return widget.getRouter();
        }
    }
}
