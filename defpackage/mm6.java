package defpackage;

import org.json.HTTP;

/* renamed from: mm6  reason: default package */
public final class mm6 {
    public final nm6 a;
    public final String b;

    public mm6(String str, String str2, String str3, nm6 nm6) {
        this.a = nm6;
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Disposition: form-data; name=");
        km6.a(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            km6.a(sb, str2);
        }
        sb.append(HTTP.CRLF);
        if (str3 != null) {
            sb.append("Content-Type: ");
            sb.append(str3);
            sb.append(HTTP.CRLF);
        }
        this.b = sb.toString();
    }
}
