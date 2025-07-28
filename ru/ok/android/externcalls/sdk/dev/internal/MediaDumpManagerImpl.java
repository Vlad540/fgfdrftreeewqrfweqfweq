package ru.ok.android.externcalls.sdk.dev.internal;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeDumpCallback;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager;", "Lgx0;", "call", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lgx0;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", "path", "Ljue;", "setLocalAudioDumpLocation", "(Ljava/lang/String;)V", "", "durationSeconds", "", "audio", "video", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$RemoteMediaDumpRequestListener;", "listener", "requestMediaDump", "(IZZLru/ok/android/externcalls/sdk/dev/MediaDumpManager$RemoteMediaDumpRequestListener;)V", "", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$Source;", "sources", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$LocalAudioDumpRecordListener;", "recordAudioDump", "(ILjava/util/Set;Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$LocalAudioDumpRecordListener;)Ljava/lang/String;", "cancelAudioDumpRecord", "()V", "Lgx0;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "dumpLocation", "Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class MediaDumpManagerImpl implements MediaDumpManager {
    private final gx0 call;
    private String dumpLocation;
    private final SignalingProvider signalingProvider;

    public MediaDumpManagerImpl(gx0 gx0, SignalingProvider signalingProvider2) {
        this.call = gx0;
        this.signalingProvider = signalingProvider2;
    }

    /* access modifiers changed from: private */
    public static final void requestMediaDump$lambda$0(MediaDumpManager.RemoteMediaDumpRequestListener remoteMediaDumpRequestListener, JSONObject jSONObject) {
        if ("response".equals(jSONObject.optString("type")) && "collect-debug-dump".equals(jSONObject.optString("response")) && remoteMediaDumpRequestListener != null) {
            remoteMediaDumpRequestListener.onRequestSent();
        }
    }

    public void cancelAudioDumpRecord() {
        gx0 gx0 = this.call;
        gx0.getClass();
        gx0.s2.execute(new lw0(gx0, 4));
    }

    public String recordAudioDump(int i, Set<? extends MediaDumpManager.Source> set, MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener) {
        String str = this.dumpLocation;
        Set set2 = null;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime());
        File file2 = new File(file, "calldump_" + format + "_" + i + "s");
        try {
            if (!file2.exists() && !file2.mkdirs()) {
                return file2.getAbsolutePath();
            }
            gx0 gx0 = this.call;
            String absolutePath = file2.getAbsolutePath();
            if (set != null) {
                ArrayList arrayList = new ArrayList(q23.H(set, 10));
                for (MediaDumpManager.Source webrtcDumpSource$calls_sdk_release : set) {
                    arrayList.add(webrtcDumpSource$calls_sdk_release.getWebrtcDumpSource$calls_sdk_release());
                }
                set2 = o23.w0(arrayList);
            }
            NativeDumpCallback nativeDumpCallback = new NativeDumpCallback(new MediaDumpManagerImpl$recordAudioDump$1$2(localAudioDumpRecordListener));
            gx0.getClass();
            gx0.s2.execute(new tw0(gx0, absolutePath, i, set2, nativeDumpCallback, 0));
            return file2.getAbsolutePath();
        } catch (Throwable unused) {
        }
    }

    public void requestMediaDump(int i, boolean z, boolean z2, MediaDumpManager.RemoteMediaDumpRequestListener remoteMediaDumpRequestListener) {
        mfd signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MediaStreamTrack.AUDIO_TRACK_KIND, z);
            jSONObject.put(MediaStreamTrack.VIDEO_TRACK_KIND, z2);
            jSONObject.put("duration", i);
            signaling.h(x87.d(jSONObject, "collect-debug-dump"), new ax0(2, remoteMediaDumpRequestListener));
        }
    }

    public void setLocalAudioDumpLocation(String str) {
        this.dumpLocation = str;
    }
}
