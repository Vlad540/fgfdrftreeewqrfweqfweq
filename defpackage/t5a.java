package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

/* renamed from: t5a  reason: default package */
public abstract class t5a {
    public static final Pattern a = Pattern.compile("[^\\p{L}\\p{Nd} ]+");

    public static CharSequence a(CharSequence charSequence, w6a w6a) {
        if (charSequence.length() == 0) {
            return "";
        }
        nu4 nu4 = w6a.j;
        if (nu4.a(0, charSequence)) {
            List c = nu4.c(charSequence);
            if (!c.isEmpty()) {
                return (CharSequence) o23.V(c);
            }
        }
        String replaceAll = a.matcher(charSequence).replaceAll("");
        if (replaceAll.length() != 0 && !h0e.c0(replaceAll)) {
            List q0 = h0e.q0(replaceAll, new String[]{" "}, false, 6);
            ArrayList arrayList = new ArrayList();
            for (Object next : q0) {
                if (!h0e.c0((String) next)) {
                    arrayList.add(next);
                }
            }
            StringBuilder sb = new StringBuilder();
            int min = Math.min(arrayList.size(), 2);
            for (int i = 0; i < min; i++) {
                String str = (String) arrayList.get(i);
                if (str.length() != 0 && !h0e.c0(str)) {
                    sb.append(Character.toUpperCase(str.charAt(0)));
                }
            }
            return sb.toString();
        } else if (charSequence.length() <= 0) {
            return "";
        } else {
            if (charSequence.length() != 0) {
                return String.valueOf(charSequence.charAt(0));
            }
            throw new NoSuchElementException("Char sequence is empty.");
        }
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        int i = charSequence2 == null ? 1 : 2;
        Pattern pattern = a;
        String replaceAll = pattern.matcher(charSequence).replaceAll("");
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        String replaceAll2 = pattern.matcher(charSequence2).replaceAll("");
        StringBuilder sb = new StringBuilder();
        Character ch = null;
        Character valueOf = replaceAll.length() == 0 ? null : Character.valueOf(replaceAll.charAt(0));
        if (replaceAll2.length() != 0) {
            ch = Character.valueOf(replaceAll2.charAt(0));
        }
        List B = p23.B(new Character[]{valueOf, ch});
        for (int i2 = 0; i2 < i; i2++) {
            Character ch2 = (Character) o23.Y(i2, B);
            if (ch2 != null) {
                sb.append(ch2.charValue());
            }
        }
        return sb.toString();
    }
}
