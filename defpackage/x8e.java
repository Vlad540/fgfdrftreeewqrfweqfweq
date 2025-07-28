package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executors;
import kotlin.coroutines.Continuation;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;

/* renamed from: x8e  reason: default package */
public final class x8e extends l5e implements i26 {
    public int X;
    public final /* synthetic */ b9e Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x8e(b9e b9e, Continuation continuation) {
        super(2, continuation);
        this.Y = b9e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x8e(this.Y, continuation);
    }

    public final Object o(Object obj) {
        FirebaseMessaging instance;
        n6g n6g;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        b9e b9e = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ezd g = b9e.g();
            this.X = 1;
            fb6 fb6 = (fb6) g;
            if (fb6.a()) {
                cjc cjc = new cjc(urd.y(this));
                ea6 ea6 = FirebaseMessaging.k;
                synchronized (FirebaseMessaging.class) {
                    instance = FirebaseMessaging.getInstance(ih5.b());
                }
                if (instance.e() == null) {
                    n6g = gwf.o((Object) null);
                } else {
                    vde vde = new vde();
                    Executors.newSingleThreadExecutor(new zf9("Firebase-Messaging-Network-Io", 0)).execute(new qh5(instance, vde, 0));
                    n6g = vde.a;
                }
                n6g.i(new nu7((Object) cjc, (Object) fb6));
                Object a = cjc.a();
                if (a != pu3) {
                    a = jue;
                }
                if (a == pu3) {
                    return pu3;
                }
            } else {
                throw new StoreServicesInfo$ServicesNotAvailableException();
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((lqc) b9e.b()).l("user.fcmToken", (String) null);
        ((lqc) b9e.b()).l("user.pushDeviceType", (String) null);
        return jue;
    }
}
