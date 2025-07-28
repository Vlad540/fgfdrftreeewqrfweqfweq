package defpackage;

import android.content.UriMatcher;
import android.net.Uri;
import kotlin.coroutines.Continuation;
import ru.ok.messages.NotificationsImagesProvider;

/* renamed from: zp9  reason: default package */
public final class zp9 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ NotificationsImagesProvider Z;
    public final /* synthetic */ Uri w0;
    public final /* synthetic */ ov0 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zp9(NotificationsImagesProvider notificationsImagesProvider, Uri uri, ov0 ov0, Continuation continuation) {
        super(2, continuation);
        this.Z = notificationsImagesProvider;
        this.w0 = uri;
        this.x0 = ov0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zp9 zp9 = new zp9(this.Z, this.w0, this.x0, continuation);
        zp9.Y = obj;
        return zp9;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        NotificationsImagesProvider notificationsImagesProvider = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            this.Y = ou32;
            this.X = 1;
            UriMatcher uriMatcher = NotificationsImagesProvider.a;
            notificationsImagesProvider.getClass();
            zv1 zv1 = new zv1(1, urd.y(this));
            zv1.n();
            g0 g = a06.u().g(tr6.a(this.w0));
            zv1.d(new sb5(g, 1));
            g.m(new bq9(zv1, 0), xn1.a);
            Object m = zv1.m();
            if (m != pu3) {
                m = jue.a;
            }
            if (m == pu3) {
                return pu3;
            }
            ou3 = ou32;
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Y = null;
        this.X = 2;
        obj = NotificationsImagesProvider.a(notificationsImagesProvider, this.x0, ou3, this);
        return obj == pu3 ? pu3 : obj;
    }
}
