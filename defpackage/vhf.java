package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: vhf  reason: default package */
public final class vhf extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ lhf Z;
    public final /* synthetic */ gif w0;
    public final /* synthetic */ phf x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vhf(lhf lhf, phf phf, gif gif, Continuation continuation) {
        super(2, continuation);
        this.Z = lhf;
        this.w0 = gif;
        this.x0 = phf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((jm0) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gif gif = this.w0;
        vhf vhf = new vhf(this.Z, this.x0, gif, continuation);
        vhf.Y = obj;
        return vhf;
    }

    public final Object o(Object obj) {
        String str;
        pu3 pu3 = pu3.a;
        int i = this.X;
        phf phf = this.x0;
        gif gif = this.w0;
        if (i == 0) {
            wx3.H(obj);
            jm0 jm0 = (jm0) this.Y;
            boolean z = jm0.a;
            lhf lhf = this.Z;
            if (z) {
                String str2 = lhf.b;
                List list = gif.i;
                String a = ((tf4) gif.d.getValue()).a();
                ohf ohf = new ohf(str2, list, jm0.b, jm0.c, jm0.d, a);
                r57 r57 = gif.a;
                r57.getClass();
                str = r57.b(ohf.Companion.serializer(), ohf);
            } else {
                pif pif = new pif(lhf.b);
                r57 r572 = gif.a;
                r572.getClass();
                str = r572.b(pif.Companion.serializer(), pif);
            }
            us0 us0 = gif.g;
            f57 f57 = new f57(phf.a, str);
            this.X = 1;
            if (us0.o(f57, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gif.e(gif, phf.a);
        return jue.a;
    }
}
