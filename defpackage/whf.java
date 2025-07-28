package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: whf  reason: default package */
public final class whf extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gif Z;
    public final /* synthetic */ phf w0;
    public final /* synthetic */ lhf x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public whf(lhf lhf, phf phf, gif gif, Continuation continuation) {
        super(2, continuation);
        this.Z = gif;
        this.w0 = phf;
        this.x0 = lhf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((Throwable) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        whf whf = new whf(this.x0, this.w0, this.Z, continuation);
        whf.Y = obj;
        return whf;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            List list = gif.i;
            gif gif = this.Z;
            gif.getClass();
            o57 f = gif.f((Throwable) this.Y);
            m53 g = gif.g();
            String str = this.x0.b;
            this.X = 1;
            if (g.a(gif.g, f, this.w0, str, this) == pu3) {
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
