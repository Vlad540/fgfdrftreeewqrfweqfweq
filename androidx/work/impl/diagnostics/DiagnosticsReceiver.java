package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = a24.e0("DiagnosticsRcvr");

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a24 B = a24.B();
            String str = a;
            B.t(str, "Requesting diagnostics");
            try {
                itf.d(context).a((cfa) new bfa(DiagnosticsWorker.class).build());
            } catch (IllegalStateException e) {
                a24.B().y(str, "WorkManager is not initialized", e);
            }
        }
    }
}
