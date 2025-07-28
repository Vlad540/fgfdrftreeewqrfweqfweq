package ru.ok.android.externcalls.sdk.log.stat;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.log.stat.StatisticsManager;
import ru.ok.android.externcalls.sdk.log.stat.item.ProductStatItem;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/ProductStatisticsManagerImpl;", "Lru/ok/android/externcalls/sdk/log/stat/BaseStatisticsManagerImpl;", "Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;", "Lru/ok/android/externcalls/sdk/log/stat/StatisticsManager$TimeProvider;", "timeProvider", "<init>", "(Lru/ok/android/externcalls/sdk/log/stat/StatisticsManager$TimeProvider;)V", "", "timestamp", "getTime", "(J)J", "statItem", "Ljue;", "log", "(Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;)V", "Lru/ok/android/externcalls/sdk/log/stat/StatisticsManager$TimeProvider;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ProductStatisticsManagerImpl extends BaseStatisticsManagerImpl<ProductStatItem> {
    private final StatisticsManager.TimeProvider timeProvider;

    public ProductStatisticsManagerImpl(StatisticsManager.TimeProvider timeProvider2) {
        this.timeProvider = timeProvider2;
    }

    public long getTime(long j) {
        return j == -1 ? this.timeProvider.getCurrentTimeMillis() : j;
    }

    public void log(ProductStatItem productStatItem) {
        sendStat(productStatItem);
    }
}
