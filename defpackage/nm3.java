package defpackage;

import java.util.AbstractCollection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: nm3  reason: default package */
public final class nm3 extends kh0 {
    public final /* synthetic */ int b = 1;
    public final AbstractCollection c;

    public nm3(long j, zy zyVar) {
        super(j);
        this.c = zyVar;
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "ContactNotFoundEvent{contactServerIds=" + ((LinkedHashSet) this.c) + '}';
            default:
                return "SharePreviewEvent{attaches=" + ((zy) this.c) + '}';
        }
    }

    public nm3(List list) {
        this.c = new LinkedHashSet(list);
    }
}
