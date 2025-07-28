package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* renamed from: vme  reason: default package */
public final class vme {
    public static WeakReference c;
    public bd4 a;
    public final Executor b;

    public vme(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    public final synchronized ume a() {
        String str;
        ume ume;
        bd4 bd4 = this.a;
        synchronized (((ArrayDeque) bd4.X)) {
            str = (String) ((ArrayDeque) bd4.X).peek();
        }
        Pattern pattern = ume.d;
        ume = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                ume = new ume(split[0], split[1]);
            }
        }
        return ume;
    }
}
