package defpackage;

/* renamed from: ns8  reason: default package */
public final class ns8 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final String c;

    public ns8(String str, boolean z, s16 s16, s16 s162) {
        this.a = 0;
        this.c = str;
        this.b = z;
        ez3.O(3, s16);
        ez3.O(3, s162);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                cqc.Y.getClass();
                StringBuilder sb = new StringBuilder("MessageText(text='");
                sb.append("***");
                sb.append("', bundled=");
                return hr1.j(sb, this.b, ")");
            default:
                return super.toString();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ns8(String str, boolean z, int i) {
        this(str, z, new qk8(2, str), new qk8(2, str));
        this.a = i;
        switch (i) {
            case 2:
                this.c = str;
                this.b = z;
                return;
            default:
                return;
        }
    }

    public ns8(String str, boolean z) {
        this.a = 1;
        this.b = z;
        this.c = str;
    }
}
