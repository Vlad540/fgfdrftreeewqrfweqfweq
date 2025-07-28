package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* renamed from: o0g  reason: default package */
public final class o0g implements ima {
    public final /* synthetic */ lp a;
    public final /* synthetic */ vde b;
    public final /* synthetic */ lk9 c;

    public o0g(BasePendingResult basePendingResult, vde vde, lk9 lk9) {
        this.a = basePendingResult;
        this.b = vde;
        this.c = lk9;
    }

    public final void a(Status status) {
        occ occ;
        if (status.a <= 0) {
            lp lpVar = this.a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) lpVar;
            a24.q("Result has already been consumed.", !basePendingResult.p);
            try {
                if (!basePendingResult.k.await(0, timeUnit)) {
                    basePendingResult.Z(Status.w0);
                }
            } catch (InterruptedException unused) {
                basePendingResult.Z(Status.Y);
            }
            a24.q("Result is not ready.", basePendingResult.a0());
            synchronized (basePendingResult.j) {
                a24.q("Result has already been consumed.", !basePendingResult.p);
                a24.q("Result is not ready.", basePendingResult.a0());
                occ = basePendingResult.n;
                basePendingResult.n = null;
                basePendingResult.p = true;
            }
            hr1.r(basePendingResult.m.getAndSet((Object) null));
            a24.o(occ);
            this.b.b(this.c.c(occ));
            return;
        }
        this.b.a(e07.s(status));
    }
}
