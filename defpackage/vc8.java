package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vc8  reason: default package */
public final class vc8 {
    public static int d;
    public final qc8 a;
    public final mn b;
    public final ArrayList c = new ArrayList();

    /* JADX WARNING: type inference failed for: r8v2, types: [pc8, qc8] */
    public vc8(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i = xf8.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    queryBroadcastReceivers.size();
                    componentName = null;
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            ? pc8 = new pc8(context, str, bundle);
            this.a = pc8;
            Looper myLooper = Looper.myLooper();
            pc8.c(new m18(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            pc8.a.setMediaButtonReceiver(pendingIntent);
            this.b = new mn(context, pc8.c);
            if (d == 0) {
                d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = vc8.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public final pd8 b() {
        return new pd8(this.a.a.getCurrentControllerInfo());
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [java.util.AbstractCollection, java.util.List] */
    public final void c(cya cya) {
        qc8 qc8 = this.a;
        qc8.g = cya;
        synchronized (qc8.d) {
            for (int beginBroadcast = qc8.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((jn6) qc8.f.getBroadcastItem(beginBroadcast)).f(cya);
                } catch (RemoteException unused) {
                }
            }
            qc8.f.finishBroadcast();
        }
        MediaSession mediaSession = qc8.a;
        if (cya.A0 == null) {
            PlaybackState.Builder d2 = yxa.d();
            yxa.x(d2, cya.a, cya.b, cya.o, cya.w0);
            yxa.u(d2, cya.c);
            yxa.s(d2, cya.X);
            yxa.v(d2, cya.Z);
            for (bya bya : cya.x0) {
                PlaybackState.CustomAction customAction = bya.X;
                if (customAction == null) {
                    PlaybackState.CustomAction.Builder e = yxa.e(bya.a, bya.b, bya.c);
                    yxa.w(e, bya.o);
                    customAction = yxa.b(e);
                }
                if (customAction != null) {
                    yxa.a(d2, customAction);
                }
            }
            yxa.t(d2, cya.y0);
            zxa.b(d2, cya.z0);
            cya.A0 = yxa.c(d2);
        }
        mediaSession.setPlaybackState(cya.A0);
    }
}
