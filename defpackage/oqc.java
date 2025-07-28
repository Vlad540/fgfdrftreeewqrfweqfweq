package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* renamed from: oqc  reason: default package */
public final class oqc extends l5e implements i26 {
    public s37 X;
    public int Y;
    public final /* synthetic */ s37 Z;
    public final /* synthetic */ SdkCoroutineWorker w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oqc(s37 s37, SdkCoroutineWorker sdkCoroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Z = s37;
        this.w0 = sdkCoroutineWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oqc(this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        s37 s37;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            s37 s372 = this.Z;
            this.X = s372;
            this.Y = 1;
            Object foregroundInfo = this.w0.getForegroundInfo(this);
            if (foregroundInfo == pu3) {
                return pu3;
            }
            s37 s373 = s372;
            obj = foregroundInfo;
            s37 = s373;
        } else if (i == 1) {
            s37 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s37.a.j(obj);
        return jue.a;
    }
}
