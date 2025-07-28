package defpackage;

/* renamed from: yuf  reason: default package */
public enum yuf {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');
    
    public final char a;
    public final char b;

    static {
        yuf[] yufArr;
        w0 = new pz4(yufArr);
    }

    /* access modifiers changed from: public */
    yuf(char c, char c2) {
        this.a = c;
        this.b = c2;
    }
}
