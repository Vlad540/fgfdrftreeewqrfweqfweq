package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: yj2  reason: default package */
public final class yj2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ dk2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ boolean w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yj2(dk2 dk2, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = dk2;
        this.Z = j;
        this.w0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yj2(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            dk2 dk2 = this.Y;
            Long j = dk2.j();
            if (j != null) {
                long longValue = j.longValue();
                List singletonList = Collections.singletonList(new Long(this.Z));
                this.X = 1;
                ((ee4) dk2.m.getValue()).a(dk2.a, longValue, singletonList, this.w0);
                if (jue2 == jue) {
                    return jue;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
