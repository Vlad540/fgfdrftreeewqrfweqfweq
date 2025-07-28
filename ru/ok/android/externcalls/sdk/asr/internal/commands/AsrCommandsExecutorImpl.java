package ru.ok.android.externcalls.sdk.asr.internal.commands;

import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.exceptions.AsrException;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00132\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u0017\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00132\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lkotlin/Function1;", "", "Ljue;", "onError", "Lmfd;", "getSignalingOrPassExceptionToOnError", "(Lu16;)Lmfd;", "", "fileName", "Lw2d;", "sessionRoomId", "Lkotlin/Function0;", "onSuccess", "startRecord", "(Ljava/lang/String;Lw2d;Ls16;Lu16;)V", "stopRecord", "(Lw2d;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "getActiveRoomId", "()Lw2d;", "activeRoomId", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AsrCommandsExecutorImpl implements AsrCommandsExecutor {
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;

    public AsrCommandsExecutorImpl(SignalingProvider signalingProvider2, ParticipantStore participantStore2) {
        this.signalingProvider = signalingProvider2;
        this.participantStore = participantStore2;
    }

    private final w2d getActiveRoomId() {
        return this.participantStore.getActiveRoomId();
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
    public static final void startRecord$lambda$0(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void startRecord$lambda$1(u16 u16, JSONObject jSONObject) {
        if (u16 != null) {
            u16.invoke(new AsrException(jSONObject, (String) null, (Throwable) null, 6, (x54) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void stopRecord$lambda$2(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void stopRecord$lambda$3(u16 u16, JSONObject jSONObject) {
        if (u16 != null) {
            u16.invoke(new AsrException(jSONObject, (String) null, (Throwable) null, 6, (x54) null));
        }
    }

    public void startRecord(String str, w2d w2d, s16 s16, u16 u16) {
        if (w2d == null) {
            w2d = getActiveRoomId();
        }
        mfd signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(u16);
        if (signalingOrPassExceptionToOnError != null) {
            try {
                x66 d = x87.d((JSONObject) null, "asr-start");
                d.a.put("fileName", (Object) str);
                if (w2d instanceof v2d) {
                    d.b(((v2d) w2d).a, "roomId");
                }
                signalingOrPassExceptionToOnError.d(d, false, new ps(0, s16), new qs(0, u16));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stopRecord(w2d w2d, s16 s16, u16 u16) {
        if (w2d == null) {
            w2d = getActiveRoomId();
        }
        mfd signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(u16);
        if (signalingOrPassExceptionToOnError != null) {
            try {
                x66 d = x87.d((JSONObject) null, "asr-stop");
                if (w2d instanceof v2d) {
                    d.b(((v2d) w2d).a, "roomId");
                }
                signalingOrPassExceptionToOnError.d(d, false, new ps(1, s16), new qs(1, u16));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
