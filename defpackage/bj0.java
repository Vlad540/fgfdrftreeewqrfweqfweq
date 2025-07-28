package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: bj0  reason: default package */
public final class bj0 implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            hr1.r(message.obj);
            throw null;
        } else if (i != 1) {
            return false;
        } else {
            hr1.r(message.obj);
            throw null;
        }
    }
}
