package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ndc  reason: default package */
public final /* synthetic */ class ndc implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ udc b;
    public final /* synthetic */ String c;

    public /* synthetic */ ndc(udc udc, String str, int i) {
        this.a = i;
        this.b = udc;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.a) {
            case 0:
                udc udc = this.b;
                udc.getClass();
                return udc.b(udc, this.c, continuation);
            default:
                udc udc2 = this.b;
                udc2.getClass();
                return udc.a(udc2, this.c, continuation);
        }
    }
}
