package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vk7  reason: default package */
public final class vk7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ wk7 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vk7(wk7 wk7, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = wk7;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vk7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        String str = this.Z;
        wk7 wk7 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            o46 o46 = (o46) wk7.g.get(str);
            if (o46 == null) {
                return jue;
            }
            gl7 gl7 = wk7.c;
            this.X = 1;
            if (((bv6) gl7).d(o46, 40, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wk7.a.c(new xk7(str));
        return jue;
    }
}
