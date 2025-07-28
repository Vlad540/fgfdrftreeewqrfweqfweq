package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ld1  reason: default package */
public final class ld1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ td1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ld1(td1 td1, Continuation continuation) {
        super(2, continuation);
        this.Y = td1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ld1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ld1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            td1 td1 = this.Y;
            t0c t0c = ((oka) td1.c).A0;
            kd1 kd1 = new kd1(td1, (Continuation) null);
            this.X = 1;
            if (ez3.q(t0c, kd1, this) == pu3) {
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
