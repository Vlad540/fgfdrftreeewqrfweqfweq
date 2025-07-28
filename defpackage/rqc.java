package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* renamed from: rqc  reason: default package */
public final class rqc extends l5e implements i26 {
    public int X;
    public final /* synthetic */ SdkCoroutineWorker Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rqc(SdkCoroutineWorker sdkCoroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = sdkCoroutineWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rqc(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        SdkCoroutineWorker sdkCoroutineWorker = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = sdkCoroutineWorker.doWork(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                sdkCoroutineWorker.future.k(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sdkCoroutineWorker.future.j((gh7) obj);
        return jue.a;
    }
}
