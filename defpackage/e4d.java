package defpackage;

import java.io.Serializable;

/* renamed from: e4d  reason: default package */
public final class e4d implements Serializable {
    public final Object X;
    public final int Y;
    public boolean Z;
    public final int a;
    public final CharSequence b;
    public final String c;
    public final String o;

    public e4d(int i, CharSequence charSequence, String str, String str2, Boolean bool, int i2) {
        this.a = i;
        this.b = charSequence;
        this.c = str;
        this.o = str2;
        this.X = bool;
        this.Y = i2;
    }

    public static e4d a(int i, String str, String str2) {
        return new e4d(i, str, str2, (String) null, (Boolean) null, 0);
    }

    public final boolean equals(Object obj) {
        e4d e4d;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4d) || this.a != (e4d = (e4d) obj).a || this.Y != e4d.Y || this.Z != e4d.Z || Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        CharSequence charSequence = e4d.b;
        CharSequence charSequence2 = this.b;
        if (charSequence2 == null ? charSequence != null : !charSequence2.equals(charSequence)) {
            return false;
        }
        String str = e4d.c;
        String str2 = this.c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = e4d.o;
        String str4 = this.o;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        Object obj2 = e4d.X;
        Object obj3 = this.X;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }
}
