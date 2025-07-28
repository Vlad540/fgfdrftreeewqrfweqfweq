package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: an2  reason: default package */
public final class an2 extends l5e implements i26 {
    public long X;
    public int Y;
    public final /* synthetic */ nn2 Z;
    public final /* synthetic */ Long w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public an2(nn2 nn2, Long l, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = nn2;
        this.w0 = l;
        this.x0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((an2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new an2(this.Z, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        long j;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        nn2 nn2 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            i22 i22 = (i22) nn2.Z0.a.getValue();
            if (i22 != null) {
                long j2 = i22.a;
                this.X = j2;
                this.Y = 1;
                obj = ((gw8) nn2.J0.getValue()).a(j2, this.w0, this);
                if (obj == pu3) {
                    return pu3;
                }
                j = j2;
            }
            return jue;
        } else if (i == 1) {
            long j3 = this.X;
            wx3.H(obj);
            j = j3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0d t0d = new t0d(j, this.x0, 1);
        t0d.b = (sq8) obj;
        nn2.r(nn2).a(new u0d(t0d));
        return jue;
    }
}
