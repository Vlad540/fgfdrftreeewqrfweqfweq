package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: f62  reason: default package */
public final class f62 {
    public static final f62 h;
    public final long a;
    public final List b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    /* JADX WARNING: type inference failed for: r1v1, types: [e62, java.lang.Object] */
    static {
        List asList = Arrays.asList(new c62[]{c62.a, c62.b, c62.c});
        ? obj = new Object();
        obj.a = 0;
        obj.c = 0;
        obj.d = 0;
        obj.b = asList;
        obj.f = 0;
        obj.g = 0;
        h = new f62(obj);
    }

    public f62(e62 e62) {
        this.a = e62.a;
        List list = e62.b;
        this.b = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.c = e62.c;
        this.d = e62.d;
        this.e = e62.e;
        this.f = e62.f;
        this.g = e62.g;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e62, java.lang.Object] */
    public final e62 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = new ArrayList(this.b);
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        return obj;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChatSettings{dontDisturbUntil=");
        sb.append(this.a);
        sb.append(", options=");
        List list = this.b;
        if (list == null) {
            str = "[]";
        } else {
            xz6 xz6 = new xz6(7);
            StringBuilder sb2 = new StringBuilder();
            o23.a0(list, sb2, ",", "[", "]", -1, "...", xz6);
            str = sb2.toString();
        }
        sb.append(str);
        sb.append(", lastNotifMark=");
        sb.append(this.c);
        sb.append(", lastNotifMessageId=");
        sb.append(this.d);
        sb.append(", favoriteIndex=");
        sb.append(this.e);
        sb.append(", hideMyLiveLocationPanelBeforeTime=");
        sb.append(this.f);
        sb.append(", hideLiveLocationPanelBeforeTime=");
        return m4b.i(sb, this.g, '}');
    }
}
