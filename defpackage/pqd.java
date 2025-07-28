package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* renamed from: pqd  reason: default package */
public final class pqd extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zqd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pqd(zqd zqd, Continuation continuation) {
        super(2, continuation);
        this.Z = zqd;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((pqd) n((rj5) obj, (Continuation) obj2)).o(jue.a);
        return pu3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pqd pqd = new pqd(this.Z, continuation);
        pqd.Y = obj;
        return pqd;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [i7c, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            of9 of9 = new of9(new Object(), (rj5) this.Y);
            this.X = 1;
            if (this.Z.c(of9, this) == obj2) {
                return obj2;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            wx3.H(obj);
        }
        throw new KotlinNothingValueException();
    }
}
