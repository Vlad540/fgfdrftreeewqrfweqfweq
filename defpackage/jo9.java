package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.HashSet;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: jo9  reason: default package */
public abstract class jo9 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static Notification.Action c(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static Notification.Action.Builder d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public static gn9 e(ArrayList<Parcelable> arrayList, int i) {
        u8c[] u8cArr;
        int i2;
        IconCompat iconCompat = null;
        Notification.Action action = (Notification.Action) arrayList.get(i);
        RemoteInput[] g = hn9.g(action);
        boolean z = false;
        if (g == null) {
            u8cArr = null;
        } else {
            u8c[] u8cArr2 = new u8c[g.length];
            for (int i3 = 0; i3 < g.length; i3++) {
                RemoteInput remoteInput = g[i3];
                u8cArr2[i3] = new u8c(hn9.h(remoteInput), hn9.f(remoteInput), hn9.b(remoteInput), hn9.a(remoteInput), mn9.c(remoteInput), hn9.d(remoteInput), (HashSet) null);
            }
            u8cArr = u8cArr2;
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean z2 = hn9.c(action).getBoolean("android.support.allowGeneratedReplies") || kn9.a(action);
        boolean z3 = hn9.c(action).getBoolean("android.support.action.showsUserInterface", true);
        int a = ln9.a(action);
        boolean e = mn9.e(action);
        if (i4 >= 31) {
            z = nn9.a(action);
        }
        boolean z4 = z;
        if (jn9.a(action) != null || (i2 = action.icon) == 0) {
            if (jn9.a(action) != null) {
                Icon a2 = jn9.a(action);
                PorterDuff.Mode mode = IconCompat.k;
                if (!(bo6.c(a2) == 2 && bo6.a(a2) == 0)) {
                    iconCompat = zn6.a(a2);
                }
            }
            return new gn9(iconCompat, action.title, action.actionIntent, hn9.c(action), u8cArr, (u8c[]) null, z2, a, z3, e, z4);
        }
        CharSequence charSequence = action.title;
        PendingIntent pendingIntent = action.actionIntent;
        Bundle c = hn9.c(action);
        if (i2 != 0) {
            iconCompat = IconCompat.d((Resources) null, BuildConfig.FLAVOR, i2);
        }
        return new gn9(iconCompat, charSequence, pendingIntent, c, u8cArr, (u8c[]) null, z2, a, z3, e, z4);
    }
}
