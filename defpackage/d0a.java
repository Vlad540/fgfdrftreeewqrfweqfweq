package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d0a  reason: default package */
public final class d0a extends l5e implements i26 {
    public int X;
    public final /* synthetic */ e0a Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0a(e0a e0a, Continuation continuation) {
        super(2, continuation);
        this.Y = e0a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d0a) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d0a(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        e0a e0a = this.Y;
        if (i == 0) {
            wx3.H(obj);
            b9e b9e = (b9e) e0a.b.getValue();
            b9e.getClass();
            y63 y63 = new y63(0, new nic((hu3) bw4.a, new x8e(b9e, (Continuation) null)));
            this.X = 1;
            if (e07.c(y63, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        udd.p("PushToken", "Refresh current token succeed.", new Object[0]);
        b9e b9e2 = (b9e) e0a.b.getValue();
        c0a c0a = new c0a(e0a);
        b9e2.getClass();
        xs7.E(b9e2.Z, (hu3) null, (ru3) null, new y8e(b9e2, c0a, (Continuation) null), 3);
        return jue.a;
    }
}
