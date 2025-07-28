package defpackage;

import android.view.PixelCopy;
import java.util.concurrent.Semaphore;

/* renamed from: a5e  reason: default package */
public final /* synthetic */ class a5e implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Semaphore a;

    public /* synthetic */ a5e(Semaphore semaphore) {
        this.a = semaphore;
    }

    public final void onPixelCopyFinished(int i) {
        this.a.release();
    }
}
