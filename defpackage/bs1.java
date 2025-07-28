package defpackage;

import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: bs1  reason: default package */
public final /* synthetic */ class bs1 implements tn1, au {
    public final /* synthetic */ int a;
    public final /* synthetic */ es1 b;

    public /* synthetic */ bs1(es1 es1, int i) {
        this.a = i;
        this.b = es1;
    }

    public ch7 apply(Object obj) {
        Void voidR = (Void) obj;
        switch (this.a) {
            case 1:
                bp5 bp5 = this.b.a.h;
                return zq1.t(bp5.a.e, 5) != 5 ? as6.c : hwf.f(new eb4(bp5, true, 1));
            case 2:
                es1 es1 = this.b;
                es1.getClass();
                return hwf.f(new bs1(es1, 0));
            case 3:
                bp5 bp52 = this.b.a.h;
                bp52.getClass();
                return hwf.f(new r34(27, (Object) bp52));
            default:
                ak0 ak0 = new ak0(13);
                es1 es12 = this.b;
                ScheduledExecutorService scheduledExecutorService = es12.c;
                long millis = TimeUnit.NANOSECONDS.toMillis(es1.f);
                as1 as1 = new as1(ak0);
                zq1 zq1 = es12.a;
                zq1.p(as1);
                dr1 dr1 = new dr1(zq1, 4, as1);
                vn1 vn1 = as1.b;
                vn1.b.c(dr1, zq1.c);
                return hwf.f(new vd4(vn1, scheduledExecutorService, millis));
        }
    }

    public String z(sn1 sn1) {
        es1 es1 = this.b;
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) es1.e.b;
        boolean z = false;
        if (torchFlashRequiredFor3aUpdateQuirk != null) {
            if (!(zq1.t(torchFlashRequiredFor3aUpdateQuirk.a, 5) == 5)) {
                z = true;
            }
        }
        if (!z) {
            sn1.b((Object) null);
            return "EnableTorchInternal";
        }
        es1.a.r(true);
        sn1.b((Object) null);
        return "EnableTorchInternal";
    }
}
