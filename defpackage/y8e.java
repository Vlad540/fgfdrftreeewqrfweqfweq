package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: y8e  reason: default package */
public final class y8e extends l5e implements i26 {
    public int X;
    public final /* synthetic */ b9e Y;
    public final /* synthetic */ SystemServicesManager$PushTokenGeneratedListener Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y8e(b9e b9e, SystemServicesManager$PushTokenGeneratedListener systemServicesManager$PushTokenGeneratedListener, Continuation continuation) {
        super(2, continuation);
        this.Y = b9e;
        this.Z = systemServicesManager$PushTokenGeneratedListener;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y8e(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (this.Y.e(this.Z, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
