package defpackage;

import android.os.Message;
import java.util.ArrayList;

/* renamed from: f8e  reason: default package */
public final class f8e {
    public Message a;

    public final void a() {
        this.a = null;
        ArrayList arrayList = h8e.b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
