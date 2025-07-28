package defpackage;

import android.os.Bundle;

/* renamed from: ayb  reason: default package */
public abstract class ayb {
    public static final String a = Integer.toString(0, 36);

    static {
        int i = oze.a;
    }

    public static ayb a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        boolean z = false;
        boolean z2 = true;
        if (i == 0) {
            String str2 = lf6.d;
            if (bundle.getInt(str, -1) != 0) {
                z2 = false;
            }
            oyb.d(z2);
            return bundle.getBoolean(lf6.d, false) ? new lf6(bundle.getBoolean(lf6.e, false)) : new lf6();
        } else if (i == 1) {
            String str3 = kma.c;
            if (bundle.getInt(str, -1) == 1) {
                z = true;
            }
            oyb.d(z);
            float f = bundle.getFloat(kma.c, -1.0f);
            return f == -1.0f ? new kma() : new kma(f);
        } else if (i == 2) {
            String str4 = vod.d;
            if (bundle.getInt(str, -1) == 2) {
                z = true;
            }
            oyb.d(z);
            int i2 = bundle.getInt(vod.d, 5);
            float f2 = bundle.getFloat(vod.e, -1.0f);
            return f2 == -1.0f ? new vod(i2) : new vod(i2, f2);
        } else if (i == 3) {
            String str5 = uie.d;
            if (bundle.getInt(str, -1) != 3) {
                z2 = false;
            }
            oyb.d(z2);
            return bundle.getBoolean(uie.d, false) ? new uie(bundle.getBoolean(uie.e, false)) : new uie();
        } else {
            throw new IllegalArgumentException(wn6.h(i, "Unknown RatingType: "));
        }
    }

    public abstract boolean b();

    public abstract Bundle c();
}
