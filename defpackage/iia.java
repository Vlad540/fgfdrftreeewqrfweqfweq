package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: iia  reason: default package */
public abstract class iia {
    public static final String a = a24.e0("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        String str = "disabled";
        String str2 = a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            a24 B = a24.B();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : str);
            B.t(str2, sb.toString());
        } catch (Exception e) {
            a24 B2 = a24.B();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (z) {
                str = "enabled";
            }
            sb2.append(str);
            B2.u(str2, sb2.toString(), e);
        }
    }
}
