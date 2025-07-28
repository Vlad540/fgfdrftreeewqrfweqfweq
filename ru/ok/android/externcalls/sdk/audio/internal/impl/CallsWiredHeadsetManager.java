package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.view.KeyEvent;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.Logger;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 62\u00020\u0001:\u000267B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0007¢\u0006\u0004\b&\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00104\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager;", "", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;", "callsAudioManager", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "<init>", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Landroid/content/Intent;", "intent", "Ljue;", "onReceiveBroadcast", "(Landroid/content/BroadcastReceiver;Landroid/content/Intent;)V", "handleHeadsetPlugAction", "(Landroid/content/Intent;)V", "", "plugged", "action", "updateWiredHeadsetState", "(ZLandroid/content/Intent;)V", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "getWiredHeadsetStateSdk27", "()Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "", "pluggedDevicePort", "getWiredHeadsetStateSdk28", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "", "Landroid/media/AudioDeviceInfo;", "devices", "getDeviceNameByPortName", "(Ljava/lang/String;[Landroid/media/AudioDeviceInfo;)Ljava/lang/String;", "start", "()V", "stop", "Landroid/content/Context;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "wiredHeadsetState", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "headsetReceiver", "Landroid/content/BroadcastReceiver;", "getConnectedDeviceName", "()Ljava/lang/String;", "connectedDeviceName", "isWiredHeadsetPlugged", "()Z", "Companion", "WiredHeadsetState", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
public final class CallsWiredHeadsetManager {
    public static final Companion Companion = new Companion((x54) null);
    private static final String LOG_TAG = "CallsWiredHeadsetManager";
    private final AudioManager audioManager;
    private final CallsAudioManagerV2Impl callsAudioManager;
    private final Context context;
    private final BroadcastReceiver headsetReceiver;
    private final Logger logger;
    private volatile WiredHeadsetState wiredHeadsetState = WiredHeadsetState.None.INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$Companion;", "", "()V", "LOG_TAG", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "", "None", "Plugged", "Unplugged", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$None;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Plugged;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Unplugged;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface WiredHeadsetState {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$None;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class None implements WiredHeadsetState {
            public static final None INSTANCE = new None();

            private None() {
            }

            public String toString() {
                return "Uninitialized";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Plugged;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Plugged implements WiredHeadsetState {
            private final String name;

            public Plugged() {
                this((String) null, 1, (x54) null);
            }

            public static /* synthetic */ Plugged copy$default(Plugged plugged, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = plugged.name;
                }
                return plugged.copy(str);
            }

            public final String component1() {
                return this.name;
            }

            public final Plugged copy(String str) {
                return new Plugged(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Plugged) && hhd.f(this.name, ((Plugged) obj).name);
            }

            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode();
            }

            public String toString() {
                return wn6.i("Plugged(name=", this.name, ")");
            }

