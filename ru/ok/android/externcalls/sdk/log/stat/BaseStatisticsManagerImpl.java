package ru.ok.android.externcalls.sdk.log.stat;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.ext.OneLogger;
import ru.ok.android.externcalls.sdk.log.stat.item.StatItem;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/BaseStatisticsManagerImpl;", "Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;", "S", "Lru/ok/android/externcalls/sdk/log/stat/StatisticsManager;", "<init>", "()V", "", "timestamp", "getTime", "(J)J", "statItem", "Ljue;", "sendStat", "(Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;)V", "Lay9;", "makeState", "(Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;)Lay9;", "Lzx9;", "builder", "setStat", "(Lzx9;Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;)Lzx9;", "", "", "custom", "setCustom", "(Lzx9;Ljava/util/Map;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public abstract class BaseStatisticsManagerImpl<S extends StatItem> implements StatisticsManager<S> {
    public BaseStatisticsManagerImpl() {
        try {
            OneLogger.ensureInitialized();
        } catch (NoClassDefFoundError unused) {
        }
    }

    public abstract long getTime(long j);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, zx9] */
    public ay9 makeState(S s) {
        ? obj = new Object();
        obj.b();
        return setStat(obj, s).a();
    }

    public void sendStat(S s) {
        makeState(s).getClass();
        Iterator it = xx9.a.iterator();
        if (it.hasNext()) {
            hr1.r(it.next());
            throw null;
        }
    }

    public void setCustom(zx9 zx9, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            zx9.c((String) next.getKey(), (String) next.getValue());
        }
    }

    public zx9 setStat(zx9 zx9, S s) {
        setCustom(zx9, s.getCustom());
        zx9.a = s.getCollector();
        zx9.b = s.getType();
        zx9.c = s.getOperation();
        zx9.d(getTime(s.getTimestamp()));
        return zx9;
    }
}
