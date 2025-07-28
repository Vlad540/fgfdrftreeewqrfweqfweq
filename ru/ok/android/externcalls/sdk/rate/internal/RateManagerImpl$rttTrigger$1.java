package ru.ok.android.externcalls.sdk.rate.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.rate.RateHint;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class RateManagerImpl$rttTrigger$1 implements RateHintCollection, u26 {
    final /* synthetic */ RateManagerImpl $tmp0;

    public RateManagerImpl$rttTrigger$1(RateManagerImpl rateManagerImpl) {
        this.$tmp0 = rateManagerImpl;
    }

    public final void addRateHint(RateHint rateHint) {
        this.$tmp0.addRateHint(rateHint);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RateHintCollection) || !(obj instanceof u26)) {
            return false;
        }
        return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
    }

    public final n26 getFunctionDelegate() {
        return new w26(1, 0, RateManagerImpl.class, this.$tmp0, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
