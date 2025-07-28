package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: i62  reason: default package */
public final class i62 implements Serializable {
    public final /* synthetic */ int a = 0;
    public final Serializable b;
    public final ArrayList c;

    public i62(mn mnVar) {
        this.b = (String) mnVar.b;
        this.c = (zy) mnVar.c;
    }

    public static void e(md4 md4) {
        int ordinal = md4.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            throw new IllegalStateException("Unexpected value: " + md4);
        }
    }

    public void a(h62 h62, md4 md4) {
        d(md4).add(h62);
        e(md4);
    }

    public i62 b(boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        List unmodifiableList = z ? Collections.unmodifiableList(arrayList) : new ArrayList(arrayList);
        ArrayList arrayList2 = this.c;
        return new i62(unmodifiableList, z ? Collections.unmodifiableList(arrayList2) : new ArrayList(arrayList2));
    }

    public int c(md4 md4) {
        return d(md4).size();
    }

    public ArrayList d(md4 md4) {
        int ordinal = md4.ordinal();
        if (ordinal == 0) {
            return (ArrayList) this.b;
        }
        if (ordinal == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unexpected value: " + md4);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Message{text='" + ((String) this.b) + "', attaches=" + ((zy) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public i62() {
        this(new ArrayList(), new ArrayList());
    }

    public i62(List list, List list2) {
        this.b = new ArrayList(list);
        this.c = new ArrayList(list2);
    }
}
