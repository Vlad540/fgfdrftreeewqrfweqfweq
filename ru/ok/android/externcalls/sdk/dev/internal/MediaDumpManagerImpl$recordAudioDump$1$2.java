package ru.ok.android.externcalls.sdk.dev.internal;

import kotlin.Metadata;
import org.webrtc.DumpCallback;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl$recordAudioDump$1$2", "Lorg/webrtc/DumpCallback;", "", "dumpFolderPath", "Ljue;", "onStarted", "(Ljava/lang/String;)V", "onComplete", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class MediaDumpManagerImpl$recordAudioDump$1$2 implements DumpCallback {
    final /* synthetic */ MediaDumpManager.LocalAudioDumpRecordListener $listener;

    public MediaDumpManagerImpl$recordAudioDump$1$2(MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener) {
        this.$listener = localAudioDumpRecordListener;
    }

    public void onComplete(String str) {
        MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener = this.$listener;
        if (localAudioDumpRecordListener != null) {
            localAudioDumpRecordListener.onRecordCompleted(str);
        }
    }

    public void onStarted(String str) {
        MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener = this.$listener;
        if (localAudioDumpRecordListener != null) {
            localAudioDumpRecordListener.onRecordStarted(str);
        }
    }
}
