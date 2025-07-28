package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: pic  reason: default package */
public final class pic extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ qt9 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pic(ck5 ck5, at9 at9, Continuation continuation) {
        super(2, continuation);
        this.Z = ck5;
        this.w0 = at9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pic) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pic pic = new pic(this.Z, (at9) this.w0, continuation);
        pic.Y = obj;
        return pic;
    }

    public final Object o(Object obj) {
        Throwable th;
        ou3 ou3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        qt9 qt9 = this.w0;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            try {
                pj5 pj5 = this.Z;
                bw bwVar = new bw(11, qt9);
                this.Y = ou32;
                this.X = 1;
                if (pj5.c(bwVar, this) == pu3) {
                    return pu3;
                }
                ou3 = ou32;
            } catch (Throwable th2) {
                ou3 ou33 = ou32;
                th = th2;
                ou3 = ou33;
                if (th instanceof CancellationException) {
                    ((at9) qt9).b();
                } else if (!((at9) qt9).e(th)) {
                    x87.g0(ou3.getCoroutineContext(), th);
                }
                return jue.a;
            }
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            try {
                wx3.H(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((at9) qt9).b();
        return jue.a;
    }
}
