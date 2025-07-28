package defpackage;

import android.content.Context;
import android.os.UserManager;

/* renamed from: dze  reason: default package */
public abstract class dze {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
