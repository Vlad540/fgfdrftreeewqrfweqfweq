package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

/* renamed from: odc  reason: default package */
public final /* synthetic */ class odc implements u16 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ odc(udc udc, String str, int i) {
        this.c = udc;
        this.o = str;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                udc udc = (udc) this.c;
                udc.getClass();
                return udc.g(udc, (String) this.o, this.b, (Continuation) obj);
            default:
                return Widget.childRouter$lambda$10((Widget) this.c, this.b, (u16) this.o, (sgc) obj);
        }
    }

    public /* synthetic */ odc(Widget widget, int i, u16 u16) {
        this.c = widget;
        this.b = i;
        this.o = u16;
    }
}
