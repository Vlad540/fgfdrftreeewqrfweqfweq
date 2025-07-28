package defpackage;

/* renamed from: ioa  reason: default package */
public final class ioa extends hh0 implements Comparable {
    public final String X;
    public final long Y;
    public final String Z;
    public final long c;
    public final int o;
    public final String w0;
    public final String x0;
    public final String y0;
    public final int z0;

    public ioa(long j, long j2, int i, String str, long j3, String str2, String str3, String str4, String str5, int i2) {
        super(j);
        this.c = j2;
        this.o = i;
        this.X = str;
        this.Y = j3;
        this.Z = str2;
        this.w0 = str3;
        this.x0 = str4;
        this.y0 = str5;
        this.z0 = us8.b(i2);
    }

    public final String a() {
        String str = this.w0;
        if (r1g.q(str)) {
            String str2 = this.x0;
            if (r1g.q(str2)) {
                return str + " " + str2;
            }
        }
        return str;
    }

    public final int compareTo(Object obj) {
        return a().compareTo(((ioa) obj).a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ioa.class != obj.getClass()) {
            return false;
        }
        ioa ioa = (ioa) obj;
        if (this.o != ioa.o) {
            return false;
        }
        String str = ioa.X;
        String str2 = this.X;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = ioa.w0;
        String str4 = this.w0;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = ioa.x0;
        String str6 = this.x0;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = ioa.y0;
        String str8 = this.y0;
        return str8 == null ? str7 == null : str8.equals(str7);
    }

    public final String toString() {
        return "PhoneDb{phonebookId=" + this.c + ", contactId=" + this.o + ", phone='" + this.X + "', serverPhone=" + this.Y + ", firstName='" + this.w0 + "', lastName='" + this.x0 + "', type=" + us8.r(this.z0) + '}';
    }
}
