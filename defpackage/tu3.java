package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.coroutines.Continuation;

/* renamed from: tu3  reason: default package */
public final class tu3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ CoroutineWorker Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tu3(CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = coroutineWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tu3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tu3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        CoroutineWorker coroutineWorker = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = coroutineWorker.doWork(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                coroutineWorker.b.k(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineWorker.b.j((gh7) obj);
        return jue.a;
    }
}
