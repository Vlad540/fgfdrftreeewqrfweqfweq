package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ypa  reason: default package */
public final class ypa extends l5e implements i26 {
    public grd X;
    public int Y;
    public final /* synthetic */ zpa Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ypa(zpa zpa, Continuation continuation) {
        super(2, continuation);
        this.Z = zpa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ypa(this.Z, continuation);
    }

    public final Object o(Object obj) {
        mc9 mc9;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        boolean z = true;
        if (i == 0) {
            wx3.H(obj);
            zpa zpa = this.Z;
            mc9 mc92 = zpa.d;
            this.X = mc92;
            this.Y = 1;
            obj = ((ap3) zpa.a.getValue()).e();
            if (obj == pu3) {
                return pu3;
            }
            mc9 = mc92;
        } else if (i == 1) {
            mc9 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Number) obj).intValue() != 0) {
            z = false;
        }
        mc9.setValue(Boolean.valueOf(z));
        return jue.a;
    }
}
