package defpackage;

import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: ume  reason: default package */
public final class ume {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public ume(String str, String str2) {
        String substring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (substring == null || !d.matcher(substring).matches()) {
            throw new IllegalArgumentException(wn6.i("Invalid topic name: ", substring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.a = substring;
        this.b = str;
        this.c = me4.i(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ume)) {
            return false;
        }
        ume ume = (ume) obj;
        return this.a.equals(ume.a) && this.b.equals(ume.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
