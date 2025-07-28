package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: ytd  reason: default package */
public final class ytd {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final List h;
    public final boolean i;
    public final int j;

    public ytd(wtd wtd) {
        this.a = wtd.a;
        this.b = wtd.b;
        this.c = wtd.c;
        this.d = wtd.d;
        this.e = wtd.e;
        this.f = wtd.f;
        this.g = wtd.h;
        this.h = wtd.g;
        this.i = wtd.i;
        this.j = wtd.j;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [wtd, java.lang.Object] */
    public static ytd a(ws8 ws8) {
        int K = jjd.K(ws8);
        if (K == 0) {
            return null;
        }
        ? obj = new Object();
        for (int i2 = 0; i2 < K; i2++) {
            String z0 = ws8.z0();
            z0.getClass();
            char c2 = 65535;
            switch (z0.hashCode()) {
                case -295931082:
                    if (z0.equals("updateTime")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (z0.equals(ApiProtocol.KEY_ID)) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3321850:
                    if (z0.equals("link")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3373707:
                    if (z0.equals("name")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 95844769:
                    if (z0.equals("draft")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1369213417:
                    if (z0.equals("createTime")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1433072646:
                    if (z0.equals("authorId")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1531715286:
                    if (z0.equals("stickers")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 1638765110:
                    if (z0.equals("iconUrl")) {
                        c2 = 8;
                        break;
                    }
                    break;
                case 2009367604:
                    if (z0.equals("installCount")) {
                        c2 = 9;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.f = jjd.J(ws8, 0);
                    break;
                case 1:
                    obj.a = ws8.w0();
                    break;
                case 2:
                    obj.h = jjd.M(ws8);
                    break;
                case 3:
                    obj.b = jjd.M(ws8);
                    break;
                case 4:
                    obj.i = jjd.E(ws8);
                    break;
                case 5:
                    obj.e = jjd.J(ws8, 0);
                    break;
                case 6:
                    obj.d = jjd.J(ws8, 0);
                    break;
                case 7:
                    int D = jjd.D(ws8);
                    ArrayList arrayList = new ArrayList(D);
                    for (int i3 = 0; i3 < D; i3++) {
                        arrayList.add(Long.valueOf(ws8.w0()));
                    }
                    obj.g = arrayList;
                    break;
                case 8:
                    obj.c = jjd.M(ws8);
                    break;
                case 9:
                    obj.j = jjd.I(ws8);
                    break;
                default:
                    ws8.z();
                    break;
            }
        }
        return new ytd(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSet{id=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', iconUrl='");
        sb.append(this.c);
        sb.append("', authorId=");
        sb.append(this.d);
        sb.append(", createTime=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", link='");
        sb.append(this.g);
        sb.append("', stickers=");
        sb.append(this.h);
        sb.append(", draft=");
        sb.append(this.i);
        sb.append(", installCount=");
        return wn6.j(sb, this.j, "}");
    }
}
