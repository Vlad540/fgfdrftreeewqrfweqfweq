package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lba  reason: default package */
public final /* synthetic */ class lba implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        Handler handler = nba.a;
        mba mba = (mba) message.obj;
        AtomicBoolean atomicBoolean = nba.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (hhd.f(nba.b, mba) || hhd.f(nba.c, mba)) {
                nba.a(mba, jba.a);
            }
            atomicBoolean.set(false);
        }
        return true;
    }
}
