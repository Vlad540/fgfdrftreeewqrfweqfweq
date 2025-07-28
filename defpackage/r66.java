package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: r66  reason: default package */
public final class r66 {
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
            int i = oze.a;
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

    public final void b(a39 a39) {
        int i = 0;
        while (true) {
            x29[] x29Arr = a39.a;
            if (i < x29Arr.length) {
                x29 x29 = x29Arr[i];
                if (x29 instanceof y33) {
                    y33 y33 = (y33) x29;
                    if ("iTunSMPB".equals(y33.c) && a(y33.o)) {
                        return;
                    }
                } else if (x29 instanceof qz6) {
                    qz6 qz6 = (qz6) x29;
                    if ("com.apple.iTunes".equals(qz6.b) && "iTunSMPB".equals(qz6.c) && a(qz6.o)) {
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
