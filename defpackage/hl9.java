package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: hl9  reason: default package */
public final class hl9 extends lbe {
    public int X;
    public bt Y;
    public int Z;
    public long c;
    public ArrayList o;
    public long w0;
    public ArrayList x0;
    public List y0;

    public hl9(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        ArrayList arrayList;
        bt btVar;
        int i = 1;
        str.getClass();
        ArrayList arrayList2 = null;
        int i2 = 0;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2005455306:
                if (str.equals("recentsList")) {
                    c2 = 0;
                    break;
                }
                break;
            case -310976023:
                if (str.equals("recentEmojiList")) {
                    c2 = 1;
                    break;
                }
                break;
            case -295915613:
                if (str.equals("updateType")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3355:
                if (str.equals(ApiProtocol.KEY_ID)) {
                    c2 = 3;
                    break;
                }
                break;
            case 104120:
                if (str.equals("ids")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3545755:
                if (str.equals("sync")) {
                    c2 = 5;
                    break;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    c2 = 6;
                    break;
                }
                break;
            case 109327645:
                if (str.equals("setId")) {
                    c2 = 7;
                    break;
                }
                break;
            case 747804969:
                if (str.equals("position")) {
                    c2 = 8;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (ws8.n().a() == 7) {
                    arrayList2 = new ArrayList();
                    int s0 = ws8.s0();
                    while (i2 < s0) {
                        arrayList2.add(g2c.a(ws8));
                        i2++;
                    }
                } else {
                    ws8.z();
                }
                this.x0 = arrayList2;
                return;
            case 1:
                if (ws8.n().a() == 7) {
                    ArrayList arrayList3 = new ArrayList();
                    int s02 = ws8.s0();
                    while (i2 < s02) {
                        e2c a = e2c.a(ws8);
                        if (a != null) {
                            arrayList3.add(a);
                        }
                        i2++;
                    }
                    arrayList = arrayList3;
                } else {
                    ws8.z();
                    arrayList = Collections.emptyList();
                }
                this.y0 = arrayList;
                return;
            case 2:
                String M = jjd.M(ws8);
                bt[] btVarArr = bt.o;
                int length = btVarArr.length;
                while (true) {
                    if (i2 < length) {
                        btVar = btVarArr[i2];
                        if (!btVar.a.equalsIgnoreCase(M)) {
                            i2++;
                        }
                    } else {
                        btVar = bt.UNKNOWN;
                    }
                }
                this.Y = btVar;
                return;
            case 3:
                this.c = jjd.J(ws8, 0);
                return;
            case 4:
                if (ws8.n().a() == 7) {
                    arrayList2 = new ArrayList();
                    int s03 = ws8.s0();
                    while (i2 < s03) {
                        arrayList2.add(Long.valueOf(jjd.J(ws8, 0)));
                        i2++;
                    }
                } else {
                    ws8.z();
                }
                this.o = arrayList2;
                return;
            case 5:
                this.w0 = jjd.J(ws8, 0);
                return;
            case 6:
                String M2 = jjd.M(ws8);
                int[] w = hr1.w(10);
                int length2 = w.length;
                while (true) {
                    if (i2 < length2) {
                        int i3 = w[i2];
                        if (hr1.d(i3).equals(M2)) {
                            i = i3;
                        } else {
                            i2++;
                        }
                    }
                }
                this.X = i;
                return;
            case 7:
                jjd.J(ws8, 0);
                return;
            case 8:
                this.Z = jjd.I(ws8);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        int i = this.X;
        bt btVar = this.Y;
        int i2 = this.Z;
        int p = ete.p(this.y0);
        int p2 = ete.p(this.x0);
        StringBuilder k = hr1.k(j, "Response{id=", ", assetType=");
        k.append(hr1.u(i));
        k.append(", updateType=");
        k.append(btVar);
        k.append(", position=");
        th2.l(k, i2, ", recentEmojiList=", p, ", recentsList=");
        return wn6.j(k, p2, "}");
    }
}
