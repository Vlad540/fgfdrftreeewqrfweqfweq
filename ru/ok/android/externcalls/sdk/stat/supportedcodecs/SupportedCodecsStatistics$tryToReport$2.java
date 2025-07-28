package ru.ok.android.externcalls.sdk.stat.supportedcodecs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljue;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class SupportedCodecsStatistics$tryToReport$2<T> implements of3 {
    final /* synthetic */ xwb $rtcLog;

    public SupportedCodecsStatistics$tryToReport$2(xwb xwb) {
        this.$rtcLog = xwb;
    }

    public final void accept(Throwable th) {
        xwb xwb = this.$rtcLog;
        String message = th.getMessage();
        xwb.log("SupportedCodecsStatistics", "Failed to send supported codecs with error: " + message);
    }
}
