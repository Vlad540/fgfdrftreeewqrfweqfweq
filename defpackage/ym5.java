package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: ym5  reason: default package */
public final class ym5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ yh7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ym5(yh7 yh7, Continuation continuation) {
        super(2, continuation);
        this.Z = yh7;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((ym5) n((d5b) obj, (Continuation) obj2)).o(jue.a);
        return pu3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ym5 ym5 = new ym5(this.Z, continuation);
        ym5.Y = obj;
        return ym5;
    }

    public final Object o(Object obj) {
        Throwable th;
        cw9 cw9;
        pu3 pu3 = pu3.a;
        int i = this.X;
        yh7 yh7 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            mr1 mr1 = new mr1(1, (d5b) this.Y);
            ha4 ha4 = oi4.a;
            zr7 immediate = MainDispatcherLoader.dispatcher.getImmediate();
            vm5 vm5 = new vm5(yh7, mr1, (Continuation) null);
            this.Y = mr1;
            this.X = 1;
            if (xs7.U(immediate, vm5, this) == pu3) {
                return pu3;
            }
            cw9 = mr1;
        } else if (i == 1) {
            cw9 = (cw9) this.Y;
            wx3.H(obj);
        } else if (i == 2) {
            cw9 = (cw9) this.Y;
            wx3.H(obj);
            this.Y = cw9;
            this.X = 3;
            ek8.i(this);
            return pu3;
        } else if (i == 3) {
            cw9 = (cw9) this.Y;
            try {
                wx3.H(obj);
                throw new KotlinNothingValueException();
            } catch (Throwable th2) {
                ha4 ha42 = oi4.a;
                hu3 plus = MainDispatcherLoader.dispatcher.getImmediate().plus(sk9.a);
                xm5 xm5 = new xm5(yh7, cw9, (Continuation) null);
                this.Y = th2;
                this.X = 4;
                if (xs7.U(plus, xm5, this) == pu3) {
                    return pu3;
                }
                th = th2;
            }
        } else if (i != 4) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            th = (Throwable) this.Y;
            wx3.H(obj);
            throw th;
        }
        ha4 ha43 = oi4.a;
        zr7 immediate2 = MainDispatcherLoader.dispatcher.getImmediate();
        wm5 wm5 = new wm5(yh7, cw9, (Continuation) null);
        this.Y = cw9;
        this.X = 2;
        if (xs7.U(immediate2, wm5, this) == pu3) {
            return pu3;
        }
        this.Y = cw9;
        this.X = 3;
        ek8.i(this);
        return pu3;
    }
}
