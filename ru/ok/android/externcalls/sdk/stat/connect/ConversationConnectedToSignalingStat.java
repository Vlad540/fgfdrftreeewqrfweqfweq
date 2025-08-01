package ru.ok.android.externcalls.sdk.stat.connect;

import android.os.SystemClock;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/connect/ConversationConnectedToSignalingStat;", "", "Lkotlin/Function0;", "Lw41;", "getEventualStatSender", "Leje;", "timeProvider", "<init>", "(Ls16;Leje;)V", "Ljue;", "report", "()V", "onConnectedToSignaling", "Ls16;", "Leje;", "", "isReported", "Z", "", "startTimeMs", "J", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ConversationConnectedToSignalingStat {
    private final s16 getEventualStatSender;
    private boolean isReported;
    private final long startTimeMs = SystemClock.elapsedRealtime();
    private final eje timeProvider;

    public ConversationConnectedToSignalingStat(s16 s16, eje eje) {
        this.getEventualStatSender = s16;
        this.timeProvider = eje;
    }

    private final void report() {
        ((fje) this.timeProvider).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTimeMs;
        w41 w41 = (w41) this.getEventualStatSender.invoke();
        if (w41 != null) {
            ((x41) w41).c("signaling_connected", EventItemValueKt.toEventItemValue(elapsedRealtime), new EventItemsMap());
        }
    }

    public final void onConnectedToSignaling() {
        if (!this.isReported) {
            this.isReported = true;
            report();
        }
    }
}
