package defpackage;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: ma0  reason: default package */
public final class ma0 {
    public static final ma0 d;
    public static final ma0 e;
    public static final ma0 f;
    public static final ma0 g;
    public static final ma0 h;
    public static final ma0 i;
    public static final ma0 j = new ma0(-1, "NONE", Collections.emptyList());
    public static final HashSet k;
    public static final List l;
    public final int a;
    public final String b;
    public final List c;

    static {
        ma0 ma0 = new ma0(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size[]{new Size(720, 480), new Size(640, 480)})));
        d = ma0;
        ma0 ma02 = new ma0(5, "HD", Collections.singletonList(new Size(1280, 720)));
        e = ma02;
        ma0 ma03 = new ma0(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f = ma03;
        ma0 ma04 = new ma0(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        g = ma04;
        ma0 ma05 = new ma0(0, "LOWEST", Collections.emptyList());
        h = ma05;
        ma0 ma06 = new ma0(1, "HIGHEST", Collections.emptyList());
        i = ma06;
        k = new HashSet(Arrays.asList(new ma0[]{ma05, ma06, ma0, ma02, ma03, ma04}));
        l = Arrays.asList(new ma0[]{ma04, ma03, ma02, ma0});
    }

    public ma0(int i2, String str, List list) {
        this.a = i2;
        this.b = str;
        if (list != null) {
            this.c = list;
            return;
        }
        throw new NullPointerException("Null typicalSizes");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ma0)) {
            return false;
        }
        ma0 ma0 = (ma0) obj;
        return this.a == ma0.a && this.b.equals(ma0.b) && this.c.equals(ma0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", typicalSizes=");
        return hr1.i(sb, this.c, "}");
    }
}
