package defpackage;

import java.util.Locale;

/* renamed from: u85  reason: default package */
public final /* synthetic */ class u85 implements j26, of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ u85(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
        this.c = z;
    }

    public void accept(Object obj) {
        boolean z = this.c;
        long j = this.b;
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 2:
                Locale locale = Locale.ENGLISH;
                udd.s("l95", "markAsFavorite: failed for setId=" + j + " favorite=" + z, th);
                return;
            default:
                Locale locale2 = Locale.ENGLISH;
                udd.s("fa5", "markAsFavorite: failed for stickerId=" + j + " favorite=" + z, th);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new y63(1, new v85((ha5) obj, this.b, this.c, 0));
            case 1:
                return new w63(((p95) obj).a(), 2, new u85(3, this.b, this.c));
            default:
                return new y63(1, new v85((y95) obj, this.b, this.c, 1));
        }
    }
}
