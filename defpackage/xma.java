package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: xma  reason: default package */
public final class xma extends WorkRequest.Builder {
    public xma(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        ztf workSpec$work_runtime_release = getWorkSpec$work_runtime_release();
        long millis = timeUnit.toMillis(j);
        workSpec$work_runtime_release.getClass();
        int i = (millis > 900000 ? 1 : (millis == 900000 ? 0 : -1));
        String str = ztf.u;
        if (i < 0) {
            a24.B().k0(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long h = gwf.h(millis, 900000);
        long h2 = gwf.h(millis, 900000);
        if (h < 900000) {
            a24.B().k0(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        workSpec$work_runtime_release.h = gwf.h(h, 900000);
        if (h2 < 300000) {
            a24.B().k0(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (h2 > workSpec$work_runtime_release.h) {
            a24 B = a24.B();
            B.k0(str, "Flex duration greater than interval duration; Changed to " + h);
        }
        workSpec$work_runtime_release.i = gwf.k(h2, 300000, workSpec$work_runtime_release.h);
    }

    public final WorkRequest buildInternal$work_runtime_release() {
        if (getBackoffCriteriaSet$work_runtime_release() && getWorkSpec$work_runtime_release().j.c) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        } else if (!getWorkSpec$work_runtime_release().q) {
            return new WorkRequest(getId$work_runtime_release(), getWorkSpec$work_runtime_release(), getTags$work_runtime_release());
        } else {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }
    }

    public final WorkRequest.Builder getThisObject$work_runtime_release() {
        return this;
    }
}
