package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ojf  reason: default package */
public final class ojf extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pjf Z;
    public final /* synthetic */ sjf w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ojf(pjf pjf, sjf sjf, Continuation continuation) {
        super(2, continuation);
        this.Z = pjf;
        this.w0 = sjf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((Throwable) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ojf ojf = new ojf(this.Z, this.w0, continuation);
        ojf.Y = obj;
        return ojf;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            pjf pjf = this.Z;
            o57 e = pjf.e(pjf, (Throwable) this.Y);
            fjf fjf = fjf.b;
            String str = this.w0.a;
            this.X = 1;
            if (((m53) pjf.c.getValue()).a(pjf.f, e, fjf, str, this) == pu3) {
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
