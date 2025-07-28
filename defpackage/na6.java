package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.fresco.middleware.HasExtraData;

/* renamed from: na6  reason: default package */
public class na6 {
    public static final int a = 12451000;
    public static final na6 b = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [na6, java.lang.Object] */
    static {
        int i = xa6.e;
    }

    public Intent a(int i, Context context, String str) {
        if (i == 1 || i == 2) {
            if (context == null || !oyb.J(context)) {
                StringBuilder sb = new StringBuilder("gcore_");
                sb.append(a);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        u5g a2 = suf.a(context);
                        sb.append(((Context) a2.b).getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb2 = sb.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(HasExtraData.KEY_ID, "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(android.content.Context r5, int r6) {
        /*
            r4 = this;
            int r4 = defpackage.xa6.a(r5, r6)
            r6 = 18
            r0 = 1
            if (r4 != r6) goto L_0x000a
            goto L_0x0046
        L_0x000a:
            if (r4 != r0) goto L_0x0045
            r0 = 0
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ Exception -> 0x0046 }
            android.content.pm.PackageInstaller r1 = r1.getPackageInstaller()     // Catch:{ Exception -> 0x0046 }
            java.util.List r1 = r1.getAllSessions()     // Catch:{ Exception -> 0x0046 }
            java.util.Iterator r1 = r1.iterator()
        L_0x001d:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "com.google.android.gms"
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r2 = (android.content.pm.PackageInstaller.SessionInfo) r2
            java.lang.String r2 = r2.getAppPackageName()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001d
            r5 = 1
        L_0x0036:
            r0 = r5
            goto L_0x0046
        L_0x0038:
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            r1 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r3, r1)     // Catch:{  }
            boolean r5 = r5.enabled     // Catch:{  }
            goto L_0x0036
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0049
            return r6
        L_0x0049:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na6.b(android.content.Context, int):int");
    }
}
