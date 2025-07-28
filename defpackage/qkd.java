package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: qkd  reason: default package */
public final class qkd extends l5e implements i26 {
    public s16 X;
    public int Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ s16 w0;
    public final /* synthetic */ u16 x0;
    public final /* synthetic */ long y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qkd(ArrayList arrayList, s16 s16, u16 u16, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = arrayList;
        this.w0 = s16;
        this.x0 = u16;
        this.y0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qkd((ArrayList) this.Z, this.w0, this.x0, this.y0, continuation);
    }

    public final Object o(Object obj) {
        s16 s16;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            for (hx6 invoke : this.Z) {
                this.x0.invoke(invoke);
            }
            s16 s162 = this.w0;
            if (s162 != null) {
                this.X = s162;
                this.Y = 1;
                if (ek8.q(this.y0, this) == pu3) {
                    return pu3;
                }
                s16 = s162;
            }
            return jue.a;
        } else if (i == 1) {
            s16 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s16.invoke();
        return jue.a;
    }
}
