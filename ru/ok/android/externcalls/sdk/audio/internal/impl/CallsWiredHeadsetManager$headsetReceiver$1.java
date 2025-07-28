package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ru/ok/android/externcalls/sdk/audio/internal/impl/CallsWiredHeadsetManager$headsetReceiver$1", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ljue;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
public final class CallsWiredHeadsetManager$headsetReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ CallsWiredHeadsetManager this$0;

    public CallsWiredHeadsetManager$headsetReceiver$1(CallsWiredHeadsetManager callsWiredHeadsetManager) {
        this.this$0 = callsWiredHeadsetManager;
    }

    public void onReceive(Context context, Intent intent) {
        this.this$0.onReceiveBroadcast(this, intent);
    }
}
