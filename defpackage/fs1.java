package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: fs1  reason: default package */
public final /* synthetic */ class fs1 implements tn1, au {
    public final /* synthetic */ int a;
    public final /* synthetic */ gs1 b;

    public /* synthetic */ fs1(gs1 gs1, int i) {
        this.a = i;
        this.b = gs1;
    }

    public ch7 apply(Object obj) {
        Void voidR = (Void) obj;
        switch (this.a) {
            case 1:
                gs1 gs1 = this.b;
                if (!gs1.f) {
                    return as6.c;
                }
                bp5 bp5 = gs1.a.h;
                bp5.getClass();
                return hwf.f(new r34(27, (Object) bp5));
            default:
                ak0 ak0 = new ak0(14);
                gs1 gs12 = this.b;
                ScheduledExecutorService scheduledExecutorService = gs12.e;
                long millis = TimeUnit.NANOSECONDS.toMillis(gs1.g);
                as1 as1 = new as1(ak0);
                zq1 zq1 = gs12.a;
                zq1.p(as1);
                dr1 dr1 = new dr1(zq1, 4, as1);
                vn1 vn1 = as1.b;
                vn1.b.c(dr1, zq1.c);
                return hwf.f(new vd4(vn1, scheduledExecutorService, millis));
        }
    }

    public String z(sn1 sn1) {
        this.b.a.j.a(sn1, true);
        return "TorchOn";
    }
}
