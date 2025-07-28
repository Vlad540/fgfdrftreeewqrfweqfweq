package defpackage;

import android.content.ComponentName;
import android.support.v4.app.INotificationSideChannel;
import java.util.ArrayDeque;

/* renamed from: gp9  reason: default package */
public final class gp9 {
    public final ComponentName a;
    public boolean b = false;
    public INotificationSideChannel c;
    public final ArrayDeque d = new ArrayDeque();
    public int e = 0;

    public gp9(ComponentName componentName) {
        this.a = componentName;
    }
}
