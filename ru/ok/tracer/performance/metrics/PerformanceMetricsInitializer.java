package ru.ok.tracer.performance.metrics;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/performance/metrics/PerformanceMetricsInitializer;", "Lsw6;", "Lhoe;", "<init>", "()V", "tracer-performance-metrics_release"}, k = 1, mv = {1, 7, 1})
public final class PerformanceMetricsInitializer implements sw6 {
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    public final Object b(Context context) {
        hoe hoe = hoe.a;
        nne nne = nne.a;
        Object obj = nne.c().get(r1g.c);
        tma tma = obj instanceof tma ? (tma) obj : null;
        if (tma == null) {
            tma = new tma(new og0(14, (byte) 0));
        }
        if (tma.a) {
            hoe.b = new eoe();
            koe.a(new nm(context, 6));
        }
        return hoe.a;
    }
}
