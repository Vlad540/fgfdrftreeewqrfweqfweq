package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: qe7  reason: default package */
public final class qe7 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ef7 Z;
    public final /* synthetic */ Uri w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qe7(ef7 ef7, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Z = ef7;
        this.w0 = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qe7 qe7 = new qe7(this.Z, this.w0, continuation);
        qe7.Y = obj;
        return qe7;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (ef7.a(this.Z, (rj5) this.Y, this.w0, this) == pu3) {
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
