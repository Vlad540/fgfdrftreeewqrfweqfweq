package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: uac  reason: default package */
public final class uac implements tac {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public final synchronized void a(tr6 tr6, String str, boolean z) {
        if (m75.a.i(2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            m75.g("time %d: onRequestSuccess: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(uptimeMillis), str, Long.valueOf(om3.c(uptimeMillis, (Long) this.b.remove(str))));
        }
    }

    public final synchronized void b(tr6 tr6, Object obj, String str, boolean z) {
        if (m75.a.i(2)) {
            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
            Boolean valueOf2 = Boolean.valueOf(z);
            if (m75.a.i(2)) {
                eo7 eo7 = m75.a;
                String.format((Locale) null, "time %d: onRequestSubmit: {requestId: %s, callerContext: %s, isPrefetch: %b}", new Object[]{valueOf, str, obj, valueOf2});
                eo7.b("RequestLoggingListener");
            }
            this.b.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    public final synchronized void c(tr6 tr6, String str, Throwable th, boolean z) {
        if (m75.a.i(5)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            m75.m("RequestLoggingListener", "time %d: onRequestFailure: {requestId: %s, elapsedTime: %d ms, throwable: %s}", Long.valueOf(uptimeMillis), str, Long.valueOf(om3.c(uptimeMillis, (Long) this.b.remove(str))), th.toString());
        }
    }

    public final synchronized void d(String str, String str2) {
        if (m75.a.i(2)) {
            Pair create = Pair.create(str, str2);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.a.put(create, Long.valueOf(uptimeMillis));
            m75.g("time %d: onProducerStart: {requestId: %s, producer: %s}", Long.valueOf(uptimeMillis), str, str2);
        }
    }

    public final synchronized void e(String str, String str2) {
        if (m75.a.i(2)) {
            Pair create = Pair.create(str, str2);
            long uptimeMillis = SystemClock.uptimeMillis();
            m75.h("RequestLoggingListener", "time %d: onProducerFinishWithCancellation: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(uptimeMillis), str, str2, Long.valueOf(om3.c(uptimeMillis, (Long) this.a.remove(create))), null);
        }
    }

    public final synchronized void f(String str, String str2, boolean z) {
        if (m75.a.i(2)) {
            Pair create = Pair.create(str, str2);
            long uptimeMillis = SystemClock.uptimeMillis();
            m75.h("RequestLoggingListener", "time %d: onUltimateProducerReached: {requestId: %s, producer: %s, elapsedTime: %d ms, success: %b}", Long.valueOf(uptimeMillis), str, str2, Long.valueOf(om3.c(uptimeMillis, (Long) this.a.remove(create))), Boolean.valueOf(z));
        }
    }

    public final synchronized void g(String str) {
        if (m75.a.i(2)) {
            Pair create = Pair.create(str, "NetworkFetchProducer");
            m75.h("RequestLoggingListener", "time %d: onProducerEvent: {requestId: %s, stage: %s, eventName: %s; elapsedTime: %d ms}", Long.valueOf(SystemClock.uptimeMillis()), str, "NetworkFetchProducer", "intermediate_result", Long.valueOf(om3.c(SystemClock.uptimeMillis(), (Long) this.a.get(create))));
        }
    }

    public final boolean h(String str) {
        return m75.a.i(2);
    }

    public final synchronized void i(String str, String str2, Map map) {
        if (m75.a.i(2)) {
            Pair create = Pair.create(str, str2);
            long uptimeMillis = SystemClock.uptimeMillis();
            m75.h("RequestLoggingListener", "time %d: onProducerFinishWithSuccess: {requestId: %s, producer: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(uptimeMillis), str, str2, Long.valueOf(om3.c(uptimeMillis, (Long) this.a.remove(create))), map);
        }
    }

    public final synchronized void j(String str, String str2, Throwable th, Map map) {
        synchronized (this) {
            if (m75.a.i(5)) {
                Pair create = Pair.create(str, str2);
                long uptimeMillis = SystemClock.uptimeMillis();
                Object[] objArr = {Long.valueOf(uptimeMillis), str, str2, Long.valueOf(om3.c(uptimeMillis, (Long) this.a.remove(create))), map, th.toString()};
                if (m75.a.i(5)) {
                    m75.a.w("RequestLoggingListener", String.format((Locale) null, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", objArr), th);
                }
            }
        }
    }

    public final synchronized void k(String str) {
        if (m75.a.i(2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            m75.g("time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(uptimeMillis), str, Long.valueOf(om3.c(uptimeMillis, (Long) this.b.remove(str))));
        }
    }
}
