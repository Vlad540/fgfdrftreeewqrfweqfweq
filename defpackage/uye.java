package defpackage;

import java.util.TimeZone;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;

/* renamed from: uye  reason: default package */
public final class uye {
    public final String a = AbstractUploader.SDK_TYPE_STRING;
    public final String b = "25.7.2";
    public final int c = 6386;
    public final String d = null;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final TimeZone k;

    public uye(String str, String str2, String str3, String str4, String str5) {
        TimeZone timeZone = TimeZone.getDefault();
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = 2;
        this.k = timeZone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uye)) {
            return false;
        }
        uye uye = (uye) obj;
        return hhd.f(this.a, uye.a) && hhd.f(this.b, uye.b) && this.c == uye.c && hhd.f(this.d, uye.d) && hhd.f(this.e, uye.e) && hhd.f(this.f, uye.f) && hhd.f(this.g, uye.g) && hhd.f(this.h, uye.h) && hhd.f(this.i, uye.i) && this.j == uye.j && hhd.f(this.k, uye.k);
    }

    public final int hashCode() {
        int d2 = c3d.d(this.c, me4.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return this.k.hashCode() + us8.h(this.j, me4.d(me4.d(me4.d(me4.d(me4.d((d2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAgent(deviceType=");
        sb.append(this.a);
        sb.append(", appVersion=");
        sb.append(this.b);
        sb.append(", buildNumber=");
        sb.append(this.c);
        sb.append(", appKey=");
        sb.append(this.d);
        sb.append(", osVersion=");
        sb.append(this.e);
        sb.append(", locale=");
        sb.append(this.f);
        sb.append(", deviceLocale=");
        sb.append(this.g);
        sb.append(", deviceName=");
        sb.append(this.h);
        sb.append(", screen=");
        sb.append(this.i);
        sb.append(", pushDeviceType=");
        int i2 = this.j;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "RUSTORE" : "GCM" : "HUAWEI");
        sb.append(", timeZone=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
