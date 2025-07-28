package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sd7  reason: default package */
public final class sd7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ td7 Y;
    public final /* synthetic */ jh0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sd7(td7 td7, jh0 jh0, Continuation continuation) {
        super(2, continuation);
        this.Y = td7;
        this.Z = jh0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sd7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            jh0 jh0 = this.Z;
            long j = jh0.a;
            uae uae = jh0.b;
            String str = uae.o;
            if (str == null) {
                str = uae.c;
            }
            kd7 kd7 = new kd7(j, str);
            this.X = 1;
            if (hcd.a(kd7, this) == pu3) {
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
