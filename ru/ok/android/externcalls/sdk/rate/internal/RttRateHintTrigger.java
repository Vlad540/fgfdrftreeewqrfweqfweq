package ru.ok.android.externcalls.sdk.rate.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger;", "Ldg1;", "Lxwb;", "log", "Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "config", "Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;", "collection", "<init>", "(Lxwb;Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;)V", "Lzwb;", "rtcStat", "Ljue;", "onRtcStats", "(Lzwb;)V", "Lxwb;", "Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;", "", "highRttCount", "I", "", "wasReported", "Z", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class RttRateHintTrigger implements dg1 {
    private static final Companion Companion = new Companion((x54) null);
    private static final String LOG_TAG = "RateManager";
    private static final String RTT_HINT_REASON = "rtt_";
    private final RateHintCollection collection;
    private final RttRateHintConfig config;
    private int highRttCount;
    private final xwb log;
    private boolean wasReported;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger$Companion;", "", "()V", "LOG_TAG", "", "RTT_HINT_REASON", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    public RttRateHintTrigger(xwb xwb, RttRateHintConfig rttRateHintConfig, RateHintCollection rateHintCollection) {
        this.log = xwb;
        this.config = rttRateHintConfig;
        this.collection = rateHintCollection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtcStats(defpackage.zwb r6) {
        /*
            r5 = this;
            boolean r0 = r5.wasReported
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            iw1 r6 = r6.c()
            if (r6 == 0) goto L_0x0028
            java.lang.String r6 = r6.h
            if (r6 == 0) goto L_0x0028
            r0 = 0
            p7c r1 = xnc.a     // Catch:{ NumberFormatException -> 0x0020 }
            boolean r1 = r1.a(r6)     // Catch:{ NumberFormatException -> 0x0020 }
            if (r1 == 0) goto L_0x0020
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x0020 }
            java.lang.Float r0 = java.lang.Float.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0020 }
        L_0x0020:
            if (r0 == 0) goto L_0x0028
            float r6 = r0.floatValue()
            long r0 = (long) r6
            goto L_0x002a
        L_0x0028:
            r0 = 0
        L_0x002a:
            xwb r6 = r5.log
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "measured rtt: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RateManager"
            r6.log(r3, r2)
            ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig r6 = r5.config
            long r2 = r6.getRttMs()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 1
            if (r6 < 0) goto L_0x0050
            int r6 = r5.highRttCount
            int r6 = r6 + r0
            r5.highRttCount = r6
            goto L_0x0053
        L_0x0050:
            r6 = 0
            r5.highRttCount = r6
        L_0x0053:
            int r6 = r5.highRttCount
            ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig r1 = r5.config
            int r1 = r1.getHighRttCount()
            if (r6 < r1) goto L_0x0075
            ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection r6 = r5.collection
            ru.ok.android.externcalls.sdk.rate.RateHint r1 = new ru.ok.android.externcalls.sdk.rate.RateHint
            ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig r2 = r5.config
            long r2 = r2.getRttMs()
            java.lang.String r4 = "rtt_"
            java.lang.String r2 = defpackage.us8.i(r2, r4)
            r1.<init>(r2)
            r6.addRateHint(r1)
            r5.wasReported = r0
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.rate.internal.RttRateHintTrigger.onRtcStats(zwb):void");
    }
}
