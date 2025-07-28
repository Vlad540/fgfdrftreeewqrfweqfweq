package defpackage;

import java.util.HashMap;
import java.util.List;
import ru.ok.tamtam.nano.Protos;

/* renamed from: gr3  reason: default package */
public final class gr3 extends fy {
    public final String A0;
    public final String B0;
    public final boolean C0;
    public final int D0;
    public final ym8 E0;
    public final String F0;
    public final Long X;
    public final List Y;
    public final String Z;
    public final int o;
    public final String w0;
    public final String x0;
    public final String y0;
    public final d10 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gr3(int i, Long l, List list, String str, String str2, String str3, String str4, d10 d10, String str5, String str6, boolean z, int i2, ym8 ym8, String str7, boolean z2, boolean z3) {
        super(e00.CONTROL, z2, z3);
        this.o = i;
        this.X = l;
        this.Y = list;
        this.Z = str;
        this.w0 = str2;
        this.x0 = str3;
        this.y0 = str4;
        this.z0 = d10;
        this.A0 = str5;
        this.B0 = str6;
        this.C0 = z;
        this.D0 = i2;
        this.E0 = ym8;
        this.F0 = str7;
    }

    public final HashMap a() {
        String str;
        String str2;
        HashMap a = super.a();
        int i = this.o;
        switch (i) {
            case 1:
                str = "unknown";
                break;
            case 2:
                str = "new";
                break;
            case 3:
                str = "add";
                break;
            case 4:
                str = "remove";
                break;
            case 5:
                str = "leave";
                break;
            case 6:
                str = "title";
                break;
            case 7:
                str = "icon";
                break;
            case 8:
                str = "hello";
                break;
            case 9:
                str = "system";
                break;
            case 10:
                str = "joinByLink";
                break;
            case 11:
                str = "pin";
                break;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                str = "botStarted";
                break;
            default:
                throw null;
        }
        a.put("event", str);
        List list = this.Y;
        if (list != null && list.size() > 0) {
            a.put("userIds", list);
        }
        Long l = this.X;
        if (!(l == null || l.longValue() == 0)) {
            a.put("userId", l);
        }
        String str3 = this.Z;
        if (str3 != null) {
            a.put("title", str3);
        }
        String str4 = this.w0;
        if (str4 != null) {
            a.put("photoToken", str4);
        }
        d10 d10 = this.z0;
        if (d10 != null) {
            a.put("crop", d10.a());
        }
        if (i == 3) {
            a.put("showHistory", Boolean.valueOf(this.C0));
        }
        if (i == 2) {
            int i2 = this.D0;
            if (i2 == 1) {
                str2 = "UNKNOWN";
            } else if (i2 == 2) {
                str2 = "DIALOG";
            } else if (i2 == 3) {
                str2 = "CHAT";
            } else if (i2 == 4) {
                str2 = "CHANNEL";
            } else if (i2 == 5) {
                str2 = "GROUP_CHAT";
            } else {
                throw null;
            }
            a.put("chatType", str2);
        }
        String str5 = this.F0;
        if (!r1g.p(str5)) {
            a.put("startPayload", str5);
        }
        return a;
    }
}
