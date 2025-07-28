package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.b;
import com.google.android.gms.common.SupportErrorDialogFragment;

/* renamed from: ma6  reason: default package */
public final class ma6 extends na6 {
    public static final Object c = new Object();
    public static final ma6 d = new Object();

    public static AlertDialog d(Context context, int i, e0g e0g, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(izf.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b = izf.b(context, i);
        if (b != null) {
            builder.setPositiveButton(b, e0g);
        }
        String d2 = izf.d(context, i);
        if (d2 != null) {
            builder.setTitle(d2);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.app.DialogFragment, rz4] */
    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof b) {
                vx5 P = ((b) activity).P();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                a24.p(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                supportErrorDialogFragment.F1 = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.G1 = onCancelListener;
                }
                supportErrorDialogFragment.l1(P, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ? dialogFragment = new DialogFragment();
        a24.p(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        dialogFragment.a = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.b = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final void c(Activity activity, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new tzf(activity, super.a(i, activity, "d")), onCancelListener);
        if (d2 != null) {
            e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new wzf(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String f = i == 6 ? izf.f(context, "common_google_play_services_resolution_required_title") : izf.d(context, i);
            if (f == null) {
                f = context.getResources().getString(evb.common_google_play_services_notification_ticker);
            }
            String e = (i == 6 || i == 19) ? izf.e(context, "common_google_play_services_resolution_required_text", izf.a(context)) : izf.c(context, i);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            a24.o(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            un9 un9 = new un9(context, (String) null);
            un9.u = true;
            un9.i(16, true);
            un9.e = un9.c(f);
            sn9 sn9 = new sn9(0);
            sn9.f = un9.c(e);
            un9.q(sn9);
            PackageManager packageManager = context.getPackageManager();
            if (oyb.c == null) {
                oyb.c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (oyb.c.booleanValue()) {
                un9.F.icon = context.getApplicationInfo().icon;
                un9.k = 2;
                if (oyb.J(context)) {
                    un9.b.add(new gn9(aob.common_full_open_on_phone, resources.getString(evb.common_open_on_phone), pendingIntent));
                } else {
                    un9.g = pendingIntent;
                }
            } else {
                un9.F.icon = 17301642;
                un9.F.tickerText = un9.c(resources.getString(evb.common_google_play_services_notification_ticker));
                un9.F.when = System.currentTimeMillis();
                un9.g = pendingIntent;
                un9.e(e);
            }
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(evb.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            un9.z = "com.google.android.gms.availability";
            Notification b = un9.b();
            if (i == 1 || i == 2 || i == 3) {
                xa6.a.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b);
        }
    }

    public final void g(Activity activity, ec7 ec7, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new zzf(super.a(i, activity, "d"), ec7), onCancelListener);
        if (d2 != null) {
            e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }
}
