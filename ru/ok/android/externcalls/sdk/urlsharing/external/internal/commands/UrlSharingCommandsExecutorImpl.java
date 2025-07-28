package ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands;

import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "Lkotlin/Function1;", "", "Ljue;", "onError", "Lmfd;", "getSignalingOrPassExceptionToOnError", "(Lu16;)Lmfd;", "", "url", "Lkotlin/Function0;", "onSuccess", "start", "(Ljava/lang/String;Ls16;Lu16;)V", "stop", "(Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class UrlSharingCommandsExecutorImpl implements UrlSharingCommandsExecutor {
    private final SignalingProvider signalingProvider;

    public UrlSharingCommandsExecutorImpl(SignalingProvider signalingProvider2) {
        this.signalingProvider = signalingProvider2;
    }

    private final mfd getSignalingOrPassExceptionToOnError(u16 u16) {
        mfd signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            return signaling;
        }
        if (u16 != null) {
            u16.invoke(new ConversationNotPreparedException());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void start$lambda$0(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void start$lambda$1(u16 u16, JSONObject jSONObject) {
        if (u16 != null) {
            u16.invoke(new RuntimeException("Start url sharing error " + jSONObject));
        }
    }

    /* access modifiers changed from: private */
    public static final void stop$lambda$2(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void stop$lambda$3(u16 u16, JSONObject jSONObject) {
        if (u16 != null) {
            u16.invoke(new RuntimeException("Stop url sharing error " + jSONObject));
        }
    }

    public void start(String str, s16 s16, u16 u16) {
        mfd signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(u16);
        if (signalingOrPassExceptionToOnError != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "start-url-sharing");
            jSONObject.put("sharedUrl", (Object) str);
            signalingOrPassExceptionToOnError.j(jSONObject, new ps(18, s16), new qs(10, u16));
        }
    }

    public void stop(s16 s16, u16 u16) {
        mfd signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(u16);
        if (signalingOrPassExceptionToOnError != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "stop-url-sharing");
            signalingOrPassExceptionToOnError.j(jSONObject, new ps(19, s16), new qs(11, u16));
        }
    }
}
