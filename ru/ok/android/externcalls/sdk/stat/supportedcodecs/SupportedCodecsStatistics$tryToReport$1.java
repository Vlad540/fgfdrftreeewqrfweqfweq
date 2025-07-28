package ru.ok.android.externcalls.sdk.stat.supportedcodecs;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsApiRequest;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012 \u0002*\b\u0018\u00010\u0000R\u00020\u00010\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest$Response;", "Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest;", "kotlin.jvm.PlatformType", "it", "Ljue;", "accept", "(Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsApiRequest$Response;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class SupportedCodecsStatistics$tryToReport$1<T> implements of3 {
    final /* synthetic */ long $currentTime;
    final /* synthetic */ c2b $preferencesHelper;
    final /* synthetic */ xwb $rtcLog;

    public SupportedCodecsStatistics$tryToReport$1(xwb xwb, c2b c2b, long j) {
        this.$rtcLog = xwb;
        this.$preferencesHelper = c2b;
        this.$currentTime = j;
    }

    public final void accept(SupportedCodecsApiRequest.Response response) {
        xwb xwb = this.$rtcLog;
        boolean success = response.getSuccess();
        xwb.log("SupportedCodecsStatistics", "Supported codecs are sent with success=" + success);
        if (response.getSuccess()) {
            c2b c2b = this.$preferencesHelper;
            c2b.a.edit().putLong("supportedCodecsLastUpdate", this.$currentTime).apply();
        }
    }
}
