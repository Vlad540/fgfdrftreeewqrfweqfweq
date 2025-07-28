package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: vj5  reason: default package */
public final class vj5 extends l5e implements u16 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ n1c Z;
    public final /* synthetic */ int w0;
    public final /* synthetic */ d5b x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj5(n1c n1c, int i, d5b d5b, Continuation continuation, int i2) {
        super(1, continuation);
        this.X = i2;
        this.Z = n1c;
        this.w0 = i;
        this.x0 = d5b;
    }

    public final Object invoke(Object obj) {
        switch (this.X) {
            case 0:
                return new vj5(this.Z, this.w0, this.x0, (Continuation) obj, 0).o(jue.a);
            default:
                return new vj5(this.Z, this.w0, this.x0, (Continuation) obj, 1).o(jue.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                pu3 pu3 = pu3.a;
                int i = this.Y;
                if (i == 0) {
                    wx3.H(obj);
                    List m = vx3.m(this.Z, this.w0);
                    if (!((ArrayList) m).isEmpty()) {
                        this.Y = 1;
                        if (this.x0.a.o(m, this) == pu3) {
                            return pu3;
                        }
                    }
                } else if (i == 1) {
                    wx3.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Boolean.FALSE;
            default:
                pu3 pu32 = pu3.a;
                int i2 = this.Y;
                if (i2 == 0) {
                    wx3.H(obj);
                    List m2 = vx3.m(this.Z, this.w0);
                    if (!((ArrayList) m2).isEmpty()) {
                        this.Y = 1;
                        if (this.x0.a.o(m2, this) == pu32) {
                            return pu32;
                        }
                    }
                } else if (i2 == 1) {
                    wx3.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Boolean.TRUE;
        }
    }
}
