package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sf5  reason: default package */
public final class sf5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ float Y;
    public final /* synthetic */ d5b Z;
    public final /* synthetic */ ag5 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sf5(d5b d5b, ag5 ag5, Continuation continuation) {
        super(2, continuation);
        this.Z = d5b;
        this.w0 = ag5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sf5 sf5 = new sf5(this.Z, this.w0, continuation);
        sf5.Y = ((Number) obj).floatValue();
        return sf5;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            mcc mcc = new mcc(new ixe(this.Y * 100.0f, this.w0.j, (String) null));
            this.X = 1;
            if (this.Z.a.o(mcc, this) == pu3) {
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
