package ru.ok.android.externcalls.sdk.asr_online.internal.commands;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "", "", "isEnabled", "Ljue;", "enableAsrOnline", "(Z)V", "onMigratedToServerCallTopology", "()V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface AsrOnlineCommandsExecutor {
    void enableAsrOnline(boolean z);

    void onMigratedToServerCallTopology();
}
