package defpackage;

import java.util.regex.Pattern;

/* renamed from: m99  reason: default package */
public final class m99 implements koa {
    public static final Pattern b = Pattern.compile("^[\\p{L}\\p{N}]+$");
    public final String a;

    public m99(String str) {
        this.a = str.concat("_");
    }

    public final String a(Object obj) {
        String obj2 = obj.toString();
        if (b.matcher(obj2).matches()) {
            return this.a + obj;
        }
        throw new IllegalArgumentException(rf0.h("Invalid key: ", obj2));
    }
}
