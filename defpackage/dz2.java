package defpackage;

import android.content.Context;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;

/* renamed from: dz2  reason: default package */
public final class dz2 {
    public final /* synthetic */ ez2 a;

    public dz2(ez2 ez2) {
        this.a = ez2;
    }

    @a1e
    public final void onEvent(mp7 mp7) {
        ez2 ez2 = this.a;
        try {
            b9e b9e = (b9e) ((t97) ez2.X).getValue();
            b9e.getClass();
            y63 y63 = new y63(0, new nic((hu3) bw4.a, new x8e(b9e, (Continuation) null)));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            qmc a2 = cnc.a();
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(a2, "scheduler is null");
            new m73(y63, timeUnit, a2).a();
        } catch (Exception e) {
            try {
                udd.s((String) ez2.b, "error while delete token", e);
            } catch (Throwable th) {
                ((tt0) ((t97) ez2.c).getValue()).f(this);
                throw th;
            }
        }
        ProcessPhoenix.b((Context) ez2.a);
        ((tt0) ((t97) ez2.c).getValue()).f(this);
    }
}
