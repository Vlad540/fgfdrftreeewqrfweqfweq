package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: zu0  reason: default package */
public final class zu0 implements zw4 {
    public static final String c;
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new cy4[]{new cy4("proto"), new cy4("json")})));
    public static final zu0 e;
    public static final zu0 f;
    public final String a;
    public final String b;

    static {
        String V = a24.V("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = V;
        String V2 = a24.V("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String V3 = a24.V("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        e = new zu0(V, (String) null);
        f = new zu0(V2, V3);
    }

    public zu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static zu0 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new zu0(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
