package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: u4a  reason: default package */
public final /* synthetic */ class u4a implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x4a b;
    public final /* synthetic */ q15 c;

    public /* synthetic */ u4a(x4a x4a, q15 q15, int i) {
        this.a = i;
        this.b = x4a;
        this.c = q15;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                x4a x4a = this.b;
                t4a t4a = (t4a) x4a.e.getValue();
                t4a.getClass();
                q15 q15 = this.c;
                return x4a.j(ScheduledExecutorService.class.cast(new ScheduledThreadPoolExecutor(q15.b, t4a.a.t("OneMeScheduler", Integer.valueOf(q15.g)))), "OneMeScheduler");
            case 1:
                x4a x4a2 = this.b;
                return x4a2.h(x4a2.b(), this.c.a);
            case 2:
                x4a x4a3 = this.b;
                return x4a3.h(x4a3.a(), this.c.a);
            default:
                x4a x4a4 = this.b;
                return x4a4.h(x4a4.c(), this.c.a);
        }
    }
}
