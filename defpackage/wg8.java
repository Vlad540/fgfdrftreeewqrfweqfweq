package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: wg8  reason: default package */
public final class wg8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ Uri Y;
    public final /* synthetic */ xg8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wg8(Uri uri, xg8 xg8, Continuation continuation) {
        super(2, continuation);
        this.Y = uri;
        this.Z = xg8;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((wg8) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wg8 wg8 = new wg8(this.Y, this.Z, continuation);
        wg8.X = obj;
        return wg8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        xg8 xg8 = this.Z;
        Context context = xg8.o;
        Uri uri = this.Y;
        if (!js.y(uri, context, (g15) null)) {
            vg8 vg8 = xg8.b;
            taf.o(vg8.b, new sg8(uri));
            taf.o(vg8.b, qg8.a);
        } else {
            udd.T(ou3.getClass().getName(), "try to share internal file!", new Object[0]);
        }
        return jue.a;
    }
}
