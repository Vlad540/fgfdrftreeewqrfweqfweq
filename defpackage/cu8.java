package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cu8  reason: default package */
public final class cu8 extends l5e implements m26 {
    public int X;
    public /* synthetic */ ot8 Y;
    public /* synthetic */ rt8 Z;
    public /* synthetic */ boolean w0;
    public final /* synthetic */ nu8 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cu8(nu8 nu8, Continuation continuation) {
        super(4, continuation);
        this.x0 = nu8;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        cu8 cu8 = new cu8(this.x0, (Continuation) obj4);
        cu8.Y = (ot8) obj;
        cu8.Z = (rt8) obj2;
        cu8.w0 = booleanValue;
        return cu8.o(jue.a);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ot8 ot8 = this.Y;
            rt8 rt8 = this.Z;
            boolean z = this.w0;
            this.Y = null;
            this.X = 1;
            obj = nu8.q(this.x0, ot8, rt8, z, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
