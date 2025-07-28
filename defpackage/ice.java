package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;

/* renamed from: ice  reason: default package */
public final /* synthetic */ class ice implements j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lce b;
    public final /* synthetic */ int c;

    public /* synthetic */ ice(lce lce) {
        this.a = 4;
        this.b = lce;
        this.c = 1;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                dlc dlc = (an5) obj;
                lce lce = this.b;
                lce.getClass();
                ice ice = new ice(lce, this.c, 1);
                dlc.getClass();
                int i = an5.a;
                fja.D(i, "maxConcurrency");
                fja.D(i, "bufferSize");
                if (!(dlc instanceof dlc)) {
                    return new nn5(dlc, ice, i, i);
                }
                Object obj2 = dlc.get();
                return obj2 == null ? jn5.b : new do5(obj2, ice);
            case 1:
                Throwable th = (Throwable) obj;
                lce lce2 = this.b;
                lce2.getClass();
                if (lce.d(th) && !lce.a(((h3d) ((f3d) lce2.a.getValue())).h)) {
                    udd.q("lce", "retryWhenCommonError: no connection, await for connection available");
                    return new p0(new kn5(2, new kt9(lce2.b(), new kce(0), z3d.j, z3d.i)));
                } else if (lce.c(th)) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    int i2 = an5.a;
                    qmc a2 = cnc.a();
                    Objects.requireNonNull(timeUnit, "unit is null");
                    Objects.requireNonNull(a2, "scheduler is null");
                    return new mo5(Math.max(0, (long) this.c), timeUnit, a2);
                } else {
                    int i3 = an5.a;
                    Objects.requireNonNull(th, "throwable is null");
                    return new kn5(0, new b36(th));
                }
            case 2:
                lce lce3 = this.b;
                lce3.getClass();
                return ((ms9) obj).h(new ice(lce3, this.c, 3));
            case 3:
                Throwable th2 = (Throwable) obj;
                lce lce4 = this.b;
                lce4.getClass();
                if (lce.d(th2) && !lce.a(((h3d) ((f3d) lce4.a.getValue())).h)) {
                    udd.q("lce", "retryWhenCommonErrorObs: no connection, await for connection available");
                    return new kt9(lce4.b(), new kce(2), z3d.j, z3d.i);
                } else if (!lce.c(th2)) {
                    return ms9.g(th2);
                } else {
                    udd.o("lce", "retryWhenCommonErrorObs: common error", th2);
                    return ms9.u((long) this.c, TimeUnit.SECONDS, cnc.a());
                }
            default:
                Throwable th3 = (Throwable) obj;
                if (!(th3 instanceof HttpErrorException)) {
                    return ms9.g(th3);
                }
                if (th3 instanceof HttpUrlExpiredException) {
                    udd.s("nce", "retryWhenTamHttpError: skipped retry on TamHttpUrlExpiredException", (Throwable) null);
                    return ms9.g(th3);
                }
                HttpErrorException httpErrorException = (HttpErrorException) th3;
                if (pa2.v(httpErrorException.a)) {
                    udd.s("nce", "retryWhenTamHttpError: critical upload error=" + httpErrorException, (Throwable) null);
                    return ms9.g(th3);
                }
                lce lce5 = this.b;
                if (!lce.a(((h3d) ((f3d) lce5.a.getValue())).h)) {
                    udd.q("nce", "retryWhenTamHttpError: no connection, await for connection available");
                    return new kt9(lce5.b(), new kce(3), z3d.j, z3d.i);
                }
                udd.s("nce", "retryWhenTamHttpError: http error", httpErrorException);
                return ms9.u((long) this.c, TimeUnit.SECONDS, cnc.a());
        }
    }

    public /* synthetic */ ice(lce lce, int i, int i2) {
        this.a = i2;
        this.b = lce;
        this.c = i;
    }
}
