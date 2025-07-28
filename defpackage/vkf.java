package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vkf  reason: default package */
public final class vkf extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ alf Z;
    public final /* synthetic */ xkf w0;
    public final /* synthetic */ String x0 = "WebAppRequestPhone";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vkf(xkf xkf, alf alf, Continuation continuation) {
        super(2, continuation);
        this.Z = alf;
        this.w0 = xkf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((String) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vkf vkf = new vkf(this.w0, this.Z, continuation);
        vkf.Y = obj;
        return vkf;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        xkf xkf = this.w0;
        if (i == 0) {
            wx3.H(obj);
            dlf dlf = new dlf(this.Z.a, (String) this.Y);
            us0 us0 = xkf.e;
            r57 r57 = xkf.a;
            r57.getClass();
            f57 f57 = new f57(this.x0, r57.b(dlf.Companion.serializer(), dlf));
            this.X = 1;
            if (us0.o(f57, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jff jff = xkf.f;
        if (jff != null) {
            tif.a((tif) xkf.b.getValue(), this.x0, jff.a, jff.b, true, 0, (Integer) null, (Integer) null, 240);
        }
        return jue.a;
    }
}
