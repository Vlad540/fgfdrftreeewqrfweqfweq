package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: r11  reason: default package */
public final class r11 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ x11 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r11(x11 x11, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = x11;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rj5 rj5 = (rj5) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                r11 r11 = new r11(this.Z, continuation, 0);
                r11.Y = th;
                jue jue = jue.a;
                r11.o(jue);
                return jue;
            default:
                r11 r112 = new r11(this.Z, continuation, 1);
                r112.Y = th;
                jue jue2 = jue.a;
                r112.o(jue2);
                return jue2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                Throwable th = this.Y;
                if (!(th instanceof CancellationException)) {
                    udd.s(this.Z.getClass().getName(), "fail no get chat", th);
                }
                return jue.a;
            default:
                wx3.H(obj);
                Throwable th2 = this.Y;
                if (!(th2 instanceof CancellationException)) {
                    udd.s(this.Z.getClass().getName(), "fail to handle call link", th2);
                }
                return jue.a;
        }
    }
}
