package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* renamed from: yu3  reason: default package */
public final class yu3 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ boolean Z = false;
    public final /* synthetic */ aec w0;
    public final /* synthetic */ String[] x0;
    public final /* synthetic */ Callable y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yu3(aec aec, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.w0 = aec;
        this.x0 = strArr;
        this.y0 = callable;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yu3) n((rj5) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yu3 yu3 = new yu3(this.w0, this.x0, this.y0, continuation);
        yu3.Y = obj;
        return yu3;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            Callable callable = this.y0;
            xu3 xu3 = new xu3(this.Z, this.w0, (rj5) this.Y, this.x0, callable, (Continuation) null);
            this.X = 1;
            if (n1g.f(xu3, this) == pu3) {
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
