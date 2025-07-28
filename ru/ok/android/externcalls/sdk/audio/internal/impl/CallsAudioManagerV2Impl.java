package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.audio.AudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u0000 ±\u00012\u00020\u00012\u00020\u0002:\u0002±\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b!\u0010\"J=\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0017¢\u0006\u0004\b%\u0010&J=\u0010(\u001a\u00020\u00162\u0006\u0010$\u001a\u00020'2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0017¢\u0006\u0004\b(\u0010)JE\u0010,\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0017¢\u0006\u0004\b,\u0010-J5\u0010.\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018H\u0017¢\u0006\u0004\b.\u0010/J7\u00101\u001a\u00020\u00162\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018H\u0017¢\u0006\u0004\b1\u00102J7\u00103\u001a\u00020\u00162\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018H\u0017¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u0016H\u0016¢\u0006\u0004\b4\u0010\u001eJ\u0019\u00108\u001a\u00020\u00162\b\b\u0002\u00105\u001a\u00020\u0007H\u0001¢\u0006\u0004\b6\u00107J\u0017\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b=\u0010<J\u001f\u0010@\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0001¢\u0006\u0004\b>\u0010?J\u000f\u0010B\u001a\u00020\u0016H\u0001¢\u0006\u0004\bA\u0010\u001eJO\u0010H\u001a\u00020\u00162\u0006\u0010D\u001a\u00020C2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00182\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0001¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00162\u0006\u0010$\u001a\u00020'H\u0003¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0016H\u0003¢\u0006\u0004\bM\u0010\u001eJ\u0019\u0010N\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\bN\u0010\"J\u0017\u0010O\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\bO\u0010LJ\u0019\u0010Q\u001a\u00020\u00162\b\b\u0002\u0010P\u001a\u00020\u0007H\u0002¢\u0006\u0004\bQ\u00107J\u000f\u0010R\u001a\u00020\u0016H\u0002¢\u0006\u0004\bR\u0010\u001eJ\u000f\u0010S\u001a\u00020\u0016H\u0002¢\u0006\u0004\bS\u0010\u001eJ\u000f\u0010T\u001a\u00020\u0016H\u0003¢\u0006\u0004\bT\u0010\u001eJ\u0017\u0010W\u001a\u00020\u00162\u0006\u0010V\u001a\u00020UH\u0003¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0016H\u0003¢\u0006\u0004\bY\u0010\u001eJ\u000f\u0010Z\u001a\u00020\u0016H\u0003¢\u0006\u0004\bZ\u0010\u001eJ\u000f\u0010[\u001a\u00020\u0016H\u0003¢\u0006\u0004\b[\u0010\u001eJ\u000f\u0010\\\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\\\u0010\u001eJ\u0017\u0010^\u001a\u00020\u00162\u0006\u0010]\u001a\u00020\u0007H\u0003¢\u0006\u0004\b^\u00107J\u000f\u0010_\u001a\u00020\u0007H\u0003¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0007H\u0003¢\u0006\u0004\ba\u0010`J\u0017\u0010b\u001a\u00020\u00162\u0006\u0010:\u001a\u00020'H\u0003¢\u0006\u0004\bb\u0010JJ\u0017\u0010B\u001a\u00020\u00162\u0006\u0010c\u001a\u00020\u0007H\u0003¢\u0006\u0004\bB\u00107J\u000f\u0010d\u001a\u00020\u0016H\u0002¢\u0006\u0004\bd\u0010\u001eJ\u0017\u0010e\u001a\u00020\u00162\u0006\u0010:\u001a\u00020#H\u0003¢\u0006\u0004\be\u0010fJ#\u0010i\u001a\u00020'2\b\b\u0002\u0010g\u001a\u00020\u00072\b\b\u0002\u0010h\u001a\u00020\u0007H\u0003¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0016H\u0003¢\u0006\u0004\bk\u0010\u001eJ\u0017\u0010l\u001a\u00020#2\u0006\u0010:\u001a\u00020'H\u0003¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\u00162\u0006\u0010:\u001a\u00020#H\u0003¢\u0006\u0004\bn\u0010fJ\u0017\u0010o\u001a\u00020C2\u0006\u0010:\u001a\u00020'H\u0003¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\u00162\u0006\u0010q\u001a\u00020\u0007H\u0003¢\u0006\u0004\br\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010sR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010tR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010uR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010vR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010wR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0001\u001a\u000208\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010uR\u0019\u0010\u0001\u001a\u00020U8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010uR\u0018\u0010\u0001\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010uR\u0018\u0010\u0001\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010uR\u0018\u0010\u0001\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010uR\u0016\u0010\u0001\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010uR\u0017\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u0001R \u0010\u0001\u001a\t\u0012\u0004\u0012\u00020#0\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020'8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u0001098\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010uR\u001e\u0010\u0001\u001a\u00020|8\u0000X\u0004¢\u0006\u000f\n\u0005\b\u0001\u0010~\u001a\u0006\b\u0001\u0010\u0001R*\u0010¡\u0001\u001a\u00020#2\u0007\u0010 \u0001\u001a\u00020#8\u0016@RX\u000e¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001e\u0010­\u0001\u001a\t\u0012\u0004\u0012\u00020#0ª\u00018VX\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010®\u0001\u001a\u00020\u00078VX\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u0010`R\u0015\u0010_\u001a\u00020\u00078BX\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010`R\u0015\u0010a\u001a\u00020\u00078BX\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010`¨\u0006²\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$Listener;", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "proximityTracker", "", "trackProximityWhenSpeakerEnabled", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "audioDeviceSelector", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "onMuteListener", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "<init>", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/audio/ProximityTracker;ZLru/ok/android/externcalls/sdk/audio/VideoTracker;Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "state", "Lkotlin/Function0;", "Ljue;", "onComplete", "Lkotlin/Function1;", "", "onError", "changeStateAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;Ls16;Lu16;)V", "notifyBluetoothPermissionGranted", "()V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "listener", "setOnAudioDeviceChangeListener", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "audioDevice", "setAudioDeviceAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "setAudioDeviceTypeAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;Ls16;Lu16;)V", "enabled", "byVideoTurnedOn", "setSpeakerEnabledAsync", "(ZZLs16;Lu16;)V", "releaseAsync", "(Ls16;Lu16;)V", "onSuccess", "hasWiredHeadsetAsync", "(Lu16;Lu16;)V", "hasBluetoothHeadsetAsync", "requestAudioFocusAsync", "withBluetooth", "selectPreferredAudioDevice$calls_audiomanager_release", "(Z)V", "selectPreferredAudioDevice", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;", "device", "onDeviceAvailable", "(Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;)Z", "onDeviceUnavailable", "setSpeakerEnabled$calls_audiomanager_release", "(ZZ)V", "setSpeakerEnabled", "updateAudioDeviceState$calls_audiomanager_release", "updateAudioDeviceState", "", "action", "block", "doOnOwnThread$calls_audiomanager_release", "(Ljava/lang/String;Ls16;Lu16;Ls16;)V", "doOnOwnThread", "setAudioDevice", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)V", "changeState", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;)V", "maybeRestartBluetoothManager", "setOnAudioDeviceChangeListenerImpl", "onCallStateChangedInternal", "byStopRinging", "autoSelectAudioDevice", "requestAudioFocus", "releaseAudioFocus", "release", "", "mode", "setAudioManagerModeSafe", "(I)V", "clearDeviceSelection", "startTrackingAudioDevices", "savePreviousState", "restorePreviousAudioState", "speakerOn", "updateProximityTrackingState", "hasBluetoothHeadset", "()Z", "hasWiredHeadset", "selectAudioDevice", "preferSelectedDevice", "applySelectedDevice", "reportAudioDeviceOnMainThread", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)V", "bluetooth", "respectSpeakerEnabled", "getPreferredAudioDevice", "(ZZ)Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "updateAvailableAudioDevices", "getDeviceInfo", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "setAudioDeviceInternal", "getAudioDeviceReadableName", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Ljava/lang/String;", "isMute", "mute", "Landroid/content/Context;", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "Z", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "Lru/ok/android/externcalls/sdk/audio/AudioDeviceSelector;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "Landroid/os/HandlerThread;", "backgroundHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;", "bluetoothManager", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluetoothManager;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager;", "wiredHeadsetManager", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "savedPreviousState", "savedAudioMode", "I", "savedIsSpeakerPhoneOn", "savedIsMicrophoneMute", "disabledBluetoothOnce", "disabledSpeakerOnce", "hasEarpiece", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "", "audioDevices", "Ljava/util/Set;", "reportedAudioDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "selectedDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "bluetoothDeviceIntent", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$BluetoothDeviceIntent;", "onAudioDeviceChangeListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "isDestroyed", "workerThreadHandler", "getWorkerThreadHandler$calls_audiomanager_release", "()Landroid/os/Handler;", "<set-?>", "currentDevice", "getCurrentDevice", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner;", "bluetoothDeviceScanner", "Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner;", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "audioFocusRequestHelper", "Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "", "getAvailableAudioDevices", "()Ljava/util/List;", "availableAudioDevices", "isHeadsetConnected", "getHasBluetoothHeadset", "getHasWiredHeadset", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
public final class CallsAudioManagerV2Impl implements CallsAudioManager, CallsBluethoothDeviceScanner.Listener {
    public static final Companion Companion = new Companion((x54) null);
    private static final String LOG_TAG = "CallsAudioManagerV2";
    private static final CallsAudioDeviceInfo NO_DEVICE = new CallsAudioDeviceInfo(CallsAudioManager.AudioDeviceType.NONE, "");
    private final AudioDeviceSelector audioDeviceSelector;
    private volatile Set<CallsAudioDeviceInfo> audioDevices = new LinkedHashSet();
    private final AudioFocusRequestHelper audioFocusRequestHelper;
    private final AudioManager audioManager;
    private final HandlerThread backgroundHandlerThread;
    private CallsBluethoothDeviceScanner.BluetoothDeviceIntent bluetoothDeviceIntent;
    private final CallsBluethoothDeviceScanner bluetoothDeviceScanner;
    private final CallsBluetoothManager bluetoothManager;
    private final Context context;
    private volatile CallsAudioDeviceInfo currentDevice;
    private boolean disabledBluetoothOnce;
    private boolean disabledSpeakerOnce;
    private final boolean hasEarpiece;
    /* access modifiers changed from: private */
    public volatile boolean isDestroyed;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final Handler mainHandler;
    private volatile CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceChangeListener;
    private final ProximityTracker proximityTracker;
    private CallsAudioDeviceInfo reportedAudioDevice;
    private int savedAudioMode;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private boolean savedPreviousState;
    private CallsAudioManager.AudioDeviceType selectedDevice;
    private CallsAudioManager.State state = CallsAudioManager.State.IDLE;
    private final boolean trackProximityWhenSpeakerEnabled;
    private final VideoTracker videoTracker;
    private final CallsWiredHeadsetManager wiredHeadsetManager;
    private final Handler workerThreadHandler;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/impl/CallsAudioManagerV2Impl$Companion;", "", "()V", "LOG_TAG", "", "NO_DEVICE", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0054 */
        static {
            /*
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State[] r0 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r2 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.IDLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r3 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.RINGING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r4 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.DIALING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$State r5 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.State.CONVERSATION     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType[] r0 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.AudioDeviceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r5 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.AudioDeviceType.BLUETOOTH     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.AudioDeviceType.WIRED_HEADSET     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.AudioDeviceType.EARPIECE     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.AudioDeviceType.SPEAKER_PHONE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioManager.AudioDeviceType.BLUETOOTH_INTENT     // Catch:{ NoSuchFieldError -> 0x005d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl.WhenMappings.<clinit>():void");
        }
    }

    public CallsAudioManagerV2Impl(Context context2, ProximityTracker proximityTracker2, boolean z, VideoTracker videoTracker2, AudioDeviceSelector audioDeviceSelector2, CallsAudioManager.OnMuteListener onMuteListener, Logger logger2) {
        Logger logger3 = logger2;
        this.context = context2;
        this.proximityTracker = proximityTracker2;
        this.trackProximityWhenSpeakerEnabled = z;
        this.videoTracker = videoTracker2;
        this.audioDeviceSelector = audioDeviceSelector2;
        this.logger = logger3;
        HandlerThread handlerThread = new HandlerThread("CallsAudioManagerThread");
        this.backgroundHandlerThread = handlerThread;
        CallsAudioDeviceInfo callsAudioDeviceInfo = NO_DEVICE;
        this.reportedAudioDevice = callsAudioDeviceInfo;
        this.selectedDevice = CallsAudioManager.AudioDeviceType.NONE;
        this.currentDevice = callsAudioDeviceInfo;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.workerThreadHandler = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.mainHandler = handler2;
        this.bluetoothManager = new CallsBluetoothManager(context2, this, logger3);
        this.wiredHeadsetManager = new CallsWiredHeadsetManager(context2, this, logger3);
        AudioManager audioManager2 = (AudioManager) context2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.audioManager = audioManager2;
        CallsBluethoothDeviceScanner callsBluethoothDeviceScanner = new CallsBluethoothDeviceScanner(handler, this);
        callsBluethoothDeviceScanner.start(audioManager2);
        this.bluetoothDeviceScanner = callsBluethoothDeviceScanner;
        this.hasEarpiece = context2.getPackageManager().hasSystemFeature("android.hardware.telephony");
        this.audioFocusRequestHelper = new AudioFocusRequestHelper(audioManager2, onMuteListener, handler2, handler, new s16(this) {
            final /* synthetic */ CallsAudioManagerV2Impl this$0;

            {
                this.this$0 = r1;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.isDestroyed);
            }
        }, logger2, (s16) null, (s16) null, 192, (x54) null);
        logger3.v(LOG_TAG, "CAM is created");
    }

    private final void applySelectedDevice() {
        CallsAudioDeviceInfo deviceInfo = getDeviceInfo(this.selectedDevice);
        reportAudioDeviceOnMainThread(deviceInfo);
        if (!hhd.f(getCurrentDevice(), deviceInfo)) {
            setAudioDeviceInternal(deviceInfo);
        }
    }

    private final void autoSelectAudioDevice(boolean z) {
        selectAudioDevice(getPreferredAudioDevice(true, !z));
    }

    public static /* synthetic */ void autoSelectAudioDevice$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        callsAudioManagerV2Impl.autoSelectAudioDevice(z);
    }

    /* access modifiers changed from: private */
    public final void changeState(CallsAudioManager.State state2) {
        if (!this.isDestroyed) {
            Logger logger2 = this.logger;
            logger2.v(LOG_TAG, "requested " + state2);
            onCallStateChangedInternal(state2);
        }
    }

    private final void clearDeviceSelection() {
        this.logger.v(LOG_TAG, "clearing device");
        this.currentDevice = NO_DEVICE;
        this.selectedDevice = CallsAudioManager.AudioDeviceType.NONE;
        this.audioDevices.clear();
    }

    public static /* synthetic */ void doOnOwnThread$calls_audiomanager_release$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, String str, s16 s16, u16 u16, s16 s162, int i, Object obj) {
        if ((i & 2) != 0) {
            s16 = null;
        }
        if ((i & 4) != 0) {
            u16 = null;
        }
        callsAudioManagerV2Impl.doOnOwnThread$calls_audiomanager_release(str, s16, u16, s162);
    }

    /* access modifiers changed from: private */
    public static final void doOnOwnThread$lambda$8(CallsAudioManagerV2Impl callsAudioManagerV2Impl, s16 s16, s16 s162, String str, u16 u16) {
        if (!callsAudioManagerV2Impl.isDestroyed) {
            try {
                s16.invoke();
                if (s162 != null) {
                    s162.invoke();
                }
            } catch (Throwable th) {
                callsAudioManagerV2Impl.logger.e(LOG_TAG, "Error executing an action ".concat(str), th);
                if (u16 != null) {
                    u16.invoke(th);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r1 = r1.getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getAudioDeviceReadableName(ru.ok.android.externcalls.sdk.audio.CallsAudioManager.AudioDeviceType r2) {
        /*
            r1 = this;
            int[] r0 = ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl.WhenMappings.$EnumSwitchMapping$1
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L_0x0034
            r0 = 2
            if (r2 == r0) goto L_0x002d
            r0 = 3
            if (r2 == r0) goto L_0x002a
            r0 = 4
            if (r2 == r0) goto L_0x0027
            r0 = 5
            if (r2 == r0) goto L_0x001a
            java.lang.String r1 = ""
            goto L_0x003a
        L_0x001a:
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner$BluetoothDeviceIntent r1 = r1.bluetoothDeviceIntent
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = r1.getName()
            if (r1 != 0) goto L_0x003a
        L_0x0024:
            java.lang.String r1 = "wireless headset"
            goto L_0x003a
        L_0x0027:
            java.lang.String r1 = "speakerphone"
            goto L_0x003a
        L_0x002a:
            java.lang.String r1 = "earpiece"
            goto L_0x003a
        L_0x002d:
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsWiredHeadsetManager r1 = r1.wiredHeadsetManager
            java.lang.String r1 = r1.getConnectedDeviceName()
            goto L_0x003a
        L_0x0034:
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluetoothManager r1 = r1.bluetoothManager
            java.lang.String r1 = r1.getConnectedDeviceName()
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl.getAudioDeviceReadableName(ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType):java.lang.String");
    }

    private final CallsAudioDeviceInfo getDeviceInfo(CallsAudioManager.AudioDeviceType audioDeviceType) {
        return new CallsAudioDeviceInfo(audioDeviceType, getAudioDeviceReadableName(audioDeviceType));
    }

    private final boolean getHasBluetoothHeadset() {
        return this.bluetoothManager.getHasBluetoothHeadset();
    }

    private final boolean getHasWiredHeadset() {
        return this.wiredHeadsetManager.isWiredHeadsetPlugged();
    }

    private final CallsAudioManager.AudioDeviceType getPreferredAudioDevice(boolean z, boolean z2) {
        AudioDeviceSelector audioDeviceSelector2 = this.audioDeviceSelector;
        CallsAudioManager.State state2 = this.state;
        boolean hasWiredHeadset = getHasWiredHeadset();
        boolean z3 = this.hasEarpiece;
        boolean z4 = this.disabledSpeakerOnce;
        boolean z5 = this.disabledBluetoothOnce;
        Set<CallsAudioDeviceInfo> set = this.audioDevices;
        ArrayList arrayList = new ArrayList(q23.H(set, 10));
        for (CallsAudioDeviceInfo deviceType : set) {
            arrayList.add(deviceType.getDeviceType());
        }
        return audioDeviceSelector2.selectPreferableDevice(state2, z, z2, hasWiredHeadset, z3, z4, z5, o23.w0(arrayList), getCurrentDevice().getDeviceType(), this.videoTracker, this.proximityTracker);
    }

    public static /* synthetic */ CallsAudioManager.AudioDeviceType getPreferredAudioDevice$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return callsAudioManagerV2Impl.getPreferredAudioDevice(z, z2);
    }

    /* access modifiers changed from: private */
    public final boolean hasBluetoothHeadset() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        return (Build.VERSION.SDK_INT < 31 || d8.d(this.context, "android.permission.BLUETOOTH_CONNECT") == 0) && defaultAdapter.getProfileConnectionState(1) == 2;
    }

    /* access modifiers changed from: private */
    public final boolean hasWiredHeadset() {
        return this.wiredHeadsetManager.isWiredHeadsetPlugged();
    }

    /* access modifiers changed from: private */
    public final void maybeRestartBluetoothManager() {
        if (!this.isDestroyed) {
            this.bluetoothManager.start();
        }
    }

    private final void mute(boolean z) {
    }

    private final void onCallStateChangedInternal(CallsAudioManager.State state2) {
        if (!this.isDestroyed) {
            boolean z = this.state == CallsAudioManager.State.RINGING && state2 == CallsAudioManager.State.CONVERSATION;
            this.state = state2;
            int i = WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
            if (i == 1) {
                release();
            } else if (i == 2 || i == 3 || i == 4) {
                if (this.audioManager.getMode() != 3) {
                    savePreviousState();
                    requestAudioFocus();
                    startTrackingAudioDevices();
                    autoSelectAudioDevice$default(this, false, 1, (Object) null);
                    setAudioManagerModeSafe(3);
                }
                if (z) {
                    autoSelectAudioDevice(true);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void release() {
        if (!this.isDestroyed) {
            this.logger.v(LOG_TAG, "release CAM");
            this.isDestroyed = true;
            this.proximityTracker.stopTrackingProximity();
            this.wiredHeadsetManager.stop();
            this.bluetoothManager.stop();
            this.bluetoothDeviceScanner.stop();
            clearDeviceSelection();
            restorePreviousAudioState();
            releaseAudioFocus();
            this.backgroundHandlerThread.quitSafely();
        }
    }

    private final void releaseAudioFocus() {
        this.audioFocusRequestHelper.releaseFocus();
    }

    private final void reportAudioDeviceOnMainThread(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.mainHandler.post(new c(this, 18, callsAudioDeviceInfo));
    }

    /* access modifiers changed from: private */
    public static final void reportAudioDeviceOnMainThread$lambda$4(CallsAudioManagerV2Impl callsAudioManagerV2Impl, CallsAudioDeviceInfo callsAudioDeviceInfo) {
        CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener = callsAudioManagerV2Impl.onAudioDeviceChangeListener;
        if (!hhd.f(callsAudioManagerV2Impl.reportedAudioDevice, callsAudioDeviceInfo) && onAudioDeviceInfoChangeListener != null) {
            Logger logger2 = callsAudioManagerV2Impl.logger;
            CallsAudioDeviceInfo callsAudioDeviceInfo2 = callsAudioManagerV2Impl.reportedAudioDevice;
            logger2.v(LOG_TAG, "reporting device change " + callsAudioDeviceInfo2 + " -> " + callsAudioDeviceInfo);
            onAudioDeviceInfoChangeListener.onAudioDeviceChanged(new CallsAudioManager.AudioDeviceInfoChangedEvent(callsAudioManagerV2Impl.reportedAudioDevice, callsAudioDeviceInfo));
            callsAudioManagerV2Impl.reportedAudioDevice = callsAudioDeviceInfo;
        }
    }

    /* access modifiers changed from: private */
    public final void requestAudioFocus() {
        this.audioFocusRequestHelper.requestFocus();
    }

    private final void restorePreviousAudioState() {
        if (this.savedPreviousState) {
            this.logger.v(LOG_TAG, "restoring state");
            this.savedPreviousState = false;
            try {
                AudioManager audioManager2 = this.audioManager;
                audioManager2.setMode(this.savedAudioMode);
                audioManager2.setSpeakerphoneOn(this.savedIsSpeakerPhoneOn);
                audioManager2.setMicrophoneMute(this.savedIsMicrophoneMute);
            } catch (Exception e) {
                this.logger.reportError(LOG_TAG, "restorePreviousAudioState: failed", e);
            }
        }
    }

    private final void savePreviousState() {
        if (!this.savedPreviousState) {
            this.logger.v(LOG_TAG, "saving state");
            try {
                AudioManager audioManager2 = this.audioManager;
                this.savedAudioMode = audioManager2.getMode();
                this.savedIsSpeakerPhoneOn = audioManager2.isSpeakerphoneOn();
                this.savedIsMicrophoneMute = audioManager2.isMicrophoneMute();
                this.savedPreviousState = true;
            } catch (Exception e) {
                this.logger.reportError(LOG_TAG, "savePreviousState: failed", e);
            }
        }
    }

    private final void selectAudioDevice(CallsAudioManager.AudioDeviceType audioDeviceType) {
        T t;
        if (audioDeviceType == CallsAudioManager.AudioDeviceType.BLUETOOTH_INTENT) {
            Logger logger2 = this.logger;
            logger2.e(LOG_TAG, "device " + audioDeviceType + " can never be selected. use it as trigger for permission request");
            return;
        }
        Logger logger3 = this.logger;
        logger3.v(LOG_TAG, "selecting " + audioDeviceType);
        Iterator<T> it = this.audioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((CallsAudioDeviceInfo) t).getDeviceType() == audioDeviceType) {
                break;
            }
        }
        if (t == null) {
            Logger logger4 = this.logger;
            Set<CallsAudioDeviceInfo> set = this.audioDevices;
            logger4.e(LOG_TAG, "can't select " + audioDeviceType + " from available " + set);
        }
        this.selectedDevice = audioDeviceType;
        updateAudioDeviceState(true);
    }

    public static /* synthetic */ void selectPreferredAudioDevice$calls_audiomanager_release$default(CallsAudioManagerV2Impl callsAudioManagerV2Impl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        callsAudioManagerV2Impl.selectPreferredAudioDevice$calls_audiomanager_release(z);
    }

    /* access modifiers changed from: private */
    public final void setAudioDevice(CallsAudioManager.AudioDeviceType audioDeviceType) {
        CallsAudioManager.AudioDeviceType deviceType;
        Logger logger2 = this.logger;
        logger2.v(LOG_TAG, "requested " + audioDeviceType);
        if (!this.isDestroyed && audioDeviceType != (deviceType = getCurrentDevice().getDeviceType())) {
            boolean z = this.disabledBluetoothOnce;
            CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
            this.disabledBluetoothOnce = z | (deviceType == audioDeviceType2);
            boolean z2 = this.disabledSpeakerOnce;
            CallsAudioManager.AudioDeviceType audioDeviceType3 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            this.disabledSpeakerOnce = z2 | (deviceType == audioDeviceType3);
            CallsAudioManager.AudioDeviceType audioDeviceType4 = CallsAudioManager.AudioDeviceType.NONE;
            if (deviceType == audioDeviceType4) {
                mute(false);
            }
            if (audioDeviceType.oneOf(audioDeviceType3, CallsAudioManager.AudioDeviceType.WIRED_HEADSET, CallsAudioManager.AudioDeviceType.EARPIECE, audioDeviceType2)) {
                selectAudioDevice(audioDeviceType);
            }
            if (audioDeviceType == audioDeviceType4) {
                mute(true);
            }
        }
    }

    private final void setAudioDeviceInternal(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        Logger logger2 = this.logger;
        logger2.v(LOG_TAG, "Setting " + callsAudioDeviceInfo);
        if (!this.isDestroyed) {
            this.currentDevice = callsAudioDeviceInfo;
            boolean z = callsAudioDeviceInfo.getDeviceType() == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
            AudioManager audioManager2 = this.audioManager;
            if (audioManager2.isSpeakerphoneOn() != z) {
                audioManager2.setSpeakerphoneOn(z);
            }
            updateProximityTrackingState(z);
        }
    }

    private final void setAudioManagerModeSafe(int i) {
        try {
            this.audioManager.setMode(i);
        } catch (Throwable th) {
            this.logger.reportError(LOG_TAG, "Can't set audio manager mode", th);
        }
    }

    /* access modifiers changed from: private */
    public final void setOnAudioDeviceChangeListenerImpl(CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        if (!this.isDestroyed) {
            this.onAudioDeviceChangeListener = onAudioDeviceInfoChangeListener;
            if (onAudioDeviceInfoChangeListener != null) {
                this.reportedAudioDevice = NO_DEVICE;
                reportAudioDeviceOnMainThread(getCurrentDevice());
            }
        }
    }

    private final void startTrackingAudioDevices() {
        this.logger.v(LOG_TAG, "start tracking devices");
        clearDeviceSelection();
        this.wiredHeadsetManager.start();
        this.bluetoothManager.start();
        updateAudioDeviceState(false);
    }

    private final void updateAudioDeviceState(boolean z) {
        CallsAudioManager.AudioDeviceType audioDeviceType;
        Logger logger2 = this.logger;
        logger2.v(LOG_TAG, "Updating device, prefer selection is " + z + "...");
        boolean hasBluetoothHeadset = this.bluetoothManager.getHasBluetoothHeadset();
        CallsAudioManager.AudioDeviceType deviceType = getCurrentDevice().getDeviceType();
        CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.BLUETOOTH;
        if (deviceType == audioDeviceType2 && !hasBluetoothHeadset) {
            this.logger.v(LOG_TAG, "BT is down, reselect");
            this.selectedDevice = getPreferredAudioDevice(false, false);
        }
        if (hasBluetoothHeadset && !z && (audioDeviceType = this.selectedDevice) != audioDeviceType2 && audioDeviceType != CallsAudioManager.AudioDeviceType.WIRED_HEADSET && !this.disabledBluetoothOnce) {
            Logger logger3 = this.logger;
            logger3.v(LOG_TAG, "suddenly, BT. " + audioDeviceType + " -> " + audioDeviceType2);
            this.selectedDevice = audioDeviceType2;
        }
        updateAvailableAudioDevices();
        Logger logger4 = this.logger;
        CallsAudioManager.AudioDeviceType audioDeviceType3 = this.selectedDevice;
        logger4.v(LOG_TAG, "current selected device is " + audioDeviceType3);
        CallsAudioManager.AudioDeviceType audioDeviceType4 = this.selectedDevice;
        if (audioDeviceType4 == audioDeviceType2) {
            if (!this.bluetoothManager.isBluetoothOn() && !this.bluetoothManager.startScoAudio()) {
                CallsAudioManager.AudioDeviceType preferredAudioDevice = getPreferredAudioDevice(false, true);
                this.selectedDevice = preferredAudioDevice;
                Logger logger5 = this.logger;
                logger5.e(LOG_TAG, "failed to start bluetooth, so selected other preferred device: " + preferredAudioDevice);
            }
        } else if (audioDeviceType4 != CallsAudioManager.AudioDeviceType.NONE) {
            this.bluetoothManager.stopScoAudio();
        }
        applySelectedDevice();
    }

    private final void updateAvailableAudioDevices() {
        this.logger.v(LOG_TAG, "updating available devices");
        EnumSet<E> noneOf = EnumSet.noneOf(CallsAudioManager.AudioDeviceType.class);
        if (getHasBluetoothHeadset()) {
            noneOf.add(CallsAudioManager.AudioDeviceType.BLUETOOTH);
        } else if (this.bluetoothDeviceIntent != null) {
            noneOf.add(CallsAudioManager.AudioDeviceType.BLUETOOTH_INTENT);
        }
        if (getHasWiredHeadset()) {
            noneOf.add(CallsAudioManager.AudioDeviceType.WIRED_HEADSET);
        } else if (this.hasEarpiece) {
            noneOf.add(CallsAudioManager.AudioDeviceType.EARPIECE);
        }
        noneOf.add(CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
        ArrayList arrayList = new ArrayList(q23.H(noneOf, 10));
        for (E deviceInfo : noneOf) {
            arrayList.add(getDeviceInfo(deviceInfo));
        }
        this.audioDevices = o23.v0(arrayList);
        Logger logger2 = this.logger;
        logger2.v(LOG_TAG, "updated devices: " + noneOf);
    }

    private final void updateProximityTrackingState(boolean z) {
        boolean z2 = getCurrentDevice().getDeviceType() == CallsAudioManager.AudioDeviceType.BLUETOOTH || getHasWiredHeadset() || (z && !this.trackProximityWhenSpeakerEnabled);
        Logger logger2 = this.logger;
        logger2.v(LOG_TAG, "proximity disabled? " + z2 + ", speaker? " + z);
        if (z2) {
            this.proximityTracker.stopTrackingProximity();
        } else {
            this.proximityTracker.startTrackingProximity();
        }
    }

    public void changeStateAsync(CallsAudioManager.State state2, s16 s16, u16 u16) {
        doOnOwnThread$calls_audiomanager_release("changeState", s16, u16, new CallsAudioManagerV2Impl$changeStateAsync$1(this, state2));
    }

    public final void doOnOwnThread$calls_audiomanager_release(String str, s16 s16, u16 u16, s16 s162) {
        if (!this.isDestroyed) {
            this.workerThreadHandler.post(new co1(this, s162, s16, str, u16, 0));
        }
    }

    public List<CallsAudioDeviceInfo> getAvailableAudioDevices() {
        return o23.s0(this.audioDevices);
    }

    public CallsAudioDeviceInfo getCurrentDevice() {
        return this.currentDevice;
    }

    public final Handler getWorkerThreadHandler$calls_audiomanager_release() {
        return this.workerThreadHandler;
    }

    public void hasBluetoothHeadsetAsync(u16 u16, u16 u162) {
        doOnOwnThread$calls_audiomanager_release$default(this, "hasBluetoothHeadset", (s16) null, u162, new CallsAudioManagerV2Impl$hasBluetoothHeadsetAsync$1(u16, this), 2, (Object) null);
    }

    public void hasWiredHeadsetAsync(u16 u16, u16 u162) {
        doOnOwnThread$calls_audiomanager_release$default(this, "hasWiredHeadset", (s16) null, u162, new CallsAudioManagerV2Impl$hasWiredHeadsetAsync$1(u16, this), 2, (Object) null);
    }

    public boolean isHeadsetConnected() {
        return getCurrentDevice().getDeviceType().isHeadsetDevice();
    }

    public void notifyBluetoothPermissionGranted() {
        doOnOwnThread$calls_audiomanager_release$default(this, "refreshPermissions", (s16) null, (u16) null, new CallsAudioManagerV2Impl$notifyBluetoothPermissionGranted$1(this), 6, (Object) null);
    }

    public boolean onDeviceAvailable(CallsBluethoothDeviceScanner.BluetoothDeviceIntent bluetoothDeviceIntent2) {
        Logger logger2 = this.logger;
        logger2.d(LOG_TAG, "Bluetooth device added: " + bluetoothDeviceIntent2);
        this.bluetoothDeviceIntent = bluetoothDeviceIntent2;
        updateAvailableAudioDevices();
        return true;
    }

    public boolean onDeviceUnavailable(CallsBluethoothDeviceScanner.BluetoothDeviceIntent bluetoothDeviceIntent2) {
        Logger logger2 = this.logger;
        logger2.d(LOG_TAG, "Bluetooth device removed: " + bluetoothDeviceIntent2);
        CallsBluethoothDeviceScanner.BluetoothDeviceIntent bluetoothDeviceIntent3 = this.bluetoothDeviceIntent;
        if (bluetoothDeviceIntent3 == null || bluetoothDeviceIntent2.getId() != bluetoothDeviceIntent3.getId()) {
            return false;
        }
        this.bluetoothDeviceIntent = null;
        updateAvailableAudioDevices();
        return true;
    }

    public void releaseAsync(s16 s16, u16 u16) {
        doOnOwnThread$calls_audiomanager_release("release", s16, u16, new CallsAudioManagerV2Impl$releaseAsync$1(this));
    }

    public void requestAudioFocusAsync() {
        doOnOwnThread$calls_audiomanager_release("requestAudioFocus", new CallsAudioManagerV2Impl$requestAudioFocusAsync$1(this), new CallsAudioManagerV2Impl$requestAudioFocusAsync$2(this), new CallsAudioManagerV2Impl$requestAudioFocusAsync$3(this));
    }

    public final void selectPreferredAudioDevice$calls_audiomanager_release(boolean z) {
        selectAudioDevice(getPreferredAudioDevice(z, true));
    }

    public void setAudioDeviceAsync(CallsAudioDeviceInfo callsAudioDeviceInfo, s16 s16, u16 u16) {
        doOnOwnThread$calls_audiomanager_release("setAudioDevice", s16, u16, new CallsAudioManagerV2Impl$setAudioDeviceAsync$1(this, callsAudioDeviceInfo));
    }

    public void setAudioDeviceTypeAsync(CallsAudioManager.AudioDeviceType audioDeviceType, s16 s16, u16 u16) {
        doOnOwnThread$calls_audiomanager_release("setAudioDevice", s16, u16, new CallsAudioManagerV2Impl$setAudioDeviceTypeAsync$1(this, audioDeviceType));
    }

    public void setOnAudioDeviceChangeListener(CallsAudioManager.OnAudioDeviceInfoChangeListener onAudioDeviceInfoChangeListener) {
        doOnOwnThread$calls_audiomanager_release$default(this, "setOnAudioDeviceChangeListener", (s16) null, (u16) null, new CallsAudioManagerV2Impl$setOnAudioDeviceChangeListener$1(this, onAudioDeviceInfoChangeListener), 6, (Object) null);
    }

    public final void setSpeakerEnabled$calls_audiomanager_release(boolean z, boolean z2) {
        Logger logger2 = this.logger;
        logger2.v(LOG_TAG, "requested speaker " + z + " (" + z2 + ")");
        if (!this.isDestroyed) {
            if (z && (z2 || !this.disabledSpeakerOnce)) {
                CallsAudioDeviceInfo currentDevice2 = getCurrentDevice();
                CallsAudioManager.AudioDeviceType audioDeviceType = CallsAudioManager.AudioDeviceType.EARPIECE;
                CallsAudioManager.AudioDeviceType audioDeviceType2 = CallsAudioManager.AudioDeviceType.SPEAKER_PHONE;
                if (currentDevice2.oneOf$calls_audiomanager_release(audioDeviceType, audioDeviceType2) && this.proximityTracker.getCanUseSpeaker()) {
                    selectAudioDevice(audioDeviceType2);
                    return;
                }
            }
            selectAudioDevice(getPreferredAudioDevice(true, false));
        }
    }

    public void setSpeakerEnabledAsync(boolean z, boolean z2, s16 s16, u16 u16) {
        doOnOwnThread$calls_audiomanager_release("setSpeakerEnabled", s16, u16, new CallsAudioManagerV2Impl$setSpeakerEnabledAsync$1(this, z, z2));
    }

    public final void updateAudioDeviceState$calls_audiomanager_release() {
        updateAudioDeviceState(false);
    }
}
