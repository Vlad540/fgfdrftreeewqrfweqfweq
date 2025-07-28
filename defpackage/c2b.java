package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: c2b  reason: default package */
public final class c2b {
    public final SharedPreferences a;

    public c2b(Context context) {
        this.a = context.getSharedPreferences("webrtc-android-sdk-pref", 0);
    }
}
