package defpackage;

import android.os.PowerManager;
import java.util.Locale;

/* renamed from: um  reason: default package */
public abstract class um {
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
