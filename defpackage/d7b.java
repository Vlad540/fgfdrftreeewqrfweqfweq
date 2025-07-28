package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d7b  reason: default package */
public final class d7b extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ q7b Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d7b(q7b q7b, Continuation continuation) {
        super(2, continuation);
        this.Z = q7b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((wia) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d7b d7b = new d7b(this.Z, continuation);
        d7b.Y = obj;
        return d7b;
    }

    public final Object o(Object obj) {
        mc9 mc9;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            wia wia = (wia) this.Y;
            i22 i22 = (i22) wia.a;
            tf3 tf3 = (tf3) wia.b;
            q7b q7b = this.Z;
            if (!q7b.D0) {
                mc9 mc92 = q7b.B0;
                this.Y = mc92;
                this.X = 1;
                obj = q7b.q(q7b, i22, tf3, false, this);
                if (obj == pu3) {
                    return pu3;
                }
                mc9 = mc92;
            }
            return jue.a;
        } else if (i == 1) {
            mc9 = (mc9) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mc9.setValue(obj);
        return jue.a;
    }
}
