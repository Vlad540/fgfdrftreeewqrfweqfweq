package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: jm2  reason: default package */
public final class jm2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nn2 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ Long w0;
    public final /* synthetic */ CharSequence x0;
    public final /* synthetic */ List y0;
    public final /* synthetic */ boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jm2(nn2 nn2, Long l, Long l2, CharSequence charSequence, List list, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = nn2;
        this.Z = l;
        this.w0 = l2;
        this.x0 = charSequence;
        this.y0 = list;
        this.z0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jm2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jm2(this.Y, this.Z, this.w0, this.x0, this.y0, this.z0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            yr4 yr4 = this.Y.X;
            long longValue = this.Z.longValue();
            long longValue2 = this.w0.longValue();
            this.X = 1;
            if (yr4.a(longValue, longValue2, this.x0, this.y0, this.z0, this) == pu3) {
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
