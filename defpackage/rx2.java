package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: rx2  reason: default package */
public final class rx2 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ km4 Z;
    public final /* synthetic */ s16 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rx2(km4 km4, s16 s16, Continuation continuation) {
        super(2, continuation);
        this.Z = km4;
        this.w0 = s16;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((pda) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rx2 rx2 = new rx2(this.Z, this.w0, continuation);
        rx2.Y = obj;
        return rx2;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            pda pda = (pda) this.Y;
            String str = (String) this.Z.a;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                fn6.d(tn7, str, "themeFlow " + pda, (Throwable) null);
            }
            o58 o58 = (o58) this.Z.b;
            this.X = 1;
            o58.getClass();
            ha4 ha4 = oi4.a;
            Object U = xs7.U(MainDispatcherLoader.dispatcher.getImmediate(), new s8(o58, (List) this.w0.invoke(), (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
