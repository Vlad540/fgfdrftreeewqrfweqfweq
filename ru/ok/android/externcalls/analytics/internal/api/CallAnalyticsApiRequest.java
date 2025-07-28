package ru.ok.android.externcalls.analytics.internal.api;

import android.net.Uri;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

public final class CallAnalyticsApiRequest implements yk {
    private static final String LOG_TAG = "CallAnalyticsApiRequest";
    private final String apiMethod;
    private final String appVersion;
    private final oq0 items;
    private final CallAnalyticsLogger logger;
    private final String platform;
    private final String sdkType;
    private final String sdkVersion;
    private final int version;

    public CallAnalyticsApiRequest(String str, String str2, String str3, String str4, String str5, int i, oq0 oq0, CallAnalyticsLogger callAnalyticsLogger) {
        this.apiMethod = str;
        this.platform = str2;
        this.appVersion = str3;
        this.sdkType = str4;
        this.sdkVersion = str5;
        this.version = i;
        this.items = oq0;
        this.logger = callAnalyticsLogger;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void lambda$getOkParser$0(m67 m67) throws IOException, JsonParseException {
        CallAnalyticsLogger callAnalyticsLogger = this.logger;
        callAnalyticsLogger.d(LOG_TAG, "Send response: " + m67.H());
        return null;
    }

    private void writeString(t67 t67, String str, String str2) throws IOException {
        writeString(t67, str, str2, false);
    }

    public boolean canRepeat() {
        return this.items.canRepeat();
    }

    public /* bridge */ /* synthetic */ xk getConfigExtractor() {
        return xk.e;
    }

    public /* bridge */ /* synthetic */ h67 getFailParser() {
        return oa2.a;
    }

    public h67 getOkParser() {
        return new rgc(14, this);
    }

    public int getPriority() {
        return 2;
    }

    public kl getScope() {
        return kl.c;
    }

    public /* bridge */ /* synthetic */ ll getScopeAfter() {
        return ll.a;
    }

    public Uri getUri() {
        return sl.a(this.apiMethod);
    }

    public boolean shouldGzip() {
        return true;
    }

    public boolean shouldPost() {
        return true;
    }

    public boolean shouldReport() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean willWriteParams() {
        return true;
    }

    public /* bridge */ /* synthetic */ boolean willWriteSupplyParams() {
        return false;
    }

    public void writeParams(t67 t67) throws IOException, JsonSerializeException {
        t67.g0("data");
        t67.s();
        writeString(t67, "platform", this.platform, true);
        writeString(t67, "app_version", this.appVersion);
        writeString(t67, "sdk_type", this.sdkType);
        writeString(t67, "sdk_version", this.sdkVersion);
        t67.g0(ClientCookie.VERSION_ATTR);
        ((t1) t67).a(Integer.toString(this.version));
        t67.g0("items");
        this.items.write(t67);
        t67.q();
    }

    public /* bridge */ /* synthetic */ void writeSupplyParams(t67 t67) throws IOException, JsonSerializeException {
    }

    private void writeString(t67 t67, String str, String str2, boolean z) throws IOException {
        if (str2 == null) {
            return;
        }
        if (!z || !str2.isEmpty()) {
            t67.g0(str);
            t67.i(str2);
        }
    }
}
