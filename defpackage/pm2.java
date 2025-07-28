package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pm2  reason: default package */
public final class pm2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ i22 Y;
    public final /* synthetic */ nn2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pm2(i22 i22, nn2 nn2, Continuation continuation) {
        super(2, continuation);
        this.Y = i22;
        this.Z = nn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pm2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pm2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        a34 a34;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            nn2 nn2 = this.Z;
            long s = ((f03) nn2.z0.getValue()).s();
            i22 i22 = this.Y;
            boolean f = i22.b.f(s);
            long j = i22.a;
            if (f) {
                ul2.c.getClass();
                a34 = new a34(":profile/attaches?id=" + j);
            } else {
                ul2 ul2 = ul2.c;
                boolean w = nn2.w();
                ul2.getClass();
                a34 = new a34(":profile?id=" + j + "&type=local_chat&is_opened_from_dialog=" + w);
            }
            hcd hcd = nn2.b1;
            this.X = 1;
            if (hcd.a(a34, this) == pu3) {
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
