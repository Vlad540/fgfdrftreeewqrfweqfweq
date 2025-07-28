package ru.ok.android.externcalls.sdk.factory.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/internal/RTCLogWrapper;", "Lxwb;", "Lkotlin/Function0;", "logger", "<init>", "(Ls16;)V", "", "tag", "msg", "Ljue;", "log", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "logException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "reportException", "Ls16;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class RTCLogWrapper implements xwb {
    private final s16 logger;

    public RTCLogWrapper(s16 s16) {
        this.logger = s16;
    }

    public void log(String str, String str2) {
        xwb xwb = (xwb) this.logger.invoke();
        if (xwb != null) {
            xwb.log(str, str2);
        }
    }

    public void logException(String str, String str2, Throwable th) {
        xwb xwb = (xwb) this.logger.invoke();
        if (xwb != null) {
            xwb.logException(str, str2, th);
        }
    }

    public void reportException(String str, String str2, Throwable th) {
        xwb xwb = (xwb) this.logger.invoke();
        if (xwb != null) {
            xwb.reportException(str, str2, th);
        }
    }
}
