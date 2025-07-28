package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: kc8  reason: default package */
public class kc8 {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final cd8 a;

    public kc8(Context context, n45 n45, e8c e8c, hk9 hk9, Bundle bundle, Bundle bundle2, mn mnVar) {
        synchronized (b) {
            HashMap hashMap = c;
            if (!hashMap.containsKey(BuildConfig.FLAVOR)) {
                hashMap.put(BuildConfig.FLAVOR, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=");
            }
        }
        this.a = new cd8(this, context, n45, e8c, hk9, bundle, bundle2, mnVar);
    }

    public final wm0 a() {
        return this.a.m;
    }

    public final cd8 b() {
        return this.a;
    }

    public final kya c() {
        return this.a.s.a;
    }

    public final PendingIntent d() {
        return this.a.t;
    }

    public final boolean e() {
        return this.a.p;
    }
}
