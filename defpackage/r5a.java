package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r5a  reason: default package */
public final class r5a extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ s5a Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r5a(s5a s5a, Continuation continuation) {
        super(2, continuation);
        this.Z = s5a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r5a) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r5a r5a = new r5a(this.Z, continuation);
        r5a.Y = obj;
        return r5a;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            s5a s5a = this.Z;
            this.X = 1;
            obj = new dd0(new yc4[]{xs7.d(ou3, ((pae) s5a.a.getValue()).a(), new p5a(s5a, (Continuation) null), 2), xs7.d(ou3, ((pae) s5a.a.getValue()).a(), new q5a(s5a, (Continuation) null), 2)}).a(this);
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
