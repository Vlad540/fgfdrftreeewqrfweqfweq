package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: wa5  reason: default package */
public final class wa5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ab5 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wa5(ab5 ab5, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = ab5;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wa5(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ab5 ab5 = this.Y;
            long j = this.Z;
            this.X = 1;
            Object b = ((xp9) ab5.Y.getValue()).b(j, this);
            return b == pu3 ? pu3 : b;
        } else if (i == 1) {
            try {
                wx3.H(obj);
                return obj;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                udd.s("ab5", "failed to read fcm notifications", th);
                return hw4.a;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
