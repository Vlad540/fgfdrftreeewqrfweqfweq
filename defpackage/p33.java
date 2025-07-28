package defpackage;

/* renamed from: p33  reason: default package */
public final class p33 extends b97 implements i26 {
    public static final p33 b = new p33(2, 0);
    public static final p33 c = new p33(2, 1);
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p33(int i, int i2) {
        super(i);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        q33 q33;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                fu3 fu3 = (fu3) obj2;
                if (str.length() == 0) {
                    return fu3.toString();
                }
                return str + ", " + fu3;
            default:
                fu3 fu32 = (fu3) obj2;
                hu3 minusKey = ((hu3) obj).minusKey(fu32.getKey());
                bw4 bw4 = bw4.a;
                if (minusKey == bw4) {
                    return fu32;
                }
                cqc cqc = cqc.c;
                fr3 fr3 = (fr3) minusKey.get(cqc);
                if (fr3 == null) {
                    q33 = new q33(minusKey, fu32);
                } else {
                    hu3 minusKey2 = minusKey.minusKey(cqc);
                    if (minusKey2 == bw4) {
                        return new q33(fu32, fr3);
                    }
                    q33 = new q33(new q33(minusKey2, fu32), fr3);
                }
                return q33;
        }
    }
}
