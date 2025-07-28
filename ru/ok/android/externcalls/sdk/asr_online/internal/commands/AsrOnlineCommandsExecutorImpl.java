package ru.ok.android.externcalls.sdk.asr_online.internal.commands;

import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutorImpl;", "Lru/ok/android/externcalls/sdk/asr_online/internal/commands/AsrOnlineCommandsExecutor;", "Lkotlin/Function0;", "Lgx0;", "getCall", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Ls16;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", "isEnabled", "Ljue;", "enableAsrOnline", "(Z)V", "onMigratedToServerCallTopology", "()V", "Ls16;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "isAsrOnlineEnabled", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AsrOnlineCommandsExecutorImpl implements AsrOnlineCommandsExecutor {
    private final s16 getCall;
    private boolean isAsrOnlineEnabled;
    private final SignalingProvider signalingProvider;

    public AsrOnlineCommandsExecutorImpl(s16 s16, SignalingProvider signalingProvider2) {
        this.getCall = s16;
        this.signalingProvider = signalingProvider2;
    }

    public void enableAsrOnline(boolean z) {
        this.isAsrOnlineEnabled = z;
        gx0 gx0 = (gx0) this.getCall.invoke();
        if (gx0 != null) {
            if (gx0.x1.H(ane.b)) {
                x66 d = x87.d((JSONObject) null, "request-asr");
                mfd signaling = this.signalingProvider.getSignaling();
                if (signaling != null) {
                    signaling.i(d);
                    return;
                }
                return;
            }
            gx0 gx02 = (gx0) this.getCall.invoke();
            if (gx02 != null) {
                gx02.x1.O(z);
            }
        }
    }

    public void onMigratedToServerCallTopology() {
        gx0 gx0;
        if (this.isAsrOnlineEnabled && (gx0 = (gx0) this.getCall.invoke()) != null) {
            gx0.x1.O(this.isAsrOnlineEnabled);
        }
    }
}
