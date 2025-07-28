package defpackage;

import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: dy4  reason: default package */
public abstract class dy4 {
    public static final r7e a = new r7e(new xd3(22));

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        MessageDigest messageDigest = (MessageDigest) a.getValue();
        if (messageDigest == null) {
            return str;
        }
        messageDigest.update(str.getBytes(e22.a), 0, str.length());
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
                sb.append(hexString);
            } else {
                sb.append(hexString);
            }
        }
        return sb.toString().toLowerCase(Locale.ROOT);
    }
}
