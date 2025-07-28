package ru.ok.android.externcalls.sdk.asr_online.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010#¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/internal/AsrOnlineManagerImpl;", "Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineManager;", "Ljz0;", "Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManager;", "Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "commandExecutor", "Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl;", "listenerManager", "Lkotlin/Function0;", "Lgx0;", "getCall", "<init>", "(Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl;Ls16;)V", "Lvs;", "asrRecvDataPackage", "Ljue;", "onAsrDataPackage", "(Lvs;)V", "Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;", "listener", "addAsrOnlineListener", "(Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;)V", "", "isAvailable", "onAsrAvailableChanged", "(Z)V", "removeAsrOnlineListener", "isEnabled", "enableAsrOnline", "onMigratedToServerCallTopology", "()V", "isAsrAvailable", "()Z", "Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "Lru/ok/android/externcalls/sdk/asr_online/internal/listeners/AsrOnlineListenerManagerImpl;", "Ls16;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AsrOnlineManagerImpl implements AsrOnlineManager, jz0, AsrOnlineListenerManager, AsrOnlineCommandsExecutor {
    private final AsrOnlineCommandsExecutor commandExecutor;
    private final s16 getCall;
    private final AsrOnlineListenerManagerImpl listenerManager;

    public AsrOnlineManagerImpl(AsrOnlineCommandsExecutor asrOnlineCommandsExecutor, AsrOnlineListenerManagerImpl asrOnlineListenerManagerImpl, s16 s16) {
        this.commandExecutor = asrOnlineCommandsExecutor;
        this.listenerManager = asrOnlineListenerManagerImpl;
        this.getCall = s16;
    }

    public void addAsrOnlineListener(AsrOnlineListener asrOnlineListener) {
        this.listenerManager.addAsrOnlineListener(asrOnlineListener);
    }

    public void enableAsrOnline(boolean z) {
        this.commandExecutor.enableAsrOnline(z);
    }

    public boolean isAsrAvailable() {
        gx0 gx0 = (gx0) this.getCall.invoke();
        if (gx0 != null) {
            if (gx0.D0.contains(fx0.Y)) {
                return true;
            }
        }
        return false;
    }

    public void onAsrAvailableChanged(boolean z) {
        this.listenerManager.onAsrAvailableChanged(z);
    }

    public void onAsrDataPackage(vs vsVar) {
        this.listenerManager.onAsrDataPackage(vsVar);
    }

    public void onMigratedToServerCallTopology() {
        this.commandExecutor.onMigratedToServerCallTopology();
    }

    public void removeAsrOnlineListener(AsrOnlineListener asrOnlineListener) {
        this.listenerManager.removeAsrOnlineListener(asrOnlineListener);
    }
}
