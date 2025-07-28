package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadLocalElement;

/* renamed from: cec  reason: default package */
public final class cec extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ aec Z;
    public final /* synthetic */ yv1 w0;
    public final /* synthetic */ i26 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cec(aec aec, zv1 zv1, dec dec, Continuation continuation) {
        super(2, continuation);
        this.Z = aec;
        this.w0 = zv1;
        this.x0 = dec;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cec) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cec cec = new cec(this.Z, (zv1) this.w0, (dec) this.x0, continuation);
        cec.Y = obj;
        return cec;
    }

    public final Object o(Object obj) {
        Continuation continuation;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            fr3 fr3 = (fr3) ((ou3) this.Y).getCoroutineContext().get(cqc.c);
            ype ype = new ype(fr3);
            hu3 plus = fr3.plus(ype).plus(new ThreadLocalElement(Integer.valueOf(System.identityHashCode(ype)), this.Z.j));
            yv1 yv1 = this.w0;
            this.Y = yv1;
            this.X = 1;
            obj = xs7.U(plus, this.x0, this);
            if (obj == pu3) {
                return pu3;
            }
            continuation = yv1;
        } else if (i == 1) {
            continuation = (Continuation) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        continuation.resumeWith(obj);
        return jue.a;
    }
}
