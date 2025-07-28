package ru.ok.android.externcalls.sdk.watch_together.internal.commands;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.exceptions.ConversationNotPreparedException;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;
import ru.ok.android.externcalls.sdk.watch_together.exceptions.WatchTogetherException;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JZ\u0010%\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J=\u0010&\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b&\u0010'J=\u0010(\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b(\u0010'J=\u0010)\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b)\u0010'JP\u0010-\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,JE\u0010.\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b.\u0010/JM\u00104\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/watch_together/internal/commands/WatchTogetherCommandsExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lkotlin/Function0;", "Lqb1;", "mediaOptionsDelegate", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Ls16;)V", "Lkotlin/Function1;", "", "Ljue;", "onError", "Lmfd;", "getSignalingOrPassExceptionToOnError", "(Lu16;)Lmfd;", "", "method", "Lorg/json/JSONObject;", "errorResponse", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lu16;)V", "value", "Lc79;", "parseMovieType", "(Ljava/lang/String;)Lc79;", "Lw69;", "movieId", "Lk79;", "volume", "La79;", "meta", "", "moveToAdminOnHangup", "onSuccess", "play-yj_a6ag", "(Lw69;FLa79;ZLs16;Lu16;)V", "play", "stop", "(Lw69;Ls16;Lu16;)V", "pause", "resume", "isMuted", "setVolume-F2PwOSs", "(Lw69;FZLs16;Lu16;)V", "setVolume", "setMuted", "(Lw69;ZLs16;Lu16;)V", "", "position", "Ljava/util/concurrent/TimeUnit;", "unit", "setPosition", "(Lw69;JLjava/util/concurrent/TimeUnit;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Ls16;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class WatchTogetherCommandExecutorImpl implements WatchTogetherCommandsExecutor {
    private final s16 mediaOptionsDelegate;
    private final SignalingProvider signalingProvider;

    public WatchTogetherCommandExecutorImpl(SignalingProvider signalingProvider2, s16 s16) {
        this.signalingProvider = signalingProvider2;
        this.mediaOptionsDelegate = s16;
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

    private final void parseErrorResponse(String str, JSONObject jSONObject, u16 u16) {
        String optString = jSONObject.optString("error");
        WatchTogetherError watchTogetherError = hhd.f(optString, "movie-limit-exceeded") ? WatchTogetherError.LIMIT_EXCEEDED : hhd.f(optString, "movie-not-found") ? WatchTogetherError.LIMIT_EXCEEDED : WatchTogetherError.UNKNOWN_ERROR;
        if (u16 != null) {
            u16.invoke(new WatchTogetherException(watchTogetherError, "Error response for " + str + " command " + jSONObject, (Throwable) null, 4, (x54) null));
        }
    }

    private final c79 parseMovieType(String str) {
        if (hhd.f(str, "MOVIE")) {
            return c79.a;
        }
        if (hhd.f(str, "STREAM")) {
            return c79.b;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void pause$lambda$4(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void pause$lambda$5(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("pause", jSONObject, u16);
    }

    /* access modifiers changed from: private */
    public static final void play_yj_a6ag$lambda$0(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void play_yj_a6ag$lambda$1(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("play", jSONObject, u16);
    }

    /* access modifiers changed from: private */
    public static final void resume$lambda$6(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void resume$lambda$7(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("resume", jSONObject, u16);
    }

    /* access modifiers changed from: private */
    public static final void setMuted$lambda$10(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void setMuted$lambda$11(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("setMute", jSONObject, u16);
    }

    /* access modifiers changed from: private */
    public static final void setPosition$lambda$12(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void setPosition$lambda$13(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("setPosition", jSONObject, u16);
    }

    /* access modifiers changed from: private */
    public static final void setVolume_F2PwOSs$lambda$8(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void setVolume_F2PwOSs$lambda$9(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("setVolume", jSONObject, u16);
    }

    /* access modifiers changed from: private */
    public static final void stop$lambda$2(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void stop$lambda$3(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, u16 u16, JSONObject jSONObject) {
        watchTogetherCommandExecutorImpl.parseErrorResponse("stop", jSONObject, u16);
    }

    public void pause(w69 w69, s16 s16, u16 u16) {
        mfd signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(u16);
        if (signalingOrPassExceptionToOnError != null) {
            long j = w69.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-movie");
            jSONObject.put("movieId", j);
            jSONObject.put("pause", true);
            signalingOrPassExceptionToOnError.d(new x66(jSONObject), false, new ps(22, s16), new nef(this, u16, 1));
        }
    }

    /* renamed from: play-yj_a6ag  reason: not valid java name */
    public void m73playyj_a6ag(w69 w69, float f, a79 a79, boolean z, s16 s16, u16 u16) {
        qb1 qb1 = (qb1) this.mediaOptionsDelegate.invoke();
        if (qb1 != null) {
            if (qb1.d(new zn1(0, 12, ac9.class, qb1.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                mfd signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(u16);
                if (signalingOrPassExceptionToOnError != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("command", (Object) "add-movie");
                    jSONObject.put("movieId", w69.a);
                    jSONObject.put("gain", (double) f);
                    jSONObject.put("moveToAdminOnHangup", z);
                    signalingOrPassExceptionToOnError.d(new x66(jSONObject), false, new ps(24, s16), new nef(this, u16, 4));
                    return;
                }
                return;
            }
        }
        if (u16 != null) {
            u16.invoke(new WatchTogetherException(WatchTogetherError.PLAY_NOT_ALLOWED, "Play not allowed due to media option", (Throwable) null, 4, (x54) null));
        }
    }

    public void resume(w69 w69, s16 s16, u16 u16) {
        mfd signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(u16);
        if (signalingOrPassExceptionToOnError != null) {
            long j = w69.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-movie");
            jSONObject.put("movieId", j);
            jSONObject.put("pause", false);
            signalingOrPassExceptionToOnError.d(new x66(jSONObject), false, new ps(20, s16), new nef(this, u16, 2));
        }
    }

    public void setMuted(w69 w69, boolean z, s16 s16, u16 u16) {
        mfd signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(u16);
        if (signalingOrPassExceptionToOnError != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-movie");
            jSONObject.put("movieId", w69.a);
            jSONObject.put("mute", z);
            signalingOrPassExceptionToOnError.d(new x66(jSONObject), false, new ps(25, s16), new nef(this, u16, 5));
        }
    }

    public void setPosition(w69 w69, long j, TimeUnit timeUnit, s16 s16, u16 u16) {
        mfd signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(u16);
        if (signalingOrPassExceptionToOnError != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-movie");
            jSONObject.put("movieId", w69.a);
            jSONObject.put("offset", timeUnit.toSeconds(j));
            signalingOrPassExceptionToOnError.d(new x66(jSONObject), false, new ps(23, s16), new nef(this, u16, 3));
        }
    }

    /* renamed from: setVolume-F2PwOSs  reason: not valid java name */
    public void m74setVolumeF2PwOSs(w69 w69, float f, boolean z, s16 s16, u16 u16) {
        mfd signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(u16);
        if (signalingOrPassExceptionToOnError != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-movie");
            jSONObject.put("movieId", w69.a);
            jSONObject.put("gain", (double) f);
            jSONObject.put("mute", z);
            signalingOrPassExceptionToOnError.d(new x66(jSONObject), false, new ps(21, s16), new nef(this, u16, 0));
        }
    }

    public void stop(w69 w69, s16 s16, u16 u16) {
        mfd signalingOrPassExceptionToOnError = getSignalingOrPassExceptionToOnError(u16);
        if (signalingOrPassExceptionToOnError != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "remove-movie");
            jSONObject.put("movieId", w69.a);
            signalingOrPassExceptionToOnError.d(new x66(jSONObject), false, new ps(26, s16), new nef(this, u16, 6));
        }
    }
}
