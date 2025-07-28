package defpackage;

import android.media.MediaDrm;

/* renamed from: po4  reason: default package */
public abstract class po4 {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        String[] split;
        int length;
        boolean z = true;
        String diagnosticInfo = ((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo();
        int i = mze.a;
        int i2 = 0;
        if (diagnosticInfo != null && (length = split.length) >= 2) {
            String str = split[length - 1];
            if (length < 3 || !"neg".equals((split = diagnosticInfo.split("_", -1))[length - 2])) {
                z = false;
            }
            try {
                str.getClass();
                int parseInt = Integer.parseInt(str);
                if (z) {
                    parseInt = -parseInt;
                }
                i2 = parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        return mze.r(i2);
    }
}
