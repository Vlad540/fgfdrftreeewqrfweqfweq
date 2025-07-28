package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ge5  reason: default package */
public final class ge5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ge5(String str, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ge5 ge5 = new ge5(this.Z, continuation);
        ge5.Y = obj;
        return ge5;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            rj5 rj5 = (rj5) this.Y;
            String str = this.Z;
            if (str != null) {
                this.X = 1;
                if (rj5.a(str, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
