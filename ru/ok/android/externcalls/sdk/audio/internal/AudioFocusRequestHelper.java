package ru.ok.android.externcalls.sdk.audio.internal;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0016\u0010\u0014J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "", "Landroid/media/AudioManager;", "audioManager", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "onMuteListener", "Landroid/os/Handler;", "mainThreadHandler", "workerThreadHandler", "Lkotlin/Function0;", "", "isDestroyed", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "Ljue;", "onFocusLost", "onFocusGained", "<init>", "(Landroid/media/AudioManager;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;Landroid/os/Handler;Landroid/os/Handler;Ls16;Lru/ok/android/externcalls/sdk/audio/Logger;Ls16;Ls16;)V", "mute", "()V", "muteForever", "unmute", "focusGained", "forever", "handleFocusUpdate", "(ZZ)V", "requestFocus", "releaseFocus", "Landroid/media/AudioManager;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "Landroid/os/Handler;", "Ls16;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "Landroid/media/AudioFocusRequest;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "isFocusGained", "Z", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
public final class AudioFocusRequestHelper {
    private static final Companion Companion = new Companion((x54) null);
    @Deprecated
    public static final String TAG = "AudioFocusRequestHelper";
    private AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private final s16 isDestroyed;
    private boolean isFocusGained;
    private final Logger logger;
    private final Handler mainThreadHandler;
    private final s16 onFocusGained;
    private final s16 onFocusLost;
    private final CallsAudioManager.OnMuteListener onMuteListener;
    private final Handler workerThreadHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper$Companion;", "", "()V", "TAG", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    public AudioFocusRequestHelper(AudioManager audioManager2, CallsAudioManager.OnMuteListener onMuteListener2, Handler handler, Handler handler2, s16 s16, Logger logger2, s16 s162, s16 s163) {
        this.audioManager = audioManager2;
        this.onMuteListener = onMuteListener2;
        this.mainThreadHandler = handler;
        this.workerThreadHandler = handler2;
        this.isDestroyed = s16;
        this.logger = logger2;
        this.onFocusLost = s162;
        this.onFocusGained = s163;
    }

    private final void handleFocusUpdate(boolean z, boolean z2) {
        if (this.isFocusGained == z) {
            Logger logger2 = this.logger;
            logger2.d(TAG, "Focus state didn't change, ignore update to " + z);
            return;
        }
        this.isFocusGained = z;
        if (z) {
            this.onFocusGained.invoke();
            unmute();
            return;
        }
        this.onFocusLost.invoke();
        if (z2) {
            muteForever();
        } else {
            mute();
        }
    }

    public static /* synthetic */ void handleFocusUpdate$default(AudioFocusRequestHelper audioFocusRequestHelper, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        audioFocusRequestHelper.handleFocusUpdate(z, z2);
    }

    private final void mute() {
        if (!((Boolean) this.isDestroyed.invoke()).booleanValue()) {
            this.mainThreadHandler.post(new t30(this, 1));
        }
    }

    /* access modifiers changed from: private */
    public static final void mute$lambda$4(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener2 = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener2 != null) {
            try {
                onMuteListener2.onMute(true);
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise mute event", th);
            }
        }
    }

    private final void muteForever() {
        if (!((Boolean) this.isDestroyed.invoke()).booleanValue()) {
            this.mainThreadHandler.post(new t30(this, 0));
        }
    }

    /* access modifiers changed from: private */
    public static final void muteForever$lambda$6(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener2 = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener2 != null) {
            try {
                onMuteListener2.onMutedForever();
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise mute forever event", th);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void requestFocus$lambda$0(AudioFocusRequestHelper audioFocusRequestHelper, int i) {
        audioFocusRequestHelper.logger.d(TAG, i != -3 ? i != -2 ? i != -1 ? i != 1 ? String.valueOf(i) : "AUDIOFOCUS_GAIN" : "AUDIOFOCUS_LOSS" : "AUDIOFOCUS_LOSS_TRANSIENT" : "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
        if (i == -3 || i == -2) {
            handleFocusUpdate$default(audioFocusRequestHelper, false, false, 2, (Object) null);
        } else if (i == -1) {
            audioFocusRequestHelper.handleFocusUpdate(false, true);
        } else if (i != 1) {
            Logger logger2 = audioFocusRequestHelper.logger;
            logger2.e(TAG, "Unexpected audio focus change " + i);
        } else {
            handleFocusUpdate$default(audioFocusRequestHelper, true, false, 2, (Object) null);
        }
    }

    private final void unmute() {
        if (!((Boolean) this.isDestroyed.invoke()).booleanValue()) {
            this.mainThreadHandler.post(new t30(this, 2));
        }
    }

    /* access modifiers changed from: private */
    public static final void unmute$lambda$8(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener2 = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener2 != null) {
            try {
                onMuteListener2.onMute(false);
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise unmute event", th);
            }
        }
    }

    public final void releaseFocus() {
        try {
            AudioFocusRequest audioFocusRequest2 = this.audioFocusRequest;
            if (audioFocusRequest2 != null) {
                this.audioManager.abandonAudioFocusRequest(audioFocusRequest2);
            }
        } catch (Throwable th) {
            this.logger.e(TAG, "Error while releasing audio focus request", th);
        }
        this.audioFocusRequest = null;
        this.isFocusGained = false;
    }

    public final void requestFocus() {
        if (this.isFocusGained) {
            this.logger.d(TAG, "Focus is already gained, ignore request");
            return;
        }
        releaseFocus();
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAcceptsDelayedFocusGain(false).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setOnAudioFocusChangeListener(new u30(this), this.workerThreadHandler).build();
        AudioFocusRequest audioFocusRequest2 = null;
        try {
            if (this.audioManager.requestAudioFocus(build) == 1) {
                handleFocusUpdate$default(this, true, false, 2, (Object) null);
                this.logger.d(TAG, "Audio focus request granted");
            } else {
                this.logger.d(TAG, "Audio focus request failed");
                handleFocusUpdate$default(this, false, false, 2, (Object) null);
                build = null;
            }
            audioFocusRequest2 = build;
        } catch (Throwable th) {
            this.logger.e(TAG, "Audio focus request failed with error", th);
            handleFocusUpdate$default(this, false, false, 2, (Object) null);
        }
        this.audioFocusRequest = audioFocusRequest2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AudioFocusRequestHelper(android.media.AudioManager r12, ru.ok.android.externcalls.sdk.audio.CallsAudioManager.OnMuteListener r13, android.os.Handler r14, android.os.Handler r15, s16 r16, ru.ok.android.externcalls.sdk.audio.Logger r17, s16 r18, s16 r19, int r20, x54 r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 64
            if (r1 == 0) goto L_0x000a
            ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper$1 r1 = ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper.AnonymousClass1.INSTANCE
            r9 = r1
            goto L_0x000c
        L_0x000a:
            r9 = r18
        L_0x000c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0014
            ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper$2 r0 = ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper.AnonymousClass2.INSTANCE
            r10 = r0
            goto L_0x0016
        L_0x0014:
            r10 = r19
        L_0x0016:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper.<init>(android.media.AudioManager, ru.ok.android.externcalls.sdk.audio.CallsAudioManager$OnMuteListener, android.os.Handler, android.os.Handler, s16, ru.ok.android.externcalls.sdk.audio.Logger, s16, s16, int, x54):void");
    }
}
