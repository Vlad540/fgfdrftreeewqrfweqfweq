package defpackage;

/* renamed from: mv3  reason: default package */
public final class mv3 {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public mv3(long j, int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv3)) {
            return false;
        }
        mv3 mv3 = (mv3) obj;
        return this.a == mv3.a && this.b == mv3.b && hhd.f(this.c, mv3.c) && hhd.f(this.d, mv3.d) && hhd.f(this.e, mv3.e) && hhd.f(this.f, mv3.f) && hhd.f(this.g, mv3.g) && hhd.f(this.h, mv3.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + me4.d(me4.d(me4.d(me4.d(me4.d(us8.h(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CrashDescription(timestamp=");
        sb.append(this.a);
        sb.append(", type=");
        switch (this.b) {
            case 1:
                str = "CRASH";
                break;
            case 2:
                str = "NON_FATAL";
                break;
            case 3:
                str = "FATAL";
                break;
            case 4:
                str = "ERROR";
                break;
            case 5:
                str = "WARNING";
                break;
            case 6:
                str = "NOTICE";
                break;
            case 7:
                str = "INFO";
                break;
            case 8:
                str = "DEBUG";
                break;
            case 9:
                str = "MINIDUMP";
                break;
            case 10:
                str = "ANR";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", crashFilesDir=");
        sb.append(this.c);
        sb.append(", systemStatePath=");
        sb.append(this.d);
        sb.append(", tagsPath=");
        sb.append(this.e);
        sb.append(", stacktracePath=");
        sb.append(this.f);
        sb.append(", allStacktracesPath=");
        sb.append(this.g);
        sb.append(", logsPath=");
        return me4.l(sb, this.h, ')');
    }
}
