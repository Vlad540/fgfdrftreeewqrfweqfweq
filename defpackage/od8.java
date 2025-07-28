package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;

/* renamed from: od8  reason: default package */
public final class od8 {
    public Context a;
    public final ContentResolver b;

    static {
        boolean z = rd8.b;
    }

    public od8(Context context) {
        this.a = context;
        this.b = context.getContentResolver();
        this.a = context;
    }

    public final boolean a(nd8 nd8, String str) {
        int i = nd8.b;
        return i < 0 ? this.a.getPackageManager().checkPermission(str, nd8.a) == 0 : this.a.checkPermission(str, i, nd8.c) == 0;
    }

    public boolean b(nd8 nd8) {
        if (this.a.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", nd8.b, nd8.c) != 0) {
            try {
                if (this.a.getPackageManager().getApplicationInfo(nd8.a, 0) == null) {
                    return false;
                }
                if (!a(nd8, "android.permission.STATUS_BAR_SERVICE") && !a(nd8, "android.permission.MEDIA_CONTENT_CONTROL") && nd8.c != 1000) {
                    String string = Settings.Secure.getString(this.b, "enabled_notification_listeners");
                    if (string == null) {
                        return false;
                    }
                    String[] split = string.split(":");
                    int i = 0;
                    while (i < split.length) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                        if (unflattenFromString == null || !unflattenFromString.getPackageName().equals(nd8.a)) {
                            i++;
                        }
                    }
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return true;
    }
}
