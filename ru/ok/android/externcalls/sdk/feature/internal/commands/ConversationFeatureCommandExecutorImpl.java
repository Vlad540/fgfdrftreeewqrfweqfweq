package ru.ok.android.externcalls.sdk.feature.internal.commands;

import java.util.Set;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.feature.exception.ConversationFeatureException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JK\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "Lkotlin/Function1;", "", "Ljue;", "onError", "Lkotlin/Function0;", "Lorg/json/JSONObject;", "createParamsAction", "createParamsOrPassExceptionToOnError", "(Lu16;Ls16;)Lorg/json/JSONObject;", "Le51;", "feature", "onComplete", "enableFeatureForAll", "(Le51;Ls16;Lu16;)V", "", "Lje1;", "roles", "enableFeatureForRoles", "(Le51;Ljava/util/Set;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lg51;", "paramsCreator", "Lg51;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ConversationFeatureCommandExecutorImpl implements ConversationFeatureCommandExecutor {
    /* access modifiers changed from: private */
    public final g51 paramsCreator = new Object();
    private final SignalingProvider signalingProvider;

    /* JADX WARNING: type inference failed for: r1v1, types: [g51, java.lang.Object] */
    public ConversationFeatureCommandExecutorImpl(SignalingProvider signalingProvider2) {
        this.signalingProvider = signalingProvider2;
    }

    private final JSONObject createParamsOrPassExceptionToOnError(u16 u16, s16 s16) {
        try {
            return (JSONObject) s16.invoke();
        } catch (JSONException e) {
            if (u16 == null) {
                return null;
            }
            u16.invoke(new ConversationFeatureException("Can't create params for the method", e));
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final void enableFeatureForRoles$lambda$0(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void enableFeatureForRoles$lambda$1(u16 u16, JSONObject jSONObject) {
        if (u16 != null) {
            u16.invoke(new ConversationFeatureException("Command error " + jSONObject));
        }
    }

    public void enableFeatureForAll(e51 e51, s16 s16, u16 u16) {
        enableFeatureForRoles(e51, qw4.a, s16, u16);
    }

    public void enableFeatureForRoles(e51 e51, Set<? extends je1> set, s16 s16, u16 u16) {
        JSONObject createParamsOrPassExceptionToOnError;
        mfd mfd = SignalingProviderKt.get(this.signalingProvider, u16);
        if (mfd != null && (createParamsOrPassExceptionToOnError = createParamsOrPassExceptionToOnError(u16, new ConversationFeatureCommandExecutorImpl$enableFeatureForRoles$params$1(this, e51, set))) != null) {
            mfd.j(createParamsOrPassExceptionToOnError, new ps(3, s16), new qs(3, u16));
        }
    }
}
