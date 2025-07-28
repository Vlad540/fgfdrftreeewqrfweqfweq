package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: n6a  reason: default package */
public final class n6a extends l5e implements i26 {
    public int X;
    public final /* synthetic */ o6a Y;
    public final /* synthetic */ File Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n6a(o6a o6a, File file, Continuation continuation) {
        super(2, continuation);
        this.Y = o6a;
        this.Z = file;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n6a) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new n6a(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            lkc lkc = (lkc) this.Y.m.getValue();
            this.X = 1;
            lkc.getClass();
            obj = xs7.U(sk9.a.plus(lkc.b), new kkc(this.Z, lkc, (Continuation) null), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Uri) obj) == null) {
            udd.s("o6a", "Can't save video", (Throwable) null);
        }
        return jue.a;
    }
}