            public Plugged(String str) {
                this.name = str;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Plugged(String str, int i, x54 x54) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState$Unplugged;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$WiredHeadsetState;", "()V", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Unplugged implements WiredHeadsetState {
            public static final Unplugged INSTANCE = new Unplugged();

            private Unplugged() {
            }

            public String toString() {
                return "Unplugged";
            }
        }
    }

    public CallsWiredHeadsetManager(Context context2, CallsAudioManagerV2Impl callsAudioManagerV2Impl, Logger logger2) {
        this.context = context2;
        this.callsAudioManager = callsAudioManagerV2Impl;
        this.logger = logger2;
        this.audioManager = (AudioManager) context2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.headsetReceiver = new CallsWiredHeadsetManager$headsetReceiver$1(this);
    }

    @TargetApi(23)
    private final String getDeviceNameByPortName(String str, AudioDeviceInfo[] audioDeviceInfoArr) {
        String str2 = CallsAudioDeviceInfo.WIRED_HEADPHONES;
        if (str == null) {
            return str2;
        }
        this.logger.v(LOG_TAG, "Looking for a used wired device using port name ".concat(str));
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AudioDeviceInfo audioDeviceInfo = audioDeviceInfoArr[i];
            if (hhd.f(audioDeviceInfo.getProductName(), str)) {
                int type = audioDeviceInfo.getType();
                if (type == 3) {
                    str2 = CallsAudioDeviceInfo.WIRED_HEADSET;
                } else if (type == 11 || type == 22) {
                    str2 = CallsAudioDeviceInfo.USB_HEADSET;
                }
                Logger logger2 = this.logger;
                logger2.v(LOG_TAG, "Matching device found " + audioDeviceInfo);
            } else {
                i++;
            }
        }
        return str2;
    }

    private final WiredHeadsetState getWiredHeadsetStateSdk27() {
        return this.audioManager.isWiredHeadsetOn() ? new WiredHeadsetState.Plugged("") : WiredHeadsetState.Unplugged.INSTANCE;
    }

    @TargetApi(28)
    private final WiredHeadsetState getWiredHeadsetStateSdk28(String str) {
        try {
            AudioDeviceInfo[] devices = this.audioManager.getDevices(2);
            int length = devices.length;
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                if (i < length) {
                    int type = devices[i].getType();
                    if (type == 3) {
                        z2 = true;
                    } else if (type == 4) {
                        z3 = true;
                    } else if (type == 11 || type == 22) {
                        z = true;
                    }
                    if (z && z2 && z3) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            this.logger.v(LOG_TAG, "Wired device connectivity check: usb=" + z + " headset=" + z2 + " phones=" + z3);
            if (!z && !z3) {
                if (!z2) {
                    return WiredHeadsetState.Unplugged.INSTANCE;
                }
            }
            return new WiredHeadsetState.Plugged(((z2 || z3) && z) ? getDeviceNameByPortName(str, devices) : z ? CallsAudioDeviceInfo.USB_HEADSET : z2 ? CallsAudioDeviceInfo.WIRED_HEADSET : CallsAudioDeviceInfo.WIRED_HEADPHONES);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't detect audio device name", th);
            return WiredHeadsetState.Unplugged.INSTANCE;
        }
    }

    private final void handleHeadsetPlugAction(Intent intent) {
        int intExtra = intent.getIntExtra("state", -1);
        boolean z = true;
        if (intExtra == 0 || intExtra == 1) {
            if (intExtra != 1) {
                z = false;
            }
            updateWiredHeadsetState(z, intent);
            return;
        }
        this.logger.e(LOG_TAG, "unknown headset state received");
    }

    /* access modifiers changed from: private */
    public final void onReceiveBroadcast(BroadcastReceiver broadcastReceiver, Intent intent) {
        KeyEvent keyEvent;
        Logger logger2 = this.logger;
        logger2.v(LOG_TAG, "CAM got " + intent);
        String action = intent.getAction();
        if ("android.intent.action.HEADSET_PLUG".equals(action)) {
            handleHeadsetPlugAction(intent);
        } else if ("android.intent.action.MEDIA_BUTTON".equals(action) && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 5 || keyCode == 6 || keyCode == 79 || keyCode == 126 || keyCode == 127) {
                try {
                    broadcastReceiver.abortBroadcast();
                } catch (Exception e) {
                    Logger logger3 = this.logger;
                    logger3.e(LOG_TAG, "onReceiveBroadcast: failed to abort broadcast, e: " + e);
                }
            }
        }
    }

    private final void updateWiredHeadsetState(boolean z, Intent intent) {
        String stringExtra = intent.getStringExtra("name");
        String stringExtra2 = intent.getStringExtra("portName");
        boolean z2 = intent.getIntExtra("microphone", 0) == 1;
        if (z) {
            Logger logger2 = this.logger;
            StringBuilder j = c3d.j("Wired device plugged: name=", stringExtra, " port=", stringExtra2, " hasMic=");
            j.append(z2);
            logger2.v(LOG_TAG, j.toString());
        } else {
            Logger logger3 = this.logger;
            StringBuilder j2 = c3d.j("Wired device unplugged: name=", stringExtra, " port=", stringExtra2, " hasMic=");
            j2.append(z2);
            logger3.v(LOG_TAG, j2.toString());
        }
        if (!z) {
            stringExtra2 = null;
        }
        this.wiredHeadsetState = getWiredHeadsetStateSdk28(stringExtra2);
        if (this.wiredHeadsetState instanceof WiredHeadsetState.Plugged) {
            this.callsAudioManager.setSpeakerEnabled$calls_audiomanager_release(false, false);
        } else {
            CallsAudioManagerV2Impl.selectPreferredAudioDevice$calls_audiomanager_release$default(this.callsAudioManager, false, 1, (Object) null);
        }
    }

    public final String getConnectedDeviceName() {
        WiredHeadsetState wiredHeadsetState2 = this.wiredHeadsetState;
        return wiredHeadsetState2 instanceof WiredHeadsetState.Plugged ? ((WiredHeadsetState.Plugged) wiredHeadsetState2).getName() : "";
    }

    public final boolean isWiredHeadsetPlugged() {
        return this.wiredHeadsetState instanceof WiredHeadsetState.Plugged;
    }

    public final void start() {
        this.logger.v(LOG_TAG, "start tracking headset");
        if (!(this.wiredHeadsetState instanceof WiredHeadsetState.None)) {
            this.logger.e(LOG_TAG, "already started, ignore");
            return;
        }
        this.wiredHeadsetState = WiredHeadsetState.Unplugged.INSTANCE;
        this.context.registerReceiver(this.headsetReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"), (String) null, this.callsAudioManager.getWorkerThreadHandler$calls_audiomanager_release());
    }

    public final void stop() {
        this.logger.v(LOG_TAG, "stop tracking headset");
        if (this.wiredHeadsetState instanceof WiredHeadsetState.None) {
            this.logger.e(LOG_TAG, "already stopped, ignore");
            return;
        }
        this.wiredHeadsetState = WiredHeadsetState.None.INSTANCE;
        this.context.unregisterReceiver(this.headsetReceiver);
    }
}
