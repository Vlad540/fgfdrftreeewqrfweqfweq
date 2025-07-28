package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: se4  reason: default package */
public class se4 implements pe4 {
    public lrf a = null;
    public boolean b = false;
    public boolean c = false;
    public final lrf d;
    public int e = 1;
    public int f;
    public int g;
    public int h = 1;
    public ch4 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public se4(lrf lrf) {
        this.d = lrf;
    }

    public final void a(pe4 pe4) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((se4) it.next()).j) {
                return;
            }
        }
        this.c = true;
        lrf lrf = this.a;
        if (lrf != null) {
            lrf.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        se4 se4 = null;
        int i2 = 0;
        while (it2.hasNext()) {
            se4 se42 = (se4) it2.next();
            if (!(se42 instanceof ch4)) {
                i2++;
                se4 = se42;
            }
        }
        if (se4 != null && i2 == 1 && se4.j) {
            ch4 ch4 = this.i;
            if (ch4 != null) {
                if (ch4.j) {
                    this.f = this.h * ch4.g;
                } else {
                    return;
                }
            }
            d(se4.g + this.f);
        }
        lrf lrf2 = this.a;
        if (lrf2 != null) {
            lrf2.a(this);
        }
    }

    public final void b(pe4 pe4) {
        this.k.add(pe4);
        if (this.j) {
            pe4.a(pe4);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i2) {
        if (!this.j) {
            this.j = true;
            this.g = i2;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                pe4 pe4 = (pe4) it.next();
                pe4.a(pe4);
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
