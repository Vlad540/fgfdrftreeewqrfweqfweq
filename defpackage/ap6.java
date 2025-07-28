package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* renamed from: ap6  reason: default package */
public final /* synthetic */ class ap6 implements Callable {
    public final /* synthetic */ e3 a;
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;

    public /* synthetic */ ap6(e3 e3Var, int i) {
        this.a = e3Var;
        this.c = i;
    }

    public final Object call() {
        WorkDatabase workDatabase = (WorkDatabase) this.a.a;
        Long z = workDatabase.u().z("next_job_scheduler_id");
        int i = 0;
        int longValue = z != null ? (int) z.longValue() : 0;
        if (longValue != Integer.MAX_VALUE) {
            i = longValue + 1;
        }
        workDatabase.u().B(new a2b("next_job_scheduler_id", Long.valueOf((long) i)));
        int i2 = this.b;
        if (i2 > longValue || longValue > this.c) {
            workDatabase.u().B(new a2b("next_job_scheduler_id", Long.valueOf((long) (i2 + 1))));
            longValue = i2;
        }
        return Integer.valueOf(longValue);
    }
}
