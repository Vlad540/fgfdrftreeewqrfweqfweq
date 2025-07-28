package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: q66  reason: default package */
public final class q66 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = mze.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(y29 y29) {
        int i = 0;
        while (true) {
            w29[] w29Arr = y29.a;
            if (i < w29Arr.length) {
                w29 w29 = w29Arr[i];
                if (w29 instanceof x33) {
                    x33 x33 = (x33) w29;
                    if ("iTunSMPB".equals(x33.c) && a(x33.o)) {
                        return;
                    }
                } else if (w29 instanceof pz6) {
                    pz6 pz6 = (pz6) w29;
                    if ("com.apple.iTunes".equals(pz6.b) && "iTunSMPB".equals(pz6.c) && a(pz6.o)) {
                        return;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
