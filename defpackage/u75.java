package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* renamed from: u75  reason: default package */
public final class u75 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ v75 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u75(v75 v75, Continuation continuation) {
        super(2, continuation);
        this.Y = v75;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((u75) n((ou3) obj, (Continuation) obj2)).o(jue.a);
        return pu3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new u75(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = v75.i;
            v75 v75 = this.Y;
            t0c t0c = v75.b().X;
            bw bwVar = new bw(6, v75);
            this.X = 1;
            if (t0c.a.c(bwVar, this) == pu3) {
                return pu3;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            wx3.H(obj);
        }
        throw new KotlinNothingValueException();
    }
}
