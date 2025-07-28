package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: w72  reason: default package */
public final /* synthetic */ class w72 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b92 b;

    public /* synthetic */ w72(b92 b92, int i) {
        this.a = i;
        this.b = b92;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new hdc("all.chat.folder", ((g5a) this.b.c.getValue()).a.getString(cic.e0), (String) null, 0, (Set) qw4.a, false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064);
            default:
                String uuid = UUID.randomUUID().toString();
                b92 b92 = this.b;
                return p23.C(new hdc[]{new hdc(uuid, ((g5a) b92.c.getValue()).a.getString(cic.h0), "👤", 0, Collections.singleton(r72.C0), false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064), new hdc(UUID.randomUUID().toString(), ((g5a) b92.c.getValue()).a.getString(cic.i0), "✉️", 1, z3d.N(new r72[]{r72.Z, r72.w0}), false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064)});
        }
    }
}
