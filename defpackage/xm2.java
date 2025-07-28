package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xm2  reason: default package */
public final class xm2 extends l5e implements i26 {
    public long X;
    public int Y;
    public final /* synthetic */ nn2 Z;
    public final /* synthetic */ Uri w0;
    public final /* synthetic */ Long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xm2(nn2 nn2, Uri uri, Long l, Continuation continuation) {
        super(2, continuation);
        this.Z = nn2;
        this.w0 = uri;
        this.x0 = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xm2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xm2(this.Z, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        long j;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        nn2 nn2 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            i22 i22 = (i22) nn2.Z0.a.getValue();
            if (i22 != null) {
                List singletonList = Collections.singletonList(new ugd(1, this.w0.toString()));
                long j2 = i22.a;
                this.X = j2;
                this.Y = 1;
                if (((qxc) nn2.F0.getValue()).a(j2, (CharSequence) null, singletonList, false, this.x0, (jv5) null, this) == pu3) {
                    return pu3;
                }
                j = j2;
            }
            return jue;
        } else if (i == 1) {
            long j3 = this.X;
            wx3.H(obj);
            j = j3;
        } else if (i == 2) {
            wx3.H(obj);
            obj2 = obj;
            taf.o(nn2.c1, (yl2) obj2);
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ns7 ns7 = yl2.d;
        et0 q = nn2.q(nn2);
        this.Y = 2;
        obj2 = ns7.a(j, 1, q, (jv5) null, true, this);
        if (obj2 == pu3) {
            return pu3;
        }
        taf.o(nn2.c1, (yl2) obj2);
        return jue;
    }
}
