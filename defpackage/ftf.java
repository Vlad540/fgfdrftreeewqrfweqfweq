package defpackage;

import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: ftf  reason: default package */
public abstract class ftf {
    public final void a(WorkRequest workRequest) {
        List singletonList = Collections.singletonList(workRequest);
        itf itf = (itf) this;
        if (!singletonList.isEmpty()) {
            new wsf(itf, (String) null, a35.b, singletonList).m();
            return;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public abstract aga b(String str, int i, yma yma);
}
