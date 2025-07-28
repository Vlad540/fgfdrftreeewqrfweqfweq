package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: m52  reason: default package */
public final /* synthetic */ class m52 implements of3 {
    public final /* synthetic */ long X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ t52 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ eb2 c;
    public final /* synthetic */ int o;
    public final /* synthetic */ long w0;

    public /* synthetic */ m52(t52 t52, Set set, eb2 eb2, int i, long j, int i2, long j2, long j3) {
        this.a = t52;
        this.b = set;
        this.c = eb2;
        this.o = i;
        this.X = j;
        this.Y = i2;
        this.Z = j2;
        this.w0 = j3;
    }

    public final void accept(Object obj) {
        y52 y52 = (y52) obj;
        t52 t52 = this.a;
        t52.getClass();
        Set set = this.b;
        a62 a2 = t52.G(y52, set).a();
        eb2 eb2 = this.c;
        a2.a = eb2.X;
        boolean isEmpty = eb2.c().isEmpty();
        int i = this.o;
        int i2 = this.Y;
        long j = this.w0;
        if (isEmpty) {
            long j2 = this.X;
            if (i > 0) {
                a2.b = j2;
            }
            if (i2 > 0) {
                a2.c = j2;
            }
        } else {
            a2.X = oyb.v((List) a2.X, eb2.c(), this.Z, i, 0, i2, 0);
            nj4 nj4 = t52.s;
            if (i > 0 && eb2.c().size() < i) {
                udd.q("t52", "onChatMediaNew firstMessageUpdate");
                vo8 j3 = ((to8) nj4.get()).j(j, ((ym8) eb2.c().get(0)).a);
                if (j3 != null) {
                    a2.b = j3.b;
                } else {
                    udd.R("t52", (IOException) null, "onChatMediaNew can't find message to update firstMessage", Arrays.copyOf(new Object[0], 0));
                }
            }
            if (i2 > 0 && eb2.c().size() < i2) {
                udd.q("t52", "onChatMediaNew lastMessageUpdate");
                vo8 j4 = ((to8) nj4.get()).j(j, ((ym8) eb2.c().get(eb2.c().size() - 1)).a);
                if (j4 != null) {
                    a2.c = j4.b;
                } else {
                    udd.R("t52", (IOException) null, "onChatMediaNew can't find message to update lastMessage", Arrays.copyOf(new Object[0], 0));
                }
            }
        }
        t52.I(j).setValue(new s78(eb2.Z, eb2.Y, set, j));
        t52.a0(y52, set, a2.a());
    }
}
