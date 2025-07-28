package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ehc  reason: default package */
public final class ehc {
    public final String a;
    public final xwb b;
    public final AtomicLong c = new AtomicLong(1);
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public ehc(xwb xwb) {
        if (xwb != null) {
            this.a = "RtcCommands";
            this.b = xwb;
            return;
        }
        throw new IllegalArgumentException("Illegal 'logger' value: null");
    }
}
