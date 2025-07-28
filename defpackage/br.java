package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: br  reason: default package */
public final class br extends l5e implements i26 {
    public int X;
    public final /* synthetic */ g32 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ dr w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public br(g32 g32, boolean z, dr drVar, Continuation continuation) {
        super(2, continuation);
        this.Y = g32;
        this.Z = z;
        this.w0 = drVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((br) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new br(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            g32 g32 = this.Y;
            String str = g32.b.a;
            k77[] k77Arr = dr.N0;
            dr drVar = this.w0;
            js.C(str, this.Z, drVar.u().a);
            aj7 aj7 = (aj7) drVar.F0.getValue();
            Context t = drVar.t();
            this.X = 1;
            if (xs7.U(((pae) aj7.a.getValue()).b(), new zi7(aj7, g32.b, t, true, (Continuation) null), this) == pu3) {
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
