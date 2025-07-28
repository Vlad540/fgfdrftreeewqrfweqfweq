package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import ru.ok.tamtam.nano.Protos;

/* renamed from: r9c  reason: default package */
public final /* synthetic */ class r9c implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t97 b;

    public /* synthetic */ r9c(int i, t97 t97) {
        this.a = i;
        this.b = t97;
    }

    public final Object invoke() {
        t97 t97 = this.b;
        switch (this.a) {
            case 0:
                return (ScheduledExecutorService) ((x4a) t97.getValue()).n.getValue();
            case 1:
                return new k3d((cde) t97.getValue());
            case 2:
                lg7 c = hwf.c();
                c.add(f4d.NOTIFICATIONS);
                c.add(f4d.PRIVACY);
                c.add(f4d.MESSAGES);
                if (((vqc) ((xzc) t97.getValue())).u()) {
                    c.add(f4d.SAVED_MESSAGES);
                }
                c.add(f4d.FOLDERS);
                return hwf.a(c);
            case 3:
                return new y15((ScheduledExecutorService) ((x4a) t97.getValue()).n.getValue(), true);
            case 4:
                x4a x4a = (x4a) t97.getValue();
                x4a.getClass();
                k77 k77 = x4a.p[3];
                ExecutorService d = x4a.d(x4a.i);
                oid oid = cnc.a;
                return new y15(d, false);
            case 5:
                return new y15((ScheduledExecutorService) ((x4a) t97.getValue()).l.getValue(), true);
            case 6:
                return new y15((ScheduledExecutorService) ((x4a) t97.getValue()).m.getValue(), true);
            case 7:
                x4a x4a2 = (x4a) t97.getValue();
                return new y15(x4a2.h(x4a2.e(0, "upload", 2, 5), "upload"), true);
            case 8:
                return ((x4a) t97.getValue()).f(5, "srvc-rqst");
            case 9:
                return ((x4a) t97.getValue()).g();
            case 10:
                return ((xr0) t97.getValue()).a(16384);
            case 11:
                return new dye((bec) t97.getValue());
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return ((yya) t97.getValue()).get();
            default:
                w4 w4Var = ((kff) t97.getValue()).a;
                return new ckf(w4Var.d(tt0.class), w4Var.d(pae.class));
        }
    }
}
