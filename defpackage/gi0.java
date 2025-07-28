package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: gi0  reason: default package */
public final class gi0 extends z59 {
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            hr1.r(pair.first);
            occ occ = (occ) pair.second;
            try {
                throw null;
            } catch (RuntimeException e) {
                rt0 rt0 = BasePendingResult.s;
                throw e;
            }
        } else if (i != 2) {
            Log.wtf("BasePendingResult", wn6.h(i, "Don't know how to handle message: "), new Exception());
        } else {
            ((BasePendingResult) message.obj).Z(Status.w0);
        }
    }
}
