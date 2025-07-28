package defpackage;

import java.util.Map;

/* renamed from: axb  reason: default package */
public abstract class axb {
    public static String COLLECTOR_VIDEO = "ok.mobile.apps.video";
    public static String COLLECTOR_WEBRTC = "webrtc.aggregation";
    public String conversationId = "";

    public abstract void log(String str, long j, String str2, String str3);

    public abstract void log(String str, String str2, Map map);

    @Deprecated
    public final void log(tqd tqd, String str, String str2) {
        log(tqd.a, time(), str, str2);
    }

    public abstract void logSimple(tqd tqd, String str, String str2);

    public abstract long time();
}
