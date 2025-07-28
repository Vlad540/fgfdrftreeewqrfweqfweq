package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: p99  reason: default package */
public final class p99 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public p99(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    public final void onCallbackDied(IInterface iInterface, Object obj) {
        rn6 rn6 = (rn6) iInterface;
        this.a.b.remove((Integer) obj);
    }
}
