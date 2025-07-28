package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.coroutines.Continuation;

/* renamed from: su3  reason: default package */
public final class su3 extends l5e implements i26 {
    public s37 X;
    public int Y;
    public final /* synthetic */ s37 Z;
    public final /* synthetic */ CoroutineWorker w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public su3(s37 s37, CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Z = s37;
        this.w0 = coroutineWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((su3) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new su3(this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = this.Z;
            this.Y = 1;
            this.w0.getClass();
            throw new IllegalStateException("Not implemented");
        } else if (i == 1) {
            s37 s37 = this.X;
            wx3.H(obj);
            s37.a.j(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
