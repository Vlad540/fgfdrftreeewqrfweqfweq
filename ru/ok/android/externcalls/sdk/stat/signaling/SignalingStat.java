package ru.ok.android.externcalls.sdk.stat.signaling;

import android.os.SystemClock;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000B\u001f\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\nR\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ok/android/externcalls/sdk/stat/signaling/SignalingStat;", "Lkotlin/Function0;", "Lw41;", "getEventualStatSender", "Leje;", "timeProvider", "<init>", "(Ls16;Leje;)V", "Ljue;", "onFailed", "()V", "", "eventName", "", "value", "report", "(Ljava/lang/String;Ljava/lang/Integer;)V", "stringValue", "(Ljava/lang/String;Ljava/lang/String;)V", "onRestart", "onConnect", "onConnected", "onMessageReceived", "onFailedByPings", "", "t", "onFailedByException", "(Ljava/lang/Throwable;)V", "onTimeout", "Ls16;", "Leje;", "", "connectedAtLeastOnceInCall", "Z", "", "startConnectTime", "J", "lastMessageReceived", "firstFailTime", "Ljava/lang/Long;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SignalingStat {
    private boolean connectedAtLeastOnceInCall;
    private Long firstFailTime;
    private final s16 getEventualStatSender;
    private long lastMessageReceived;
    private long startConnectTime;
    private final eje timeProvider;

    public SignalingStat(s16 s16, eje eje) {
        this.getEventualStatSender = s16;
        this.timeProvider = eje;
    }

    private final void onFailed() {
        if (this.firstFailTime == null) {
            ((fje) this.timeProvider).getClass();
            this.firstFailTime = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    private final void report(String str, Integer num) {
        w41 w41 = (w41) this.getEventualStatSender.invoke();
        if (w41 != null) {
            ((x41) w41).c(str, EventItemValueKt.toEventItemValue(num != null ? num.intValue() : 0), new EventItemsMap());
        }
    }

    public static /* synthetic */ void report$default(SignalingStat signalingStat, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        signalingStat.report(str, num);
    }

    public void onConnect() {
        ((fje) this.timeProvider).getClass();
        this.startConnectTime = SystemClock.elapsedRealtime();
    }

    public void onConnected() {
        this.firstFailTime = null;
        this.lastMessageReceived = 0;
        ((fje) this.timeProvider).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.startConnectTime;
        if (this.connectedAtLeastOnceInCall) {
            report("websocket_reconnected", Integer.valueOf((int) elapsedRealtime));
            return;
        }
        this.connectedAtLeastOnceInCall = true;
        report("websocket_connected", Integer.valueOf((int) elapsedRealtime));
    }

    public void onFailedByException(Throwable th) {
        onFailed();
        String message = th.getMessage();
        if (message == null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            message = stringWriter.toString();
        }
        report("websocket_failed_exception", h0e.y0(HttpStatus.SC_MULTIPLE_CHOICES, message));
    }

    public void onFailedByPings() {
        ((fje) this.timeProvider).getClass();
        onFailed();
        report("websocket_failed_pings", Integer.valueOf((int) (SystemClock.elapsedRealtime() - this.lastMessageReceived)));
    }

    public void onMessageReceived() {
        ((fje) this.timeProvider).getClass();
        this.lastMessageReceived = SystemClock.elapsedRealtime();
    }

    public void onRestart() {
        report$default(this, "websocket_restart", (Integer) null, 2, (Object) null);
    }

    public void onTimeout() {
        Long l;
        Long l2 = this.firstFailTime;
        Integer num = null;
        if (l2 != null) {
            long longValue = l2.longValue();
            ((fje) this.timeProvider).getClass();
            l = Long.valueOf(SystemClock.elapsedRealtime() - longValue);
        } else {
            l = null;
        }
        if (l != null) {
            num = Integer.valueOf((int) l.longValue());
        }
        report("websocket_timeout", num);
    }

    private final void report(String str, String str2) {
        w41 w41 = (w41) this.getEventualStatSender.invoke();
        if (w41 != null) {
            ((x41) w41).c(str, EventItemValueKt.toEventItemValue(str2), new EventItemsMap());
        }
    }
}
