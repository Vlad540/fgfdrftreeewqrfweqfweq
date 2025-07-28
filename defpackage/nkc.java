package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nkc  reason: default package */
public final class nkc extends l5e implements i26 {
    public int X;
    public final /* synthetic */ okc Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ String x0;
    public final /* synthetic */ long y0;
    public final /* synthetic */ boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nkc(okc okc, long j, long j2, String str, long j3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = okc;
        this.Z = j;
        this.w0 = j2;
        this.x0 = str;
        this.y0 = j3;
        this.z0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nkc(this.Y, this.Z, this.w0, this.x0, this.y0, this.z0, continuation);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            String str = this.Y.a;
            long j = this.w0;
            String str2 = this.x0;
            long j2 = this.y0;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                StringBuilder j3 = m4b.j("Save new position:", j, " for video:", str2);
                j3.append(" in msg:");
                j3.append(j2);
                fn6.d(tn7, str, j3.toString(), (Throwable) null);
            }
            long j4 = this.Z;
            long j5 = 0;
            if (j4 == 0) {
                return jue2;
            }
            long j6 = this.w0;
            if (j6 >= j4) {
                String str3 = this.Y.a;
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    fn62.d(tn7.X, str3, wn6.k(hr1.k(j6, "Can't save this startTime:", " because it's more or equals with duration:"), j4, ". Reset initPos."), (Throwable) null);
                }
            } else {
                j5 = j6;
            }
            String str4 = this.x0;
            ((x2f) this.Y.c.getValue()).getClass();
            v2f a = x2f.a(str4);
            if (a != null) {
                udd.q(this.Y.a, "Save new position. VideoContent in cache exist");
                String str5 = this.x0;
                v2f a2 = a.a(j5);
                ((x2f) this.Y.c.getValue()).getClass();
                x2f.a.put(str5, new w2f(a2, System.currentTimeMillis()));
            }
            b29 b29 = (b29) this.Y.b.getValue();
            long j7 = this.y0;
            String str6 = this.x0;
            mkc mkc = new mkc(j5, this.Z, this.z0);
            this.X = 1;
            b29.getClass();
            b29.a.n(j7, new w48(str6, 11, mkc));
            if (jue2 == jue) {
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
