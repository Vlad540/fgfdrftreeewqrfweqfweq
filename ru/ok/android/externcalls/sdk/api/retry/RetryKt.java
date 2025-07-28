package ru.ok.android.externcalls.sdk.api.retry;

import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlin.Metadata;
import ru.ok.android.api.http.HttpStatusApiException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\b\u001a9\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\b\u001a9\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\b\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\b\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001aA\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"", "T", "Ldhd;", "", "isEnabled", "Lxwb;", "logger", "retryApiCallForOutgoing", "(Ldhd;ZLxwb;)Ldhd;", "retryApiCallForJoining", "retryApiCallForIncoming", "retryApiCallForBackgroundWork", "retryApiCallForFastWorkRequired", "retryWithFastBackoff", "retryWithSlowBackoff", "Lge0;", "backoff", "retryApiWithBackoff", "(Ldhd;ZLxwb;Lge0;)Ldhd;", "createFastBackoff", "()Lge0;", "createSlowBackoff", "", "throwable", "retryApiExceptionFilter", "(Ljava/lang/Throwable;)Z", "", "LOG_TAG", "Ljava/lang/String;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0})
public final class RetryKt {
    private static final String LOG_TAG = "CallsApiRetry";

    private static final ge0 createFastBackoff() {
        return new ge0(new l55(15, 0, 0.0f), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
    }

    private static final ge0 createSlowBackoff() {
        return new ge0(new l55(10, 1000, 2.0f), 10000);
    }

    public static final <T> dhd retryApiCallForBackgroundWork(dhd dhd, boolean z, xwb xwb) {
        return retryWithSlowBackoff(dhd, z, xwb);
    }

    public static final <T> dhd retryApiCallForFastWorkRequired(dhd dhd, boolean z, xwb xwb) {
        return retryWithFastBackoff(dhd, z, xwb);
    }

    public static final <T> dhd retryApiCallForIncoming(dhd dhd, boolean z, xwb xwb) {
        return retryWithSlowBackoff(dhd, z, xwb);
    }

    public static final <T> dhd retryApiCallForJoining(dhd dhd, boolean z, xwb xwb) {
        return retryWithFastBackoff(dhd, z, xwb);
    }

    public static final <T> dhd retryApiCallForOutgoing(dhd dhd, boolean z, xwb xwb) {
        return retryWithFastBackoff(dhd, z, xwb);
    }

    /* access modifiers changed from: private */
    public static final boolean retryApiExceptionFilter(Throwable th) {
        if ((th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof SocketException) || (th instanceof SSLProtocolException) || (th instanceof SSLPeerUnverifiedException) || (th instanceof SSLHandshakeException) || (th instanceof SSLException) || (th instanceof HttpRetryException)) {
            return true;
        }
        if (th instanceof HttpStatusApiException) {
            int i = ((HttpStatusApiException) th).a;
            if (i == 502 || i == 504) {
                return true;
            }
        } else if ((th instanceof ProtocolException) || (th instanceof IOException)) {
            return true;
        }
        return false;
    }

    private static final <T> dhd retryApiWithBackoff(dhd dhd, boolean z, xwb xwb, ge0 ge0) {
        if (z) {
            RetryKt$retryApiWithBackoff$1 retryKt$retryApiWithBackoff$1 = RetryKt$retryApiWithBackoff$1.INSTANCE;
            RetryKt$retryApiWithBackoff$2 retryKt$retryApiWithBackoff$2 = new RetryKt$retryApiWithBackoff$2(xwb);
            RetryKt$retryApiWithBackoff$3 retryKt$retryApiWithBackoff$3 = new RetryKt$retryApiWithBackoff$3(xwb);
            return new mv9(0, new au9(dhd.n(), new scc((u16) retryKt$retryApiWithBackoff$1, ge0, (i26) retryKt$retryApiWithBackoff$2, cnc.a(), (u16) retryKt$retryApiWithBackoff$3), 6));
        }
        xwb.log(LOG_TAG, "retry disabled");
        return dhd;
    }

    private static final <T> dhd retryWithFastBackoff(dhd dhd, boolean z, xwb xwb) {
        return retryApiWithBackoff(dhd, z, xwb, createFastBackoff());
    }

    private static final <T> dhd retryWithSlowBackoff(dhd dhd, boolean z, xwb xwb) {
        return retryApiWithBackoff(dhd, z, xwb, createSlowBackoff());
    }
}
