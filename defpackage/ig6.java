package defpackage;

import java.util.LinkedHashSet;

/* renamed from: ig6  reason: default package */
public final class ig6 implements hg6 {
    public final t97 a;
    public final LinkedHashSet b = new LinkedHashSet();
    public boolean c;
    public fg6 d;

    public ig6(t97 t97) {
        this.a = t97;
    }

    public final void a(fg6 fg6) {
        this.d = fg6;
        boolean z = false;
        boolean z2 = false;
        for (gg6 gg6 : this.b) {
            boolean Q = ((ao8) gg6).Q(fg6, new zv(2, this, ig6.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 23));
            if (!z2) {
                z2 = Q;
            }
        }
        if (fg6 != null && !z2) {
            z = true;
        }
        this.c = z;
    }
}
