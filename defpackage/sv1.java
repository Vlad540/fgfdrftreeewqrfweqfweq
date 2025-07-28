package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: sv1  reason: default package */
public final class sv1 extends uv1 {
    public final /* synthetic */ itf c;
    public final /* synthetic */ UUID o;

    public sv1(itf itf, UUID uuid) {
        this.c = itf;
        this.o = uuid;
    }

    /* JADX INFO: finally extract failed */
    public final void c() {
        itf itf = this.c;
        WorkDatabase workDatabase = itf.c;
        workDatabase.c();
        try {
            uv1.b(itf, this.o.toString());
            workDatabase.r();
            workDatabase.l();
            dnc.a(itf.b, itf.c, itf.e);
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }
}
