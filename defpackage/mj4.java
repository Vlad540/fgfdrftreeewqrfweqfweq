package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: mj4  reason: default package */
public final class mj4 {
    public final String a;

    public mj4(String str, int i) {
        switch (i) {
            case 1:
                this.a = rf0.g("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
                return;
            default:
                this.a = str;
                return;
        }
    }

    public static mj4 a(ija ija) {
        String str;
        ija.H(2);
        int u = ija.u();
        int i = u >> 1;
        int u2 = ((ija.u() >> 3) & 31) | ((u & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i);
        if (u2 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(u2);
        return new mj4(sb.toString(), 0);
    }

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return me4.i(str, " : ", str2);
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            d(this.a, str, objArr);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            d(this.a, str, objArr);
        }
    }
}
