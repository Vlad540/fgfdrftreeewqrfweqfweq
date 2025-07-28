package defpackage;

import android.content.Context;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.Collections;
import java.util.regex.Pattern;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: che  reason: default package */
public abstract class che {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("#(?i)([\\p{L}0-9_]+)");
    }

    public static String a(loa loa, String str, String str2, String str3) {
        cpa cpa;
        if (r1g.p(str2)) {
            str2 = str3;
        }
        String str4 = "RU";
        if (!r1g.p(str2)) {
            String upperCase = str2.toUpperCase();
            if (Collections.unmodifiableSet(loa.f).contains(upperCase)) {
                str4 = upperCase;
            }
        }
        try {
            cpa = loa.t(str4, !str.startsWith("+") ? "+".concat(str) : str);
        } catch (NumberParseException unused) {
            cpa = null;
        }
        return cpa == null ? str : loa.d(cpa, 2);
    }

    public static String b(Context context, Throwable th) {
        int i;
        if (th instanceof FetcherException) {
            switch (hr1.t(((FetcherException) th).a)) {
                case 5:
                    i = cic.j3;
                    break;
                case 6:
                    i = cic.q3;
                    break;
                case 7:
                    i = cic.o3;
                    break;
                case 8:
                    i = cic.n3;
                    break;
                case 9:
                    i = cic.m3;
                    break;
                case 10:
                    i = cic.f3;
                    break;
                default:
                    i = cic.F;
                    break;
            }
        } else {
            i = cic.f3;
        }
        return context.getString(i);
    }
}
