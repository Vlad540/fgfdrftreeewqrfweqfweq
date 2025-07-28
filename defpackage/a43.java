package defpackage;

/* renamed from: a43  reason: default package */
public final class a43 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public a43(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a43)) {
            return false;
        }
        a43 a43 = (a43) obj;
        a43.getClass();
        return this.a == a43.a && this.b == a43.b && this.c == a43.c && this.d == a43.d;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + c3d.d(0, c3d.d(0, c3d.d(0, c3d.d(0, c3d.d(0, c3d.d(this.d, c3d.d(this.c, c3d.d(this.b, c3d.d(0, c3d.d(0, c3d.d(0, c3d.d(this.a, c3d.d(0, Integer.hashCode(0) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonBackgroundChatBackgroundColors(additionalStep1=0, additionalStep2=0, additionalStep3=");
        sb.append(this.a);
        sb.append(", additionalStep4=0, additionalStep5=0, additionalStep6=0, backgroundStep1=");
        sb.append(this.b);
        sb.append(", backgroundStep2=");
        sb.append(this.c);
        sb.append(", patternColor=");
        return wn6.j(sb, this.d, ", patternStep1=0, patternStep2=0, patternStep3=0, patternStep4=0, patternStep5=0, patternStep6=0)");
    }
}
