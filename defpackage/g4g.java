package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: g4g  reason: default package */
public final class g4g {
    public static final mj4 c = new mj4("ReviewService", 1);
    public final f6g a;
    public final String b;

    public g4g(Context context) {
        int length;
        String str;
        this.b = context.getPackageName();
        mj4 mj4 = o6g.a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                mj4.c("Play Store package is disabled.", new Object[0]);
                return;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    mj4.c("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i < length) {
                    byte[] byteArray = signatureArr[i].toByteArray();
                    try {
                        MessageDigest instance = MessageDigest.getInstance("SHA-256");
                        instance.update(byteArray);
                        str = Base64.encodeToString(instance.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str = BuildConfig.FLAVOR;
                    }
                    arrayList.add(str);
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                        String str2 = Build.TAGS;
                        if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                            i++;
                        }
                    }
                    this.a = new f6g(context, c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append(", ");
                    }
                }
                mj4.c(wn6.i("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
            } catch (PackageManager.NameNotFoundException unused2) {
                mj4.c("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            mj4.c("Play Store package is not found.", new Object[0]);
        }
    }
}
