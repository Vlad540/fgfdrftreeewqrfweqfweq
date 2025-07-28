package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: kt  reason: default package */
public final class kt extends lbe implements Serializable {
    public List X;
    public long Y;
    public List c;
    public List o;

    public kt(ws8 ws8) {
        super(ws8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
        if (this.X == null) {
            this.X = Collections.emptyList();
        }
    }

    public final void b(ws8 ws8, String str) {
        ws8 ws82 = ws8;
        String str2 = str;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1081306054:
                if (str2.equals("marker")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1531715286:
                if (str2.equals("stickers")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1596679982:
                if (str2.equals("stickerSets")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1651659013:
                if (str2.equals("backgrounds")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.Y = ws8.w0();
                return;
            case 1:
                this.c = zy.d(ws8);
                return;
            case 2:
                this.o = zy.d(ws8);
                return;
            case 3:
                int D = jjd.D(ws8);
                this.X = new ArrayList(D);
                for (int i = 0; i < D; i++) {
                    List list = this.X;
                    int K = jjd.K(ws8);
                    String str3 = "";
                    String str4 = str3;
                    long j = 0;
                    for (int i2 = 0; i2 < K; i2++) {
                        String z0 = ws8.z0();
                        if (z0 != null) {
                            int hashCode = z0.hashCode();
                            if (hashCode != 3355) {
                                if (hashCode != 116079) {
                                    if (hashCode == 94842723 && z0.equals("color")) {
                                        str4 = jjd.N(ws82, "");
                                    }
                                } else if (z0.equals("url")) {
                                    str3 = jjd.N(ws82, "");
                                }
                            } else if (z0.equals(ApiProtocol.KEY_ID)) {
                                j = jjd.J(ws82, 0);
                            }
                        }
                        ws8.z();
                    }
                    list.add(new kd0(j, str3, str4));
                }
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        int p = ete.p(this.c);
        int p2 = ete.p(this.o);
        int p3 = ete.p(this.X);
        long j = this.Y;
        StringBuilder i = rf0.i("{stickers=", p, "stickerSets=", p2, "backgrounds=");
        i.append(p3);
        i.append(", marker=");
        i.append(j);
        i.append("}");
        return i.toString();
    }
}
