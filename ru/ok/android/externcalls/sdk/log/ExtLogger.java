package ru.ok.android.externcalls.sdk.log;

import java.util.Iterator;
import java.util.Map;
import ru.ok.android.ext.OneLogger;

public class ExtLogger extends axb {
    private static final String COLLECTOR = "ok.mobile.apps.video";
    private final String place;
    private final TimeProvider timeProvider;

    public interface TimeProvider {
        long getCurrentTimeMillis();
    }

    public ExtLogger(String str, TimeProvider timeProvider2) {
        try {
            OneLogger.ensureInitialized();
        } catch (NoClassDefFoundError unused) {
        }
        this.place = str;
        this.timeProvider = timeProvider2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, zx9] */
    public static zx9 simpleBuilder(tqd tqd) {
        ? obj = new Object();
        obj.b();
        obj.a = COLLECTOR;
        obj.b = 1;
        obj.c = tqd != null ? tqd.a : null;
        obj.d = 1;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, zx9] */
    public static zx9 simpleBuilderAny(String str) {
        ? obj = new Object();
        obj.b();
        obj.a = COLLECTOR;
        obj.b = 1;
        obj.c = str;
        obj.d = 1;
        return obj;
    }

    public void log(ay9 ay9) {
        ay9.getClass();
        Iterator it = xx9.a.iterator();
        if (it.hasNext()) {
            hr1.r(it.next());
            throw null;
        }
    }

    public void logSimple(tqd tqd, String str, String str2) {
        zx9 simpleBuilder = simpleBuilder(tqd);
        simpleBuilder.c("vcid", str);
        simpleBuilder.c("param", str2);
        simpleBuilder.d(this.timeProvider.getCurrentTimeMillis());
        log(simpleBuilder.a());
    }

    public long time() {
        return this.timeProvider.getCurrentTimeMillis();
    }

    public void log(tqd tqd, Map<String, String> map) {
        log(COLLECTOR, tqd.a, map);
    }

    public void log(String str, String str2, Map<String, String> map) {
        log(str, str2, map, (String) null, (Long) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, zx9] */
    public void log(String str, long j, String str2, String str3) {
        ? obj = new Object();
        obj.b();
        obj.a = COLLECTOR;
        obj.b = 1;
        obj.c = str;
        obj.d = 1;
        obj.d(j);
        if (str2 != null) {
            obj.c("param", str2);
        }
        String str4 = this.place;
        if (str4 != null && "callStart".equals(str)) {
            obj.c("place", str4);
        }
        if (str3 != null) {
            obj.c("stat_type", str3);
        }
        log(obj.a());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, zx9] */
    public void log(String str, String str2, Map<String, String> map, String str3, Long l) {
        ? obj = new Object();
        obj.b();
        obj.a = str;
        obj.b = 1;
        obj.c = str2;
        obj.d = 1;
        if (str3 != null) {
            obj.f = str3;
            obj.g = true;
        }
        if (l != null) {
            obj.d(l.longValue());
        } else {
            obj.d(this.timeProvider.getCurrentTimeMillis());
        }
        for (Map.Entry next : map.entrySet()) {
            obj.c((String) next.getKey(), (String) next.getValue());
        }
        log(obj.a());
    }
}
