package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.HTTP;

/* renamed from: ehe  reason: default package */
public abstract class ehe {
    public static final Pattern a;
    public static final Pattern b = Pattern.compile("@([A-Za-z0-9_-]+)\\s/");
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g = Pattern.compile("[\n\r]");
    public static final Pattern h = Pattern.compile("\\s{2,}");
    public static final String[] i = {HTTP.CRLF, "\r", "\n", " ", " ", ""};
    public static final String[] j = {" ", "\\t", "\\n", "\\r", "\\t", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "​", "‌", "‍", " ", " ", "　"};
    public static final Pattern k = Pattern.compile("[^\\p{L}\\p{Nd} ]+");

    static {
        Pattern compile = Pattern.compile("@([A-Za-z0-9_-]+)");
        a = compile;
        Pattern.compile("@([A-Za-z0-9_-]+)\\s");
        Pattern compile2 = Pattern.compile("[\\p{Punct}\\p{L}\\p{N}\\p{Sm}]+");
        c = Pattern.compile("(" + compile + "\\s)?(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+");
        d = Pattern.compile("(" + compile + "\\s)?(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+\\s(" + compile2 + ")?");
        StringBuilder sb = new StringBuilder("(");
        sb.append(compile);
        sb.append("\\s)(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+");
        e = Pattern.compile(sb.toString());
        f = Pattern.compile("(" + compile + "\\s)(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+\\s(" + compile2 + ")?");
    }

    public static CharSequence a(CharSequence charSequence, w6a w6a) {
        if (r1g.p(charSequence)) {
            return "";
        }
        if (w6a.j.a(0, charSequence)) {
            List c2 = w6a.j.c(charSequence);
            if (!c2.isEmpty()) {
                CharSequence charSequence2 = (CharSequence) c2.get(0);
                return charSequence2 == null ? "" : charSequence2;
            }
        }
        String replaceAll = k.matcher(charSequence).replaceAll("");
        if (!r1g.p(replaceAll)) {
            charSequence = replaceAll;
        }
        String[] split = charSequence.toString().trim().split(" +");
        StringBuilder sb = new StringBuilder();
        int min = Math.min(split.length, 2);
        for (int i2 = 0; i2 < min; i2++) {
            String str = split[i2];
            if (!r1g.p(str)) {
                sb.append(Character.isHighSurrogate(str.charAt(0)) ? str.substring(0, Math.min(str.length(), 2)) : str.substring(0, 1));
            }
        }
        return sb.toString().toUpperCase();
    }

    public static String b(String str) {
        String rawPath = r1g.p(str) ? null : URI.create(str).getRawPath();
        return rawPath == null ? "" : rawPath.length() < 2 ? str : rawPath.substring(1);
    }

    public static String c(String str) {
        if (r1g.p(str)) {
            return "";
        }
        return "@" + b(str);
    }

    public static String[] d(String str, w6a w6a) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str.length()) {
            if (!gsc.i(str.charAt(i2))) {
                int i3 = i2;
                while (i3 < str.length() && w6a.j.a(i3, str)) {
                    i3++;
                }
                String substring = i3 > i2 ? str.substring(i2, i3) : null;
                if (!r1g.p(substring)) {
                    arrayList.add(substring);
                    i2 += substring.length() - 1;
                } else {
                    int i4 = i2;
                    while (i4 < str.length()) {
                        w6a.getClass();
                        if (gsc.i(str.charAt(i4)) || w6a.j.a(i4, str)) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 > i2) {
                        arrayList.add(str.substring(i2, i4));
                    }
                    i2 = i4;
                }
            }
            i2++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String e(String str) {
        if (r1g.p(str)) {
            return str;
        }
        return h.matcher(g.matcher(str).replaceAll(" ")).replaceAll(" ");
    }
}
