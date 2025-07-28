package ru.ok.android.externcalls.sdk.asr;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JM\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rJE\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0014\u0010\u0013ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/AsrManager;", "", "", "fileName", "Lw2d;", "sessionRoomId", "Lkotlin/Function0;", "Ljue;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Ljava/lang/String;Lw2d;Ls16;Lu16;)V", "stopRecord", "(Lw2d;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;", "listener", "addAsrRecordListener", "(Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;)V", "removeAsrRecordListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface AsrManager {
    static /* synthetic */ void startRecord$default(AsrManager asrManager, String str, w2d w2d, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                w2d = null;
            }
            if ((i & 4) != 0) {
                s16 = null;
            }
            if ((i & 8) != 0) {
                u16 = null;
            }
            asrManager.startRecord(str, w2d, s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startRecord");
    }

    static /* synthetic */ void stopRecord$default(AsrManager asrManager, w2d w2d, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                w2d = null;
            }
            if ((i & 2) != 0) {
                s16 = null;
            }
            if ((i & 4) != 0) {
                u16 = null;
            }
            asrManager.stopRecord(w2d, s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRecord");
    }

    void addAsrRecordListener(AsrRecordListener asrRecordListener);

    void removeAsrRecordListener(AsrRecordListener asrRecordListener);

    void startRecord(String str, w2d w2d, s16 s16, u16 u16);

    void stopRecord(w2d w2d, s16 s16, u16 u16);
}
