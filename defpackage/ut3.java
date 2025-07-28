package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ut3  reason: default package */
public final class ut3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ l83 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ut3(l83 l83, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = l83;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ut3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ikc ikc = (ikc) this.Y.c;
            this.X = 1;
            ikc.getClass();
            obj = xs7.U(sk9.a.plus(ikc.b), new gkc(ikc, this.Z, false, true, (Continuation) null), this);
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
