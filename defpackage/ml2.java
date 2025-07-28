package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ml2  reason: default package */
public final class ml2 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ az1 Y;
    public /* synthetic */ pda Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        az1 az1 = (az1) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ml2 ml2 = new ml2(3, continuation, 0);
                ml2.Y = az1;
                ml2.Z = pda;
                jue jue = jue.a;
                ml2.o(jue);
                return jue;
            default:
                ml2 ml22 = new ml2(3, continuation, 1);
                ml22.Y = az1;
                ml22.Z = pda;
                jue jue2 = jue.a;
                ml22.o(jue2);
                return jue2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.a().k().a.a);
                return jue.a;
            default:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.b().f);
                return jue.a;
        }
    }
}
